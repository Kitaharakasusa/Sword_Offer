package Sword;

//一只青蛙一次可以跳上1级台阶，也可以跳上2级……
// 它也可以跳上n级。求该青蛙跳上一个n级的台阶总共有多少种跳法。
public class Sol10_2 {
    public int JumpFloorII(int target) {
        if(target==0)
        {
            return 0;
        }
        if(target==1||target==2)
        {
            return target;
        }
        if(target>2)
        {
            return 2*JumpFloorII(target-1);
        }
        return target;
    }
    public static void main(String args[])
    {
        Sol10_2 a=new Sol10_2();
        System.out.println(a.JumpFloorII(3));
    }
}
