package xyz.qmc.ExplodeBowMod.enchantments;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.Enchantments;

public class BowPowerEnchantment extends Enchantment{

    public static final EnchantmentCategory BOW_ONLY =
            EnchantmentCategory.create("bow_only", item -> item == Items.BOW);

    public BowPowerEnchantment() {
        super(Rarity.UNCOMMON, BOW_ONLY, new EquipmentSlot[]{EquipmentSlot.MAINHAND});
    }

    @Override
    public int getMinCost(int level) {
        return 20;
    }

    @Override
    public int getMaxCost(int level) {
        return 50;
    }

    @Override
    public int getMaxLevel() {
        return 1;
    }

    @Override
    protected boolean checkCompatibility(Enchantment other) {
        if (other == Enchantments.FLAMING_ARROWS) {
            return false;
        }

        return super.checkCompatibility(other);
    }
}
