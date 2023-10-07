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

        int[] arr = {1,4,5,9,10,40,50,90,100,400,500,900,1000};
        String ans = "";
        while(num!=0) {
            for (int i = arr.length - 1; i >= 0; i--) {
                if (num / arr[i] > 0) {
                    System.out.println(num);
                    num -= arr[i];
                    ans += h.get(arr[i]);
                    break;
                }
            }
        }
        return ans;
    }
}