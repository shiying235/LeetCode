public class Solution {
    public String reverseString(String s) {
        // char[] result = s.toCharArray();
        // int i = 0;
        // int j = result.length - 1;
        // while(i<j){
        //     char temp = result[i];
        //     result[i] = result [j];
        //     result[j] = temp;
        //     i++;
        //     j--;
        // }
        // return new String(result);
        
        Stack st = new Stack();
        for(int i = 0; i < s.length();i++){
            st.push(s.charAt(i));
        }
        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty())
            sb.append(st.pop());
        return sb.toString();
    }
}