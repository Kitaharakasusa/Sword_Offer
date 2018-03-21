package Sword;//输入一颗二叉树和一个整数，
// 打印出二叉树中结点值的和为输入整数的所有路径。
// 路径定义为从树的根结点开始往下一直到叶结点
// 所经过的结点形成一条路径。

import java.util.ArrayList;

public class Sol22 {
    private ArrayList<ArrayList<Integer>>lists=new ArrayList<ArrayList<Integer>>();
    ArrayList<Integer>list=new ArrayList<>();
    int num=0;
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target) {
        if(root==null)
        {
            return lists;
        }

        num+=root.val;
        list.add(root.val);
        if(num==target&&root.left==null&&root.right==null)
        {
            ArrayList<Integer>path=new ArrayList<Integer>();
            for (int i=0;i<list.size();i++)
            {
                path.add(list.get(i));
            }
            lists.add(path);
        }
        //遍历左子树
        if (num<target&&root.left!=null)
        {
            FindPath(root.left,target);
        }
        //遍历右子树
        if(num<target&&root.right!=null)
        {
            FindPath(root.right,target);
        }
        //去掉这个节点值
        num-=root.val;
        //删除该节点返回父节点
        list.remove(list.size()-1);
        return lists;

    }
}
