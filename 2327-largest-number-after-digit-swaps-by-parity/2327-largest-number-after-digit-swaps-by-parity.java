class Solution {
    public int largestInteger(int num) {
        int len = (int)(Math.log10(num)+1);
        int[] arr = new int[len];
        for(int i=len-1;i>=0;i--){
            arr[i] = num%10;
            num/=10;
        }
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]%2 == 0 && arr[j]%2==0 && arr[j]>arr[i]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                if(arr[i]%2 == 1 && arr[j]%2 == 1 && arr[j]>arr[i]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        int ans = 0;
        for(int i=0;i<len;i++)
            ans=ans*10+arr[i];
        return ans;
    }
}