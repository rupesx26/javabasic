package javabasic;

public class AbstractDemo {

	public static void main(String[] args) {
		Abstraction circle = new Circle();
		circle.draw();
		circle.resize();
		Abstraction.moveTo(22.10, 10);
	}
}
