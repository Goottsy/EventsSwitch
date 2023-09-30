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

@CommandAlias("pvp")
@CommandPermission("admin.perm")
@Description("Modifica el PVP")
public class PVPCMD extends BaseCommand {
    private FileConfiguration config;
    private EventsSwitch instance;

    public PVPCMD(EventsSwitch instance) {
        this.instance = instance;
    }

    @Subcommand("on")
    @CommandAlias("pvpon")
    public void pvpon(CommandSender sender) {
        if (pvpstatus){
            sender.sendMessage(darkgreen("(    - ")+green("El PVP ya estaba activado"));
        }else {
            pvpstatus = true;
            sender.sendMessage(darkgreen("(    - ")+green("El PVP se ha activado"));
            config.set("hunger", true);
            instance.saveConfig();
        }

    }

    @Subcommand("off")
    @CommandAlias("pvpoff")
    public void pvpoff(CommandSender sender) {
        if (!pvpstatus){
            sender.sendMessage(darkred("(    - ")+red("El PVPno estaba desactivado"));
        }else {
            pvpstatus = false;
            sender.sendMessage(darkred("(    - ")+red("El PVP se ha desactivado"));
            config.set("hunger", false);
            instance.saveConfig();
        }

    }


}
