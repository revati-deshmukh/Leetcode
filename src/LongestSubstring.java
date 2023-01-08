import java.util.HashSet;
import java.util.Set;

// https://leetcode.com/problems/longest-substring-without-repeating-characters/description/

public class LongestSubstring {
    public static void main(String[] args){
        int ans = lengthOfLongestSubstring("abcabcbb");
        System.out.println(ans);
    }

    public static int lengthOfLongestSubstring(String s) {
        int i = 0;
        int j = 0;
        int max = 0;
        Set<Character> set = new HashSet<>();
        while(j < s.length()){
            if(!set.contains(s.charAt(j))){
                set.add(s.charAt(j));
                j++;
                max = Math.max(set.size(), max);
            } else {
                set.remove(s.charAt(i));
                i++;
            }
        }
        return max;
    }}
