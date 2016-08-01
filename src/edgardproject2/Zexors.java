/*This file contains my class Zexors and its attributs and methods
 */
package edgardproject2;

public class Zexors {
    /*instance variable of my class Zexors*/
    private final static String COLORZEXORS = "RED";//constance variable for the Zexors object
    private double heightZexors;// variable to hold the Zexors's object 
    private int weightZexors;//variable to hold the zexors's object
    private int healthMaxZexors = 25;//variable to hold the zexors's health object
    private int damagePotentialZexors;// variable to hold the damage potential for zexors object
    private final static String ATTACKTYPE = "fireGround"; //variable constance to hold the type attack for Zexors object
    private int batteWonZexors;//variable to hold the number of battle won
    private int battleLostZexors;//variable to hold the number of battle lost
    private String nameZexors;//variable to hold the name of my zexors object
    private final static String SPECIE = "zexors";//static variable to hold the specie
    private DiceRoll diceRollZexor = new DiceRoll();// I create an instance of DiceRoll to use its method to
  /* Constructor of my class Zexors with 4 parameters(heightZexors,weightZexors,damagePotentialZexors,nameZexors) to create an instance of my class */
    public Zexors(double heightZexors, int weightZexors, int damagePotentialZexors, String nameZexors) {
        this.heightZexors = heightZexors;
        this.weightZexors = weightZexors;
        this.damagePotentialZexors = damagePotentialZexors;
        this.nameZexors = nameZexors;
    }
/*Getters and Setters of my class*/
    public double getHeightZexors() {
        return heightZexors;
    }

    public void setHeightZexors(double heightZexors) {
        this.heightZexors = heightZexors;
    }

    public int getWeightZexors() {
        return weightZexors;
    }

    public void setWeightZexors(int weightZexors) {
        this.weightZexors = weightZexors;
    }

    public int getHealthMaxZexors() {
        if (this.healthMaxZexors < 0) {
            return 0;
        }
        return this.healthMaxZexors;
    }
    public int getDamagePotentialZexors() {
        return damagePotentialZexors;
    }

    public void setDamagePotentialZexors(int damagePotentialZexors) {
        this.damagePotentialZexors = damagePotentialZexors;
    }

    public int getBatteWonZexors() {
        return batteWonZexors;
    }

    public void setBatteWonZexors(int batteWonZexors) {
        this.batteWonZexors+= batteWonZexors;
    }

    public int getBattleLostZexors() {
        return battleLostZexors;
    }

    public void setBattleLostZexors(int battleLostZexors) {
        this.battleLostZexors+= battleLostZexors;
    }

    public String getNameZexors() {
        return nameZexors;
    }

    public void setNameZexors(String nameZexors) {
        this.nameZexors = nameZexors;
    }

    public static String getColorZexors() {
        return COLORZEXORS;
    }

    public static String getATTACKTYPE() {
        return ATTACKTYPE;
    }

    public static String getSPECIE() {
        return SPECIE;
    }
   /*This setter just verifies if the value to set the health of any
    Zexors is not superior to 25 or negative before assigning that value to instance variable healthMaxZexors*/
    public void setHealthMaxZexors(int healthMaxZexors) {
        if (healthMaxZexors >= 25) {
            this.healthMaxZexors = 25;
        }
        if (healthMaxZexors < 0) {
            this.healthMaxZexors = 0;
        }
        if (healthMaxZexors >= 0 && healthMaxZexors <= 25) {
            this.healthMaxZexors = healthMaxZexors;
        }
    }
    // method to return randomly the side number of dice of my zexor object
    public int getRollSideNumberZexor() {
        return diceRollZexor.getNumberSide();
    }
}
