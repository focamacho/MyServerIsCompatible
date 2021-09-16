package com.focamacho.myserveriscompatible.mixin;

import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.gui.screens.multiplayer.JoinMultiplayerScreen;
import net.minecraft.client.multiplayer.ServerData;
import net.minecraftforge.fmlclient.ClientHooks;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(value = ClientHooks.class, remap = false)
public class MixinClientHooks {

    /**
     * @author MyServerIsCompatible
     * @reason Disable Forge's enhanced server list
     */
    @Overwrite
    public static void drawForgePingInfo(JoinMultiplayerScreen gui, ServerData target, PoseStack mStack, int x, int y, int width, int relativeMouseX, int relativeMouseY) {}

}
