package com.mario90900.lizardlib.proxy;

import com.mario90900.lizardlib.init.ModItems;

public class ClientProxy extends CommonProxy{
	@Override
	public void registerRenderers(){
		//Item Render Registry
		ModItems.registerSingleItemRenders(ModItems.easterEggActivator);
		
		//Block Render Registry
	}
}
