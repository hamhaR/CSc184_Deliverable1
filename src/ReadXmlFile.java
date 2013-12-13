/**
 * Created with IntelliJ IDEA.
 * User: Rahmah Hadji Abdulmadid
 * Date: 12/4/13
 */

import org.w3c.dom.*;

public class ReadXmlFile {

    public void read(NodeList nodeList){

        for (int i = 0; i < nodeList.getLength(); i++){
            Node nNode = nodeList.item(i);

            if (nNode.getNodeType() == Node.ELEMENT_NODE){
                Element eElement = (Element) nNode;
                System.out.println("Entry number: " +(i+1));
                System.out.println("First Name: " +eElement.getElementsByTagName("firstname").item(0).getTextContent());
                System.out.println("Last Name: " +eElement.getElementsByTagName("lastname").item(0).getTextContent());
                System.out.println("Address: " +eElement.getElementsByTagName("address").item(0).getTextContent());
                System.out.println("City: " +eElement.getElementsByTagName("city").item(0).getTextContent());
                System.out.println("State: " +eElement.getElementsByTagName("state").item(0).getTextContent());
                System.out.println("Zip Code: " +eElement.getElementsByTagName("zipcode").item(0).getTextContent());
                System.out.println("Phone Number: " +eElement.getElementsByTagName("phone").item(0).getTextContent());
                System.out.println("-------------------------");

            }
        }
    }
}

