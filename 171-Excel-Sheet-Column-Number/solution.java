public class Solution {
    public int titleToNumber(String s) {
        // char[] sArray = s.toCharArray();
        // int sum=0;
        // for(int i=0;i<sArray.length-1;i++){
        //     sum +=(sArray[i]-'A'+1)*(sArray.length-i-1)*26;
        // }
        // sum += (sArray[sArray.length-1]-'A'+1);
        // return sum;
        
        int sum=0;
        for(int i=0;i<s.length();i++){
            sum *= 26;
            sum += (s.charAt(i)-'A')+1;
        }
        return sum;
    }
}