class Solution {
    public int prefixCount(String[] words, String pref) {
        int count = 0;
        for(String str:words){
            boolean b = true;
            for(int i=0;i<pref.length() && i<str.length();i++){
                if(str.charAt(i)!=pref.charAt(i)){
                    b = false;
                    break;
                }
            }
            if(b && str.contains(pref))
                count++;
        }
        return count;
    }
}