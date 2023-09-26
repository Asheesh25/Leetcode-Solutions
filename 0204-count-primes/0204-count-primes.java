class Solution {
    public int countPrimes(int n) {
        boolean[] arr = new boolean[n+1];
        for(int i=2;i*i<=n;i++)
            if(isPrime(i))
                for(int j=i*2;j<=n;j+=i)
                    arr[j] = true;
        int count = 0;
        for(int i=2;i<arr.length-1;i++)
            if(!arr[i])
                count++;
        return count;
    }
    boolean isPrime(int num){
        for(int i=2;i*i<=num;i++)
            if(num%i==0)
                return false;
        return true;
    }
}