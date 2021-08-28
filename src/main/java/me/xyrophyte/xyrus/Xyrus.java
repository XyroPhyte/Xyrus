package me.xyrophyte.xyrus;

import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public final class Xyrus extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getLogger().info(ChatColor.BLUE + "Plugin is starting up");
        getLogger().info(ChatColor.AQUA + "by XyroPhyte");

        getLogger().info(ChatColor.BLUE + "Plugin started successfully");
        getLogger().info(ChatColor.AQUA + "For support, join:");
        getLogger().info(ChatColor.GOLD + "https://discord.gg/dpYrXXWWrM");

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getLogger().info("Plugin is shutting down");
    }
}
