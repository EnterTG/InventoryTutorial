package InventoryGui;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class TestInventory extends InventoryGui{

	private int page = 0;
	
	
	public TestInventory(Player p)
	{
		super(p);
		createInventory();
	}
	
	private void createInventory()
	{
		inventory = Bukkit.createInventory(this, 9,"Test");
		this.setItem(0, new ItemStack(Material.IRON_ORE), e -> nextPage());
		this.setItem(1, new ItemStack(Material.BRICKS), e -> player.sendMessage("Hey"));
	}
	
	private void nextPage()
	{
		this.setItem(page++ + 2, new ItemStack(Material.IRON_ORE), e -> nextPage());
		
	}
	
	@Override
	public boolean onInventoryClick(Player player, int slot, ItemStack item) {
		return true;
	}

	@Override
	public boolean onInventoryOpen(Player player) {
		return false;
	}

	@Override
	public boolean onInventoryClose(Player player) {
		return false;
	}



}
