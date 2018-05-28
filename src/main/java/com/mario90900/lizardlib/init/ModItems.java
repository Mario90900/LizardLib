package com.mario90900.lizardlib.init;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelBakery;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

import com.mario90900.lizardlib.items.EasterEggActivator;
import com.mario90900.lizardlib.items.ItemLL;
import com.mario90900.lizardlib.reference.IItemDataEnum;

public class ModItems {
	
	public static ItemLL easterEggActivator = new EasterEggActivator();
	
	public static void init(){
		ForgeRegistries.ITEMS.register(easterEggActivator);
	}
	
	/**
	 * This method is designed to register a single item, send just the item to register it
	 */
	public static void registerSingleItemRenders(ItemLL item){
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getUnlocalizedName().substring(5).replace('.', '_'), "inventory"));
	}
	
	/**
	 * This method will register a sub item of the given item, send it an item that has sub items and the ItemDataEnum value for the
	 * sub item you are registering.
	 * 
	 * @param item
	 */
	public static void registerSubItemRenders(ItemLL item, IItemDataEnum name){
		int meta = name.getMeta();
		String unlocalizedName = name.getTextureName();
		ResourceLocation resourceLoc = new ResourceLocation(name.getTextureName());
		ModelBakery.registerItemVariants(item, resourceLoc);
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, meta, new ModelResourceLocation(unlocalizedName, "inventory"));
	}
}
