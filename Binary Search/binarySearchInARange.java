public class binarySearchInARange {

        public static void main(String[] args) {
            int arr[] = { 2, 2, 4, 5, 7, 9, 25, 56, 88, 94 };

            int range[] = findRangeInInfininteArray(arr, 8);

            int ans = binarySearchInRange(arr, 8, range[0], range[1]);

            System.out.println("Range is : " + range[0] + " , " + range[1]);

            if(ans == -1){
                System.out.println("Element does not exist");
            }else{
                System.out.println("Element found at index : " + ans);
            }
        }

        static int[] findRangeInInfininteArray(int arr[], int target){

            int range[] = new int[2];
            int start = 0;
            int end = 1;
            while(arr[end] < target){
                start = end;
                end = 2 * end;
            }

            range[0] = start;
            range[1] = end;

            return range;
        }
    
        static int binarySearchInRange(int arr[], int target, int start, int end) {
    
            if(arr.length == 0){
                return 0;
            }
            
            int ans = -1;
           
            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (arr[mid] == target) {
                    ans = mid;
                    break;
                } else if (arr[mid] < target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
            return ans;
        }
}
