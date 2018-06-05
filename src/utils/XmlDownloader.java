package utils;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class XmlDownloader {

  public static String getNodeValueFromXml(final String xmlUrl, final String nodeName) {
    if (xmlUrl.isEmpty() || nodeName.isEmpty()) {
      System.out.println("\n input parameters 'xmlUrl' or 'nodeName' can't be empty, please enter valid parameters\n");
      return null;
    }

    Document doc = null;
    try {
      HttpURLConnection con = (HttpURLConnection) new URL(xmlUrl).openConnection();
      int responseCode = con.getResponseCode();
      if (responseCode != 200) {
        System.out.println("\nResponse code: " + responseCode + "\nPlease check URL\n");
        return null;
      }

      BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
      String inputLine;
      StringBuffer response = new StringBuffer();
      while ((inputLine = in.readLine()) != null) {
        response.append(inputLine);
      }
      in.close();

      System.out.println("\nResponse:\n" + response.toString());

      doc = DocumentBuilderFactory.newInstance().newDocumentBuilder()
              .parse(new InputSource(new StringReader(response.toString())));
    } catch (IOException | ParserConfigurationException | SAXException e) {
      e.printStackTrace();
    }
    NodeList nodes = doc.getElementsByTagName(nodeName);

    if (nodes.getLength() < 1) {
      System.out.println("\nThere is no '" + nodeName + "' node\n");
      return null;
    }

    return nodes.item(0).getTextContent();
  }
}
