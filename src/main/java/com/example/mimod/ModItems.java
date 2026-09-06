package com.example.mimod;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;
import java.util.function.Function;

public class ModItems {
    public static final ResourceKey<Item> RUBY_KEY = ResourceKey.create(
        Registries.ITEM,
        Identifier.fromNamespaceAndPath(MiMod.MOD_ID, "ruby")
    );

    public static final Item RUBY = register(RUBY_KEY, Item::new, new Item.Properties());

    public static Item register(ResourceKey<Item> itemKey, Function<Item.Properties, Item> itemFactory, Item.Properties settings) {
        Item item = itemFactory.apply(settings.setId(itemKey));
        Registry.register(BuiltInRegistries.ITEM, itemKey, item);
        return item;
    }

    public static void initialize() {
        MiMod.LOGGER.info("Registrando items para " + MiMod.MOD_ID);
    }
}
