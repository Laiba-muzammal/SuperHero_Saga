// Directory: superheroes/SuperHero.java
package superheroes;

public abstract class SuperHero {
    protected String HeroName;
    protected String RealName;
    protected String occupation;
    protected String HeroDescription;
    protected String age;
    protected Boolean canFly;

    public SuperHero(String HeroName, String RealName, String occupation, String HeroDescription, String age, Boolean canFly) {
        if (HeroName == null || RealName == null || occupation == null || HeroDescription == null || age == null || canFly == null) {
            throw new IllegalArgumentException("None of the fields can be null");
        }
        this.HeroName = HeroName;
        this.RealName = RealName;
        this.occupation = occupation;
        this.HeroDescription = HeroDescription;
        this.age = age;
        this.canFly = canFly;
    }

    public SuperHero(String HeroName, String HeroDescription, Boolean canFly) {
        this.HeroName = HeroName;
        this.HeroDescription = HeroDescription;
        this.canFly = canFly;
    }

    public SuperHero(String RealName, String occupation, String age) {
        this.RealName = RealName;
        this.occupation = occupation;
        this.age = age;
    }

    public SuperHero() {
        this.HeroName = "Unknown";
        this.RealName = "Unknown";
        this.occupation = "Unknown";
        this.HeroDescription = "Unknown";
        this.age = "0";
        this.canFly = false;
    }

    public abstract String Attack(String source);
    public abstract String Rest();

    public String toString() {
        return "Hero Name: " + HeroName +
                "\nReal Name: " + RealName +
                "\nOccupation: " + occupation +
                "\nHero Description: " + HeroDescription +
                "\nAge: " + age +
                "\nFlight: " + canFly;
    }
}
