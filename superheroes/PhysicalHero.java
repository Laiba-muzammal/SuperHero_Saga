// Directory: superheroes/PhysicalHero.java
package superheroes;

public class PhysicalHero extends SuperHero {
    protected int PhysicalStrength;

    public PhysicalHero(String HeroName, String RealName, String occupation, String HeroDescription, String age, Boolean canFly, int PhysicalStrength) {
        super(HeroName, RealName, occupation, HeroDescription, age, canFly);
        this.PhysicalStrength = PhysicalStrength;
    }

    public PhysicalHero(String HeroName, String HeroDescription, Boolean canFly, int PhysicalStrength) {
        super(HeroName, HeroDescription, canFly);
        this.PhysicalStrength = PhysicalStrength;
    }

    public PhysicalHero(String RealName, String occupation, String age, int PhysicalStrength) {
        super(RealName, occupation, age);
        this.PhysicalStrength = PhysicalStrength;
    }

    public PhysicalHero() {
        super();
        this.PhysicalStrength = 1300;
    }

    @Override
    public String Attack(String source) {
        PhysicalStrength -= PhysicalStrength / 3;
        return HeroName + " performs a physical attack with " + source + " & strength left now is: " + PhysicalStrength;
    }

    public String Attack(String source, int PhysicalStrength) {
        if (source == null || source.isEmpty()) {
            throw new IllegalArgumentException("Attack source cannot be null or empty");
        }
        if (PhysicalStrength <= 0) {
            throw new IllegalArgumentException("Physical strength must be greater than zero");
        }
        int lost = PhysicalStrength / 3;
        return HeroName + " performs an attack with " + source + " & has lost one-third of the physical strength i.e., " + lost;
    }

    @Override
    public String Rest() {
        PhysicalStrength *= 4;
        return HeroName + " rests & its strength resets to " + PhysicalStrength + "\n\n" + "*".repeat(125) + "\n";
    }

    public String Rest(int PhysicalStrength) {
        if (PhysicalStrength <= 0) {
            throw new IllegalArgumentException("Physical strength must be positive to rest");
        }
        int restedPhysicalStrength = PhysicalStrength * 4;
        return HeroName + " has rested and regained physical strength. New physical strength: " + restedPhysicalStrength;
    }

    @Override
    public String toString() {
        return super.toString() + "\nPhysical Strength: " + PhysicalStrength;
    }
}
