package com.olafdsouza.mc.ironthief;

import org.bukkit.plugin.java.JavaPlugin;

public final class IronThief extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getLogger().info("IronThief plugin enabled");
        getServer().getPluginManager().registerEvents(new chestInteract(),this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getLogger().info("IronThief plugin disabled");
    }
}
