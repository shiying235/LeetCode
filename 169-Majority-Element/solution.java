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
        int main=nums[0];
        int max=1;
        for(int i=0;i<nums.length;i++){
            if(hm.get(nums[i])!=null){
                int num=(int)hm.get(nums[i]);
                if(num+1>nums.length/2) return nums[i];
                hm.put(nums[i],num+1);
                if(num+1>max]){
                    if(main!=nums[i]){
                    main=nums[i];
                    max=num+1;
                    }else max++;
                }
            }
            else hm.put(nums[i],1);
        }
        return main;
    }
    
}