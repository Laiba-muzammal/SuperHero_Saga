package superheroes;

public class Vigilante extends SuperHero {
    String PrimaryWeapon;
    int total;

    public Vigilante(String HeroName, String RealName, String occupation, String HeroDescription, String age, Boolean canFly, String PrimaryWeapon, int total) {
        super(HeroName, RealName, occupation, HeroDescription, age, canFly);
        this.PrimaryWeapon = PrimaryWeapon;
        this.total = total;
    }

    public Vigilante(String HeroName, String HeroDescription, Boolean canFly, String PrimaryWeapon, int total) {
        super(HeroName, HeroDescription, canFly);
        this.PrimaryWeapon = PrimaryWeapon;
        this.total = total;
    }

    public Vigilante(String RealName, String occupation, String age, String PrimaryWeapon, int total) {
        super(RealName, occupation, age);
        this.PrimaryWeapon = PrimaryWeapon;
        this.total = total;
    }

    public Vigilante() {
        super();
        this.PrimaryWeapon = "None";
        this.total = 0;
    }

    public String Attack(String PrimaryWeapon) {
        return HeroName + " attacks with " + PrimaryWeapon + ", & needs to rest to use it again";
    }

    public String Attack(String PrimaryWeapon, int total) {
        if (total <= 0) {
            return HeroName + " has no weapons left to attack!";
        }
        int left = total - 1;
        return HeroName + " attacks with " + PrimaryWeapon + ", & now remaining weapons are: " + left;
    }

    public String Rest() {
        return HeroName + " rests & is ready to use its weapon " + PrimaryWeapon + " now\n\n" + "*".repeat(125) + "\n";
    }

    public String Rest(int total) {
        if (total <= 0) {
            return HeroName + " has no weapons to rest!";
        }
        int left = total - 1;
        int net = left + 1;
        return HeroName + " rests & total number of the " + PrimaryWeapon + " has been updated to: " + net + "\n\n" + "*".repeat(125) + "\n";
    }

    public String toString() {
        return super.toString() + "\nPrimary Weapon: " + PrimaryWeapon;
    }
}
