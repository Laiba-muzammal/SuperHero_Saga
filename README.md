# 🦸‍♂️ Superhero Universe – Java OOP Project

This Java project models a dynamic Superhero Universe using Object-Oriented Programming principles like **inheritance**, **abstraction**, **constructor overloading**, and **method overriding**. Multiple types of heroes (like Physical, Mage, Vigilante, Speedster, and Iconic) are defined, each with custom attributes and behavior.

---

## 📁 Project Structure

```bash
SuperheroUniverse/
│
├── Main.java                 # Main driver class with all implementations
├── superheroes/
│   ├── SuperHero.java        # Abstract base class
│   ├── PhysicalHero.java     # Physical strength-based hero
│   ├── MageHero.java         # Mana-based magic hero
│   ├── Vigilante.java        # Weapon-based non-powered hero
│   ├── Speedster.java        # Speed- and calorie-based hero
│   └── Iconic.java           # Special physical hero with unique abilities
```

---

### 🧩 Features
🧬 Abstract class SuperHero with core properties (name, description, occupation, age, etc.)

🛠 Constructor overloading for flexible initialization of heroes

🎯 Method overriding for custom Attack() and Rest() behaviors

🚫 Validation: Null and invalid values are safely handled via exceptions

🔁 Dynamic changes: Each hero's stats change during attack and rest

---

### 🚀 Working
This project simulates a set of heroes, each with their own behavior and characteristics.

PhysicalHero loses 1/3rd of its strength on attack and regains it 4x on rest.

MageHero consumes 1/3rd of its mana when casting a spell and restores it on rest.

Vigilante uses limited weapons for attack; must rest to refill.

Speedster uses topSpeed and dailyCal in addition to physical strength, reducing them per attack and regenerating during rest.

Iconic heroes have a speciality and behave like advanced PhysicalHeroes.

> All hero classes override the abstract methods Attack() and Rest() and print descriptive outputs during runtime.

> The main() method creates 3 objects of each type, performs attack/rest cycles, and prints detailed summaries using overridden toString() methods.

---

### ✅ Example Output

```bash
Welcome To Our Superhero Universe!

*****************************************************************************************************
Hero Name: Wonder Woman
Real Name: Diana Prince
Occupation: Writer
Hero Description: As a demi-goddess...
Age: Over 2,000 years old (immortal)
Flight: true
Physical Strength: 7500
Wonder Woman performs a physical attack with Sword and Shield Combat & strength left now is: 5000
Wonder Woman rests & its strength resets to 20000
...
```

---

### 🧠 Concepts Used
abstract class and method

Constructor chaining and overloading

Method overriding and polymorphism

Java access control and validation

String formatting and concatenation

Reusability and inheritance

---

### 📌 Requirements
Java 8 or above

Basic understanding of OOP

---

### 🔧 How to Run
##### Compile all .java files:

```bash
javac Main.java
```

##### Run the program:

```bash
java Main
```

---

### 🧑‍💻 Author
Made with ❤️ for OOP concepts learning and creative Java practice.

