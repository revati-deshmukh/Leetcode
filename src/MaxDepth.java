public class MaxDepth {
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
        MaxDepth md = new MaxDepth();
        //md.maxDepth();

        /**
         *
         * Example 1:
         * Input: root = [3,9,20,null,null,15,7]
         * Output: 3
         *
         * Example 2:
         * Input: root = [1,null,2]
         * Output: 2
         * */
    }

    public int maxDepth(TreeNode root) {
        if(root == null)
            return 0;

        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }

}
