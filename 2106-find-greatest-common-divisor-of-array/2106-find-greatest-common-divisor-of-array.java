class Solution {
    public int findGCD(int[] nums) {
        int small = 1001, high = 0;
        for(int num:nums){
            if(num<small)
                small = num;
            if(num>high)
                high = num;
        }
        return gcd(small,high);
    }
    int gcd(int num1,int num2){
        if(num2 == 0)
            return num1;
        return gcd(num2,num1%num2);
    }
}