package practice1;

public class SumNum {
	private static int acc = 0;
	public static void sum(int n){
		if(n<10)
			System.out.println(acc += n%10);
		else {
			acc += n%10;
			sum(n/10);}
	}
public static void main(String args[]){
	SumNum b = new SumNum();
	b.sum(12345);
}
}
