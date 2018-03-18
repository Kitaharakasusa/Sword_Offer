//输入两棵二叉树A，B，判断B是不是A的子结构。
// （ps：我们约定空树不是任意一个树的子结构）

public class Sol16 {
    public boolean HasSubtree(TreeNode root1,TreeNode root2) {
        boolean res=false;
        if(root2!=null &&root1 !=null)
        {
            if(root1.val==root2.val)
            {
                res=desetree1havetree2(root1,root2);
            }
            if (!res)
            {
                return HasSubtree(root1.left,root2)||HasSubtree(root1.right,root2);
            }
        }
        return res;
    }
    public boolean desetree1havetree2(TreeNode node1,TreeNode node2)
    {
        if(node2==null)
        {
            return true;
        }
        if(node1==null)
        {
            return false;
        }
        if(node1.val!=node2.val)
        {
            return false;
        }
        return desetree1havetree2(node1.left,node2.left)&&desetree1havetree2(node1.right,node2.right);
    }
}
