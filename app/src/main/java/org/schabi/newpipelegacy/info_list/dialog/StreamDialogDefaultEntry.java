package org.schabi.newpipelegacy.info_list.dialog;

import static org.schabi.newpipelegacy.info_list.dialog.StreamDialogEntry.fetchItemInfoIfSparse;
import static org.schabi.newpipelegacy.util.NavigationHelper.openChannelFragment;
import static org.schabi.newpipelegacy.util.SparseItemUtil.fetchStreamInfoAndSaveToDatabase;
import static org.schabi.newpipelegacy.util.SparseItemUtil.fetchUploaderUrlIfSparse;

import android.net.Uri;

import androidx.annotation.NonNull;
import androidx.annotation.StringRes;

import org.schabi.newpipelegacy.R;
import org.schabi.newpipelegacy.database.stream.model.StreamEntity;
import org.schabi.newpipelegacy.download.DownloadDialog;
import org.schabi.newpipelegacy.local.dialog.PlaylistAppendDialog;
import org.schabi.newpipelegacy.local.dialog.PlaylistDialog;
import org.schabi.newpipelegacy.local.history.HistoryRecordManager;
import org.schabi.newpipelegacy.util.NavigationHelper;
import org.schabi.newpipelegacy.util.external_communication.KoreUtils;
import org.schabi.newpipelegacy.util.external_communication.ShareUtils;

import java.util.Collections;

import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers;

/**
 * <p>
 *     This enum provides entries that are accepted
 *     by the {@link InfoItemDialog.Builder}.
 * </p>
 * <p>
 *     These entries contain a String {@link #resource} which is displayed in the dialog and
 *     a default {@link #action} that is executed
 *     when the entry is selected (via <code>onClick()</code>).
 *     <br/>
 *     They action can be overridden by using the Builder's
 *     {@link InfoItemDialog.Builder#setAction(
 *     StreamDialogDefaultEntry, StreamDialogEntry.StreamDialogEntryAction)}
 *     method.
 * </p>
 */
public enum StreamDialogDefaultEntry {
    SHOW_CHANNEL_DETAILS(R.string.show_channel_details, (fragment, item) ->
            fetchUploaderUrlIfSparse(fragment.requireContext(), item.getServiceId(), item.getUrl(),
                    item.getUploaderUrl(), url -> openChannelFragment(fragment, item, url))
    ),

    /**
     * Enqueues the stream automatically to the current PlayerType.
     */
    ENQUEUE(R.string.enqueue_stream, (fragment, item) ->
            fetchItemInfoIfSparse(fragment.requireContext(), item, singlePlayQueue ->
                NavigationHelper.enqueueOnPlayer(fragment.getContext(), singlePlayQueue))
    ),

    /**
     * Enqueues the stream automatically to the current PlayerType
     * after the currently playing stream.
     */
    ENQUEUE_NEXT(R.string.enqueue_next_stream, (fragment, item) ->
            fetchItemInfoIfSparse(fragment.requireContext(), item, singlePlayQueue ->
                NavigationHelper.enqueueNextOnPlayer(fragment.getContext(), singlePlayQueue))
    ),

    START_HERE_ON_BACKGROUND(R.string.start_here_on_background, (fragment, item) ->
            fetchItemInfoIfSparse(fragment.requireContext(), item, singlePlayQueue ->
                NavigationHelper.playOnBackgroundPlayer(
                        fragment.getContext(), singlePlayQueue, true))),

    START_HERE_ON_POPUP(R.string.start_here_on_popup, (fragment, item) ->
            fetchItemInfoIfSparse(fragment.requireContext(), item, singlePlayQueue ->
                NavigationHelper.playOnPopupPlayer(fragment.getContext(), singlePlayQueue, true))),

    SET_AS_PLAYLIST_THUMBNAIL(R.string.set_as_playlist_thumbnail, (fragment, item) -> {
        throw new UnsupportedOperationException("This needs to be implemented manually "
                + "by using InfoItemDialog.Builder.setAction()");
    }),

    DELETE(R.string.delete, (fragment, item) -> {
        throw new UnsupportedOperationException("This needs to be implemented manually "
                + "by using InfoItemDialog.Builder.setAction()");
    }),

    /**
     * Opens a {@link PlaylistDialog} to either append the stream to a playlist
     * or create a new playlist if there are no local playlists.
     */
    APPEND_PLAYLIST(R.string.add_to_playlist, (fragment, item) ->
        PlaylistDialog.createCorrespondingDialog(
                fragment.getContext(),
                Collections.singletonList(new StreamEntity(item)),
                dialog -> dialog.show(
                        fragment.getParentFragmentManager(),
                        "StreamDialogEntry@"
                                + (dialog instanceof PlaylistAppendDialog ? "append" : "create")
                                + "_playlist"
                )
        )
    ),

    PLAY_WITH_KODI(R.string.play_with_kodi_title, (fragment, item) -> {
        final Uri videoUrl = Uri.parse(item.getUrl());
        try {
            NavigationHelper.playWithKore(fragment.requireContext(), videoUrl);
        } catch (final Exception e) {
            KoreUtils.showInstallKoreDialog(fragment.requireActivity());
        }
    }),

    SHARE(R.string.share, (fragment, item) ->
            ShareUtils.shareText(fragment.requireContext(), item.getName(), item.getUrl(),
                    item.getThumbnailUrl())),

    /**
     * Opens a {@link DownloadDialog} after fetching some stream info.
     * If the user quits the current fragment, it will not open a DownloadDialog.
     */

    DOWNLOAD(R.string.download, (fragment, item) ->
            fetchStreamInfoAndSaveToDatabase(fragment.requireContext(), item.getServiceId(),
                    item.getUrl(), info -> {
                        if (fragment.getContext() != null) {
                            final DownloadDialog downloadDialog =
                                    new DownloadDialog(fragment.requireContext(), info);
                            downloadDialog.show(fragment.getChildFragmentManager(),
                                    "downloadDialog");
                        }
                    })
    ),



    OPEN_IN_BROWSER(R.string.open_in_browser, (fragment, item) ->
            ShareUtils.openUrlInBrowser(fragment.requireContext(), item.getUrl())),


    MARK_AS_WATCHED(R.string.mark_as_watched, (fragment, item) ->
        new HistoryRecordManager(fragment.getContext())
                .markAsWatched(item)
                .onErrorComplete()
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe()
    );


    @StringRes
    public final int resource;
    @NonNull
    public final StreamDialogEntry.StreamDialogEntryAction action;

    StreamDialogDefaultEntry(@StringRes final int resource,
                             @NonNull final StreamDialogEntry.StreamDialogEntryAction action) {
        this.resource = resource;
        this.action = action;
    }

    @NonNull
    public StreamDialogEntry toStreamDialogEntry() {
        return new StreamDialogEntry(resource, action);
    }

}