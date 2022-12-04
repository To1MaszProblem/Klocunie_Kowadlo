package me.to1maszproblem;

import me.to1maszproblem.Listener.onAnvilListener;
import org.bukkit.plugin.java.JavaPlugin;


public final class Main extends JavaPlugin {


    public void onEnable() {

        this.getServer().getPluginManager().registerEvents(new onAnvilListener(), this);



    }
}
