package com.mario90900.lizardlib.items;

import com.mario90900.lizardlib.reference.Reference;
import com.mario90900.lizardlib.reference.UnlocalizedNames;

public class EasterEggActivator extends ItemLL {
	public EasterEggActivator(){
		super();
		this.setHasSubtypes(false);
		this.setMaxStackSize(1);
		this.setMaxDamage(0);
		this.setUnlocalizedName(UnlocalizedNames.Items.EASTER_EGG_ACTIVATOR);
		this.setRegistryName(Reference.MOD_ID, UnlocalizedNames.Items.EASTER_EGG_ACTIVATOR);
	}
	
	
}
