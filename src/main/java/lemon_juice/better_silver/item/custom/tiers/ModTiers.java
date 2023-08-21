package lemon_juice.better_silver.item.custom.tiers;

import lemon_juice.better_silver.BetterSilver;
import lemon_juice.better_silver.tags.ModTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;

public class ModTiers {
    /* WOOD(0, 59, 2.0F, 0.0F, 15, () -> {return Ingredient.of(ItemTags.PLANKS);}),
     * STONE(1, 131, 4.0F, 1.0F, 5, () -> {return Ingredient.of(ItemTags.STONE_TOOL_MATERIALS);}),
     * IRON(2, 250, 6.0F, 2.0F, 14, () -> {return Ingredient.of(Items.IRON_INGOT);}),
     * DIAMOND(3, 1561, 8.0F, 3.0F, 10, () -> {return Ingredient.of(Items.DIAMOND);}),
     * GOLD(0, 32, 12.0F, 0.0F, 22, () -> {return Ingredient.of(Items.GOLD_INGOT);}),
     * NETHERITE(4, 2031, 9.0F, 4.0F, 15, () -> {return Ingredient.of(Items.NETHERITE_INGOT);});
     */

    public static final Tier SILVER_TIER = TierSortingRegistry.registerTier(new ForgeTier(2, 131, 12.0F, 1.0F,5, BlockTags.NEEDS_STONE_TOOL, () -> Ingredient.of(ModTags.Items.INGOTS_SILVER)), new ResourceLocation(BetterSilver.MOD_ID, "silver"), List.of(Tiers.WOOD), List.of(Tiers.IRON));
}
