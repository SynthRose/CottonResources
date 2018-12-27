package io.github.cottonmc.resources.item;

import io.github.cottonmc.resources.CottonResources;
import net.minecraft.item.Item;

public class ItemBase extends Item {

	protected String name;

	public static Settings DEFAULT_SETTINGS = new Item.Settings().itemGroup(CottonResources.cottonGroup);

	public ItemBase(String name, Settings settings) {
		super(settings);
		this.name = name;
	}

	public String getName() {
		return name;
	}

	//add any other helpful stuff here
}