public class Solution {
    public boolean isPalindrome(String s) {
        if(s.isEmpty())
            return true;
            
        int len = s.length() - 1;
        for(int i = 0 ; i < s.length() ; i++){
            if (i > len) break;
            while (!Character.isLetterOrDigit(s.charAt(len)) && len > i)
                len--;
            if(Character.isLetterOrDigit(s.charAt(i))){
                if(Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(len)))
                    return false;
                else len--;
            } 
        }
        return true;
    }
}