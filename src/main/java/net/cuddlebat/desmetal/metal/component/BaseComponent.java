package net.cuddlebat.desmetal.metal.component;

import net.cuddlebat.desmetal.metal.Metal;

public abstract class BaseComponent implements IMetalComponent
{
	private Metal metal;

	@Override
	public void setMetal(Metal metal)
	{
		this.metal = metal;
	}
	
	@Override
	public Metal getMetal()
	{
		return metal;
	}
}
