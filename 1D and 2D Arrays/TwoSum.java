import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] ans = new int[2];
        int k = 0;
        int n = nums.length;
        for(int i = 0; i<n; i++){
            int req = target - nums[i];
            if(map.containsKey(req)){
                ans[k++] = map.get(req);
                ans[k] = i;
            }
            map.put(nums[i], i);
        }
        return ans;
    }
}
public class TwoSum{

    
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = {2,7,11,15};
        int target = 9;
        int[] ans = s.twoSum(nums, target);
        System.out.println(ans[0] + " " + ans[1]);
        
    }
}