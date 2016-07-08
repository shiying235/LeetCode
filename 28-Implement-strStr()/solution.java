public class Solution {
    public int strStr(String haystack, String needle) {
        for( int i = 0; ; i++){
            for( int j = 0; ; j++){
                if( j == needle.length()) return i;
                if( i+j >= haystack.length()) return -1;
                if( haystack.charAt( i+j ) != needle.charAt( j )) break;
            }
        }
        //return -1;
        // if( needle.isEmpty() ) return 0;
        // int j = 0;
        // for(int i = 0; i < haystack.length(); i++ ){
        //     while( j < needle.length() && haystack.charAt(i) == needle.charAt(j) ){
        //         j++;
        //         i++;
        //     }
        //     if( j == needle.length() - 1 && haystack.charAt(i) == needle.charAt(j) )
        //         return 0;
        //     else{
        //         i -= j;
        //         j = 0;
        //     }
        // }
        // return -1;
    }
}