public class Solution {
    public void moveZeroes(int[] nums) {
        // if(nums.length<2) return;
        // int count=0;
        // for(int i=0;i<nums.length;i++){
        //     if(nums[i]!=0){
        //         nums[count++]=nums[i];
        //     }
        // }
        // for(;count<nums.length;count++)
        //     nums[count]=0;
        
        if (nums == null || nums.length == 0) return;        

    int insertPos = 0;
    for (int num: nums) {
        if (num != 0) nums[insertPos++] = num;
    }        

    while (insertPos < nums.length) {
        nums[insertPos++] = 0;
    }
    }
}