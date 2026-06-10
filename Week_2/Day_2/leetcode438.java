import java.util.*;
class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> l=new ArrayList<>();
        if(p.length()>s.length()) return l;
        int arr[]=new int[50];
        int brr[]=new int[50];
        for(int i=0;i<p.length();i++){
            arr[p.charAt(i)-'a']++;
            brr[s.charAt(i)-'a']++;
        }
        if(Arrays.equals(arr,brr)) l.add(0);
        for(int i=p.length();i<s.length();i++){
            brr[s.charAt(i)-'a']++;
            brr[s.charAt(i-p.length())-'a']--;
            if(Arrays.equals(arr,brr)) l.add(i-p.length()+1);
        }
        return l;
    }
}
