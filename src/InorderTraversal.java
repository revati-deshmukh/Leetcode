import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.List;

public class InorderTraversal {
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
    private TreeNode root;
    ArrayList<Integer> list = new ArrayList<Integer>();

    public List<Integer> inorderTraversal(TreeNode root) {

        if(root != null){
            inorderTraversal(root.left);
            list.add(root.val);
            inorderTraversal(root.right);
        }
        return list;
    }

    public static void main(String[] args){
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

        InorderTraversal iot = new InorderTraversal();
        //var result = iot.inorderTraversal();
    }
}
