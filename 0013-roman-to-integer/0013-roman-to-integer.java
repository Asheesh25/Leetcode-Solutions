class Solution {
    public int romanToInt(String s) {
        HashMap<Character,Integer> h = new HashMap<>();
        h.put('I',1);
        h.put('V',5);
        h.put('X',10);
        h.put('L',50);
        h.put('C',100);
        h.put('D',500);
        h.put('M',1000);
        int ans = 0; 
        for(int i=0;i<s.length()-1;i++){
            char a = s.charAt(i), b=s.charAt(i+1);
            if(h.get(a)>=h.get(b))
                ans+=h.get(a);
            else
                ans-=h.get(a);
        }
        return ans+h.get(s.charAt(s.length()-1));
    }
}