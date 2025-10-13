class Solution {
    public String mergeAlternately(String word1, String word2) {
        String merge="";

        int i=0,j=0;

        while(i<word1.length() && j<word2.length()){
            
            merge+=word1.charAt(i++);
            merge+=word2.charAt(j++);
        }
        if(i<word1.length()){
          merge+=word1.substring(i);
        }
        if(j<word2.length()){
            merge+=word2.substring(j);
        }
        return merge;
    }
}