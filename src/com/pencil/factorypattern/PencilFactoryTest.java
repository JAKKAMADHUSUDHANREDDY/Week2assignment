package com.pencil.factorypattern;


public class PencilFactoryTest {

	public static void main(String[] args) {   
	   
		PencilFactory colorfactory = new ColorPencilFactory();
		colorfactory.createPencil1();
		colorfactory.createPencil2();
		colorfactory.createPencil3();
		

		PencilFactory graphitefactory = new GraphitePencilFactory();
		graphitefactory.createPencil1();
		graphitefactory.createPencil2();
		graphitefactory.createPencil3();
	 }    
}
