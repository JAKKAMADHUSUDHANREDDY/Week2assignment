package com.pencil.factorypattern;

public class HardBlack implements GraphitePencils{

	@Override
	public void create()
	{
		System.out.println("Hard Black (HB) Pencils are creating...");
	}
	@Override
	public void write()
	{
		System.out.println("Hard Black (HB) Pencils are used to write.");

	}
}
