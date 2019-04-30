package com.developerfabi.resources.init;

import com.developerfabi.buildtweaks.BuildTweaks;
import com.developerfabi.util.IHasModel;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel {
    public ItemBase(String itemName) {
        setUnlocalizedName(itemName);
        setRegistryName(itemName);
        setCreativeTab(BuildTweaks.BUILDTWEAKS);

        ModItems.ITEMS.add(this);
    }

    @Override
    public void registerModels() {
        BuildTweaks.proxy.registerItemRenderer(this, 0, "inventory");
    }
}
