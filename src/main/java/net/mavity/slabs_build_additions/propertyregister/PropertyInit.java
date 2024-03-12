package net.mavity.slabs_build_additions.propertyregister;

import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;

public class PropertyInit {
    public static final BlockBehaviour.Properties SBA_VSLAB = BlockBehaviour.Properties.of()
            .noOcclusion()
            .mapColor(MapColor.STONE)
            .strength(0.5f, 2f)
            .sound(SoundType.WOOD);
    public static final Item.Properties GENERIC_ITEMTYPE_SBA =
            new Item.Properties().stacksTo(1).durability(0).fireResistant();
}