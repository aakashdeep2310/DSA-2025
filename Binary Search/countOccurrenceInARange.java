public class countOccurrenceInARange {
        public static void main(String[] args) {
    
            int arr[] = {4, 4, 8, 8, 8, 15, 16, 23, 23, 42};

            int first = binarySearch(arr, 90, true);
            int second = binarySearch(arr, 90, false);
            if(first == -1){
                System.out.println("The no. of count of occurrence of the target is: "  + 0);

            }else{
                System.out.println("The no. of count of occurrence of the target is: " + (second - first + 1));
            }
        }
    
        static int binarySearch(int arr[], int target, boolean isFirst){
            int ans = -1;
            int start = 0;
            int end = arr.length-1;
            while(start <= end){
                int mid = start + (end-start)/2;
                if(arr[mid] == target){
                    ans = mid;
                    if(isFirst){
                        end = mid - 1;
                    }else{
                        start = mid + 1;
                    }
                }else if(arr[mid] < target){
                    start = mid + 1;
                }else{
                    end = mid - 1;
                }
            }
            return ans;
        }
    }
