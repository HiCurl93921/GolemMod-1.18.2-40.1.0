package com.hal.golemmod;

import com.hal.golemmod.items.CreativeTab;
import com.hal.golemmod.items.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(GolemMod.MOD_ID)
public class GolemMod {
    public static final String MOD_ID = "golemmod";
    public static final CreativeTab TAB = new CreativeTab(MOD_ID);

    public GolemMod() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        // アイテム登録
        Items.register(modEventBus);
    }
}
