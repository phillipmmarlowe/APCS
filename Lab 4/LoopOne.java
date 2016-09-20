
/**
 * Lab 4
 */
public class LoopOne
{
    private int[] list = new int[5];
    private int mult = 1;
    public LoopOne()
    {
        // initialise instance variables
  
    }
    public void loadArray()
    {
        // put your code here
        for(int i = 0; i < list.length; i++){
        list[i] = mult*5 ;
        System.out.println(list[i]);
        mult = mult*5;
        }
    }
}
