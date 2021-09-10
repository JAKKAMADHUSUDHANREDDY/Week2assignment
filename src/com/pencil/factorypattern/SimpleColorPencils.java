package com.pencil.factorypattern;

public class SimpleColorPencils implements ColorPencils{
	@Override
	public void create()
	{
		System.out.println("Color pencils are creating...");
	}
	@Override
	public void doColors()
	{
		System.out.println("Color pencils are doing colors");

	}
}
