package org.schabi.newpipelegacy.player.event;

import org.schabi.newpipelegacy.player.Player;
import org.schabi.newpipelegacy.player.PlayerService;

public interface PlayerServiceExtendedEventListener extends PlayerServiceEventListener {
    void onServiceConnected(Player player,
                            PlayerService playerService,
                            boolean playAfterConnect);
    void onServiceDisconnected();
}
