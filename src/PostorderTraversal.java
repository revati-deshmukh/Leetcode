import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.List;

public class PostorderTraversal {
    private class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static void main(String[] args){
        PostorderTraversal pt = new PostorderTraversal();
        // pt.postorderTraversal(root);

        /**
         * Example 1:
         * Input: root = [1,null,2,3]
         * Output: [3,2,1]
         *
         * Example 2:
         * Input: root = []
         * Output: []
         *
         * Example 3:
         * Input: root = [1]
         * Output: [1]
         * */
    }

    ArrayList<Integer> list = new ArrayList<Integer>();

    public List<Integer> postorderTraversal(TreeNode root) {

        if(root != null) {
            postorderTraversal(root.left);
            postorderTraversal(root.right);
            list.add(root.val);
        }

        return list;
    }
}
