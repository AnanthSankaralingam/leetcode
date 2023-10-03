class Solution {
    public boolean closeStrings(String word1, String word2) {
        if(word1.length() != word2.length()){
            return false;
        }
        Map<Character,Integer> map1 = new HashMap<>();
        Map<Character,Integer> map2 = new HashMap<>();
        for(char c : word1.toCharArray()){
            if(map1.containsKey(c)){
                map1.put(c, map1.get(c)+1);
            }else{
                map1.put(c,1);
            }
        }
        for(char c : word2.toCharArray()){
            if(map2.containsKey(c)){
                map2.put(c, map2.get(c)+1);
            }else{
                map2.put(c,1);
            }
        }
        for(Map.Entry<Character,Integer>entry:map1.entrySet()){
            if(!map2.containsKey(entry.getKey() )){
                return false;
            }
        }
        List<Integer> list1 = new ArrayList<>(map1.values());
        List<Integer> list2 = new ArrayList<>(map2.values());

        Collections.sort(list1);
        Collections.sort(list2);
        return list1.equals(list2);
    }
}