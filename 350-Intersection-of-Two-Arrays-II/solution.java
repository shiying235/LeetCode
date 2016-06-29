public class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        
        int size=0;
        if(nums1.length<=nums2.length) size=nums1.length;
        else size=nums2.length;
        
        int i=0;
        int j=0;
        int num=0;
        int[] intersection=new int[size];
        while(i<nums1.length&&j<nums2.length){
            if(nums1[i]==nums2[j]){
                intersection[num]=nums1[i];
                num++;
                i++;
                j++;
            }
            else if(nums1[i]>nums2[j]) j++;
            else i++;
        }
        
        return Arrays.copyOfRange(intersection, 0, num);
    }
}