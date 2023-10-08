class Solution {
    public String intToRoman(int num) {
        HashMap<Integer,String> h = new HashMap<>();
        h.put(1,"I");
        h.put(4,"IV");
        h.put(5,"V");
        h.put(9,"IX");
        h.put(10,"X");
        h.put(40,"XL");
        h.put(50,"L");
        h.put(90,"XC");
        h.put(100,"C");
        h.put(400,"CD");
        h.put(500,"D");
        h.put(900,"CM");
        h.put(1000,"M");

        int[] arr = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        StringBuilder ans = new StringBuilder();
        while(num!=0) {
            for (int i = 0; i < arr.length; i++) {
                if (num - arr[i] >= 0) {
                    ans.append(h.get(arr[i]));
                    num-=arr[i];
                    break;
                }
            }
        }
        return ans.toString();
    }
}