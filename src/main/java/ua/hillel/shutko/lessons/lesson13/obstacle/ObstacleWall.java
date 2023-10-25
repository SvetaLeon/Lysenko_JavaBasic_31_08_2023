package ua.hillel.shutko.lessons.lesson13.obstacle;

public class ObstacleWall extends Obstacle {
    @Override
    public void start(Participant participant) {
        System.out.println(participant.getName() + " start jump");
    }
}
