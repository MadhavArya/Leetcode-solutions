class Solution {
    public String reverseVowels(String s) {
        char [] ch=s.toCharArray();
        int x=0;
        int y=s.length()-1;
        while(x<y){
            if((ch[x]=='A'||ch[x]=='E'||ch[x]=='I'||ch[x]=='O'||ch[x]=='U'||
            ch[x]=='a'||ch[x]=='e'||ch[x]=='i'||ch[x]=='o'||ch[x]=='u')&&(ch[y]=='A'||ch[y]=='E'||ch[y]=='I'||
            ch[y]=='O'||ch[y]=='U'||ch[y]=='a'||ch[y]=='e'||ch[y]=='i'||ch[y]=='o'||ch[y]=='u')){
                char temp=ch[x];
                ch[x]=ch[y];
                ch[y]=temp;
                x++;
                y--;
            }else if(ch[x]=='A'||ch[x]=='E'||ch[x]=='I'||ch[x]=='O'||ch[x]=='U'||
            ch[x]=='a'||ch[x]=='e'||ch[x]=='i'||ch[x]=='o'||ch[x]=='u'){
                y--;
            }else
            {
                x++;
            }
        }
        return new String(ch);
    }
}