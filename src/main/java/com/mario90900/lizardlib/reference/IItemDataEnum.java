package com.mario90900.lizardlib.reference;

import net.minecraft.util.IStringSerializable;

/**
 * For use in making Enums for the data involving sub items and blocks
 * 
 * @author Jonathon Secora
 *
 */
public interface IItemDataEnum extends IStringSerializable{
	/**
	 * This should return the unlocalized name of the sub item/block, without the mod ID or the item ID this is a sub item/block of
	 * 
	 * @return
	 */
	String getUnlocalizedName();
	
	/**
	 * This should return the full unlocalized name for use in texture registry
	 * 
	 * @return
	 */
	String getTextureName();
	
	/**
	 * Returns the meta value of the sub item/block
	 * 
	 * @return
	 */
	int getMeta();
}
