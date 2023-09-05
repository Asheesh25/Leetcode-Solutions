class Solution {
    public boolean areOccurrencesEqual(String s) {
        HashMap<Character,Integer> h = new HashMap<>();
        for(char c:s.toCharArray())
            h.put(c,h.getOrDefault(c,0)+1);
        int a = h.get(s.charAt(0));
        for(int num:h.values())
            if(num!=a)
                return false;
        return true;
    }
}