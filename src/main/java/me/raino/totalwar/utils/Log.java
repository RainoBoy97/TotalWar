package me.raino.totalwar.utils;

import java.util.logging.Level;
import java.util.logging.Logger;

import me.raino.totalwar.TotalWar;

public class Log {

	private static Logger log;

	private static boolean debug = false;

	static {
		log = TotalWar.get().getLogger();
	}

	public static void log(Level lvl, String msg) {
		log.log(lvl, msg);
	}

	public static void log(String msg) {
		log(Level.INFO, msg);
	}

	public static void log(Exception e) {
		log(Level.WARNING, e.getMessage());
		e.printStackTrace();
	}

	public static void debug(String msg) {
		if (debug) log("[DEBUG] " + msg);
	}

	public static void setDebugging(boolean debug) {
		Log.debug = debug;
	}

}
