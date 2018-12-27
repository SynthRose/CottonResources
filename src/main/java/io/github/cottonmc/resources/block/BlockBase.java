package io.github.cottonmc.resources.block;

import net.minecraft.block.Block;

public class BlockBase extends Block implements NamedBlock {

	public String name;

	public BlockBase(String name, Settings settings) {
		super(settings);
		this.name = name;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public Block getBlock() {
		return this;
	}

	//add any other helpful stuff here, like a default Settings
}
