package practice1;
import java.util.*;

public class ServiceLane {
	public static void main(String [] args){
		Scanner inp = new Scanner(System.in);
		System.out.println("Enter the lane length");
		int N = inp.nextInt();
		System.out.println("Enter the Test cases");
		int T = inp.nextInt();
		int[] array  = new int[100000]; 
		for(int i=0;i<N;i++){
			array[i] = inp.nextInt();
		}
		for(int x=0;x<T;x++){
			int i= inp.nextInt();
			int j = inp.nextInt();
			int min = 3;
			for(int l=i;l<=j;l++){
				if(min>array[l])
					min = array[l];
			}
			System.out.println(min);
		}
inp.close();
	}
}
