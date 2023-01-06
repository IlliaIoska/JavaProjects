public class Main {
    public static void main(String[] args) {
        TreeNode root = null;
        root = createNewNode(1);
        root.left = createNewNode(2);
        root.right = createNewNode(3);
        root.left.left = createNewNode(4);
        root.left.right = createNewNode(5);

        if (isPerfectBT(root) == true)
            System.out.println("The tree is a perfect binary tree");
        else
            System.out.println("The tree is not a perfect binary tree");
    }

    static class TreeNode {
        int value;
        TreeNode left;
        TreeNode right;
    }

    static int depth(TreeNode node) {
        int depth = 0;
        while(node != null) {
            depth++;
            node = node.left;
        }
        return depth;
    }

    static boolean isPerfectBT(TreeNode root, int depth, int level) {
        if (root == null) {
            return true;
        }

        if(root.left == null && root.right == null) {
            return (depth == level + 1);
        }

        if(root.right == null || root.left == null) {
            return false;
        }

        return isPerfectBT(root.left, depth, level + 1) && isPerfectBT(root.right, depth, level + 1);
    }

    static boolean isPerfectBT(TreeNode root) {
        int depth = depth(root);
        return isPerfectBT(root, depth, 0);
    }

    static TreeNode createNewNode(int value) {
        TreeNode node = new TreeNode();
        node.value = value;
        node.left = null;
        node.right = null;
        return node;
    }
}