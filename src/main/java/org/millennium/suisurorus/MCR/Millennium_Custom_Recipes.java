package org.millennium.suisurorus.MCR;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import org.millennium.suisurorus.MCR.Custom_Recipes.Elytra;

public final class Millennium_Custom_Recipes extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new Elytra(), this);
        new Elytra().initCustomRecipes();
        System.out.println("MCR has been installed.");
        // Plugin startup logic
    }

    @Override
    public void onDisable() {
        Bukkit.resetRecipes();
        System.out.println("MCR has been uninstalled.");
        // Plugin shutdown logic
    }
}
