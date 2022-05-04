class Solution {
    public int romanToInt(String s) {
        int len = s.length();
        int arr[] = new int[len];
        for(int i=0; i<len; i++){
            char c = s.charAt(i);
            if(c=='I'){
                arr[i]=1;
            }
            if(c=='V'){
                arr[i]=5;
            }
            if(c=='X'){
                arr[i]=10;
            }
            if(c=='L'){
                arr[i]=50;
            }
            if(c=='C'){
                arr[i]=100;
            }
            if(c=='D'){
                arr[i]=500;
            }
            if(c=='M'){
                arr[i]=1000;
            }
        }
        int sum =0;
        for(int i =0; i<len-1; i++){
            if(arr[i]<arr[i+1]){
                arr[i]=(arr[i+1]-arr[i]);
                arr[i+1]=0;
                i=i+1;
            }
        }
        for(int element:arr){
            sum=sum+element;
        }
        return sum;
    }
}