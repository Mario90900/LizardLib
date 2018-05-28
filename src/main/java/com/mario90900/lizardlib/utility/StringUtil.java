package com.mario90900.lizardlib.utility;

import net.minecraft.client.resources.I18n;

public class StringUtil {
	public static String localize(String key) {
		return I18n.format(key);
	}
}