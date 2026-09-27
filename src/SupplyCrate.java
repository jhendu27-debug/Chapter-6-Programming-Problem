public class SupplyCrate {

    String itemName;
    String originRegion;
    int baseValue;
    boolean isContraband;

    public SupplyCrate(String itemName, String originRegion,
                       int baseValue, boolean isContraband) {
        this.itemName = itemName;
        this.originRegion = originRegion;
        this.baseValue = baseValue;
        this.isContraband = isContraband;
    }
}