class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int a=s.length();
        for(int i=1;i<=a/2;i++){
            if(a%i==0){
                String st=s.substring(0,i);
                StringBuilder stb=new StringBuilder();
                int p=a/i;
                for(int j=0;j<p;j++) stb.append(st);
                if(stb.toString().equals(s)) return true;
            }
        }
        return false;
    }
}
