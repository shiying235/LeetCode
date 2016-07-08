public class Solution {
    public String reverseVowels(String s) {
        // HashMap index = new HashMap();
        // index.put('a',1);
        // index.put('e',1);
        // index.put('i',1);
        // index.put('o',1);
        // index.put('u',1);
        // index.put('A',1);
        // index.put('E',1);
        // index.put('I',1);
        // index.put('O',1);
        // index.put('U',1);
        
        // char[] result = s.toCharArray();
        // int j = result.length - 1;
        // int i = 0;
        // while( i < j){
        //     while(!index.containsKey( result[i] ) && i < j)
        //         i++;
        //     while(!index.containsKey( result[j] ) && i < j)
        //         j--; 
        //     char temp = result[i];
        //     result[i] = result[j];
        //     result[j] = temp;
        //     i++;
        //     j--;
                
        // }
        
        // return new String(result);
        
        if(s == null || s.length()==0){
            return s;
        }
        HashSet<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        
        vowels.add('A');
        vowels.add('E');
        vowels.add('I');
        vowels.add('O');
        vowels.add('U');
        
        // reverse the  vowels while popping up
        Stack<Character> vStack = new Stack<>();
        for(char c : s.toCharArray()){
            if(vowels.contains(c)){
                vStack.push(c);
            }
        }
        
        StringBuilder sb = new StringBuilder();
        for(char c : s.toCharArray()){
            if(vowels.contains(c)){
                sb.append(vStack.pop());
            }else{
                sb.append(c);
            }
        }
        
        return sb.toString();
    }
}