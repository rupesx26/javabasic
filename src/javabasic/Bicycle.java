package javabasic;

class Bicycle {

	protected int gear;
	protected int speed;
	
	public Bicycle(int startSpeed, int stateGear) {
		gear = stateGear;
		speed = startSpeed;
	}
	
	public void setGear(int newValue) {
		gear = newValue;
	}
	
	public void applyBreak(int decrement) {
		speed -= decrement;
	}
	
	public void speedUp(int increment) {
		speed += increment;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
