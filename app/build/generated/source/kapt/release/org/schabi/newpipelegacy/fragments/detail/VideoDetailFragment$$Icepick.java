// Generated code from Icepick. Do not modify!
package org.schabi.newpipelegacy.fragments.detail;
import android.os.Bundle;
import icepick.Bundler;
import icepick.Injector.Helper;
import icepick.Injector.Object;

import java.util.Map;
import java.util.HashMap;

public class VideoDetailFragment$$Icepick<T extends VideoDetailFragment> extends org.schabi.newpipelegacy.fragments.BaseStateFragment$$Icepick<T> {

  private final static Map<String, Bundler<?>> BUNDLERS = new HashMap<String, Bundler<?>>();
  static {
              
  }

  private final static Helper H = new Helper("org.schabi.newpipelegacy.fragments.detail.VideoDetailFragment$$Icepick.", BUNDLERS);

  public void restore(T target, Bundle state) {
    if (state == null) return;
    target.serviceId = H.getInt(state, "serviceId");
    target.title = H.getString(state, "title");
    target.url = H.getString(state, "url");
    target.bottomSheetState = H.getInt(state, "bottomSheetState");
    target.autoPlayEnabled = H.getBoolean(state, "autoPlayEnabled");
    super.restore(target, state);
  }

  public void save(T target, Bundle state) {
    super.save(target, state);
    H.putInt(state, "serviceId", target.serviceId);
    H.putString(state, "title", target.title);
    H.putString(state, "url", target.url);
    H.putInt(state, "bottomSheetState", target.bottomSheetState);
    H.putBoolean(state, "autoPlayEnabled", target.autoPlayEnabled);
  }
}