// Generated by view binder compiler. Do not edit!
package org.schabi.newpipelegacy.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
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

public final class PickerSubscriptionItemBinding implements ViewBinding {
  @NonNull
  private final FrameLayout rootView;

  @NonNull
  public final FrameLayout selectedHighlight;

  @NonNull
  public final ShapeableImageView thumbnailView;

  @NonNull
  public final NewPipeTextView titleView;

  private PickerSubscriptionItemBinding(@NonNull FrameLayout rootView,
      @NonNull FrameLayout selectedHighlight, @NonNull ShapeableImageView thumbnailView,
      @NonNull NewPipeTextView titleView) {
    this.rootView = rootView;
    this.selectedHighlight = selectedHighlight;
    this.thumbnailView = thumbnailView;
    this.titleView = titleView;
  }

  @Override
  @NonNull
  public FrameLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static PickerSubscriptionItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static PickerSubscriptionItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.picker_subscription_item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static PickerSubscriptionItemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.selected_highlight;
      FrameLayout selectedHighlight = ViewBindings.findChildViewById(rootView, id);
      if (selectedHighlight == null) {
        break missingId;
      }

      id = R.id.thumbnail_view;
      ShapeableImageView thumbnailView = ViewBindings.findChildViewById(rootView, id);
      if (thumbnailView == null) {
        break missingId;
      }

      id = R.id.title_view;
      NewPipeTextView titleView = ViewBindings.findChildViewById(rootView, id);
      if (titleView == null) {
        break missingId;
      }

      return new PickerSubscriptionItemBinding((FrameLayout) rootView, selectedHighlight,
          thumbnailView, titleView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}