package net.afterglow.afterglows.world.feature;

import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.feature.PlacedFeatures;
import net.minecraft.world.gen.placementmodifier.HeightRangePlacementModifier;

public class ModPlacedFeatures {
    public static final RegistryEntry<PlacedFeature> HIGH_FREQUENCY_ORE_PLACED = PlacedFeatures.register("mythril_ore_placed",
            ModConfiguredFeatures.HIGH_FREQUENCY_ORE, ModOreFeatures.modifiersWithCount(7,
                    HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(-64), YOffset.aboveBottom(128))));
}
