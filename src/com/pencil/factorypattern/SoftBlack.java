package com.pencil.factorypattern;

public class SoftBlack implements GraphitePencils{

	@Override
	public void create()
	{
		System.out.println("Soft Black (SB) Pencils are creating...");
	}
	@Override
	public void write()
	{
		System.out.println("Soft Black (SB) Pencils are used to write.");

	}
}
