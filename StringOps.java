package practice1;
import java.util.Arrays;
public class StringOps {
public static void main(String[] args){
	System.out.println("hello");
	String x = "hello how, are you "
			+ "this is you";
	String lines[] = x.split(",");
	System.out.println(lines[0]+lines[1]);
	int a[] = new int[10];
	System.out.println(a.length);
	int b[][] = new int[6][];
	System.out.println("b" + b.length);
	int array[] = new int[] {2,5,7,3,9,0};
	int min = array[0]; 
	for(int i=0;i<=array.length-1;i++)
		if(min>array[i])
			min = array[i];
	System.out.println("minimum element"+min);
	int arry1[] = Arrays.copyOf(array,20);
	System.out.println("elements copied to arry1"+arry1.length);
	for(int num:arry1)
		System.out.println(num +" ");
	String[] strArr = {"JAVA", "C++", "PERL", "STRUTS", "PLAY"};
    String[] strArrCopy = {"JAVA", "C++", "PERL", "STRUTS", "PLAY"};
System.out.println("see if both are equal"+Arrays.deepEquals(strArr, strArrCopy));	
String xi = StringOps.reverseString("hello");
System.out.println("reverse of string hello "+xi);
String hi = "hello" + "this is test";
System.out.println(hi);
}

public static String reverseString(String original){
	String reverse = "";
	for(int i=0;i<original.length();i++){
		reverse = original.charAt(i)+reverse;
	}
	return reverse;
}
}
