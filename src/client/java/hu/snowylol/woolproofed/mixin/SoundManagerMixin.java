package hu.snowylol.woolproofed.mixin;

import hu.snowylol.woolproofed.ModConfig;
import hu.snowylol.woolproofed.SoundBlocker;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.sound.SoundInstance;
import net.minecraft.client.sound.SoundManager;
import net.minecraft.util.math.Vec3d;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(SoundManager.class)
public class SoundManagerMixin {
    
    @Inject(method = "play(Lnet/minecraft/client/sound/SoundInstance;)V", at = @At("HEAD"), cancellable = true)
    private void onPlaySound(SoundInstance sound, CallbackInfo ci) {
        MinecraftClient client = MinecraftClient.getInstance();
        
        if (client.player == null || client.world == null) {
            return;
        }
        
        // Skip sounds that don't have a position (like UI sounds) unless configured to block them
        if (!ModConfig.BLOCK_UI_SOUNDS && sound.getX() == 0 && sound.getY() == 0 && sound.getZ() == 0) {
            return;
        }
        
        // Get sound source position
        Vec3d soundSource = new Vec3d(sound.getX(), sound.getY(), sound.getZ());
        Vec3d playerPos = client.player.getPos();
        
        // Check if sound should be blocked by wool
        if (SoundBlocker.shouldBlockSound(client.world, soundSource, playerPos)) {
            ci.cancel(); // Block the sound
        }
    }
}
