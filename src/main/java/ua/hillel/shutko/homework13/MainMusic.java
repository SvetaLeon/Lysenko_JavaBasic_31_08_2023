package ua.hillel.shutko.homework13;

public class MainMusic {
    public static void main(String[] args) {

        MusicStyles[] musicStyles = {
                new PopMusic("The Black Eyed Peas"),
                new RockMusic("Metallica"),
                new ClassicMusic("Amadei")
        };

        for (MusicStyles musicalStyle : musicStyles) {
            musicalStyle.playMusic();
        }
    }
}
