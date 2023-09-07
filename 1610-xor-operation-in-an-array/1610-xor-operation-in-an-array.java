class Solution {
    public int xorOperation(int n, int start) {
        int[] arr = new int[n];
        int count = 0;
        while(count<n)
            arr[count] = start+(2*count++);
        int ans = 0;
        for(int num:arr)
            ans^=num;
        return ans;
    }
}