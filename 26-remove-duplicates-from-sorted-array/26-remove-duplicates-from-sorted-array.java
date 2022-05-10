class Solution {
    public int removeDuplicates(int[] arr) {
        // int k=0;
        // for(int i=0; i<arr.length-1 ;i++){
        //     if(arr[i]!=arr[i+1]){
        //         arr[k++]=arr[i];
        //     }
        // }
        // arr[k++]=arr[arr.length-1];
        // return k;
        int i=0, j=1;
        while(j<arr.length){
            if(arr[i]==arr[j]){
                j++;
            }else{
                arr[i+1]=arr[j];
                i++;
                j++;
            }
        }
        return i+1;
    }
}