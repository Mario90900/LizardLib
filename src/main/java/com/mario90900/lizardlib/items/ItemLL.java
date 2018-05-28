package com.mario90900.lizardlib.items;

import com.mario90900.lizardlib.creativetab.CreativeTabLL;
import com.mario90900.lizardlib.reference.Reference;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

/**
 * Design for this class borrowed from Pahimar's Open Source EE3.
 * Idea behind design was to include the most basic of requirements for items in this very basic class, to extend for items that come after.
 * 
 * @author Jonathon Secora
 *
 */
public class ItemLL extends Item{
	public ItemLL(){
		super();
		this.setCreativeTab(CreativeTabLL.LL_TAB);
	}
	
	@Override
	public String getUnlocalizedName(){
		return String.format("item.%s%s", Reference.RESOURCE_PREFIX, getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
	}
	
	@Override
    public String getUnlocalizedName(ItemStack itemStack){
        return String.format("item.%s%s", Reference.RESOURCE_PREFIX, getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }
	
	protected String getUnwrappedUnlocalizedName(String unlocalizedName){
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }
}
