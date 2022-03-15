import java.util.Stack;

public class SimplifyPath {

    public static void main(String[] args){
        SimplifyPath result = new SimplifyPath();
        var output = result.simplifyPath("/../");
        System.out.println(output);

        /**
         *
         * Example 1:
         * Input: path = "/home/"
         * Output: "/home"
         * Explanation: Note that there is no trailing slash after the last directory name.
         *
         * Example 2:
         * Input: path = "/../"
         * Output: "/"
         * Explanation: Going one level up from the root directory is a no-op, as the root level is the highest level you can go.
         *
         * Example 3:
         * Input: path = "/home//foo/"
         * Output: "/home/foo"
         * Explanation: In the canonical path, multiple consecutive slashes are replaced by a single one.
         */
    }

    public String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        StringBuilder str = new StringBuilder();
        String[] strArr = path.split("/");
        for(var ch : strArr){
            if(!stack.isEmpty() && ch.equals("..")) {
                stack.pop();
            }else if(!ch.equals("") && !ch.equals(".") && !ch.equals("..")){
                stack.push(ch);
            }
        }

        if(stack.isEmpty()) return "/";
        while(!stack.isEmpty()){
            str.insert(0, stack.pop()).insert(0, "/");
        }

        return str.toString();
    }
}
