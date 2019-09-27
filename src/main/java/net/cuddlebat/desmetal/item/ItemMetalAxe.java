package net.cuddlebat.desmetal.item;

import net.cuddlebat.desmetal.metal.component.ComponentTools;
import net.minecraft.item.AxeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ToolMaterial;

public class ItemMetalAxe extends AxeItem
{
	private static final float axeDmgPlus = 3;
	private static final float atkSpeed = 0.6f;
	
	public ItemMetalAxe(ComponentTools component)
	{
		this(component, axeDmgPlus, atkSpeed, new Item.Settings());
	}
	
	protected ItemMetalAxe(ToolMaterial tmat, float dmgPlus, float atkSpeed, Settings settings)
	{
		super(tmat, dmgPlus, atkSpeed, settings);
		// TODO Auto-generated constructor stub
	}
}
