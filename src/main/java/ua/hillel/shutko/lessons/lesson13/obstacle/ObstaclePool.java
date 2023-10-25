package ua.hillel.shutko.lessons.lesson13.obstacle;

public class ObstaclePool extends Obstacle {
    @Override
    public void start(Participant participant) {
        System.out.println(participant.getName() + " start swim");
    }
}
