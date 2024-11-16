package bighero;

/**
 *
 * @author ROKAYA SULTANA RAKA
 */
public class Hero {

    private String name;
    private int strength;
    private int intelligence;
    private int speed;
    private int stamina;
    private int experiencePoints;
    private int energy;

    public Hero(String name, int strength, int intelligence, int speed, int stamina) {
        this.name = name;
        this.strength = strength;
        this.intelligence = intelligence;
        this.speed = speed;
        this.stamina = stamina;
        this.experiencePoints = 0;
        this.energy = 100;
    }

    public String getName() {
        return name;
    }

    public int getStrength() {
        return strength;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public int getSpeed() {
        return speed;
    }

    public int getStamina() {
        return stamina;
    }

    public int getExperiencePoints() {
        return experiencePoints;
    }

    public int getEnergy() {
        return energy;
    }

    public void train(String attribute) {
        if (energy >= 10) {
            attribute = attribute.toLowerCase(); 
            if (attribute.equals("strength")) {
                strength += 5;
            } else if (attribute.equals("intelligence")) {
                intelligence += 5;
            } else if (attribute.equals("speed")) {
                speed += 5;
            } else if (attribute.equals("stamina")) {
                stamina += 5;
            } else {
                System.out.println("Invalid attribute! Please choose strength, intelligence, speed, or stamina.");
                return; 
            }

            experiencePoints += 10; 
            energy -= 10; 
            System.out.println(attribute.substring(0, 1).toUpperCase() + attribute.substring(1) + " increased by 5!");
        } else {
            System.out.println("Not enough energy to train! Current energy: " + energy);
        }
    }

    public void restoreEnergy() {
        this.energy = 100;
    }
}
