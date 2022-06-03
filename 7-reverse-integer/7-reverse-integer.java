class Solution {
    public int reverse(int x) {
        int sum=0;
        int temp=x;
        
        while(temp!=0){
            int rem= temp%10;
            sum=(10*sum)+rem;
            if(rem!=(sum%10)){
                return 0;
            }
            temp=temp/10;
            
        }
        return sum;
    }
}