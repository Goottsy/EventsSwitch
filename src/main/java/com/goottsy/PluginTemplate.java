package com.goottsy;

import co.aikar.commands.PaperCommandManager;
import com.goottsy.commands.MainCMD;
import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

import static com.goottsy.Utils.TextUtils.green;
import static com.goottsy.Utils.TextUtils.red;

public final class PluginTemplate extends JavaPlugin {

    private static PluginTemplate instance;
    public static PaperCommandManager commandManager;
    @Override
    public void onEnable() {
        instance = this;
        commandManager = new PaperCommandManager(this);

        commandManager.registerCommand(new MainCMD(this));

        //registerListener(new MainListeners(this));

        getLogger().info( green("Mexcraft Games 2 ha sido Activado 1.0"));
    }

    @Override
    public void onDisable() {
        getLogger().info(red("Mexcraft Games 2 ha sido Desactivado"));
    }

    public void registerListener(Listener listener) {
        Bukkit.getPluginManager().registerEvents(listener, instance);
    }

}
