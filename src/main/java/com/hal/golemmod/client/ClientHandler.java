package com.hal.golemmod.client;


import com.hal.golemmod.GolemMod;
import com.hal.golemmod.client.render.entity.WoodGolemRenderer;
import com.hal.golemmod.client.render.entity.model.GolemModelLayers;
import com.hal.golemmod.client.render.entity.model.WoodGolemModel;
import com.hal.golemmod.entities.GolemEntitiesInit;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = GolemMod.MOD_ID, value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ClientHandler {

    @SubscribeEvent
    public static void registerEntityRenders(EntityRenderersEvent.RegisterRenderers event) {
        event.registerEntityRenderer(GolemEntitiesInit.WOOD_GOLEM.get(), WoodGolemRenderer::new);
    }

    @SubscribeEvent
    public static void registerLayerDefinition(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(GolemModelLayers.WOOD_GOLEM, WoodGolemModel::createBodyLayer);
    }
}
