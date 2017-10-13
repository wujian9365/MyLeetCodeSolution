
public class SameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p != null && q!= null) {
            while (p.left != null && q.left != null ) {
                if (p.val != q.val) {
                    return false;
                }
                p = p.left;
                q = q.left;
            }
        }

        return true;
    }

}

class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;
    TreeNode(int x) { val = x; }
}
