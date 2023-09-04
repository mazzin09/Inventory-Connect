package employee;

import javax.xml.bind.*;
import java.io.*;

public class EmployeeJAXB {
    public void marshall(){
        try {
            Employee employee = new Employee("1A","Manoj", "Patan", 10000);
            JAXBContext jaxbContext = JAXBContext.newInstance(Employee.class);
            Marshaller ms = jaxbContext.createMarshaller();
            ms.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            ms.marshal(employee, System.out);
            ms.marshal(employee, new File("src\\main\\java\\data\\Employee.xml"));
//            System.out.println("hello");
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public void unmarshall(){
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(Employee.class);
            Unmarshaller ums = jaxbContext.createUnmarshaller();
            Employee employee = (Employee) ums.unmarshal(new File("src\\main\\java\\data\\Employee.xml"));
            System.out.println("Employee Information");
            System.out.println("id: " + employee.getId());
            System.out.println("name: " + employee.getName());
            System.out.println("address: " + employee.getAddress());
            System.out.println("salary: " + employee.getSalary());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
