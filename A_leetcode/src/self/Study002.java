package self;

import java.util.*;

/**
 * @author superlfx@aliyun.com
 * @since 2021-05-03 23:06
 */
public class Study002 {

    public static void main(String[] args) {
        Solution solution =new Study002().new Solution();
        boolean b = solution.isAnagram("anagram","nagaram");
        System.out.println(b);

    }

    class Solution {
        public boolean isAnagram(String s, String t) {
            if (s.length()!=t.length()){
                return false;
            }
            HashMap<Character,Integer> sMap = new HashMap<>();
            HashMap<Character,Integer> tMap = new HashMap<>();
            for (int i = 0; i < s.length(); i++) {
                sMap.put(s.charAt(i),sMap.getOrDefault(s.charAt(i),0)+1);
                tMap.put(t.charAt(i),tMap.getOrDefault(t.charAt(i),0)+1);
            }
            return sMap.equals(tMap);
        }
    }

}