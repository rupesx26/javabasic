package javabasic;

class InheritanceDemo {

	public static void main(String[] args) {
		MountainBike mountainBike = new MountainBike(20, 10, 1);
		System.out.println("Gear is "+ mountainBike.gear);
		System.out.println("Speed is "+ mountainBike.speed);	
		System.out.println("Seat is "+ mountainBike.seatHeight / 2);
		mountainBike.applyBreak(4);
		System.out.println("Speed after break is "+ mountainBike.speed);	
	}

}
