class Solution {
    public int lengthOfLongestSubstring(String s) {
        int a=0,b=0;
        HashSet<Character> c=new HashSet<>();
        for(int i=0;i<s.length();i++){
            while(c.contains(s.charAt(i))){
                c.remove(s.charAt(a));
                a++;
            }
            c.add(s.charAt(i));
            b=Math.max(b,i-a+1);
        }
        return b;
    }
}
