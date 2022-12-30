// Generated code from Icepick. Do not modify!
package org.schabi.newpipelegacy.settings;
import android.os.Bundle;
import icepick.Bundler;
import icepick.Injector.Helper;
import icepick.Injector.Object;

import java.util.Map;
import java.util.HashMap;

public class SettingsActivity$$Icepick<T extends SettingsActivity> extends Object<T> {

  private final static Map<String, Bundler<?>> BUNDLERS = new HashMap<String, Bundler<?>>();
  static {
        
  }

  private final static Helper H = new Helper("org.schabi.newpipelegacy.settings.SettingsActivity$$Icepick.", BUNDLERS);

  public void restore(T target, Bundle state) {
    if (state == null) return;
    target.searchText = H.getString(state, "searchText");
    target.wasSearchActive = H.getBoolean(state, "wasSearchActive");
    super.restore(target, state);
  }

  public void save(T target, Bundle state) {
    super.save(target, state);
    H.putString(state, "searchText", target.searchText);
    H.putBoolean(state, "wasSearchActive", target.wasSearchActive);
  }
}