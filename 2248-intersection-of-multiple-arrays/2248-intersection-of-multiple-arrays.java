class Solution {
    public List<Integer> intersection(int[][] nums) {
        Map<Integer, Integer> hm = new TreeMap<>();
        List<Integer> list = new ArrayList<>();
        for(int []a:nums){
            for(int b: a){
                if(hm.containsKey(b)){
                    hm.put(b,hm.get(b) + 1);
                }
                else{
                    hm.put(b,1);
                }
            }
        }
        for(int k: hm.keySet()){
            if(hm.get(k)==nums.length){
                list.add(k);
            }
        }
        return list;
    }
}