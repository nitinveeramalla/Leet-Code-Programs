class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] spots = {-1,-1};
        int i = 0;
        int j = nums.length-1;
        while(i<nums.length){
            if(nums[i]==target){
                spots[0] = i;
                break;
            }
            i++;
        }
        while(j>=i){
            if(nums[j]==target){
                spots[1] = j;
                break;
                }
            j--;
        }
       return spots;
    }
}
