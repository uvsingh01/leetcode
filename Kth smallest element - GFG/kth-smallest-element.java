// { Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		int t=sc.nextInt();
		
		while(t-->0)
		{
		    int n=sc.nextInt();
		    
		    int arr[]=new int[n];
		    
		    for(int i=0;i<n;i++)
		    arr[i]=sc.nextInt();
		    
		    int k=sc.nextInt();
		    Solution ob = new Solution();
		    out.println(ob.kthSmallest(arr, 0, n-1, k));
		}
		out.flush();
	}
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    public static int kthSmallest(int[] arr, int l, int r, int k) 
    { 
        // qs(arr,0,arr.length-1);
        Arrays.sort(arr);
        return arr[k-1];
    }
    public static void qs(int []arr, int start, int end){
        if(start<end){
            int pivot=qsm(arr,start,end);
            qs(arr,start, pivot-1);
            qs(arr,pivot+1,end);
        }
    }
    public static int qsm(int []arr, int start, int end){
        int j=start;
        int pivot=arr[end];
        for(int i=start; i<=end-1; i++){
            if(arr[i]<pivot){
                swap(arr,i,j);
                j++;
            }
        }
        swap(arr,j,end);
        return j;
    }
    static void swap(int [] arr, int i, int j){
        if(i==j){
            return;
        }
        int temp= arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
