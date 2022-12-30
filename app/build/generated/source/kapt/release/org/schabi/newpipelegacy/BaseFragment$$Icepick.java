// Generated code from Icepick. Do not modify!
package org.schabi.newpipelegacy;
import android.os.Bundle;
import icepick.Bundler;
import icepick.Injector.Helper;
import icepick.Injector.Object;

import java.util.Map;
import java.util.HashMap;

public class BaseFragment$$Icepick<T extends BaseFragment> extends Object<T> {

  private final static Map<String, Bundler<?>> BUNDLERS = new HashMap<String, Bundler<?>>();
  static {
      
  }

  private final static Helper H = new Helper("org.schabi.newpipelegacy.BaseFragment$$Icepick.", BUNDLERS);

  public void restore(T target, Bundle state) {
    if (state == null) return;
    target.useAsFrontPage = H.getBoolean(state, "useAsFrontPage");
    super.restore(target, state);
  }

  public void save(T target, Bundle state) {
    super.save(target, state);
    H.putBoolean(state, "useAsFrontPage", target.useAsFrontPage);
  }
}