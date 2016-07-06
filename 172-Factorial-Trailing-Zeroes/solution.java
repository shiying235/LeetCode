public class Solution {
    public int trailingZeroes(int n) {
        int numOfTwo = 0;
        int numOfFive = 0;
        int numOfTen = 0;
        while(n>1){
            if(n%10==0){
                n /= 10;
                numOfTen ++;
            }
            else{
                if(n%2==0){
                    n /= 2;
                    numOfTwo ++;
                }
                if(n%5==0){
                    n /= 5;
                    numOfFive ++;
                }
            }
        }
        if((numOfTwo!=0)&&(numOfFive!=0)) return numOfTwo>numOfFive?(numOfTen+numOfTwo):(numOfTen+numOfFive);
        else return numOfTen;
    }
}