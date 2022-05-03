import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.List;

public class PreOrderTraversal {
    private class TreeNode {
        int val;
        PreOrderTraversal.TreeNode left;
        PreOrderTraversal.TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, PreOrderTraversal.TreeNode left, PreOrderTraversal.TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    ArrayList<Integer> list = new ArrayList<Integer>();

    public List<Integer> preorderTraversal(TreeNode root) {
        if(root != null){
            list.add(root.val);
            preorderTraversal(root.left);
            preorderTraversal(root.right);
        }

        return list;
    }

    public static void main(String[] args) {
        /**
         * Example 1:
         * Input: root = [1,null,2,3]
         * Output: [1,3,2]
         *
         * Example 2:
         * Input: root = []
         * Output: []
         *
         * Example 3:
         * Input: root = [1]
         * Output: [1]
         * */

        PreOrderTraversal pot = new PreOrderTraversal();
        //pot.preorderTraversal();
    }
}
