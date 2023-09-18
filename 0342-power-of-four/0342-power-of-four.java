class Solution {
    public boolean isPowerOfFour(int n) {       
        return n<=0 ? false : ((n&(n-1)) == 0 && Integer.toBinaryString(n).length()%2 == 1)? true:false;
    }
}