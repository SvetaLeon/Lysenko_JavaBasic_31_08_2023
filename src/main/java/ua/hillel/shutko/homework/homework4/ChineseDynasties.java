package ua.hillel.shutko.homework.homework4;

public class ChineseDynasties {
    public static void main(String[] args) {
        int attackPowerWarriorLi = 13;
        int attackPowerBowmanLi = 24;
        int attackPowerRiderLi = 46;

        int numberWarriorsEachTypeLi = 860;

        int totalAttackPowerLi = (attackPowerWarriorLi * numberWarriorsEachTypeLi) + (attackPowerBowmanLi * numberWarriorsEachTypeLi) + (attackPowerRiderLi * numberWarriorsEachTypeLi);

        System.out.println("The total attack power of the Li Dynasty = " + totalAttackPowerLi);

        int attackPowerWarriorMing = 9;
        int attackPowerBowmanMing = 35;
        int attackPowerRiderMing = 12;

        double percentage = 1.5;
        int numberWarriorsEachTypeMing = (int) (numberWarriorsEachTypeLi * percentage);

        int totalAttackPowerMing = (attackPowerWarriorMing * numberWarriorsEachTypeMing) + (attackPowerBowmanMing * numberWarriorsEachTypeMing) + (attackPowerRiderMing * numberWarriorsEachTypeMing);

        System.out.println("The total attack power of the Ming Dynasty = " + totalAttackPowerMing);
    }
}
