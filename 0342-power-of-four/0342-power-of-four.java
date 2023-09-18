class Solution {
    public boolean isPowerOfFour(int n) {
        int countZero = 0,countOne = 0;
        String str = Integer.toBinaryString(n);
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == '0')
                countZero++;
            else
                countOne++;
        }
        if(countOne == 1 && countZero%2 == 0)
            return true;
        return false;
    }
}