package superheroes;

public class Speedster extends PhysicalHero {
    int dailyCal;
    int topSpeed;

    public Speedster(String HeroName, String RealName, String occupation, String HeroDescription, String age, Boolean canFly, int PhysicalStrength, int topSpeed, int dailyCal) {
        super(HeroName, RealName, occupation, HeroDescription, age, canFly, PhysicalStrength);
        this.topSpeed = topSpeed;
        this.dailyCal = dailyCal;
    }

    public Speedster(String HeroName, String HeroDescription, Boolean canFly, int PhysicalStrength, int topSpeed, int dailyCal) {
        super(HeroName, HeroDescription, canFly, PhysicalStrength);
        this.topSpeed = topSpeed;
        this.dailyCal = dailyCal;
    }

    public Speedster(String RealName, String occupation, String age, int PhysicalStrength, int topSpeed, int dailyCal) {
        super(RealName, occupation, age, PhysicalStrength);
        this.topSpeed = topSpeed;
        this.dailyCal = dailyCal;
    }

    public Speedster() {
        super();
        this.topSpeed = 0;
        this.dailyCal = 0;
    }

    public String Attack(String source) {
        PhysicalStrength -= PhysicalStrength / 3;
        return HeroName + " performs a physical attack with " + source + " & strength left now is: " + PhysicalStrength;
    }

    public String Attack(String source, int topSpeed) {
        topSpeed = topSpeed - topSpeed / 3;
        return HeroName + " performs a physical attack with " + source + " & its speed is temporarily reduced to: " + topSpeed;
    }

    public String Attack(int PhysicalStrength, String source, int dailyCal) {
        dailyCal = dailyCal - dailyCal / 3;
        PhysicalStrength -= PhysicalStrength / 3;
        return HeroName + " performs a physical attack with " + source + " & its calories are temporarily reduced to: " + dailyCal + " & strength left now is: " + PhysicalStrength;
    }

    public String Rest() {
        PhysicalStrength *= 4;
        return HeroName + " rests & its strength resets to " + PhysicalStrength + "\n\n" + "*".repeat(125) + "\n";
    }

    public String Rest(int PhysicalStrength, int topSpeed) {
        int net = PhysicalStrength * 4;
        int increased = net - PhysicalStrength;
        int net_top = topSpeed * 2;
        return HeroName + " rests & its strength has increased by the value of: " + increased + "wrt to its original strength resulting in a net strength of: " + net + "\n & its speed has become twice of its original value i.e.," + topSpeed + "\n\n" + "*".repeat(125) + "\n";
    }

    public String Rest(int dailyCal) {
        int net = dailyCal * 3;
        int increased = net - dailyCal;
        return HeroName + " rests & its calories has been increased by the value of: " + increased + "wrt to its original calories resulting in a net calories : " + "\n\n" + "*".repeat(125) + "\n";
    }

    public String toString() {
        return super.toString() + "\nTop Speed: " + topSpeed + "\nDaily Calories: " + dailyCal;
    }
}
