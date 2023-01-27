package me.apesander.main.commands;

import me.apesander.main.Players;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class RandomizeCommand implements CommandExecutor
{
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
    {
        if (!(sender instanceof Player))
        {
            System.out.println("You cannot execute this command in the console!");
            return false;
        }

        Player player = (Player) sender;

        if (args[0].equals("?") || args[0].equals("help"))
        {
            player.sendMessage(ChatColor.AQUA + "use /randomize");
            player.sendMessage(ChatColor.DARK_AQUA + "Plugin made by ApeSander");
            return true;
        }

        if (Players.players.contains(player))
        {
            player.sendMessage(ChatColor.AQUA + "The randomizer is turned off.");
            Players.players.remove(player);
        }
        else
        {
            player.sendMessage(ChatColor.AQUA + "The randomizer is turned on.");
            Players.players.add(player);
        }

        return true;
    }
}
