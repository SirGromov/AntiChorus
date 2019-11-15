package com.grom.main;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerTeleportEvent;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements Listener {
	
	public void onEnable() {
		getServer().getPluginManager().registerEvents(this, (Plugin)this);
		this.getLogger().info("Enabled!");
	}
	
	public void onDisable() {
		this.getLogger().info("Disabled!");
	}
	
	@EventHandler
	public void onPlayerTeleport(PlayerTeleportEvent event)
	{
	    if(event.getCause().equals(PlayerTeleportEvent.TeleportCause.CHORUS_FRUIT)) {
	    	event.setCancelled(true);
	    	event.getPlayer().sendMessage(ChatColor.RED + "А-та-та!");
	    }
	}
}
