class Solution {
    public int strStr(String haystack, String needle) {
        int a=needle.length();
        int b=haystack.length();
        for(int i=0;i<=b-a;i++) {
            int p=0;
            while(p<a && haystack.charAt(i+p)==needle.charAt(p)){
                p++;
            }
            if(p==a) return i;
        }
        return -1;
    }
}
