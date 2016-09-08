
/**
 * Write a description of class BallRunner here.
 * 
 * @author Phillip 
 * @version (a version number or a date)
 */
public class BallRunner
{
    public static void run(){
    BallWorld ballWorld = new BallWorld(500, 500);
    TGPoint tGPoint = new TGPoint();
    BallBot[] list = new BallBot[5];
    for(int i = 0; i < 5; i++ ){
    TGPoint tGPoint2 = new TGPoint(Math.random()*10, Math.random()*10 );
    list[i] = new BallBot(ballWorld, tGPoint2, Math.random()*10, 10);
    while (list[i].canMoveForward(ballWorld)){
        list[i].moveForward();
    }
    }
    }
  
    
    
    
    
    
}


