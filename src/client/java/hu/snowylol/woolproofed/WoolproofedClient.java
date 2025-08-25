package hu.snowylol.woolproofed;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;

public class WoolproofedClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		KeyBindings.init();
		ClientTickEvents.END_CLIENT_TICK.register(client -> KeyBindings.tick());
	}
}