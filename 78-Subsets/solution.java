public class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        List<Integer> subset = new ArrayList<Integer>();
        result.add(subset);
        Arrays.sort(nums);
        subsetsHelper(nums, 0, result, subset);
        return result;
    }
    
    public void subsetsHelper(int[] nums, int start, List<List<Integer>> result, List<Integer> subset){
        for (int i = start; i < nums.length; i++){
            subset.add(nums[i]);
            result.add(new ArrayList<>(subset));
            subsetsHelper(nums, i + 1, result, subset);
            subset.remove(subset.size() - 1);
        }
    }
}