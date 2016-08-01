/*
 * this class generates a random number between 
1 and 6 since the dice through the method getNumberSide and this method is used for each
intance of classes Hydrons and Zexors
 */
package edgardproject2;

public class DiceRoll {
   private int numberSide;

    public DiceRoll() {
    }
   
   public int getNumberSide(){
   numberSide= 1+(int)(Math.random()*6);
   return numberSide;
   }
   
    
}
