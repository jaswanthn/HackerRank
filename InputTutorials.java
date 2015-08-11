package practice1;
import java.util.Scanner;

public class InputTutorials {
public static void main(String[] args){
	System.out.println("welcome to the java world");
	Scanner inp = new Scanner(System.in);
	System.out.println("enter some string that you want to display back");
	String line = inp.nextLine();
	System.out.println(line);
	System.out.println("enter an integer value");
	int val = inp.nextInt();
	System.out.println(val);
	inp.close();
	
	int[] values = new int[]{1,2,3};
	for(int i=0;i<values.length;i++){
		System.out.println("elements in an array: " + values[i]);}
		String hell[] = new String[]{"I","am","good"};
		for (String fruit : hell){
			System.out.println(fruit);
		}
	
}
}
