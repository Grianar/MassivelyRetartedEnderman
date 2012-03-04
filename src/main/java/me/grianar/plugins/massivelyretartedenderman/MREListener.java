package me.grianar.plugins.massivelyretartedenderman;

import org.bukkit.Location;
import org.bukkit.block.BlockState;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityTargetEvent;

public class MREListener implements Listener {
    
    @EventHandler
    public void onEntityTarget(EntityTargetEvent event) {
        EntityType e = event.getEntity().getType();
        if (e == EntityType.ENDERMAN) {
            Entity enderman = event.getEntity();
            Location loc = enderman.getLocation();
            BlockState[][][] nearbyBlocks = new BlockState[16][16][16];
            for (int x = 0; x < 16; x++) {
                for (int y = 0; y < 16; y++) {
                    for (int z = 0; z < 16; z++) {
                        nearbyBlocks[x][y][z] = loc.getBlock().getRelative(x - 8, y - 8, z - 8).getState();
                    }
                }
            }
            event.getEntity().getWorld().createExplosion(loc, 4F);

            for (int x = 0; x < 16; x++) {
                for (int y = 0; y < 16; y++) {
                    for (int z = 0; z < 16; z++) {
                        nearbyBlocks[x][y][z].update(true);
                    }
                }
            }
        }
    }
}
