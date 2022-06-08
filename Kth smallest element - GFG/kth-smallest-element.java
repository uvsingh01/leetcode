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
        mergesort(arr,0,arr.length-1);
        // Arrays.sort(arr);
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
    static void mergesort(int[]arr, int start, int end){
        if(start<end){
            int mid=start+(end-start)/2;
            mergesort(arr,start,mid);
            mergesort(arr,mid+1,end);
            merger(arr,start,mid,end);
        }
    }
    static void merger(int[]arr, int start, int mid ,int end){
        int m = mid-start+1;
        int n = end-mid;
        int a[]=new int[m];
        int b[]=new int[n];
        int k=0;
        for (int i = start; i <=mid ; i++) {
            a[k++]=arr[i];
        }
        k=0;
        for (int i = mid+1; i <=end ; i++) {
            b[k++]=arr[i];
        }
        int i=0; int j=0; k=start;
        while(i<m && j<n){
            if(a[i]<b[j]){
                arr[k++]=a[i++];
            }
            else{
                arr[k++]=b[j++];
            }
        }
        while(i<m){
            arr[k++]=a[i++];
        }
        while(j<n){
            arr[k++]=b[j++];
        }
    }
}
