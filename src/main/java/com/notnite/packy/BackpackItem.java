package com.notnite.packy;

import eu.pb4.polymer.api.item.PolymerItem;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.text.Text;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public class BackpackItem extends Item implements PolymerItem {

	public BackpackItem(Settings settings) {
		super(settings);
	}

	@Override
	public Text getName(ItemStack stack) {
		return Text.literal("Backpack");
	}
	@Override
	public Item getPolymerItem(ItemStack itemStack, @Nullable ServerPlayerEntity player) {
		return Items.BUNDLE;
	}

	@Override
	public TypedActionResult<ItemStack> use(World world, PlayerEntity player, Hand hand) {
		ItemStack stack = player.getStackInHand(hand);
		if (player.isSneaking()) return TypedActionResult.pass(stack);
		new BackpackGUI((ServerPlayerEntity) player);
		return TypedActionResult.success(stack);
	}
}
