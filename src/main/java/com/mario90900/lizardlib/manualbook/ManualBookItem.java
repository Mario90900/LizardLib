package com.mario90900.lizardlib.manualbook;

import com.mario90900.lizardlib.LizardLib;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ManualBookItem extends Item{
	
	
	
	/**
	 * This constructor should never be called apart from through the Register Book class.
	 * 
	 * @param tab			The creative tab this book should display on.
	 * @param unlocName		The Unlocalized Name of the book. Expected to be of the format, "modID:nameOfItem"
	 * @param displyName	The name to actually display ingame to the player. Expected to already be localized.
	 */
	public ManualBookItem(CreativeTabs tab, String unlocName){
		super();
		this.setHasSubtypes(false);
		this.setMaxStackSize(1);
		this.setMaxDamage(0);
		this.setCreativeTab(tab);
		this.setUnlocalizedName(unlocName);
	}
	
	public ItemStack onItemRightClick(ItemStack itemStackIn, World worldIn, EntityPlayer playerIn){
		if (worldIn.isRemote){
            return itemStackIn;
        } else {
        	//playerIn.openGui(LizardLib.instance, modGuiId, worldIn, playerIn.serverPosX, playerIn.serverPosY, playerIn.serverPosZ);
        }
		
		return itemStackIn;
	}
	
	/**
	 * Strips all but the end portion of the unlocalized name. Ex: item.modID:THIS
	 * To be used as an identifier as to which book is being opened.
	 * 
	 * @param unlocName	This is the full unlocalized name, expected to be just directly sent for ease of use.
	 * @return
	 */
	protected String getStrippedUnlocalizedName(String unlocName){
		return unlocName.substring(unlocName.indexOf(':') + 1);
	}
}
