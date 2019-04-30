package com.developerfabi.resources.init;

import com.developerfabi.buildtweaks.BuildTweaks;
import com.developerfabi.util.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockBase extends Block implements IHasModel {
    public BlockBase(String blockName, Material material) {
        super(material);
        setUnlocalizedName(blockName);
        setRegistryName(blockName);
        setCreativeTab(BuildTweaks.BUILDTWEAKS);

        ModBlocks.BLOCKS.add(this);
        ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
    }

    @Override
    public void registerModels() {
        BuildTweaks.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
    }
}
