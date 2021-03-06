public class Solution {
    public int findMin(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while (start + 1 < end){
            int mid = start + (end - start) / 2;
            if (nums[mid] < nums[mid -1]){
                return nums[mid];
            }
            else if(nums[end] > nums[mid]){
                end = mid;
            }
            else{
                start = mid;
            }
        }
        return nums[start] < nums[end] ? nums[start] : nums[end];
    }
}