// Directory: superheroes/Main.java
package superheroes;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome To Our Superhero Universe!\n\n" + "*".repeat(125) + "\n");

        PhysicalHero phy_hero_one = new PhysicalHero("Wonder Woman", "Diana Prince",
                "Writer", "As a demi-goddess...", "Over 2,000 years old (immortal)", true, 7500);
        System.out.println(phy_hero_one);
        System.out.println(phy_hero_one.Attack("Sword and Shield Combat"));
        System.out.println(phy_hero_one.Rest());

        // Similarly instantiate and test other heroes...

        // Example for MageHero:
        MageHero mag_hero_one = new MageHero("Doctor Strange", "Stephen Strange",
                "Sorcerer Supreme", "Doctor Strange is a former...", "40-50 years", true, 3000);
        System.out.println(mag_hero_one);
        System.out.println(mag_hero_one.Attack("Eye of Agamotto"));
        System.out.println(mag_hero_one.Rest());

        // Add additional heroes (Vigilante, Speedster, Iconic) below in similar way...

        // Final note to indicate end:
        System.out.println("\n\nAll heroes have been displayed successfully!\n" + "*".repeat(125));
    }
}
