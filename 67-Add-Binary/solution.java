public class Solution {
    public String addBinary(String a, String b) {
        
        char[] aarray = a.toCharArray();
        char[] barray = b.toCharArray();
        StringBuilder sb = new StringBuilder();
        
        int lena = a.length()-1;
        int lenb = b.length()-1;
        int curr=0;
        while(lena>-1||lenb>-1||curr==1){
            int ia = lena > -1 ? Character.getNumericValue(aarray[lena--]):0;
            int ib = lenb > -1 ? Character.getNumericValue(barray[lenb--]):0;
            int result =  ia ^ ib ^ curr;
            curr = ((ia + ib) > 1)) ? 1 : 0; 
            sb.append( result);
            
        }

        return sb.reverse().toString();
        
        // if(a == null || a.isEmpty()) {
        //     return b;
        // }
        // if(b == null || b.isEmpty()) {
        //     return a;
        // }
        // char[] aArray = a.toCharArray();
        // char[] bArray = b.toCharArray();
        // StringBuilder stb = new StringBuilder();

        // int i = aArray.length - 1;
        // int j = bArray.length - 1;
        // int aByte;
        // int bByte;
        // int carry = 0;
        // int result;

        // while(i > -1 || j > -1 || carry == 1) {
        //     aByte = (i > -1) ? Character.getNumericValue(aArray[i--]) : 0;
        //     bByte = (j > -1) ? Character.getNumericValue(bArray[j--]) : 0;
        //     result = aByte ^ bByte ^ carry;
        //     carry = ((aByte + bByte + carry) >= 2) ? 1 : 0;
        //     stb.append(result);
        // }
        // return stb.reverse().toString();
        
    }
}