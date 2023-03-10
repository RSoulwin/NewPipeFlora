// Generated by view binder compiler. Do not edit!
package org.schabi.newpipelegacy.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import java.lang.NullPointerException;
import java.lang.Override;
import org.schabi.newpipelegacy.R;

public final class FeedItemCarouselBinding implements ViewBinding {
  @NonNull
  private final RecyclerView rootView;

  @NonNull
  public final RecyclerView recyclerView;

  private FeedItemCarouselBinding(@NonNull RecyclerView rootView,
      @NonNull RecyclerView recyclerView) {
    this.rootView = rootView;
    this.recyclerView = recyclerView;
  }

  @Override
  @NonNull
  public RecyclerView getRoot() {
    return rootView;
  }

  @NonNull
  public static FeedItemCarouselBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FeedItemCarouselBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.feed_item_carousel, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FeedItemCarouselBinding bind(@NonNull View rootView) {
    if (rootView == null) {
      throw new NullPointerException("rootView");
    }

    RecyclerView recyclerView = (RecyclerView) rootView;

    return new FeedItemCarouselBinding((RecyclerView) rootView, recyclerView);
  }
}
