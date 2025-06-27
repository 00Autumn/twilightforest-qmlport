package net.quiltmc.users.autumn.twilightforest;

import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;
import net.quiltmc.users.autumn.twilightforest.init.block.TFBlocks;
import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.client.ClientModInitializer;

public class TwilightforestClient implements ClientModInitializer {
	@Override
	public void onInitializeClient(ModContainer modContainer) {
		BlockRenderLayerMap.INSTANCE.putBlock(TFBlocks.KNIGHTMETAL_BLOCK, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(TFBlocks.ANTIBUILT_BLOCK, RenderLayer.getCutout());
	}
}
