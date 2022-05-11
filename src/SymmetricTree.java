public class SymmetricTree {
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
        SymmetricTree st = new SymmetricTree();
        //st.isSymmetric();

        /**
         * Example 1:
         * Input: root = [1,2,2,3,4,4,3]
         * Output: true
         *
         * Example 2:
         * Input: root = [1,2,2,null,3,null,3]
         * Output: false
         * */
    }

    public boolean isSymmetric(TreeNode root) {
        if(root == null)
            return true;

        return isValSame(root.left, root.right);
    }

    public boolean isValSame(TreeNode leftNode, TreeNode rightNode){
        if(leftNode == null && rightNode == null)
            return true;

        if(leftNode == null || rightNode == null)
            return false;

        return (leftNode.val == rightNode.val) && isValSame(leftNode.left, rightNode.right) && isValSame(leftNode.right, rightNode.left);
    }
}
