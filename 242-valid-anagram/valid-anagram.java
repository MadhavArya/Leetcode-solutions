class Solution {
    public boolean isAnagram(String s, String t) {
  
        if (s.length() != t.length()) {
            return false;
        }

     
        int[] charCounts = new int[26];

        for (char ch : s.toCharArray()) {
            charCounts[ch - 'a']++; 
        }


        for (char ch : t.toCharArray()) {
            charCounts[ch - 'a']--; 
            if (charCounts[ch - 'a'] < 0) {
                return false;
            }
        }
        return true;
    }
}