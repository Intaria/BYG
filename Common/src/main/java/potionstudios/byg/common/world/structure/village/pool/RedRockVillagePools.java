package potionstudios.byg.common.world.structure.village.pool;

import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;
import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.Pools;
import net.minecraft.data.worldgen.ProcessorLists;
import net.minecraft.data.worldgen.placement.VillagePlacements;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.structure.pools.StructurePoolElement;
import net.minecraft.world.level.levelgen.structure.pools.StructureTemplatePool;
import potionstudios.byg.BYG;

public class RedRockVillagePools {
    public static final Holder<StructureTemplatePool> RED_ROCK_VILLAGE_JIGSAW = Pools.register(new StructureTemplatePool(BYG.createLocation("village/red_rock/town_centers"),
        new ResourceLocation("empty"),
        ImmutableList.of(Pair.of(StructurePoolElement.legacy("byg:village/red_rock/town_centers/red_rock_meeting_point_1", ProcessorLists.MOSSIFY_10_PERCENT), 35),
            Pair.of(StructurePoolElement.legacy("byg:village/red_rock/town_centers/red_rock_meeting_point_2", ProcessorLists.MOSSIFY_10_PERCENT), 35),
            Pair.of(StructurePoolElement.legacy("byg:village/red_rock/town_centers/red_rock_meeting_point_3", ProcessorLists.MOSSIFY_10_PERCENT), 35)), StructureTemplatePool.Projection.RIGID));

