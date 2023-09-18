class Solution {
    public boolean isPowerOfThree(int n) {
        int i = 0;
        while(true){
            long a = (long)Math.pow(3,i++);
            if(a == n)
                return true;
            if(a>n)
                break;
        }
        return false;
    }
}