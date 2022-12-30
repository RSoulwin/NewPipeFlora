// Generated by view binder compiler. Do not edit!
package org.schabi.newpipelegacy.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import org.schabi.newpipelegacy.R;
import org.schabi.newpipelegacy.views.NewPipeTextView;

public final class ListPlaylistItemBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final RelativeLayout itemRoot;

  @NonNull
  public final NewPipeTextView itemStreamCountView;

  @NonNull
  public final ImageView itemThumbnailView;

  @NonNull
  public final NewPipeTextView itemTitleView;

  @NonNull
  public final NewPipeTextView itemUploaderView;

  private ListPlaylistItemBinding(@NonNull RelativeLayout rootView,
      @NonNull RelativeLayout itemRoot, @NonNull NewPipeTextView itemStreamCountView,
      @NonNull ImageView itemThumbnailView, @NonNull NewPipeTextView itemTitleView,
      @NonNull NewPipeTextView itemUploaderView) {
    this.rootView = rootView;
    this.itemRoot = itemRoot;
    this.itemStreamCountView = itemStreamCountView;
    this.itemThumbnailView = itemThumbnailView;
    this.itemTitleView = itemTitleView;
    this.itemUploaderView = itemUploaderView;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ListPlaylistItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ListPlaylistItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.list_playlist_item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ListPlaylistItemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      RelativeLayout itemRoot = (RelativeLayout) rootView;

      id = R.id.itemStreamCountView;
      NewPipeTextView itemStreamCountView = ViewBindings.findChildViewById(rootView, id);
      if (itemStreamCountView == null) {
        break missingId;
      }

      id = R.id.itemThumbnailView;
      ImageView itemThumbnailView = ViewBindings.findChildViewById(rootView, id);
      if (itemThumbnailView == null) {
        break missingId;
      }

      id = R.id.itemTitleView;
      NewPipeTextView itemTitleView = ViewBindings.findChildViewById(rootView, id);
      if (itemTitleView == null) {
        break missingId;
      }

      id = R.id.itemUploaderView;
      NewPipeTextView itemUploaderView = ViewBindings.findChildViewById(rootView, id);
      if (itemUploaderView == null) {
        break missingId;
      }

      return new ListPlaylistItemBinding((RelativeLayout) rootView, itemRoot, itemStreamCountView,
          itemThumbnailView, itemTitleView, itemUploaderView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
