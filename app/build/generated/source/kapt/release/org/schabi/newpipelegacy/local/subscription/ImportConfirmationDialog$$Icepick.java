// Generated code from Icepick. Do not modify!
package org.schabi.newpipelegacy.local.subscription;
import android.os.Bundle;
import icepick.Bundler;
import icepick.Injector.Helper;
import icepick.Injector.Object;

import java.util.Map;
import java.util.HashMap;

public class ImportConfirmationDialog$$Icepick<T extends ImportConfirmationDialog> extends Object<T> {

  private final static Map<String, Bundler<?>> BUNDLERS = new HashMap<String, Bundler<?>>();
  static {
      
  }

  private final static Helper H = new Helper("org.schabi.newpipelegacy.local.subscription.ImportConfirmationDialog$$Icepick.", BUNDLERS);

  public void restore(T target, Bundle state) {
    if (state == null) return;
    target.resultServiceIntent = H.getParcelable(state, "resultServiceIntent");
    super.restore(target, state);
  }

  public void save(T target, Bundle state) {
    super.save(target, state);
    H.putParcelable(state, "resultServiceIntent", target.resultServiceIntent);
  }
}