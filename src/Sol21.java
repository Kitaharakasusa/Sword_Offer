
import java.util.Arrays;

//输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。
// 如果是则输出Yes,否则输出No。假设输入的数组的任意两个数字都互不相同。
public class Sol21 {
    public boolean VerifySquenceOfBST(int [] sequence) {
//      if(sequence==null||sequence.length==0)
//      {
//          return false;
//      }
//      int rstart=0;
//      int length=sequence.length;
//      for (int i=0;i<length-1;i++)
//      {
//          if(sequence[i]<sequence[length-1])
//              rstart++;
//      }
//      if (rstart==0)
//      {
//          VerifySquenceOfBST(Arrays.copyOfRange(sequence,0,length-1));
//
//      }
//      else {
//          for (int i=rstart;i<length-1;i++)
//          {
//              if (sequence[i]<=sequence[length-1])
//              {
//                  return false;
//              }
//          }
//          VerifySquenceOfBST(Arrays.copyOfRange(sequence,0,rstart));
//          VerifySquenceOfBST(Arrays.copyOfRange(sequence,rstart,length-1));
//      }
//      return true;
        if (sequence==null||sequence.length<=0)
        {
            return false;
        }
        int len=sequence.length;
        int root=sequence[len-1];
        int i=0;
        for(;i<len-1;i++)
        {
            if(root<=sequence[i])
                break;
        }
        int j=i;
        for (;j<len-1;j++)
        {
         if (root>sequence[j])
         {
             return false;
         }
        }
        boolean leftflag=true;

        if(i>0)
        {
            leftflag=VerifySquenceOfBST(Arrays.copyOfRange(sequence,0,i));
        }
        boolean rightFlag=true;
        if(i<len-1)
        {
            rightFlag=VerifySquenceOfBST(Arrays.copyOfRange(sequence,i,sequence.length-1));
        }
        return leftflag&&rightFlag;
    }
}
