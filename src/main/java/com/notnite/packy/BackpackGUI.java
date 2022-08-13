package com.notnite.packy;

import eu.pb4.sgui.api.gui.SimpleGui;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.screen.slot.Slot;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.text.Text;

public class BackpackGUI extends SimpleGui {
	public BackpackGUI(ServerPlayerEntity player) {
		super(ScreenHandlerType.GENERIC_9X3, player, false);
		setTitle(Text.literal("Backpack"));

		var echest = player.getEnderChestInventory();
		for (var i = 0; i < 27; i++) setSlotRedirect(i, new Slot(echest, i, i, 0));

		open();
	}
}
