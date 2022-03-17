public class ReverseString {

    public static void main(String[] args){
        ReverseString rs = new ReverseString();
        char[] s = {'h','e','l','l','o'};
        rs.reverseString(s);

        /**
        * Example 1:
        Input: s = ["h","e","l","l","o"]
        Output: ["o","l","l","e","h"]

        * Example 2:
        Input: s = ["H","a","n","n","a","h"]
        Output: ["h","a","n","n","a","H"]
        * */
    }

    public void reverseString(char[] s) {
        int start = 0, end = s.length - 1;

        while(start <= end){
            var temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            start++;
            end--;
        }

        System.out.println(s);

        /**
         * for(int start = 0, end = s.length - 1; start <= end; start++, end--){
         *     var temp = s[start];
         *     s[start] = s[end];
         *     s[end] = temp;
         *  }
         * */
    }
}
