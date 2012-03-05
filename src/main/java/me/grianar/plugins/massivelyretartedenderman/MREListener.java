package me.grianar.plugins.massivelyretartedenderman;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityTargetEvent;
import org.bukkit.inventory.ItemStack;

public class MREListener implements Listener {


    @EventHandler
    public void onEntityTarget(EntityTargetEvent event) {
        EntityType e = event.getEntity().getType();
        if (e == EntityType.ENDERMAN) {
            Entity enderman = event.getEntity();
            Location loc = enderman.getLocation();
            Entity ent = event.getEntity();
            ent.getWorld().createExplosion(loc, 0f);
            ent.remove();
            ent.getWorld().dropItemNaturally(ent.getLocation(), new ItemStack(Material.ENDER_PEARL, 1));

        }
    }
}

