
/**
 * Write a description of class BallRunner here.
 * 
 * @author Phillip Marlowe
 * @version (a version number or a date)
 */
public class BallRunner
{
    public static void run(){
        BallWorld ballWorld = new BallWorld(500, 500);
        TGPoint tGPoint = new TGPoint();
        BallBot[] list = new BallBot[5];
        for(int i = 0; i < 5; i++ ){
            TGPoint tGPoint2 = new TGPoint(Math.random()*100, Math.random()*100 );
            list[i] = new BallBot(ballWorld, tGPoint2, Math.random()*360, 25);
            list[i].setPixelsPerSecond(100); 
          
        }
        while (true){
            for(int i = 0; i < 5; i++ ){
            if (list[i].canMoveForward(ballWorld)){
                    list[i].moveForward();
                }else{
                    list[i].setHeading(Math.random()*360);
                    while (list[i].canMoveForward(ballWorld)){
                        list[i].moveForward();
                    }
                }
            }            
            }
}
}