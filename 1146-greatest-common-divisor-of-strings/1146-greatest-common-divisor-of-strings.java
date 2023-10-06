class Solution {
    public String gcdOfStrings(String str1, String str2) {
        String a = str1+str2;
        String b = str2+str1;
        if(!a.equals(b))
            return "";
        return a.substring(0,GCD(str1.length(),str2.length()));
    }
    int GCD(int a, int b){
        if(b == 0)
            return a;
        return GCD(b,a%b);
    }
}