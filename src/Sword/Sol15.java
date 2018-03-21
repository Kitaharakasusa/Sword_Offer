package Sword;

public class Sol15 {
    public ListNode Merge(ListNode list1,ListNode list2) {
        if(list1==null)
            return list2;
        if (list2==null)
            return list1;
        ListNode newhead=null;

        if(list1.val<=list2.val)
        {
            newhead=list1;
            newhead.next=Merge(list1.next,list2);
        }
        else {
            newhead=list2;
            newhead.next=Merge(list1,list2.next);
        }
        return newhead;
    }
    public static void main(String arg[])
    {

    }
}
