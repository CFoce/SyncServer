package com.akaiha.sync;

import org.bukkit.plugin.java.JavaPlugin;

import com.akaiha.core.data.network.Receive;
import com.akaiha.receiver.Receiver;

public class Sync extends JavaPlugin {
	
    @Override
    public void onEnable(){
        Receive.registerCommand("sync", new Receiver(this));
    }
    
    @Override
    public void onDisable() {
    	Receive.unregisterCommand("sync");
    }
}