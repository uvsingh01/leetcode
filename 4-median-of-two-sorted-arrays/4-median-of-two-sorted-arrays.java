class Solution {
    public double findMedianSortedArrays(int[] a, int[] b) {
        int []arr = new int[a.length+b.length];
        int i=0; int j=0; int k=0;
        while(i<a.length&& j<b.length){
            if(a[i]<=b[j]){
                arr[k]=a[i];
                i++;
                k++;
            }
            else if(b[j]<=a[i]){
                arr[k]=b[j];
                j++;
                k++;
            }
        }
        while(i<a.length){
            arr[k]=a[i];
                i++;
                k++;
        }
        while(j<b.length){
            arr[k]=b[j];
                j++;
                k++;
        }
        double c = 0;
        if(arr.length%2==0){
            int mid = arr.length/2;
            c= (arr[mid-1]+arr[mid])/2d;

        }
        else{
            int mid = arr.length/2;
            c=arr[mid];
        }
        return c;
        
    }
}