class Solution {
    public boolean isThree(int n) {
        int count = 0;
        for(int i=1;i*i<=n;i++)
            if(n%i==0)
                count+=2;
        if((int)Math.sqrt(n)*(int)Math.sqrt(n) == n)
            count--;
        if(count == 3)
            return true;
        return false;
    }
}