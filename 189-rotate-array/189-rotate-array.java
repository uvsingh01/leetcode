class Solution {
    public void rotate(int[] arr, int k) {
        // brute force approach
        // while(k-->0){
        //     int first = arr[arr.length-1];
        //     for(int i =arr.length-1; i>0; i--){
        //         arr[i]=arr[i-1];
        //     }
        //     arr[0]=first;
        // }
        //
         
        //optimised
        k=k%arr.length;
        res(arr,0,arr.length-1);
        res(arr,0, k-1);
        res(arr,k,arr.length-1);
        
    }
    public void res(int []arr, int i, int j){
        while(i<j){
            swap(arr,i,j);
            i++;
            j--;
        }
    }
    
    public void swap(int []arr, int i, int j){
        if(i==j){
            return;
        }
        int temp= arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    
}