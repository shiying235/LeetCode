public class NumArray {
    int[] sum;
    public NumArray(int[] nums) {
        for( int i=1;i<nums.length;i++ )
            nums[i] += nums[i-1];  ////------??why can not be sum[i] = sum[i-1]+nums[i]
        sum = nums;
    }

    public int sumRange(int i, int j) {
        // int sum = 0;
        // for( int n = i; n <= j; n++){
        //     sum += aa[n];
        // }
        if(i == 0)
            return sum[j];
        return sum[j]- sum[i-1];
    }
}


// Your NumArray object will be instantiated and called as such:
// NumArray numArray = new NumArray(nums);
// numArray.sumRange(0, 1);
// numArray.sumRange(1, 2);