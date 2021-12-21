package me.stevenplayzz.skinnedlanterns;

import me.stevenplayzz.skinnedlanterns.block.SkinnedLanternBlocks;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.client.render.RenderLayer;

public class SkinnedLanternsClient implements ClientModInitializer {
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getTranslucent(),
                SkinnedLanternBlocks.PUFFERFISH_LANTERN_BLOCK,
                SkinnedLanternBlocks.PUFFERFISH_SOUL_LANTERN_BLOCK,

                SkinnedLanternBlocks.HONEY_LANTERN_BLOCK,
                SkinnedLanternBlocks.HONEY_SOUL_LANTERN_BLOCK,
                SkinnedLanternBlocks.SLIME_LANTERN_BLOCK,
                SkinnedLanternBlocks.SLIME_SOUL_LANTERN_BLOCK,
                SkinnedLanternBlocks.BEE_LANTERN_BLOCK,
                SkinnedLanternBlocks.BEE_SOUL_LANTERN_BLOCK
        );
        if (FabricLoader.getInstance().isModLoaded("jellyfishing")) {
            BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(),
                    SkinnedLanternBlocks.JELLYFISH_LANTERN_BLOCK,
                    SkinnedLanternBlocks.JELLYFISH_SOUL_LANTERN_BLOCK,
                    SkinnedLanternBlocks.BLUE_JELLYFISH_LANTERN_BLOCK,
                    SkinnedLanternBlocks.BLUE_JELLYFISH_SOUL_LANTERN_BLOCK
            );
        }

        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(),
                SkinnedLanternBlocks.ZOMBIE_LANTERN_BLOCK,
                SkinnedLanternBlocks.ZOMBIE_SOUL_LANTERN_BLOCK,
                SkinnedLanternBlocks.CREEPER_LANTERN_BLOCK,
                SkinnedLanternBlocks.CREEPER_SOUL_LANTERN_BLOCK,
                SkinnedLanternBlocks.SKELETON_LANTERN_BLOCK,
                SkinnedLanternBlocks.SKELETON_SOUL_LANTERN_BLOCK,
                SkinnedLanternBlocks.WITHER_SKELETON_LANTERN_BLOCK,
                SkinnedLanternBlocks.WITHER_SKELETON_SOUL_LANTERN_BLOCK,
                SkinnedLanternBlocks.JACK_O_LANTERN_LANTERN_BLOCK,
                SkinnedLanternBlocks.JACK_O_LANTERN_SOUL_LANTERN_BLOCK,
                SkinnedLanternBlocks.PAPER_WHITE_LANTERN_BLOCK,
                SkinnedLanternBlocks.PAPER_WHITE_SOUL_LANTERN_BLOCK,
                SkinnedLanternBlocks.GHOST_LANTERN_BLOCK,
                SkinnedLanternBlocks.GHOST_SOUL_LANTERN_BLOCK,
                SkinnedLanternBlocks.BLINKY_LANTERN_BLOCK,
                SkinnedLanternBlocks.BLINKY_SOUL_LANTERN_BLOCK,
                SkinnedLanternBlocks.PINKY_LANTERN_BLOCK,
                SkinnedLanternBlocks.PINKY_SOUL_LANTERN_BLOCK,
                SkinnedLanternBlocks.INKY_LANTERN_BLOCK,
                SkinnedLanternBlocks.INKY_SOUL_LANTERN_BLOCK,
                SkinnedLanternBlocks.CLYDE_LANTERN_BLOCK,
                SkinnedLanternBlocks.CLYDE_SOUL_LANTERN_BLOCK,
                SkinnedLanternBlocks.PACMAN_LANTERN_BLOCK,
                SkinnedLanternBlocks.PACMAN_SOUL_LANTERN_BLOCK,
                SkinnedLanternBlocks.GUARDIAN_LANTERN_BLOCK,
                SkinnedLanternBlocks.GUARDIAN_SOUL_LANTERN_BLOCK,
                SkinnedLanternBlocks.PAPER_YELLOW_LANTERN_BLOCK,
                SkinnedLanternBlocks.PAPER_YELLOW_SOUL_LANTERN_BLOCK,
                SkinnedLanternBlocks.PAPER_ORANGE_LANTERN_BLOCK,
                SkinnedLanternBlocks.PAPER_ORANGE_SOUL_LANTERN_BLOCK,
                SkinnedLanternBlocks.PAPER_BLUE_LANTERN_BLOCK,
                SkinnedLanternBlocks.PAPER_BLUE_SOUL_LANTERN_BLOCK,
                SkinnedLanternBlocks.PAPER_LIGHT_BLUE_LANTERN_BLOCK,
                SkinnedLanternBlocks.PAPER_LIGHT_BLUE_SOUL_LANTERN_BLOCK,
                SkinnedLanternBlocks.PAPER_CYAN_LANTERN_BLOCK,
                SkinnedLanternBlocks.PAPER_CYAN_SOUL_LANTERN_BLOCK,
                SkinnedLanternBlocks.PAPER_LIME_LANTERN_BLOCK,
                SkinnedLanternBlocks.PAPER_LIME_SOUL_LANTERN_BLOCK,
                SkinnedLanternBlocks.PAPER_GREEN_LANTERN_BLOCK,
                SkinnedLanternBlocks.PAPER_GREEN_SOUL_LANTERN_BLOCK,
                SkinnedLanternBlocks.PAPER_LANTERN_BLOCK,
                SkinnedLanternBlocks.PAPER_SOUL_LANTERN_BLOCK,
                SkinnedLanternBlocks.PAPER_PINK_LANTERN_BLOCK,
                SkinnedLanternBlocks.PAPER_PINK_SOUL_LANTERN_BLOCK,
                SkinnedLanternBlocks.PAPER_BROWN_LANTERN_BLOCK,
                SkinnedLanternBlocks.PAPER_BROWN_SOUL_LANTERN_BLOCK,
                SkinnedLanternBlocks.PAPER_BLACK_LANTERN_BLOCK,
                SkinnedLanternBlocks.PAPER_BLACK_SOUL_LANTERN_BLOCK,
                SkinnedLanternBlocks.PAPER_GRAY_LANTERN_BLOCK,
                SkinnedLanternBlocks.PAPER_GRAY_SOUL_LANTERN_BLOCK,
                SkinnedLanternBlocks.PAPER_LIGHT_GRAY_LANTERN_BLOCK,
                SkinnedLanternBlocks.PAPER_LIGHT_GRAY_SOUL_LANTERN_BLOCK,
                SkinnedLanternBlocks.PAPER_MAGENTA_LANTERN_BLOCK,
                SkinnedLanternBlocks.PAPER_MAGENTA_SOUL_LANTERN_BLOCK,
                SkinnedLanternBlocks.PAPER_PURPLE_LANTERN_BLOCK,
                SkinnedLanternBlocks.PAPER_PURPLE_SOUL_LANTERN_BLOCK,
                SkinnedLanternBlocks.PAPER_BLUE_LANTERN_BLOCK,
                SkinnedLanternBlocks.PAPER_BLUE_SOUL_LANTERN_BLOCK,
                SkinnedLanternBlocks.PAPER_LIGHT_BLUE_LANTERN_BLOCK,
                SkinnedLanternBlocks.PAPER_LIGHT_BLUE_SOUL_LANTERN_BLOCK,
                SkinnedLanternBlocks.PAPER_CYAN_LANTERN_BLOCK,
                SkinnedLanternBlocks.PAPER_CYAN_SOUL_LANTERN_BLOCK,
                SkinnedLanternBlocks.PAPER_LIME_LANTERN_BLOCK,
                SkinnedLanternBlocks.PAPER_LIME_SOUL_LANTERN_BLOCK,
                SkinnedLanternBlocks.PAPER_GREEN_LANTERN_BLOCK,
                SkinnedLanternBlocks.PAPER_GREEN_SOUL_LANTERN_BLOCK,
                SkinnedLanternBlocks.PAPER_LANTERN_BLOCK,
                SkinnedLanternBlocks.PAPER_SOUL_LANTERN_BLOCK,
                SkinnedLanternBlocks.PAPER_PINK_LANTERN_BLOCK,
                SkinnedLanternBlocks.PAPER_PINK_SOUL_LANTERN_BLOCK,
                SkinnedLanternBlocks.PAPER_BROWN_LANTERN_BLOCK,
                SkinnedLanternBlocks.PAPER_BROWN_SOUL_LANTERN_BLOCK,
                SkinnedLanternBlocks.PAPER_BLACK_LANTERN_BLOCK,
                SkinnedLanternBlocks.PAPER_BLACK_SOUL_LANTERN_BLOCK,
                SkinnedLanternBlocks.PAPER_GRAY_LANTERN_BLOCK,
                SkinnedLanternBlocks.PAPER_GRAY_SOUL_LANTERN_BLOCK,
                SkinnedLanternBlocks.PAPER_LIGHT_GRAY_LANTERN_BLOCK,
                SkinnedLanternBlocks.PAPER_LIGHT_GRAY_SOUL_LANTERN_BLOCK,
                SkinnedLanternBlocks.PAPER_MAGENTA_LANTERN_BLOCK,
                SkinnedLanternBlocks.PAPER_MAGENTA_SOUL_LANTERN_BLOCK,
                SkinnedLanternBlocks.PAPER_PURPLE_LANTERN_BLOCK,
                SkinnedLanternBlocks.PAPER_PURPLE_SOUL_LANTERN_BLOCK,
                SkinnedLanternBlocks.ORNAMENT_RED_LANTERN_BLOCK,
                SkinnedLanternBlocks.ORNAMENT_RED_SOUL_LANTERN_BLOCK,
                SkinnedLanternBlocks.ORNAMENT_BLUE_LANTERN_BLOCK,
                SkinnedLanternBlocks.ORNAMENT_BLUE_SOUL_LANTERN_BLOCK,
                SkinnedLanternBlocks.ORNAMENT_PURPLE_LANTERN_BLOCK,
                SkinnedLanternBlocks.ORNAMENT_PURPLE_SOUL_LANTERN_BLOCK,
                SkinnedLanternBlocks.ORNAMENT_LIME_LANTERN_BLOCK,
                SkinnedLanternBlocks.ORNAMENT_LIME_SOUL_LANTERN_BLOCK,
                SkinnedLanternBlocks.ORNAMENT_MAGENTA_LANTERN_BLOCK,
                SkinnedLanternBlocks.ORNAMENT_MAGENTA_SOUL_LANTERN_BLOCK,
                SkinnedLanternBlocks.ORNAMENT_YELLOW_LANTERN_BLOCK,
                SkinnedLanternBlocks.ORNAMENT_YELLOW_SOUL_LANTERN_BLOCK,
                SkinnedLanternBlocks.ORNAMENT_GREEN_LANTERN_BLOCK,
                SkinnedLanternBlocks.ORNAMENT_GREEN_SOUL_LANTERN_BLOCK,
                SkinnedLanternBlocks.ORNAMENT_LIGHT_BLUE_LANTERN_BLOCK,
                SkinnedLanternBlocks.ORNAMENT_LIGHT_BLUE_SOUL_LANTERN_BLOCK,
                SkinnedLanternBlocks.ORNAMENT_CYAN_LANTERN_BLOCK,
                SkinnedLanternBlocks.ORNAMENT_CYAN_SOUL_LANTERN_BLOCK,
                SkinnedLanternBlocks.ORNAMENT_PINK_LANTERN_BLOCK,
                SkinnedLanternBlocks.ORNAMENT_PINK_SOUL_LANTERN_BLOCK,
                SkinnedLanternBlocks.ORNAMENT_ORANGE_LANTERN_BLOCK,
                SkinnedLanternBlocks.ORNAMENT_ORANGE_SOUL_LANTERN_BLOCK,
                SkinnedLanternBlocks.ORNAMENT_BROWN_LANTERN_BLOCK,
                SkinnedLanternBlocks.ORNAMENT_BROWN_SOUL_LANTERN_BLOCK,
                SkinnedLanternBlocks.ORNAMENT_BLACK_LANTERN_BLOCK,
                SkinnedLanternBlocks.ORNAMENT_BLACK_SOUL_LANTERN_BLOCK,
                SkinnedLanternBlocks.ORNAMENT_WHITE_LANTERN_BLOCK,
                SkinnedLanternBlocks.ORNAMENT_WHITE_SOUL_LANTERN_BLOCK,
                SkinnedLanternBlocks.ORNAMENT_GRAY_LANTERN_BLOCK,
                SkinnedLanternBlocks.ORNAMENT_GRAY_SOUL_LANTERN_BLOCK,
                SkinnedLanternBlocks.ORNAMENT_LIGHT_GRAY_LANTERN_BLOCK,
                SkinnedLanternBlocks.ORNAMENT_LIGHT_GRAY_SOUL_LANTERN_BLOCK,
                SkinnedLanternBlocks.PRESENT_GREEN_LANTERN_BLOCK,
                SkinnedLanternBlocks.PRESENT_GREEN_SOUL_LANTERN_BLOCK,
                SkinnedLanternBlocks.PRESENT_RED_LANTERN_BLOCK,
                SkinnedLanternBlocks.PRESENT_RED_SOUL_LANTERN_BLOCK,
                SkinnedLanternBlocks.SNOWMAN_LANTERN_BLOCK,
                SkinnedLanternBlocks.SNOWMAN_SOUL_LANTERN_BLOCK
        );
        if (FabricLoader.getInstance().isModLoaded("botania")) {
            BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(),
                    SkinnedLanternBlocks.TINY_POTATO_LANTERN_BLOCK,
                    SkinnedLanternBlocks.TINY_POTATO_SOUL_LANTERN_BLOCK
            );
        }
    }
}