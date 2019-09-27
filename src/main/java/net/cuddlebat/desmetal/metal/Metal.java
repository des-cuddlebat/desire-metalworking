package net.cuddlebat.desmetal.metal;

import java.util.ArrayList;
import java.util.HashMap;

import net.cuddlebat.desmetal.metal.component.IMetalComponent;
import net.minecraft.item.Item;

public class Metal
{
	private HashMap<Class<? extends IMetalComponent>, IMetalComponent> components
		= new HashMap<Class<? extends IMetalComponent>, IMetalComponent>();
	private ArrayList<IMetalComponent> iterable = new ArrayList<IMetalComponent>(); 
	
	public Metal(String regName)
	{
		
	}
	
	public Item getIngot()
	{
		// TODO this
		return null;
	}
	
	public Metal withComponent(IMetalComponent component)
	{
		component.setMetal(this);
		components.put(component.getClass(), component);
		iterable.add(component);
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
	
	public Iterable<IMetalComponent> allComponents()
	{
		return iterable;
	}
}
