package com.pencil.factorypattern;

public class GraphitePencilFactory implements PencilFactory{

	@Override
	public void createPencil1() {
		// TODO Auto-generated method stub
		GraphitePencils gp = new HardBlack() ; 
		gp.create();
		gp.write();
	}
	@Override
	public void createPencil2() {
		// TODO Auto-generated method stub
		GraphitePencils gp = new SoftBlack();
		gp.create();
		gp.write();
	}
	@Override
	public void createPencil3() {
		// TODO Auto-generated method stub
		GraphitePencils gp = new Firm();
		gp.create();
		gp.write();
	}
}
