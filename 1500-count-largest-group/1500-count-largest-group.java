class Solution {
    public int countLargestGroup(int n) {
        HashMap<Integer,Integer> h = new HashMap<>();
        for(int i=1;i<=n;i++){
            int sum = 0,num=i;
            while(num>0){
                sum+=num%10;
                num/=10;
            }
            h.put(sum,h.getOrDefault(sum,0)+1);
        }
        int max = (Collections.max(h.values()));
        int count = 0;
        for(int val:h.values())
            if(val == max)
                count++;
        return count;
    }
}