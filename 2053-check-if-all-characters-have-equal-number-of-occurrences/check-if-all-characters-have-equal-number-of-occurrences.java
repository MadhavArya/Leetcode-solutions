import java.util.HashMap;
class Solution {
    public boolean areOccurrencesEqual(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(char ch:s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int f=map.get(s.charAt(0));
        for(int value:map.values()){
            if(value!=f){
                return false;
            }
        }
        return true;
    }
}