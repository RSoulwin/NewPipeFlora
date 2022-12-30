// Generated code from Icepick. Do not modify!
package org.schabi.newpipelegacy;
import android.os.Bundle;
import icepick.Bundler;
import icepick.Injector.Helper;
import icepick.Injector.Object;

import java.util.Map;
import java.util.HashMap;

public class RouterActivity$$Icepick<T extends RouterActivity> extends Object<T> {

  private final static Map<String, Bundler<?>> BUNDLERS = new HashMap<String, Bundler<?>>();
  static {
          
  }

  private final static Helper H = new Helper("org.schabi.newpipelegacy.RouterActivity$$Icepick.", BUNDLERS);

  public void restore(T target, Bundle state) {
    if (state == null) return;
    target.currentServiceId = H.getInt(state, "currentServiceId");
    target.currentLinkType = H.getSerializable(state, "currentLinkType");
    target.selectedRadioPosition = H.getInt(state, "selectedRadioPosition");
    super.restore(target, state);
  }

  public void save(T target, Bundle state) {
    super.save(target, state);
    H.putInt(state, "currentServiceId", target.currentServiceId);
    H.putSerializable(state, "currentLinkType", target.currentLinkType);
    H.putInt(state, "selectedRadioPosition", target.selectedRadioPosition);
  }
}