public class Solution {
    public void rotate(int[] nums, int k) {
        k %= nums.length;
        int[] earray= new int[];
        for(int i=0;i<k;i++)
            earray[i]=nums[i+nums.length-k];
        for(int i=nums.length-k-1;i>=k;i--)
            nums[i]=nums[i-k];
        for(int i=0;i<k;i++)
            nums[i]=earray[i];
    }
}