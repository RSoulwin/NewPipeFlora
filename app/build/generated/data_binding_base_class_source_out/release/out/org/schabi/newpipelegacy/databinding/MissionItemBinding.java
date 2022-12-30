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

public final class MissionItemBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final RelativeLayout itemBkg;

  @NonNull
  public final ImageView itemIcon;

  @NonNull
  public final ImageView itemMore;

  @NonNull
  public final NewPipeTextView itemName;

  @NonNull
  public final NewPipeTextView itemSize;

  @NonNull
  public final NewPipeTextView itemStatus;

  @NonNull
  public final RelativeLayout itemTitleLine;

  private MissionItemBinding(@NonNull RelativeLayout rootView, @NonNull RelativeLayout itemBkg,
      @NonNull ImageView itemIcon, @NonNull ImageView itemMore, @NonNull NewPipeTextView itemName,
      @NonNull NewPipeTextView itemSize, @NonNull NewPipeTextView itemStatus,
      @NonNull RelativeLayout itemTitleLine) {
    this.rootView = rootView;
    this.itemBkg = itemBkg;
    this.itemIcon = itemIcon;
    this.itemMore = itemMore;
    this.itemName = itemName;
    this.itemSize = itemSize;
    this.itemStatus = itemStatus;
    this.itemTitleLine = itemTitleLine;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static MissionItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static MissionItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.mission_item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static MissionItemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.item_bkg;
      RelativeLayout itemBkg = ViewBindings.findChildViewById(rootView, id);
      if (itemBkg == null) {
        break missingId;
      }

      id = R.id.item_icon;
      ImageView itemIcon = ViewBindings.findChildViewById(rootView, id);
      if (itemIcon == null) {
        break missingId;
      }

      id = R.id.item_more;
      ImageView itemMore = ViewBindings.findChildViewById(rootView, id);
      if (itemMore == null) {
        break missingId;
      }

      id = R.id.item_name;
      NewPipeTextView itemName = ViewBindings.findChildViewById(rootView, id);
      if (itemName == null) {
        break missingId;
      }

      id = R.id.item_size;
      NewPipeTextView itemSize = ViewBindings.findChildViewById(rootView, id);
      if (itemSize == null) {
        break missingId;
      }

      id = R.id.item_status;
      NewPipeTextView itemStatus = ViewBindings.findChildViewById(rootView, id);
      if (itemStatus == null) {
        break missingId;
      }

      id = R.id.item_title_line;
      RelativeLayout itemTitleLine = ViewBindings.findChildViewById(rootView, id);
      if (itemTitleLine == null) {
        break missingId;
      }

      return new MissionItemBinding((RelativeLayout) rootView, itemBkg, itemIcon, itemMore,
          itemName, itemSize, itemStatus, itemTitleLine);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
