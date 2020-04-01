class Solution {
    public int search(int[] nums, int target) {
        if(nums == null || nums.length < 1)
            return -1;
        
        // At any given time, at-least one half is sorted
        // Always try to adjust pointers based on knowledge of SORTED part
        // Converge TOWARDS target based on boundaries of the SORTED part
        
        int low = 0;
        int high = nums.length - 1;
        
        while(low <= high) {
            int mid = low + (high - low) / 2;
            
            if(target == nums[mid])
                return mid;
            
            
            if(nums[low] <= nums[mid]) {                            // First half is sorted
                if(target >= nums[low] && target < nums[mid])
                    high = mid - 1;
                else
                    low = mid + 1;
            } else {                                                // Second half is sorted
                if(target > nums[mid] && target <= nums[high])
                    low = mid + 1;
                else
                    high = mid - 1;
            }
        }
        
        return -1;
    }
}
