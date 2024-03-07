package net.mavity.slabs_build_additions.blockregister;

import net.mavity.slabs_build_additions.slabs_build_additions;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import static net.mavity.slabs_build_additions.itemregister.ItemInit.ITEMS;

public class BlockInit {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(slabs_build_additions.MODID);
    public static final DeferredBlock<Block> VERTICAL_SLAB = BLOCKS.registerSimpleBlock("vertical_slab", BlockBehaviour.Properties.of().noOcclusion().mapColor(MapColor.STONE));
    public static final DeferredItem<BlockItem> VERTICAL_SLAB_ITEM = ITEMS.registerSimpleBlockItem("vertical_slab", VERTICAL_SLAB);
}