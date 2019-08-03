package Core;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import InventoryGui.TestInventory;
import Listeners.InventoryActionListener;

public class Main extends JavaPlugin
{
	@Override
	public void onEnable() 
	{
		Bukkit.getPluginManager().registerEvents(new InventoryActionListener(), this);
	}

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		
		TestInventory t = new TestInventory((Player )sender);
		System.out.println(t.getInventory());
		((Player)sender).openInventory(t.getInventory());
		return super.onCommand(sender, command, label, args);

	}
}
