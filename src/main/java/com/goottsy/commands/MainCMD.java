package com.goottsy.commands;

import co.aikar.commands.BaseCommand;
import co.aikar.commands.annotation.CommandAlias;
import co.aikar.commands.annotation.CommandCompletion;
import co.aikar.commands.annotation.CommandPermission;
import co.aikar.commands.annotation.Subcommand;
import com.goottsy.EventsSwitch;
import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;

@CommandAlias("main")
@CommandPermission("admin.perm")
public class MainCMD extends BaseCommand {
    private FileConfiguration config;
    private EventsSwitch instance;
    public static boolean hungerstatus, pvpstatus;
    public MainCMD(EventsSwitch instance) {
        this.instance = instance;
        this.config = instance.getConfig();
        hungerstatus = config.getBoolean("hunger");
        pvpstatus = config.getBoolean("pvp");
    }
    public static String prefix = darkaqua("[")+aqua("Events Switch")+darkaqua("]");


    @Subcommand("version")
    public void hungeron(CommandSender sender) {
        sender.sendMessage(darkgreen("(    - ")+green("Events Switch ")+aqua("By @Goottsy")+green(" Version 1.0"));
    }
    public static String red(String text) {
        return ChatColor.RED + text + ChatColor.RESET;
    }

    public static String darkred(String text) {
        return ChatColor.DARK_RED + text + ChatColor.RESET;
    }
    public static String green(String text) {
        return ChatColor.GREEN + text + ChatColor.RESET;
    }

    public static String darkgreen(String text) {
        return ChatColor.DARK_GREEN + text + ChatColor.RESET;
    }
    public static String yellow(String text) {
        return ChatColor.YELLOW + text + ChatColor.RESET;
    }
    public static String aqua(String text) {
        return ChatColor.AQUA + text + ChatColor.RESET;
    }

    public static String darkaqua(String text) {
        return ChatColor.DARK_AQUA + text + ChatColor.RESET;
    }

}
