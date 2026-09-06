package com.example.mimod;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;

public class ModItems {
    // Ejemplo de un nuevo ítem registrado
    public static final Item RUBY = registerItem("ruby", new Item(new Item.Properties()));

    public static Item registerItem(String name, Item item) {
        return Registry.register(
            BuiltInRegistries.ITEM,
            ResourceLocation.fromNamespaceAndPath(MiMod.MOD_ID, name),
            item
        );
    }

    public static void registerModItems() {
        MiMod.LOGGER.info("Registrando ítems del mod: " + MiMod.MOD_ID);
    }
}
