package net.jimmy1248.gamemodezero;


import org.bukkit.GameMode;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class GameModeZero extends JavaPlugin implements Listener{
	@Override
	public void onEnable() {
		getServer().getPluginManager().registerEvents(this, this);
	}
	@EventHandler
	public void onPlayerJoin(PlayerJoinEvent event){
		Player player = event.getPlayer();
		if(player.getGameMode()==GameMode.CREATIVE){
			player.teleport(player.getWorld().getSpawnLocation());
			player.setGameMode(GameMode.SURVIVAL);
		}
	}
}