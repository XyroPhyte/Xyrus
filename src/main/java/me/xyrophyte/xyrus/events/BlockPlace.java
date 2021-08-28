package me.xyrophyte.xyrus.events;

import me.xyrophyte.xyrus.Xyrus;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.plugin.Plugin;

public class BlockPlace implements Listener {

    private final Xyrus instance;

    public BlockPlace(Xyrus instance) {
        this.instance = instance;
    }

    private final Plugin plugin = Xyrus.getPlugin(Xyrus.class);
    private final Boolean BlockPlace = plugin.getConfig().getBoolean("Anti-Illegal.BlockPlace");
}
