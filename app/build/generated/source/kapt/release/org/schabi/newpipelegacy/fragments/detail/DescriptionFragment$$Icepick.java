// Generated code from Icepick. Do not modify!
package org.schabi.newpipelegacy.fragments.detail;
import android.os.Bundle;
import icepick.Bundler;
import icepick.Injector.Helper;
import icepick.Injector.Object;

import java.util.Map;
import java.util.HashMap;

public class DescriptionFragment$$Icepick<T extends DescriptionFragment> extends org.schabi.newpipelegacy.BaseFragment$$Icepick<T> {

  private final static Map<String, Bundler<?>> BUNDLERS = new HashMap<String, Bundler<?>>();
  static {
      
  }

  private final static Helper H = new Helper("org.schabi.newpipelegacy.fragments.detail.DescriptionFragment$$Icepick.", BUNDLERS);

  public void restore(T target, Bundle state) {
    if (state == null) return;
    target.streamInfo = H.getSerializable(state, "streamInfo");
    super.restore(target, state);
  }

  public void save(T target, Bundle state) {
    super.save(target, state);
    H.putSerializable(state, "streamInfo", target.streamInfo);
  }
}