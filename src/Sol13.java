//输入一个链表，输出该链表中倒数第k个结点。

public class Sol13 {
    public ListNode FindKthToTail(ListNode head,int k) {
        if(head==null ||k<=0)
            return null;

        ListNode he=head;
        ListNode end=head;
        while (k-- > 1)
        {
            if(end.next!=null)
                end=end.next;
            else
                return null;
        }
        while (end.next!=null)
        {
            he=he.next;
            end=end.next;
        }
        return he;
    }
    public static void main(String args[])
    {

    }
}
