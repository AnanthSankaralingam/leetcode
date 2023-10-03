class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> map = new HashMap<>();
        //map will contain magazine letters and occurences
        for(char c: magazine.toCharArray()){
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }else{
                map.put(c, 1);
            }
        }
        for(char c : ransomNote.toCharArray()){
            if(!map.containsKey(c)){
                return false;
            }
            if(map.get(c) == 1){
                map.remove(c);
            }else if(map.get(c) >1){
                map.put(c, map.get(c) - 1);
            }
        }
        return true;
    }
}