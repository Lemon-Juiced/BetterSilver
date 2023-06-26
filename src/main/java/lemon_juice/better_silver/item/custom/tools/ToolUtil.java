package lemon_juice.better_silver.item.custom.tools;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.animal.horse.SkeletonHorse;
import net.minecraft.world.entity.animal.horse.ZombieHorse;
import net.minecraft.world.entity.boss.wither.WitherBoss;
import net.minecraft.world.entity.monster.*;

public class ToolUtil {
    public static boolean isUndead(Entity entity){
        if(entity instanceof Phantom || isSkeleton(entity) || isZombie(entity)) return true;
        else return false;
    }

    public static boolean isSkeleton(Entity entity){
        if(entity instanceof Skeleton || entity instanceof SkeletonHorse || entity instanceof Stray || entity instanceof WitherBoss || entity instanceof WitherSkeleton) return true;
        else return false;
    }

    public static boolean isZombie(Entity entity){
        if(entity instanceof Drowned || entity instanceof Husk || entity instanceof Zoglin || entity instanceof Zombie || entity instanceof ZombieHorse || entity instanceof ZombieVillager || entity instanceof ZombifiedPiglin) return true;
        else return false;
    }
}
