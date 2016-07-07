public class Solution {
    public boolean isPalindrome(int x) {
        if(10>x>=0) return true;
        int y=0;
        while(x>0){
            y=y*10+x%10;
            x /= 10;
        }
        if(y==x) return true;
        else return false;
    }
}