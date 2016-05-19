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
        Map hm=new HashMap();
        int majority=nums[0];
        for(int i=0;i<nums.length;i++){
            if(hm.containsKey(nums[i])){
                hm.put(nums[i],(int)hm.get(nums[i])+1);
                if((int)hm.get(nums[i])>nums.length/2){
                    majority=nums[i];
                    break;
                }
            }
            else hm.put(nums[i],1);
        }
        return majority;
    }
    
}