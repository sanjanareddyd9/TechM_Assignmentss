package assignment31;

import java.util.ArrayList;

class Inventory {
    private String inventoryId;
    private int maximumQuantity;
    private int currentQuantity;
    private int threshold;

    
    public Inventory(String inventoryId, int maximumQuantity, int currentQuantity, int threshold) {
        this.inventoryId = inventoryId;
        this.maximumQuantity = maximumQuantity;
        this.currentQuantity = currentQuantity;
        this.threshold = threshold;
    }

    
    public String getInventoryId() {
        return inventoryId;
    }

    public void setInventoryId(String inventoryId) {
        this.inventoryId = inventoryId;
    }

    public int getMaximumQuantity() {
        return maximumQuantity;
    }

    public void setMaximumQuantity(int maximumQuantity) {
        this.maximumQuantity = maximumQuantity;
    }

    public int getCurrentQuantity() {
        return currentQuantity;
    }

    public void setCurrentQuantity(int currentQuantity) {
        this.currentQuantity = currentQuantity;
    }

    public int getThreshold() {
        return threshold;
    }

    public void setThreshold(int threshold) {
        this.threshold = threshold;
    }
}

public class InventorySolution {

    
    public static Inventory[] replenish(Inventory[] inventories, int limit) {
        ArrayList<Inventory> replenishedList = new ArrayList<>();

        for (Inventory inventory : inventories) {
            if (inventory.getThreshold() <= limit) {
                replenishedList.add(inventory);
            }
        }

        return replenishedList.toArray(new Inventory[0]);
    }

    public static void main(String[] args) {
        
        Inventory[] inventories = {
            new Inventory("1", 100, 50, 50),
            new Inventory("2", 200, 60, 40),
            new Inventory("3", 150, 35, 45),
            new Inventory("4", 80, 45, 40)
        };

        int limit = 45;

        
        Inventory[] replenishedInventories = replenish(inventories, limit);

        
        for (Inventory inventory : replenishedInventories) {
            System.out.print(inventory.getInventoryId() + " ");
            
           
            if (inventory.getThreshold() > 75) {
                System.out.println("Critical Filling");
            } else if (inventory.getThreshold() >= 50) {
                System.out.println("Moderate Filling");
            } else {
                System.out.println("Non-Critical Filling");
            }
        }
    }
}

