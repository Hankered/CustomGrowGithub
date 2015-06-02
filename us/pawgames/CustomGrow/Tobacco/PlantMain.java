package us.pawgames.CustomGrow.Tobacco;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class PlantMain implements Listener {

	// private final FileConfiguration config = Grow.plugin.getConfig();

	public ItemStack tob() {
		ItemStack is = new ItemStack(Material.BREAD);
		ItemMeta im = is.getItemMeta();
		im.setDisplayName(ChatColor.BLUE + "Bread or something idk");
		is.setItemMeta(im);
		return is;
	}

	@EventHandler
	public void onPlaceEvent(PlayerInteractEvent e) {
		Block b = e.getClickedBlock();
		Player p = e.getPlayer();
		if (e.getClickedBlock() == null
				|| e.getAction() == Action.LEFT_CLICK_AIR //
				|| e.getAction() == Action.LEFT_CLICK_BLOCK
				|| e.getAction() == Action.RIGHT_CLICK_AIR 
				|| p.getItemInHand() == null) {
			System.out.println("1");
			return;
		}
		
	}
}
