import java.util.*;
class Solution 
{
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        HashMap<Character, Integer> h1=new HashMap<>();
        HashMap<Character, Integer> h2=new HashMap<>();
        for(char x:s.toCharArray())
        {
            h1.put(x,h1.getOrDefault(x,0)+1);
        }
        for(char x:t.toCharArray())
        {
            h2.put(x,h2.getOrDefault(x,0)+1);
        }
        return h1.equals(h2);
    }
}
