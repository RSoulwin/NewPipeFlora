// Generated code from Icepick. Do not modify!
package org.schabi.newpipelegacy.player.helper;
import android.os.Bundle;
import icepick.Bundler;
import icepick.Injector.Helper;
import icepick.Injector.Object;

import java.util.Map;
import java.util.HashMap;

public class PlaybackParameterDialog$$Icepick<T extends PlaybackParameterDialog> extends Object<T> {

  private final static Map<String, Bundler<?>> BUNDLERS = new HashMap<String, Bundler<?>>();
  static {
                
  }

  private final static Helper H = new Helper("org.schabi.newpipelegacy.player.helper.PlaybackParameterDialog$$Icepick.", BUNDLERS);

  public void restore(T target, Bundle state) {
    if (state == null) return;
    target.initialTempo = H.getDouble(state, "initialTempo");
    target.initialPitchPercent = H.getDouble(state, "initialPitchPercent");
    target.initialSkipSilence = H.getBoolean(state, "initialSkipSilence");
    target.tempo = H.getDouble(state, "tempo");
    target.pitchPercent = H.getDouble(state, "pitchPercent");
    target.skipSilence = H.getBoolean(state, "skipSilence");
    super.restore(target, state);
  }

  public void save(T target, Bundle state) {
    super.save(target, state);
    H.putDouble(state, "initialTempo", target.initialTempo);
    H.putDouble(state, "initialPitchPercent", target.initialPitchPercent);
    H.putBoolean(state, "initialSkipSilence", target.initialSkipSilence);
    H.putDouble(state, "tempo", target.tempo);
    H.putDouble(state, "pitchPercent", target.pitchPercent);
    H.putBoolean(state, "skipSilence", target.skipSilence);
  }
}