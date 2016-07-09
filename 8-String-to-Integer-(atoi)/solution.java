public class Solution {
    public int myAtoi(String str) {
        if (str.isEmpty()) return 0;
        int result = 0;
        int sign = 1;
        int i = 0;
        
        while( i < str.length() && str.charAt(i) == ' '  )
            i++;
        if( str.charAt(i) == '-' || str.charAt(i) == '+'){
            sign =  str.charAt( i++ ) == '-' ? -1 : 1;
        }
        while( i < str.length() && str.charAt(i) >= '0' && str.charAt(i) <= '9'){
            if( result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && str.charAt(i) - '0' > 7 ))
                return sign == -1 ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            result = result * 10 + str.charAt(i++) - '0';
        }
            
        return result*sign;  
        // for(int i = 0; i < str.length(); i++){
        //     if( !Character.isDigit(str.charAt(i)) )
        //         continue;
        //     if(result + (int)str.charAt(i) > Integer.MAX_VALUE)
        //         return 0;
        //     result += (int)str.charAt(i);
        // }
        // return result;
    }
}