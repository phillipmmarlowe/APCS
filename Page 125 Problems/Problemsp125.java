
public class Problemsp125
{
    // instance variables - replace the example below with your own
    private int x;
    public Problemsp125()
    {
        // initialise instance variables
        x = 0;
    }
/**
 * This is problem 5
 */
//     public static void main(String[] args)
//     {
//         // put your code here
//         int noOfis = 5;
//         int iCount = 1;
//   
//         for (int i = noOfis; i > 0; i--)
//         {
//             for (int j = 1; j <= i; j++)
//             {
//                 System.out.print("");
//             }
//             for (int j = 1; j <= iCount; j++)
//             {
//                 System.out.print("* ");
//             }
//             System.out.println();
//             iCount++;
//         }
//     }
/**
 * This is problem 6
 */
//     public static void main(String[] args)
//     {
//         // put your code here
//         int noOfis = 7;
//         int iCount = 1;
//         for (int i = noOfis; i > 0; i--)
//         {
//             for (int j = 1; j <= iCount; j++)
//             {
//                 System.out.print(iCount+" ");
//             }
//             System.out.println();
//             iCount++;
//         
//         }
//     }
/**
 * This is problem 7, not finished
 */
// public static void main(String[] args){
//         // put your code here
//         int nums = 1;
//         for (int i = 1; i <= 5; i++) {
//             for (int j = 1; j <= 5 - i; j++) {
//                   System.out.print("  ");
//             }
//             for (int n = 1; n <= i; n++) {
//                 System.out.print(nums + " ");
//             }
//             System.out.println("");
//             nums++;
// }
// }
/**
 * This is problem 8
 */
public static void main(String args[]) {
 
        int i, j, n;
        for (i = 1; i <= 5; i++) {
            for (j = 1; j <= 5 - i; j++) {
                  System.out.print("  ");
            }
            for (n = 1; n <= i; n++) {
                System.out.print(n + " ");
            }
            System.out.println("");
        }
    }
}
