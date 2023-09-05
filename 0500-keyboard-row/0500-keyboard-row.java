class Solution {
    public String[] findWords(String[] words) {
        String str1 = "qwertyuiop";
        String str2 = "asdfghjkl";
        String str3 = "zxcvbnm";
        ArrayList<String> al = new ArrayList<>();

        int index = 0;
        for(String str: words){
            boolean b1 = true;
            boolean b2 = true;
            boolean b3 = true;
            for(char c:str.toCharArray()){
                String s = (c+"").toLowerCase();
                if(!str1.contains(s))
                    b1 = false;
                if(!str2.contains(s))
                    b2 = false;
                if(!str3.contains(s))
                    b3 = false;
                if(!b1 && !b2 && !b3)
                    break;
            }
            if(b1 || b2 || b3)
                al.add(str);
        }
        String[] ans = new String[al.size()];
        for(int i=0;i<al.size();i++)
            ans[i] = al.get(i);
        return ans;
    }
}