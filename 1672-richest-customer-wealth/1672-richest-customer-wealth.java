class Solution {
    public int maximumWealth(int[][] accounts) {
        int max=0;
        for(int[] a: accounts){
            int cur= 0;
            for(int b : a){
                cur=cur+b;
            }
            max= Math.max(max,cur);
        }
        return max;
    }
}