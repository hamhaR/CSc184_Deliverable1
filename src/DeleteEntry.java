/**
 * Created with IntelliJ IDEA.
 * User: Rahmah Hadji Abdulmadid
 * Date: 12/8/13
 */
import org.w3c.dom.*;

import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.IOException;

public class DeleteEntry {

    public static void delete_entry(Integer integer, Document doc) throws IOException, TransformerException {
        Element element = (Element) doc.getElementsByTagName("entry").item(integer);
        element.getParentNode().removeChild(element);


        DOMSource source = new DOMSource(doc);

        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        transformer.setOutputProperty(OutputKeys.INDENT,"yes" );
        StreamResult result = new StreamResult("C:\\Users\\mokz\\Desktop\\Assignment1\\addressbook.xml");
        transformer.transform(source, result);

        System.out.println("You have successfully deleted an entry");
    }
}
