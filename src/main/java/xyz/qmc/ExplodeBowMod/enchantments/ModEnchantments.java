package xyz.qmc.ExplodeBowMod.enchantments;

import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import xyz.qmc.ExplodeBowMod.ExplodeBow;

public class ModEnchantments {
    public static final DeferredRegister<Enchantment> ENCHANTMENTS =
            DeferredRegister.create(ForgeRegistries.ENCHANTMENTS, ExplodeBow.MODID);

    public static final RegistryObject<Enchantment> BOW_POWER =
            ENCHANTMENTS.register("bow_power", BowPowerEnchantment::new);

    public static void register() {
        ENCHANTMENTS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}
