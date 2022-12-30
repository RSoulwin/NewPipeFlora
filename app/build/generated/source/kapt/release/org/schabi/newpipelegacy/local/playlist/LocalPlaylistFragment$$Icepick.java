// Generated code from Icepick. Do not modify!
package org.schabi.newpipelegacy.local.playlist;
import android.os.Bundle;
import icepick.Bundler;
import icepick.Injector.Helper;
import icepick.Injector.Object;

import java.util.Map;
import java.util.HashMap;

public class LocalPlaylistFragment$$Icepick<T extends LocalPlaylistFragment> extends org.schabi.newpipelegacy.fragments.BaseStateFragment$$Icepick<T> {

  private final static Map<String, Bundler<?>> BUNDLERS = new HashMap<String, Bundler<?>>();
  static {
          
  }

  private final static Helper H = new Helper("org.schabi.newpipelegacy.local.playlist.LocalPlaylistFragment$$Icepick.", BUNDLERS);

  public void restore(T target, Bundle state) {
    if (state == null) return;
    target.playlistId = H.getBoxedLong(state, "playlistId");
    target.name = H.getString(state, "name");
    target.itemsListState = H.getParcelable(state, "itemsListState");
    super.restore(target, state);
  }

  public void save(T target, Bundle state) {
    super.save(target, state);
    H.putBoxedLong(state, "playlistId", target.playlistId);
    H.putString(state, "name", target.name);
    H.putParcelable(state, "itemsListState", target.itemsListState);
  }
}