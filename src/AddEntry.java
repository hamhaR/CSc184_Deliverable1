import org.w3c.dom.*;

import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * User: Rahmah Hadji Abdulmadid
 * Date: 12/7/13
 */
public class AddEntry {
    public void addNewEntry(Element root, Element rootElement, Document doc) throws TransformerException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the First Name: ");
        String fname = scanner.nextLine();
        Entry.Person.setFirstName(fname);

        System.out.println("Enter the Last Name: ");
        String  lname = scanner.nextLine();
        Entry.Person.setLastName(lname);

        System.out.println("Enter the Address: ");
        String address1 = scanner.nextLine();
        Entry.Person.setAddress(address1);

        System.out.println("Enter the City: ");
        String city1 = scanner.nextLine();
        Entry.Person.setCity(city1);

        System.out.println("Enter the State: ");
        String state1 = scanner.nextLine();
        Entry.Person.setState(state1);

        System.out.println("Enter the Zip Code: ");
        String zipcode1 = scanner.nextLine();
        Entry.Person.setZipcode(zipcode1);

        System.out.println("Enter the Phone Number: ");
        String phone1 = scanner.nextLine();
        Entry.Person.setPhone(phone1);

        Collection<Entry.Person> svr = new ArrayList<Entry.Person>();
        svr.add(new Entry.Person());

        for (Entry.Person i :svr){
            Element e = doc.createElement("entry");
            rootElement.appendChild(e);

            Element firstname = doc.createElement("firstname");
            firstname.appendChild(doc.createTextNode(i.getFirstName()));
            e.appendChild(firstname);

            Element lastname = doc.createElement("lastname");
            lastname.appendChild(doc.createElement(i.getLastName()));
            e.appendChild(lastname);

            Element address = doc.createElement("address");
            address.appendChild(doc.createTextNode(i.getAddress()));
            e.appendChild(address);

            Element city = doc.createElement("city");
            city.appendChild(doc.createTextNode(i.getCity()));
            e.appendChild(city);

            Element state = doc.createElement("state");
            state.appendChild(doc.createTextNode(i.getState()));
            e.appendChild(state);

            Element zipcode = doc.createElement("zipcode");
            zipcode.appendChild(doc.createTextNode(i.getZipCode()));
            e.appendChild(zipcode);

            Element phone = doc.createElement("phone");
            phone.appendChild(doc.createTextNode(i.getPhone()));
            e.appendChild(phone);

            root.appendChild(e);
        }
        DOMSource source = new DOMSource(doc);

        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        transformer.setOutputProperty(OutputKeys.INDENT,"yes" );
        StreamResult result = new StreamResult("C:\\Users\\mokz\\Desktop\\Assignment1\\addressbook.xml");
        transformer.transform(source, result);

        System.out.println("You have successfully added " +fname+ " to your address book.");
    }
}
