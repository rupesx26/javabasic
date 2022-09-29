package javabasic;

public abstract class Abstraction {

	int x,y;
	
	static void moveTo(double d, int newY) {	
		System.out.println("Move to x" +d+ "and move y to " +newY);
	}
	
	Abstraction() {
		System.out.println("constructor");
		
	}
	
	abstract void draw();
	abstract void resize();
	
}
