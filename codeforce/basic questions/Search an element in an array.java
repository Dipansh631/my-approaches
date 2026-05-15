import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int x=sc.nextInt();
		int[]arr=new int[n];
		for(int i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		}
		boolean found=false;
		for(int i=0;i<n;i++){
		    if(arr[i]==x){
		        found=true;
		    }
		}
		if(found==true){
		    System.out.println("YES");
		}
		else{
		    System.out.println("NO");
		}
	}
}
