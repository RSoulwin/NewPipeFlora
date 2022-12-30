// Generated code from Icepick. Do not modify!
package org.schabi.newpipelegacy.fragments;
import android.os.Bundle;
import icepick.Bundler;
import icepick.Injector.Helper;
import icepick.Injector.Object;

import java.util.Map;
import java.util.HashMap;

public class BaseStateFragment$$Icepick<T extends BaseStateFragment> extends org.schabi.newpipelegacy.BaseFragment$$Icepick<T> {

  private final static Map<String, Bundler<?>> BUNDLERS = new HashMap<String, Bundler<?>>();
  static {
        
  }

  private final static Helper H = new Helper("org.schabi.newpipelegacy.fragments.BaseStateFragment$$Icepick.", BUNDLERS);

  public void restore(T target, Bundle state) {
    if (state == null) return;
    target.wasLoading = H.getSerializable(state, "wasLoading");
    target.lastPanelError = H.getParcelable(state, "lastPanelError");
    super.restore(target, state);
  }

  public void save(T target, Bundle state) {
    super.save(target, state);
    H.putSerializable(state, "wasLoading", target.wasLoading);
    H.putParcelable(state, "lastPanelError", target.lastPanelError);
  }
}