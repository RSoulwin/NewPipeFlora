// Generated code from Icepick. Do not modify!
package org.schabi.newpipelegacy.views;
import android.os.Bundle;
import android.os.Parcelable;
import icepick.Bundler;
import icepick.Injector.Helper;
import icepick.Injector.View;

import java.util.Map;
import java.util.HashMap;

public class CollapsibleView$$Icepick<T extends CollapsibleView> extends View<T> {

  private final static Map<String, Bundler<?>> BUNDLERS = new HashMap<String, Bundler<?>>();
  static {
      
  }

  private final static Helper H = new Helper("org.schabi.newpipelegacy.views.CollapsibleView$$Icepick.", BUNDLERS);

  public Parcelable restore(T target, Parcelable p) {
    Bundle state = (Bundle) p;
    target.currentState = H.getInt(state, "currentState");
    return super.restore(target, H.getParent(state));
  }

  public Parcelable save(T target, Parcelable p) {
    Bundle state = H.putParent(super.save(target, p));
    H.putInt(state, "currentState", target.currentState);
    return state;
  }
}