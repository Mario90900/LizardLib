package com.mario90900.lizardlib.creativetab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import com.mario90900.lizardlib.init.ModItems;
import com.mario90900.lizardlib.reference.Reference;

public class CreativeTabLL {
	public static final CreativeTabs LL_TAB = new CreativeTabs(Reference.MOD_ID.toLowerCase()){
		
		@Override
		@SideOnly(Side.CLIENT)
		public ItemStack getTabIconItem(){
			return new ItemStack(ModItems.easterEggActivator);
		}
		
		//@Override
		//@SideOnly(Side.CLIENT)
		//public int getIconItemDamage(){
		//	return 0;
		//}
	};
}
