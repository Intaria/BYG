package potionstudios.byg.common.block;

import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Vec3i;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.tags.TagKey;
import net.minecraft.util.RandomSource;
import net.minecraft.util.random.SimpleWeightedRandomList;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.MushroomBlock;
import net.minecraft.world.level.block.state.BlockState;
import potionstudios.byg.common.block.sapling.GrowingPatterns;
import potionstudios.byg.util.FeatureGrowerFromBlockPattern;

import java.util.List;

public class BYGMushroomBlock extends MushroomBlock implements FeatureGrowerFromBlockPattern {

    private ImmutableList<Pair<List<Vec3i>, SimpleWeightedRandomList<GrowingPatterns.FeatureSpawner>>> patternsToSpawner = ImmutableList.of();
    private final TagKey<Block> groundTag;

    public BYGMushroomBlock(Properties $$0, TagKey<Block> groundTag) {
        super($$0, null);
        this.groundTag = groundTag;
        ENTRIES.add(() -> this);
    }

    @Override
    protected boolean mayPlaceOn(BlockState state, BlockGetter blockGetter, BlockPos pos) {
        return state.is(this.groundTag);
    }

    @Override
    public boolean growMushroom(ServerLevel serverLevel, BlockPos pos, BlockState state, RandomSource random) {
        return this.growFeature(this, serverLevel, pos, random);
    }

    @Override
    public ImmutableList<Pair<List<Vec3i>, SimpleWeightedRandomList<GrowingPatterns.FeatureSpawner>>> byg_getPatterns() {
        return this.patternsToSpawner;
    }

    @Override
    public void byg_setPatterns(ImmutableList<Pair<List<Vec3i>, SimpleWeightedRandomList<GrowingPatterns.FeatureSpawner>>> map) {
        this.patternsToSpawner = map;
    }
}
