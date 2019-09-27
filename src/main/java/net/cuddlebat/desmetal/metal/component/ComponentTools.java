package net.cuddlebat.desmetal.metal.component;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class ComponentTools extends BaseComponent implements ToolMaterial
{
	private int durability;
	private float speed;
	private float damage;
	private int tier;
	private int enchantability;

	public ComponentTools(int durability, float speed, float damage, int tier, int enchantability)
	{
		super();
		this.durability = durability;
		this.speed = speed;
		this.damage = damage;
		this.tier = tier;
		this.enchantability = enchantability;
	}
	
	@Override
	public int getDurability()
	{
		return durability;
	}

	@Override
	public float getMiningSpeed()
	{
		// TODO Auto-generated method stub
		return speed;
	}

	@Override
	public float getAttackDamage()
	{
		// TODO Auto-generated method stub
		return damage;
	}

	@Override
	public int getMiningLevel()
	{
		// TODO Auto-generated method stub
		return tier;
	}

	@Override
	public int getEnchantability()
	{
		// TODO Auto-generated method stub
		return enchantability;
	}

	@Override
	public Ingredient getRepairIngredient()
	{
		// TODO Auto-generated method stub
		return null;
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
