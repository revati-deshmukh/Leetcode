import java.util.Stack;

public class LongestValidParantheses {
    public static void main(String[] args){
        LongestValidParantheses lvp = new LongestValidParantheses();
        var result = lvp.longestValidParentheses("(())");
        System.out.println(result);

        /**
         * Example 1:
         * Input: s = "(()"
         * Output: 2
         * Explanation: The longest valid parentheses substring is "()".
         *
         * Example 2:
         * Input: s = ")()())"
         * Output: 4
         * Explanation: The longest valid parentheses substring is "()()".
         *
         * Example 3:
         * Input: s = ""
         * Output: 0
         * */
    }

    public int longestValidParentheses(String s) {
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        int count = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '('){
                stack.push(i);
            } else {
                if(!stack.isEmpty()) stack.pop();

                if(!stack.isEmpty()){
                    count = Math.max(count, i - stack.peek());
                } else {
                    stack.push(i);
                }
            }
        }

        return count;
    }

}
