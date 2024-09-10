class Solution {
    public String reverseVowels(String s) {
        // two pters, iterate until touch and swap when two vowels
        char[] c = s.toCharArray();
        Set<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        vowels.add('A');
        vowels.add('E');
        vowels.add('I');
        vowels.add('O');
        vowels.add('U');
        int left = 0, right = s.length()-1;
        while(left < right){
            // Find the next vowel from the left
            while (left < right && !vowels.contains(c[left])) {
                left++;
            }
            
            // Find the next vowel from the right
            while (left < right && !vowels.contains(c[right])) {
                right--;
            }
            
            // Swap vowels at left and right
            if (left < right) {
                char temp = c[left];
                c[left] = c[right];
                c[right] = temp;
                left++;
                right--;
            }
        }
        return new String(c);
    }
}