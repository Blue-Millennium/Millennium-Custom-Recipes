package org.millennium.suisurorus.MCR;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import org.millennium.suisurorus.MCR.Custom_Recipes.Elytra;
import org.millennium.suisurorus.MCR.Custom_Recipes.Magma_Cream;

public final class Millennium_Custom_Recipes extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new Elytra(), this);
        new Elytra().Ely();
        getServer().getPluginManager().registerEvents(new Magma_Cream(), this);
        new Magma_Cream().MC();
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
