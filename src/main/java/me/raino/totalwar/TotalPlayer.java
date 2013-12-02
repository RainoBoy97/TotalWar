package me.raino.totalwar;

import org.bukkit.entity.Player;

public class TotalPlayer {
	
	private final Player player;
	private String username;
	private int kills;
	private int deaths;
	
	
	
	public TotalPlayer(Player player) {
		this.player = player;
		this.setUsername(player.getName());
	}



	public int getDeaths() {
		return deaths;
	}



	public void setDeaths(int deaths) {
		this.deaths = deaths;
	}



	public String getUsername() {
		return username;
	}



	public void setUsername(String username) {
		this.username = username;
	}



	public Player getPlayer() {
		return player;
	}



	public int getKills() {
		return kills;
	}



	public void setKills(int kills) {
		this.kills = kills;
	}
	

}
