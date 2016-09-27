
/**
 * Write a description of class Lab11 here.
 * 
 * @author Phillip Marlowe 
 * @version (a version number or a date)
 */
public class Lab11
{
    // instance variables - replace the example below with your own
    private int[][] nums = new int[3][3];

    public Lab11()
    {
        // initialise instance variables
        Lab11 ll = new Lab11();
        ll.loadArray(nums);
    }
    public int[][] loadArray(int[][] x)
    {
        // put your code here
        for(int i=0; i < x.length ;i++){
            for(int j = 0; j < x[0].length ;j++){
            x[i][j] =(int)(Math.random()*11)+1 ;
            }
        }
        return x;
    }
    public void printArray()
    {
        // put your code here
        
    }
    public void sortArray()
    {
        // put your code here
        
    }
    public void getMean()
    {
        // put your code here
        
    }
}
