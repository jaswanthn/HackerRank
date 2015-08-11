package practice1;

public class SortBalls {
	public static void sortColor(char[] a)
	{
		int redCount=0,blueCount=0,greenCount = 0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i] == 'R')
				redCount++;
			else if(a[i]=='B')
				blueCount++;
			else
				greenCount++;
		}
		for(int j=0;j<a.length;j++){
		if(redCount>0)
		{
			a[j]='R';
			redCount--;
			continue;
		}
		if(blueCount>0){
			a[j]='B';
			blueCount--;
			continue;
		}
		if(greenCount>0){
		a[j]='G';
		greenCount--;
		continue;
		}
		}
	for(int k=0;k<a.length;k++){
		System.out.println(" "+a[k]);

	}
	}
	/*public static void swap(char[] a,int b, int c)
	{
		char temp;
		temp=a[b];
		a[b]=a[c];
		a[c]=temp;
	}*/
	public static void main(String[] args)
	{
	char[] b= {'R','G','R','B','B','R','G','R'};
	SortBalls.sortColor(b);
	}
}