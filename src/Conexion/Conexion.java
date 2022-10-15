package Conexion;

import java.sql.*;
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

public class Conexion {

    public java.sql.Connection conexion;
    public java.sql.Statement sentencia;
    public PreparedStatement result1;
    public ResultSet resultado;
    public ResultSet resultado1;
    String url_bd1 = "";
    String nombre_bd1 = "";
    String pass_bd1 = "";
    String url_bd2 = "";
    String nombre_bd2 = "";
    String pass_bd2 = "";

    public void leer1 (){

        try {
            // Creo una instancia de DocumentBuilderFactory
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            // Creo un documentBuilder
            DocumentBuilder builder = factory.newDocumentBuilder();

            // Obtengo el documento, a partir del XML
            Document documento = builder.parse(new File("C:/archivosTurnero/ConectarBasedeDatos.xml"));

            // Cojo todas las etiquetas coche del documento
            NodeList listaDatos = documento.getElementsByTagName("dato");

            // Recorro las etiquetas
            for (int i = 0; i < listaDatos.getLength(); i++) {
                // Cojo el nodo actual
                Node nodo = listaDatos.item(i);
                // Compruebo si el nodo es un elemento
                if (nodo.getNodeType() == Node.ELEMENT_NODE) {
                    // Lo transformo a Element
                    Element e = (Element) nodo;
                    // Obtengo sus hijos
                    NodeList datos = e.getChildNodes();
                    // Recorro sus hijos
                    for (int j = 0; j < datos.getLength(); j++) {
                        // Obtengo al hijo actual
                        Node data = datos.item(j);
                        // Compruebo si es un nodo
                        if (data.getNodeType() == Node.ELEMENT_NODE) {
                            // Muestro el contenido

                            String nombre = data.getNodeName();

                            if (null != nombre) {
                                switch (nombre) {
                                    case "url_bd":
                                        url_bd1 = data.getTextContent();
                                        break;
                                    case "nombre_bd":
                                        nombre_bd1 = data.getTextContent();
                                        break;
                                    case "pass_bd":
                                        pass_bd1 = data.getTextContent();
                                        break;
                                    default:
                                        break;
                                }
                            }

                        }

                    }
                    /*System.out.println("url: " + url_bd1);
                    System.out.println("nombre: " + nombre_bd1);
                    System.out.println("pass: " + pass_bd1);*/
                }

            }

        } catch (ParserConfigurationException | SAXException | IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    
    public void leer2(){

        try {
            // Creo una instancia de DocumentBuilderFactory
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            // Creo un documentBuilder
            DocumentBuilder builder = factory.newDocumentBuilder();

            // Obtengo el documento, a partir del XML
            Document documento = builder.parse(new File("C:/archivosTurnero/ConectarBasedeDatosLocal.xml"));

            // Cojo todas las etiquetas coche del documento
            NodeList listaDatos = documento.getElementsByTagName("dato");

            // Recorro las etiquetas
            for (int i = 0; i < listaDatos.getLength(); i++) {
                // Cojo el nodo actual
                Node nodo = listaDatos.item(i);
                // Compruebo si el nodo es un elemento
                if (nodo.getNodeType() == Node.ELEMENT_NODE) {
                    // Lo transformo a Element
                    Element e = (Element) nodo;
                    // Obtengo sus hijos
                    NodeList datos = e.getChildNodes();
                    // Recorro sus hijos
                    for (int j = 0; j < datos.getLength(); j++) {
                        // Obtengo al hijo actual
                        Node data = datos.item(j);
                        // Compruebo si es un nodo
                        if (data.getNodeType() == Node.ELEMENT_NODE) {
                            // Muestro el contenido

                            String nombre = data.getNodeName();

                            if (null != nombre) {
                                switch (nombre) {
                                    case "url_bd":
                                        url_bd2 = data.getTextContent();
                                        break;
                                    case "nombre_bd":
                                        nombre_bd2 = data.getTextContent();
                                        break;
                                    case "pass_bd":
                                        pass_bd2 = data.getTextContent();
                                        break;
                                    default:
                                        break;
                                }
                            }

                        }

                    }
                    /*System.out.println("url: " + url_bd1);
                    System.out.println("nombre: " + nombre_bd1);
                    System.out.println("pass: " + pass_bd1);*/
                }

            }

        } catch (ParserConfigurationException | SAXException | IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    
    public void ConectarBasedeDatos() {
        try {
            leer1();
            final String Controlador = "com.mysql.jdbc.Driver";
            Class.forName(Controlador);
            final String url_bd = url_bd1;
            conexion = DriverManager.getConnection(url_bd, nombre_bd1, pass_bd1);
            sentencia = conexion.createStatement();
            System.out.println("SE CONECTO BIEN A LA NUBE");
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("No se pudo conectar:: " + ex);
            System.out.println("Conectandose al local: ");
            ConectarBasedeDatosLocal();
        }
    }

    public void ConectarBasedeDatosLocal() {
        try {
            leer2();
            final String Controlador = "com.mysql.jdbc.Driver";
            Class.forName(Controlador);
            final String url_bd = url_bd2;
            conexion = DriverManager.getConnection(url_bd, nombre_bd2, pass_bd2);
            sentencia = conexion.createStatement();
            System.out.println("SE CONECTO BIEN AL LOCAL");
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("No se pudo conectar al local: " + ex);
            System.out.println("No anda che. ");

        }

    }

    public void DesconectarBasedeDatos() {
        try {
            if (conexion != null) {
                if (sentencia != null) {
                    sentencia.close();
                }
                conexion.close();
            }
        } catch (SQLException ex) {
            System.out.println("No se pudo desconectar" + ex);
            System.exit(1);
        }
    }

    public java.sql.Connection getConnection() {
        return conexion;
    }
}
