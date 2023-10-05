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
            for(int j=i+1;j<al.size();j++){
                if(al.get(j) == 0)
                    continue;
                else{
                    ans+=al.get(i)*al.get(j);
                    break;
                }
            }
        }
        return ans;
    }
}