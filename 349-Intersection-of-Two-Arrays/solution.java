public class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet set1=new HashSet();
        HashSet result=new HashSet();
        
        for(int i=0;i<nums1.length;i++)
            set1.add(nums1[i]);
        
        for(int i=0;i<nums2.length;i++){
            if(set1.contains(nums2[i])) result.add(nums2[i]);
        }
        int[] intersection=new int[result.size()];
        Iterator iterator=result.iterator();
        int i=0;
        while(iterator.hasNext()){
            intersection[i++]=(Integer)iterator.next();
        }
        return intersection;
    }
}