package inventory.jaxb;

import inventory.*;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class FilterJAXB {
    public void marshall(){
        try{
            PartIdArray partIdArray = new PartIdArray();
            partIdArray.getPartId().add("2B");
            partIdArray.getPartId().add("2C");

            LabelSizeArray labelSizeArray = new LabelSizeArray();
            labelSizeArray.getLabelSize().add("M");
            labelSizeArray.getLabelSize().add("S");

            PartColorArray partColorArray = new PartColorArray();
            partColorArray.getPartColor().add("Green");
            partColorArray.getPartColor().add("Red");

            Filter filter = new Filter(partIdArray, labelSizeArray, partColorArray);
            JAXBContext jaxbContext = JAXBContext.newInstance(Filter.class);
            Marshaller ms = jaxbContext.createMarshaller();
            ms.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            ms.marshal(filter, System.out);
            ms.marshal(filter, new File("src\\main\\java\\data\\Filter.xml"));


        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void unmarshall(){
        try{
            JAXBContext jaxbContext = JAXBContext.newInstance(Filter.class);
            Unmarshaller ums = jaxbContext.createUnmarshaller();
            Filter filter = (Filter) ums.unmarshal(new File("src\\main\\java\\data\\Filter.xml"));
            System.out.println("Filter");
            System.out.println("id: " + filter.getPartIdArray().getPartId());
            System.out.println("name: " + filter.getLabelSizeArray().getLabelSize());
            System.out.println("address: " + filter.getPartColorArray().getPartColor());
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
