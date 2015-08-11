package practice1;

public class ReverseRec {
public String reverse(String x){
	if(x.length()==0)
		return null;
	else if(x.length()==1)
	return x;
else return x= x.substring(x.length()-1) + reverse(x.substring(0,x.length()-1));
	
}
public static void main(String[] args){
	ReverseRec r =  new ReverseRec();
	String y = r.reverse("jaswanth");
	System.out.println(y);
}
}
