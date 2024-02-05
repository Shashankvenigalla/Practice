import java.util.*;
import java.lang.*;
import java.io.*;
public class BestOfTwo{
    public static void main(String args[])throws java.lang.Exception{
	    Scanner sc= new Scanner(System.in);
	    int T=sc.nextInt();
	    for(int i=0;i<T;i++){
	        int a1=sc.nextInt();
	        int a2=sc.nextInt();
	        int a3=sc.nextInt();
	        int a4=sc.nextInt();
	        int a5=sc.nextInt();
	        int a6=sc.nextInt();
	        int min1=Math.min(a3,Math.min(a1,a2));
	        int min2=Math.min(a6,Math.min(a4,a5));
	        int AliceSum=a1+a2+a3-min1;
	        int BobSum=a4+a5+a6-min2;
	        if(AliceSum>BobSum){System.out.println("Alice");}
	        else if(AliceSum<BobSum){System.out.println("Bob");
	        }else{System.out.println("Tie");}
	    }
		// your code goes here

	}
}