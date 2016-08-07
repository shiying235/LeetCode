public class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        List<Integer> subset = new ArrayList<Integer>();
        result.add(subset);
        Arrays.sort(nums);
        subsetsHelper(nums, 0, result, subset);
        return result;
    }
    
    public void subsetsHelper(int[] nums, int start, List<List<Integer>> result, List<Integer> subset){
        for (int i = start; i < nums.length; i++){
            if (i != start && nums[i] == nums[i-1]){
                continue;
            }
            subset.add(nums[i]);
            subsetsHelper(nums,i + 1, result, subset);
            result.add(new ArrayList<>(subset));
            subset.remove(subset.size() - 1);
        }
    }
}