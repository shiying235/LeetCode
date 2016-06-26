public class Solution {
    public boolean isIsomorphic(String s, String t) {
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();
        HashMap sMap = new HashMap();
        HashMap tMap = new HashMap();
        for(int i=0;i<sArray.length;i++){
            if(sMap.containsKey(sArray)) sMap.put(sArray[i],(int)sMap.get(sArray[i])+1);
            else sMap.put(sArray[i],1);
            if(tMap.containsKey(tArray)) tMap.put(tArray[i],(int)tMap.get(tArray[i])+1);
            else tMap.put(tArray[i],1);
        }
        if(sMap.size()==tMap.size()){
            HashMap sList = (HashMap)sMap.values();
            HashMap tList = (HashMap)tMap.values();
            if(sList==tList) return true;
            else return false;
            // Set set=tMap.keySet();
            // while(!map.isEmpty()) {
            //     if(tMap.containsValue(map.getValue())) tMap.remove()
                
            // }
        }
        else return false;
            
    }
}