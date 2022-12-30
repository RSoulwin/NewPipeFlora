// Generated code from Icepick. Do not modify!
package org.schabi.newpipelegacy.local.subscription.dialog;
import android.os.Bundle;
import icepick.Bundler;
import icepick.Injector.Helper;
import icepick.Injector.Object;

import java.util.Map;
import java.util.HashMap;

public class FeedGroupDialog$$Icepick<T extends FeedGroupDialog> extends Object<T> {

  private final static Map<String, Bundler<?>> BUNDLERS = new HashMap<String, Bundler<?>>();
  static {
                      
  }

  private final static Helper H = new Helper("org.schabi.newpipelegacy.local.subscription.dialog.FeedGroupDialog$$Icepick.", BUNDLERS);

  public void restore(T target, Bundle state) {
    if (state == null) return;
    target.selectedIcon = H.getSerializable(state, "selectedIcon");
    target.selectedSubscriptions = H.getSerializable(state, "selectedSubscriptions");
    target.wasSubscriptionSelectionChanged = H.getBoolean(state, "wasSubscriptionSelectionChanged");
    target.currentScreen = H.getSerializable(state, "currentScreen");
    target.subscriptionsListState = H.getParcelable(state, "subscriptionsListState");
    target.iconsListState = H.getParcelable(state, "iconsListState");
    target.wasSearchSubscriptionsVisible = H.getBoolean(state, "wasSearchSubscriptionsVisible");
    target.subscriptionsCurrentSearchQuery = H.getString(state, "subscriptionsCurrentSearchQuery");
    target.subscriptionsShowOnlyUngrouped = H.getBoolean(state, "subscriptionsShowOnlyUngrouped");
    super.restore(target, state);
  }

  public void save(T target, Bundle state) {
    super.save(target, state);
    H.putSerializable(state, "selectedIcon", target.selectedIcon);
    H.putSerializable(state, "selectedSubscriptions", target.selectedSubscriptions);
    H.putBoolean(state, "wasSubscriptionSelectionChanged", target.wasSubscriptionSelectionChanged);
    H.putSerializable(state, "currentScreen", target.currentScreen);
    H.putParcelable(state, "subscriptionsListState", target.subscriptionsListState);
    H.putParcelable(state, "iconsListState", target.iconsListState);
    H.putBoolean(state, "wasSearchSubscriptionsVisible", target.wasSearchSubscriptionsVisible);
    H.putString(state, "subscriptionsCurrentSearchQuery", target.subscriptionsCurrentSearchQuery);
    H.putBoolean(state, "subscriptionsShowOnlyUngrouped", target.subscriptionsShowOnlyUngrouped);
  }
}