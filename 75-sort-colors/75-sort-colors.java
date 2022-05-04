class Solution {
    public void sortColors(int[] nums) {
        int countr=0;
        int countw=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==0){
                countr=countr+1;
            }
            if(nums[i]==1){
                countw=countw+1;
            }
        }
        for(int i=0; i<countr; i++){
            nums[i]=0;
        }
        for(int j=countr; j<countr+countw; j++){
            nums[j]=1;
        }
        for(int k=countr+countw; k<nums.length; k++){
            nums[k]=2;
        }
    }
}