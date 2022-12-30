// Generated code from Icepick. Do not modify!
package org.schabi.newpipelegacy.local.feed;
import android.os.Bundle;
import icepick.Bundler;
import icepick.Injector.Helper;
import icepick.Injector.Object;

import java.util.Map;
import java.util.HashMap;

public class FeedFragment$$Icepick<T extends FeedFragment> extends org.schabi.newpipelegacy.fragments.BaseStateFragment$$Icepick<T> {

  private final static Map<String, Bundler<?>> BUNDLERS = new HashMap<String, Bundler<?>>();
  static {
          
  }

  private final static Helper H = new Helper("org.schabi.newpipelegacy.local.feed.FeedFragment$$Icepick.", BUNDLERS);

  public void restore(T target, Bundle state) {
    if (state == null) return;
    target.listState = H.getParcelable(state, "listState");
    target.showPlayedItems = H.getBoolean(state, "showPlayedItems");
    target.showFutureItems = H.getBoolean(state, "showFutureItems");
    super.restore(target, state);
  }

  public void save(T target, Bundle state) {
    super.save(target, state);
    H.putParcelable(state, "listState", target.listState);
    H.putBoolean(state, "showPlayedItems", target.showPlayedItems);
    H.putBoolean(state, "showFutureItems", target.showFutureItems);
  }
}