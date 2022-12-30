// Generated code from Icepick. Do not modify!
package org.schabi.newpipelegacy.local.history;
import android.os.Bundle;
import icepick.Bundler;
import icepick.Injector.Helper;
import icepick.Injector.Object;

import java.util.Map;
import java.util.HashMap;

public class StatisticsPlaylistFragment$$Icepick<T extends StatisticsPlaylistFragment> extends org.schabi.newpipelegacy.fragments.BaseStateFragment$$Icepick<T> {

  private final static Map<String, Bundler<?>> BUNDLERS = new HashMap<String, Bundler<?>>();
  static {
      
  }

  private final static Helper H = new Helper("org.schabi.newpipelegacy.local.history.StatisticsPlaylistFragment$$Icepick.", BUNDLERS);

  public void restore(T target, Bundle state) {
    if (state == null) return;
    target.itemsListState = H.getParcelable(state, "itemsListState");
    super.restore(target, state);
  }

  public void save(T target, Bundle state) {
    super.save(target, state);
    H.putParcelable(state, "itemsListState", target.itemsListState);
  }
}