package me.grianar.plugins.massivelyretartedenderman;

import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Massivelyretartedenderman extends JavaPlugin {
    public void onDisable() {

    }

    public void onEnable() {
        PluginManager pm = Bukkit.getServer().getPluginManager();
        MREListener listener = new MREListener();
        pm.registerEvents(listener, this);
    }
}

