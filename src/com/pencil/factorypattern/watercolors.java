package com.pencil.factorypattern;

public class watercolors implements ColorPencils{

	@Override
	public void create()
	{
		System.out.println("Water color pencils are creating...");
	}
	@Override
	public void doColors()
	{
		System.out.println("Water color pencils are doing colors");

	}
}
