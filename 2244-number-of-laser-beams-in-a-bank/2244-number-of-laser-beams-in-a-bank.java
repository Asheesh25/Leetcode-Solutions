class Solution {
    public int numberOfBeams(String[] bank) {
        int ans = 0;
        ArrayList<Integer> al = new ArrayList<>();
        for(String str:bank){
            int count = 0;
            for(char c:str.toCharArray())
                if(c == '1')
                    count++;
            al.add(count);
        }
        for(int i=0;i<al.size()-1;i++){
            int count = 0;
            for(int j=i+1;j<al.size();j++){
                if(al.get(j) == 0)
                    count++;
                else{
                    ans+=al.get(i)*al.get(j);
                    break;
                }
            }
            if(count == al.size()-i-1)
                break;
        }
        return ans;
    }
}