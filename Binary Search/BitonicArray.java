class Solution {
    public boolean validMountainArray(int[] arr) {

        int n = arr.length;
        int i = 0;
        while(i<n-1){
            if(arr[i] < arr[i+1]){
                i++;
            }else{
                break;
            }
        }

        if(i == 0 || i == n-1){
            return false;
        }

        while(i<n-1){
            if(arr[i] > arr[i+1]){
                i++;
            }else{
                break;
            }
        }
        return i == n-1;
        
    }
}
