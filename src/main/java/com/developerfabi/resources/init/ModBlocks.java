package com.developerfabi.resources.init;

import com.developerfabi.util.Names;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import java.util.ArrayList;
import java.util.List;

public class ModBlocks {
    public static final List<Block> BLOCKS = new ArrayList<>();

    public static final Block BLOCK_MACHINE_FRAME_BASIC = new BlockBase(Names.BLOCK_MACHINE_FRAME_BASIC, Material.IRON);
    public static final Block BLOCK_MACHINE_FRAME_HARDENED = new BlockBase(Names.BLOCK_MACHINE_FRAME_HARDENED, Material.IRON);
    public static final Block BLOCK_MACHINE_FRAME_REINFORCED= new BlockBase(Names.BLOCK_MACHINE_FRAME_REINFORCED, Material.IRON);
    public static final Block BLOCK_MACHINE_FRAME_RESONANT = new BlockBase(Names.BLOCK_MACHINE_FRAME_RESONANT, Material.IRON);

    public static final Block BLOCK_FACTORY_MACHINE= new BlockBase(Names.BLOCK_FACTORY_MACHINE, Material.IRON);
}
