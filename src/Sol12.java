
//输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有的奇数位于数组的前半部分，
// 所有的偶数位于位于数组的后半部分，
// 并保证奇数和奇数，偶数和偶数之间的相对位置不变

import java.util.ArrayList;
import java.util.Arrays;

public class Sol12 {
    public void reOrderArray(int [] array) {
        ArrayList a=new ArrayList();
        ArrayList b=new ArrayList();
        for(int i=0;i<array.length;i++)
        {
            if(array[i]%2==0 ||array[i]==0)
            {
                b.add(array[i]);
            }
            else {
                a.add(array[i]);
            }
        }
        for(int i=0;i<array.length;i++)
        {
           if(i<a.size())
           {
               array[i]= (int) a.get(i);
           }
           else {
               array[i]= (int) b.get(i-a.size());
           }
        }
        for (int x:
             array) {
            System.out.println(x);
        }
    }
    public static void main(String args[])
    {
        Sol12 sol12=new Sol12();
        int a[]=new int[]{1,2,3,4,5,6,7};
        sol12.reOrderArray(a);
    }
}
