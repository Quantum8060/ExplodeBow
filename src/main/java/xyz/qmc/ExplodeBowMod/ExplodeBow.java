package xyz.qmc.ExplodeBowMod;


import xyz.qmc.ExplodeBowMod.enchantments.ModEnchantments;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.eventbus.api.IEventBus;


@Mod(ExplodeBow.MODID)
public class ExplodeBow {

    public static final String MODID = "explodebow";


    public ExplodeBow() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModEnchantments.register();


    }

}