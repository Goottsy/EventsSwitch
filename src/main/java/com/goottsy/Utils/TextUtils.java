package com.goottsy.Utils;

import org.bukkit.ChatColor;

public class TextUtils {

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
    public static String gold(String text) {
        return ChatColor.GOLD + text + ChatColor.RESET;
    }
    public static String blue(String text) {
        return ChatColor.BLUE + text + ChatColor.RESET;
    }

    public static String darkblue(String text) {
        return ChatColor.DARK_BLUE + text + ChatColor.RESET;
    }

    public static String aqua(String text) {
        return ChatColor.AQUA + text + ChatColor.RESET;
    }

    public static String darkaqua(String text) {
        return ChatColor.DARK_AQUA + text + ChatColor.RESET;
    }

    public static String white(String text) {
        return ChatColor.WHITE + text + ChatColor.RESET;
    }

    public static String gray(String text) {
        return ChatColor.GRAY + text + ChatColor.RESET;
    }

    public static String darkgray(String text) {
        return ChatColor.DARK_GRAY + text + ChatColor.RESET;
    }

    public static String purple(String text) {
        return ChatColor.LIGHT_PURPLE + text + ChatColor.RESET;
    }

    public static String darkpurple(String text) {
        return ChatColor.DARK_PURPLE + text + ChatColor.RESET;
    }

    public static String devprefix = darkaqua(ChatColor.BOLD + "[") + aqua(ChatColor.BOLD +"DEV")+ darkaqua(ChatColor.BOLD +"] ") ;
    public static String adminprefix = gold(ChatColor.BOLD + "[") + yellow(ChatColor.BOLD +"ADMIN")+ gold(ChatColor.BOLD +"] ") ;
}
