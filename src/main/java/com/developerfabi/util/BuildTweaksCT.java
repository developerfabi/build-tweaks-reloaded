package com.developerfabi.util;

import com.developerfabi.resources.init.ModBlocks;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class BuildTweaksCT extends CreativeTabs {
    public BuildTweaksCT() {
        super("buildtweaks");
    }

    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(Item.getItemFromBlock(ModBlocks.BLOCK_MACHINE_FRAME_BASIC));
    }
}
