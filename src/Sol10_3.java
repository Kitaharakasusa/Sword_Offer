//我们可以用2*1的小矩形横着或者竖着去覆盖更大的矩形。
// 请问用n个2*1的小矩形无重叠地覆盖一个2*n的大矩形，总共有多少种方法？
public class Sol10_3 {
    public int RectCover(int target) {
        //本质上还是斐波那契数列
        if(target<=0)
            return 0;
        if(target==1||target==2)
            return target;

        else return RectCover(target-1)+RectCover(target-2);

    }
    public static void main(String args[])
    {
        Sol10_3 a=new Sol10_3();
        System.out.println(a.RectCover(3));
    }
}
