class Solution {
    public boolean isPowerOfFour(int n) {       
        return n<=0 ? false : ((n&(n-1)) == 0 && (int)(Math.log(n)/Math.log(2))%2 == 0)? true:false;
    }
}