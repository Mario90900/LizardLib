package com.mario90900.lizardlib.utility;

import org.apache.logging.log4j.Level;

import net.minecraftforge.fml.common.FMLLog;

public class LogHelper {
	public static void log(String modName, Level logLevel, Object object){
		FMLLog.log(modName, logLevel, String.valueOf(object));
	}

	public static void all(String modName, Object object){
		log(modName, Level.ALL, object);
	}

	public static void debug(String modName, Object object){
		log(modName, Level.DEBUG, object);
	}

	public static void error(String modName, Object object){
		log(modName, Level.ERROR, object);
	}

	public static void fatal(String modName, Object object){
		log(modName, Level.FATAL, object);
	}

	public static void info(String modName, Object object){
		log(modName, Level.INFO, object);
	}

	public static void off(String modName, Object object){
		log(modName, Level.OFF, object);
	}

	public static void trace(String modName, Object object){
		log(modName, Level.TRACE, object);
	}

	public static void warn(String modName, Object object){
		log(modName, Level.WARN, object);
	}
}
