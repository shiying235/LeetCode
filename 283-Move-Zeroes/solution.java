public class Solution {
    public void moveZeroes(int[] nums) {
        for(int i=0,j=0;i<nums.length;i++){
            if(nums[j]==0&&nums[i]!=0){
                nums[j]=nums[i];
                nums[i]=0;
                j++;
            }else if(nums[j]!=0) j++; 
            
        }
    }
}