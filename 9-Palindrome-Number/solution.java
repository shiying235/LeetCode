public class Solution {
    public boolean isPalindrome(int x) {
        if(10>x&&x>=0) return true;
        int k=x;
        int y=0;
        while(k>0){
            y *= 10;
            y += k%10;
            k /= 10;
        }
        if(y==x) return true;
        else return false;
    }
}