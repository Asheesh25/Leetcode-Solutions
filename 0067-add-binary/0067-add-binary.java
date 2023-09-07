import java.math.*;
class Solution {
    public String addBinary(String a, String b) {
        if(a.length()>b.length())
            for(int i=b.length();i<a.length();i++)
                b="0"+b;
        if(b.length()>a.length())
            for(int i=a.length();i<b.length();i++)
                a="0"+a;
        String sum = "",carry = "0";
        for(int i=a.length()-1;i>=0;i--){
            if(carry.equals("1")){
                if(a.charAt(i) == '1' && b.charAt(i) == '1'){
                    sum="1"+sum;
                    carry="1";
                }
                else if(a.charAt(i) == '0' && b.charAt(i) == '0'){
                    sum="1"+sum;
                    carry="0";
                }
                else{
                    sum="0"+sum;
                    carry="1";
                }
            }
            else{
                if(a.charAt(i) == '1' && b.charAt(i) == '1'){
                    sum="0"+sum;
                    carry="1";
                }
                else if(a.charAt(i) == '0' && b.charAt(i) == '0'){
                    sum="0"+sum;
                    carry="0";
                }
                else{
                    sum="1"+sum;
                    carry="0";
                }
            }
        }
        if(carry == "1")
            sum = "1"+sum;
        return sum;
    }
}