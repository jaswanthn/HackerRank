package practice1;
class Fib {
int fibo(int n)
{
if(n==0)
	return 0;
else if(n==1) return 1;
else return fibo(n-1)+fibo(n-2);
}
long fib (int n) {
    long f1 = 0;
    long f2 = 1;
    long fn=0;

    for(int i=0; i<n; i++) {
    	fn = f1 + f2;
        f1 = f2;
        f2 = fn;
    }
    return fn;
}

}

public class Fibonocci
{
	public static void main(String[] args){
		Fib ans=new Fib();
		int fibres=ans.fibo(5);
		long newfib = ans.fib(100);
		System.out.println("fibonocci series of n=5 is " +" "+newfib);
	
	}
}