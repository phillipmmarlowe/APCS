
/**
 * Write a description of class Lab6 here.
 * 
 * @author Phillip Marlowe 
 * @version (a version number or a date)
 */
public class Lab6
{
    // instance variables - replace the example below with your own
    private int median;
    
    public Lab6()
    {
        // initialise instance variables
        median = 0;
    }
    public int getMedian(int[] x)
    {
        // put your code here
        if (x.length%2==0){
        median = x[x.length/2];
        return median;
        }else{
        return -1;
        }
    }
}
