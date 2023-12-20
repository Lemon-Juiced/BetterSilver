package lemon_juice.better_silver.creativetab;

import lemon_juice.better_silver.BetterSilver;
import lemon_juice.better_silver.block.BetterSilverBlocks;
import lemon_juice.better_silver.item.BetterSilverItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class BetterSilverCreativeTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, BetterSilver.MOD_ID);

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> BETTER_SILVER_TAB = CREATIVE_MODE_TABS.register("better_silver", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.better_silver"))
            .icon(() -> new ItemStack(BetterSilverItems.SILVER_SWORD.get()))
            .build());

    public static void registerTabs(BuildCreativeModeTabContentsEvent event) {
        if (event.getTab() == BETTER_SILVER_TAB.get()) {
            event.accept(BetterSilverItems.SILVER_SWORD.get());
            event.accept(BetterSilverItems.SILVER_SHOVEL.get());
            event.accept(BetterSilverItems.SILVER_PICKAXE.get());
            event.accept(BetterSilverItems.SILVER_AXE.get());
            event.accept(BetterSilverItems.SILVER_HOE.get());

            event.accept(BetterSilverItems.SILVER_HELMET.get());
            event.accept(BetterSilverItems.SILVER_CHESTPLATE.get());
            event.accept(BetterSilverItems.SILVER_LEGGINGS.get());
            event.accept(BetterSilverItems.SILVER_BOOTS.get());

            event.accept(BetterSilverItems.RAW_SILVER.get());

            event.accept(BetterSilverBlocks.SILVER_ORE.get());
            event.accept(BetterSilverBlocks.DEEPSLATE_SILVER_ORE.get());
            event.accept(BetterSilverBlocks.RAW_SILVER_BLOCK.get());
        }
    }

    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
