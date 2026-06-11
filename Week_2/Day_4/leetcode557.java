class Solution {
    public String reverseWords(String s) {
        String a[]=s.split(" ");
        StringBuilder b=new StringBuilder();
        for(int i=0;i<a.length;i++){
            StringBuilder stb=new StringBuilder(a[i]);
            b.append(stb.reverse());
            if(i!=a.length-1) b.append(" "); 
        }
        return b.toString();
    }
}
