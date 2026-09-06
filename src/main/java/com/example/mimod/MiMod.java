package com.example.mimod;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MiMod implements ModInitializer {
    public static final String MOD_ID = "mimod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("¡Inicializando {} para Minecraft 26.2!", MOD_ID);
        ModItems.initialize();
    }
}
