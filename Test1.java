package practice1;

public class Test1 {

	public static String jas = "hello world";
	public void hello(int x,int y){
int c = x*y;
System.out.println("the value of x * y is "+c);
	}


public static void main(String[] args)
{
Test1 a=new Test1();
a.hello(2, 3);
System.out.println(jas);
}
}