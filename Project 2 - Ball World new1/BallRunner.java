
/**
 * Write a description of class BallRunner here.
 * 
 * @author Phillip Marlowe
 * @version (a version number or a date)
 */
public class BallRunner
{
    public static void run(){
        distanceBetweenPoints le = new distanceBetweenPoints();
        int dbp = 0;
        BallWorld ballWorld = new BallWorld(500, 500);
        TGPoint tGPoint = new TGPoint();
        BallBot[] list = new BallBot[5];
        for(int i = 0; i < list.length; i++ ){
            int bwflx1 = (int) (Math.random()*100);
            int bwfly2 = (int) (Math.random()*100);
            TGPoint tGPoint2 = new TGPoint( bwflx1, bwfly2 );
            dbp = le.distanceBetweenPoints(bwflx1, bwfly2);
            if(dbp > 0){
                list[i] = new BallBot(ballWorld, tGPoint2, Math.random()*360, 10);
                list[i].setPixelsPerSecond(100); 

            }
        }
        while (true){
            for(int i = 0; i < 5; i++ ){
                if (list[i].canMoveForward(ballWorld)){
                    list[i].moveForward();
                }else{
                    list[i].setHeading(Math.random()*360);list[i].moveForward();
                }
            }
        }            
    }
}
