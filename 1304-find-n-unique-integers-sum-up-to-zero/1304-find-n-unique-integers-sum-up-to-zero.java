class Solution {
    public int[] sumZero(int n) {
        int [] res = new int[n];
        for(int i=0; i<n-1; i=i+2){
            res[i]= n-i;
            res[i+1]=i-n;
        }
        return res;
    }
}