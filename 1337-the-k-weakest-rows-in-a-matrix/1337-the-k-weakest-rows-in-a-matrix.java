class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        PriorityQueue<ArrayList<Integer>> q = new PriorityQueue<>((al1,al2)->al1.get(1)!=al2.get(1)?al1.get(1)-al2.get(1):al1.get(0)-al2.get(0));
        int index = 0;
        for(int[] arr: mat){
            int count = 0;
            for(int ele:arr){
                if(ele == 0)
                    break;
                count++;
            }
            ArrayList<Integer> al = new ArrayList<>(2);
            al.add(0,index++);
            al.add(1,count);
            q.offer(al);
        }
        int[] ans = new int[k];
        for(int i=0;i<k;i++)
            ans[i] = q.poll().get(0);
        return ans;
        
    }
}