package com.olafdsouza.mc.ironthief;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

import java.util.ArrayList;
import java.util.logging.Logger;

public class chestInteract implements Listener {
    @EventHandler
    public void onPlayerInteractEvent(PlayerInteractEvent event) {
        ArrayList<Material> chests = new ArrayList<Material>();
        chests.add(Material.CHEST);
        chests.add(Material.BARREL);
        chests.add(Material.TRAPPED_CHEST);
        if (event.getAction() == Action.RIGHT_CLICK_BLOCK && chests.contains(event.getClickedBlock().getType())) {
            Logger.getLogger("minecraft").info(event.getPlayer()
                    + " interacted with " + event.getClickedBlock().getType()+ " at " + event.getClickedBlock().getLocation());
        }
    }


}
