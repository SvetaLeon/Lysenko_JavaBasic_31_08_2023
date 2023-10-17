package ua.hillel.shutko.homework13;

public class ClassicMusic extends MusicStyles {
    public ClassicMusic(String name) {
        super(name);
    }

    @Override
    public void playMusic() {
        System.out.println("The band " + "\"" + getName() + "\"" + " is playing");
    }
}
