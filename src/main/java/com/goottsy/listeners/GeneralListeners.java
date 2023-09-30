package com.goottsy.listeners;

import com.goottsy.EventsSwitch;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.FoodLevelChangeEvent;

import static com.goottsy.commands.MainCMD.*;

public class GeneralListeners implements Listener {

    private final EventsSwitch instance;
    public GeneralListeners(EventsSwitch instance) {this.instance = instance;}

    @EventHandler
    public void onFood(FoodLevelChangeEvent e){
        if(!hungerstatus){
            e.setCancelled(true);
        }
    }

    @EventHandler
    public void onPlayerAttack(EntityDamageByEntityEvent event) {
        if (!pvpstatus) {
            if (event.getDamager() instanceof Player && event.getEntity() instanceof Player) {
                event.setCancelled(true);
            }
        }
    }

}
