// Generated by view binder compiler. Do not edit!
package org.schabi.newpipelegacy.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.imageview.ShapeableImageView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import org.schabi.newpipelegacy.R;
import org.schabi.newpipelegacy.views.NewPipeTextView;

public final class PlaylistHeaderBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final PlaylistControlBinding playlistControl;

  @NonNull
  public final RelativeLayout playlistMeta;

  @NonNull
  public final NewPipeTextView playlistStreamCount;

  @NonNull
  public final NewPipeTextView playlistTitleView;

  @NonNull
  public final ShapeableImageView uploaderAvatarView;

  @NonNull
  public final RelativeLayout uploaderLayout;

  @NonNull
  public final NewPipeTextView uploaderName;

  private PlaylistHeaderBinding(@NonNull RelativeLayout rootView,
      @NonNull PlaylistControlBinding playlistControl, @NonNull RelativeLayout playlistMeta,
      @NonNull NewPipeTextView playlistStreamCount, @NonNull NewPipeTextView playlistTitleView,
      @NonNull ShapeableImageView uploaderAvatarView, @NonNull RelativeLayout uploaderLayout,
      @NonNull NewPipeTextView uploaderName) {
    this.rootView = rootView;
    this.playlistControl = playlistControl;
    this.playlistMeta = playlistMeta;
    this.playlistStreamCount = playlistStreamCount;
    this.playlistTitleView = playlistTitleView;
    this.uploaderAvatarView = uploaderAvatarView;
    this.uploaderLayout = uploaderLayout;
    this.uploaderName = uploaderName;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static PlaylistHeaderBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static PlaylistHeaderBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.playlist_header, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static PlaylistHeaderBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.playlist_control;
      View playlistControl = ViewBindings.findChildViewById(rootView, id);
      if (playlistControl == null) {
        break missingId;
      }
      PlaylistControlBinding binding_playlistControl = PlaylistControlBinding.bind(playlistControl);

      id = R.id.playlist_meta;
      RelativeLayout playlistMeta = ViewBindings.findChildViewById(rootView, id);
      if (playlistMeta == null) {
        break missingId;
      }

      id = R.id.playlist_stream_count;
      NewPipeTextView playlistStreamCount = ViewBindings.findChildViewById(rootView, id);
      if (playlistStreamCount == null) {
        break missingId;
      }

      id = R.id.playlist_title_view;
      NewPipeTextView playlistTitleView = ViewBindings.findChildViewById(rootView, id);
      if (playlistTitleView == null) {
        break missingId;
      }

      id = R.id.uploader_avatar_view;
      ShapeableImageView uploaderAvatarView = ViewBindings.findChildViewById(rootView, id);
      if (uploaderAvatarView == null) {
        break missingId;
      }

      id = R.id.uploader_layout;
      RelativeLayout uploaderLayout = ViewBindings.findChildViewById(rootView, id);
      if (uploaderLayout == null) {
        break missingId;
      }

      id = R.id.uploader_name;
      NewPipeTextView uploaderName = ViewBindings.findChildViewById(rootView, id);
      if (uploaderName == null) {
        break missingId;
      }

      return new PlaylistHeaderBinding((RelativeLayout) rootView, binding_playlistControl,
          playlistMeta, playlistStreamCount, playlistTitleView, uploaderAvatarView, uploaderLayout,
          uploaderName);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
