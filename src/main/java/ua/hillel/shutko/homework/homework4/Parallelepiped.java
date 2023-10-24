package ua.hillel.shutko.homework.homework4;

public class Parallelepiped {
    public static void main(String[] args) {
        int sideParallelepiped1 = 4;
        int sideParallelepiped2 = 6;
        int sideParallelepiped3 = 8;
        int volume = sideParallelepiped1 * sideParallelepiped2 * sideParallelepiped3;

        System.out.println("Volume parallelepiped = " + volume);

        int length = (sideParallelepiped1 + sideParallelepiped2 + sideParallelepiped3) * 4;

        System.out.println("Total length of all sides = " + length);

    }
}
