package hu.snowylol.woolproofed;

import net.minecraft.client.MinecraftClient;
import net.minecraft.text.Text;

public class ModConfig {
    public static boolean ENABLED = true;
    public static double MIN_DISTANCE = 1.0;
    public static double CHECK_INTERVAL = 0.5;
    public static boolean BLOCK_UI_SOUNDS = false;
    
    public static void toggle() {
        ENABLED = !ENABLED;
        
        MinecraftClient client = MinecraftClient.getInstance();
        if (client.player != null) {
            String message = "§6[Woolproofed] §fSound blocking " + (ENABLED ? "§aenabled" : "§cdisabled");
            client.player.sendMessage(Text.literal(message), true); // true = action bar
        }
    }
}
