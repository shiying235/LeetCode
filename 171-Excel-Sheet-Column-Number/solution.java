public class Solution {
    public int titleToNumber(String s) {
        // char[] sArray = s.toCharArray();
        // int sum=0;
        // for(int i=1;i<sArray.length;i++){
        //     sum += (sArray[i]-'A'+1)%26*(sArray.length-i-1)*26;
        // }
        // sum += (sArray[sArray.length-1]-'A'+1)%26;
        // return sum;
        
        int sum=0;
        for(int i=0;i<s.length();i++){
            sum *= 26;
            sum += (s.charAt(i)-'A')+1;
        }
        return sum;
    }
}