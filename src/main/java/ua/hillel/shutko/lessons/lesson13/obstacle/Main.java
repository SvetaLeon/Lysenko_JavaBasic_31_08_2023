package ua.hillel.shutko.lessons.lesson13.obstacle;

public class Main {
    public static void main(String[] args) {

       ObstaclePool obstaclePool = new ObstaclePool();
       ObstacleWall obstacleWall = new ObstacleWall();

       ParticipantCat cat = new ParticipantCat("Tom");
       ParticipantFrog frog = new ParticipantFrog("Frog");

       obstacleWall.start(cat);
       obstaclePool.start(cat);

        obstacleWall.start(frog);
        obstaclePool.start(frog);
    }
}
