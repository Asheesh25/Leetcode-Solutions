class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count=0,j=-1;
        switch(ruleKey){
            case "type":
                j=0;
                break;
            case "color":
                j=1;
                break;
            case "name":
                j=2;
                break;
            default:
                j=-1;
        }
        for(List<String> item : items){
            if(item.get(j).equals(ruleValue))
                count++;
        }
        return count;
    }
}