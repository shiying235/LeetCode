public class Solution {
    public void rotate(int[] nums, int k) {
        k %= nums.length;
       // k=k%nums.length;
        int[] earray= new int[k];
        for(int i=0;i<k;i++)
            earray[i]=nums[i+nums.length-k];
        for(int i=nums.length-1;i>=k;i--)
            nums[i]=nums[i-k];
        for(int i=0;i<k;i++)
            nums[i]=earray[i];
    }
}