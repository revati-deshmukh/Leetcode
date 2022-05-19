public class HasPathSum {

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
        HasPathSum hps = new HasPathSum();
        // hps.hasPathSum(root, 22);

        /**
         * Example 1:
         * Input: root = [5,4,8,11,null,13,4,7,2,null,null,null,1], targetSum = 22
         * Output: true
         * Explanation: The root-to-leaf path with the target sum is shown.
         *
         * Example 2:
         * Input: root = [1,2,3], targetSum = 5
         * Output: false
         * Explanation: There two root-to-leaf paths in the tree:
         * (1 --> 2): The sum is 3.
         * (1 --> 3): The sum is 4.
         * There is no root-to-leaf path with sum = 5.
         *
         * Example 3:
         * Input: root = [], targetSum = 0
         * Output: false
         * Explanation: Since the tree is empty, there are no root-to-leaf paths.
         * */
    }

    public boolean hasPathSum(TreeNode root, int targetSum) {
        return calculateSum(root, targetSum, 0);
    }

    public boolean calculateSum(TreeNode root, int targetSum, int sum){
        if(root == null)
            return false;

        sum += root.val;

        if(root.left == null && root.right == null && sum == targetSum)
            return true;

        return calculateSum(root.left, targetSum, sum) || calculateSum(root.right, targetSum, sum);
    }
}
