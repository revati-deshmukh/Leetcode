public class ReverseString2 {

    public static void main(String[] args){
        ReverseString2 rs = new ReverseString2();
        var result = rs.reverseStr("abcdefg", 2);
        System.out.println(result);

        /**
         * Example 1:
         * Input: s = "abcdefg", k = 2
         * Output: "bacdfeg"
         *
         * Example 2:
         * Input: s = "abcd", k = 2
         * Output: "bacd"
         */
    }

    public String reverseStr(String s, int k) {
        char[] ch = s.toCharArray();

        for(int i = 0; i< s.length(); i += 2*k){
            int left = i, right = Math.min(i + k - 1, ch.length - 1);
            while(left < right){
                var temp = ch[left];
                ch[left++] = ch[right];
                ch[right--] = temp;
            }
        }
        return String.valueOf(ch);
    }
}
