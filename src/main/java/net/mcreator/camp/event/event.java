package net.mcreator.camp.event;

import net.mcreator.camp.block.SleepingBagBlock;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.event.entity.player.PlayerSetSpawnEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = "camp") // Замените "camp" на точный ID вашего мода, если он отличается
public class event {

    @SubscribeEvent
    public static void onPlayerSetSpawn(PlayerSetSpawnEvent event) {
        BlockPos pos = event.getNewSpawn();
        if (pos != null) {
            Level level = event.getEntity().level();
            BlockState state = level.getBlockState(pos);

            // Проверяем, является ли блок, на который ставится спавн, нашим спальником
            if (state.getBlock() instanceof SleepingBagBlock) {
                // Отменяем событие. Точка спавна останется прежней!
                event.setCanceled(true);
            }
        }
    }
}
