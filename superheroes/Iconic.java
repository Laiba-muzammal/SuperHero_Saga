package superheroes;

public class Iconic extends PhysicalHero {
    String speciality;

    public Iconic(String HeroName, String RealName, String occupation, String HeroDescription, String age, Boolean canFly, int PhysicalStrength, String speciality) {
        super(HeroName, RealName, occupation, HeroDescription, age, canFly, PhysicalStrength);
        this.speciality = speciality;
    }

    public Iconic(String HeroName, String HeroDescription, Boolean canFly, int PhysicalStrength, String speciality) {
        super(HeroName, HeroDescription, canFly, PhysicalStrength);
        this.speciality = speciality;
    }

    public Iconic(String RealName, String occupation, String age, int PhysicalStrength, String speciality) {
        super(RealName, occupation, age, PhysicalStrength);
        this.speciality = speciality;
    }

    public Iconic() {
        super();
        this.speciality = "None";
    }

    public String Attack(String source) {
        PhysicalStrength -= PhysicalStrength / 3;
        return HeroName + " performs a physical attack with " + source + " & strength left now is: " + PhysicalStrength;
    }

    public String Attack(int PhysicalStrength, String speciality) {
        PhysicalStrength -= PhysicalStrength / 3;
        return HeroName + " performs a special attack with " + speciality + ". Its strength left now is: " + PhysicalStrength;
    }

    public String Rest() {
        PhysicalStrength *= 4;
        return HeroName + " rests & its strength resets to " + PhysicalStrength + "\n\n" + "*".repeat(125) + "\n";
    }

    public String toString() {
        return super.toString() + "\nSpeciality: " + speciality;
    }
}
