// Generated by view binder compiler. Do not edit!
package org.schabi.newpipelegacy.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.imageview.ShapeableImageView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import org.schabi.newpipelegacy.R;
import org.schabi.newpipelegacy.views.NewPipeTextView;

public final class ChannelHeaderBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final FrameLayout avatarsLayout;

  @NonNull
  public final ShapeableImageView channelAvatarView;

  @NonNull
  public final ImageView channelBannerImage;

  @NonNull
  public final RelativeLayout channelMetadata;

  @NonNull
  public final AppCompatButton channelSubscribeButton;

  @NonNull
  public final NewPipeTextView channelSubscriberView;

  @NonNull
  public final NewPipeTextView channelTitleView;

  @NonNull
  public final PlaylistControlBinding playlistControl;

  @NonNull
  public final ShapeableImageView subChannelAvatarView;

  @NonNull
  public final NewPipeTextView subChannelTitleView;

  private ChannelHeaderBinding(@NonNull RelativeLayout rootView, @NonNull FrameLayout avatarsLayout,
      @NonNull ShapeableImageView channelAvatarView, @NonNull ImageView channelBannerImage,
      @NonNull RelativeLayout channelMetadata, @NonNull AppCompatButton channelSubscribeButton,
      @NonNull NewPipeTextView channelSubscriberView, @NonNull NewPipeTextView channelTitleView,
      @NonNull PlaylistControlBinding playlistControl,
      @NonNull ShapeableImageView subChannelAvatarView,
      @NonNull NewPipeTextView subChannelTitleView) {
    this.rootView = rootView;
    this.avatarsLayout = avatarsLayout;
    this.channelAvatarView = channelAvatarView;
    this.channelBannerImage = channelBannerImage;
    this.channelMetadata = channelMetadata;
    this.channelSubscribeButton = channelSubscribeButton;
    this.channelSubscriberView = channelSubscriberView;
    this.channelTitleView = channelTitleView;
    this.playlistControl = playlistControl;
    this.subChannelAvatarView = subChannelAvatarView;
    this.subChannelTitleView = subChannelTitleView;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ChannelHeaderBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ChannelHeaderBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.channel_header, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ChannelHeaderBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.avatars_layout;
      FrameLayout avatarsLayout = ViewBindings.findChildViewById(rootView, id);
      if (avatarsLayout == null) {
        break missingId;
      }

      id = R.id.channel_avatar_view;
      ShapeableImageView channelAvatarView = ViewBindings.findChildViewById(rootView, id);
      if (channelAvatarView == null) {
        break missingId;
      }

      id = R.id.channel_banner_image;
      ImageView channelBannerImage = ViewBindings.findChildViewById(rootView, id);
      if (channelBannerImage == null) {
        break missingId;
      }

      id = R.id.channel_metadata;
      RelativeLayout channelMetadata = ViewBindings.findChildViewById(rootView, id);
      if (channelMetadata == null) {
        break missingId;
      }

      id = R.id.channel_subscribe_button;
      AppCompatButton channelSubscribeButton = ViewBindings.findChildViewById(rootView, id);
      if (channelSubscribeButton == null) {
        break missingId;
      }

      id = R.id.channel_subscriber_view;
      NewPipeTextView channelSubscriberView = ViewBindings.findChildViewById(rootView, id);
      if (channelSubscriberView == null) {
        break missingId;
      }

      id = R.id.channel_title_view;
      NewPipeTextView channelTitleView = ViewBindings.findChildViewById(rootView, id);
      if (channelTitleView == null) {
        break missingId;
      }

      id = R.id.playlist_control;
      View playlistControl = ViewBindings.findChildViewById(rootView, id);
      if (playlistControl == null) {
        break missingId;
      }
      PlaylistControlBinding binding_playlistControl = PlaylistControlBinding.bind(playlistControl);

      id = R.id.sub_channel_avatar_view;
      ShapeableImageView subChannelAvatarView = ViewBindings.findChildViewById(rootView, id);
      if (subChannelAvatarView == null) {
        break missingId;
      }

      id = R.id.sub_channel_title_view;
      NewPipeTextView subChannelTitleView = ViewBindings.findChildViewById(rootView, id);
      if (subChannelTitleView == null) {
        break missingId;
      }

      return new ChannelHeaderBinding((RelativeLayout) rootView, avatarsLayout, channelAvatarView,
          channelBannerImage, channelMetadata, channelSubscribeButton, channelSubscriberView,
          channelTitleView, binding_playlistControl, subChannelAvatarView, subChannelTitleView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
