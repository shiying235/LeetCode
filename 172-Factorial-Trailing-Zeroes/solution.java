public class Solution {
    public int trailingZeroes(int n) {
        // int numOfFive = 0;
        // while(n>1){
        //     n /= 5;
        //     numOfFive += n;
        // }
        // return numOfFive;
        
        return n==0?0:n/5+trailingZeroes(n/5);
    }
}