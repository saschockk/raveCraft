
package net.mcreator.ravecraft.item;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.ravecraft.init.RavecraftModSounds;

public class RlgnItem extends RecordItem {
	public RlgnItem() {
		super(0, RavecraftModSounds.REGISTRY.get(new ResourceLocation("ravecraft:rlgn")),
				new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(1).rarity(Rarity.RARE));
	}
}
