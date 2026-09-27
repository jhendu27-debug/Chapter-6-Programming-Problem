import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<SupplyCrate> inventory = new ArrayList<>();

        SupplyCrate crate1 =
                new SupplyCrate("Iron Ore", "Northern Highlands", 500, false);

        SupplyCrate crate2 =
                new SupplyCrate("Silk", "Eastern Isles", 1200, false);

        SupplyCrate crate3 =
                new SupplyCrate("Dragon Scales", "Forbidden Mountains", 800, true);

        SupplyCrate crate4 =
                new SupplyCrate("Healing Herbs", "Western Forest", 300, false);

        inventory.add(crate1);
        inventory.add(crate2);
        inventory.add(crate3);
        inventory.add(crate4);

        System.out.println("Total items: " + inventory.size());

        System.out.println("Silk crate position: " + inventory.indexOf(crate2));

        System.out.println("High Risk Items:");

        for (SupplyCrate crate : inventory) {
            if (crate.isContraband || crate.baseValue > 1000) {
                System.out.println(crate.itemName);
            }
        }

        inventory.remove(crate4);

        System.out.println("New inventory size: " + inventory.size());
    }
}