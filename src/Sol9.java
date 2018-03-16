//现在要求输入一个整数n，请你输出斐波那契数列的第n项。n<=39
public class Sol9 {
    public int Fibonacci(int n) {
        int result=0;
        int preone=1;
        int pretwo=0;
        if(n==0)
        {
            return pretwo;
        }
        if(n==1)
        {
            return preone;
        }
        for(int i=2;i<=n;i++)
        {
            result=preone+pretwo;
            pretwo=preone;
            preone=result;
        }
        return result;
    }
}
