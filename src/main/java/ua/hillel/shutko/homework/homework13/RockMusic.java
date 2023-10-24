package ua.hillel.shutko.homework.homework13;

public class RockMusic extends MusicStyles {
    public RockMusic(String name) {
        super(name);
    }

    @Override
    public void playMusic() {
        System.out.println("The band " + "\"" + getName() + "\"" + " is playing");
    }
}
