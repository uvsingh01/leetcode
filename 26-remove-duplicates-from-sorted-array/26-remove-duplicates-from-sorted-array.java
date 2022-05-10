class Solution {
    public int removeDuplicates(int[] arr) {
        int k=0;
        for(int i=0; i<arr.length-1 ;i++){
            if(arr[i]!=arr[i+1]){
                arr[k++]=arr[i];
            }
        }
        arr[k++]=arr[arr.length-1];
        return k;
    }
}