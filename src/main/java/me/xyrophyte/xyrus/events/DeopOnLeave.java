package me.xyrophyte.xyrus.events;

import me.xyrophyte.xyrus.Xyrus;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerKickEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.plugin.Plugin;

public class DeopOnLeave implements Listener {

    private final Plugin plugin = Xyrus.getPlugin(Xyrus.class);
    private final Boolean DeopOnLeave = plugin.getConfig().getBoolean("DeopOnLeave");

    @EventHandler
    public void onLeave(PlayerQuitEvent quitEvent) {
        Player player = quitEvent.getPlayer();
        if (DeopOnLeave && player.isOp()) {
            player.setOp(false);
        }
    }

    public void onKick(PlayerKickEvent kickEvent) {
        Player player = kickEvent.getPlayer();
        if (DeopOnLeave && player.isOp()) {
            player.setOp(false);
        }
    }
}
