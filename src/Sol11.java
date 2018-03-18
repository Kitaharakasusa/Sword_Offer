//给定一个double类型的浮点数base和int类型的整数exponent。
// 求base的exponent次方。不得使用库函数，不需要考虑大数问题
public class Sol11 {
    public double Power(double base, int exponent) {
        double res=0;
        if(equals(base,0))
        {
            return 0;
        }
        if(exponent==0)
        {
            return 1.0;
        }
        if(exponent>0)
        {
            res=mutiply(base,exponent);
        }
        else {
            res=mutiply(1/base,-exponent);
        }
        return res;
    }
    private double mutiply(double base,int e)
    {
        double sum=1;
        for(int i=0;i<e;i++)
        {
            sum=sum*base;
        }
        return sum;
    }
    private boolean equals(double base, int i) {
        if(base-i<0.000001&& base-i>-0.000001)
        {
            return true;
        }
        return false;
    }
}
