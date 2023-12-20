package lemon_juice.better_silver.tags;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class BetterSilverTags {
    public static void init() {
        Items.init();
    }

    private BetterSilverTags() {}

    public static class Items {
        private static void init() {}
        private Items() {}

        public static final TagKey<Item> INGOTS_SILVER = forgeTag("ingots/silver");

        private static TagKey<Item> forgeTag(String name) {
            return ItemTags.create(new ResourceLocation("forge", name));
        }
    }
}
