class Solution {
    public boolean checkIfExist(int[] arr) {
        HashMap<Integer,Integer> h = new HashMap<>();
        for(int num:arr)
            h.put(num,h.getOrDefault(num,0)+1);
        for(int i=0;i<arr.length;i++){
            if(arr[i] == 0 && h.get(arr[i]) == 1)
                continue;
            if(h.containsKey(2*arr[i]))
                return true;
        }
        return false;
    }
}