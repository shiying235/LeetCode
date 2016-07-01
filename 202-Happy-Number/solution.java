public class Solution {
    public boolean isHappy(int n) {
        HashMap cycle=new HashMap();
        int num=n;
        while(num!=1){
            if(cycle.containsKey(num)) return false;
            else cycle.put(num,1);
            
            int index=num;
            int newNum =0;
            while(index>9){
                newNum +=  (index%10)*(index%10);
                index=index/10;
            }
           newNum += (index%10)*(index%10);
            num=newNum;
        }
        return true;
    }
}