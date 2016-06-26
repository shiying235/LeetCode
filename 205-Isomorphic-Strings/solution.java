public class Solution {
    public boolean isIsomorphic(String s, String t) {
        // char[] sArray = s.toCharArray();
        // char[] tArray = t.toCharArray();
        // HashMap sMap = new HashMap();
        // HashMap tMap = new HashMap();
        // for(int i=0;i<sArray.length;i++){
        //     if(sMap.containsKey(sArray)) sMap.put(sArray[i],(int)sMap.get(sArray[i])+1);
        //     else sMap.put(sArray[i],1);
        //     if(tMap.containsKey(tArray)) tMap.put(tArray[i],(int)tMap.get(tArray[i])+1);
        //     else tMap.put(tArray[i],1);
        // }
        // if(sMap.size()==tMap.size()){
        //     List<Integer> sList = new ArrayList<Integer>(sMap.values());
        //     List<Integer> tList = new ArrayList<Integer>(tMap.values());
        //     if(sList==tList) return true;
        //     else return false;
        // }
        // else return false;
        
        int[] map = new int[512];
        int n=s.length();
        for(int i=0;i<n;i++){
            if(map[s.charAt(i)]!=map[t.charAt(i)+256]) return false;
            map[s.charAt(i)]=map[t.charAt(i)+256]=i+1;
        }
        return true;    
    }
}