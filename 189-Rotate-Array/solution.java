public class Solution {
    public void rotate(int[] nums, int k) {
        int[] earray= new int[k];
        for(int i=0;i<k;i++){
            //System.out.println(nums.length-k);
            earray[i]=nums[i+nums.length-k+1];
        }
        for(int i=nums.length-k-1;i>=k;i--)
            nums[i]=nums[i-k];
        for(int i=0;i<k;i++)
            nums[i]=earray[i];
    }
}