// Generated code from Icepick. Do not modify!
package org.schabi.newpipelegacy.fragments.list;
import android.os.Bundle;
import icepick.Bundler;
import icepick.Injector.Helper;
import icepick.Injector.Object;

import java.util.Map;
import java.util.HashMap;

public class BaseListInfoFragment$$Icepick<T extends BaseListInfoFragment> extends org.schabi.newpipelegacy.fragments.BaseStateFragment$$Icepick<T> {

  private final static Map<String, Bundler<?>> BUNDLERS = new HashMap<String, Bundler<?>>();
  static {
          
  }

  private final static Helper H = new Helper("org.schabi.newpipelegacy.fragments.list.BaseListInfoFragment$$Icepick.", BUNDLERS);

  public void restore(T target, Bundle state) {
    if (state == null) return;
    target.serviceId = H.getInt(state, "serviceId");
    target.name = H.getString(state, "name");
    target.url = H.getString(state, "url");
    super.restore(target, state);
  }

  public void save(T target, Bundle state) {
    super.save(target, state);
    H.putInt(state, "serviceId", target.serviceId);
    H.putString(state, "name", target.name);
    H.putString(state, "url", target.url);
  }
}