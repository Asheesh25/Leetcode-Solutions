class Solution {
    public int[] singleNumber(int[] nums) {
       int[] ans = new int[2];
       int a = 0;
        HashSet<Integer> h = new HashSet<>();
        for(int num:nums){
          h.add(num);
          a^=num;
        }  
        int index = 0;
        for(int num:nums)
          if(h.contains(num^a))
            ans[index++] = num^a;
        return ans;
    }
}