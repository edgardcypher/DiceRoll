/*
 /*This file contains my class Hydrons and its attributs and methods
 */
package edgardproject2;
public class Hydrons {
    /*instance variable of my class HYDRONS*/
    public final static String COLORHYDRON = "BLUE";
    private double heightHydron;
    private int weightHydron;
    private int healthMaxHydron = 25;
    private final int damagePotentialHydron;
    public final static String ATTACKTYPEHYDRON = "thunderGround";
    private int batteWonHydron;
    private int battleLostHydron;
    private String nameHydron;
    public final static String HOMEPLANETHYDRON = "hydrocon";
    DiceRoll diceRollHydron = new DiceRoll();
  /* Constructor of my class Hydrons with 4 parameters(heightHydron,weightHydron,damagePotentialHydron,nameHydron) to create an instance of my class */
    public Hydrons(double heightHydron, int weightHydron, final int damagePotentialHydron, String nameHydron) {
        this.heightHydron = heightHydron;
        this.weightHydron = weightHydron;
        this.damagePotentialHydron = damagePotentialHydron;
        this.nameHydron = nameHydron;
    }

    public double getHeightHydron() {
        return heightHydron;
    }

    public void setHeightHydron(double heightHydron) {
        this.heightHydron = heightHydron;
    }

    public int getWeightHydron() {
        return weightHydron;
    }

    public void setWeightHydron(int weightHydron) {
        this.weightHydron = weightHydron;
    }

    public int getHealthMaxHydron() {
        if (healthMaxHydron < 0) {
            return 0;
        } else {
            return healthMaxHydron;
        }
    }

    public int getDamagePotentialHydron() {
        return damagePotentialHydron;
    }

    /*public void setDamagePotentialHydron(final int damagePotentialHydron) {
        this.damagePotentialHydron = damagePotentialHydron;
    }*/
    public int getBatteWonHydron() {
        return batteWonHydron;
    }

    public void setBatteWonHydron(int batteWonHydron) {
        this.batteWonHydron += batteWonHydron;
    }

    public int getBattleLostHydron() {
        return battleLostHydron;
    }

    public void setBattleLostHydron(int battleLostHydron) {
        this.battleLostHydron += battleLostHydron;
    }

    public String getNameHydron() {
        return nameHydron;
    }

    public void setNameHydron(String nameHydron) {
        this.nameHydron = nameHydron;
    }
    /*This setter just verifie if the value to set the health of any
    hydron is not superior to 25 or negative before assigning that value to instance variable healthMaxHydron*/
    public void setHealthMaxHydron(int healthMaxHydron) {
        if (healthMaxHydron >= 25) {
            this.healthMaxHydron = 25;
        }
        if (healthMaxHydron < 0) {
            this.healthMaxHydron = 0;
        }
        if (healthMaxHydron >= 0 && healthMaxHydron <= 25) {
            this.healthMaxHydron = healthMaxHydron;
        }
    }
    // method to return randomly the side number dice of my Hydron object

    public int getDiceRollNumberHydron() {
        return diceRollHydron.getNumberSide();
    }

    

}
