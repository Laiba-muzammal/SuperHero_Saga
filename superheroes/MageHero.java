package superheroes;

public class MageHero extends SuperHero {
    int ManaCapacity;

    public MageHero(String HeroName, String RealName, String occupation, String HeroDescription, String age, Boolean canFly, int ManaCapacity) {
        super(HeroName, RealName, occupation, HeroDescription, age, canFly);
        if (ManaCapacity <= 0) {
            throw new IllegalArgumentException("Mana Capacity must be greater than zero");
        }
        this.ManaCapacity = ManaCapacity;
    }

    public MageHero(String HeroName, String HeroDescription, Boolean canFly, int ManaCapacity) {
        super(HeroName, HeroDescription, canFly);
        this.ManaCapacity = ManaCapacity;
    }

    public MageHero(String RealName, String occupation, String age, int ManaCapacity) {
        super(RealName, occupation, age);
        this.ManaCapacity = ManaCapacity;
    }

    public MageHero() {
        super();
        this.ManaCapacity = 1900;
    }

    public String Attack(String source) {
        ManaCapacity /= 3;
        return HeroName + " casts " + source + ", mana is left with: " + ManaCapacity;
    }

    public String Attack(String source, int ManaCapacity) {
        int lost = ManaCapacity / 3;
        return HeroName + " performs a physical attack with " + source + " & has lost one-third of the mana capacity i.e.," + lost + " & strength left now is: " + ManaCapacity;
    }

    public String Rest() {
        ManaCapacity *= 2.5;
        return HeroName + " rests & its capacity resets to: " + ManaCapacity + "\n\n" + "*".repeat(125) + "\n";
    }

    public String Rest(int ManaCapacity) {
        if (ManaCapacity <= 0) {
            throw new IllegalArgumentException("Mana capacity must be positive to rest");
        }
        int restedManaCapacity = ManaCapacity * 4;
        return HeroName + " has rested and regained mana. New mana capacity: " + restedManaCapacity;
    }

    public String toString() {
        return super.toString() + "\nMana Capacity: " + ManaCapacity;
    }
}
