import java.util.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		for(int i = 0; i < t; i++){
		    int n = sc.nextInt();
		    int[] arr = new int[n];

		    for(int j = 0; j < n; j++){
		        arr[j] = sc.nextInt();
		    }

		    int max = arr[0];

		    for(int val : arr){
		        max = Math.max(val, max);
		    }

		    System.out.println(max);
		}
	}
}
