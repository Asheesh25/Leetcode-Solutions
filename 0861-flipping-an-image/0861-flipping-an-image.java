class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for(int[] arr:image){
            int len = arr.length;
            for(int j=0;j<(len+1)/2;j++){
                int temp = arr[j]^1;
                arr[j] = arr[len-1-j]^1;
                arr[len-1-j] = temp;
            }
        }
        return image;
    }
}