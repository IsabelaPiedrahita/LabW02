package cargobay;

/**
 * This class represents the cargo bay of a single ship, laid out
 * as a grid of bay levels and storage slots.
 * 
 * Lab W02: Galactic Fleet Inventory
 * @version 1.0
 * @author Isabela Piedrahita
 */
public class CargoBay {

    int[][] bayGrid = {
        {12, 0, 8, 0},
        {0, 0, 15, 3},
        {7, 22, 0, 0}
    };

    int slotCapacity = 20;

    public int countEmptySlots() {
        int count = 0;
        for (int row = 0; row < bayGrid.length; row++) {
            for (int col = 0; col < bayGrid[row].length; col++) {
                if (bayGrid[row][col] == 0) {
                    count++;
                }
            }
        }
        return count;
    }

    public boolean hasOverloadedSlot() {
        for (int row = 0; row < bayGrid.length; row++) {
            for (int col = 0; col < bayGrid[row].length; col++) {
                if (bayGrid[row][col] > slotCapacity) {
                    return true;
                }
            }
        }
        return false;
    }
    public void printGridReport() {
        for (int row = 0; row < bayGrid.length; row++) {
            for (int col = 0; col < bayGrid[row].length; col++) {
                System.out.print(bayGrid[row][col] + " ");
            }
            System.out.println();
        }
        System.out.println("Empty slots: " + countEmptySlots());
        System.out.println("Has an overloaded slot: " + hasOverloadedSlot());
    }
}