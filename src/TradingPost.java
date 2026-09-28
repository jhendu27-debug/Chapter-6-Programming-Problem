import java.util.ArrayList;

public class TradingPost {

    private ArrayList<SupplyCrate> inventory;

    public TradingPost() {
        inventory = new ArrayList<>();
    }

    public void addItem(SupplyCrate crate) {
        inventory.add(crate);
    }

    public void removeItem(SupplyCrate crate) {
        inventory.remove(crate);
    }

    public int getInventorySize() {
        return inventory.size();
    }

    public int findItem(SupplyCrate crate) {
        return inventory.indexOf(crate);
    }

    public void printHighRiskItems() {
        System.out.println("High Risk Items:");

        for (SupplyCrate crate : inventory) {
            if (crate.isContraband || crate.baseValue > 1000) {
                System.out.println(crate.itemName);
            }
        }
    }

    public boolean isApproved(SupplyCrate crate) {
        return inventory.contains(crate) && !crate.isReserved;
    }
}