package lemon_juice.better_silver.item.custom.tools;

import com.mojang.datafixers.util.Either;
import lemon_juice.better_silver.item.custom.tiers.ModTiers;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderOwner;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.damagesource.DamageType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.HoeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;

import static lemon_juice.better_silver.item.custom.tools.ToolUtil.isUndead;

public class SilverHoeItem extends HoeItem {
    public SilverHoeItem(Properties properties) {
        super(ModTiers.SILVER_TIER, -2, -1.0F, properties);
    }

    @Override
    public void appendHoverText(ItemStack itemStack, @Nullable Level level, List<Component> components, TooltipFlag tooltipFlag) {
        components.add(Component.translatable("tooltip.better_silver.effective_undead"));
    }

    @Override
    public boolean hurtEnemy(ItemStack itemStack, LivingEntity damagedEntity, LivingEntity userEntity) {
        Holder<DamageType> damageTypeHolder = new Holder<DamageType>() {
            @Override
            public DamageType value() {
                return null;
            }

            @Override
            public boolean isBound() {
                return false;
            }

            @Override
            public boolean is(ResourceLocation p_205713_) {
                return false;
            }

            @Override
            public boolean is(ResourceKey<DamageType> p_205712_) {
                return false;
            }

            @Override
            public boolean is(Predicate<ResourceKey<DamageType>> p_205711_) {
                return false;
            }

            @Override
            public boolean is(TagKey<DamageType> p_205705_) {
                return false;
            }

            @Override
            public Stream<TagKey<DamageType>> tags() {
                return null;
            }

            @Override
            public Either<ResourceKey<DamageType>, DamageType> unwrap() {
                return null;
            }

            @Override
            public Optional<ResourceKey<DamageType>> unwrapKey() {
                return Optional.empty();
            }

            @Override
            public Kind kind() {
                return null;
            }

            @Override
            public boolean canSerializeIn(HolderOwner<DamageType> p_255833_) {
                return false;
            }
        };

        if(isUndead(damagedEntity)){
            damagedEntity.hurt(new DamageSource(damageTypeHolder), 2.0F);
        }

        return super.hurtEnemy(itemStack, damagedEntity, userEntity);
    }
}
