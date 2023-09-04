package demo;

import inventory.jaxb.FilterJAXB;
import inventory.jaxb.InventoryJAXB;

public class Main {
    public static void main(String[] args) {
        InventoryJAXB inventoryJAXB = new InventoryJAXB();
//        inventoryJAXB.marshall();
        inventoryJAXB.unmarshall();
        FilterJAXB filterJAXB = new FilterJAXB();
//        filterJAXB.marshall();
//        filterJAXB.unmarshall();
    }
}
