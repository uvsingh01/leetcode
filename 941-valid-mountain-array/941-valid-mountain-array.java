class Solution {
    public boolean validMountainArray(int[] arr) {
        if(arr.length<3){
            return false;
        }
        int start = 0;
        int end= arr.length-1;
        while(start!=end){
            int mid = start+(end-start)/2;
            if(arr[mid]<arr[mid+1]){
                start=mid+1;
            }
            else if(arr[mid]>=arr[mid+1]){
                end=mid;
            }
        }
        if(start==arr.length-1){
            return false;
        }
        if(start==0){
            return false;
        }
        for(int i=0; i<arr.length-1; i++){
            if(i<start){
                if(arr[i]>=arr[i+1]){
                    return false;
                }
            }
            else{
                if(arr[i]<=arr[i+1]){
                    return false;
                }
            }
        }
        return true;
    }
}