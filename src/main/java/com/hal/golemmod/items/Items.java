package com.hal.golemmod.items;

import com.hal.golemmod.GolemMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class Items {
    private static final DeferredRegister<Item> ITEMS
            = DeferredRegister.create(ForgeRegistries.ITEMS, GolemMod.MOD_ID);

    /**
     * ゴーレムハート
     */
    public static final RegistryObject<Item> GOLEM_CORE
            = ITEMS.register("golem_core",
            () -> new GolemCore(new Item.Properties().tab(GolemMod.TAB)));


    /**
     * ゴーレムハート
     */
    public static final RegistryObject<Item> GOLEM_HEART
            = ITEMS.register("golem_heart",
            () -> new GolemHeart(new Item.Properties().tab(GolemMod.TAB)));

    /**
     * アイテム登録
     * @param eventBus MODイベントバス
     */
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}