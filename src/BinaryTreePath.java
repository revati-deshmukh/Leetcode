import java.util.ArrayList;
import java.util.List;

public class BinaryTreePath {
    private TreeNode root;
    public static void main(String[] args){

        BinaryTreePath btp = new BinaryTreePath();
        btp.insert(7);
        btp.insert(4);
        btp.insert(9);
        btp.insert(1);
        btp.insert(6);
        btp.insert(8);
        btp.insert(10);

        List<String> list = btp.binaryTreePaths();
        System.out.println(list);
    }

    public List<String> binaryTreePaths() {
        return helper(root, "", new ArrayList<String>());
    }

    public List<String> helper(TreeNode root, String path, ArrayList<String> ans){
        if(root.left == null && root.right == null){
            ans.add(path + root.value);
        }

        if(root.left != null)
            helper(root.left, path + root.value + "->", ans);

        if(root.right != null)
            helper(root.right,  path + root.value + "->", ans);

        return ans;
    }

    public void insert(int value){
        var node = new TreeNode(value);
        if(root == null){
            root = node;
            return;
        }

        var current = root;
        while(current != null){
            if(current.value > value){
                if(current.left == null){
                    current.left = node;
                    break;
                }
                // current.leftChild.value = value;
                current = current.left;
            } else if (current.value < value){
                if(current.right == null) {
                    current.right = node;
                    break;
                }
                current = current.right;
            }
        }

    }

    private class TreeNode {
        int value;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int value) { this.value = value; }
        TreeNode(int value, TreeNode left, TreeNode right) {
            this.value = value;
            this.left = left;
            this.right = right;
        }
    }
}
