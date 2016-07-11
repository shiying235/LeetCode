public class Solution {
    public int lengthOfLastWord(String s) {
        int len = 0;
        for( int i = s.trim().length() -1 ; i >= 0 ; i--){
            if( s.trim().charAt(i) == ' ') return len;
            else len++;
        }
        return len;
    }
}