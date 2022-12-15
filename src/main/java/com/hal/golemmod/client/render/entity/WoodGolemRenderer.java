package com.hal.golemmod.client.render.entity;

import com.hal.golemmod.GolemMod;
import com.hal.golemmod.client.render.entity.model.GolemModelLayers;
import com.hal.golemmod.client.render.entity.model.WoodGolemModel;
import com.hal.golemmod.entities.WoodGolem;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.math.Vector3f;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class WoodGolemRenderer extends MobRenderer<WoodGolem, EntityModel<WoodGolem>> {
    private static final ResourceLocation LOCATION = new ResourceLocation(GolemMod.MOD_ID, "textures/entity/wood_golem/wood_golem.png");
    private static final float SHADOW_RADIUS = 0.7F;

    public WoodGolemRenderer(EntityRendererProvider.Context context) {
        super(context, new WoodGolemModel(context.bakeLayer(GolemModelLayers.WOOD_GOLEM)), SHADOW_RADIUS);
    }

    @Override
    public ResourceLocation getTextureLocation(WoodGolem woodGolem) {
        return LOCATION;
    }

}
