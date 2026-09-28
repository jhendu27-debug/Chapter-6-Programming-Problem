public class Main {

    public static void main(String[] args) {

        TradingPost tradingPost = new TradingPost();

        SupplyCrate crate1 =
                new SupplyCrate("Iron Ore", "Northern Highlands",
                        500, false, false);

        SupplyCrate crate2 =
                new SupplyCrate("Silk", "Eastern Isles",
                        1200, false, true);

        SupplyCrate crate3 =
                new SupplyCrate("Dragon Scales", "Forbidden Mountains",
                        800, true, false);

        SupplyCrate crate4 =
                new SupplyCrate("Healing Herbs", "Western Forest",
                        300, false, false);

        tradingPost.addItem(crate1);
        tradingPost.addItem(crate2);
        tradingPost.addItem(crate3);
        tradingPost.addItem(crate4);

        System.out.println("Total items: "
                + tradingPost.getInventorySize());

        System.out.println("Silk crate position: "
                + tradingPost.findItem(crate2));

        tradingPost.printHighRiskItems();

        System.out.println("Silk approved: "
                + tradingPost.isApproved(crate2));

        System.out.println("Iron Ore approved: "
                + tradingPost.isApproved(crate1));

        tradingPost.removeItem(crate4);

        System.out.println("New inventory size: "
                + tradingPost.getInventorySize());
    }
}