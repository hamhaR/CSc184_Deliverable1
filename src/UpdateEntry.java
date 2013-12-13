import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: Rahmah Hadji Abdulmadid
 * Date: 12/8/13
 */
public class UpdateEntry {
    public static void update_entry(Document doc, Integer integer) throws TransformerException {
        Node entry  = doc.getElementsByTagName("entry").item(integer);

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("address to update address\ncity to update city\nstate to update state\nzipcode to update zip code\nphone to update phone number");
        String string = scanner1.nextLine();

        if (string != "firstname" && string != "lastname"){
            System.out.println("Change to value: ");
            String changevalue = scanner1.nextLine();

            NodeList list = entry.getChildNodes();
            for (int i = 0; i< list.getLength(); i++){
                Node node = list.item(i);

                if(string.equals(node.getNodeName())){
                    node.setTextContent(changevalue);
                    System.out.println("You have successfully update an entry");
                }
            }
        } else {
            System.out.println("Cannot update");
        }


        // Write the content into addressbook.xml
        TransformerFactory transformerFactory = TransformerFactory.newInstance() ;
        Transformer transformer = transformerFactory.newTransformer();
        DOMSource source = new DOMSource(doc);
        StreamResult result = new StreamResult(new File("C://Users//mokz//Desktop//Assignment1//addressbook.xml"));
        transformer.transform(source, result);

    }
}
