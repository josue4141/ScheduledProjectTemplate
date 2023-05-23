/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ols.doci.env;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 *
 * @author Luis Brayan
 */
public class EnvLoader {
    protected Document doc;

    public EnvLoader() throws ParserConfigurationException, SAXException, IOException {
        this.doc = EnvLoader.getConfigDocument();
    }

    /**
     * Extract a string value from loaded the config file.
     */
    public String getString(String tagname, String attribute) throws NullPointerException {
        Node node = this.doc.getElementsByTagName(tagname).item(0);
        if (node == null) {
            throw new NullPointerException("No nodes were found on the config file with tagname '"+ tagname +"'");
        }

        Node attr = node.getAttributes().getNamedItem(attribute);
        if (attr == null) {
            throw new NullPointerException("No attribute '"+ attribute +"' were found on the first config file '"+ tagname +"' node");
        }

        return attr.getNodeValue();
    }

    /**
     * Extract a boolean value from loaded the config file.
     */
    public boolean getBoolean(String tagname, String attribute) {
        return Boolean.parseBoolean(this.getString(tagname, attribute));
    }

    /**
     * Extract an int value from loaded the config file.
     */
    public int getInt(String tagname, String attribute) {
        return Integer.parseInt(this.getString(tagname, attribute));
    }

    /**
     * Extract a map of values from the config file.
     */
    public HashMap<String, String> getMap(String tagname, String keyAttribute, String valueAttribute) {
        HashMap<String, String> map = new HashMap<>();

        NodeList elements = this.doc.getElementsByTagName(tagname);
        for (int i = 0; i < elements.getLength(); i++) {
            NamedNodeMap attrs = elements.item(i).getAttributes();

            String key = attrs.getNamedItem(keyAttribute).getNodeValue();
            String value = attrs.getNamedItem(valueAttribute).getNodeValue();
            map.put(key, value);
        }

        return map;
    }

    /**
     * Extracts a map of values from list nodes of the config file.
     */
    public HashMap<String, String> getMapFromLists(String tagname, String keysAttribute, String valueAttribute, String separator) {
        HashMap<String, String> map = new HashMap<>();

        NodeList elements = this.doc.getElementsByTagName(tagname);
        for (int i = 0; i < elements.getLength(); i++) {
            NamedNodeMap attrs = elements.item(i).getAttributes();

            String value = attrs.getNamedItem(valueAttribute).getNodeValue();
            for (String key : attrs.getNamedItem(keysAttribute).getNodeValue().split(separator)) {
                map.put(key.trim(), value);
            }
        }

        return map;
    }

    /**
     * Extract a string from the config file.
     * This should not be used if you're extracting multiple values from the config file.
     */
    public static String getSingleString(String tagname, String attribute) {
        try {
            return (new EnvLoader()).getString(tagname, attribute);
        } catch (ParserConfigurationException | SAXException | IOException | NullPointerException ex) {
            Logger.getLogger(EnvLoader.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "";
    }

    /**
     * Extract an int value from loaded the config file.
     * This should not be used if you're extracting multiple values from the config file.
     */
    public static int getSingleInt(String tagname, String attribute) {
        return Integer.parseInt(EnvLoader.getSingleString(tagname, attribute));
    }

    /**
     * Extract a boolean value from loaded the config file.
     */
    public static boolean getSingleBoolean(String tagname, String attribute) {
        return Boolean.parseBoolean(EnvLoader.getSingleString(tagname, attribute));
    }

    /**
     * Extract a list of values from the config file.
     * This should not be used if you're extracting multiple values from the config file.
     */
    public static List<String> getSingleList(String tagname, String attribute, String separator) {
        String source = EnvLoader.getSingleString(tagname, attribute);
        return Arrays.asList(source.split(separator));
    }

    /**
     * Extract a map of values from the config file.
     * This should not be used if you're extracting multiple values from the config file.
     */
    public static HashMap<String, String> getSingleMap(String tagname, String keyAttribute, String valueAttribute) {
        try {
            return (new EnvLoader()).getMap(tagname, keyAttribute, valueAttribute);
        } catch (ParserConfigurationException | SAXException | IOException ex) {
            Logger.getLogger(EnvLoader.class.getName()).log(Level.SEVERE, null, ex);
        }
        return new HashMap<>();
    }

    /**
     * Extracts a map of values from list nodes of the config file.
     * This should not be used if you're extracting multiple values from the config file.
     */
    public static  HashMap<String, String> getSingleMapFromLists(String tagname, String keysAttribute, String valueAttribute, String separator) {
        try {
            return (new EnvLoader()).getMapFromLists(tagname, keysAttribute, valueAttribute, separator);
        } catch (ParserConfigurationException | SAXException | IOException ex) {
            Logger.getLogger(EnvLoader.class.getName()).log(Level.SEVERE, null, ex);
        }
        return new HashMap<>();
    }

    /**
     * Instantiates a document parser.
     */
    public static Document getConfigDocument() throws ParserConfigurationException, SAXException, IOException {
        File file = new File(EnvLoader.getConfigFilePath());
        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
        return documentBuilder.parse(file);
    }

    /**
     * Returns the location of the expected config file. Takes in consideration the os system.
     */
    public static String getConfigFilePath() {
        if (System.getProperty("os.name").toLowerCase().startsWith("")) {
            return System.getProperty("catalina.base") + "\\conf\\config.xml";
        }
        return System.getProperty("catalina.base") + "/conf/config.xml";
    }
}
