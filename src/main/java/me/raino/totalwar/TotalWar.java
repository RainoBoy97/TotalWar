package me.raino.totalwar;

import me.raino.totalwar.utils.Log;

import org.bukkit.plugin.java.JavaPlugin;

public class TotalWar extends JavaPlugin {

	private static TotalWar instance;
	
	public void onDisable() {
		
	}
	
	public void onEnable() {
		/* Static instance */
		instance = this;
		
		Log.setDebugging(true);
	}
	
	public static TotalWar get() {
		return instance;
	}
	
}
