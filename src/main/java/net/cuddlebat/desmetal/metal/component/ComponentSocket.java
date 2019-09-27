package net.cuddlebat.desmetal.metal.component;

import net.minecraft.item.Item;
import net.minecraft.recipe.Ingredient;

public class ComponentSocket extends BaseComponent
{
	private Ingredient gemstone;
	
	public ComponentSocket(Item gemstone)
	{
		this.gemstone = Ingredient.ofItems(gemstone);
	}

	public Ingredient getGemstone()
	{
		return gemstone;
	}
	
	@Override
	public void init()
	{
		// TODO Auto-generated method stub
		
	}	

	@Override
	public String getText()
	{
		// TODO Auto-generated method stub
		return null;
	}	
}
