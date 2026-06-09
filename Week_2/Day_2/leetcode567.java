import java.util.*;
class Solution {
    public boolean checkInclusion(String s1, String s2){
        int arr[]=new int[26];
        int brr[]=new int[26];
        for(int i=0;i<s1.length();i++){
            arr[s1.charAt(i)-'a']++;
            brr[s2.charAt(i)-'a']++;
        }
        if(Arrays.equals(arr,brr))  return true;
        for(int i=s1.length();i<s2.length();i++){
            brr[s2.charAt(i)-'a']++;
            brr[s2.charAt(i-s1.length())-'a']--;
            if (Arrays.equals(arr, brr)) return true;
        }
        if(s1.length()>s2.length()) return false;
        return false;
    }
}
