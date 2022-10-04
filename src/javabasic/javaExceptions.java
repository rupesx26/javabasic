package javabasic;

public class javaExceptions {
	static void avg()
	{
		try {
			throw new ArithmeticException("Demo");
		} catch (ArithmeticException e) {
			System.out.println("Exception cought");
		}	
	}
	public static void main(String[] args) {
	avg();
//		String Str = null;
//		System.out.println(Str.length());
		try {
			int a = 30, b = 0;
			int c = a/b;
			System.out.println("result"+ c);
		} catch (ArithmeticException e) {
			System.out.println("cant divided a numb");
		}
		try {
			int num = Integer.parseInt("rupesh");
			//int num = 24
			System.out.println(num);
			
		} catch (NumberFormatException e) {
			System.out.println("invalid number format");
		}
		try {
			int a[] = new int[5];
			//a[2] = 9;
			a[7] = 9;
			System.out.println(a[4]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("invali array index");
		}
		try {
			int num = Integer.parseInt("rupesh");
			System.out.println(num);

		} catch (NumberFormatException e) {
			System.out.println("invalid number format");
		} finally  {
			System.out.println("finally is always executed");
		}
		
		
	}
}
