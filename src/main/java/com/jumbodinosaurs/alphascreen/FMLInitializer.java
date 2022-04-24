package com.jumbodinosaurs.alphascreen;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiMainMenu;
import net.minecraftforge.client.event.GuiScreenEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod(useMetadata = true, modid = FMLInitializer.modid, version = FMLInitializer.version)
public class FMLInitializer
{
    public static final String modid = "alphatitlescreen";
    public static final String version = "0.0.0";
    
    
    @Mod.EventHandler
    public void preInit(FMLInitializationEvent event)
    {
        Minecraft.getMinecraft();
    }
    
    
    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        MinecraftForge.EVENT_BUS.register(this);
    }
    
    
    @SubscribeEvent
    public void onMainScreenLoad(GuiScreenEvent guiScreenEvent)
    {
        if(guiScreenEvent.getGui().getClass().equals(GuiMainMenu.class))
        {
            Minecraft.getMinecraft().displayGuiScreen(new CustomMainMenu());
        }
    }
    
}
