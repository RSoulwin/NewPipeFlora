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
import org.schabi.newpipelegacy.views.AnimatedProgressBar;
import org.schabi.newpipelegacy.views.NewPipeTextView;

public final class ListStreamPlaylistItemBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final NewPipeTextView itemAdditionalDetails;

  @NonNull
  public final NewPipeTextView itemDurationView;

  @NonNull
  public final ImageView itemHandle;

  @NonNull
  public final AnimatedProgressBar itemProgressView;

  @NonNull
  public final RelativeLayout itemRoot;

  @NonNull
  public final ImageView itemThumbnailView;

  @NonNull
  public final NewPipeTextView itemVideoTitleView;

  private ListStreamPlaylistItemBinding(@NonNull RelativeLayout rootView,
      @NonNull NewPipeTextView itemAdditionalDetails, @NonNull NewPipeTextView itemDurationView,
      @NonNull ImageView itemHandle, @NonNull AnimatedProgressBar itemProgressView,
      @NonNull RelativeLayout itemRoot, @NonNull ImageView itemThumbnailView,
      @NonNull NewPipeTextView itemVideoTitleView) {
    this.rootView = rootView;
    this.itemAdditionalDetails = itemAdditionalDetails;
    this.itemDurationView = itemDurationView;
    this.itemHandle = itemHandle;
    this.itemProgressView = itemProgressView;
    this.itemRoot = itemRoot;
    this.itemThumbnailView = itemThumbnailView;
    this.itemVideoTitleView = itemVideoTitleView;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ListStreamPlaylistItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ListStreamPlaylistItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.list_stream_playlist_item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ListStreamPlaylistItemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.itemAdditionalDetails;
      NewPipeTextView itemAdditionalDetails = ViewBindings.findChildViewById(rootView, id);
      if (itemAdditionalDetails == null) {
        break missingId;
      }

      id = R.id.itemDurationView;
      NewPipeTextView itemDurationView = ViewBindings.findChildViewById(rootView, id);
      if (itemDurationView == null) {
        break missingId;
      }

      id = R.id.itemHandle;
      ImageView itemHandle = ViewBindings.findChildViewById(rootView, id);
      if (itemHandle == null) {
        break missingId;
      }

      id = R.id.itemProgressView;
      AnimatedProgressBar itemProgressView = ViewBindings.findChildViewById(rootView, id);
      if (itemProgressView == null) {
        break missingId;
      }

      RelativeLayout itemRoot = (RelativeLayout) rootView;

      id = R.id.itemThumbnailView;
      ImageView itemThumbnailView = ViewBindings.findChildViewById(rootView, id);
      if (itemThumbnailView == null) {
        break missingId;
      }

      id = R.id.itemVideoTitleView;
      NewPipeTextView itemVideoTitleView = ViewBindings.findChildViewById(rootView, id);
      if (itemVideoTitleView == null) {
        break missingId;
      }

      return new ListStreamPlaylistItemBinding((RelativeLayout) rootView, itemAdditionalDetails,
          itemDurationView, itemHandle, itemProgressView, itemRoot, itemThumbnailView,
          itemVideoTitleView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
