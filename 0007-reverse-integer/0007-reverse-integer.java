class Solution {
    public int reverse(int x) {
        boolean b = x<0;
        int rev = 0;
        x = Math.abs(x);
        while(x>0){
            rev = rev*10+(x%10);
            x/=10;
            if(rev>((2147483647-(x%10))/10) && x!=0)
                return 0;
        }
        if(b)
            return rev*-1;
        return rev;
    }
}