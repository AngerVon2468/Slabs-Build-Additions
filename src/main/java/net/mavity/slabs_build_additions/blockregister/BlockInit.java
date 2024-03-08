package net.mavity.slabs_build_additions.blockregister;

import net.mavity.slabs_build_additions.blocktypes.VSlabClass;
import net.mavity.slabs_build_additions.propertyregister.PropertyInit;
import net.mavity.slabs_build_additions.slabs_build_additions;
import net.minecraft.world.item.BlockItem;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import static net.mavity.slabs_build_additions.itemregister.ItemInit.ITEMS;

public class BlockInit {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(slabs_build_additions.MODID);
    public static final DeferredBlock<VSlabClass> VERTICAL_SLAB = BLOCKS.register("vertical_slab",
            () -> new VSlabClass(PropertyInit.SBA_VSLAB));
    public static final DeferredItem<BlockItem> VERTICAL_SLAB_ITEM = ITEMS.registerSimpleBlockItem("vertical_slab", VERTICAL_SLAB);
}