public class Solution {
    public String longestCommonPrefix(String[] strs) {
        if( strs == null || strs.length == 0) return "";
        String pre = strs[0];
        for( int i = 0; i<strs.length; i++ )
            while( strs[i].indexOf(pre) !=0 )
                pre = pre.substring(0,pre.length()-1 );
        return pre;
        
        
        // int result = 0;
        
        // for( int i = 0; i < strs[0].length(); i++ ){
        //     boolean flag = true;
        //     char test = strs[0].charAt( i );
        //     for( int j = 0; j<strs.length; j++ ){
        //         if( strs[j].charAt(i) == null || strs[j].charAt(i) != strs[0].charAt(i) ){
        //             flag = false;
        //             break;
        //         }
        //     }
        //     if( flag == true ) result++;
        //     else break;
        // }
        // return strs[0].substring(0,result);
    }
}