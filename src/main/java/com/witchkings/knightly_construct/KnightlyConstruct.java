package com.witchkings.knightly_construct;

import com.mojang.logging.LogUtils;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.InterModComms;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;


import java.util.ArrayList;
import java.util.List;

import java.util.stream.Collectors;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(KnightlyConstruct.MOD_ID)

public class KnightlyConstruct {
    public static final String MOD_ID = "knightly_construct";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();
    public KnightlyConstruct() {
        // Register the setup method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
        MinecraftForge.EVENT_BUS.register(new Weapons());
        MinecraftForge.EVENT_BUS.register(new WeaponParts());
    }
    private void setup(final FMLCommonSetupEvent event) {
        // some preinit code
        LOGGER.info("No man can kill me (c) Witch-King");
        LOGGER.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
    }

}