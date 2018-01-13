package com.akaiha.receiver;

import com.akaiha.core.data.network.ReceiveCommand;
import com.akaiha.sync.Sync;
import com.google.gson.JsonObject;

public class Receiver implements ReceiveCommand {

	private Sync plugin;
	
	public Receiver(Sync plugin) {
		this.plugin = plugin;
	}
	
	@Override
	public void execute(final JsonObject jObj) {
		String command = jObj.get("command").getAsString();
		plugin.getLogger().warning("Executing Command: " + command);
		plugin.getServer().dispatchCommand(plugin.getServer().getConsoleSender(), command);
	}
}