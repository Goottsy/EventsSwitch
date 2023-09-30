package com.goottsy;

import co.aikar.commands.PaperCommandManager;
import com.goottsy.commands.HungerCMD;
import com.goottsy.commands.MainCMD;
import com.goottsy.commands.PVPCMD;
import com.goottsy.listeners.GeneralListeners;
import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

import static com.goottsy.commands.MainCMD.*;

public final class EventsSwitch extends JavaPlugin {

    private static EventsSwitch instance;
    public static PaperCommandManager commandManager;
    @Override
    public void onEnable() {
        instance = this;
        commandManager = new PaperCommandManager(this);

        commandManager.registerCommand(new MainCMD(this));
        commandManager.registerCommand(new HungerCMD(this));
        commandManager.registerCommand(new PVPCMD(this));

        registerListener(new GeneralListeners(this));

        getLogger().info( green("Events Switch ")+aqua("By @Goottsy")+green(" ha sido Activado 1.0"));
    }

    @Override
    public void onDisable() {
        getLogger().info( red("Events Switch ")+aqua("By @Goottsy")+red(" ha sido Desactivado 1.0"));
    }

    public void registerListener(Listener listener) {
        Bukkit.getPluginManager().registerEvents(listener, instance);
    }

}
