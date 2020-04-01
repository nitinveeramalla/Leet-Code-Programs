class Solution {
    public int search(int[] nums, int target) {
        int temp=-1;
        for(int i=0;i<nums.length;i++){
        if(nums[i]==target){
            temp = i;
            break;
        }
            else if(nums[i]!=target){
                continue;
            }
       }
        if(temp>=0){
            temp = temp;
        }
        else temp = -1;
        return temp;
    }
}
