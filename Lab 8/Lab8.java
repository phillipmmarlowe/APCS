
/**
 * Write a description of class Lab8 here.
 * 
 * @author Phillip 
 * @version (a version number or a date)
 */
public class Lab8
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class Lab8
     */
    public Lab8()
    {
        // initialise instance variables
        x = 0;
    }
    public int[] reverseArray(int[] x)
    {
        // put your code here
        for(int i=0;i<x.length;i++){
        if(x[0+i]==x[x.length-1-i]){
            return x;
        }
        x[0+i]=x[x.length-1-i];
    }
        return x;
    }
}
