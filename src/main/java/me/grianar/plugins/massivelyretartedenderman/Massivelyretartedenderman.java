package me.grianar.plugins.massivelyretartedenderman;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;


public class Massivelyretartedenderman extends JavaPlugin implements Listener {
    public void onDisable() {

    }

    public void onEnable() {
        getServer().getPluginManager().registerEvents(this, this);

    }
}

