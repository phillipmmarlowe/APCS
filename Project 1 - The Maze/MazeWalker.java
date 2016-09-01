
/**
 * Write a description of class MazeWalker here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MazeWalker
{
    public void walkMaze(MazeBot mazeBot){
//             mazeBot.moveForward();
//             mazeBot.moveForward();
//             mazeBot.turnLeft();
//             mazeBot.moveForward();
//             mazeBot.moveForward();
//             mazeBot.moveForward();
//             mazeBot.turnRight();
//             mazeBot.moveForward();
//             mazeBot.moveForward();
//             mazeBot.turnRight();
//             mazeBot.moveForward();
//             mazeBot.moveForward();
//             mazeBot.moveForward();
//             mazeBot.moveForward();
//             mazeBot.turnLeft();
//             mazeBot.moveForward();
//             mazeBot.moveForward();
//             mazeBot.moveForward();
//             mazeBot.turnLeft();
//             mazeBot.moveForward();
//             mazeBot.moveForward();
//             mazeBot.turnRight();
//             mazeBot.moveForward();
//             mazeBot.moveForward();
              while (mazeBot.didNotReachGoal()){
                  if (mazeBot.canMoveForward()){
                      while (mazeBot.canMoveForward()){
                          mazeBot.moveForward();
                        }
                }else{
                    mazeBot.turnLeft();
                    if (mazeBot.canMoveForward()){
                      while (mazeBot.canMoveForward()){
                          mazeBot.moveForward();
                        }
                }
    
            }
