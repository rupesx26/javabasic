package javabasic;

public class DoWhileDemo {

	int sum(int[] a) {
		int result = 0;
		for(int i: a) 
			result += i;
		//System.out.println(result);
		return result;
	}
	@SuppressWarnings("unused")
	public static void main(String[] args) {
//		int count = 1;
//		do {
//			System.out.println("do" + count);
//			count++;
//		} while (count < 6);
//			System.out.println("loop ends");
		
	//   String names[] = {"Tom", "Bob", "Billy"};
//	   
//	   for(String name: names) {
//		   if(name.equals("Bob")) 
//			   System.out.println(name);
//	   }
//	   System.out.println("loop ends");
	   
	   
//	   outer:
//		   for(int i= 0; i <=3; i++ ) {
//			   inner:
//
//			   for(int j = 0; j<=3; j++) {
//					   if(i == 2 && j == 2) {
//						   break;
//					   }
//				   System.out.println(i+" "+j);
//			   }
//		   }
//		DoWhileDemo obj = new DoWhileDemo();
//		int count[] = {10,26,30,40,50,0, -10};
//		
//		System.out.println(obj.sum(count));
//		
//	   System.out.println(obj.sum(new int [] {5,4,3,6,7,8,-2}));

	
	
	   outer:
	   for(int i= 0; i <=3; i++ ) {
		   inner:

		   for(int j = 0; j<=3; j++) {
			   
				   if(i == 2 && j == 2) {
					   continue inner;
				   }
			   System.out.println(i+" "+j);
		   }
	   }
	
	}
}
