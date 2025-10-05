package xyz.qmc.ExplodeBowMod.event;

import net.minecraft.world.level.Level;
import xyz.qmc.ExplodeBowMod.enchantments.ModEnchantments;

import net.minecraftforge.event.entity.ProjectileImpactEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraft.world.entity.projectile.Arrow;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Explosion;

@Mod.EventBusSubscriber
public class ModEvents {

    @SubscribeEvent
    public static void onArrowHit(ProjectileImpactEvent event) {
        if (!(event.getProjectile() instanceof Arrow arrow)) return;

        if (!(arrow.getOwner() instanceof LivingEntity shooter)) return;

        ItemStack bow = shooter.getMainHandItem();

        if (bow.getEnchantmentLevel(ModEnchantments.BOW_POWER.get()) > 0) {

            arrow.level().explode(
                    shooter,
                    arrow.getX(), arrow.getY(), arrow.getZ(),
                    2.0f,
                    Level.ExplosionInteraction.BLOCK
            );

            arrow.discard();

        }
    }

}
