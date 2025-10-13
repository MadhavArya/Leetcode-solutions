class Solution {
    public String gcdOfStrings(String str1, String str2) {
        int num1=str1.length();
        int num2=str2.length();
        if(!(str1+str2).equals(str2+str1)){
            return "";
        }
        
        String result=str1.substring(0,gcd(num1,num2));
        return result;
    }
    public int gcd(int num1,int num2){
        if(num2==0){
            return num1;
        }
        return gcd(num2,num1%num2);
        
    }
}