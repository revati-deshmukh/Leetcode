import java.util.ArrayList;

public class LongestPalindromicSubstring {
    public static void main(String[] args){
        System.out.println(longestPalindrome("cbbd"));
    }

    public static String palindromicStr(String s){
        if(s.length() == 1)
            return s;
        // StringBuilder sb = new StringBuilder();
        String ans = "";

        int mid = s.length() /2;
        int i = mid - 1;
        int j = mid;

        int start = Integer.MAX_VALUE;
        int end = Integer.MIN_VALUE;
        while(i >= 0  && j <= s.length()-1){
            if(s.charAt(i) == s.charAt(j)){
                start = Math.min(start, i);
                end = Math.max(end, j);
                i--;
                j++;
            } else {
                return s;
            }
        }
        return s.substring(start, end+1);
    }

    public static String longestPalindrome(String s) {
        if(s == null || s.length() < 1) return "";

        int start = 0;
        int end = 0;
        for(int i = 0; i< s.length(); i++){
            int len1 = calculateFromMiddle(s, i, i);
            int len2 = calculateFromMiddle(s, i, i+1);

            int maxLength = Math.max(len1, len2);

            if(maxLength > end - start){
                start = i - ((maxLength - 1) / 2);
                end = i + (maxLength / 2);
            }
        }

        return s.substring(start, end + 1);
    }

    public static int calculateFromMiddle(String s, int start, int end){
        while(start >= 0
              && end < s.length()
              && s.charAt(start) == s.charAt(end)){
            start--;
            end++;
        }

        return end - start - 1;
    }
}
