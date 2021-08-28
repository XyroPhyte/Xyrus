package me.xyrophyte.xyrus;

import me.xyrophyte.xyrus.events.DeopOnLeave;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public final class Xyrus extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getLogger().info(ChatColor.AQUA + "Plugin is starting up");
        getLogger().info(ChatColor.LIGHT_PURPLE + "by XyroPhyte");
        getLogger().info(ChatColor.GOLD + "For support, join:");
        getLogger().info(ChatColor.GOLD + "https://discord.gg/dpYrXXWWrM");

        // Loading configuration
        getLogger().info(ChatColor.BLUE + "Loading plugin configuration.");
        getConfig().options().copyDefaults();
        saveDefaultConfig();
        getLogger().info(ChatColor.BLUE + "Loaded plugin configuration");

        // Registering events
        getLogger().info(ChatColor.BLUE + "Registering events.");
        getServer().getPluginManager().registerEvents(new DeopOnLeave(), this);
        getLogger().info(ChatColor.BLUE + "Registered all events.");

        getLogger().info(ChatColor.AQUA + "Plugin started successfully");

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getLogger().info("Plugin is shutting down");
    }
}
