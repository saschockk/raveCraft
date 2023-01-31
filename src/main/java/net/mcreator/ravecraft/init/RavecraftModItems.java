
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ravecraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.ravecraft.item.RlgnItem;
import net.mcreator.ravecraft.RavecraftMod;

public class RavecraftModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, RavecraftMod.MODID);
	public static final RegistryObject<Item> RLGN = REGISTRY.register("rlgn", () -> new RlgnItem());
}
