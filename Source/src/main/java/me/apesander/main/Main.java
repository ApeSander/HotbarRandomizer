package me.apesander.main;

import me.apesander.main.commands.RandomizeCommand;
import me.apesander.main.events.BlockPlace;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin
{

    @Override
    public void onEnable()
    {
        getServer().getPluginManager().registerEvents(new BlockPlace(), this);
        getCommand("randomize").setExecutor(new RandomizeCommand());
    }

    @Override
    public void onDisable()
    {
        // Plugin shutdown logic
    }
}
