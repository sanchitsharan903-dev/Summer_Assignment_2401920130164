//Week_1/Day_5/leetcode125.java
class Solution{
    public boolean isPalindrome(String s) {
        String rev="";
        String modified = "";
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(Character.isLetterOrDigit(c)){
                modified=modified+Character.toLowerCase(c);
            }
        }
    for(int i=modified.length()-1;i>=0;i--){
        rev=rev+modified.charAt(i);
    }
    return modified.equals(rev);
    }
}
