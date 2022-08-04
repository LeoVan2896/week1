package Thursday;

public class Character {
    String name;
    String weapon;
    String roles;
    String ultimate;
    String specialty;
    int difficulty;

    String  skill;

    String DPS;
    String Support;
    String Tank;
    int multiple;

    public Character(String name, String weapon, String roles, String ultimate, String specialty, int difficulty, int multiple) {
        this.name = name;
        this.weapon = weapon;
        this.roles = roles;
        this.ultimate = ultimate;
        this.specialty = specialty;
        this.difficulty = difficulty;
        this.multiple = multiple;
    }

    public Character(String name, String weapon, String roles, String ultimate) {
        this.name = name;
        this.roles = roles;
        this.ultimate = ultimate;
        this.weapon = weapon;
        this.difficulty = 0;


    }

    public String toString() {
        String returnvalue = "";
        returnvalue += this.name + " is " + this.roles;
        returnvalue += "\n This Class uses" + this.weapon + "as main weapon.";
        returnvalue += "\n" + this.name + " specialty is " + this.specialty;
        returnvalue += "\n" + this.name + " Ultimate is " + this.ultimate;
        returnvalue += "\n" + this.name + " difficulty to play is " + this.difficulty;
        return returnvalue;
    }

    void setDamage(double hit) {
        System.out.println(this.name + " deal " + hit * multiple + " to bosses and monsters.");
    }

    String getWeapon(){
        return this.weapon;
    }





}




