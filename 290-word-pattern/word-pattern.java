import java.util.*;
class Solution {
    public boolean wordPattern(String pattern, String s) {
        String []words=s.split(" ");
        if(pattern.length()!=words.length)
        {
            return false;
        }
        HashMap <Character,String> chartoword=new HashMap<>();
        HashMap <String,Character> wordtochar=new HashMap<>();
        for(int i=0;i<pattern.length();i++){
            char ch=pattern.charAt(i);
            String word=words[i];
            if(chartoword.containsKey(ch)){
                if(!chartoword.get(ch).equals(word)){
                    return false;
                }
            }
            else {
                if(wordtochar.containsKey(word))
                return false;
                
                chartoword.put(ch,word);
                wordtochar.put(word,ch);
            }
        }
        return true;
    }
}