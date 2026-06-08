class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
            return false;
        
        int arr[]=new int[50];
        for(int i=0;i<s.length();i++){
           int a1 = t.charAt(i)-'a';
           int a2 = s.charAt(i)-'a';
           arr[a1]--;
           arr[a2]++;
        }
        for(int p:arr){
            if(p!=0) return false;
        }
        return true;
    }
}
