package com.simonsvale.quasarlibrary;

import com.mojang.logging.LogUtils;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import org.slf4j.Logger;
import org.lwjgl.opengl.GL30;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(QuasarShader.MODID)
public class QuasarShader
{
    // Define mod id in a common place for everything to reference
    public static final String MODID = "quasarlibrary";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();

    public QuasarShader()
    {
    	
    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event)
    {
        // Do something when the server starts
        LOGGER.info("HELLO from server starting");
    }
}

