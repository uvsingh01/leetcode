class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> hs = new HashSet<>();
        Set<Integer> hss = new HashSet<>();
        for(int i: nums1){
            hs.add(i);
        }
        for(int i:nums2){
            if(hs.contains(i)){
                hss.add(i);
            }
        }
        int [] arr = new int[hss.size()];
        int i=0;
        for(int j: hss){
            arr[i]= j;
            i++;
        }
        return arr;
    }
}