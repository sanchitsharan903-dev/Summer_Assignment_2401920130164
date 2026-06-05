class Solution {
    public void reverseString(char[] s) {
        int r = s.length-1;
        int l=0;
        while(r>l){
            char p=s[l];
            s[l]=s[r];
            s[r]=p;
            r--;
            l++;
        }
    }
}
