package main;

import utils.XmlDownloader;

public class Main {

  public static void main(String[] args) {
    String nodeValue = XmlDownloader.getNodeValueFromXml("https://beacon.nist.gov/rest/record/last", "outputValue");

  }
}
