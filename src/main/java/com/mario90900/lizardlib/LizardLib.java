package com.mario90900.lizardlib;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;

import com.mario90900.lizardlib.LizardLib;
import com.mario90900.lizardlib.init.ModItems;
import com.mario90900.lizardlib.proxy.IProxy;
import com.mario90900.lizardlib.reference.Reference;
import com.mario90900.lizardlib.utility.LogHelper;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION, dependencies = "required-after:forge@[14.23.3.2679,)", useMetadata = true)
public class LizardLib {
	
	@Instance
    public static LizardLib instance = new LizardLib();
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY, serverSide = Reference.SERVER_PROXY)
	public static IProxy proxy;
	
	@EventHandler
    public void preInit(FMLPreInitializationEvent e) {
    	LogHelper.info(Reference.MOD_NAME, "Started Pre-Init Phase");
    	
    	//Load configs, init network handler, keybinds, init blocks + items here
    	NetworkRegistry.INSTANCE.registerGuiHandler(LizardLib.instance, GuiHandlerRegistry.getInstance());
    	//GuiHandlerRegistry.getInstance().registerGuiHandler(new GuiHandlerMBE30(), GuiHandlerMBE30.getGuiID());
    	
    	ModItems.init();
	}
	
	@EventHandler
    public void init(FMLInitializationEvent e) {
    	LogHelper.info(Reference.MOD_NAME, "Started Init Phase");
    	
    	//Setup GUI handler, Tile Ents, and General Event Handlers, and recipes here
    	proxy.registerTileEntities();
    	proxy.registerRenderers();
    	
	}
	
	@EventHandler
    public void postInit(FMLPostInitializationEvent e) {
    	LogHelper.info(Reference.MOD_NAME, "Started Post-Init Phase");
    	
    	//Wrap things up, and mod integration here
    	
    }
}
