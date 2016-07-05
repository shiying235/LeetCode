public class Solution {
    public int romanToInt(String s) {
        //：Ⅰ（1）Ⅴ（5）Ⅹ（10）L（50）C（100）D（500）M（1000） 
        // rules:位于大数的后面时就作为加数；位于大数的前面就作为减数
        //eg：Ⅲ=3,Ⅳ=4,Ⅵ=6,ⅩⅨ=19,ⅩⅩ=20,ⅩLⅤ=45,MCMⅩⅩC=1980
        //"DCXXI"
        HashMap<Character, Integer> table =new HashMap<Character, Integer>();
        table.put('I',1);
        table.put('V',5);
        table.put('X',10);
        table.put('L',50);
        table.put('C',100);
        table.put('D',500);
        table.put('M',1000);
        
        //int sum=0;
        // int j=0;
        // int curr=0;
        // for(int i=1;i<s.length()+1;i++){
        //     if(i==s.length()){
        //         sum = sum+ table.get(s.charAt(s.length()-1)) +curr;
        //         curr=0;
        //     }
        //     else{
        //         if(table.get(s.charAt(j))>table.get(s.charAt(i))){
        //             if(curr!=0){
        //                 sum +=curr;
        //                 curr=0;
        //             }
        //             sum += table.get(s.charAt(j));
        //             j++;
        //         }
        //         else if(table.get(s.charAt(j))<table.get(s.charAt(i))){
        //             if(curr!=0){
        //                 sum -=curr;
        //                 curr=0;
        //             }
        //             sum -= table.get(s.charAt(j));
        //             j++;
        //         }
        //         else{
        //             curr += table.get(s.charAt(j));
        //             j++;
        //         }
        //     }
        // }
          
        int sum = table.get(s.charAt(s.length()-1));
        int pivot =sum;
        for(int i=s.length()-2;i>=0;i--){
            int curr =table.get(s.charAt(i));
            if(curr>=pivot) sum += curr;
            else sum -= curr;
            pivot=curr;
        }
        return sum;
    }
}