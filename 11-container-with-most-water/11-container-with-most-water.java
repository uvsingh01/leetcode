class Solution {
    public int maxArea(int[] arr) {
        int i=0;
        int j=arr.length-1;
        int max =0;
        while(i<j){
            if(arr[i]<arr[j]){
                int c=j-i;
                int area= arr[i]*c;
                if(area>max){
                    max=area;
                }
                i++;
            }
            else{
                int c=j-i;
                int area= arr[j]*c;
                if(area>max){
                    max=area;
                }
                j--;
            }
            
        }
        return max;
    }
}