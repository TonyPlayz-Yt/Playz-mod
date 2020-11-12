
package net.mcreator.playzmod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.client.util.ITooltipFlag;

import net.mcreator.playzmod.itemgroup.PlayzModItemGroup;
import net.mcreator.playzmod.PlayzModModElements;

import java.util.List;

@PlayzModModElements.ModElement.Tag
public class PlayzSwordItem extends PlayzModModElements.ModElement {
	@ObjectHolder("playz_mod:playz_sword")
	public static final Item block = null;
	public PlayzSwordItem(PlayzModModElements instance) {
		super(instance, 5);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 2000;
			}

			public float getEfficiency() {
				return 4f;
			}

			public float getAttackDamage() {
				return 28f;
			}

			public int getHarvestLevel() {
				return 1;
			}

			public int getEnchantability() {
				return 200;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}
		}, 3, -3f, new Item.Properties().group(PlayzModItemGroup.tab)) {
			@Override
			public void addInformation(ItemStack itemstack, World world, List<ITextComponent> list, ITooltipFlag flag) {
				super.addInformation(itemstack, world, list, flag);
				list.add(new StringTextComponent("This is the only sword that you'll ever need !"));
			}
		}.setRegistryName("playz_sword"));
	}
}
