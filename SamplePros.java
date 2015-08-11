package practice1;

public class SamplePros {
	private String name;
	private int age;
	public static int x;
	private String location;
	public SamplePros(String name,int age,String location) {
		this.name = name;
		this.age = age;
		this.location = location;
	}
	public void setAge(int pAge){
		age = pAge;
	}
	public void getAge(int gAge){
		System.out.println("age of the person"+ age);
	}
public static void main(String[] args){
	System.out.println("hello");
	SamplePros jash = new SamplePros("jaswanth",22,"sanjose");
	System.out.println("jash object"+jash);
	System.out.println("jash age "+jash.age);
	jash.setAge(23);
	System.out.println("age after changed "+ jash.age);
	jash.x = 3;
SamplePros jash1 = new SamplePros("jash",22,"sacremento");
jash1.x = x+2;
System.out.println("static variable behavior"+x);
}
}
