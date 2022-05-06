class Solution {
    public int[] decode(int[] a, int b) {
        int []arr = new int[a.length+1];
        // int res =0;
        // int sum = b;
        arr[0]=b;
        for(int i=0; i<a.length; i++){
            // sum= sum^a[i];
            arr[i+1]=a[i]^arr[i];
        }
        return arr;
    }
}