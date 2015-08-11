package practice1;
import java.util.Scanner;
public class Palindrome {
public static void main(String[] args){
	String original, reverse = "";
	Scanner in = new Scanner(System.in);
	System.out.println("Enter the input to check whether it is a palindrome");
	original = in.nextLine();
	int length = original.length();
	for(int i=0;i<length;i++){
		reverse = original.charAt(i) + reverse;
	}
	if(reverse.equals(original))
		System.out.println("the given string is a palindrome");
	else System.out.println("the string is not a palindrome");
}
}
