package net.mavity.slabs_build_additions.blocktypes;

import com.mojang.serialization.MapCodec;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.phys.shapes.BooleanOp;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

import java.util.Optional;
import java.util.stream.Stream;

public class VSlabClass extends HorizontalDirectionalBlock {
    public VSlabClass(Properties properties) {
        super(properties);
    }
    public static final MapCodec<VSlabClass> CODEC = simpleCodec(VSlabClass::new);
    @Override
    protected MapCodec<? extends HorizontalDirectionalBlock> codec() {
        return CODEC;
    }
    private static final Optional<VoxelShape> SHAPE = Stream
            .of(Block.box(0, 8, 0, 16, 16, 8), Block.box(0, 0, 0, 16, 8, 8))
            .reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR));
}