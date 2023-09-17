class Solution {
    public int largestInteger(int num) {
        PriorityQueue<Integer> pqEven = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> pqOdd = new PriorityQueue<>(Collections.reverseOrder());
        int size = (int)(Math.log10(num)+1);
        int s = size;
        int[] arr = new int[size];
        while(num!=0){
            int a = num%10;
            if(a%2 == 0)
                pqEven.add(a);
            else
                pqOdd.add(a);
            arr[--size] = a;
            num/=10;
        }
        for(int i=0;i<s;i++){
            if(arr[i]%2 == 0)
                arr[i] = pqEven.remove();
            else
                arr[i] = pqOdd.remove();  
        }
        int ans = 0;
        for(int i=0;i<s;i++)
            ans = ans*10 + arr[i];
        return ans;
    }
}