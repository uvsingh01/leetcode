class Solution {
    public int arrayPairSum(int[] a) {
        Arrays.sort(a);
        int sum=0;
        for(int i=0; i<a.length; i=i+2){
            sum=sum+Math.min(a[i],a[i+1]);
        }
        return sum;
    }
}