package org.millennium.suisurorus.MCR.Custom_Recipes;

import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;

import static org.bukkit.Bukkit.getServer;

public class Elytra implements Listener {
    public void Ely() {
        Material[] bannerColors = {
                Material.WHITE_BANNER,
                Material.ORANGE_BANNER,
                Material.MAGENTA_BANNER,
                Material.LIGHT_BLUE_BANNER,
                Material.YELLOW_BANNER,
                Material.LIME_BANNER,
                Material.PINK_BANNER,
                Material.GRAY_BANNER,
                Material.LIGHT_GRAY_BANNER,
                Material.CYAN_BANNER,
                Material.PURPLE_BANNER,
                Material.BLUE_BANNER,
                Material.BROWN_BANNER,
                Material.GREEN_BANNER,
                Material.RED_BANNER,
                Material.BLACK_BANNER
        };
        for (Material ColorBanner : bannerColors) {
            NamespacedKey key = new NamespacedKey("mcr", ColorBanner.name().toLowerCase() + "_to_elytra");
            ShapedRecipe ely = new ShapedRecipe(key, new ItemStack(Material.ELYTRA))
                    .shape("ABA", "CDC", "EFE")
                    .setIngredient('A', Material.SLIME_BALL)
                    .setIngredient('B', Material.CHORUS_FLOWER)
                    .setIngredient('C', Material.PHANTOM_MEMBRANE)
                    .setIngredient('D', ColorBanner)
                    .setIngredient('E', Material.FEATHER)
                    .setIngredient('F', Material.DRAGON_BREATH);
            getServer().addRecipe(ely);
        }
    }
}
