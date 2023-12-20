package lemon_juice.better_silver.item;

import lemon_juice.better_silver.BetterSilver;
import lemon_juice.better_silver.item.custom.tiers.BetterSilverArmorMaterials;
import lemon_juice.better_silver.item.custom.tools.*;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class BetterSilverItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(BetterSilver.MOD_ID);

    public static final DeferredItem<Item> RAW_SILVER = ITEMS.register("raw_silver", () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> SILVER_SWORD = ITEMS.register("silver_sword", () -> new SilverSwordItem(new Item.Properties()));
    public static final DeferredItem<Item> SILVER_SHOVEL = ITEMS.register("silver_shovel", () -> new SilverShovelItem(new Item.Properties()));
    public static final DeferredItem<Item> SILVER_PICKAXE = ITEMS.register("silver_pickaxe", () -> new SilverPickaxeItem(new Item.Properties()));
    public static final DeferredItem<Item> SILVER_AXE = ITEMS.register("silver_axe", () -> new SilverAxeItem(new Item.Properties()));
    public static final DeferredItem<Item> SILVER_HOE = ITEMS.register("silver_hoe", () -> new SilverHoeItem(new Item.Properties()));
    public static final DeferredItem<Item> SILVER_HELMET = ITEMS.register("silver_helmet", () -> new ArmorItem(BetterSilverArmorMaterials.SILVER, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final DeferredItem<Item> SILVER_CHESTPLATE = ITEMS.register("silver_chestplate", () -> new ArmorItem(BetterSilverArmorMaterials.SILVER, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final DeferredItem<Item> SILVER_LEGGINGS = ITEMS.register("silver_leggings", () -> new ArmorItem(BetterSilverArmorMaterials.SILVER, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final DeferredItem<Item> SILVER_BOOTS = ITEMS.register("silver_boots", () -> new ArmorItem(BetterSilverArmorMaterials.SILVER, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
