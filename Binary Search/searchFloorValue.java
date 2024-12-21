public class searchFloorValue {

        public static void main(String[] args) {
    
            int arr[] = {4, 4, 8, 8, 8, 15, 16, 23, 23, 42};

            
            int ans = binarySearchFloor(arr, 79);
            System.out.println("The floore value is "  + ans);
        }
    
        static int binarySearchFloor(int arr[], int target){
            int ans = -1;
            int start = 0;
            int end = arr.length-1;
            while(start <= end){
                int mid = start + (end-start)/2;
                if(arr[mid] == target){
                    ans = arr[mid];
                    break;
                }else if(arr[mid] < target){
                    start = mid + 1;
                    ans = arr[mid];
                }else{
                    end = mid - 1;
                }
            }
            return ans;
        }
}