    static {
        //Normal
        Pools.register(new StructureTemplatePool(BYG.createLocation("village/red_rock/streets"),
            BYG.createLocation("village/red_rock/terminators"),
            ImmutableList.of(Pair.of(StructurePoolElement.legacy("byg:village/red_rock/streets/red_rock_corner_01"), 3),
                Pair.of(StructurePoolElement.legacy("byg:village/red_rock/streets/red_rock_corner_02"), 3),
                Pair.of(StructurePoolElement.legacy("byg:village/red_rock/streets/red_rock_straight_01"), 4),
                Pair.of(StructurePoolElement.legacy("byg:village/red_rock/streets/red_rock_straight_02"), 4),
                Pair.of(StructurePoolElement.legacy("byg:village/red_rock/streets/red_rock_straight_03"), 3),
                Pair.of(StructurePoolElement.legacy("byg:village/red_rock/streets/red_rock_crossroad_01"), 3),
                Pair.of(StructurePoolElement.legacy("byg:village/red_rock/streets/red_rock_crossroad_02"), 3),
                Pair.of(StructurePoolElement.legacy("byg:village/red_rock/streets/red_rock_crossroad_03"), 3),
                Pair.of(StructurePoolElement.legacy("byg:village/red_rock/streets/red_rock_square_01"), 3),
                Pair.of(StructurePoolElement.legacy("byg:village/red_rock/streets/red_rock_square_02"), 3),
                Pair.of(StructurePoolElement.legacy("byg:village/red_rock/streets/red_rock_turn_01"), 3)), StructureTemplatePool.Projection.TERRAIN_MATCHING));

        Pools.register(new StructureTemplatePool(BYG.createLocation("village/red_rock/houses"),
            BYG.createLocation("village/red_rock/terminators"),
            ImmutableList.of(Pair.of(StructurePoolElement.legacy("byg:village/red_rock/houses/red_rock_small_house_1"), 3),
                Pair.of(StructurePoolElement.legacy("byg:village/red_rock/houses/red_rock_small_house_2"), 3),
                Pair.of(StructurePoolElement.legacy("byg:village/red_rock/houses/red_rock_small_house_3"), 3),
                Pair.of(StructurePoolElement.legacy("byg:village/red_rock/houses/red_rock_small_house_4"), 3),
                Pair.of(StructurePoolElement.legacy("byg:village/red_rock/houses/red_rock_small_house_5"), 3),
                Pair.of(StructurePoolElement.legacy("byg:village/red_rock/houses/red_rock_medium_house_1"), 3),
                Pair.of(StructurePoolElement.legacy("byg:village/red_rock/houses/red_rock_medium_house_2"), 3),
                Pair.of(StructurePoolElement.legacy("byg:village/red_rock/houses/red_rock_large_house_1"), 4),
                Pair.of(StructurePoolElement.legacy("byg:village/red_rock/houses/red_rock_shepherd_house_1"), 3),
                Pair.of(StructurePoolElement.legacy("byg:village/red_rock/houses/red_rock_mason_1"), 3),
                Pair.of(StructurePoolElement.legacy("byg:village/red_rock/houses/red_rock_cleric"), 2),
                Pair.of(StructurePoolElement.legacy("byg:village/red_rock/houses/red_rock_market_1"), 2),
                Pair.of(StructurePoolElement.legacy("byg:village/red_rock/houses/red_rock_market_2"), 2),
                Pair.of(StructurePoolElement.legacy("byg:village/red_rock/houses/red_rock_farm_large_1", ProcessorLists.FARM_DESERT), 4),
                Pair.of(StructurePoolElement.legacy("byg:village/red_rock/houses/red_rock_farm_small_1", ProcessorLists.FARM_DESERT), 3),
                Pair.of(StructurePoolElement.legacy("byg:village/red_rock/houses/red_rock_farm_small_2", ProcessorLists.FARM_DESERT), 3),
                Pair.of(StructurePoolElement.empty(), 10)), StructureTemplatePool.Projection.RIGID));

        Pools.register(new StructureTemplatePool(BYG.createLocation("village/red_rock/terminators"),
            new ResourceLocation("empty"),
            ImmutableList.of(Pair.of(StructurePoolElement.legacy("byg:village/red_rock/terminators/red_rock_terminator_01"), 1),
                Pair.of(StructurePoolElement.legacy("byg:village/red_rock/terminators/red_rock_terminator_02"), 1)), StructureTemplatePool.Projection.TERRAIN_MATCHING));

        Pools.register(new StructureTemplatePool(BYG.createLocation("village/red_rock/decor"),
            new ResourceLocation("empty"),
            ImmutableList.of(Pair.of(StructurePoolElement.legacy("byg:village/red_rock/red_rock_lamp_1"), 10),
                Pair.of(StructurePoolElement.feature(VillagePlacements.PILE_HAY_VILLAGE), 2),
                Pair.of(StructurePoolElement.empty(), 6)), StructureTemplatePool.Projection.RIGID));

        Pools.register(new StructureTemplatePool(BYG.createLocation("village/red_rock/villagers"),
            new ResourceLocation("empty"),
            ImmutableList.of(Pair.of(StructurePoolElement.legacy("byg:village/red_rock/villagers/baby"), 1),
                Pair.of(StructurePoolElement.legacy("byg:village/red_rock/villagers/baby"), 1),
                Pair.of(StructurePoolElement.legacy("byg:village/red_rock/villagers/unemployed"), 10)), StructureTemplatePool.Projection.RIGID));

//      //Zombie
//      JigsawPatternRegistry.register(new JigsawPattern(new ResourceLocation("village/desert/zombie/streets"), new ResourceLocation("village/desert/zombie/terminators"), ImmutableList.of(Pair.of(JigsawPiece.legacy("village/desert/zombie/streets/corner_01"), 3), Pair.of(JigsawPiece.legacy("village/desert/zombie/streets/corner_02"), 3), Pair.of(JigsawPiece.legacy("village/desert/zombie/streets/straight_01"), 4), Pair.of(JigsawPiece.legacy("village/desert/zombie/streets/straight_02"), 4), Pair.of(JigsawPiece.legacy("village/desert/zombie/streets/straight_03"), 3), Pair.of(JigsawPiece.legacy("village/desert/zombie/streets/crossroad_01"), 3), Pair.of(JigsawPiece.legacy("village/desert/zombie/streets/crossroad_02"), 3), Pair.of(JigsawPiece.legacy("village/desert/zombie/streets/crossroad_03"), 3), Pair.of(JigsawPiece.legacy("village/desert/zombie/streets/square_01"), 3), Pair.of(JigsawPiece.legacy("village/desert/zombie/streets/square_02"), 3), Pair.of(JigsawPiece.legacy("village/desert/zombie/streets/turn_01"), 3)), JigsawPattern.PlacementBehaviour.TERRAIN_MATCHING));
//      JigsawPatternRegistry.register(new JigsawPattern(new ResourceLocation("village/desert/zombie/houses"), new ResourceLocation("village/desert/zombie/terminators"), ImmutableList.of(Pair.of(JigsawPiece.legacy("village/desert/zombie/houses/desert_small_house_1", ProcessorLists.ZOMBIE_DESERT), 2), Pair.of(JigsawPiece.legacy("village/desert/zombie/houses/desert_small_house_2", ProcessorLists.ZOMBIE_DESERT), 2), Pair.of(JigsawPiece.legacy("village/desert/zombie/houses/desert_small_house_3", ProcessorLists.ZOMBIE_DESERT), 2), Pair.of(JigsawPiece.legacy("village/desert/zombie/houses/desert_small_house_4", ProcessorLists.ZOMBIE_DESERT), 2), Pair.of(JigsawPiece.legacy("village/desert/zombie/houses/desert_small_house_5", ProcessorLists.ZOMBIE_DESERT), 2), Pair.of(JigsawPiece.legacy("village/desert/zombie/houses/desert_small_house_6", ProcessorLists.ZOMBIE_DESERT), 1), Pair.of(JigsawPiece.legacy("village/desert/zombie/houses/desert_small_house_7", ProcessorLists.ZOMBIE_DESERT), 2), Pair.of(JigsawPiece.legacy("village/desert/zombie/houses/desert_small_house_8", ProcessorLists.ZOMBIE_DESERT), 2), Pair.of(JigsawPiece.legacy("village/desert/zombie/houses/desert_medium_house_1", ProcessorLists.ZOMBIE_DESERT), 2), Pair.of(JigsawPiece.legacy("village/desert/zombie/houses/desert_medium_house_2", ProcessorLists.ZOMBIE_DESERT), 2), Pair.of(JigsawPiece.legacy("village/desert/houses/desert_butcher_shop_1", ProcessorLists.ZOMBIE_DESERT), 2), Pair.of(JigsawPiece.legacy("village/desert/houses/desert_tool_smith_1", ProcessorLists.ZOMBIE_DESERT), 2), Pair.of(JigsawPiece.legacy("village/desert/houses/desert_fletcher_house_1", ProcessorLists.ZOMBIE_DESERT), 2), Pair.of(JigsawPiece.legacy("village/desert/houses/desert_shepherd_house_1", ProcessorLists.ZOMBIE_DESERT), 2), Pair.of(JigsawPiece.legacy("village/desert/houses/desert_armorer_1", ProcessorLists.ZOMBIE_DESERT), 1), Pair.of(JigsawPiece.legacy("village/desert/houses/desert_fisher_1", ProcessorLists.ZOMBIE_DESERT), 2), Pair.of(JigsawPiece.legacy("village/desert/houses/desert_tannery_1", ProcessorLists.ZOMBIE_DESERT), 2), Pair.of(JigsawPiece.legacy("village/desert/houses/desert_cartographer_house_1", ProcessorLists.ZOMBIE_DESERT), 2), Pair.of(JigsawPiece.legacy("village/desert/houses/desert_library_1", ProcessorLists.ZOMBIE_DESERT), 2), Pair.of(JigsawPiece.legacy("village/desert/houses/desert_mason_1", ProcessorLists.ZOMBIE_DESERT), 2), Pair.of(JigsawPiece.legacy("village/desert/houses/desert_weaponsmith_1", ProcessorLists.ZOMBIE_DESERT), 2), Pair.of(JigsawPiece.legacy("village/desert/houses/desert_temple_1", ProcessorLists.ZOMBIE_DESERT), 2), Pair.of(JigsawPiece.legacy("village/desert/houses/desert_temple_2", ProcessorLists.ZOMBIE_DESERT), 2), Pair.of(JigsawPiece.legacy("village/desert/houses/desert_large_farm_1", ProcessorLists.ZOMBIE_DESERT), 7), Pair.of(JigsawPiece.legacy("village/desert/houses/desert_farm_1", ProcessorLists.ZOMBIE_DESERT), 4), Pair.of(JigsawPiece.legacy("village/desert/houses/desert_farm_2", ProcessorLists.ZOMBIE_DESERT), 4), Pair.of(JigsawPiece.legacy("village/desert/houses/desert_animal_pen_1", ProcessorLists.ZOMBIE_DESERT), 2), Pair.of(JigsawPiece.legacy("village/desert/houses/desert_animal_pen_2", ProcessorLists.ZOMBIE_DESERT), 2), Pair.of(JigsawPiece.empty(), 5)), JigsawPattern.PlacementBehaviour.RIGID));
//      JigsawPatternRegistry.register(new JigsawPattern(new ResourceLocation("village/desert/zombie/terminators"), new ResourceLocation("empty"), ImmutableList.of(Pair.of(JigsawPiece.legacy("village/desert/terminators/terminator_01"), 1), Pair.of(JigsawPiece.legacy("village/desert/zombie/terminators/terminator_02"), 1)), JigsawPattern.PlacementBehaviour.TERRAIN_MATCHING));
//      JigsawPatternRegistry.register(new JigsawPattern(new ResourceLocation("village/desert/zombie/decor"), new ResourceLocation("empty"), ImmutableList.of(Pair.of(JigsawPiece.legacy("village/desert/desert_lamp_1", ProcessorLists.ZOMBIE_DESERT), 10), Pair.of(JigsawPiece.feature(Features.PATCH_CACTUS), 4), Pair.of(JigsawPiece.feature(Features.PILE_HAY), 4), Pair.of(JigsawPiece.empty(), 10)), JigsawPattern.PlacementBehaviour.RIGID));
//      JigsawPatternRegistry.register(new JigsawPattern(new ResourceLocation("village/desert/zombie/villagers"), new ResourceLocation("empty"), ImmutableList.of(Pair.of(JigsawPiece.legacy("village/desert/zombie/villagers/nitwit"), 1), Pair.of(JigsawPiece.legacy("village/desert/zombie/villagers/unemployed"), 10)), JigsawPattern.PlacementBehaviour.RIGID));
//      
    }
}
