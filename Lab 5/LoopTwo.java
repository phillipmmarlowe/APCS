import java.util.Arrays;
import java.util.Random;
/**
 * Write a description of class LoopTwo here.
 * 
 * @author Phillip Marlowe 
 * @version (a version number or a date)
 */
public class LoopTwo
{
    // instance variables - replace the example below with your own
    private int[] list = new int[5];
    private double n;
    public LoopTwo()
    {
        // initialise instance variables
        n = list.length;
    }
    public void loadRandom()
    {
        // put your code here
        for (int i = 0;i < list.length; i++ ){
        list[i] = int Math.random()*100;
        }
    }
    public void loadArray()
    {
        // put your code here
        for (int i = 0;i < list.length; i++ ){
        System.out.print("    "+list[i]);
    }
    }
}
