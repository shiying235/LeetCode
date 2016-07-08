public class Solution {
    public String addBinary(String a, String b) {
        
        // char[] aarray = a.toCharArray();
        // char[] barray = b.toCharArray();
        // StringBuilder sb = new StringBuilder();
        
        // int lena = a.length()-1;
        // int lenb = b.length()-1;
        // int curr=0;
        // while(lena>-1&&lenb>-1){
        //     int sum =aarray[lena]+barray[lenb]+curr;
        //     int curr=0;
        //     while(sum>1){
        //         curr++;
        //         sum=sum-2;
        //     }
        //     sb.
        // }

        // return null;
        
        a = new StringBuilder(a).reverse().toString();
	b = new StringBuilder(b).reverse().toString();
	int maxLen = Math.max(a.length(), b.length());
	StringBuilder res = new StringBuilder(maxLen);
	int ia, ib, carry = 0;
	for (int i = 0; i <= maxLen; i++) {
		ia = (i < a.length() ? Integer.parseInt(a.charAt(i) + "") : 0);
		ib = (i < b.length() ? Integer.parseInt(b.charAt(i) + "") : 0);
		int sum = ia + ib + carry;
		carry = sum >= 2 ? 1 : 0;
		if (i != maxLen || sum != 0) res.append(sum % 2);
	}
	return res.reverse().toString();
    }
}