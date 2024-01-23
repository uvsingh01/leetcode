class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=0,j=0;
        List <Integer> list = new ArrayList<>();
        while(i<m&&j<n){
            if(nums1[i]<=nums2[j]){
              list.add(nums1[i]);
                i++;
            }
            else{
                list.add(nums2[j]);
                j++;
            }
        }
        while(i<m){
            list.add(nums1[i]);
            i++;
        }
        while(j<n){
            list.add(nums2[j]);
            j++;
        }
        for(int k=0;k<nums1.length; k++){
            nums1[k]=list.get(k);
        }
    }
    public void swap(int[]nums1, int[]nums2, int i, int j){
        int temp= nums1[i];
        nums1[i]=nums2[j];
        nums2[j]=temp;
    }
}