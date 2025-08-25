package hu.snowylol.woolproofed;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class SoundBlocker {
    
    public static boolean shouldBlockSound(World world, Vec3d soundSource, Vec3d playerPos) {
        if (!ModConfig.ENABLED) {
            return false;
        }
        
        // Don't block sounds that are too close to the player
        double distance = soundSource.distanceTo(playerPos);
        if (distance < ModConfig.MIN_DISTANCE) {
            return false;
        }
        
        Vec3d direction = playerPos.subtract(soundSource).normalize();
        
        // Check every block along the line from sound source to player
        for (double d = 0; d < distance; d += ModConfig.CHECK_INTERVAL) {
            Vec3d checkPos = soundSource.add(direction.multiply(d));
            BlockPos blockPos = new BlockPos((int) checkPos.x, (int) checkPos.y, (int) checkPos.z);
            
            // Skip if we're checking the same position as the player
            if (blockPos.equals(new BlockPos((int) playerPos.x, (int) playerPos.y, (int) playerPos.z))) {
                continue;
            }
            
            BlockState blockState = world.getBlockState(blockPos);
            Block block = blockState.getBlock();
            
            // Check if the block is wool
            if (isWoolBlock(block)) {
                return true;
            }
        }
        
        return false;
    }
    
    private static boolean isWoolBlock(Block block) {
        return block == Blocks.WHITE_WOOL ||
               block == Blocks.ORANGE_WOOL ||
               block == Blocks.MAGENTA_WOOL ||
               block == Blocks.LIGHT_BLUE_WOOL ||
               block == Blocks.YELLOW_WOOL ||
               block == Blocks.LIME_WOOL ||
               block == Blocks.PINK_WOOL ||
               block == Blocks.GRAY_WOOL ||
               block == Blocks.LIGHT_GRAY_WOOL ||
               block == Blocks.CYAN_WOOL ||
               block == Blocks.PURPLE_WOOL ||
               block == Blocks.BLUE_WOOL ||
               block == Blocks.BROWN_WOOL ||
               block == Blocks.GREEN_WOOL ||
               block == Blocks.RED_WOOL ||
               block == Blocks.BLACK_WOOL;
    }
}
