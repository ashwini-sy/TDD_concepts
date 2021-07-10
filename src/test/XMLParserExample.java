package test;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class XMLParserExample {

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		// TODO Auto-generated method stub
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();

		// Build a document;
		Document document = builder.parse(new File("employees.xml"));

		// Root node
		Element root = document.getDocumentElement();
		System.out.println(root.getNodeName());
		
		//To get all the employee
		NodeList nlist=document.getElementsByTagName("employee");
		for(int temp=0;temp<nlist.getLength();temp++)
		{
			Node node=nlist.item(temp);
			System.out.println(" ");
			//convert the each item into element
			Element ele=(Element) node;
			System.out.println("Employee id :"+ ele.getAttribute("id"));
			System.out.println("Firstname : "+ ele.getElementsByTagName("firstName").item(0).getTextContent());
			System.out.println("Last name: "+ ele.getElementsByTagName("lastName").item(0).getTextContent());
			 System.out.println("Location : "    + ele.getElementsByTagName("location").item(0).getTextContent());


			
			
		}
		

	}

}
