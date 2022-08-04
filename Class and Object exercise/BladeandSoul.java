package Thursday;

import java.util.Scanner;

public class BladeandSoul {
    public static void main(String[] args) {
        Character character1 = new Character("Blade Master", "Swors", "Tanker", "Storm Surge", "Pull Agrro", 4, 4);
        Character character2 = new Character("Force Master", "Bangles", "DPS", "Sacred Fire", "Element Change", 2, 7);
        Character character3 = new Character("Warlock", "Razors", "DPS, Support", "Enthrall", "SoulBurn", 3, 5);
        Character character4 = new Character("Warden", "Large Swords", "Semi-Tank", "Punish", "Berserk", 4, 6);


        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Blade and Soul.");
        System.out.println("Please Pick one Class.");
        System.out.println("1: Blade Master");
        System.out.println("2: Force Master");
        System.out.println("3: Warlock");
        System.out.println("4: Warden");

        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.println(character1);
                break;
            case 2:
                System.out.println(character2);
                break;
            case 3:
                System.out.println(character3);
                break;
            case 4:
                System.out.println(character4);
                break;


        }



        System.out.println("1:DPS");
        System.out.println("2:Tank");
        System.out.println("3:Support");



            System.out.println("Deal massive amount of damage. Destroy everything in the path.");

            System.out.println("Deal respectable amount of damage that enough to draw attention of the boss. " +
                    "\nEnsure that all team members are protected.");

            System.out.println("Helps increasing damage output, maintains heal and revives team member");



            character1.setDamage(100);
            character2.setDamage(100);
            character3.setDamage(100);
            character4.setDamage(100);


            System.out.println(character1.getWeapon());
        System.out.println(character2.getWeapon());
        System.out.println(character3.getWeapon());
        System.out.println(character4.getWeapon());








        }




    }

