class Solution {
    public List<String> simplifiedFractions(int n) {
        List<String> ans = new ArrayList<>();
        HashSet<String> h = new HashSet<>();
        for(int i=1;i<n;i++){
            for(int j = i+1;j<=n;j++){
                int l = hcf(i,j);
                String str = "";
                if(l == 1)
                    str = i+"/"+j;
                else
                    str = (i/l)+"/"+(j/l);
                if(!h.contains(str))
                    ans.add(str);
                h.add(str);
            }
        }
        return ans;
    }
    int hcf(int a, int b){
        if(b == 0)
            return a;
        return hcf(b,a%b);
    }
}