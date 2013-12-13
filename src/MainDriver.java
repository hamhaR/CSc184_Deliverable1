/**
 * Created with IntelliJ IDEA.
 * User: Rahmah Hadji Abdulmadid
 * Date: 12/7/13
 */

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class MainDriver {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException, SAXException, ParserConfigurationException, TransformerException {
		// TODO Auto-generated method stub
		File addressBook = new File("C://Users//mokz//Desktop//Assignment1//addressbook.xml");
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        Document doc = dBuilder.parse(addressBook);
        NodeList nodeList = doc.getElementsByTagName("entry");
        // Use for the AddEntry
        Element root = doc.getDocumentElement();
        Element rootElement = doc.getDocumentElement();


        System.out.println("    Welcome to Address Book System");
        System.out.println("***************************************");

        Scanner scanner = new Scanner(System.in);
        System.out.println("1 to read\n2 to add new entry\n3 to delete entry\n4 to update entry\n");
        int command = scanner.nextInt();

        if (command == 1){
            ReadXmlFile readXmlFile = new ReadXmlFile();
            readXmlFile.read(nodeList);
        }
        if (command == 2){
            AddEntry addEntry = new AddEntry();
            addEntry.addNewEntry(root, rootElement, doc);
        }
        if (command == 3){
            System.out.println("Enter the entry number you want to delete: ");
            Integer index = scanner.nextInt();
            DeleteEntry del = new DeleteEntry();
            del.delete_entry(index-1, doc);
        }
        if (command == 4){
            System.out.println("Enter the entry number you want to update: ");
            Integer integer = scanner.nextInt();
            UpdateEntry updateEntry = new UpdateEntry();
            updateEntry.update_entry(doc, integer);
        }
    
	}

}
