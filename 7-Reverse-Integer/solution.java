public class Solution {
    public int reverse(int x) {
        // boolean flag = false;
        // if(x<0){
        //     flag=true;
        //     x=0-x;
        // }
        
        int result =0;
        while(x != 0){
            result = result*10 + x%10;
            x /= 10;
        }
        if((result>INT_MAX)||(result<INT_MIN))
                             return 0;
        return result;
    }
}