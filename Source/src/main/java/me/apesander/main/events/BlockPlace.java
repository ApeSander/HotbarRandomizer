package me.apesander.main.events;

import me.apesander.main.Players;
import me.apesander.main.Rand;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;

import java.util.ArrayList;

public class BlockPlace implements Listener
{
    @EventHandler
    public void onBlockPlace(BlockPlaceEvent event)
    {
        Player player = event.getPlayer();

        if (Players.players.contains(player))
        {
            ArrayList<Integer> slots = new ArrayList<Integer>();
            for (int i = 0; i < 9; i++) {
                if (player.getInventory().getItem(i) != null) slots.add(i);
            }
            player.getInventory().setHeldItemSlot(slots.get(Rand.integer(slots.size())));
        }
    }
}
