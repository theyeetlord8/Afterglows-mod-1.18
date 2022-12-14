package net.afterglow.afterglows.world.dimension;

import net.afterglow.afterglows.AfterglowsMod;
import net.afterglow.afterglows.item.ModItems;
import net.fabricmc.fabric.api.event.player.PlayerBlockBreakEvents;
import net.kyrptonaught.customportalapi.api.CustomPortalBuilder;
import net.minecraft.block.Blocks;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.World;
import net.minecraft.world.dimension.DimensionType;


import java.awt.*;

public class ModDimensions {
    public static final RegistryKey<World> HF_DIMENSION_KEY = RegistryKey.of(Registry.WORLD_KEY,
           new Identifier(AfterglowsMod.MOD_ID, "hfdim"));
    public static final RegistryKey<DimensionType> HF_TYPE_KEY = RegistryKey.of(Registry.DIMENSION_TYPE_KEY, HF_DIMENSION_KEY.getValue());

    public static void register() {
        AfterglowsMod.LOGGER.debug("Registering ModDimensions for " + AfterglowsMod.MOD_ID);

        CustomPortalBuilder.beginPortal()
                .frameBlock(Blocks.DIAMOND_BLOCK)
                .destDimID(HF_DIMENSION_KEY.getValue())
                .tintColor(102, 102, 102)
                .lightWithItem(ModItems.HIGH_FREQUENCY_BLADE)
                .registerPortal();

    }
}
