public class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
        //return findMajority(0,nums.length-1,nums);
    }
    
    // public int findMajority(int start,int end,int[] nums){
    //     int length=end-start;
    //     if(length<2&&nums!=null) return nums[start];
    //     int sub1=findMajority(start,start+length/2,nums);
    //     int sub2=findMajority(start+length/2+1,end,nums);
    //     if(sub1==sub2) return sub1;
        
    // }
}