package net.cuddlebat.desmetal.metal;

import java.util.HashMap;

import net.cuddlebat.desmetal.metal.component.IMetalComponent;

public class Metal
{
	private HashMap<Class<? extends IMetalComponent>, IMetalComponent> components
		= new HashMap<Class<? extends IMetalComponent>, IMetalComponent>();
	
	public Metal withComponent(IMetalComponent component)
	{
		components.put(component.getClass(), component);
		return this;
	}
	
	public <TComp extends IMetalComponent> boolean hasComponent(Class<TComp> cls)
	{
		return components.containsKey(cls);
	}
	
	@SuppressWarnings("unchecked")
	public <TComp extends IMetalComponent> TComp getComponent(Class<TComp> cls)
	{
		return (TComp)components.get(cls);
	}
	
	@SuppressWarnings("unchecked")
	public <TComp extends IMetalComponent> TComp getComponentOrNull(Class<TComp> cls)
	{
		if(!hasComponent(cls))
			return null;
		return (TComp)components.get(cls);
	}
}
