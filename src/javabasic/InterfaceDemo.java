package javabasic;

class InterfaceDemo {

	public static void main(String[] args) {
		MountainBikeNew mountainBikeNew = new MountainBikeNew(20, 10, 9);
		System.out.println("Gear is "+ mountainBikeNew.getGear());
		System.out.println("Speed is "+ mountainBikeNew.getSpeed());	
		System.out.println("Seat is "+ mountainBikeNew.getSeatHeight() / 2);
		mountainBikeNew.applyBreak(4);
		mountainBikeNew.speedUp(49);
		System.out.println("Speed after break is "+ mountainBikeNew.getSpeed());	
		System.out.println("Gear after break is "+ mountainBikeNew.getGear());

	}

}
