/*This project is a Simple RPG battle game  between two opponents  Hydrons and Zexors
the users is supposed to create 3 objects for each group. the battle is based on the dice roll 
the combatant with the higher dice roll number win the battle affects the health of his opponent
the game over when one of 6 combatant has a health of 0
This file contains my main class that allows to test our objects and our methods.
Author:Edgard Zafack
 */
package edgardproject2;
public class TestClassMain {
    public static void main(String[] args) {
        /* from here i create 3 creature or object hydronEd,hydronPaul,hydronMatt from my class Hydrons with different
        a height,weigh,domage potential and name*/
        Hydrons hydronPaul = new Hydrons(5.4, 189, 8, "HydronPaul");// 
        Hydrons hydronEd = new Hydrons(6.3, 123, 9, "HydronEd");
        Hydrons hydronMatt = new Hydrons(6.0, 156, 7, "HydronMatt");
        /* from here i create 3 creature or object zexorsFred,ZexorsEliz,ZexorsEric from my class Zexors with different
        a height,weigh,domage potential and name*/
        Zexors zexorsEric = new Zexors(5.9, 145, 6, "zexorsEric");
        Zexors zexorsFred = new Zexors(5.9, 145, 9, "zexorsFred");
        Zexors zexorsEliz = new Zexors(5.9, 145, 10, "zexorsEliz");
        Hydrons[] hydroTab = {hydronPaul, hydronEd, hydronMatt};//i declare and initialize an array of Hydrons that holds the 3 instance of hydron class
        Zexors[] zexorTab = {zexorsFred, zexorsEric, zexorsEliz};//i declare and initialize an array of Zexors that holds the 3 instance of zexors class
        int i, j, b = 1;
         System.out.println("                     Simple RPG Battle Game    ");
        do {
            i = (int) (Math.random() * 3);// i generate an index i for my array of hydrons to choose randomly a creature from Hydrons
            j = (int) (Math.random() * 3);//i generate an index j for my array of Zexors to choose randomly a creature from Zexors
            int hydroRoll = hydroTab[i].getDiceRollNumberHydron();// i declare an integer hydroRoll that holds the number rolled by a hydron
            int zexorRoll = zexorTab[j].getRollSideNumberZexor();// i declare an integer zexorRool that holds the number rolled by a Zexors
            for (int k = 0; k < 3; k++) {
                if (k != i) {
                    hydroTab[k].setHealthMaxHydron(hydroTab[k].getHealthMaxHydron() + 1);// i increase by 1 the health of hydrons that dont engage in battle
                }
                if (k != j) {
                    zexorTab[k].setHealthMaxZexors(zexorTab[k].getHealthMaxZexors() + 1);// i increase by 1 the health of Zexors that dont engage in battle
                }
            }
            System.out.println("----------------------------------------------------------------------");
            System.out.println("battle " + b++ + " between " + hydroTab[i].getNameHydron() + " with health " + hydroTab[i].getHealthMaxHydron() + " and " + zexorTab[j].getNameZexors() + " with health " + zexorTab[j].getHealthMaxZexors());
            /* after checking which creature of each group has the higher roll number i use 
            if statement to increment the batlle won or battle lost and then i affect the domage potential on the loser's health */
            if (hydroRoll > zexorRoll) {
                System.out.println(hydroTab[i].getNameHydron() + " rolls " + hydroRoll + " and " + zexorTab[j].getNameZexors() + " rolls " + zexorRoll + " ,so " + hydroTab[i].getNameHydron() + " has won");
                hydroTab[i].setBatteWonHydron(1);
                zexorTab[j].setBattleLostZexors(1);
                zexorTab[j].setHealthMaxZexors(zexorTab[j].getHealthMaxZexors() - hydroTab[i].getDamagePotentialHydron());

            }
            if (hydroRoll < zexorRoll) {
                System.out.println(hydroTab[i].getNameHydron() + " rolls " + hydroRoll + " and " + zexorTab[j].getNameZexors() + " rolls " + zexorRoll + " ,so " + zexorTab[j].getNameZexors() + " has won");

                hydroTab[i].setHealthMaxHydron(hydroTab[i].getHealthMaxHydron() - zexorTab[j].getDamagePotentialZexors());
                hydroTab[i].setBattleLostHydron(1);
                zexorTab[j].setBatteWonZexors(1);
            }
            if (hydroRoll == zexorRoll) {
                continue;
            }
            if (zexorTab[j].getHealthMaxZexors() == 0 || hydroTab[i].getHealthMaxHydron() == 0) {
                if (zexorTab[j].getHealthMaxZexors() == 0) {
                    System.out.println("battle " + b++ + " between " + hydroTab[i].getNameHydron() + " with health " + hydroTab[i].getHealthMaxHydron() + " and " + zexorTab[j].getNameZexors() + " with health " + zexorTab[j].getHealthMaxZexors() + "\nthe game is over since " + zexorTab[j].getNameZexors() + " health is " + zexorTab[j].getHealthMaxZexors());
                }
                if (hydroTab[i].getHealthMaxHydron() == 0) {
                    System.out.println("battle " + b++ + " between " + hydroTab[i].getNameHydron() + " with health " + hydroTab[i].getHealthMaxHydron() + " and " + zexorTab[j].getNameZexors() + " with health " + zexorTab[j].getHealthMaxZexors() + "\nthe game is over since " + hydroTab[i].getNameHydron() + " health is " + hydroTab[i].getHealthMaxHydron());
                }
                break;
            }
        } while (zexorTab[j].getHealthMaxZexors() != 0 || hydroTab[i].getHealthMaxHydron() != 0);
        System.out.println("\n result for the Zexors Squad");
        for (int a = 0; a < 3; a++) {
            System.out.println("name:" + zexorTab[a].getNameZexors() + " and its health = " + zexorTab[a].getHealthMaxZexors() + ",its battle won = " + zexorTab[a].getBatteWonZexors()
                    + ",its battle lost=" + zexorTab[a].getBattleLostZexors());
        }
        System.out.println("\n result for the Hydrons Squad");
        for (int a = 0; a < 3; a++) {
            System.out.println("name: " + hydroTab[a].getNameHydron() + ", its health = " + hydroTab[a].getHealthMaxHydron() + ",its battle won = " + hydroTab[a].getBatteWonHydron()
                    + " ,its battle lost=" + hydroTab[a].getBattleLostHydron());
        }
    }
}
