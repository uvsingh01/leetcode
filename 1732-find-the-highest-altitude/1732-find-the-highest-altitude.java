class Solution {
    public int largestAltitude(int[] gain) {
        int max = Integer.MIN_VALUE;
        for(int i=0; i<gain.length; i++){
            if(i>0){
                int sum=0;
                sum= gain[i-1]+gain[i];
                gain[i]=sum;
                if(sum>max){
                    max=sum;
                }
            }
            else{
                if(gain[i]>max){
                    max=gain[i];
                }
            }
        }
        if(max<0) return 0;
        return max;
    }
}