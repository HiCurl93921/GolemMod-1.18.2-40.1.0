package com.hal.golemmod.entities;

import com.hal.golemmod.GolemMod;
import com.hal.golemmod.items.Items;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

@Mod.EventBusSubscriber(modid = GolemMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public final class EntityTypes {
    public static final DeferredRegister<EntityType<?>> ENTITIES
            = DeferredRegister.create(ForgeRegistries.ENTITIES, GolemMod.MOD_ID);

    public static final RegistryObject<EntityType<WoodGolem>> WOOD_GOLEM
            = register("wood_golem",
            () -> EntityType.Builder.of(
                    WoodGolem::new,
                    MobCategory.MISC)
                    .sized(1.4F, 2.7F)
                    .clientTrackingRange(10));

    private static <T extends Entity> RegistryObject<EntityType<T>> register(String name, Supplier<EntityType.Builder<T>> builder) {
        ResourceLocation location = new ResourceLocation(GolemMod.MOD_ID, name);
        return ENTITIES.register(name, () -> builder.get().build(location.toString()));
    }

    private static <T extends Mob> RegistryObject<EntityType<T>> registerMob(String name, int eggPrimary, int eggSecondary, Supplier<EntityType.Builder<T>> builder) {
        RegistryObject<EntityType<T>> entityType = register(name, builder);
        Items.registerItem( name + "_spawn_egg",
                () -> new ForgeSpawnEggItem(entityType, eggPrimary, eggSecondary,
                        (new Item.Properties()).tab(CreativeModeTab.TAB_MISC)));
        return entityType;
    }
}
