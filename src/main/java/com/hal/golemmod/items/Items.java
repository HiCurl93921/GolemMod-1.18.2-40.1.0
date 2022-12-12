package com.hal.golemmod.items;

import com.hal.golemmod.GolemMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class Items {
    private static final DeferredRegister<Item> ITEMS
            = DeferredRegister.create(ForgeRegistries.ITEMS, GolemMod.MOD_ID);

    /**
     * ゴーレムコア
     */
    public static final RegistryObject<Item> GOLEM_CORE
            = registerItem("golem_core",
            () -> new GolemCore(new Item.Properties().tab(GolemMod.TAB)));


    /**
     * ゴーレムハート
     */
    public static final RegistryObject<Item> GOLEM_HEART
            = registerItem("golem_heart",
            () -> new GolemHeart(new Item.Properties().tab(GolemMod.TAB)));

    public static RegistryObject<Item> registerItem(String name, Supplier<Item> initializer) {
        return ITEMS.register(name, initializer);
    }

    /**
     * アイテムをイベントバスに登録
     * @param eventBus MODイベントバス
     */
    public static void registerItems(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}