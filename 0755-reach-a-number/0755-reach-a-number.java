class Solution {
    public int reachNumber(int target) {
        target = Math.abs(target);
        int sum = 0, i=0;
        while(sum<target){
            sum+=i+1;
            i++;
        }
        while((sum-target)%2!=0){
            sum+=i+1;
            i++;
        }
        return i;
    }
}