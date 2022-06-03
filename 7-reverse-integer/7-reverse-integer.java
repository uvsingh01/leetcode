class Solution {
    public int reverse(int x) {
        int sum=0;
        // int temp=x;
        
        while(x!=0){
            int rem= x%10;
            sum=(10*sum)+rem;
            if(rem!=(sum%10)){
                return 0;
            }
            x=x/10;
            
        }
        return sum;
    }
}