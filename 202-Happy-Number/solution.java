public class Solution {
    public boolean isHappy(int n) {
        HashSet cycle=new HashSet();
        int num=n;
        while(num!=1){
            if(cycle.add(num)){
                 int index=num;
                int newNum =0;
                while(index>0){
                    newNum +=  (index%10)*(index%10);
                    index=index/10;
                }
                num=newNum;
            }else return false;
           
        }
        return true;
    }
}