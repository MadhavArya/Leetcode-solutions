class Solution {
    public String reverseWords(String s) {
        String s1[]=s.trim().split("\\s+");
        int i=0;
        int j=s1.length-1;
        while(i<j){
            String temp=s1[i];
            s1[i]=s1[j];
            s1[j]=temp;
            i++;
            j--;
        }
        return String.join(" ",s1);
    }
}