// Generated code from Icepick. Do not modify!
package org.schabi.newpipelegacy.local.subscription.dialog;
import android.os.Bundle;
import icepick.Bundler;
import icepick.Injector.Helper;
import icepick.Injector.Object;

import java.util.Map;
import java.util.HashMap;

public class FeedGroupReorderDialog$$Icepick<T extends FeedGroupReorderDialog> extends Object<T> {

  private final static Map<String, Bundler<?>> BUNDLERS = new HashMap<String, Bundler<?>>();
  static {
      
  }

  private final static Helper H = new Helper("org.schabi.newpipelegacy.local.subscription.dialog.FeedGroupReorderDialog$$Icepick.", BUNDLERS);

  public void restore(T target, Bundle state) {
    if (state == null) return;
    target.groupOrderedIdList = H.getSerializable(state, "groupOrderedIdList");
    super.restore(target, state);
  }

  public void save(T target, Bundle state) {
    super.save(target, state);
    H.putSerializable(state, "groupOrderedIdList", target.groupOrderedIdList);
  }
}