public class Solution {
    public void moveZeroes(int[] nums) {
        // for(int i=0,j=0;i<nums.length;i++){
        //     if(nums[j]==0&&nums[i]!=0){
        //         nums[j]=nums[i];
        //         nums[i]=0;
        //         j++;
        //     }else if(nums[j]!=0) j++; 
            
        // }
        if(nums.length<2) return;
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[count++]=nums[i];
            }
        }
        for(;count<nums.length;count++)
            nums[count]=0;
    }
}