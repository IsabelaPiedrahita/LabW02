package fleettracker;

/**
 * This class represents a small fleet of ships. Each ship has a
 * name and a fuel supply, linked by position across two parallel
 * arrays.
 * 
 * Lab W02: Galactic Fleet Inventory
 * @version 1.0
 * @author Isabela Piedrahita
 */
public class FleetTracker {

    String[] shipNames = {"Wayfinder", "Nomad", "Sentinel", "Ironclad", "Pathfinder"};

    int[] fuelSupply = {35, 12, 60, 8, 22};

    int resupplyThreshold = 20;


    public int findShipIndex(String shipName) {
        for (int i = 0; i < shipNames.length; i++) {
            if (shipNames[i].equals(shipName)) {
                return i;
            }
        }
        return -1;
    }


    public boolean isBelowThreshold(int shipIndex) {
        if (shipIndex >= 0 && shipIndex < fuelSupply.length) {
            return fuelSupply[shipIndex] < resupplyThreshold;
        }
        return false;
    }


    public void printResupplyReport() {
        for (int i = 0; i < shipNames.length; i++) {
            if (isBelowThreshold(i)) {
                System.out.println(shipNames[i] + ": NEEDS RESUPPLY");
            } else {
                System.out.println(shipNames[i] + ": fuel OK");
            }
        }
    }
}