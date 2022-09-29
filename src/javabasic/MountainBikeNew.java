package javabasic;

class MountainBikeNew implements BicycleNew {
	private int seatHeight;
	private int gear;
	private int speed;
	
	public MountainBikeNew(int startHeight, int startSpeed, int startGear) {
		setSeatHeight(startHeight);
		speed = startSpeed;
		setGear(startGear);
	}
	
	@Override
	public void applyBreak(int decrement) {
		speed = speed-decrement;
		
	}
	@Override
	public void speedUp(int increment) {
		// TODO Auto-generated method stub
		speed = speed-increment;
		
	}

	public int getSeatHeight() {
		return seatHeight;
	}

	public void setSeatHeight(int seatHeight) {
		this.seatHeight = seatHeight;
	}

	public int getGear() {
		return gear;
	}

	public void setGear(int gear) {
		this.gear = gear;
	}
	
	public int getSpeed() {
		return speed;
	}
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	
}
