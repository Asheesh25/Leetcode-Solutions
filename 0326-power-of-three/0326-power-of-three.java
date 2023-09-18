class Solution {
    public boolean isPowerOfThree(int n) {
        if(n == 2147483647)
            return false;
        int i = 0;
        while(true){
            int a = (int)Math.pow(3,i++);
            if(a == n)
                return true;
            if(a>n)
                break;
        }
        return false;
    }
}