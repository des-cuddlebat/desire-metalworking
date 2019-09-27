package net.cuddlebat.desmetal.metal.component;

import net.cuddlebat.desmetal.metal.Metal;

public interface IMetalComponent
{
	public void init();
	
	public String getText();
	
	public void setMetal(Metal metal);
	
	public Metal getMetal();
}
