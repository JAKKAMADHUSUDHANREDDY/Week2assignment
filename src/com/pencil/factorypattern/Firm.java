package com.pencil.factorypattern;

public class Firm implements GraphitePencils{

	@Override
	public void create()
	{
		System.out.println("Firm (F) Pencils are creating...");
	}
	@Override
	public void write()
	{
		System.out.println("Firm (F) Pencils are used to write.");

	}
}
