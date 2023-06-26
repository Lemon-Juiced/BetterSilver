package lemon_juice.better_silver.creativetab;

import lemon_juice.better_silver.BetterSilver;
import lemon_juice.better_silver.block.ModBlocks;
import lemon_juice.better_silver.item.ModItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, BetterSilver.MOD_ID);

    public static final RegistryObject<CreativeModeTab> BETTER_SILVER_TAB = CREATIVE_MODE_TABS.register("better_silver", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.better_silver"))
            .icon(() -> new ItemStack(ModItems.SILVER_SWORD.get()))
            .build());

    public static void registerTabs(BuildCreativeModeTabContentsEvent event) {
        if (event.getTab() == BETTER_SILVER_TAB.get()) {
            event.accept(ModItems.SILVER_SWORD.get());
            event.accept(ModItems.SILVER_SHOVEL.get());
            event.accept(ModItems.SILVER_PICKAXE.get());
            event.accept(ModItems.SILVER_AXE.get());
            event.accept(ModItems.SILVER_HOE.get());

            event.accept(ModItems.SILVER_HELMET.get());
            event.accept(ModItems.SILVER_CHESTPLATE.get());
            event.accept(ModItems.SILVER_LEGGINGS.get());
            event.accept(ModItems.SILVER_BOOTS.get());

            event.accept(ModItems.RAW_SILVER.get());

            event.accept(ModBlocks.SILVER_ORE.get());
            event.accept(ModBlocks.DEEPSLATE_SILVER_ORE.get());
            event.accept(ModBlocks.RAW_SILVER_BLOCK.get());
        }
    }

    /******************************** Registry ********************************/
    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
