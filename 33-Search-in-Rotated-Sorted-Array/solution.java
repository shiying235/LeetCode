public class Solution {
    public int search(int[] nums, int target) {
        int head = findMin(nums);
        int start = 0;
        int end = nums.length - 1;
        if(target < nums[head]){
            return -1;
        }else if(target >= nums[head] && target <= nums[end]){
            start = head;
        }else{
            end = head;
        }
        while(start + 1 < end){
            int mid = start + (end - start) / 2;
            if(nums[mid] == target){
                return mid;
            }else if(nums[mid] < target){
                start = mid;
            }else{
                end = mid;
            }
        }
        
        if(nums[start] == target){
            return start;
        }else if(nums[end] == target){
            return end;
        }else{
            return -1;
        }
        // nums = reverseArray(nums, 0, head - 1);
        // nums = reverseArray(nums, head, nums.length - 1);
        // nums = reverseArray()
    }
    
    public int findMin(int[] nums){
        int start = 0;
        int end = nums.length - 1;
        while(start + 1 < end){
            int mid = start + (end - start) / 2;
            if(nums[mid] > nums[end]){
                start = mid;
            }else{
                end = mid;
            }
        }
        return nums[start] > nums[end] ? end : start;
    }
    
    // public int[] reverseArray(int[] nums, int start, int end){
    //     while(start < end){
    //         int temp = nums[start];
    //         nums[start] = nums[end];
    //         nums[end] = temp;
    //         start ++;
    //         end --;
    //     }
    //     return nums;
    // }
}