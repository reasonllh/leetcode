public class lc230 {
    // 给定一个二叉搜索树的根节点 root ，和一个整数 k ，请你设计一个算法查找其中第 k 个最小元素（从 1 开始计数）。

    public class TreeNode {
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

    int ans,k;
    public int kthSmallest(TreeNode root, int t) {
        k = t;
        process(root);
        return ans;
    }

    void process(TreeNode root){
        if(root == null || k <= 0){
            return; 
        }
        process(root.left);
        if(--k == 0) ans = root.val;
        process(root.right);
    }
}
