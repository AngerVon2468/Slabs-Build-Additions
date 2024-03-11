package net.mavity.slabs_build_additions.propertyregister;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;

public class PropertyInit {
    public static final BlockBehaviour.Properties SBA_VSLAB = BlockBehaviour.Properties.of()
            .noOcclusion()
            .mapColor(MapColor.STONE)
            .strength(2f, 2f);
}