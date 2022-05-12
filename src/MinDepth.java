public class MinDepth {

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
        MinDepth md = new MinDepth();
        // md.minDepth();

        /**
         * Example 1:
         * Input: root = [3,9,20,null,null,15,7]
         * Output: 2
         *
         * Example 2:
         * Input: root = [2,null,3,null,4,null,5,null,6]
         * Output: 5
         * */
    }


    public int minDepth(TreeNode root) {
        if(root == null) return 0;
        if(root.left == null && root.right == null) return 1;

        int leftCount = Integer.MAX_VALUE;
        if(root.left != null){
            leftCount = minDepth(root.left);
        }

        int rightCount = Integer.MAX_VALUE;
        if(root.right != null){
            rightCount = minDepth(root.right);
        }

        return Math.min(leftCount, rightCount) + 1;
    }
}
