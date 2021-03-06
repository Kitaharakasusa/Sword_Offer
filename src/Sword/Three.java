package Sword;

public class Three {
    public boolean Find(int target, int [][] array) {
        if(array==null)
        {
            return false;
        }
        int row=0;
        int column=array[0].length-1;
        while(row<array.length && column>=0)
        {
            if(array[row][column]==target)
            {
                return true;
            }
            if(array[row][column]>target)
            {
                column--;
            }
            else{
                row++;
            }
        }
        return false;
    }
}
