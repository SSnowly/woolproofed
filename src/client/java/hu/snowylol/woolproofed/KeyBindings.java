package hu.snowylol.woolproofed;

import hu.snowylol.woolproofed.ModConfig;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.util.InputUtil;
import org.lwjgl.glfw.GLFW;

public class KeyBindings {
    public static KeyBinding TOGGLE_SOUND_BLOCKING;
    
    public static void init() {
        TOGGLE_SOUND_BLOCKING = KeyBindingHelper.registerKeyBinding(new KeyBinding(
            "key.woolproofed.toggle",
            InputUtil.Type.KEYSYM,
            GLFW.GLFW_KEY_B,
            "category.woolproofed.general"
        ));
    }
    
    public static void tick() {
        if (TOGGLE_SOUND_BLOCKING.wasPressed()) {
            ModConfig.toggle();
        }
    }
}
