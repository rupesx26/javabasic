package javabasic;

public class student {

	String name;
	int age;
	String address;
	
	//Constructor
	public student(String name, int age, String address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getAddress() {
		return address;
	}
	
	
	public String toString() {
		return ("Student name is " + this.getName() + ", age is: " + this.getAge() + "and address is " + this.getAddress());
	}
	
	public static void main(String[] args) {
		student john = new student("John", 25, "23 East Carolina");
		System.out.print(john.toString());
	}

}
