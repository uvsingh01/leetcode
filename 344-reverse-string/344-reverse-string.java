class Solution {
    public void reverseString(char[] s) {
        for(int i=0; i<s.length/2; i++){
            swap(s,i,s.length-i-1);
        }
    }
    public void swap(char [] arr, int i, int j){
        if(i==j){
            return;
        }
        char temp= arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}