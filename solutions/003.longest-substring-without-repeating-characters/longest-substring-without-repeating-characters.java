public class Solution {
    public int lengthOfLongestSubstring(String s) {
        int start = 0 ;
        int len = 0;
        Map<Character,Integer> map = new HashMap<>();
        for(int i =0; i< s.length(); ++i){
            char cur = s.charAt(i);
            if(map.containsKey(cur) && map.get(cur) >= start){
                start = map.get(cur) + 1;
                map.put(cur, i);
            } else {
                map.put(cur, i);
                int newLen = i - start + 1;
                if(newLen > len) len = newLen;
            }
           
        }
        return len;
    }
}