public class Solution {
    public int majorityElement(int[] nums) {
//------------Function 1---------------------------------------
        // Arrays.sort(nums);
        // return nums[nums.length/2];

//------------Function 2: vote algorithm-----------------------
    //     int main=nums[0];
    //     int count=0;
    //     for(int i=0;i<nums.length;i++){
    //         if(count==0){
    //             main =nums[i];
    //             count++;
    //         }else if(main==nums[i]) count++;
    //         else count--;
    //     }
    //   return main;

//-----------Function 3: HashMap-------------------------------
        Map<> hm=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(hm.get(nums[i])>=nums.length/2) return nums[i];
            hm.put(nums[i],hm.get(nums[i]+1));
        }
    }
    
    // public int findMajority(int start,int end,int[] nums){
    //     int length=end-start;
    //     if(length<2&&nums!=null) return nums[start];
    //     int sub1=findMajority(start,start+length/2,nums);
    //     int sub2=findMajority(start+length/2+1,end,nums);
    //     if(sub1==sub2) return sub1;
        
    // }
}