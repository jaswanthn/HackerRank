package practice1;
import java.util.regex.*;
import java.io.*;

public class Animal {
public Fly x1; 
int x;
public Animal(int y){
	x = y; 
System.out.println("hello this is parent");}
public String tryToFly()
{ 
	return x1.itFly(); 
	} 
public int numberRetOne(){
	return 2;
}
public void setFlyType(Fly newObj){
	x1 = newObj;
}
//public static void hi() throws Exception{
//	File f = new File("test.txt");
//	BufferedReader buffer = new BufferedReader(new FileReader(f));
//	buffer.close();
//	throw new Exception("file error");
//}
public static void main(String[] args){
	Animal kitty = new Cat();
	
	System.out.println("hello "+ kitty.tryToFly());
	kitty.setFlyType(new ItFlys());
	System.out.println("hello "+ kitty.tryToFly());
	System.out.println("this is the method in child class "+kitty.numberRetOne());
	System.out.println(Pattern.matches("[amn]", "abcd"));//false (not a or m or n)
	System.out.println(Pattern.matches("[amn]", "a"));//true (among a or m or n)
	System.out.println(Pattern.matches("[a-z]+\\d", "aaa6"));//false (m and a comes more than once)
	 String str = "  Junk    ";
     System.out.println(str.trim());
     String strng = "hi   how are you";
     String a[] = strng.split(" ");
     char x = 4;
     int y = (int)x;
     System.out.println("this is typecase "+y);
     
     for(String s:a){
    	 
    	 System.out.println(s);
     }
}
}

interface Fly{
	String itFly();
}

class ItCant implements Fly{

	public String itFly() {
		// TODO Auto-generated method stub
		return "I cannot Fly";
	}
}

class ItFlys implements Fly{
	public String itFly(){
return "I can Fly";
		}
}

class Cat extends Animal {
	public int hi; 
	public Cat() 
	{
		super(6);
		System.out.println("this is child class");
		x1 = new ItCant();
		}		
	public int numberRetOne(){
		return 1;
	}
}

