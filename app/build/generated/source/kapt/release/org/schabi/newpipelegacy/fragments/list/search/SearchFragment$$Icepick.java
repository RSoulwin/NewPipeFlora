// Generated code from Icepick. Do not modify!
package org.schabi.newpipelegacy.fragments.list.search;
import android.os.Bundle;
import icepick.Bundler;
import icepick.Injector.Helper;
import icepick.Injector.Object;

import java.util.Map;
import java.util.HashMap;

public class SearchFragment$$Icepick<T extends SearchFragment> extends org.schabi.newpipelegacy.fragments.BaseStateFragment$$Icepick<T> {

  private final static Map<String, Bundler<?>> BUNDLERS = new HashMap<String, Bundler<?>>();
  static {
                        
  }

  private final static Helper H = new Helper("org.schabi.newpipelegacy.fragments.list.search.SearchFragment$$Icepick.", BUNDLERS);

  public void restore(T target, Bundle state) {
    if (state == null) return;
    target.filterItemCheckedId = H.getInt(state, "filterItemCheckedId");
    target.serviceId = H.getInt(state, "serviceId");
    target.searchString = H.getString(state, "searchString");
    target.contentFilter = H.getStringArray(state, "contentFilter");
    target.sortFilter = H.getString(state, "sortFilter");
    target.lastSearchedString = H.getString(state, "lastSearchedString");
    target.searchSuggestion = H.getString(state, "searchSuggestion");
    target.isCorrectedSearch = H.getBoolean(state, "isCorrectedSearch");
    target.metaInfo = H.getSerializable(state, "metaInfo");
    target.wasSearchFocused = H.getBoolean(state, "wasSearchFocused");
    super.restore(target, state);
  }

  public void save(T target, Bundle state) {
    super.save(target, state);
    H.putInt(state, "filterItemCheckedId", target.filterItemCheckedId);
    H.putInt(state, "serviceId", target.serviceId);
    H.putString(state, "searchString", target.searchString);
    H.putStringArray(state, "contentFilter", target.contentFilter);
    H.putString(state, "sortFilter", target.sortFilter);
    H.putString(state, "lastSearchedString", target.lastSearchedString);
    H.putString(state, "searchSuggestion", target.searchSuggestion);
    H.putBoolean(state, "isCorrectedSearch", target.isCorrectedSearch);
    H.putSerializable(state, "metaInfo", target.metaInfo);
    H.putBoolean(state, "wasSearchFocused", target.wasSearchFocused);
  }
}