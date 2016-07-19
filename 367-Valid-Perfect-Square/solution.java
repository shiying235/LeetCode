public class Solution {
    public boolean isPerfectSquare(int num) {
        long start = 1;
        long end = num / 2;
        while (start + 1 < end){
            long mid = start + (end - start) / 2;
            if(mid * mid == num){
                return true;
            }else if(mid * mid > num){
                end = mid;
            }else{
                start = mid;
            }
        }
        if(start * start == num || end * end == num){
            return true;
        }
        return false;
    }
}