package jv;

public class Main {
    public static void main(String[] args) {
        SuccessfulPairsOfSpellsAndPotions_2300 successfulPairsOfSpellsAndPotions2300 = new SuccessfulPairsOfSpellsAndPotions_2300();
        int[] spells = {3,1,2};
        int[] potions = {8,5,8};
        for (int key: successfulPairsOfSpellsAndPotions2300.successfulPairs(spells,potions,16)) {
            System.out.println(key);
        }
    }
}
