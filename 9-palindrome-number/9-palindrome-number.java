class Solution {
    public boolean isPalindrome(int x) {
        // boolean a = false;
        int p =x;
        int temp=x;
        int sum =0;
        if(p<0){
            return false;
        }
        while(p>0){
            int rem = p%10;
            sum=(sum*10)+rem;
            p = p/10;
        }
        if(temp==sum){
            return true;
        }
        else{
            return false;
        }
    }
}