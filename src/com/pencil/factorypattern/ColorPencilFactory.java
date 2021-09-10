package com.pencil.factorypattern;


public class ColorPencilFactory implements PencilFactory{

	@Override
	public void createPencil1() {
		// TODO Auto-generated method stub
		ColorPencils cp = new watercolors() ; 
        cp.create();
        cp.doColors();
	}
	@Override
	public void createPencil2() {
		// TODO Auto-generated method stub
		ColorPencils cp = new Caryons();
		cp.create();
        cp.doColors();
	}
	@Override
	public void createPencil3() {
		// TODO Auto-generated method stub
		ColorPencils cp = new SimpleColorPencils();
		cp.create();
        cp.doColors();
	}
}