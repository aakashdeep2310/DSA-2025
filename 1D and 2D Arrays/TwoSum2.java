class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
        int n = numbers.length;
        int ans[] = new int[2];

        int k = 0;
        int i = 0;
        int j = n-1;
        while(i<j){
            if(numbers[i] + numbers[j] == target){
                ans[k++] = i+1;
                ans[k] = j+1;
                return ans;
            }

            if(numbers[i] + numbers[j] < target){
                i++;
            }else{
                j--;
            }
        }
        return ans;
    }
}

public class TwoSum2 {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = {2,7,11,15};
        int target = 9;
        int[] ans = s.twoSum(nums, target);
        System.out.println(ans[0] + " " + ans[1]);
    }
    
}
