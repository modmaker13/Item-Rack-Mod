
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.itemdisplaymod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.itemdisplaymod.block.SwordRackBlock;
import net.mcreator.itemdisplaymod.block.ItemDisplayCaseBlock;
import net.mcreator.itemdisplaymod.ItemDisplayModMod;

public class ItemDisplayModModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, ItemDisplayModMod.MODID);
	public static final RegistryObject<Block> SWORD_RACK = REGISTRY.register("sword_rack", () -> new SwordRackBlock());
	public static final RegistryObject<Block> ITEM_DISPLAY_CASE = REGISTRY.register("item_display_case", () -> new ItemDisplayCaseBlock());
}
