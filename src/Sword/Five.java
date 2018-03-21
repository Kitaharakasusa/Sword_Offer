package Sword;

import java.util.ArrayList;
import java.util.Stack;
class ListNode {
    int val;
    ListNode next = null;
    ListNode(int val) {
        this.val = val;
    }
}
public class Five {

    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer>list=new ArrayList<>();
        if(listNode==null)
            return list;
        Stack<ListNode> stack=new Stack<>();
        while (listNode!=null)
        {
            stack.push(listNode);
            listNode=listNode.next;
        }
        while(!stack.isEmpty())
        {
            list.add(stack.pop().val);
        }
        return list;

    }
    public static void main(String args[])
    {
        ListNode a=new ListNode(1);
        ListNode b=new ListNode(2);
        a.next=b;

        Five five=new Five();
        ArrayList mylis=five.printListFromTailToHead(a);
        for(int i=0;i<mylis.size();i++)
        {
            System.out.println(mylis.get(i));
        }
    }
}
