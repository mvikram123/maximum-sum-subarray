// Java program to print largest contiguous array sum
import java.util.*;

public class Main {

    // Driver Code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        sc.close();
        System.out.println(maxSubArraySum(arr));
    }

    // Function Call
    static int maxSubArraySum(int a[]) {


        //brute force approach


        // your code here
        // int max=0;

        // int n=a.length;
        // for(int i=0; i<n; i++)
        //  {
        //     int sum=0;
        // for(int j=i; j<n; j++)
        // 	{
        // 		sum+=a[j];
        // 		 max=Math.max(max,sum);
        // 	}
        //  }
        //  return max;


        //  optimal approach
        int max=Integer.MIN_VALUE;
        int sum=0;
        int n=a.length;
        for(int i=0; i<n; i++)
        {
            sum+=a[i];
            if(max<sum)
            {
                max=sum;
            }
            if(sum<0)
            {
                sum=0;
            }
        }
        return max;
    }
}
// input - 5
//2 3 1 -1 0
//output =6


// 2nd example input=8
//-2 -3 4 -1 -2 1 5 -3
//output=7