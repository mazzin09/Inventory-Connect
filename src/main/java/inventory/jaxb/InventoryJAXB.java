package inventory.jaxb;

import inventory.*;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.io.File;
import java.util.List;

public class InventoryJAXB {
    public void marshall(){
        try{
            QuantityUomType quantityUomType = QuantityUomType.BX;

            Quantity quantity = new Quantity();
            quantity.setUom(quantityUomType);

            FutureAvailabilityArray futureAvailabilityArray = new FutureAvailabilityArray();

            InventoryLocationQuantity inventoryLocationQuantity = new InventoryLocationQuantity();
            inventoryLocationQuantity.setQuantity(quantity);

            InventoryLocation inventoryLocation = new InventoryLocation();
            inventoryLocation.setInventoryLocationId("1C");
            inventoryLocation.setInventoryLocationName("Japan");
            inventoryLocation.setPostalCode("44600");
            inventoryLocation.setCountry(ISO3166CountyCode.AD);
            inventoryLocation.setInventoryLocationQuantity(inventoryLocationQuantity);
            inventoryLocation.setFutureAvailabilityArray(futureAvailabilityArray);

            InventoryLocationArray inventoryLocationArray = new InventoryLocationArray();
//            inventoryLocationArray.getInventoryLocation(inventoryLocation);

            QuantityAvailable quantityAvaibale = new QuantityAvailable();
            quantityAvaibale.setQuantity(quantity);

            PartInventoryArray partInventoryArray = new PartInventoryArray();
            PartInventoryArray.PartInventory partInventory = new PartInventoryArray.PartInventory();

            partInventory.setPartId("1A");
            partInventory.setMainPart(true);
            partInventory.setPartColor("Red");
            partInventory.setLabelSize("Large");
            partInventory.setPartDescription("Test product is good");
            partInventory.setQuantityAvailable(quantityAvaibale);
            partInventory.setManufacturedItem(true);
            partInventory.setBuyToOrder(true);
            partInventory.setReplenishmentLeadTime(1000);
            partInventory.setAttributeSelection("Red ones selected");
            partInventory.setInventoryLocationArray(inventoryLocationArray);

            // Set a date for lastModified property
            XMLGregorianCalendar lastModified = createXMLGregorianCalendar();
            partInventory.setLastModified(lastModified);

            partInventoryArray.getPartInventory().add(partInventory);

            Inventory inventory = new Inventory("1A", partInventoryArray);
            JAXBContext jaxbContext = JAXBContext.newInstance(Inventory.class);
            Marshaller ms = jaxbContext.createMarshaller();
            ms.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            ms.marshal(inventory, System.out);
            ms.marshal(inventory, new File("src\\main\\java\\data\\Inventory.xml"));

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    private static XMLGregorianCalendar createXMLGregorianCalendar() {
        try {
            return DatatypeFactory.newInstance().newXMLGregorianCalendar();
        } catch (DatatypeConfigurationException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void unmarshall(){
        try{
            JAXBContext jaxbContext = JAXBContext.newInstance(Inventory.class);
            Unmarshaller ums = jaxbContext.createUnmarshaller();
            Inventory inventory = (Inventory) ums.unmarshal(new File("src\\main\\java\\data\\Inventory.xml"));
            List<PartInventoryArray.PartInventory> partInventories = inventory.getPartInventoryArray().getPartInventory();
            System.out.println("Inventory");
            System.out.println("product id: " + inventory.getProductId());
            System.out.println("Part Inventory");
            for (PartInventoryArray.PartInventory partInventory: partInventories){
                System.out.println(partInventory.getPartId());
                System.out.println(partInventory.getPartColor());
                System.out.println(partInventory.getPartDescription());
                System.out.println(partInventory.getAttributeSelection());
                System.out.println(partInventory.getLabelSize());
            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
