package practice1;

class Calculation {
	int fact(int n){
	if(n==0||n==1)
		return 1;
		else return fact(n-1) *n;
	}
}

public class Factorial
{
	public static void main(String[] args)
	{
		Calculation res = new Calculation();
		int a= res.fact(4);
		System.out.println("result of factorial 4 is "+a);
	}
}