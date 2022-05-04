class Solution {
    // public int[][] flipAndInvertImage(int[][] image) {
    //     int[][]arr= new int[image.length][image.length];
    //     for(int i=0; i<image.length; i++){
    //         int k=0;
    //         for(int j=image.length-1; j>=0; j--){
    //             arr[i][j]=image[i][k];
    //             k++;
    //             if(arr[i][j]==1){
    //                 arr[i][j]=0;
    //             }
    //             else{
    //                 arr[i][j]=1;
    //             }
    //         }
    //     }
    //     return arr;
    // }
     public int[][] flipAndInvertImage(int[][] image) {
        for(int[] arr : image){
           invert(arr);          
        }     
        
        return image;
    }
    void invert(int [] arr){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int temp=1-arr[start];
            arr[start]=1-arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }   
}