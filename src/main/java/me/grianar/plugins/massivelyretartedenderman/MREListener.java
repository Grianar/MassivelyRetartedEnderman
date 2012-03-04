package me.grianar.plugins.massivelyretartedenderman;

import org.bukkit.Location;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityTargetEvent;

import java.util.Random;

public class MREListener implements Listener {
    
    @EventHandler
    public void onEntityTarget(EntityTargetEvent event) {
        EntityType e = event.getEntity().getType();
        if (e == EntityType.ENDERMAN) {
            Entity enderman = event.getEntity();
            Location loc = enderman.getLocation();
            Random r = new Random();
            event.getEntity().getWorld().createExplosion(loc, 12F);
        }
    }
}
