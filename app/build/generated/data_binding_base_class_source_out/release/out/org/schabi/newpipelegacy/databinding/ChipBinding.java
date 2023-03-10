// Generated by view binder compiler. Do not edit!
package org.schabi.newpipelegacy.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.google.android.material.chip.Chip;
import java.lang.NullPointerException;
import java.lang.Override;
import org.schabi.newpipelegacy.R;

public final class ChipBinding implements ViewBinding {
  @NonNull
  private final Chip rootView;

  private ChipBinding(@NonNull Chip rootView) {
    this.rootView = rootView;
  }

  @Override
  @NonNull
  public Chip getRoot() {
    return rootView;
  }

  @NonNull
  public static ChipBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ChipBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent,
      boolean attachToParent) {
    View root = inflater.inflate(R.layout.chip, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ChipBinding bind(@NonNull View rootView) {
    if (rootView == null) {
      throw new NullPointerException("rootView");
    }

    return new ChipBinding((Chip) rootView);
  }
}
