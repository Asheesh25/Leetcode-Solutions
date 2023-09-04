class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        HashMap<Integer,Integer> countOfLosses = new HashMap<>();
        ArrayList<Integer> zeroLoss = new ArrayList<>(); 
        ArrayList<Integer> oneLoss = new ArrayList<>();

        for(int[] match:matches){
            countOfLosses.put(match[0],countOfLosses.getOrDefault(match[0],0)+0);
            countOfLosses.put(match[1],countOfLosses.getOrDefault(match[1],0)+1);
        }

        countOfLosses.forEach((k,v)->{
            if(v == 0)
                zeroLoss.add(k);
            else if(v == 1)
                oneLoss.add(k);
        });
        Collections.sort(zeroLoss);
        Collections.sort(oneLoss);
        return Arrays.asList(zeroLoss,oneLoss);
    }
}