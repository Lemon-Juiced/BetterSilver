package lemon_juice.better_silver;

import lemon_juice.better_silver.block.BetterSilverBlocks;
import lemon_juice.better_silver.creativetab.BetterSilverCreativeTab;
import lemon_juice.better_silver.item.BetterSilverItems;
import lemon_juice.better_silver.tags.BetterSilverTags;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.server.ServerStartingEvent;

@Mod(BetterSilver.MOD_ID)
public class BetterSilver {
    public static final String MOD_ID = "better_silver";

    public BetterSilver(IEventBus modEventBus) {
        modEventBus.addListener(this::commonSetup);

        // Register Items & Blocks
        BetterSilverItems.register(modEventBus);
        BetterSilverBlocks.register(modEventBus);

        // Register Creative Tab
        BetterSilverCreativeTab.register(modEventBus);
        modEventBus.addListener(BetterSilverCreativeTab::registerTabs);

        // Register Tags
        BetterSilverTags.init();

        NeoForge.EVENT_BUS.register(this);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {}

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {}

    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {}
    }
}
