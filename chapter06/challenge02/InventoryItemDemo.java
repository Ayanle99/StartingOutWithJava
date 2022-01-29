package challenge02;
/**
 * Please subscribe to my youtube channel: https://www.youtube.com/channel/UC_7sedpkwbotqcGD4HknepQ
 * or look up the name "The blind programmer" to see more tutorials.
 */

public class InventoryItemDemo {
    public static void main(String[] args) {

        InventoryItem item1,item2,item3;

        item1 = new InventoryItem();
        System.out.println("Item 1");
        System.out.println("Description: " + item1.getDescription());
        System.out.println("Units: " + item1.getUnits());
        System.out.println();

        item2 = new InventoryItem("Wrench");
        System.out.println("Item 2");
        System.out.println("Description: " + item2.getDescription());
        System.out.println("Units: " + item2.getUnits());
        System.out.println();


        item3 = new InventoryItem("Hammer", 20);
        System.out.println("Item 3");
        System.out.println("Description: "+item3.getDescription());
        System.out.println("Units: " + item3.getUnits());


    }
}
