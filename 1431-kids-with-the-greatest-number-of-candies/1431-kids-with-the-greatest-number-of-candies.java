class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> list = new ArrayList<>();
        int max= Integer.MIN_VALUE;
        for(int i: candies){
            if(i>max){
                max=i;
            }
        }
        for(int i=0; i<candies.length; i++){
            if(candies[i]+extraCandies>=max){
                list.add(true);
            }
            else{
                list.add(false);
            }
        }
        return list;
    }
}