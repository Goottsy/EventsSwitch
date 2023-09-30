package com.goottsy.commands;

import co.aikar.commands.BaseCommand;
import co.aikar.commands.annotation.*;
import com.goottsy.EventsSwitch;
import org.bukkit.Bukkit;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;

import static com.goottsy.commands.MainCMD.*;
import static com.goottsy.commands.MainCMD.hungerstatus;

@CommandAlias("hunger")
@CommandPermission("admin.perm")
@Description("Modifica el hambre")
public class HungerCMD extends BaseCommand {
    private FileConfiguration config;
    private EventsSwitch instance;

    public HungerCMD(EventsSwitch instance) {
        this.instance = instance;
    }

    @Subcommand("set")
    @CommandAlias("hset")
    public void hungerset(CommandSender sender, Player p, int amount) {
        p.setFoodLevel(amount);
        sender.sendMessage(darkgreen("(    - ")+green("Se establecio la hambre de ")+yellow(p.getName())+green(" en: ")+ yellow(String.valueOf(amount)));
    }

    @Subcommand("setall")
    @CommandAlias("hsetall")
    public void hungersetall(CommandSender sender, int amount) {
        for (Player all : Bukkit.getOnlinePlayers()) {
            all.setFoodLevel(amount);
        }
        sender.sendMessage(darkgreen("(    - ")+green("Se establecio la hambre de todos los jugadores en: ")+ yellow(String.valueOf(amount)));
    }

    @Subcommand("on")
    @CommandAlias("hon")
    public void hungeron(CommandSender sender) {
        if (hungerstatus){
            sender.sendMessage(darkgreen("(    - ")+green("La hambre ya estaba activada"));
        }else {
            hungerstatus = true;
            sender.sendMessage(darkgreen("(    - ")+green("La hambre se ha activado"));
            config.set("pvp", true);
            instance.saveConfig();
        }

    }

    @Subcommand("off")
    @CommandAlias("hoff")
    public void hungeroff(CommandSender sender) {
        if (!hungerstatus){
            sender.sendMessage(darkred("(    - ")+red("La hambre no estaba desactivada"));
        }else {
            hungerstatus = false;
            sender.sendMessage(darkred("(    - ")+red("La hambre se ha desactivado"));
            config.set("pvp", false);
            instance.saveConfig();
        }

    }


}
