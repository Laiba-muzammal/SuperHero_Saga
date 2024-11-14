public class Main {
 static abstract class SuperHero {
 String HeroName;
 String RealName;
 String occupation;
 String HeroDescription;
 String age;
 Boolean canFly;
 public SuperHero(String HeroName, String RealName, String occupation, String 
HeroDescription, String age, Boolean canFly) {
 if (HeroName == null || RealName == null || occupation == null || HeroDescription == 
null || age == null || canFly == null) {
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
 abstract String Attack(String source);
 abstract String Rest();
 public String toString() {
 StringBuffer result = new StringBuffer();
 result.append("Hero Name: ").append(HeroName).append("\n")
 .append("Real Name: ").append(RealName).append("\n")
 .append("Occupation: ").append(occupation).append("\n")
 .append("Hero Description: ").append(HeroDescription).append("\n")
 .append("Age: ").append(age).append("\n")
 .append("Flight: ").append(canFly);
 return result.toString();
 }
 }
 static class PhysicalHero extends SuperHero {
 int PhysicalStrength;
 public PhysicalHero(String HeroName, String RealName, String occupation, String 
HeroDescription, String age, Boolean canFly, int PhysicalStrength) {
 super(HeroName, RealName, occupation, HeroDescription, age, canFly);
 this.PhysicalStrength = PhysicalStrength;
 }
 
 public PhysicalHero(String HeroName, String HeroDescription, Boolean canFly, int 
PhysicalStrength) {
 super(HeroName, HeroDescription, canFly);
 this.PhysicalStrength = PhysicalStrength;
 }
 
 public PhysicalHero(String RealName, String occupation, String age, int PhysicalStrength) 
{
 super(RealName, occupation, age);
 this.PhysicalStrength = PhysicalStrength;
 }
 
 public PhysicalHero() {
 super();
 this.PhysicalStrength = 1300;
 }
 public String Attack(String source) {
 PhysicalStrength -= PhysicalStrength / 3;
 return HeroName + " performs a physical attack with " + source + " & strength left now 
is: " + PhysicalStrength;
 }
 
 public String Attack(String source, int PhysicalStrength) {
 if (source == null || source.isEmpty()) {
 throw new IllegalArgumentException("Attack source cannot be null or empty");
 }
 if (PhysicalStrength <= 0) {
 throw new IllegalArgumentException("Physical strength must be greater than zero");
 }
 int lost = PhysicalStrength / 3;
 return HeroName + " performs an attack with " + source + " & has lost one-third of the 
physical strength i.e., " + lost;
 }
 public String Rest() {
 PhysicalStrength *= 4;
 return HeroName + " rests & its strength resets to " + PhysicalStrength + 
"\n\n"+"*".repeat(125)+"\n";
 }
 public String Rest(int PhysicalStrength) {
 if (PhysicalStrength <= 0) {
 throw new IllegalArgumentException("Physical strength must be positive to rest");
 }
 int restedPhysicalStrength = PhysicalStrength * 4;
 return HeroName + " has rested and regained physical strength. New physical strength: " 
+ restedPhysicalStrength; }
 public String toString() {
 StringBuffer result = new StringBuffer(super.toString());
 result.append("\nPhysical Strength: ").append(PhysicalStrength);
 return result.toString();
 }
 }
 
 static class MageHero extends SuperHero {
 public MageHero(String HeroName, String RealName, String occupation, String 
HeroDescription, String age, Boolean canFly, int ManaCapacity) {
 super(HeroName, RealName, occupation, HeroDescription, age, canFly);
 if (ManaCapacity <= 0) {
 throw new IllegalArgumentException("Mana Capacity must be greater than zero");
 }
 this.ManaCapacity = ManaCapacity;
 }
 
 public MageHero(String HeroName, String HeroDescription, Boolean canFly, int 
ManaCapacity) {
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
 int ManaCapacity;
 String Attack(String source) {
 ManaCapacity /= 3;
 return HeroName + " casts " + source + ", mana is left with: " + ManaCapacity;
 }
 public String Attack(String source, int ManaCapacity) {
 int lost = ManaCapacity / 3;
 return HeroName + " performs a physical attack with " + source + " & has lost one-third 
of the mana capacity i.e.," + lost + " & strength left now is: " + ManaCapacity;
 }
 String Rest() {
 ManaCapacity *= 2.5;
 return HeroName + " rests & its capacity resets to: " + ManaCapacity + 
"\n\n"+"*".repeat(125)+"\n";
 }
 public String Rest(int ManaCapacity) {
 if (ManaCapacity <= 0) {
 throw new IllegalArgumentException("Mana capacity must be positive to rest");
 }
 int restedManaCapacity = ManaCapacity * 4;
 return HeroName + " has rested and regained mana. New mana capacity: " + 
restedManaCapacity;
 }
 public String toString() {
 StringBuffer result = new StringBuffer(super.toString());
 result.append("\nMana Capacity: ").append(ManaCapacity);
 return result.toString();
 }
 }
 static class Vigilante extends SuperHero {
 String PrimaryWeapon;
 int total;
 public Vigilante(String HeroName, String RealName, String occupation, String 
HeroDescription, String age, Boolean canFly, String PrimaryWeapon, int total) {
 super(HeroName, RealName, occupation, HeroDescription, age, canFly);
 this.PrimaryWeapon = PrimaryWeapon;
 this.total = total;
 }
 public Vigilante(String HeroName, String HeroDescription,Boolean canFly, String 
PrimaryWeapon, int total) {
 super(HeroName,HeroDescription,canFly);
 this.PrimaryWeapon = PrimaryWeapon;
 this.total = total;
 }
 
 public Vigilante(String RealName, String occupation, String age,String PrimaryWeapon, int 
total) {
 super(RealName, occupation, age);
 this.PrimaryWeapon = PrimaryWeapon;
 this.total = total;
 }
 public Vigilante() {
 super();
 this.PrimaryWeapon = "None"; 
 this.total = 0;;
 } 
 
 String Attack(String PrimaryWeapon) {
 return HeroName + " attacks with " + PrimaryWeapon + ", & needs to rest to use it 
again";
 }
 public String Attack(String PrimaryWeapon, int total) {
 if (total <= 0) {
 return HeroName + " has no weapons left to attack!";
 }
 int left = total - 1;
 return HeroName + " attacks with " + PrimaryWeapon + ", & now remaining weapons 
are: " + left;
 }
 String Rest() {
 return HeroName + " rests & is ready to use its weapon " + PrimaryWeapon + " 
now\n\n"+"*".repeat(125)+"\n";
 }
 public String Rest(int total) {
 if (total <= 0) {
 return HeroName + " has no weapons to rest!";
 }
 int left = total - 1;
 int net = left + 1;
 return HeroName + " rests & total number of the " + PrimaryWeapon + " has been 
updated to: " + net + "\n\n"+"*".repeat(125)+"\n";
 }
 public String toString() {
 StringBuffer result = new StringBuffer(super.toString());
 result.append("\nPrimary Weapon: ").append(PrimaryWeapon);
 return result.toString();
 }
 }
 static class Speedster extends PhysicalHero {
 int dailyCal;
 int topSpeed;
 public Speedster(String HeroName, String RealName, String occupation, String 
HeroDescription, String age, Boolean canFly, int PhysicalStrength, int topSpeed, int dailyCal) {
 super(HeroName, RealName, occupation, HeroDescription, age, canFly, 
PhysicalStrength);
 this.topSpeed = topSpeed;
 this.dailyCal = dailyCal;
 }
 
 public Speedster(String HeroName,String HeroDescription, Boolean canFly, int 
PhysicalStrength, int topSpeed, int dailyCal) {
 super(HeroName, HeroDescription, canFly, PhysicalStrength);
 this.topSpeed = topSpeed;
 this.dailyCal = dailyCal;
 }
 
 public Speedster(String RealName, String occupation, String age, int PhysicalStrength, int 
topSpeed, int dailyCal) {
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
 return HeroName + " performs a physical attack with " + source + " & strength left now 
is: " + PhysicalStrength;
 }
 public String Attack(String source, int topSpeed) {
 topSpeed = topSpeed - topSpeed / 3;
 return HeroName + " performs a physical attack with " + source + " & its speed is 
temporarily reduced to: " + topSpeed;
 }
 public String Attack(int PhysicalStrength, String source, int dailyCal) {
 dailyCal = dailyCal - dailyCal / 3;
 PhysicalStrength -= PhysicalStrength / 3;
 return HeroName + " performs a physical attack with " + source + " & its calories are 
temporarily reduced to: " + dailyCal + " & strength left now is: " + PhysicalStrength;
 }
 public String Rest() {
 PhysicalStrength *= 4;
 return HeroName + " rests & its strength resets to " + PhysicalStrength 
+"\n\n"+"*".repeat(125)+"\n";
 }
 public String Rest(int PhysicalStrength, int topSpeed) {
 int net = PhysicalStrength * 4;
 int increased = net - PhysicalStrength;
 int net_top = topSpeed * 2;
 return HeroName + " rests & its strength has increased by the value of: " + increased + 
"wrt to its original strength resulting in a net strength of: " + net + "\n & its speed has become 
twice of its original value i.e.," + topSpeed + "\n\n"+"*".repeat(125)+"\n";
 }
 public String Rest(int dailyCal) {
 int net = dailyCal * 3;
 int increased = net - dailyCal;
 return HeroName + " rests & its calories has been increased by the value of: " + increased 
+ "wrt to its original calories resulting in a net calories : " +"\n\n"+"*".repeat(125)+"\n";
 }
 public String toString() {
 StringBuffer result = new StringBuffer(super.toString());
 result.append("\nTop Speed: ").append(topSpeed)
 .append("\nDaily Calories: ").append(dailyCal);
 return result.toString();
 }
 }
 
 static class Iconic extends PhysicalHero {
 String speciality;
 public Iconic(String HeroName, String RealName, String occupation, String 
HeroDescription, String age, Boolean canFly, int PhysicalStrength,String speciality) {
 super(HeroName, RealName, occupation, HeroDescription, age, canFly, 
PhysicalStrength);
 this.speciality=speciality;
 }
 
 public Iconic(String HeroName,String HeroDescription, Boolean canFly, int 
PhysicalStrength,String speciality) {
 super(HeroName, HeroDescription, canFly, PhysicalStrength);
 this.speciality=speciality;
 }
 
 public Iconic(String RealName, String occupation, String age, int PhysicalStrength,String 
speciality) {
 super(RealName, occupation, age, PhysicalStrength);
 this.speciality=speciality;
 }
 
 public Iconic() {
 super();
 this.speciality="None";
 }
 public String Attack(String source) {
 PhysicalStrength -= PhysicalStrength / 3;
 return HeroName + " performs a physical attack with " + source + " & strength left now 
is: " + PhysicalStrength;
 }
 public String Attack(int PhysicalStrength, String speciality) {
 PhysicalStrength -= PhysicalStrength / 3;
 return HeroName + " performs a special attack with " + speciality +". Its strength left 
now is: " + PhysicalStrength;
 }
 public String Rest() {
 PhysicalStrength *= 4;
 return HeroName + " rests & its strength resets to " + PhysicalStrength 
+"\n\n"+"*".repeat(125)+"\n";
 }
 public String toString() {
 return super.toString() +
 "\nSpeciality: " + speciality; 
 }
 }
 public static void main(String[] args) {
 System.out.println("Welcome To Our Superhero Universe!\n\n"+"*".repeat(125)+"\n");
 
 PhysicalHero phy_hero_one = new PhysicalHero("Wonder Woman", "Diana Prince", 
"Writer", "As a demi-goddess, Wonder Woman possesses incredible strength, enhanced by her 
Amazonian heritage.\nHer physical power allows her to compete with some of the strongest 
beings in the universe", "Over 2,000 years old (immortal)", true, 7500);
 PhysicalHero phy_hero_two = new PhysicalHero("Thor", "God of Thunder", "Asgardian 
Prince", "Thor is a Norse god, the son of Odin, with the power to control thunder and 
lightning.\n He uses his enchanted hammer, Mjolnir, to fly and fight his enemies", "Over 1,500 
years old (immortal)", true, 5000);
 PhysicalHero phy_hero_three = new PhysicalHero("Black Panther", "T'Challa", " King of 
Wakanda", "The King of Wakanda, Black Panther, gains his enhanced strength, speed, and 
agility \nthrough the heart-shaped herb. He wears a vibranium suit and is a master of hand-tohand combat.", "30-40 years", false, 1500);
 System.out.println(phy_hero_one.toString());
 System.out.println(phy_hero_one.Attack("Sword and Shield Combat"));
 System.out.println(phy_hero_one.Rest());
 System.out.println(phy_hero_two.toString());
 System.out.println(phy_hero_two.Attack("Mjolnir Hammer Strike", 5000));
 System.out.println(phy_hero_two.Rest());
 System.out.println(phy_hero_three.toString());
 System.out.println(phy_hero_three.Attack("Panther Slash"));
 System.out.println(phy_hero_three.Rest(1500));
 MageHero mag_hero_one = new MageHero("Doctor Strange", "Stephen Strange", 
"Sorcerer Supreme, Former Neurosurgeon", "Doctor Strange is a former surgeon who becomes 
the Sorcerer Supreme after learning the mystical arts.\nHe can manipulate magic and travel 
across dimensions, using his powers to protect Earth.", "40-50 years", true, 3000);
 MageHero mag_hero_two = new MageHero("Scarlet Witch", "Wanda Maximoff", "Former 
Hydra Experiment", "Wanda Maximoff has reality-warping abilities, allowing her to manipulate 
probability,\nenergy, and even alter reality itself. She is a key member of the Avengers.", "30-40 
years", true, 4500);
 MageHero mag_hero_three = new MageHero("Zatanna", "Zatanna Zatara", "Stage 
Magician, Justice League Member", "Zatanna is a powerful magician who can cast spells by 
speaking words backward. \nShe is skilled in both offensive and defensive magic, using her 
abilities to protect the world from mystical threats.", "30-35 years", false, 3500);
 System.out.println(mag_hero_one.toString());
 System.out.println(mag_hero_one.Attack("Eye of Agamotto"));
 System.out.println(mag_hero_one.Rest());
 System.out.println(mag_hero_two.toString());
 System.out.println(mag_hero_two.Attack("Chaos Magic", 4500));
 System.out.println(mag_hero_two.Rest());
 System.out.println(mag_hero_three.toString());
 System.out.println(mag_hero_three.Attack("Spell of Banishment"));
 System.out.println(mag_hero_three.Rest(3500));
 Vigilante vig_hero_one = new Vigilante("Daredevil", "Matt Murdock", "Lawyer", "Matt 
Murdock is a blind lawyer who becomes Daredevil, using his enhanced senses to fight crime in 
Kitchen of Hella.\nHe relies on his acrobatic skills, martial arts expertise, and heightened senses 
to fight injustice.", "30-40 years", false, "Twin Escrima Sticks", 10);
 Vigilante vig_hero_two = new Vigilante("The Punisher", "Frank Castle", "Former Marine", 
"Frank Castle becomes the Punisher after his family is killed by the mob.\nHe uses his military 
training and a vast arsenal of weapons to exact vengeance on criminals.", "35-45 years", false, 
"M16 Assault Rifle", 7);
 Vigilante vig_hero_three = new Vigilante("Green Arrow", "Oliver Queen", "Billionaire", 
"Green Arrow is an expert archer with perfect aim. After surviving on an isolated island, \nhe 
returns to Star City to fight corruption and crime, using his archery skills and a wide array of 
trick arrows.", "30-40 years", false, "Bow and Trick Arrows", 9);
 System.out.println(vig_hero_one.toString());
 System.out.println(vig_hero_one.Attack("Twin Escrima Sticks"));
 System.out.println(vig_hero_one.Rest());
 System.out.println(vig_hero_two.toString());
 System.out.println(vig_hero_two.Attack("Tactical Ambushes", 7));
 System.out.println(vig_hero_two.Rest());
 System.out.println(vig_hero_three.toString());
 System.out.println(vig_hero_three.Attack("Explosive Arrow Shot"));
 System.out.println(vig_hero_three.Rest(9));
 Speedster spd_hero_one = new Speedster("Impulse", "Bart Allen", "Hero-in-training", "Bart 
Allen, a descendant of The Flash, has inherited the incredible speed of his family. \nHe uses his 
powers to fight injustice but often struggles with controlling his energy intake.", "15 years", 
false, 12000, 15000, 20000);
 Speedster spd_hero_two = new Speedster("Velocity", "John Fox", "Scientist", "Velocity, a 
scientist from the future, has the power to run at velocities that break the fabric of time. \nHis 
speed allows him to travel through time, but it also demands a constant intake of energy.", "35 
years", false, 14000, 17000, 25000);
 Speedster spd_hero_three = new Speedster("Sonic", "Sonic the Hedgehog", "Freedom 
Fighter", "Sonic the Hedgehog, known for his incredible speed, is always on the move and never 
stops fighting for freedom. \nHis lightning-fast speed allows him to outmaneuver enemies with 
ease.", "16 years", false, 17000, 19000, 30000);
 System.out.println(spd_hero_one.toString());
 System.out.println(spd_hero_one.Attack("Speed Kick"));
 System.out.println(spd_hero_one.Rest(20000));
 System.out.println(spd_hero_two.toString());
 System.out.println(spd_hero_two.Attack("Time Warp Strike", 17000));
 System.out.println(spd_hero_two.Rest(14000, 17000));
 System.out.println(spd_hero_three.toString());
 System.out.println(spd_hero_three.Attack(17000, "Spin Dash", 30000));
 System.out.println(spd_hero_three.Rest());
 
 Iconic ic_hero_one = new Iconic("Iron Rhino", "Terrell Mason", "Engineer", "Terrell 
developed a battle suit resembling a rhino's armor after an industrial accident left him 
handicapped. \nNow, he uses his immense strength and technology to fight crime, capable of 
charging through anything.", "40 years", false, 22000,"Rhino Charge");
 Iconic ic_hero_two = new Iconic("Blitz Hawk", "Damon Stroud", "Test Pilot", "A fearless 
test pilot who gained extraordinary speed and reflexes after an experimental flight went wrong. 
\nWith wings made of pure energy, he can move faster than sound but is limited to ground 
combat when his wings are drained.", "37 years", false, 38000, "Hawk Sword");
 Iconic ic_hero_three = new Iconic("Viper Fist", "Connor Jade", "Martial Arts Instructor", 
"Trained in an ancient martial arts technique that enhances the user's muscles to deadly extremes. 
\nHis punches are venomous, striking with bone-shattering force, but each strike comes at a toll 
to his stamina.", "66 years", true, 47000,"Venom Strikes");
 System.out.println(ic_hero_one.toString());
 System.out.println(ic_hero_one.Attack("Aerial Barrage"));
 System.out.println(ic_hero_one.Rest());
 System.out.println(ic_hero_two.toString());
 System.out.println(ic_hero_two.Attack(38000,"Hawk Sword"));
 System.out.println(ic_hero_two.Rest());
 System.out.println(ic_hero_three.toString());
 System.out.println(ic_hero_three.Attack("Venomous Lash"));
 System.out.println(ic_hero_three.Rest());
 }
}
