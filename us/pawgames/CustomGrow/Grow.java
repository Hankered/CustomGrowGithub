package us.pawgames.CustomGrow;

import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

import us.pawgames.CustomGrow.Plant.PlantMain;


public class Grow extends JavaPlugin {

	public static Plugin plugin = null;

	@Override
	public void onEnable() {
		plugin = this;
		Bukkit.getPluginManager().registerEvents(new PlantMain(), plugin);
	}


}
