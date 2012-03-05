package me.grianar.plugins.massivelyretartedenderman;

import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Massivelyretartedenderman extends JavaPlugin {
    static Massivelyretartedenderman instance;
    public void onDisable() {
        instance = null;
    }

    public void onEnable() {
        instance = this;
        PluginManager pm = Bukkit.getServer().getPluginManager();
        MREListener listener = new MREListener();
        pm.registerEvents(listener, this);
    }
}

