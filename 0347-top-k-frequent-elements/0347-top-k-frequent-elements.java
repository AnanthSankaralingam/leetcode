class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        //get freq map, freRev map
        Map<Integer,Integer> freq = new HashMap<>();
        for(int i:nums)
            freq.put(i,freq.getOrDefault(i,0)+1);
        Map<Integer,List<Integer>> freqRev = new HashMap<>();
        
        for(Map.Entry<Integer,Integer> entry:freq.entrySet()){
            int key = entry.getValue();
            if(!freqRev.containsKey(key))
                freqRev.put(key,new ArrayList<>());
            freqRev.get(key).add(entry.getKey());
        }
        //loop backwards and add frequency to res
        int[] res = new int[k];
        for(int i = nums.length; i>=0; i--){
            if(freqRev.containsKey(i)){
                List<Integer> list = freqRev.get(i);
                for(int num: list){
                    res[--k] = num;
                    if(k==0)
                        return res;
                }
            }
        }
        return res;
        
    }
}