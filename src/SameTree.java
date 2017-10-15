import java.util.ArrayList;

import apple.laf.JRSUIUtils.Tree;

/**
 * Author:Jian Wu
 * Date: 2017/10/15
 */
public class SameTree {

    ArrayList<Integer> left = new ArrayList<>();
    ArrayList<Integer> right = new ArrayList<>();

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if((p==null)&&(q==null)) {
            return true;
        } else if(q!=null && p!=null) {
            LTree(p,left);
            LTree(q,right);
            if (left.equals(right)) {
                return true;
            } else {
                return false;
            }
        }
        else {
            return false;
        }
    }

    public void LTree(TreeNode p, ArrayList<Integer> side) {
        if (p.left != null) { LTree(p.left,side); } else {side.add(null);}
        if (p.right != null ) {LTree(p.right,side);} else {side.add(null);}
        side.add(p.val);
    }

    public static  void main(String[] args) {
        TreeNode left = new TreeNode(1);
        left.left = new TreeNode(2);
        //left.right = new TreeNode(3);
        TreeNode right = new TreeNode(1);
        right.left = null;
        right.right = new TreeNode(2);

        SameTree a= new SameTree();
        System.out.println(a.isSameTree(left,right));
    }

}

class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;
    TreeNode(int x) { val = x; }
}

