package com.pencil.factorypattern;

public class Caryons implements ColorPencils{

	@Override
	public void create()
	{
		System.out.println("Caryons are creating...");
	}
	@Override
	public void doColors()
	{
		System.out.println("Caryons are doing colors");

	}
}
