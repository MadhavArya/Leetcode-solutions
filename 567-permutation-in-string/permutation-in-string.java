class Solution {
    public boolean checkInclusion(String s1, String s2) {
       int n=s1.length();
       int m=s2.length();
       int arr1[]=new int[26];
       int arr2[]=new int[26];
       if(m<n) return false;
       for(int i=0;i<n;i++){
        arr1[s1.charAt(i)-'a']++;
        arr2[s2.charAt(i)-'a']++;
       }
       if(isMatched(arr1,arr2)) return true; 
       for(int i=1;i<=m-n;i++){
         arr2[s2.charAt(i-1)-'a']--;
         arr2[s2.charAt(i+n-1)-'a']++;
        if(isMatched(arr1,arr2)){
            return true;
        }
       }
       return false;
    }    

      private boolean isMatched(int arr1[],int arr2[]){
        for(int i=0;i<26;i++){    
            if(arr1[i]!=arr2[i]){    
                return false;    
            }    
         }   
        return true;    
    }    
}  
           
        
         
        
     
    
