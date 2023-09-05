class Solution {
    public int countPoints(String rings) {
        HashMap<Character,String>  h = new HashMap<>();
        for(int i=0;i<rings.length();i+=2)
            h.put(rings.charAt(i+1),h.getOrDefault(rings.charAt(i+1),"")+rings.charAt(i));
        int count = 0;
        for (String str : h.values())
            if(str.contains("R") && str.contains("G") && str.contains("B"))
                count++;
        return count;
    }
}