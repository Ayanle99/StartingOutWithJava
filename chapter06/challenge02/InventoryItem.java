package challenge02;

public class InventoryItem {

    private String description;
    private int units;

    public InventoryItem(InventoryItem inventory_item){
        description = inventory_item.description;
        units = inventory_item.units;
    }

    public InventoryItem(){
        description = "";
        units = 0;
    }

    public InventoryItem(String d){
        description = d;
        units = 0;
    }
    public InventoryItem(String d, int u){
        description = d;
        units = u;
    }
    public void setDescription(String d){
        description = d;
    }
    public void setUnits(int u){
        units = u;
    }
    public String getDescription(){
        return description;
    }
    public int getUnits(){
        return units;
    }

}
