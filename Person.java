package practice1;

public class Person{
	
	public static void main(String[] args)
	{
		Gen a = new Gen();
		a.age = 35;
		a.name = "jaswanth";
		a.speak();
		a.calculateRetirementAge();
	}
}

class Gen  {
	
	String name;
	int age;
	
	void speak()
	{
		System.out.println("my name is "+ name);
	}

	void calculateRetirementAge(){
		int retage = 65-age;
		System.out.println("years to retirement :" + retage);
	}
}
