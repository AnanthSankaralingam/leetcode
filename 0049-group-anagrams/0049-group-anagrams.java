class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        //time: O(n * klog(k)) k is max str length
        //space: O(n * k) n unique keys of length k
        //map - key anagram, value original string
        Map<String, List<String>> map = new HashMap<>();
        for(String str : strs){
            char []c = str.toCharArray(); //sort letters to get anagram
            Arrays.sort(c);
            String key = new String(c); 
            if(map.containsKey(key)){
                map.get(key).add(str); //append to list
            }else{
                List<String> list= new ArrayList<>(); //create new list
                list.add(str);
                map.put(key,list);
            }
        }
        
        return new ArrayList<>(map.values()); //use parenthesis to convert array to arraylist
    }
}