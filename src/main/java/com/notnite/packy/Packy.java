package com.notnite.packy;

import net.fabricmc.fabric.api.event.player.UseItemCallback;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;
import org.quiltmc.qsl.item.setting.api.QuiltItemSettings;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Packy implements ModInitializer {
	public static final Logger LOGGER = LoggerFactory.getLogger("Packy");

	@Override
	public void onInitialize(ModContainer mod) {
		Registry.register(Registry.ITEM, new Identifier("packy", "backpack"), new BackpackItem(new QuiltItemSettings()));
	}
}
