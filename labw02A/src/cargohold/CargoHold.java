package cargohold;

/**
 * This class represents the cargo hold of a single ship. It stores how
 * many units of each supply type are aboard the ship, and it will
 * provide a few methods that summarize that cargo.
 *
 * Lab W02: Galactic Fleet Inventory
 * @version 1.0
 * @author Isabela Piedrahita
 */
public class CargoHold {

    int[] cargoUnits = {42, 17, 88, 5, 63, 24, 71, 9};

    /**
     * Returns the total number of units across every supply type.
     */
    public int getTotalUnits() {
        int total = 0;
        for (int i = 0; i < cargoUnits.length; i++) {
            total += cargoUnits[i];
        }
        return total;
    }

    /**
     * Returns the amount of the most heavily stocked supply type.
     */
    public int getMostStockedAmount() {
        int max = cargoUnits[0];
        for (int i = 1; i < cargoUnits.length; i++) {
            if (cargoUnits[i] > max) {
                max = cargoUnits[i];
            }
        }
        return max;
    }

    /**
     * Returns the amount of the least stocked supply type.
     */
    public int getLeastStockedAmount() {
        int min = cargoUnits[0];
        for (int i = 1; i < cargoUnits.length; i++) {
            if (cargoUnits[i] < min) {
                min = cargoUnits[i];
            }
        }
        return min;
    }

    /**
     * Returns the average number of units per supply type, as a
     * double so the result can include a decimal portion.
     */
    public double getAverageUnits() {
        return (double) getTotalUnits() / cargoUnits.length;
    }

    /**
     * Prints a short readable report of this cargo hold using the
     * methods above.
     */
    public void printCargoReport() {
        System.out.println("Total units aboard: " + getTotalUnits());
        System.out.println("Most stocked amount: " + getMostStockedAmount());
        System.out.println("Least stocked amount: " + getLeastStockedAmount());
        System.out.println("Average units per supply type: " + getAverageUnits());
    }
}