
/**
 * Write a description of class Lab8Runner here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lab8Runner
{
    // instance variables - replace the example below with your own
    private int x;
    int[] nums = new int[5];
    /**
     * Constructor for objects of class Lab8Runner
     */
    public Lab8Runner()
    {
        // initialise instance variables
        x = 0;
        for(int i=0;i<nums.length;i++){
            nums[i]=i;
    }
    }
    public static void main(String[] args)
    {
        // put your code here
        Lab8 le = new Lab8();
        le.reverseArray(nums);
    }
}
