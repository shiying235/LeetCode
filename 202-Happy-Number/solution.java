public class Solution {
    public boolean isHappy(int n) {
        HashMap cycle=new HashMap();
        ArrayList number = new ArrayList<Integer>();
        int index=n;
        while(index<10){
            number.add(0,index%10);
            index=index/10;
        }
        int num=n;
        while(num!=1){
            if(cycle.containsKey(num)) return false;
            else cycle.put(num,1);
            
            int newNum =0;
            for(int i=0;i<number.size();i++){
                newNum += (int)Math.sqrt((int)number.get(i));
            }
            num=newNum;
            number.clear();
            
            while(newNum<10){
                number.add(0,newNum%10);
                newNum=newNum/10;
            }
            
        }
        
        return true;
        
        
    }
}