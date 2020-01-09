package util;

import com.jcraft.jsch.ChannelSftp;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.Session;
import com.jcraft.jsch.SftpException;

import java.io.*;
import java.sql.Connection;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Properties;
import java.util.Scanner;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.activation.MimetypesFileTypeMap;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.xml.bind.JAXBElement;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import modelo.ComponenteFormulario;
import modelo.DatosXML;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.input.SAXBuilder;
import org.joda.time.DateTimeComparator;
import servicios.Advertencia;
import servicios.Anejo;
import servicios.ArrayOfAdvertencia;
import servicios.ArrayOfAnejo;
import servicios.ArrayOfCarga;
import servicios.ArrayOfCondicionante;
import servicios.ArrayOfDatosEnvio;
import servicios.ArrayOfDocumento;
import servicios.ArrayOfFincaTasacion;
import servicios.ArrayOfFincaTitular;
import servicios.ArrayOfIRPF;
import servicios.ArrayOfKODocument;
import servicios.ArrayOfNomina;
import servicios.ArrayOfNotaSimple;
import servicios.ArrayOfNotaSimpleNodulos;
import servicios.ArrayOfOCRWSResult;
import servicios.ArrayOfRecibo;
import servicios.ArrayOfTasacion;
import servicios.ArrayOfTitulo;
import servicios.ArrayOfVidaLaboral;
import servicios.Carga;
import servicios.Condicionante;
import servicios.ConfigurationTAnioConstruccion;
import servicios.ConfigurationTFinalidadTasacion;
import servicios.ConfigurationTFuenteDeDatos;
import servicios.ConfigurationTGrupoCotizacion;
import servicios.ConfigurationTLeyDeMercado;
import servicios.ConfigurationTMetodoValoracion;
import servicios.ConfigurationTMetodoValoracionEstadistico;
import servicios.ConfigurationTOpcionTributacion;
import servicios.ConfigurationTProvincia;
import servicios.ConfigurationTTipoAdvertencia;
import servicios.ConfigurationTTipoCarga;
import servicios.ConfigurationTTipoCondicionante;
import servicios.ConfigurationTTipoDocumento;
import servicios.ConfigurationTTipoError;
import servicios.ConfigurationTTipoEstadoCivil;
import servicios.ConfigurationTTipoEstadoConservacion;
import servicios.ConfigurationTTipoFinca;
import servicios.ConfigurationTTipoOcupacion;
import servicios.ConfigurationTTipoParticipacion;
import servicios.ConfigurationTTipoPropiedad;
import servicios.ConfigurationTTipoRegimenEconomica;
import servicios.ConfigurationTTipoRegimenProteccion;
import servicios.ConfigurationTTipoRegimenSS;
import servicios.ConfigurationTTipoRelacionViviendaHabitual;
import servicios.ConfigurationTTipoTitulosPropiedad;
import servicios.ConfigurationTTipoVia;
import servicios.ConfigurationTVisitaInmueble;
import servicios.DatosEnvio;
import servicios.Documento;
import servicios.Finca;
import servicios.FincaTasacion;
import servicios.FincaTitular;
import servicios.IRPF;
import servicios.Identificacion;
import servicios.KODocument;
import servicios.Nomina;
import servicios.NotaSimple;
import servicios.NotaSimpleNodulos;
import servicios.OCRWSResult;
import servicios.ObjectFactory;
import servicios.PersonModelIdentifierType;
import servicios.Persona;
import servicios.Recibo;
import servicios.Tasacion;
import servicios.Titulo;
import servicios.VidaLaboral;
import sincronizarrepogrupobc.SincronizarRepoGrupoBC;


public class MetodosGenerales {
    private static String direccion=System.getProperty("user.dir");

    /**
     * @param fecha
     * @return
     */
    public static String convertirFechaDDMMYYYY(Date fecha) {
        SimpleDateFormat formateador = new SimpleDateFormat("dd-MM-yyyy");
        return formateador.format(fecha);
    }

    /**
     * @return
     */
    public static Connection NuevaConexion() {
        Connection con = null;
        try {
            ConexionBD cmBD = new ConexionBD("127.0.0.1", "bpo", "bpo12345*");//bpo1234*
            con = cmBD.Conexion();
        } catch (SQLException e) {
        }
        return con;
    }

    /**
     * @return
     */
    public static Session connectFTPbySSH() {
       
        Session session = null;
        try {
             File file = new File(direccion.concat("/conf/configFtp_WS.properties"));
            FileInputStream fileInputStream = new FileInputStream(file);
            Properties mainProperties = new Properties();
            mainProperties.load(fileInputStream);
            //buscando en el fichero de conf la llave "ipFtp"
            String ipFtp = mainProperties.getProperty("ipFtp");
            //buscando en el fichero de conf la llave "userFtp"
            String userFtp = mainProperties.getProperty("userFtp");
            //buscando en el fichero de conf la llave "passWdFtp"
            String passWdFtp = mainProperties.getProperty("passWdFtp");
            //Cerrando el fichero
            fileInputStream.close();
            JSch jsch = new JSch();

            try {
                session = jsch.getSession(userFtp, ipFtp);
                  Properties properties=new Properties();
            properties.setProperty("StrictHostKeyChecking","no");
            session.setConfig(properties);
                session.connect();
            } catch (JSchException ex) {
            }
            return session;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return session;
    }

    /**
     * @return
     */
    public static Session connectFTPbySSHTech() {
        /* Cargando fichero de configuracion para la conexion al Ftp*/
        
        Session session = null;
        try {
             File file = new File(direccion.concat("/conf/configFtp_WS.properties"));
            FileInputStream fileInputStream = new FileInputStream(file);
            Properties mainProperties = new Properties();
            mainProperties.load(fileInputStream);
            //buscando en el fichero de conf la llave "ipFtp"
            String ipFtp = mainProperties.getProperty("ipFtp");
            //buscando en el fichero de conf la llave "userFtp"
            String userFtp = mainProperties.getProperty("userFtp");
            //buscando en el fichero de conf la llave "passWdFtp"
            String passWdFtp = mainProperties.getProperty("passWdFtp");
            //Cerrando el fichero
            fileInputStream.close();
            JSch jsch = new JSch();

            try {
                session = jsch.getSession(userFtp, ipFtp);
                  Properties properties=new Properties();
            properties.setProperty("StrictHostKeyChecking","no");
            session.setConfig(properties);
                session.connect();
            } catch (JSchException ex) {
            }
            return session;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return session;
    }

    /**
     * Método que parsea y lee un documento XML para devolver una lista con la información
     * de cada componente del formulario.
     *
     * @param rutaArchivo Ruta del archivo.
     * @return ArrayList (ComponenteFormulario) Lista con la información de los componentes del formulario.
     */
    public static DatosXML leerXML(String rutaArchivo) {
        //rutaArchivo = "";
        DatosXML datosXML = new DatosXML();
        //ArrayList<ComponenteFormulario> listaComponentes = new ArrayList<ComponenteFormulario>();
        SAXBuilder builder = new SAXBuilder();
        File xmlFile = new File(rutaArchivo);
        try {
            Document document = (Document) builder.build(xmlFile);
            Element rootNode = document.getRootElement();
            datosXML.getListaComponentes().add(new ComponenteFormulario("REFERENCE", rootNode.getAttributeValue("Reference")));
            java.util.List list = rootNode.getChildren();
            Element elementoTemp;
            Element hijoDeRegistral;
            Element hijoDeTitular;
            Element hijoDeTitulo;
            int cantTitulares = 0;
            for (int i = 0; i < list.size(); i++) {
                elementoTemp = (Element) list.get(i);
                switch (elementoTemp.getName()) {
                    case "Registral":
                        java.util.List listaHijosRegistral = elementoTemp.getChildren();
                        for (int j = 0; j < listaHijosRegistral.size(); j++) {
                            hijoDeRegistral = (Element) listaHijosRegistral.get(j);
                            datosXML.getListaComponentes().add(new ComponenteFormulario(hijoDeRegistral.getName(), hijoDeRegistral.getText()));
                        }
                        break;
                    case "Titular":
                        cantTitulares++;
                        java.util.List listaHijosTitular = elementoTemp.getChildren();
                        for (int k = 0; k < listaHijosTitular.size(); k++) {
                            hijoDeTitular = (Element) listaHijosTitular.get(k);
                            if (hijoDeTitular.getName().equals("Titulo")) {
                                java.util.List listaHijosTitulo = hijoDeTitular.getChildren();
                                for (int m = 0; m < listaHijosTitulo.size(); m++) {
                                    hijoDeTitulo = (Element) listaHijosTitulo.get(m);
                                    datosXML.getListaComponentes().add(new ComponenteFormulario(hijoDeTitulo.getName(), hijoDeTitulo.getText()));
                                }
                            } else
                                datosXML.getListaComponentes().add(new ComponenteFormulario(hijoDeTitular.getName(), hijoDeTitular.getText()));
                        }
                        break;
                    default:
                        datosXML.getListaComponentes().add(new ComponenteFormulario(elementoTemp.getName(), elementoTemp.getText()));
                        break;
                }
            }
            datosXML.setCantTitulares(cantTitulares);
        } catch (IOException | JDOMException io) {
            System.out.println(io.getMessage());
        }
        return datosXML;
    }

    /**
     * @param rutaArchivo
     * @return
     */
    public static DatosXML leerXMLIRPF(String rutaArchivo) {
        DatosXML datosXML = new DatosXML();
        SAXBuilder builder = new SAXBuilder();
        //rutaArchivo = "";
        File xmlFile = new File(rutaArchivo);
        try {
            Document document = (Document) builder.build(xmlFile);
            Element rootNode = document.getRootElement();
            java.util.List list = rootNode.getChildren();
            Element elementoTemp;
            Element hijoDeRegistral;
            int cantTitulares = 0;
            for (int i = 0; i < list.size(); i++) {
                elementoTemp = (Element) list.get(i);
                if (elementoTemp.getName().equals("IRPF")) {
                    java.util.List listaHijosRegistral = elementoTemp.getChildren();
                    for (int j = 0; j < listaHijosRegistral.size(); j++) {
                        hijoDeRegistral = (Element) listaHijosRegistral.get(j);
                        datosXML.getListaComponentes().add(new ComponenteFormulario(hijoDeRegistral.getName(), hijoDeRegistral.getText()));
                    }
                }
            }
            datosXML.setCantTitulares(cantTitulares);
        } catch (IOException | JDOMException io) {
            System.out.println(io.getMessage());
        }
        return datosXML;
    }

    /**
     * @param rutaArchivo
     * @return
     */
    public static DatosXML leerXMLVidaLaboral(String rutaArchivo) {
        DatosXML datosXML = new DatosXML();
        SAXBuilder builder = new SAXBuilder();
        //rutaArchivo = "";
        File xmlFile = new File(rutaArchivo);
        try {
            Document document = (Document) builder.build(xmlFile);
            Element rootNode = document.getRootElement();
            java.util.List list = rootNode.getChildren();
            Element elementoTemp;
            Element hijoDeRegistral;
            int cantTitulares = 0;
            for (int i = 0; i < list.size(); i++) {
                elementoTemp = (Element) list.get(i);
                if (elementoTemp.getName().equals("VIDA_LABORAL")) {
                    java.util.List listaHijosRegistral = elementoTemp.getChildren();
                    for (int j = 0; j < listaHijosRegistral.size(); j++) {
                        hijoDeRegistral = (Element) listaHijosRegistral.get(j);
                        datosXML.getListaComponentes().add(new ComponenteFormulario(hijoDeRegistral.getName(), hijoDeRegistral.getText()));
                    }
                }
            }
            datosXML.setCantTitulares(cantTitulares);
        } catch (IOException | JDOMException io) {
            System.out.println(io.getMessage());
        }
        return datosXML;
    }

    /**
     * @param rutaArchivo
     * @return
     */
    public static DatosXML leerXMLNotaSimpleOCR(String rutaArchivo) {
        DatosXML datosXML = new DatosXML();
        SAXBuilder builder = new SAXBuilder();
        //rutaArchivo = "";
        File xmlFile = new File(rutaArchivo);
        try {
            Document document = (Document) builder.build(xmlFile);
            Element rootNode = document.getRootElement();
            java.util.List list = rootNode.getChildren();
            Element elementoTemp;
            Element hijoDeRegistral;
            int cantTitulares = 0;
            for (int i = 0; i < list.size(); i++) {
                elementoTemp = (Element) list.get(i);
                datosXML.getListaComponentes().add(new ComponenteFormulario(elementoTemp.getName(), elementoTemp.getText()));
                /*
                if (elementoTemp.getName().equals("VIDA_LABORAL")){
                    java.util.List listaHijosRegistral = elementoTemp.getChildren();
                    for ( int j = 0; j < listaHijosRegistral.size(); j++ ){
                        hijoDeRegistral = (Element)listaHijosRegistral.get(j);
                        datosXML.getListaComponentes().add(new ComponenteFormulario(hijoDeRegistral.getName(), hijoDeRegistral.getText()));
                    }
                }
                */
            }
            datosXML.setCantTitulares(cantTitulares);
        } catch (IOException | JDOMException io) {
            System.out.println(io.getMessage());
        }
        return datosXML;
    }

    /**
     * @param rutaArchivo
     * @return
     */
    public static DatosXML leerXMLDocumentoKO(String rutaArchivo) {
        DatosXML datosXML = new DatosXML();
        SAXBuilder builder = new SAXBuilder();
        //rutaArchivo = "";
        File xmlFile = new File(rutaArchivo);
        try {
            Document document = (Document) builder.build(xmlFile);
            Element rootNode = document.getRootElement();
            java.util.List list = rootNode.getChildren();
            Element elementoTemp;
            Element hijoDeRegistral;
            int cantTitulares = 0;
            for (int i = 0; i < list.size(); i++) {
                elementoTemp = (Element) list.get(i);
                if (elementoTemp.getName().equals("DOCUMENTO_KO")) {
                    java.util.List listaHijosRegistral = elementoTemp.getChildren();
                    for (int j = 0; j < listaHijosRegistral.size(); j++) {
                        hijoDeRegistral = (Element) listaHijosRegistral.get(j);
                        datosXML.getListaComponentes().add(new ComponenteFormulario(hijoDeRegistral.getName(), hijoDeRegistral.getText()));
                    }
                }
            }
            datosXML.setCantTitulares(cantTitulares);
        } catch (IOException | JDOMException io) {
            System.out.println(io.getMessage());
        }
        return datosXML;
    }

    /**
     * @param rutaArchivo
     * @return
     */
    public static DatosXML leerXMLNomina(String rutaArchivo) {
        DatosXML datosXML = new DatosXML();
        SAXBuilder builder = new SAXBuilder();
        //rutaArchivo = "";
        File xmlFile = new File(rutaArchivo);
        try {
            Document document = (Document) builder.build(xmlFile);
            Element rootNode = document.getRootElement();
            java.util.List list = rootNode.getChildren();
            Element elementoTemp;
            Element hijoDeRegistral;
            int cantTitulares = 0;
            for (int i = 0; i < list.size(); i++) {
                elementoTemp = (Element) list.get(i);
                if (elementoTemp.getName().equals("NOMINA")) {
                    java.util.List listaHijosRegistral = elementoTemp.getChildren();
                    for (int j = 0; j < listaHijosRegistral.size(); j++) {
                        hijoDeRegistral = (Element) listaHijosRegistral.get(j);
                        datosXML.getListaComponentes().add(new ComponenteFormulario(hijoDeRegistral.getName(), hijoDeRegistral.getText()));
                    }
                }
            }
            datosXML.setCantTitulares(cantTitulares);
        } catch (IOException | JDOMException io) {
            System.out.println(io.getMessage());
        }
        return datosXML;
    }

    /**
     * @param rutaArchivo
     * @return
     */
    public static DatosXML leerXMLRecibo(String rutaArchivo) {
        DatosXML datosXML = new DatosXML();
        SAXBuilder builder = new SAXBuilder();
        //rutaArchivo = "";
        File xmlFile = new File(rutaArchivo);
        try {
            Document document = (Document) builder.build(xmlFile);
            Element rootNode = document.getRootElement();
            java.util.List list = rootNode.getChildren();
            Element elementoTemp;
            Element hijoDeRegistral;
            int cantTitulares = 0;
            for (int i = 0; i < list.size(); i++) {
                elementoTemp = (Element) list.get(i);
                if (elementoTemp.getName().equals("RECIBO")) {
                    java.util.List listaHijosRegistral = elementoTemp.getChildren();
                    for (int j = 0; j < listaHijosRegistral.size(); j++) {
                        hijoDeRegistral = (Element) listaHijosRegistral.get(j);
                        datosXML.getListaComponentes().add(new ComponenteFormulario(hijoDeRegistral.getName(), hijoDeRegistral.getText()));
                    }
                }
            }
            datosXML.setCantTitulares(cantTitulares);
        } catch (IOException | JDOMException io) {
            System.out.println(io.getMessage());
        }
        return datosXML;
    }

    /**
     * @param rutaArchivo
     * @return
     */
    public static DatosXML leerXMLTasacion(String rutaArchivo) {
        DatosXML datosXML = new DatosXML();
        SAXBuilder builder = new SAXBuilder();
        //rutaArchivo = "";
        File xmlFile = new File(rutaArchivo);
        try {
            Document document = (Document) builder.build(xmlFile);
            Element rootNode = document.getRootElement();
            java.util.List list = rootNode.getChildren();
            Element elementoTemp;
            Element hijoDeTasacion;
            Element hijoDeTitular;
            Element hijoDeFinca;
            Element hijoDeTitulo;
            Element hijoDeAnejo;
            int cantTitulares = 0;
            int cantAnejos = 0;
            int cantCargas = 0;
            for (int i = 0; i < list.size(); i++) {
                elementoTemp = (Element) list.get(i);
                if (elementoTemp.getName().equals("TASACION")) {
                    java.util.List listaHijosTasacion = elementoTemp.getChildren();
                    for (int j = 0; j < listaHijosTasacion.size(); j++) {
                        hijoDeTasacion = (Element) listaHijosTasacion.get(j);
                        if (hijoDeTasacion.getName().equals("FINCA")) {
                            modelo.FincaTasacion fincaTasacion = new modelo.FincaTasacion();
                            java.util.List listaHijosFinca = hijoDeTasacion.getChildren();
                            cantTitulares++;
                            for (int o = 0; o < listaHijosFinca.size(); o++) {
                                hijoDeFinca = (Element) listaHijosFinca.get(o);
                                if (hijoDeFinca.getName().equals("Titular")) {
                                    ArrayList<ComponenteFormulario> listaTempTitular = new ArrayList<>();
                                    java.util.List listaHijosTitular = hijoDeFinca.getChildren();
                                    for (int k = 0; k < listaHijosTitular.size(); k++) {
                                        hijoDeTitular = (Element) listaHijosTitular.get(k);
                                        if (hijoDeTitular.getName().equals("Titulo")) {
                                            java.util.List listaHijosTitulo = hijoDeTitular.getChildren();
                                            for (int m = 0; m < listaHijosTitulo.size(); m++) {
                                                hijoDeTitulo = (Element) listaHijosTitulo.get(m);
                                                listaTempTitular.add(new ComponenteFormulario(hijoDeTitulo.getName(), hijoDeTitulo.getText()));
                                            }
                                        } else {
                                            hijoDeTitular = (Element) listaHijosTitular.get(k);
                                            listaTempTitular.add(new ComponenteFormulario(hijoDeTitular.getName(), hijoDeTitular.getText()));
                                        }
                                    }
                                    fincaTasacion.getListaTitulares().add(listaTempTitular);
                                } else if (hijoDeFinca.getName().equals("Anejo")) {
                                    ArrayList<ComponenteFormulario> listaTempAnejo = new ArrayList<>();
                                    java.util.List listaHijosAnejo = hijoDeFinca.getChildren();
                                    cantAnejos++;
                                    for (int n = 0; n < listaHijosAnejo.size(); n++) {
                                        hijoDeAnejo = (Element) listaHijosAnejo.get(n);
                                        listaTempAnejo.add(new ComponenteFormulario(hijoDeAnejo.getName(), hijoDeAnejo.getText()));

                                    }
                                    fincaTasacion.getListaAnejos().add(listaTempAnejo);
                                } else {
                                    hijoDeFinca = (Element) listaHijosFinca.get(o);
                                    fincaTasacion.getListaComponentesXML().add(new ComponenteFormulario(hijoDeFinca.getName(), hijoDeFinca.getText()));
                                }
                            }
                            datosXML.getListaFincas().add(fincaTasacion);
                        } else {
                            hijoDeTasacion = (Element) listaHijosTasacion.get(j);
                            datosXML.getListaComponentes().add(new ComponenteFormulario(hijoDeTasacion.getName(), hijoDeTasacion.getText()));
                        }
                    }
                }
            }
            //datosXML.setCantTitulares(cantTitulares);
            //datosXML.setCantAnejos(cantAnejos);
            //datosXML.setCantTitulares(cantCargas);
            
            /*
            for (ComponenteFormulario nodo : datosXML.getListaComponentes()) {
                System.out.println(nodo.getNombre() + "                     " + nodo.getValor());
            }
            
            System.out.println("TITULARES");
            for (ComponenteFormulario nodo : datosXML.getListaTiturales()) {
                System.out.println(nodo.getNombre() + "                     " + nodo.getValor());
            }
            
            System.out.println("ANEJOS");
            for (ComponenteFormulario nodo : datosXML.getListaAnejos()) {
                System.out.println(nodo.getNombre() + "                     " + nodo.getValor());
            }
            
            System.out.println("CARGAS");
            for (ComponenteFormulario nodo : datosXML.getListaCargas()) {
                System.out.println(nodo.getNombre() + "                     " + nodo.getValor());
            }
            */
        } catch (IOException | JDOMException io) {
            System.out.println(io.getMessage());
        }
        return datosXML;
    }

    /**
     * @param rutaArchivo
     * @return
     */
    public static DatosXML leerXMLNotaSimple(String rutaArchivo) {
        DatosXML datosXML = new DatosXML();
        SAXBuilder builder = new SAXBuilder();
        //rutaArchivo = "";
        File xmlFile = new File(rutaArchivo);
        try {
            Document document = (Document) builder.build(xmlFile);
            Element rootNode = document.getRootElement();
            java.util.List list = rootNode.getChildren();
            Element elementoTemp;
            Element hijoDeRegistral;
            Element hijoDeTitular;
            Element hijoDeTitulo = null;
            int cantTitulares = 0;
            int cantAnejos = 0;
            int cantCargas = 0;
            for (int i = 0; i < list.size(); i++) {
                elementoTemp = (Element) list.get(i);
                if (elementoTemp.getName().equals("Registral")) {
                    java.util.List listaHijosRegistral = elementoTemp.getChildren();
                    for (int j = 0; j < listaHijosRegistral.size(); j++) {
                        hijoDeRegistral = (Element) listaHijosRegistral.get(j);
                        datosXML.getListaComponentes().add(new ComponenteFormulario(hijoDeRegistral.getName(), hijoDeRegistral.getText()));
                    }
                } else if (elementoTemp.getName().equals("Titular")) {
                    ArrayList<ComponenteFormulario> listaTempTitular = new ArrayList<>();
                    java.util.List listaHijosTitular = elementoTemp.getChildren();
                    cantTitulares++;
                    for (int j = 0; j < listaHijosTitular.size(); j++) {
                        hijoDeTitular = (Element) listaHijosTitular.get(j);
                        if (hijoDeTitular.getName().equals("Titulo")) {
                            java.util.List listaHijosTitulo = hijoDeTitular.getChildren();
                            for (int k = 0; k < listaHijosTitulo.size(); k++) {
                                hijoDeTitulo = (Element) listaHijosTitulo.get(k);
                                listaTempTitular.add(new ComponenteFormulario(hijoDeTitulo.getName(), hijoDeTitulo.getText()));
                            }
                        } else
                            listaTempTitular.add(new ComponenteFormulario(hijoDeTitular.getName(), hijoDeTitular.getText()));
                    }
                    datosXML.getListaTiturales().add(listaTempTitular);
                } else if (elementoTemp.getName().equals("Anejo")) {
                    ArrayList<ComponenteFormulario> listaTempAnejo = new ArrayList<>();
                    java.util.List listaHijosAnejo = elementoTemp.getChildren();
                    cantAnejos++;
                    for (int j = 0; j < listaHijosAnejo.size(); j++) {
                        hijoDeRegistral = (Element) listaHijosAnejo.get(j);
                        listaTempAnejo.add(new ComponenteFormulario(hijoDeRegistral.getName(), hijoDeRegistral.getText()));

                    }
                    datosXML.getListaAnejos().add(listaTempAnejo);
                } else if (elementoTemp.getName().equals("Carga")) {
                    ArrayList<ComponenteFormulario> listaTempCarga = new ArrayList<>();
                    java.util.List listaHijosCarga = elementoTemp.getChildren();
                    cantCargas++;
                    for (int j = 0; j < listaHijosCarga.size(); j++) {
                        hijoDeRegistral = (Element) listaHijosCarga.get(j);
                        listaTempCarga.add(new ComponenteFormulario(hijoDeRegistral.getName(), hijoDeRegistral.getText()));
                    }
                    datosXML.getListaCargas().add(listaTempCarga);
                }
            }
            datosXML.setCantTitulares(cantTitulares);
            datosXML.setCantAnejos(cantAnejos);
            datosXML.setCantTitulares(cantCargas);
            
            /*
            for (ComponenteFormulario nodo : datosXML.getListaComponentes()) {
                System.out.println(nodo.getNombre() + "                     " + nodo.getValor());
            }
            
            System.out.println("TITULARES");
            for (ComponenteFormulario nodo : datosXML.getListaTiturales()) {
                System.out.println(nodo.getNombre() + "                     " + nodo.getValor());
            }
            
            System.out.println("ANEJOS");
            for (ComponenteFormulario nodo : datosXML.getListaAnejos()) {
                System.out.println(nodo.getNombre() + "                     " + nodo.getValor());
            }
            
            System.out.println("CARGAS");
            for (ComponenteFormulario nodo : datosXML.getListaCargas()) {
                System.out.println(nodo.getNombre() + "                     " + nodo.getValor());
            }
            */
        } catch (IOException | JDOMException io) {
            System.out.println(io.getMessage());
        }
        return datosXML;
    }

    /**
     * @param listaComponentes
     * @param nombre
     * @return
     */
    public static String devolverValorDadoNombre(ArrayList<ComponenteFormulario> listaComponentes, String nombre) {
        String valor = "";
        int index = 0;
        for (ComponenteFormulario componente : listaComponentes) {
            if (componente.getNombre().equalsIgnoreCase(nombre)) {
                /*
                switch (nombre){
                    case "TIT_NOMBRE":
                    case "TIT_APELLIDO1":
                    case "TIT_APELLIDO2":
                    case "TIT_DOC_IDENTIDAD":
                    case "TIT_REGIMEN":
                    case "TLO_PROPIEDAD":
                    case "TLO_FECHA_ESCRITURA":
                    case "TLO_PROTOCOLO":
                    case "TLO_NOTARIA":
                    case "TLO_NUM_INSCRIPCION":
                    case "TLO_FECHA_INSCRIPCION":
                    case "TLO_TIPO_PARTICIPACION":
                    case "TLO_PORC_PARTICIPACION":listaComponentes.remove(index);break;
                }
                */
                return componente.getValor();
            }
            index++;
        }
        return valor;
    }

    /**
     * @param fecha
     * @return
     */
    public static XMLGregorianCalendar convertirXMLGregorianCalendar(String fecha) {
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date date;
        XMLGregorianCalendar xmlGregCal = null;
        try {
            date = format.parse(fecha);
            GregorianCalendar cal = new GregorianCalendar();
            cal.setTime(date);
            xmlGregCal = DatatypeFactory.newInstance().newXMLGregorianCalendar(cal);
        } catch (ParseException | DatatypeConfigurationException ex) {
            Logger.getLogger(MetodosGenerales.class.getName()).log(Level.SEVERE, null, ex);
        }
        return xmlGregCal;
    }

    private static Integer existePersona(ArrayOfFincaTitular arrayOfTitular, String nombre, String apellido1, String apellido2) {
        Integer indice = 0;
        for (FincaTitular fincaTitular : arrayOfTitular.getFincaTitular()) {
            if (fincaTitular.getTitular().getValue().getNombre().getValue().equals(nombre) && fincaTitular.getTitular().getValue().getApellido1().getValue().equals(apellido1) && fincaTitular.getTitular().getValue().getApellido2().getValue().equals(apellido2))
                return indice;
            indice++;
        }
        return -1;
    }

    /**
     * @param datosXML
     * @return
     */
    public static NotaSimple devolverNotaSimple(ChannelSftp channelSftpTech, DatosXML datosXML) {
        ObjectFactory fact = new ObjectFactory();
        NotaSimple notaSimple = new NotaSimple();
        Documento documento = convertirDocumento(MetodosGenerales.devolverValorDadoNombre(datosXML.getListaComponentes(), "NOMBRE_DOCUMENTO"), "Nota Simple");

        notaSimple.setDocumento(fact.createNotaSimpleDocumento(documento));
        String nombreDocumento = MetodosGenerales.devolverValorDadoNombre(datosXML.getListaComponentes(), "NOMBRE_DOCUMENTO");
        String listaParaExt[] = nombreDocumento.split("_{3}");
        notaSimple.setIdSolicitudOCR(Integer.valueOf(listaParaExt[1].split("\\.")[0]));
        //notaSimple.setIdSolicitudOCR(63);
        //notaSimple.setNombre(listaParaExt[0].concat(".").concat(listaParaExt[1].split("\\.")[1]));
        notaSimple.setFechaNotaSimple(MetodosGenerales.devolverValorDadoNombre(datosXML.getListaComponentes(), "FECHA_VERRIF_REG").equals("") ? MetodosGenerales.convertirXMLGregorianCalendar("1900-01-01") : MetodosGenerales.convertirXMLGregorianCalendar(MetodosGenerales.devolverValorDadoNombre(datosXML.getListaComponentes(), "FECHA_VERRIF_REG")));
        Finca finca = new Finca();
        //finca.setCodigoPostal(MetodosGenerales.devolverValorDadoNombre(datosXML.getListaComponentes(), "FINCA_CP").equals("")?null:Integer.valueOf(MetodosGenerales.devolverValorDadoNombre(datosXML.getListaComponentes(), "FINCA_CP")));
        finca.setCodigoPostal(fact.createFincaCodigoPostal(MetodosGenerales.devolverValorDadoNombre(datosXML.getListaComponentes(), "FINCA_CP")));
        finca.setDireccion(fact.createFincaDireccion(MetodosGenerales.devolverValorDadoNombre(datosXML.getListaComponentes(), "FINCA_NOMBRE")));
        finca.setEscalera(fact.createFincaEscalera(MetodosGenerales.devolverValorDadoNombre(datosXML.getListaComponentes(), "FINCA_ESCALERA")));
        finca.setFechaCalificacion(fact.createFincaFechaCalificacion(MetodosGenerales.devolverValorDadoNombre(datosXML.getListaComponentes(), "FECHA_CALIFICACION").equals("") ? MetodosGenerales.convertirXMLGregorianCalendar("1900-01-01") : MetodosGenerales.convertirXMLGregorianCalendar(MetodosGenerales.devolverValorDadoNombre(datosXML.getListaComponentes(), "FECHA_CALIFICACION"))));
        finca.setFechaVerificacion(fact.createFincaFechaVerificacion(MetodosGenerales.devolverValorDadoNombre(datosXML.getListaComponentes(), "FECHA_VERRIF_REG").equals("") ? MetodosGenerales.convertirXMLGregorianCalendar("1900-01-01") : MetodosGenerales.convertirXMLGregorianCalendar(MetodosGenerales.devolverValorDadoNombre(datosXML.getListaComponentes(), "FECHA_VERRIF_REG"))));
        finca.setIdufir(fact.createFincaIdufir(MetodosGenerales.devolverValorDadoNombre(datosXML.getListaComponentes(), "IDUFIR")));
        finca.setInscripcionFolio(MetodosGenerales.devolverValorDadoNombre(datosXML.getListaComponentes(), "RG_FOLIO").equals("") ? null : Integer.valueOf(MetodosGenerales.devolverValorDadoNombre(datosXML.getListaComponentes(), "RG_FOLIO")));
        finca.setInscripcionLibro(MetodosGenerales.devolverValorDadoNombre(datosXML.getListaComponentes(), "RG_LIBRO").equals("") ? null : Integer.valueOf(MetodosGenerales.devolverValorDadoNombre(datosXML.getListaComponentes(), "RG_LIBRO")));
        finca.setInscripcionTomo(MetodosGenerales.devolverValorDadoNombre(datosXML.getListaComponentes(), "RG_TOMO").equals("") ? null : Integer.valueOf(MetodosGenerales.devolverValorDadoNombre(datosXML.getListaComponentes(), "RG_TOMO")));
        finca.setNumeroFinca(fact.createFincaNumeroFinca(MetodosGenerales.devolverValorDadoNombre(datosXML.getListaComponentes(), "RG_FINCA").equals("") ? null : MetodosGenerales.devolverValorDadoNombre(datosXML.getListaComponentes(), "RG_FINCA")));
        finca.setPlanta(fact.createFincaPlanta(MetodosGenerales.devolverValorDadoNombre(datosXML.getListaComponentes(), "FINCA_PLANTA")));
        finca.setPoblacion(MetodosGenerales.devolverValorDadoNombre(datosXML.getListaComponentes(), "FINCA_POBLACION").equals("") ? null : Integer.valueOf(MetodosGenerales.devolverValorDadoNombre(datosXML.getListaComponentes(), "FINCA_POBLACION")));
        finca.setPortal(fact.createFincaPortal(MetodosGenerales.devolverValorDadoNombre(datosXML.getListaComponentes(), "FINCA_PORTAL").equals("") ? null : MetodosGenerales.devolverValorDadoNombre(datosXML.getListaComponentes(), "FINCA_PORTAL")));
        finca.setProvincia(ConfigurationTProvincia.valueOf(MetodosGenerales.devolverValorDadoNombre(datosXML.getListaComponentes(), "FINCA_PROVINCIA")));
        finca.setPuerta(fact.createFincaPuerta(MetodosGenerales.devolverValorDadoNombre(datosXML.getListaComponentes(), "FINCA_PUERTA").equals("") ? null : MetodosGenerales.devolverValorDadoNombre(datosXML.getListaComponentes(), "FINCA_PUERTA")));
        finca.setReferenciaCatastral(fact.createFincaReferenciaCatastral(MetodosGenerales.devolverValorDadoNombre(datosXML.getListaComponentes(), "REF_CATASTRAL").equals("") ? " " : MetodosGenerales.devolverValorDadoNombre(datosXML.getListaComponentes(), "REF_CATASTRAL")));
        finca.setRegistroPropiedad(fact.createFincaRegistroPropiedad(MetodosGenerales.devolverValorDadoNombre(datosXML.getListaComponentes(), "REGISTRO_PROPIEDAD").equals("") ? null : Integer.valueOf(MetodosGenerales.devolverValorDadoNombre(datosXML.getListaComponentes(), "REGISTRO_PROPIEDAD"))));
        finca.setSeccion(MetodosGenerales.devolverValorDadoNombre(datosXML.getListaComponentes(), "RG_SECCION").equals("") ? null : Integer.valueOf(MetodosGenerales.devolverValorDadoNombre(datosXML.getListaComponentes(), "RG_SECCION")));
        finca.setSuperficieConstruida(MetodosGenerales.devolverValorDadoNombre(datosXML.getListaComponentes(), "SUPERF_CONSTRUIDA").equals("") ? null : Double.valueOf(MetodosGenerales.devolverValorDadoNombre(datosXML.getListaComponentes(), "SUPERF_CONSTRUIDA").replace(",", ".")));
        finca.setSuperficieTerreno(MetodosGenerales.devolverValorDadoNombre(datosXML.getListaComponentes(), "SUPERF_TERRENO").equals("") ? null : Double.valueOf(MetodosGenerales.devolverValorDadoNombre(datosXML.getListaComponentes(), "SUPERF_TERRENO").replace(",", ".")));
        finca.setSuperficieUtil(MetodosGenerales.devolverValorDadoNombre(datosXML.getListaComponentes(), "SUPERF_UTIL").equals("") ? null : Double.valueOf(MetodosGenerales.devolverValorDadoNombre(datosXML.getListaComponentes(), "SUPERF_UTIL").replace(",", ".")));
        finca.setTipoFinca(ConfigurationTTipoFinca.fromValue(MetodosGenerales.devolverValorDadoNombre(datosXML.getListaComponentes(), "FINCA_TIPO")));
        finca.setTipoVia(ConfigurationTTipoVia.fromValue(MetodosGenerales.devolverValorDadoNombre(datosXML.getListaComponentes(), "TIPO_VIA")));
        finca.setRegimenProteccion(ConfigurationTTipoRegimenProteccion.fromValue(MetodosGenerales.devolverValorDadoNombre(datosXML.getListaComponentes(), "REGIMEN_PROTECCION")));
        finca.setAnioConstruccion(null);
        finca.setEstadoConservacion(null);
        finca.setOcupacion(null);
        finca.setSuperficieComprobada(null);
        finca.setValorSeguroRD716(null);
        finca.setValorSuelo(null);
        finca.setValorTasacion(null);
        finca.setValoracion(null);

        //Titulares
        ArrayOfFincaTitular arrayOfTitular = new ArrayOfFincaTitular();
        ArrayList<Persona> listaPersonas = new ArrayList<>();
        for (ArrayList<ComponenteFormulario> listaComponentesTitular : datosXML.getListaTiturales()) {
            Integer indice = existePersona(arrayOfTitular, MetodosGenerales.devolverValorDadoNombre(listaComponentesTitular, "TIT_NOMBRE"),
                    MetodosGenerales.devolverValorDadoNombre(listaComponentesTitular, "TIT_APELLIDO1"),
                    MetodosGenerales.devolverValorDadoNombre(listaComponentesTitular, "TIT_APELLIDO2"));
            if (indice == -1) {
                Persona persona = new Persona();
                persona.setNombre(fact.createPersonaNombre(MetodosGenerales.devolverValorDadoNombre(listaComponentesTitular, "TIT_NOMBRE")));
                persona.setApellido1(fact.createPersonaApellido1(MetodosGenerales.devolverValorDadoNombre(listaComponentesTitular, "TIT_APELLIDO1")));
                persona.setApellido2(fact.createPersonaApellido2(MetodosGenerales.devolverValorDadoNombre(listaComponentesTitular, "TIT_APELLIDO2")));
                Identificacion identificacion = new Identificacion();
                identificacion.setNumeroIdentificacion(fact.createIdentificacionNumeroIdentificacion(MetodosGenerales.devolverValorDadoNombre(listaComponentesTitular, "TIT_DOC_IDENTIDAD")));
                identificacion.setTipoIdentificacion(PersonModelIdentifierType.fromValue(MetodosGenerales.devolverValorDadoNombre(listaComponentesTitular, "TIPO_DOCUMENTO")));
                persona.setIdentificacion(fact.createPersonaIdentificacion(identificacion));
                persona.setTipoRegimenEconomico(ConfigurationTTipoRegimenEconomica.fromValue(MetodosGenerales.devolverValorDadoNombre(listaComponentesTitular, "REGIMEN_ECONOMICO")));


                //Título
                ArrayOfTitulo arrayOfTitulo = new ArrayOfTitulo();
                Titulo titulo = new Titulo();
                titulo.setFechaEscritura(MetodosGenerales.devolverValorDadoNombre(listaComponentesTitular, "TLO_FECHA_ESCRITURA").equals("") ? MetodosGenerales.convertirXMLGregorianCalendar("1900-01-01") : MetodosGenerales.convertirXMLGregorianCalendar(MetodosGenerales.devolverValorDadoNombre(listaComponentesTitular, "TLO_FECHA_ESCRITURA")));
                titulo.setFechaInscripcion(MetodosGenerales.devolverValorDadoNombre(listaComponentesTitular, "TLO_FECHA_INSCRIPCION").equals("") ? MetodosGenerales.convertirXMLGregorianCalendar("1900-01-01") : MetodosGenerales.convertirXMLGregorianCalendar(MetodosGenerales.devolverValorDadoNombre(listaComponentesTitular, "TLO_FECHA_INSCRIPCION")));
                titulo.setNotaria(fact.createTituloNotaria(MetodosGenerales.devolverValorDadoNombre(listaComponentesTitular, "TLO_NOTARIA")));
                titulo.setNumeroInscripcion(MetodosGenerales.devolverValorDadoNombre(datosXML.getListaComponentes(), "TLO_NUM_INSCRIPCION").equals("") ? null : Integer.valueOf(MetodosGenerales.devolverValorDadoNombre(listaComponentesTitular, "TLO_NUM_INSCRIPCION")));
                String porciento = MetodosGenerales.devolverValorDadoNombre(listaComponentesTitular, "TLO_PORC_PARTICIPACION").replace(",", ".");
                Double valor = porciento.equals("") ? null : Double.valueOf(porciento);
                titulo.setPorcentajeParticipacion(porciento.equals("") ? null : valor);
                titulo.setProtocolo(fact.createTituloProtocolo(MetodosGenerales.devolverValorDadoNombre(listaComponentesTitular, "TLO_PROTOCOLO")));
                titulo.setTipoParticipacion(ConfigurationTTipoParticipacion.fromValue(MetodosGenerales.devolverValorDadoNombre(listaComponentesTitular, "TLO_TIPO_PARTICIPACION")));
                titulo.setTipoTituloPropiedad(ConfigurationTTipoTitulosPropiedad.fromValue(MetodosGenerales.devolverValorDadoNombre(listaComponentesTitular, "TLO_TIPO_TITULO")));
                titulo.setTipoPropiedad(ConfigurationTTipoPropiedad.fromValue(MetodosGenerales.devolverValorDadoNombre(listaComponentesTitular, "TLO_TIPO_PROPIEDAD")));
                arrayOfTitulo.getTitulo().add(titulo);

                persona.setTitulos(fact.createPersonaTitulos(arrayOfTitulo));

                FincaTitular fincaTitular = new FincaTitular();
                fincaTitular.setTitular(fact.createFincaTitularTitular(persona));
                fincaTitular.setRegimenEconomico(ConfigurationTTipoRegimenEconomica.fromValue(MetodosGenerales.devolverValorDadoNombre(listaComponentesTitular, "REGIMEN_ECONOMICO")));

                arrayOfTitular.getFincaTitular().add(fincaTitular);

            } else {
                Titulo titulo = new Titulo();
                titulo.setFechaEscritura(MetodosGenerales.devolverValorDadoNombre(listaComponentesTitular, "TLO_FECHA_ESCRITURA").equals("") ? MetodosGenerales.convertirXMLGregorianCalendar("1900-01-01") : MetodosGenerales.convertirXMLGregorianCalendar(MetodosGenerales.devolverValorDadoNombre(listaComponentesTitular, "TLO_FECHA_ESCRITURA")));
                titulo.setFechaInscripcion(MetodosGenerales.devolverValorDadoNombre(listaComponentesTitular, "TLO_FECHA_INSCRIPCION").equals("") ? MetodosGenerales.convertirXMLGregorianCalendar("1900-01-01") : MetodosGenerales.convertirXMLGregorianCalendar(MetodosGenerales.devolverValorDadoNombre(listaComponentesTitular, "TLO_FECHA_INSCRIPCION")));
                titulo.setNotaria(fact.createTituloNotaria(MetodosGenerales.devolverValorDadoNombre(listaComponentesTitular, "TLO_NOTARIA")));
                titulo.setNumeroInscripcion(MetodosGenerales.devolverValorDadoNombre(datosXML.getListaComponentes(), "TLO_NUM_INSCRIPCION").equals("") ? null : Integer.valueOf(MetodosGenerales.devolverValorDadoNombre(listaComponentesTitular, "TLO_NUM_INSCRIPCION")));
                String porciento = MetodosGenerales.devolverValorDadoNombre(listaComponentesTitular, "TLO_PORC_PARTICIPACION").replace(",", ".");
                Double valor = porciento.equals("") ? null : Double.valueOf(porciento);
                titulo.setPorcentajeParticipacion(porciento.equals("") ? null : valor);
                titulo.setProtocolo(fact.createTituloProtocolo(MetodosGenerales.devolverValorDadoNombre(listaComponentesTitular, "TLO_PROTOCOLO")));
                titulo.setTipoParticipacion(ConfigurationTTipoParticipacion.fromValue(MetodosGenerales.devolverValorDadoNombre(listaComponentesTitular, "TLO_TIPO_PARTICIPACION")));
                titulo.setTipoTituloPropiedad(ConfigurationTTipoTitulosPropiedad.fromValue(MetodosGenerales.devolverValorDadoNombre(listaComponentesTitular, "TLO_TIPO_TITULO")));
                titulo.setTipoPropiedad(ConfigurationTTipoPropiedad.fromValue(MetodosGenerales.devolverValorDadoNombre(listaComponentesTitular, "TLO_TIPO_PROPIEDAD")));
                arrayOfTitular.getFincaTitular().get(indice).getTitular().getValue().getTitulos().getValue().getTitulo().add(titulo);
            }


        }
        notaSimple.setTitulares(fact.createNotaSimpleTitulares(arrayOfTitular));

        //Anejos
        ArrayOfAnejo arrayOfAnejo = new ArrayOfAnejo();
        for (ArrayList<ComponenteFormulario> listaComponentesAnejos : datosXML.getListaAnejos()) {
            Anejo anejo = new Anejo();
            anejo.setSuperficieConstruida(MetodosGenerales.devolverValorDadoNombre(listaComponentesAnejos, "ANEJO_SUPERF_CONSTRUIDA").equals("") ? null : Double.valueOf(MetodosGenerales.devolverValorDadoNombre(listaComponentesAnejos, "ANEJO_SUPERF_CONSTRUIDA").replace(",", ".")));
            anejo.setSuperficieUtil(MetodosGenerales.devolverValorDadoNombre(listaComponentesAnejos, "ANEJO_SUPERF_UTIL").equals("") ? null : Double.valueOf(MetodosGenerales.devolverValorDadoNombre(listaComponentesAnejos, "ANEJO_SUPERF_UTIL").replace(",", ".")));
            anejo.setTipoFinca(ConfigurationTTipoFinca.fromValue(MetodosGenerales.devolverValorDadoNombre(listaComponentesAnejos, "ANEJO_TIPO")));
            anejo.setValoracion(null);
            //anejo.setValoracion(MetodosGenerales.devolverValorDadoNombre(listaComponentesAnejos, "ANEJO_VALORACION").equals("")?null:Double.valueOf(MetodosGenerales.devolverValorDadoNombre(listaComponentesAnejos, "ANEJO_VALORACION")));
            arrayOfAnejo.getAnejo().add(anejo);
        }
        notaSimple.setAnejos(fact.createNotaSimpleAnejos(arrayOfAnejo));

        //Cargas
        ArrayOfCarga arrayOfCarga = new ArrayOfCarga();
        for (ArrayList<ComponenteFormulario> listaComponentesCargas : datosXML.getListaCargas()) {
            Carga carga = new Carga();
            carga.setAuto(fact.createCargaAuto(MetodosGenerales.devolverValorDadoNombre(listaComponentesCargas, "AUTO").equals("") ? null : MetodosGenerales.devolverValorDadoNombre(listaComponentesCargas, "AUTO")));
            carga.setBeneficiarioHipoteca(fact.createCargaBeneficiarioHipoteca(MetodosGenerales.devolverValorDadoNombre(listaComponentesCargas, "BENEFICIARIO_HIPOTECA").equals("") ? null : MetodosGenerales.devolverValorDadoNombre(listaComponentesCargas, "BENEFICIARIO_HIPOTECA")));
            carga.setBeneficiarioHipotecaBanco(fact.createCargaBeneficiarioHipotecaBanco(MetodosGenerales.devolverValorDadoNombre(listaComponentesCargas, "BENEFICIARIO_HIPOTECA_BANCO").equals("") ? null : Integer.valueOf(MetodosGenerales.devolverValorDadoNombre(listaComponentesCargas, "BENEFICIARIO_HIPOTECA_BANCO"))));
            carga.setCertificacionDominio(fact.createCargaCertificacionDominio(MetodosGenerales.devolverValorDadoNombre(listaComponentesCargas, "CERTIFICACION_DOMINIO").equals("") ? null : MetodosGenerales.devolverValorDadoNombre(listaComponentesCargas, "CERTIFICACION_DOMINIO")));
            carga.setDescripcionNovacion(fact.createCargaDescripcionNovacion(MetodosGenerales.devolverValorDadoNombre(listaComponentesCargas, "DESCRIPCION_NOVACION").equals("") ? null : MetodosGenerales.devolverValorDadoNombre(listaComponentesCargas, "DESCRIPCION_NOVACION")));
            carga.setFechaAuto(fact.createCargaFechaAuto(MetodosGenerales.devolverValorDadoNombre(listaComponentesCargas, "FECHA_AUTO").equals("") ? MetodosGenerales.convertirXMLGregorianCalendar("1900-01-01") : MetodosGenerales.convertirXMLGregorianCalendar(MetodosGenerales.devolverValorDadoNombre(listaComponentesCargas, "FECHA_AUTO"))));
            carga.setFechaCertificacion(fact.createCargaFechaCertificacion(MetodosGenerales.devolverValorDadoNombre(listaComponentesCargas, "FECHA_CERTIFICACION").equals("") ? MetodosGenerales.convertirXMLGregorianCalendar("1900-01-01") : MetodosGenerales.convertirXMLGregorianCalendar(MetodosGenerales.devolverValorDadoNombre(listaComponentesCargas, "FECHA_CERTIFICACION"))));
            carga.setFechaEscritura(fact.createCargaFechaEscritura(MetodosGenerales.devolverValorDadoNombre(listaComponentesCargas, "FECHA_ESCRITURA").equals("") ? MetodosGenerales.convertirXMLGregorianCalendar("1900-01-01") : MetodosGenerales.convertirXMLGregorianCalendar(MetodosGenerales.devolverValorDadoNombre(listaComponentesCargas, "FECHA_ESCRITURA"))));
            carga.setFechaInscripcionCarga(fact.createCargaFechaInscripcionCarga(MetodosGenerales.devolverValorDadoNombre(listaComponentesCargas, "FECHA_INSCRIPCION_CARGA").equals("") ? MetodosGenerales.convertirXMLGregorianCalendar("1900-01-01") : MetodosGenerales.convertirXMLGregorianCalendar(MetodosGenerales.devolverValorDadoNombre(listaComponentesCargas, "FECHA_INSCRIPCION_CARGA"))));
            carga.setFechaVencimiento(fact.createCargaFechaVencimiento(MetodosGenerales.devolverValorDadoNombre(listaComponentesCargas, "FECHA_VENCIMIENTO").equals("") ? MetodosGenerales.convertirXMLGregorianCalendar("1900-01-01") : MetodosGenerales.convertirXMLGregorianCalendar(MetodosGenerales.devolverValorDadoNombre(listaComponentesCargas, "FECHA_VENCIMIENTO"))));
            carga.setFolio(MetodosGenerales.devolverValorDadoNombre(listaComponentesCargas, "FOLIO").equals("") ? null : Integer.valueOf(MetodosGenerales.devolverValorDadoNombre(listaComponentesCargas, "FOLIO")));
            carga.setGastoCostas(MetodosGenerales.devolverValorDadoNombre(listaComponentesCargas, "COSTAS_GASTOS").equals("") ? null : Double.valueOf(MetodosGenerales.devolverValorDadoNombre(listaComponentesCargas, "COSTAS_GASTOS").replace(',', '.')));
            carga.setGastosProcesales(MetodosGenerales.devolverValorDadoNombre(listaComponentesCargas, "GASTOS_PROCESALES").equals("") ? null : Double.valueOf(MetodosGenerales.devolverValorDadoNombre(listaComponentesCargas, "GASTOS_PROCESALES").replace(',', '.')));
            carga.setIgualdadRango(MetodosGenerales.devolverValorDadoNombre(listaComponentesCargas, "IGUALDAD_RANGO").equals("true"));
            carga.setImporteHipoteca(MetodosGenerales.devolverValorDadoNombre(listaComponentesCargas, "IMPORTE_HIPOTECA").equals("") ? null : Double.valueOf(MetodosGenerales.devolverValorDadoNombre(listaComponentesCargas, "IMPORTE_HIPOTECA").replace(',', '.')));
            carga.setInscripcion(MetodosGenerales.devolverValorDadoNombre(listaComponentesCargas, "NUM_INSCRIPCION").equals("") ? null : Integer.valueOf(MetodosGenerales.devolverValorDadoNombre(listaComponentesCargas, "NUM_INSCRIPCION")));
            carga.setInteresesDemora(MetodosGenerales.devolverValorDadoNombre(listaComponentesCargas, "INTERESES_DEMORA").equals("") ? null : Double.valueOf(MetodosGenerales.devolverValorDadoNombre(listaComponentesCargas, "INTERESES_DEMORA").replace(',', '.')));
            carga.setInteresesHipoteca(MetodosGenerales.devolverValorDadoNombre(listaComponentesCargas, "INTERESES_HIPOTECA").equals("") ? null : Double.valueOf(MetodosGenerales.devolverValorDadoNombre(listaComponentesCargas, "INTERESES_HIPOTECA").replace(',', '.')));
            carga.setJuzgado(fact.createCargaJuzgado(MetodosGenerales.devolverValorDadoNombre(listaComponentesCargas, "JUZGADO").equals("") ? null : MetodosGenerales.devolverValorDadoNombre(listaComponentesCargas, "JUZGADO")));
            carga.setLetra(fact.createCargaLetra(MetodosGenerales.devolverValorDadoNombre(listaComponentesCargas, "LETRA").equals("") ? null : MetodosGenerales.devolverValorDadoNombre(listaComponentesCargas, "LETRA")));
            carga.setLibro(MetodosGenerales.devolverValorDadoNombre(listaComponentesCargas, "LIBRO").equals("") ? null : Integer.valueOf(MetodosGenerales.devolverValorDadoNombre(listaComponentesCargas, "LIBRO")));
            carga.setMoneda(fact.createCargaMoneda(MetodosGenerales.devolverValorDadoNombre(listaComponentesCargas, "MONEDA").equals("") ? null : MetodosGenerales.devolverValorDadoNombre(listaComponentesCargas, "MONEDA")));
            carga.setNotario(fact.createCargaNotario(MetodosGenerales.devolverValorDadoNombre(listaComponentesCargas, "NOTARIO").equals("") ? null : MetodosGenerales.devolverValorDadoNombre(listaComponentesCargas, "NOTARIO")));
            carga.setOtrosGastos(MetodosGenerales.devolverValorDadoNombre(listaComponentesCargas, "OTROS_GASTOS").equals("") ? null : Double.valueOf(MetodosGenerales.devolverValorDadoNombre(listaComponentesCargas, "OTROS_GASTOS").replace(',', '.')));
            carga.setPlazoMesesCarga(MetodosGenerales.devolverValorDadoNombre(listaComponentesCargas, "PLAZO_CARGA").equals("") ? null : Integer.valueOf(MetodosGenerales.devolverValorDadoNombre(listaComponentesCargas, "PLAZO_CARGA")));
            carga.setProtocolo(fact.createCargaProtocolo(MetodosGenerales.devolverValorDadoNombre(listaComponentesCargas, "PROTOCOLO").equals("") ? null : MetodosGenerales.devolverValorDadoNombre(listaComponentesCargas, "PROTOCOLO")));
            carga.setRecargoApremio(MetodosGenerales.devolverValorDadoNombre(listaComponentesCargas, "RECARGO_APREMIO").equals("") ? null : Double.valueOf(MetodosGenerales.devolverValorDadoNombre(listaComponentesCargas, "RECARGO_APREMIO").replace(',', '.')));
            carga.setRelacionCarga(fact.createCargaRelacionCarga(MetodosGenerales.devolverValorDadoNombre(listaComponentesCargas, "RELACION_CARGA").equals("") ? null : MetodosGenerales.devolverValorDadoNombre(listaComponentesCargas, "RELACION_CARGA")));
            carga.setResponsabilidadHipoteca(fact.createCargaResponsabilidadHipoteca(MetodosGenerales.devolverValorDadoNombre(listaComponentesCargas, "RESPONSABILIDAD_HIPOTECA").equals("") ? null : MetodosGenerales.devolverValorDadoNombre(listaComponentesCargas, "RESPONSABILIDAD_HIPOTECA")));
            carga.setTipoCarga(ConfigurationTTipoCarga.valueOf(MetodosGenerales.devolverValorDadoNombre(listaComponentesCargas, "TIPO_CARGA")));
            carga.setTomo(MetodosGenerales.devolverValorDadoNombre(listaComponentesCargas, "TOMO").equals("") ? null : Integer.valueOf(MetodosGenerales.devolverValorDadoNombre(listaComponentesCargas, "TOMO")));

            carga.setBeneficiarioCesion(fact.createCargaBeneficiarioCesion(MetodosGenerales.devolverValorDadoNombre(listaComponentesCargas, "BENEFICIARIO_CESION").equals("") ? null : MetodosGenerales.devolverValorDadoNombre(listaComponentesCargas, "BENEFICIARIO_CESION")));
            carga.setProtocoloCesion(fact.createCargaProtocoloCesion(MetodosGenerales.devolverValorDadoNombre(listaComponentesCargas, "PROTOCOLO_CESION").equals("") ? null : MetodosGenerales.devolverValorDadoNombre(listaComponentesCargas, "PROTOCOLO_CESION")));
            carga.setNotarioCesion(fact.createCargaNotarioCesion(MetodosGenerales.devolverValorDadoNombre(listaComponentesCargas, "NOTARIO_CESION").equals("") ? null : MetodosGenerales.devolverValorDadoNombre(listaComponentesCargas, "NOTARIO_CESION")));
            carga.setFechaInscripcionCesion(fact.createCargaFechaInscripcionCesion(MetodosGenerales.devolverValorDadoNombre(listaComponentesCargas, "FECHA_INSCRIPCION_CESION").equals("") ? MetodosGenerales.convertirXMLGregorianCalendar("1900-01-01") : MetodosGenerales.convertirXMLGregorianCalendar(MetodosGenerales.devolverValorDadoNombre(listaComponentesCargas, "FECHA_INSCRIPCION_CESION"))));
            carga.setFechaCesion(fact.createCargaFechaCesion(MetodosGenerales.devolverValorDadoNombre(listaComponentesCargas, "FECHA_CESION").equals("") ? MetodosGenerales.convertirXMLGregorianCalendar("1900-01-01") : MetodosGenerales.convertirXMLGregorianCalendar(MetodosGenerales.devolverValorDadoNombre(listaComponentesCargas, "FECHA_CESION"))));
            carga.setCesion(fact.createCargaCesion(MetodosGenerales.devolverValorDadoNombre(listaComponentesCargas, "CESION").equals("") ? null : MetodosGenerales.devolverValorDadoNombre(listaComponentesCargas, "CESION")));

            arrayOfCarga.getCarga().add(carga);
        }
        finca.setCargas(fact.createFincaCargas(arrayOfCarga));
        notaSimple.setFinca(fact.createNotaSimpleFinca(finca));

        return notaSimple;
    }

    /**
     * @param nombreDocumento
     * @param tipoDocumento
     * @return
     */
    private static Documento convertirDocumento(String nombreDocumento, String tipoDocumento) {
        ObjectFactory fact = new ObjectFactory();
        Documento documento = new Documento();
        byte contenido[] = null;
        File fichero = null;

        switch (tipoDocumento) {
            case "IRPF":
                fichero = new File("/home/BPO/ConvirtiendoWS/IRPF/".concat(nombreDocumento));
                break;
            case "Nomina":
                fichero = new File("/home/BPO/ConvirtiendoWS/Nomina/".concat(nombreDocumento));
                break;
            case "Nota Simple":
                fichero = new File("/home/BPO/ConvirtiendoWS/Nota Simple/".concat(nombreDocumento));
                break;
            case "Recibo":
                fichero = new File("/home/BPO/ConvirtiendoWS/Recibo/".concat(nombreDocumento));
                break;
            case "Tasacion":
                fichero = new File("/home/BPO/ConvirtiendoWS/Tasacion/".concat(nombreDocumento));
                break;
            case "Vida Laboral":
                fichero = new File("/home/BPO/ConvirtiendoWS/Vida Laboral/".concat(nombreDocumento));
                break;
            case "Nota Simple OCR":
                fichero = new File("/home/BPO/ConvirtiendoWS/NotaSimpleOCR/".concat(nombreDocumento));
                break;
        }
        MimetypesFileTypeMap mimeTypesMap = new MimetypesFileTypeMap();
        String mimeType = mimeTypesMap.getContentType(fichero);
        FileInputStream ficheroStream;
        try {
            ficheroStream = new FileInputStream(fichero);
            contenido = new byte[(int) fichero.length()];
            ficheroStream.read(contenido);

        } catch (FileNotFoundException ex) {
            Logger.getLogger(MetodosGenerales.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(MetodosGenerales.class.getName()).log(Level.SEVERE, null, ex);
        }
        documento.setFileName(fact.createDocumentoFileName(nombreDocumento));
        documento.setContent(fact.createDocumentoContent(contenido));
        documento.setMimeType(fact.createDocumentoMimeType(mimeType));
        return documento;
    }

    /**
     * @param channelSftp
     * @param nombreArchivo
     * @return
     */
    private static Integer devolverIdSolicitud(ChannelSftp channelSftp, String nombreArchivo) {
        String destino = direccion.concat("/Enviados/").concat("trazas_descargados_GrupoBCWS.dat");
        String fuente = "/home/BPO/Historico/".concat("trazas_descargados_GrupoBCWS.dat");
        try {
            channelSftp.get(fuente, destino);
        } catch (SftpException ex) {
            Logger.getLogger(TimerTaskSchedule.class.getName()).log(Level.SEVERE, null, ex);
        }
        File archivoTrazas = new File(destino);
        Scanner scanner = null;
        String datosDocumento[];
        try {
            scanner = new Scanner(archivoTrazas);
            while (scanner.hasNextLine()) {
                try {
                    datosDocumento = scanner.nextLine().split("\t\t");
                    if (datosDocumento[0].equals(nombreArchivo)) {
                        archivoTrazas.delete();
                        return Integer.valueOf(datosDocumento[4]);
                    }
                } catch (Exception ex) {
                }
            }
        } catch (FileNotFoundException ex) {
        }
        archivoTrazas.delete();
        return -1;
    }

    /**
     * @param channelSftp
     * @param datosXML
     * @return
     * @throws Exception
     */
    public static IRPF devolverIRPF(ChannelSftp channelSftp, DatosXML datosXML) throws Exception {
        ObjectFactory fact = new ObjectFactory();
        IRPF irpf = new IRPF();

        Documento documento = convertirDocumento(MetodosGenerales.devolverValorDadoNombre(datosXML.getListaComponentes(), "NOMBRE_DOCUMENTO"), "IRPF");
        irpf.setDocumento(documento);
        //irpf.setIdSolicitudOCR(devolverIdSolicitud(channelSftp, MetodosGenerales.devolverValorDadoNombre(datosXML.getListaComponentes(), "NOMBRE_DOCUMENTO")));
        String nombreDocumento = MetodosGenerales.devolverValorDadoNombre(datosXML.getListaComponentes(), "NOMBRE_DOCUMENTO");
        String listaParaExt[] = nombreDocumento.split("_{3}");
        irpf.setIdSolicitudOCR(Integer.valueOf(listaParaExt[1].split("\\.")[0]));
        //irpf.setNombre(listaParaExt[0].concat(".").concat(listaParaExt[1].split("\\.")[1]));
        irpf.setNombre(MetodosGenerales.devolverValorDadoNombre(datosXML.getListaComponentes(), "NOMBRE_TITULAR"));
        irpf.setAportaciones(MetodosGenerales.devolverValorDadoNombre(datosXML.getListaComponentes(), "APORTACIONES").equals("") ? 0.00 : Double.valueOf(MetodosGenerales.devolverValorDadoNombre(datosXML.getListaComponentes(), "APORTACIONES").replace(",", ".")));
        irpf.setBaseImponibleAhorro(MetodosGenerales.devolverValorDadoNombre(datosXML.getListaComponentes(), "BASE_IMPONIBLE_AHORRO").equals("") ? 0.00 : Double.valueOf(MetodosGenerales.devolverValorDadoNombre(datosXML.getListaComponentes(), "BASE_IMPONIBLE_AHORRO").replace(",", ".")));
        irpf.setBaseImponibleGeneral(MetodosGenerales.devolverValorDadoNombre(datosXML.getListaComponentes(), "BASE_IMPONIBLE_GENERAL").equals("") ? 0.00 : Double.valueOf(MetodosGenerales.devolverValorDadoNombre(datosXML.getListaComponentes(), "BASE_IMPONIBLE_GENERAL").replace(",", ".")));
        //irpf.setCodigoPostal( MetodosGenerales.devolverValorDadoNombre(datosXML.getListaComponentes(), "CP").equals("")?0:Integer.valueOf(MetodosGenerales.devolverValorDadoNombre(datosXML.getListaComponentes(), "CP")));
        irpf.setCodigoPostal(MetodosGenerales.devolverValorDadoNombre(datosXML.getListaComponentes(), "CP"));
        irpf.setEstadoCivil(ConfigurationTTipoEstadoCivil.fromValue(MetodosGenerales.devolverValorDadoNombre(datosXML.getListaComponentes(), "ESTADO_CIVIL")));
        irpf.setFecha(MetodosGenerales.devolverValorDadoNombre(datosXML.getListaComponentes(), "FECHA").equals("") ? MetodosGenerales.convertirXMLGregorianCalendar("1900-01-01") : MetodosGenerales.convertirXMLGregorianCalendar(MetodosGenerales.devolverValorDadoNombre(datosXML.getListaComponentes(), "FECHA")));
        irpf.setNIF(MetodosGenerales.devolverValorDadoNombre(datosXML.getListaComponentes(), "NIF"));
        irpf.setOpcionTributacion(ConfigurationTOpcionTributacion.fromValue(MetodosGenerales.devolverValorDadoNombre(datosXML.getListaComponentes(), "OPCION_TRIBUTACION")));
        irpf.setPersonasACargo(MetodosGenerales.devolverValorDadoNombre(datosXML.getListaComponentes(), "PERSONAS_CARGO").equals("") ? 0 : Integer.valueOf(MetodosGenerales.devolverValorDadoNombre(datosXML.getListaComponentes(), "PERSONAS_CARGO")));
        irpf.setProvincia(MetodosGenerales.devolverValorDadoNombre(datosXML.getListaComponentes(), "PROVINCIA").equals("") ? null : ConfigurationTProvincia.valueOf(MetodosGenerales.devolverValorDadoNombre(datosXML.getListaComponentes(), "PROVINCIA")));
        irpf.setRelacionViviendaHabitual(ConfigurationTTipoRelacionViviendaHabitual.fromValue(MetodosGenerales.devolverValorDadoNombre(datosXML.getListaComponentes(), "VIVIENDA_HABITUA")));
        irpf.setRendimientoNetoInmuebleArrendado(MetodosGenerales.devolverValorDadoNombre(datosXML.getListaComponentes(), "RENDIMIENTO_NETO").equals("") ? 0.00 : Double.valueOf(MetodosGenerales.devolverValorDadoNombre(datosXML.getListaComponentes(), "RENDIMIENTO_NETO").replace(",", ".")));
        irpf.setResultadoDeclaracion(MetodosGenerales.devolverValorDadoNombre(datosXML.getListaComponentes(), "RESULTADO_DECLARACION").equals("") ? 0.00 : Double.valueOf(MetodosGenerales.devolverValorDadoNombre(datosXML.getListaComponentes(), "RESULTADO_DECLARACION").replace(",", ".")));
        irpf.setRetencionesPorRendimientoTrabajo(MetodosGenerales.devolverValorDadoNombre(datosXML.getListaComponentes(), "RENDIMIENTO_TRABAJO").equals("") ? 0.00 : Double.valueOf(MetodosGenerales.devolverValorDadoNombre(datosXML.getListaComponentes(), "RENDIMIENTO_TRABAJO").replace(",", ".")));
        return irpf;
    }

    /**
     * @param channelSftp
     * @param datosXML
     * @return
     * @throws Exception
     */
    public static VidaLaboral devolverVidaLaboral(ChannelSftp channelSftp, DatosXML datosXML) throws Exception {
        ObjectFactory fact = new ObjectFactory();
        VidaLaboral vidaLaboral = new VidaLaboral();

        Documento documento = convertirDocumento(MetodosGenerales.devolverValorDadoNombre(datosXML.getListaComponentes(), "NOMBRE_DOCUMENTO"), "Vida Laboral");
        vidaLaboral.setDocumento(fact.createVidaLaboralDocumento(documento));
        //vidaLaboral.setIdSolicitudOCR(devolverIdSolicitud(channelSftp, MetodosGenerales.devolverValorDadoNombre(datosXML.getListaComponentes(), "NOMBRE_DOCUMENTO")));
        String nombreDocumento = MetodosGenerales.devolverValorDadoNombre(datosXML.getListaComponentes(), "NOMBRE_DOCUMENTO");
        String listaParaExt[] = nombreDocumento.split("_{3}");
        vidaLaboral.setIdSolicitudOCR(Integer.valueOf(listaParaExt[1].split("\\.")[0]));
        //vidaLaboral.setIdSolicitudOCR(2);
        //vidaLaboral.setNombre(listaParaExt[0].concat(".").concat(listaParaExt[1].split("\\.")[1]));
        vidaLaboral.setNombre(MetodosGenerales.devolverValorDadoNombre(datosXML.getListaComponentes(), "NOMBRE_TITULAR"));
        vidaLaboral.setCodCEA(fact.createVidaLaboralCodCEA(MetodosGenerales.devolverValorDadoNombre(datosXML.getListaComponentes(), "COD_CEA").trim()));
        vidaLaboral.setFechaAltaSS(MetodosGenerales.devolverValorDadoNombre(datosXML.getListaComponentes(), "FECHA_ALTA_SEGURIDAD_SOCIAL").equals("") ? MetodosGenerales.convertirXMLGregorianCalendar("1900-01-01") : MetodosGenerales.convertirXMLGregorianCalendar(MetodosGenerales.devolverValorDadoNombre(datosXML.getListaComponentes(), "FECHA_ALTA_SEGURIDAD_SOCIAL")));
        vidaLaboral.setFechaAltaUltimaEmpresa(MetodosGenerales.devolverValorDadoNombre(datosXML.getListaComponentes(), "FECHA_ALTA_ULTIMA_EMPRESA").equals("") ? MetodosGenerales.convertirXMLGregorianCalendar("1900-01-01") : MetodosGenerales.convertirXMLGregorianCalendar(MetodosGenerales.devolverValorDadoNombre(datosXML.getListaComponentes(), "FECHA_ALTA_ULTIMA_EMPRESA")));
        vidaLaboral.setFechaCEA(MetodosGenerales.devolverValorDadoNombre(datosXML.getListaComponentes(), "FECHA_CEA").equals("") ? MetodosGenerales.convertirXMLGregorianCalendar("1900-01-01") : MetodosGenerales.convertirXMLGregorianCalendar(MetodosGenerales.devolverValorDadoNombre(datosXML.getListaComponentes(), "FECHA_CEA")));
        vidaLaboral.setFechaDocumento(MetodosGenerales.devolverValorDadoNombre(datosXML.getListaComponentes(), "FECHA_DOCUMENTO").equals("") ? MetodosGenerales.convertirXMLGregorianCalendar("1900-01-01") : MetodosGenerales.convertirXMLGregorianCalendar(MetodosGenerales.devolverValorDadoNombre(datosXML.getListaComponentes(), "FECHA_DOCUMENTO")));
        vidaLaboral.setIdCEA(fact.createVidaLaboralIdCEA(MetodosGenerales.devolverValorDadoNombre(datosXML.getListaComponentes(), "ID_CEA").trim()));
        vidaLaboral.setNIF(fact.createVidaLaboralNIF(MetodosGenerales.devolverValorDadoNombre(datosXML.getListaComponentes(), "NIF").trim()));
        vidaLaboral.setNumeroAniosTotal(MetodosGenerales.devolverValorDadoNombre(datosXML.getListaComponentes(), "NUMERO_ANNO_TOTAL").equals("") ? 0 : Integer.valueOf(MetodosGenerales.devolverValorDadoNombre(datosXML.getListaComponentes(), "NUMERO_ANNO_TOTAL")));
        vidaLaboral.setNumeroSeguridadSocial(fact.createVidaLaboralNumeroSeguridadSocial(MetodosGenerales.devolverValorDadoNombre(datosXML.getListaComponentes(), "NUMERO_SEGURIDAD_SOCIAL").trim()));
        vidaLaboral.setTipoContrato(MetodosGenerales.devolverValorDadoNombre(datosXML.getListaComponentes(), "TIPO_CONTRATO"));
        //vidaLaboral.setTipoContrato("IndefinidoTiempo_completoFomento_contratacion_indefinidaTransformacion_contrato_temporal");

        vidaLaboral.setTipoRegimen(ConfigurationTTipoRegimenSS.fromValue(MetodosGenerales.devolverValorDadoNombre(datosXML.getListaComponentes(), "TIPO_REGIMEN")));
        return vidaLaboral;
    }

    /**
     * @param channelSftp
     * @param datosXML
     * @return
     * @throws Exception
     */
    public static NotaSimpleNodulos devolverNotaSimpleOCR(ChannelSftp channelSftp, DatosXML datosXML) throws Exception {
        ObjectFactory fact = new ObjectFactory();
        NotaSimpleNodulos notaSimpleNodulos = new NotaSimpleNodulos();

        //Documento documento = convertirDocumento(MetodosGenerales.devolverValorDadoNombre(datosXML.getListaComponentes(), "ID_DOCUMENTO").concat(".pdf"), "Nota Simple OCR")
        //notaSimpleNodulos.setDocumento(fact.createVidaLaboralDocumento(documento));
        String nombreDocumento = MetodosGenerales.devolverValorDadoNombre(datosXML.getListaComponentes(), "ID_DOCUMENTO").concat(".pdf");
        String listaParaExt[] = nombreDocumento.split("_{3}");

        notaSimpleNodulos.setIdSolicitudOCR(Integer.valueOf(listaParaExt[1].split("\\.")[0]));
        notaSimpleNodulos.setDatosRegistrales(MetodosGenerales.devolverValorDadoNombre(datosXML.getListaComponentes(), "DATOS_REGISTRALES"));
        notaSimpleNodulos.setDescripcionFinca(MetodosGenerales.devolverValorDadoNombre(datosXML.getListaComponentes(), "DESCRIPCION_FINCA"));
        notaSimpleNodulos.setTitulares(MetodosGenerales.devolverValorDadoNombre(datosXML.getListaComponentes(), "TITULARES"));
        notaSimpleNodulos.setCargas(MetodosGenerales.devolverValorDadoNombre(datosXML.getListaComponentes(), "CARGAS"));
        notaSimpleNodulos.setAsientosPendientes(MetodosGenerales.devolverValorDadoNombre(datosXML.getListaComponentes(), "ASIENTOS_PENDIENTES"));
        return notaSimpleNodulos;
    }

    /**
     * @param channelSftp
     * @param datosXML
     * @return
     * @throws Exception
     */
    public static KODocument devolverDocumentoKO(ChannelSftp channelSftp, DatosXML datosXML) throws Exception {
        KODocument kODocument = new KODocument();
        ObjectFactory fact = new ObjectFactory();
        String nombreDocumento = MetodosGenerales.devolverValorDadoNombre(datosXML.getListaComponentes(), "NOMBRE_DOCUMENTO");
        String listaParaExt[] = nombreDocumento.split("_{3}");
        kODocument.setIdSolicitudOcr(Integer.valueOf(listaParaExt[1].split("\\.")[0]));
        kODocument.setDescripcionError(ConfigurationTTipoError.valueOf(MetodosGenerales.devolverValorDadoNombre(datosXML.getListaComponentes(), "DESCRIPCION_ERROR")));
        kODocument.setObservaciones(fact.createKODocumentObservaciones(MetodosGenerales.devolverValorDadoNombre(datosXML.getListaComponentes(), "OBSERVACIONES")));
        return kODocument;
    }

    /**
     * @param channelSftp
     * @param datosXML
     * @return
     * @throws Exception
     */
    public static Nomina devolverNomina(ChannelSftp channelSftp, DatosXML datosXML) throws Exception {
        ObjectFactory fact = new ObjectFactory();
        Nomina nomina = new Nomina();
        Documento documento = convertirDocumento(MetodosGenerales.devolverValorDadoNombre(datosXML.getListaComponentes(), "NOMBRE_DOCUMENTO"), "Nomina");
        nomina.setDocumento(documento);
        //nomina.setIdSolicitudOCR(devolverIdSolicitud(channelSftp, MetodosGenerales.devolverValorDadoNombre(datosXML.getListaComponentes(), "NOMBRE_DOCUMENTO")));
        String nombreDocumento = MetodosGenerales.devolverValorDadoNombre(datosXML.getListaComponentes(), "NOMBRE_DOCUMENTO");
        String listaParaExt[] = nombreDocumento.split("_{3}");
        nomina.setIdSolicitudOCR(Integer.valueOf(listaParaExt[1].split("\\.")[0]));
        //nomina.setIdSolicitudOCR(71);
        //nomina.setNombre(listaParaExt[0].concat(".").concat(listaParaExt[1].split("\\.")[1]));
        nomina.setNombre(MetodosGenerales.devolverValorDadoNombre(datosXML.getListaComponentes(), "NOMBRE_TITULAR"));
        nomina.setBaseImponible(MetodosGenerales.devolverValorDadoNombre(datosXML.getListaComponentes(), "BASE_IMPONIBLE").equals("") ? 0.00 : Double.valueOf(MetodosGenerales.devolverValorDadoNombre(datosXML.getListaComponentes(), "BASE_IMPONIBLE").replace(",", ".")));
        nomina.setCNAE(MetodosGenerales.devolverValorDadoNombre(datosXML.getListaComponentes(), "CNAE").equals("") ? "0" : MetodosGenerales.devolverValorDadoNombre(datosXML.getListaComponentes(), "CNAE"));
        nomina.setContigenciasComunes(MetodosGenerales.devolverValorDadoNombre(datosXML.getListaComponentes(), "CONTINGENCIAS_COMUNES").equals("") ? 0.00 : Double.valueOf(MetodosGenerales.devolverValorDadoNombre(datosXML.getListaComponentes(), "CONTINGENCIAS_COMUNES").replace(",", ".")));
        nomina.setEmpresa(fact.createNominaEmpresa(MetodosGenerales.devolverValorDadoNombre(datosXML.getListaComponentes(), "EMPRESA")));
        nomina.setFecha(MetodosGenerales.devolverValorDadoNombre(datosXML.getListaComponentes(), "FECHA").equals("") ? MetodosGenerales.convertirXMLGregorianCalendar("1900-01-01") : MetodosGenerales.convertirXMLGregorianCalendar(MetodosGenerales.devolverValorDadoNombre(datosXML.getListaComponentes(), "FECHA")));
        nomina.setFechaAntiguedad(MetodosGenerales.devolverValorDadoNombre(datosXML.getListaComponentes(), "FECHA_ANTIGUEDAD").equals("") ? MetodosGenerales.convertirXMLGregorianCalendar("1900-01-01") : MetodosGenerales.convertirXMLGregorianCalendar(MetodosGenerales.devolverValorDadoNombre(datosXML.getListaComponentes(), "FECHA_ANTIGUEDAD")));
        nomina.setGrupoCotizacion(ConfigurationTGrupoCotizacion.fromValue(MetodosGenerales.devolverValorDadoNombre(datosXML.getListaComponentes(), "GRUPO_COTIZACION")));
        nomina.setImporteARecibir(MetodosGenerales.devolverValorDadoNombre(datosXML.getListaComponentes(), "IMPORTE_RECIBIR").equals("") ? 0.00 : Double.valueOf(MetodosGenerales.devolverValorDadoNombre(datosXML.getListaComponentes(), "IMPORTE_RECIBIR").replace(",", ".")));
        nomina.setNIF(MetodosGenerales.devolverValorDadoNombre(datosXML.getListaComponentes(), "NIF"));
        nomina.setNumeroSeguridadSocial(MetodosGenerales.devolverValorDadoNombre(datosXML.getListaComponentes(), "NUMERO_SEGURIDAD_SOCIAL").equals("") ? "0" : MetodosGenerales.devolverValorDadoNombre(datosXML.getListaComponentes(), "NUMERO_SEGURIDAD_SOCIAL"));
        nomina.setRetencion(MetodosGenerales.devolverValorDadoNombre(datosXML.getListaComponentes(), "RETENCION").equals("") ? 0.00 : Double.valueOf(MetodosGenerales.devolverValorDadoNombre(datosXML.getListaComponentes(), "RETENCION").replace(",", ".")));
        nomina.setRetencionSeguridadSocial(MetodosGenerales.devolverValorDadoNombre(datosXML.getListaComponentes(), "RETENCION_SEGURIDAD_SOCIAL").equals("") ? 0.00 : Double.valueOf(MetodosGenerales.devolverValorDadoNombre(datosXML.getListaComponentes(), "RETENCION_SEGURIDAD_SOCIAL").replace(",", ".")));
        nomina.setTipoIRPF(MetodosGenerales.devolverValorDadoNombre(datosXML.getListaComponentes(), "TIPO_IRPF").equals("") ? 0.00 : Double.valueOf(MetodosGenerales.devolverValorDadoNombre(datosXML.getListaComponentes(), "TIPO_IRPF").replace(",", ".")));
        return nomina;
    }

    /**
     * @param channelSftp
     * @param datosXML
     * @return
     */
    public static Recibo devolverRecibo(ChannelSftp channelSftp, DatosXML datosXML) {
        ObjectFactory fact = new ObjectFactory();
        Recibo recibo = new Recibo();
        Documento documento = convertirDocumento(MetodosGenerales.devolverValorDadoNombre(datosXML.getListaComponentes(), "NOMBRE_DOCUMENTO"), "Recibo");
        recibo.setDocumento(documento);
        String nombreDocumento = MetodosGenerales.devolverValorDadoNombre(datosXML.getListaComponentes(), "NOMBRE_DOCUMENTO");
        String listaParaExt[] = nombreDocumento.split("_{3}");
        recibo.setIdSolicitudOCR(Integer.valueOf(listaParaExt[1].split("\\.")[0]));
        //recibo.setNombre(listaParaExt[0].concat(".").concat(listaParaExt[1].split("\\.")[1]));
        recibo.setNombre(MetodosGenerales.devolverValorDadoNombre(datosXML.getListaComponentes(), "NOMBRE_TITULAR"));
        recibo.setCapitalPendiente(MetodosGenerales.devolverValorDadoNombre(datosXML.getListaComponentes(), "CAPITAL_PENDIENTE").equals("") ? 0.00 : Double.valueOf(MetodosGenerales.devolverValorDadoNombre(datosXML.getListaComponentes(), "CAPITAL_PENDIENTE").replace(",", ".")));
        recibo.setCuota(MetodosGenerales.devolverValorDadoNombre(datosXML.getListaComponentes(), "CUOTA").equals("") ? 0.00 : Double.valueOf(MetodosGenerales.devolverValorDadoNombre(datosXML.getListaComponentes(), "CUOTA").replace(",", ".")));
        recibo.setEntidadEmisora(MetodosGenerales.devolverValorDadoNombre(datosXML.getListaComponentes(), "ENTIDAD_EMISORA").equals("") ? " " : MetodosGenerales.devolverValorDadoNombre(datosXML.getListaComponentes(), "ENTIDAD_EMISORA"));
        recibo.setFechaRecibo(MetodosGenerales.devolverValorDadoNombre(datosXML.getListaComponentes(), "FECHA_RECIBO").equals("") ? MetodosGenerales.convertirXMLGregorianCalendar("1900-01-01") : MetodosGenerales.convertirXMLGregorianCalendar(MetodosGenerales.devolverValorDadoNombre(datosXML.getListaComponentes(), "FECHA_RECIBO")));
        recibo.setFechaVencimiento(fact.createReciboFechaVencimiento(MetodosGenerales.devolverValorDadoNombre(datosXML.getListaComponentes(), "FECHA_VENCIMIENTO").equals("") ? MetodosGenerales.convertirXMLGregorianCalendar("1900-01-01") : MetodosGenerales.convertirXMLGregorianCalendar(MetodosGenerales.devolverValorDadoNombre(datosXML.getListaComponentes(), "FECHA_VENCIMIENTO"))));
        recibo.setImportePrestamo(MetodosGenerales.devolverValorDadoNombre(datosXML.getListaComponentes(), "IMPORTE_PRESTAMO").equals("") ? 0.00 : Double.valueOf(MetodosGenerales.devolverValorDadoNombre(datosXML.getListaComponentes(), "IMPORTE_PRESTAMO").replace(",", ".")));
        recibo.setNumeroPrestamo(MetodosGenerales.devolverValorDadoNombre(datosXML.getListaComponentes(), "NUMERO_PRESTAMO").equals("") ? " " : MetodosGenerales.devolverValorDadoNombre(datosXML.getListaComponentes(), "NUMERO_PRESTAMO"));
        return recibo;
    }

    /**
     * @param channelSftp
     * @param datosXML
     * @return
     */
    public static Tasacion devolverTasacion(ChannelSftp channelSftp, DatosXML datosXML) {
        ObjectFactory fact = new ObjectFactory();
        Tasacion tasacion = new Tasacion();

        Documento documento = convertirDocumento(MetodosGenerales.devolverValorDadoNombre(datosXML.getListaComponentes(), "NOMBRE_DOCUMENTO"), "Tasacion");
        tasacion.setDocumento(fact.createTasacionDocumento(documento));
        String nombreDocumento = MetodosGenerales.devolverValorDadoNombre(datosXML.getListaComponentes(), "NOMBRE_DOCUMENTO");
        String listaParaExt[] = nombreDocumento.split("_{3}");
        tasacion.setIdSolicitudOCR(Integer.valueOf(listaParaExt[1].split("\\.")[0]));
        //tasacion.setNombre(listaParaExt[0].concat(".").concat(listaParaExt[1].split("\\.")[1]));
        ArrayOfAdvertencia arrayOfAdvertencia = new ArrayOfAdvertencia();
        String listaAdvertencias[] = MetodosGenerales.devolverValorDadoNombre(datosXML.getListaComponentes(), "ADVERTENCIAS").equals("") ? null : MetodosGenerales.devolverValorDadoNombre(datosXML.getListaComponentes(), "ADVERTENCIAS").split("#");
        if (listaAdvertencias != null)
            for (String advertenciaTemp : listaAdvertencias) {
                Advertencia advertencia = new Advertencia();
                advertencia.setIdAdvertencia(ConfigurationTTipoAdvertencia.fromValue(advertenciaTemp)); //;tDescripcion(fact.createAdvertenciaDescripcion(listaAdvertencias[i]));
                arrayOfAdvertencia.getAdvertencia().add(advertencia);
            }
        tasacion.setAdvertencias(fact.createTasacionAdvertencias(arrayOfAdvertencia));

        ArrayOfCondicionante arrayOfCondicionantes = new ArrayOfCondicionante();
        String listaCondicionantes[] = MetodosGenerales.devolverValorDadoNombre(datosXML.getListaComponentes(), "CONDICIONANTES").equals("") ? null : MetodosGenerales.devolverValorDadoNombre(datosXML.getListaComponentes(), "CONDICIONANTES").split("#");
        if (listaCondicionantes != null)
            for (String condicionanteTemp : listaCondicionantes) {
                Condicionante condicionante = new Condicionante();
                condicionante.setIdCondicionante(ConfigurationTTipoCondicionante.fromValue(condicionanteTemp));
                arrayOfCondicionantes.getCondicionante().add(condicionante);
            }
        tasacion.setCondicionantes(fact.createTasacionCondicionantes(arrayOfCondicionantes));

        tasacion.setCodigoTasacion(fact.createTasacionCodigoTasacion(MetodosGenerales.devolverValorDadoNombre(datosXML.getListaComponentes(), "CODIGO_TASACION")));
        tasacion.setCodigoTasacionSociedadTasacionEstadistica(fact.createTasacionCodigoSociedadTasacionEstadistica(MetodosGenerales.devolverValorDadoNombre(datosXML.getListaComponentes(), "CODIGO_TASACION_ESTADISTICO")));
        tasacion.setCodigoSociedadTasacionEstadistica(fact.createTasacionCodigoSociedadTasacionEstadistica(MetodosGenerales.devolverValorDadoNombre(datosXML.getListaComponentes(), "CODIGO_TASACION_ESTADISTICO")));
        tasacion.setEmpresaTasadora(fact.createTasacionEmpresaTasadora(MetodosGenerales.devolverValorDadoNombre(datosXML.getListaComponentes(), "EMPRESA_TASADORA")));
        tasacion.setFechaCaducidad(MetodosGenerales.devolverValorDadoNombre(datosXML.getListaComponentes(), "FECHA_CADUCIDAD").equals("") ? MetodosGenerales.convertirXMLGregorianCalendar("1900-01-01") : MetodosGenerales.convertirXMLGregorianCalendar(MetodosGenerales.devolverValorDadoNombre(datosXML.getListaComponentes(), "FECHA_CADUCIDAD")));
        tasacion.setFechaVisita(MetodosGenerales.devolverValorDadoNombre(datosXML.getListaComponentes(), "FECHA_VISITA").equals("") ? MetodosGenerales.convertirXMLGregorianCalendar("1900-01-01") : MetodosGenerales.convertirXMLGregorianCalendar(MetodosGenerales.devolverValorDadoNombre(datosXML.getListaComponentes(), "FECHA_VISITA")));
        tasacion.setFechaTasacion(MetodosGenerales.devolverValorDadoNombre(datosXML.getListaComponentes(), "FECHA_TASACION").equals("") ? MetodosGenerales.convertirXMLGregorianCalendar("1900-01-01") : MetodosGenerales.convertirXMLGregorianCalendar(MetodosGenerales.devolverValorDadoNombre(datosXML.getListaComponentes(), "FECHA_TASACION")));
        tasacion.setFechaValoracionEstadistica(fact.createTasacionFechaValoracionEstadistica(MetodosGenerales.devolverValorDadoNombre(datosXML.getListaComponentes(), "FECHA_VALORACION_ESTADISTICO").equals("") ? MetodosGenerales.convertirXMLGregorianCalendar("1900-01-01") : MetodosGenerales.convertirXMLGregorianCalendar(MetodosGenerales.devolverValorDadoNombre(datosXML.getListaComponentes(), "FECHA_VALORACION_ESTADISTICO"))));
        tasacion.setFinalidadTasacion(ConfigurationTFinalidadTasacion.fromValue(MetodosGenerales.devolverValorDadoNombre(datosXML.getListaComponentes(), "FINALIDAD_TASACION")));
        tasacion.setFuenteDatos(ConfigurationTFuenteDeDatos.fromValue(MetodosGenerales.devolverValorDadoNombre(datosXML.getListaComponentes(), "FUENTE_DATOS")));
        tasacion.setLeyDeMercado(ConfigurationTLeyDeMercado.fromValue(MetodosGenerales.devolverValorDadoNombre(datosXML.getListaComponentes(), "LEY_MERCADO")));
        tasacion.setMetodoValoracion(ConfigurationTMetodoValoracion.fromValue(MetodosGenerales.devolverValorDadoNombre(datosXML.getListaComponentes(), "METODO_VALORACION")));
        tasacion.setMetodoValoracionEstadistico(ConfigurationTMetodoValoracionEstadistico.fromValue(MetodosGenerales.devolverValorDadoNombre(datosXML.getListaComponentes(), "METODO_VALORACION_ESTADISTICO")));
        tasacion.setNombreTasador(fact.createTasacionNombreTasador(MetodosGenerales.devolverValorDadoNombre(datosXML.getListaComponentes(), "NOMBRE_TASADOR")));
        tasacion.setObservaciones(fact.createTasacionObservaciones(MetodosGenerales.devolverValorDadoNombre(datosXML.getListaComponentes(), "OBSERVACIONES")));
        tasacion.setSolicitante(fact.createTasacionSolicitante(MetodosGenerales.devolverValorDadoNombre(datosXML.getListaComponentes(), "NOMBRE_SOLICITANTE")));
        tasacion.setValorTasacion(MetodosGenerales.devolverValorDadoNombre(datosXML.getListaComponentes(), "VALOR_TASACION").equals("") ? 0.00 : Double.valueOf(MetodosGenerales.devolverValorDadoNombre(datosXML.getListaComponentes(), "VALOR_TASACION").replace(",", ".")));
        tasacion.setValorHipotecario(MetodosGenerales.devolverValorDadoNombre(datosXML.getListaComponentes(), "VALOR_HIPOTECARIO").equals("") ? 0.00 : Double.valueOf(MetodosGenerales.devolverValorDadoNombre(datosXML.getListaComponentes(), "VALOR_HIPOTECARIO").replace(",", ".")));
        tasacion.setValorTasacionEstadistico(fact.createTasacionValorTasacionEstadistico(MetodosGenerales.devolverValorDadoNombre(datosXML.getListaComponentes(), "VALOR_TASACION_ESTADISTICO").equals("") ? 0.00 : Double.valueOf(MetodosGenerales.devolverValorDadoNombre(datosXML.getListaComponentes(), "VALOR_TASACION_ESTADISTICO").replaceAll(",", "."))));
        tasacion.setVisitaInmueble(ConfigurationTVisitaInmueble.fromValue(MetodosGenerales.devolverValorDadoNombre(datosXML.getListaComponentes(), "VISITA_INMUEBLE")));


        //Finca Tasación
        ArrayOfFincaTasacion arrayOfFincaTasacion = new ArrayOfFincaTasacion();
        for (modelo.FincaTasacion datosFinca : datosXML.getListaFincas()) {
            FincaTasacion fincaTasacion = new FincaTasacion();
            fincaTasacion.setValorTasacion(fact.createFincaTasacionValorTasacion(MetodosGenerales.devolverValorDadoNombre(datosFinca.getListaComponentesXML(), "VALOR_TASACION").equals("") ? null : Double.valueOf(MetodosGenerales.devolverValorDadoNombre(datosFinca.getListaComponentesXML(), "VALOR_TASACION").replace(",", "."))));
            fincaTasacion.setValorHipotecario(fact.createFincaTasacionValorHipotecario(MetodosGenerales.devolverValorDadoNombre(datosFinca.getListaComponentesXML(), "VALOR_HIPOTECARIO").equals("") ? null : Double.valueOf(MetodosGenerales.devolverValorDadoNombre(datosFinca.getListaComponentesXML(), "VALOR_HIPOTECARIO").replace(",", "."))));
            fincaTasacion.setIdTasacion(fact.createFincaTasacionIdTasacion(tasacion.getIdSolicitudOCR()));

            //Finca
            Finca finca = new Finca();
            //finca.setCodigoPostal(MetodosGenerales.devolverValorDadoNombre(datosFinca.getListaComponentesXML(), "FINCA_CP").equals("")?null:Integer.valueOf(MetodosGenerales.devolverValorDadoNombre(datosFinca.getListaComponentesXML(), "FINCA_CP")));
            finca.setCodigoPostal(fact.createFincaCodigoPostal(MetodosGenerales.devolverValorDadoNombre(datosFinca.getListaComponentesXML(), "FINCA_CP")));
            finca.setDireccion(fact.createFincaDireccion(MetodosGenerales.devolverValorDadoNombre(datosFinca.getListaComponentesXML(), "FINCA_NOMBRE")));
            finca.setEscalera(fact.createFincaEscalera(MetodosGenerales.devolverValorDadoNombre(datosFinca.getListaComponentesXML(), "FINCA_ESCALERA")));
            finca.setFechaCalificacion(fact.createFincaFechaCalificacion(MetodosGenerales.devolverValorDadoNombre(datosFinca.getListaComponentesXML(), "FECHA_CALIFICACION").equals("") ? MetodosGenerales.convertirXMLGregorianCalendar("1900-01-01") : MetodosGenerales.convertirXMLGregorianCalendar(MetodosGenerales.devolverValorDadoNombre(datosFinca.getListaComponentesXML(), "FECHA_CALIFICACION"))));
            finca.setFechaVerificacion(fact.createFincaFechaVerificacion(MetodosGenerales.devolverValorDadoNombre(datosFinca.getListaComponentesXML(), "FECHA_VERRIF_REG").equals("") ? MetodosGenerales.convertirXMLGregorianCalendar("1900-01-01") : MetodosGenerales.convertirXMLGregorianCalendar(MetodosGenerales.devolverValorDadoNombre(datosFinca.getListaComponentesXML(), "FECHA_VERRIF_REG"))));
            finca.setIdufir(fact.createFincaIdufir(MetodosGenerales.devolverValorDadoNombre(datosFinca.getListaComponentesXML(), "IDUFIR")));
            finca.setInscripcionFolio(MetodosGenerales.devolverValorDadoNombre(datosFinca.getListaComponentesXML(), "RG_FOLIO").equals("") ? null : Integer.valueOf(MetodosGenerales.devolverValorDadoNombre(datosFinca.getListaComponentesXML(), "RG_FOLIO")));
            finca.setInscripcionLibro(MetodosGenerales.devolverValorDadoNombre(datosFinca.getListaComponentesXML(), "RG_LIBRO").equals("") ? null : Integer.valueOf(MetodosGenerales.devolverValorDadoNombre(datosFinca.getListaComponentesXML(), "RG_LIBRO")));
            finca.setInscripcionTomo(MetodosGenerales.devolverValorDadoNombre(datosFinca.getListaComponentesXML(), "RG_TOMO").equals("") ? null : Integer.valueOf(MetodosGenerales.devolverValorDadoNombre(datosFinca.getListaComponentesXML(), "RG_TOMO")));
            finca.setNumeroFinca(fact.createFincaNumeroFinca(MetodosGenerales.devolverValorDadoNombre(datosFinca.getListaComponentesXML(), "RG_FINCA").equals("") ? null : MetodosGenerales.devolverValorDadoNombre(datosFinca.getListaComponentesXML(), "RG_FINCA")));
            finca.setPlanta(fact.createFincaPlanta(MetodosGenerales.devolverValorDadoNombre(datosFinca.getListaComponentesXML(), "FINCA_PLANTA")));
            finca.setPoblacion(MetodosGenerales.devolverValorDadoNombre(datosFinca.getListaComponentesXML(), "FINCA_POBLACION").equals("") ? null : Integer.valueOf(MetodosGenerales.devolverValorDadoNombre(datosFinca.getListaComponentesXML(), "FINCA_POBLACION")));
            finca.setPortal(fact.createFincaPortal(MetodosGenerales.devolverValorDadoNombre(datosFinca.getListaComponentesXML(), "FINCA_PORTAL").equals("") ? null : MetodosGenerales.devolverValorDadoNombre(datosFinca.getListaComponentesXML(), "FINCA_PORTAL")));
            finca.setProvincia(ConfigurationTProvincia.valueOf(MetodosGenerales.devolverValorDadoNombre(datosFinca.getListaComponentesXML(), "FINCA_PROVINCIA")));
            finca.setPuerta(fact.createFincaPuerta(MetodosGenerales.devolverValorDadoNombre(datosFinca.getListaComponentesXML(), "FINCA_PUERTA").equals("") ? null : MetodosGenerales.devolverValorDadoNombre(datosFinca.getListaComponentesXML(), "FINCA_PUERTA")));
            finca.setReferenciaCatastral(fact.createFincaReferenciaCatastral(MetodosGenerales.devolverValorDadoNombre(datosFinca.getListaComponentesXML(), "REF_CATASTRAL").equals("") ? " " : MetodosGenerales.devolverValorDadoNombre(datosFinca.getListaComponentesXML(), "REF_CATASTRAL")));
            finca.setRegistroPropiedad(fact.createFincaRegistroPropiedad(MetodosGenerales.devolverValorDadoNombre(datosFinca.getListaComponentesXML(), "REGISTRO_PROPIEDAD").equals("") ? null : Integer.valueOf(MetodosGenerales.devolverValorDadoNombre(datosFinca.getListaComponentesXML(), "REGISTRO_PROPIEDAD"))));
            finca.setSeccion(MetodosGenerales.devolverValorDadoNombre(datosFinca.getListaComponentesXML(), "RG_SECCION").equals("") ? null : Integer.valueOf(MetodosGenerales.devolverValorDadoNombre(datosFinca.getListaComponentesXML(), "RG_SECCION")));
            finca.setSuperficieConstruida(MetodosGenerales.devolverValorDadoNombre(datosFinca.getListaComponentesXML(), "SUPERF_CONSTRUIDA").equals("") ? null : Double.valueOf(MetodosGenerales.devolverValorDadoNombre(datosFinca.getListaComponentesXML(), "SUPERF_CONSTRUIDA").replace(",", ".")));
            finca.setSuperficieTerreno(MetodosGenerales.devolverValorDadoNombre(datosFinca.getListaComponentesXML(), "SUPERF_TERRENO").equals("") ? null : Double.valueOf(MetodosGenerales.devolverValorDadoNombre(datosFinca.getListaComponentesXML(), "SUPERF_TERRENO").replace(",", ".")));
            finca.setSuperficieUtil(MetodosGenerales.devolverValorDadoNombre(datosFinca.getListaComponentesXML(), "SUPERF_UTIL").equals("") ? null : Double.valueOf(MetodosGenerales.devolverValorDadoNombre(datosFinca.getListaComponentesXML(), "SUPERF_UTIL").replace(",", ".")));
            finca.setTipoFinca(ConfigurationTTipoFinca.fromValue(MetodosGenerales.devolverValorDadoNombre(datosFinca.getListaComponentesXML(), "FINCA_TIPO")));
            finca.setTipoVia(ConfigurationTTipoVia.fromValue(MetodosGenerales.devolverValorDadoNombre(datosFinca.getListaComponentesXML(), "TIPO_VIA")));
            finca.setRegimenProteccion(ConfigurationTTipoRegimenProteccion.fromValue(MetodosGenerales.devolverValorDadoNombre(datosFinca.getListaComponentesXML(), "REGIMEN_PROTECCION")));
            finca.setAnioConstruccion(ConfigurationTAnioConstruccion.fromValue(MetodosGenerales.devolverValorDadoNombre(datosFinca.getListaComponentesXML(), "ANNO_CONSTRUCCION")));
            finca.setEstadoConservacion(ConfigurationTTipoEstadoConservacion.fromValue(MetodosGenerales.devolverValorDadoNombre(datosFinca.getListaComponentesXML(), "ESTADO_CONSERVACION")));
            finca.setOcupacion(ConfigurationTTipoOcupacion.fromValue(MetodosGenerales.devolverValorDadoNombre(datosFinca.getListaComponentesXML(), "OCUPACION")));
            finca.setSuperficieComprobada(MetodosGenerales.devolverValorDadoNombre(datosFinca.getListaComponentesXML(), "SUPERFICIE_COMPROBADA").equals("") ? null : Double.valueOf(MetodosGenerales.devolverValorDadoNombre(datosFinca.getListaComponentesXML(), "SUPERFICIE_COMPROBADA").replace(",", ".")));
            finca.setValorSeguroRD716(MetodosGenerales.devolverValorDadoNombre(datosFinca.getListaComponentesXML(), "VALOR_SEGURO").equals("") ? null : Double.valueOf(MetodosGenerales.devolverValorDadoNombre(datosFinca.getListaComponentesXML(), "VALOR_SEGURO").replace(",", ".")));
            finca.setValorSuelo(MetodosGenerales.devolverValorDadoNombre(datosFinca.getListaComponentesXML(), "VALOR_SUELO").equals("") ? null : Double.valueOf(MetodosGenerales.devolverValorDadoNombre(datosFinca.getListaComponentesXML(), "VALOR_SUELO").replace(",", ".")));
            finca.setValorTasacion(MetodosGenerales.devolverValorDadoNombre(datosFinca.getListaComponentesXML(), "VALOR_TASACION").equals("") ? null : Double.valueOf(MetodosGenerales.devolverValorDadoNombre(datosFinca.getListaComponentesXML(), "VALOR_TASACION").replace(",", ".")));
            finca.setValoracion(MetodosGenerales.devolverValorDadoNombre(datosFinca.getListaComponentesXML(), "VALORACION").equals("") ? null : Double.valueOf(MetodosGenerales.devolverValorDadoNombre(datosFinca.getListaComponentesXML(), "VALORACION").replace(",", ".")));


            fincaTasacion.setFinca(fact.createFincaTasacionFinca(finca));


            //Anejos
            ArrayOfAnejo arrayOfAnejo = new ArrayOfAnejo();
            for (ArrayList<ComponenteFormulario> listaComponentesAnejos : datosFinca.getListaAnejos()) {
                Anejo anejo = new Anejo();
                anejo.setSuperficieConstruida(MetodosGenerales.devolverValorDadoNombre(listaComponentesAnejos, "ANEJO_SUPERF_CONSTRUIDA").equals("") ? null : Double.valueOf(MetodosGenerales.devolverValorDadoNombre(listaComponentesAnejos, "ANEJO_SUPERF_CONSTRUIDA").replace(",", ".")));
                anejo.setSuperficieUtil(MetodosGenerales.devolverValorDadoNombre(listaComponentesAnejos, "ANEJO_SUPERF_UTIL").equals("") ? null : Double.valueOf(MetodosGenerales.devolverValorDadoNombre(listaComponentesAnejos, "ANEJO_SUPERF_UTIL").replace(",", ".")));
                anejo.setTipoFinca(ConfigurationTTipoFinca.fromValue(MetodosGenerales.devolverValorDadoNombre(listaComponentesAnejos, "ANEJO_TIPO")));
                anejo.setValoracion(MetodosGenerales.devolverValorDadoNombre(listaComponentesAnejos, "ANEJO_VALORACION").equals("") ? null : Double.valueOf(MetodosGenerales.devolverValorDadoNombre(listaComponentesAnejos, "ANEJO_VALORACION").replace(",", ".")));
                arrayOfAnejo.getAnejo().add(anejo);
            }
            fincaTasacion.setAnejos(fact.createFincaTasacionAnejos(arrayOfAnejo));

            //Titulares
            ArrayOfFincaTitular arrayOfTitular = new ArrayOfFincaTitular();
            for (ArrayList<ComponenteFormulario> listaComponentesTitular : datosFinca.getListaTitulares()) {
                Integer indice = existePersona(arrayOfTitular, MetodosGenerales.devolverValorDadoNombre(listaComponentesTitular, "TIT_NOMBRE"),
                        MetodosGenerales.devolverValorDadoNombre(listaComponentesTitular, "TIT_APELLIDO1"),
                        MetodosGenerales.devolverValorDadoNombre(listaComponentesTitular, "TIT_APELLIDO2"));
                if (indice == -1) {
                    Persona persona = new Persona();
                    persona.setNombre(fact.createPersonaNombre(MetodosGenerales.devolverValorDadoNombre(listaComponentesTitular, "TIT_NOMBRE")));
                    persona.setApellido1(fact.createPersonaApellido1(MetodosGenerales.devolverValorDadoNombre(listaComponentesTitular, "TIT_APELLIDO1")));
                    persona.setApellido2(fact.createPersonaApellido2(MetodosGenerales.devolverValorDadoNombre(listaComponentesTitular, "TIT_APELLIDO2")));
                    Identificacion identificacion = new Identificacion();
                    identificacion.setNumeroIdentificacion(fact.createIdentificacionNumeroIdentificacion(MetodosGenerales.devolverValorDadoNombre(listaComponentesTitular, "TIT_DOC_IDENTIDAD")));
                    identificacion.setTipoIdentificacion(PersonModelIdentifierType.fromValue(MetodosGenerales.devolverValorDadoNombre(listaComponentesTitular, "TIPO_DOCUMENTO")));
                    persona.setIdentificacion(fact.createPersonaIdentificacion(identificacion));
                    persona.setTipoRegimenEconomico(ConfigurationTTipoRegimenEconomica.fromValue(MetodosGenerales.devolverValorDadoNombre(listaComponentesTitular, "REGIMEN_ECONOMICO")));


                    //Título
                    ArrayOfTitulo arrayOfTitulo = new ArrayOfTitulo();
                    Titulo titulo = new Titulo();
                    titulo.setFechaEscritura(MetodosGenerales.devolverValorDadoNombre(listaComponentesTitular, "TLO_FECHA_ESCRITURA").equals("") ? MetodosGenerales.convertirXMLGregorianCalendar("1900-01-01") : MetodosGenerales.convertirXMLGregorianCalendar(MetodosGenerales.devolverValorDadoNombre(listaComponentesTitular, "TLO_FECHA_ESCRITURA")));
                    titulo.setFechaInscripcion(MetodosGenerales.devolverValorDadoNombre(listaComponentesTitular, "TLO_FECHA_INSCRIPCION").equals("") ? MetodosGenerales.convertirXMLGregorianCalendar("1900-01-01") : MetodosGenerales.convertirXMLGregorianCalendar(MetodosGenerales.devolverValorDadoNombre(listaComponentesTitular, "TLO_FECHA_INSCRIPCION")));
                    titulo.setNotaria(fact.createTituloNotaria(MetodosGenerales.devolverValorDadoNombre(listaComponentesTitular, "TLO_NOTARIA")));
                    titulo.setNumeroInscripcion(MetodosGenerales.devolverValorDadoNombre(datosXML.getListaComponentes(), "TLO_NUM_INSCRIPCION").equals("") ? null : Integer.valueOf(MetodosGenerales.devolverValorDadoNombre(listaComponentesTitular, "TLO_NUM_INSCRIPCION")));
                    String porciento = MetodosGenerales.devolverValorDadoNombre(listaComponentesTitular, "TLO_PORC_PARTICIPACION").replace(",", ".");
                    Double valor = porciento.equals("") ? null : Double.valueOf(porciento);
                    titulo.setPorcentajeParticipacion(porciento.equals("") ? null : valor);
                    titulo.setProtocolo(fact.createTituloProtocolo(MetodosGenerales.devolverValorDadoNombre(listaComponentesTitular, "TLO_PROTOCOLO")));
                    titulo.setTipoParticipacion(ConfigurationTTipoParticipacion.fromValue(MetodosGenerales.devolverValorDadoNombre(listaComponentesTitular, "TLO_TIPO_PARTICIPACION")));
                    titulo.setTipoTituloPropiedad(ConfigurationTTipoTitulosPropiedad.fromValue(MetodosGenerales.devolverValorDadoNombre(listaComponentesTitular, "TLO_TIPO_TITULO")));
                    titulo.setTipoPropiedad(ConfigurationTTipoPropiedad.fromValue(MetodosGenerales.devolverValorDadoNombre(listaComponentesTitular, "TLO_TIPO_PROPIEDAD")));
                    arrayOfTitulo.getTitulo().add(titulo);

                    persona.setTitulos(fact.createPersonaTitulos(arrayOfTitulo));

                    FincaTitular fincaTitular = new FincaTitular();
                    fincaTitular.setTitular(fact.createFincaTitularTitular(persona));
                    fincaTitular.setRegimenEconomico(ConfigurationTTipoRegimenEconomica.fromValue(MetodosGenerales.devolverValorDadoNombre(listaComponentesTitular, "REGIMEN_ECONOMICO")));

                    arrayOfTitular.getFincaTitular().add(fincaTitular);

                } else {
                    Titulo titulo = new Titulo();
                    titulo.setFechaEscritura(MetodosGenerales.devolverValorDadoNombre(listaComponentesTitular, "TLO_FECHA_ESCRITURA").equals("") ? MetodosGenerales.convertirXMLGregorianCalendar("1900-01-01") : MetodosGenerales.convertirXMLGregorianCalendar(MetodosGenerales.devolverValorDadoNombre(listaComponentesTitular, "TLO_FECHA_ESCRITURA")));
                    titulo.setFechaInscripcion(MetodosGenerales.devolverValorDadoNombre(listaComponentesTitular, "TLO_FECHA_INSCRIPCION").equals("") ? MetodosGenerales.convertirXMLGregorianCalendar("1900-01-01") : MetodosGenerales.convertirXMLGregorianCalendar(MetodosGenerales.devolverValorDadoNombre(listaComponentesTitular, "TLO_FECHA_INSCRIPCION")));
                    titulo.setNotaria(fact.createTituloNotaria(MetodosGenerales.devolverValorDadoNombre(listaComponentesTitular, "TLO_NOTARIA")));
                    titulo.setNumeroInscripcion(MetodosGenerales.devolverValorDadoNombre(datosXML.getListaComponentes(), "TLO_NUM_INSCRIPCION").equals("") ? null : Integer.valueOf(MetodosGenerales.devolverValorDadoNombre(listaComponentesTitular, "TLO_NUM_INSCRIPCION")));
                    String porciento = MetodosGenerales.devolverValorDadoNombre(listaComponentesTitular, "TLO_PORC_PARTICIPACION").replace(",", ".");
                    Double valor = porciento.equals("") ? null : Double.valueOf(porciento);
                    titulo.setPorcentajeParticipacion(porciento.equals("") ? null : valor);
                    titulo.setProtocolo(fact.createTituloProtocolo(MetodosGenerales.devolverValorDadoNombre(listaComponentesTitular, "TLO_PROTOCOLO")));
                    titulo.setTipoParticipacion(ConfigurationTTipoParticipacion.fromValue(MetodosGenerales.devolverValorDadoNombre(listaComponentesTitular, "TLO_TIPO_PARTICIPACION")));
                    titulo.setTipoTituloPropiedad(ConfigurationTTipoTitulosPropiedad.fromValue(MetodosGenerales.devolverValorDadoNombre(listaComponentesTitular, "TLO_TIPO_TITULO")));
                    titulo.setTipoPropiedad(ConfigurationTTipoPropiedad.fromValue(MetodosGenerales.devolverValorDadoNombre(listaComponentesTitular, "TLO_TIPO_PROPIEDAD")));
                    arrayOfTitular.getFincaTitular().get(indice).getTitular().getValue().getTitulos().getValue().getTitulo().add(titulo);
                }
            }
            fincaTasacion.setTitulares(fact.createFincaTasacionTitulares(arrayOfTitular));
            arrayOfFincaTasacion.getFincaTasacion().add(fincaTasacion);
        }
        tasacion.setFincas(fact.createTasacionFincas(arrayOfFincaTasacion));

        //Solicitante
        /*
        Persona persona = new Persona();
        persona.setNombre(fact.createPersonaNombre(MetodosGenerales.devolverValorDadoNombre(datosXML.getListaComponentes(), "NOMBRE_SOLICITANTE")));
        persona.setApellido1(fact.createPersonaApellido1(MetodosGenerales.devolverValorDadoNombre(datosXML.getListaComponentes(), "APELLIDO1_SOLICITANTE")));
        persona.setApellido2(fact.createPersonaApellido2(MetodosGenerales.devolverValorDadoNombre(datosXML.getListaComponentes(), "APELLIDO2_SOLICITANTE")));
        
        

        //Identificación del solicitante
        Identificacion identificacion = new Identificacion();
        identificacion.setNumeroIdentificacion(fact.createIdentificacionNumeroIdentificacion(MetodosGenerales.devolverValorDadoNombre(datosXML.getListaComponentes(), "NUMERO_IDENTIFICACION")));
        identificacion.setTipoIdentificacion(PersonModelIdentifierType.fromValue(MetodosGenerales.devolverValorDadoNombre(datosXML.getListaComponentes(), "TIPO_IDENTIFICACION")));
        persona.setIdentificacion(fact.createPersonaIdentificacion(identificacion));
        */
        return tasacion;
    }

    /**
     * @param tipoDocumento
     */
    public static void descargarDocumentosWindows(ConfigurationTTipoDocumento tipoDocumento) {
        try {
            ArrayOfDatosEnvio arrayOfDatosEnvio = getPendingDocuments(tipoDocumento);
            int indice = 1;
            String directorio = "";
            if (null != tipoDocumento) switch (tipoDocumento) {
                case IRPF:
                    directorio = "C:\\Temp\\Documentos\\IRPF\\";
                    break;
                case VIDA_LABORAL:
                    directorio = "C:\\Temp\\Documentos\\Vida Laboral\\";
                    break;
                case NOTA_SIMPLE:
                    directorio = "C:\\Temp\\Documentos\\Nota Simple\\";
                    break;
                case NOMINA:
                    directorio = "C:\\Temp\\Documentos\\Nomina\\";
                    break;
                case RECIBO:
                    directorio = "C:\\Temp\\Documentos\\Recibo\\";
                    break;
                case TASACION:
                    directorio = "C:\\Temp\\Documentos\\Tasacion\\";
                    break;
                default:
                    break;
            }

            for (DatosEnvio datosEnvio : arrayOfDatosEnvio.getDatosEnvio()) {
                JAXBElement<ArrayOfDocumento> listaDocumentos = datosEnvio.getDocumentos();
                List<Documento> documentos = listaDocumentos.getValue().getDocumento();
                for (Documento documento : documentos) {
                    JAXBElement<byte[]> listaBytes = documento.getContent();
                    //String nombreDocumento = documento.getFileName().getValue();
                    //System.out.println(nombreDocumento);
                    //OutputStream out = new FileOutputStream("C:\\Temp\\Documentos\\" + nombreDocumento.concat(documento.getMimeType().getValue()));

                    //OutputStream out = new FileOutputStream(directorio + String.valueOf(indice).concat(".").concat(documento.getMimeType().getValue()));
                    OutputStream out = new FileOutputStream(directorio + documento.getFileName().getValue());
                    out.write(listaBytes.getValue());
                    out.close();
                    indice++;
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * @param channelSftp
     * @param nombreArchivo
     * @return
     */
    private static Boolean existeArchivo(ChannelSftp channelSftp, String nombreArchivo) {
        String destino =  direccion.concat("/Enviados/").concat("trazas_descargados_GrupoBCWS.dat");
        String fuente = "/home/BPO/Historico/".concat("trazas_descargados_GrupoBCWS.dat");
        try {
            channelSftp.get(fuente, destino);
        } catch (SftpException ex) {
            Logger.getLogger(TimerTaskSchedule.class.getName()).log(Level.SEVERE, null, ex);
        }
        File archivoTrazas = new File(destino);
        Scanner scanner = null;
        String datosDocumento[];
        try {
            scanner = new Scanner(archivoTrazas);
            while (scanner.hasNextLine()) {
                try {
                    datosDocumento = scanner.nextLine().split("\t\t");
                    if (datosDocumento[0].equals(nombreArchivo)) {
                        archivoTrazas.delete();
                        return true;
                    }
                } catch (Exception ex) {
                }
            }
        } catch (FileNotFoundException ex) {
        }
        archivoTrazas.delete();
        return false;
    }

    /**
     * @param channelSftpTech
     * @param tipoDocumento
     * @return
     */
    public static Integer descargarDocumentos(ChannelSftp channelSftpTech, ConfigurationTTipoDocumento tipoDocumento) {
        ArrayOfDatosEnvio arrayOfDatosEnvio = null;
        try {
            arrayOfDatosEnvio = getPendingDocuments(tipoDocumento);
            System.out.println(tipoDocumento);
            System.out.println(arrayOfDatosEnvio.getDatosEnvio());
            String directorio = "";
            if (null != tipoDocumento) switch (tipoDocumento) {
                case IRPF:
                    directorio = "/home/BPO/EnviadosWS/IRPF/";
                    break;
                case VIDA_LABORAL:
                    directorio = "/home/BPO/EnviadosWS/Vida Laboral/";
                    break;
                case NOTA_SIMPLE:
                    directorio = "/home/BPO/EnviadosWS/Nota Simple/";
                    break;
                case NOMINA:
                    directorio = "/home/BPO/EnviadosWS/Nomina/";
                    //directorio = "";
                    break;
                case RECIBO:
                    directorio = "/home/BPO/EnviadosWS/Recibo/";
                    break;
                case TASACION:
                    directorio = "/home/BPO/EnviadosWS/Tasacion/";
                    break;
                case NOTA_SIMPLE_NODULOS:
                    directorio = "/home/BPO/EnviadosWS/NotaSimpleOCR/";
                    break;
                default:
                    break;
            }
            for (DatosEnvio datosEnvio : arrayOfDatosEnvio.getDatosEnvio()) {
                JAXBElement<ArrayOfDocumento> listaDocumentos = datosEnvio.getDocumentos();
                List<Documento> documentos = listaDocumentos.getValue().getDocumento();
                for (Documento documento : documentos) {
                    //if(!existeArchivo(channelSftpTech, documento.getFileName().getValue())){
                    System.out.println(documento.getFileName().getValue());
                    JAXBElement<byte[]> listaBytes = documento.getContent();
                    String nombreDocumento = documento.getFileName().getValue();
                    String nombreYExt[] = nombreDocumento.split("\\.");
                    if (nombreYExt.length == 1)
                        nombreDocumento = nombreYExt[0].concat("___").concat(String.valueOf(datosEnvio.getIDSolicitud().getValue())).concat(".").concat("pdf");
                    else
                        nombreDocumento = nombreYExt[0].concat("___").concat(String.valueOf(datosEnvio.getIDSolicitud().getValue())).concat(".").concat(nombreYExt[1]);

                    OutputStream out;
                    if ((null != tipoDocumento) && (tipoDocumento == ConfigurationTTipoDocumento.NOTA_SIMPLE_NODULOS)) {
                        out = new FileOutputStream( direccion.concat("/Enviados/") + nombreDocumento);
                        out.write(listaBytes.getValue());
                        out.close();
                        channelSftpTech.put( direccion.concat("/Enviados/") + nombreDocumento, directorio + nombreDocumento);
                    } else {
                        out = new FileOutputStream( direccion.concat("/Enviados/") + nombreDocumento);
                        out.write(listaBytes.getValue());
                        out.close();
                        channelSftpTech.put(direccion.concat("/Enviados/") + nombreDocumento, directorio + nombreDocumento);
                    }
                    try {
                        if ((null != tipoDocumento) && (tipoDocumento != ConfigurationTTipoDocumento.NOTA_SIMPLE_NODULOS)) {
                            String[] cmd = {"rm",direccion.concat("/Enviados/") + nombreDocumento};
                            Runtime.getRuntime().exec(cmd);
                        }
                    } catch (IOException ioe) {
                        System.out.println(ioe);
                    }
                    //generarTrazaBD(conexion, directorio.getFilename(), archivo.getFilename(), "Descargado de GrupoBC");
                    if (nombreYExt.length == 1)
                        TimerTaskSchedule.generarTraza(channelSftpTech, directorio, documento.getFileName().getValue().concat(".").concat("pdf"), "Descargado de GrupoBC", String.valueOf(datosEnvio.getIDSolicitud().getValue()), "Descargados");
                    else
                        TimerTaskSchedule.generarTraza(channelSftpTech, directorio, documento.getFileName().getValue(), "Descargado de GrupoBC", String.valueOf(datosEnvio.getIDSolicitud().getValue()), "Descargados");
                    //}
                }
            }
        } catch (IOException e) {
            if (e.getMessage() != null)
                enviarCorreoNotificacionError(e.getMessage() + "--- ERROR DE ENTRADA SALIDA --- TIPO DE DOCUMENTO:" + tipoDocumento);
        } catch (SftpException ex) {
            if (ex.getMessage() != null)
                enviarCorreoNotificacionError(ex.getMessage() + "--- ERROR CONEXION FTP --- TIPO DE DOCUMENTO:" + tipoDocumento);
        } catch (Exception eWS) {
            if (eWS.getMessage() != null)
                enviarCorreoNotificacionError(eWS.getMessage() + "--- ERROR SERVICIO WEB --- TIPO DE DOCUMENTO:" + tipoDocumento);
        }

        if (arrayOfDatosEnvio != null)
            return arrayOfDatosEnvio.getDatosEnvio().size();
        else
            return -1;
    }

    //public static Boolean descargarDocumentos(ChannelSftp channelSftpTech){
    public static DocumentosDescargados descargarDocumentos(ChannelSftp channelSftpTech) {

        //Prueba descargar Notas
        /*
        Integer descargdaNotasNodulos = 0;
        Integer descargdaNotas = MetodosGenerales.descargarDocumentos(channelSftpTech, ConfigurationTTipoDocumento.NOTA_SIMPLE);
        Integer descargdaIRPF = 0;
        Integer descargdaNomina = 0;
        Integer descargdaRecibo = 0;
        Integer descargdaTasacion = 0;
        Integer descargdaVidaLaboral = 0;
        DocumentosDescargados documentosDescargados = new DocumentosDescargados(descargdaNotas, 
                                                descargdaNotas, 0, 0, 0, 0, 0, 0);
        */

        //CODIGO ORIGINAL

        Integer descargdaIRPF = MetodosGenerales.descargarDocumentos(channelSftpTech, ConfigurationTTipoDocumento.IRPF);
        Integer descargdaNomina = MetodosGenerales.descargarDocumentos(channelSftpTech, ConfigurationTTipoDocumento.NOMINA);
        Integer descargdaTasacion = MetodosGenerales.descargarDocumentos(channelSftpTech, ConfigurationTTipoDocumento.TASACION);
        Integer descargdaVidaLaboral = MetodosGenerales.descargarDocumentos(channelSftpTech, ConfigurationTTipoDocumento.VIDA_LABORAL);
        Integer descargdaNotasNodulos = MetodosGenerales.descargarDocumentos(channelSftpTech, ConfigurationTTipoDocumento.NOTA_SIMPLE_NODULOS);
        Integer descargdaRecibo = MetodosGenerales.descargarDocumentos(channelSftpTech, ConfigurationTTipoDocumento.RECIBO);
        Integer descargdaNotas = MetodosGenerales.descargarDocumentos(channelSftpTech, ConfigurationTTipoDocumento.NOTA_SIMPLE);

        DocumentosDescargados documentosDescargados = new DocumentosDescargados(descargdaNotas + descargdaIRPF + descargdaNomina + descargdaRecibo + descargdaTasacion + descargdaVidaLaboral + descargdaNotasNodulos,
                descargdaNotas, descargdaIRPF, descargdaNomina, descargdaRecibo, descargdaTasacion, descargdaVidaLaboral, descargdaNotasNodulos);

        return documentosDescargados;
    }

    /*private static ArrayOfDatosEnvio getPendingDocuments(servicios.ConfigurationTTipoDocumento tipoDocumento) {
        servicios.OcrReceiver service = new servicios.OcrReceiver();
        servicios.IOcrReceiver port = service.getBasicHttpBindingIOcrReceiver();
        return port.getPendingDocuments(tipoDocumento);
    }*/


    public static ResultadoSubida subirDocumentos(ChannelSftp channelSftpTech) {
        NotificacionErrorAlCargarDocumento notificacionIRPF = subirIRPF(channelSftpTech);
        NotificacionErrorAlCargarDocumento notificacionVidaLaboral = subirVidaLaboral(channelSftpTech);
        NotificacionErrorAlCargarDocumento notificacionNomina = subirNomina(channelSftpTech);
        NotificacionErrorAlCargarDocumento notificacionNotaSimpleOCR = subirNotaSimpleOCR(channelSftpTech);
        NotificacionErrorAlCargarDocumento notificacionNotaSimple = subirNotaSimple(channelSftpTech);
        NotificacionErrorAlCargarDocumento notificacionRecibo = subirRecibo(channelSftpTech);
        NotificacionErrorAlCargarDocumento notificacionKO = subirDocumentoKO(channelSftpTech);
        NotificacionErrorAlCargarDocumento notificacionTasacion = subirTasacion(channelSftpTech);
        
        /*
        if (notificacionTasacion.getExisteError()){
            System.out.println(notificacionTasacion.getDescripcionExcepcion());
            enviarCorreoNotificacionError(notificacionTasacion.getDescripcionExcepcion());
        }else if (notificacionKO.getExisteError()){
            System.out.println(notificacionKO.getDescripcionExcepcion());
            enviarCorreoNotificacionError(notificacionKO.getDescripcionExcepcion());
        }
        */


        if (notificacionIRPF.getExisteError()) {
            System.out.println(notificacionIRPF.getDescripcionExcepcion());
            enviarCorreoNotificacionError(notificacionIRPF.getDescripcionExcepcion());
        } else if (notificacionVidaLaboral.getExisteError()) {
            System.out.println(notificacionVidaLaboral.getDescripcionExcepcion());
            enviarCorreoNotificacionError(notificacionVidaLaboral.getDescripcionExcepcion());
        } else if (notificacionNomina.getExisteError()) {
            System.out.println(notificacionNomina.getDescripcionExcepcion());
            enviarCorreoNotificacionError(notificacionNomina.getDescripcionExcepcion());
        } else if (notificacionKO.getExisteError()) {
            System.out.println(notificacionKO.getDescripcionExcepcion());
            enviarCorreoNotificacionError(notificacionKO.getDescripcionExcepcion());
        } else if (notificacionNotaSimpleOCR.getExisteError()) {
            System.out.println(notificacionNotaSimpleOCR.getDescripcionExcepcion());
            enviarCorreoNotificacionError(notificacionNotaSimpleOCR.getDescripcionExcepcion());
        } else if (notificacionNotaSimple.getExisteError()) {
            System.out.println(notificacionNotaSimple.getDescripcionExcepcion());
            enviarCorreoNotificacionError(notificacionNotaSimple.getDescripcionExcepcion());
        } else if (notificacionTasacion.getExisteError()) {
            System.out.println(notificacionTasacion.getDescripcionExcepcion());
            enviarCorreoNotificacionError(notificacionTasacion.getDescripcionExcepcion());
        }


        DocumentosSubidos documentosSubidos = new DocumentosSubidos(notificacionNotaSimple.getCantidadDocumentos(),
                notificacionIRPF.getCantidadDocumentos(),
                notificacionNomina.getCantidadDocumentos(),
                notificacionRecibo.getCantidadDocumentos(),
                notificacionTasacion.getCantidadDocumentos(),
                notificacionVidaLaboral.getCantidadDocumentos(),
                notificacionKO.getCantidadDocumentos(),
                notificacionNotaSimpleOCR.getCantidadDocumentos());


        //Solo un tipo de documento
        /*
        DocumentosSubidos documentosSubidos = new DocumentosSubidos(0, 
                                            0, 
                                            0,  
                                            0, 
                                            notificacionTasacion.getCantidadDocumentos(), 
                                            0,
                                            notificacionKO.getCantidadDocumentos(),
                                            0);
        
        */
        return new ResultadoSubida(documentosSubidos, notificacionNotaSimple.getResultadoSubida() || notificacionVidaLaboral.getResultadoSubida() || notificacionNomina.getResultadoSubida() || notificacionIRPF.getResultadoSubida() || notificacionKO.getResultadoSubida() || notificacionNotaSimpleOCR.getResultadoSubida() || notificacionRecibo.getResultadoSubida() || notificacionTasacion.getResultadoSubida());
        //return new ResultadoSubida(documentosSubidos, notificacionTasacion.getResultadoSubida() || notificacionKO.getResultadoSubida());
    }

    /**
     * @param channelSftpTech
     */
    public static void subirNotasSimples(ChannelSftp channelSftpTech) {
        try {
            String rutaProcesadosTechFTP = "/home/BPO/Procesados/Nota Simple/";
            Vector listaArchivosProcesados;
            listaArchivosProcesados = channelSftpTech.ls(rutaProcesadosTechFTP);
            ArrayOfNotaSimple arrayOfNotaSimple = new ArrayOfNotaSimple();
            ObjectFactory fact = new ObjectFactory();
            if (listaArchivosProcesados.size() > 2) {
                for (int i = 0; i < listaArchivosProcesados.size(); i++) {
                    ChannelSftp.LsEntry archivo = (ChannelSftp.LsEntry) listaArchivosProcesados.elementAt(i);
                    if (!archivo.getFilename().equals(".") && !archivo.getFilename().equals("..") && !esDirectorio(archivo.getFilename())) {
                        DatosXML datosXML = MetodosGenerales.leerXML(rutaProcesadosTechFTP.concat(archivo.getFilename()));
                        NotaSimple notaSimple = MetodosGenerales.devolverNotaSimple(channelSftpTech, datosXML);
                        arrayOfNotaSimple.getNotaSimple().add(notaSimple);
                        
                        /*ArrayOfOCRWSResult arrayOfResult =  receiveNotasSimples(arrayOfNotaSimple);
                        List<OCRWSResult> lista = arrayOfResult.getOCRWSResult();
                        for (OCRWSResult result : lista) {
                            System.out.println(result.getDescripcionResultado().getValue());    
                        }*/

                        TimerTaskSchedule.generarTraza(channelSftpTech, "NotaSimple", archivo.getFilename(), "Subido al Grupo BC", String.valueOf(notaSimple.getIdSolicitudOCR()), "Subidos");
                        channelSftpTech.put(rutaProcesadosTechFTP.concat(archivo.getFilename()), "/home/BPO/SubidosWS/Nota Simple/".concat(archivo.getFilename()));
                        channelSftpTech.rm(rutaProcesadosTechFTP.concat(archivo.getFilename()));


                    }
                }
            }

            if (arrayOfNotaSimple.getNotaSimple().size() > 0) {
                ArrayOfOCRWSResult arrayOfResult = receiveNotasSimples(arrayOfNotaSimple);
                List<OCRWSResult> lista = arrayOfResult.getOCRWSResult();
                for (OCRWSResult result : lista) {
                    System.out.println(result.getDescripcionResultado().getValue());
                }
            }
        } catch (SftpException ex) {
            Logger.getLogger(MetodosGenerales.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private static Boolean esDirectorio(String elemento) {
        String partes[] = elemento.split("\\.");
        if (partes.length == 1)
            return true;
        return false;
    }

    /**
     * @param channelSftpTech
     * @return
     */
    public static NotificacionErrorAlCargarDocumento subirIRPF(ChannelSftp channelSftpTech) {
        NotificacionErrorAlCargarDocumento notificacion = new NotificacionErrorAlCargarDocumento();
        notificacion.setResultadoSubida(false);
        notificacion.setExisteError(false);
        try {
            String rutaProcesadosTechFTP = "/home/BPO/Procesados/IRPF/";
            Vector listaArchivosProcesados;
            listaArchivosProcesados = channelSftpTech.ls(rutaProcesadosTechFTP);
            List<String> listaNombreArchivos = new ArrayList<>();
            ArrayOfIRPF arrayOfIRPF = new ArrayOfIRPF();
            if(listaArchivosProcesados!=null)
            {
                if (listaArchivosProcesados.size() > 2) {
                for (int i = 0; i < listaArchivosProcesados.size(); i++) {
                    ChannelSftp.LsEntry archivo = (ChannelSftp.LsEntry) listaArchivosProcesados.elementAt(i);
                    if (!archivo.getFilename().equals(".") && !archivo.getFilename().equals("..") && !esDirectorio(archivo.getFilename())) {
                        System.out.println(archivo.getFilename());
                        listaNombreArchivos.add(archivo.getFilename());
                        DatosXML datosXML = MetodosGenerales.leerXMLIRPF(rutaProcesadosTechFTP.concat(archivo.getFilename()));
                        try {
                            IRPF iRPF = MetodosGenerales.devolverIRPF(channelSftpTech, datosXML);
                            arrayOfIRPF.getIRPF().add(iRPF);
                        } catch (Exception ex) {
                            if (ex.getMessage() != null) {
                                String nombreDocumento = MetodosGenerales.devolverValorDadoNombre(datosXML.getListaComponentes(), "NOMBRE_DOCUMENTO");
                                String listaParaExt[] = nombreDocumento.split("_{3}");
                                if (listaParaExt.length == 2)
                                    notificacion.setDescripcionExcepcion("Error en el documento IRPF con ID=" + listaParaExt[1].split("\\.")[0] + " Descripción:" + ex.getMessage());
                                else
                                    notificacion.setDescripcionExcepcion("Error en el nombre del IRPF:" + nombreDocumento);
                                notificacion.setExisteError(true);
                                return notificacion;
                            }
                        }

                    }
                }
            }
            }
            
            if (arrayOfIRPF!=null && arrayOfIRPF.getIRPF().size() > 0) {
                try {
                    ArrayOfOCRWSResult arrayOfResult = receiveIRPFs(arrayOfIRPF);
                    List<OCRWSResult> lista = arrayOfResult.getOCRWSResult();
                    int indice = 0;
                    notificacion.setCantidadDocumentos(lista.size());
                    for (OCRWSResult result : lista) {
                        System.out.println(result.getDescripcionResultado().getValue());
                        if (result.getDescripcionResultado().getValue().equals("Grabación correcta")) {
                            IRPF iRPF = arrayOfIRPF.getIRPF().get(indice);
                            TimerTaskSchedule.generarTraza(channelSftpTech, "IRPF", listaNombreArchivos.get(indice), "Subido al Grupo BC", String.valueOf(iRPF.getIdSolicitudOCR()), "Subidos");
                            channelSftpTech.put(rutaProcesadosTechFTP.concat(listaNombreArchivos.get(indice)), "/home/BPO/SubidosWS/IRPF/".concat(listaNombreArchivos.get(indice)));
                            channelSftpTech.rm(rutaProcesadosTechFTP.concat(listaNombreArchivos.get(indice)));
                            notificacion.setResultadoSubida(true);
                        } else if (result.getDescripcionResultado().getValue().equals("Error, la solicitud no se encuentra en estado pendiente de recepción")) {
                            IRPF iRPF = arrayOfIRPF.getIRPF().get(indice);
                            TimerTaskSchedule.generarTraza(channelSftpTech, "IRPF", listaNombreArchivos.get(indice), "Subido al Grupo BC:No está pendiente de solicitud", String.valueOf(iRPF.getIdSolicitudOCR()), "Subidos");
                            channelSftpTech.put(rutaProcesadosTechFTP.concat(listaNombreArchivos.get(indice)), "/home/BPO/SubidosWS/IRPF/".concat(listaNombreArchivos.get(indice)));
                            channelSftpTech.rm(rutaProcesadosTechFTP.concat(listaNombreArchivos.get(indice)));
                            notificacion.setResultadoSubida(true);
                        }
                        indice++;
                    }
                } catch (Exception ex) {
                    notificacion.setDescripcionExcepcion("Error al ejecutar el método receiveIRPFs: " + ex.getMessage());
                    notificacion.setExisteError(true);
                    return notificacion;
                }
            }


        } catch (SftpException ex) {
            System.out.println(ex.getMessage());
        }
        return notificacion;
    }

    /**
     * @param channelSftpTech
     * @return
     */
    public static NotificacionErrorAlCargarDocumento subirNomina(ChannelSftp channelSftpTech) {
        NotificacionErrorAlCargarDocumento notificacion = new NotificacionErrorAlCargarDocumento();
        notificacion.setResultadoSubida(false);
        notificacion.setExisteError(false);
        try {
            String rutaProcesadosTechFTP = "/home/BPO/Procesados/Nomina/";
            Vector listaArchivosProcesados;
            listaArchivosProcesados = channelSftpTech.ls(rutaProcesadosTechFTP);
            ArrayOfNomina arrayOfNomina = new ArrayOfNomina();
            List<String> listaNombreArchivos = new ArrayList<>();

            if (listaArchivosProcesados.size() > 2) {
                for (int i = 0; i < listaArchivosProcesados.size(); i++) {
                    ChannelSftp.LsEntry archivo = (ChannelSftp.LsEntry) listaArchivosProcesados.elementAt(i);
                    if (!archivo.getFilename().equals(".") && !archivo.getFilename().equals("..") && !esDirectorio(archivo.getFilename())) {
                        System.out.println(archivo.getFilename());
                        listaNombreArchivos.add(archivo.getFilename());
                        DatosXML datosXML = MetodosGenerales.leerXMLNomina(rutaProcesadosTechFTP.concat(archivo.getFilename()));
                        try {
                            Nomina nomina = MetodosGenerales.devolverNomina(channelSftpTech, datosXML);
                            arrayOfNomina.getNomina().add(nomina);
                        } catch (Exception ex) {
                            //if (ex.getMessage() != null){
                            String nombreDocumento = MetodosGenerales.devolverValorDadoNombre(datosXML.getListaComponentes(), "NOMBRE_DOCUMENTO");
                            String listaParaExt[] = nombreDocumento.split("_{3}");
                            if (listaParaExt.length == 2)
                                notificacion.setDescripcionExcepcion("Error en el documento Nómina con ID=" + listaParaExt[1].split("\\.")[0] + " Descripción:" + ex.getMessage());
                            else
                                notificacion.setDescripcionExcepcion("Error en el nombre de la Nómina:" + nombreDocumento);
                            notificacion.setExisteError(true);
                            return notificacion;
                            //}
                        }

                    }
                }
            }
            if (arrayOfNomina.getNomina().size() > 0) {
                try {
                    ArrayOfOCRWSResult arrayOfResult = receiveNominas(arrayOfNomina);
                    List<OCRWSResult> lista = arrayOfResult.getOCRWSResult();
                    int indice = 0;
                    notificacion.setCantidadDocumentos(lista.size());
                    for (OCRWSResult result : lista) {
                        System.out.println(result.getDescripcionResultado().getValue());
                        if (result.getDescripcionResultado().getValue().equals("Grabación correcta")) {
                            Nomina nomina = arrayOfNomina.getNomina().get(indice);
                            TimerTaskSchedule.generarTraza(channelSftpTech, "Nomina", listaNombreArchivos.get(indice), "Subido al Grupo BC", String.valueOf(nomina.getIdSolicitudOCR()), "Subidos");
                            channelSftpTech.put(rutaProcesadosTechFTP.concat(listaNombreArchivos.get(indice)), "/home/BPO/SubidosWS/Nomina/".concat(listaNombreArchivos.get(indice)));
                            channelSftpTech.rm(rutaProcesadosTechFTP.concat(listaNombreArchivos.get(indice)));
                            notificacion.setResultadoSubida(true);
                        } else if (result.getDescripcionResultado().getValue().equals("Error, la solicitud no se encuentra en estado pendiente de recepción")) {
                            Nomina nomina = arrayOfNomina.getNomina().get(indice);
                            TimerTaskSchedule.generarTraza(channelSftpTech, "Nomina", listaNombreArchivos.get(indice), "Subido al Grupo BC:No está pendiente de solicitud", String.valueOf(nomina.getIdSolicitudOCR()), "Subidos");
                            channelSftpTech.put(rutaProcesadosTechFTP.concat(listaNombreArchivos.get(indice)), "/home/BPO/SubidosWS/Nomina/".concat(listaNombreArchivos.get(indice)));
                            channelSftpTech.rm(rutaProcesadosTechFTP.concat(listaNombreArchivos.get(indice)));
                            notificacion.setResultadoSubida(true);
                        }
                        indice++;
                    }
                } catch (Exception ex) {
                    notificacion.setDescripcionExcepcion("Error al ejecutar el método receiveNominas: " + ex.getMessage());
                    notificacion.setExisteError(true);
                    return notificacion;
                }
            }
        } catch (SftpException ex) {
            System.out.println(ex.getMessage());
        }
        return notificacion;
    }

    /**
     * @param channelSftpTech
     * @return
     */
    public static NotificacionErrorAlCargarDocumento subirVidaLaboral(ChannelSftp channelSftpTech) {
        NotificacionErrorAlCargarDocumento notificacion = new NotificacionErrorAlCargarDocumento();
        notificacion.setResultadoSubida(false);
        notificacion.setExisteError(false);
        try {
            String rutaProcesadosTechFTP = "/home/BPO/Procesados/Vida Laboral/";
            Vector listaArchivosProcesados;
            listaArchivosProcesados = channelSftpTech.ls(rutaProcesadosTechFTP);
            ArrayOfVidaLaboral arrayOfVidaLaboral = new ArrayOfVidaLaboral();
            List<String> listaNombreArchivos = new ArrayList<>();
            if (listaArchivosProcesados.size() > 2) {
                for (int i = 0; i < listaArchivosProcesados.size(); i++) {
                    ChannelSftp.LsEntry archivo = (ChannelSftp.LsEntry) listaArchivosProcesados.elementAt(i);
                    if (!archivo.getFilename().equals(".") && !archivo.getFilename().equals("..") && !esDirectorio(archivo.getFilename())) {
                        System.out.println(archivo.getFilename());
                        listaNombreArchivos.add(archivo.getFilename());
                        DatosXML datosXML = MetodosGenerales.leerXMLVidaLaboral(rutaProcesadosTechFTP.concat(archivo.getFilename()));
                        try {
                            VidaLaboral vidaLaboral = MetodosGenerales.devolverVidaLaboral(channelSftpTech, datosXML);
                            arrayOfVidaLaboral.getVidaLaboral().add(vidaLaboral);
                        } catch (Exception ex) {
                            if (ex.getMessage() != null) {
                                String nombreDocumento = MetodosGenerales.devolverValorDadoNombre(datosXML.getListaComponentes(), "NOMBRE_DOCUMENTO");
                                String listaParaExt[] = nombreDocumento.split("_{3}");
                                if (listaParaExt.length == 2)
                                    notificacion.setDescripcionExcepcion("Error en el documento Vida Laboral con ID=" + listaParaExt[1].split("\\.")[0] + " Descripción:" + ex.getMessage());
                                else
                                    notificacion.setDescripcionExcepcion("Error en el nombre de la Vida Laboral:" + nombreDocumento);
                                notificacion.setExisteError(true);
                                return notificacion;
                            }
                        }

                    }
                }
            }
            if (arrayOfVidaLaboral.getVidaLaboral().size() > 0) {
                try {
                    ArrayOfOCRWSResult arrayOfResult = receiveVidasLaborales(arrayOfVidaLaboral);
                    List<OCRWSResult> lista = arrayOfResult.getOCRWSResult();
                    int indice = 0;
                    notificacion.setCantidadDocumentos(lista.size());
                    for (OCRWSResult result : lista) {
                        System.out.println(result.getDescripcionResultado().getValue());
                        if ((result.getDescripcionResultado().getValue().equals("Grabación correcta"))) {
                            VidaLaboral vidaLaboral = arrayOfVidaLaboral.getVidaLaboral().get(indice);
                            TimerTaskSchedule.generarTraza(channelSftpTech, "Vida Laboral", listaNombreArchivos.get(indice), "Subido al Grupo BC", String.valueOf(vidaLaboral.getIdSolicitudOCR()), "Subidos");
                            channelSftpTech.put(rutaProcesadosTechFTP.concat(listaNombreArchivos.get(indice)), "/home/BPO/SubidosWS/Vida Laboral/".concat(listaNombreArchivos.get(indice)));
                            channelSftpTech.rm(rutaProcesadosTechFTP.concat(listaNombreArchivos.get(indice)));
                            notificacion.setResultadoSubida(true);
                        } else if ((result.getDescripcionResultado().getValue().equals("Error, la solicitud no se encuentra en estado pendiente de recepción"))) {
                            VidaLaboral vidaLaboral = arrayOfVidaLaboral.getVidaLaboral().get(indice);
                            TimerTaskSchedule.generarTraza(channelSftpTech, "Vida Laboral", listaNombreArchivos.get(indice), "Subido al Grupo BC:No está pendiente de solicitud", String.valueOf(vidaLaboral.getIdSolicitudOCR()), "Subidos");
                            channelSftpTech.put(rutaProcesadosTechFTP.concat(listaNombreArchivos.get(indice)), "/home/BPO/SubidosWS/Vida Laboral/".concat(listaNombreArchivos.get(indice)));
                            channelSftpTech.rm(rutaProcesadosTechFTP.concat(listaNombreArchivos.get(indice)));
                            notificacion.setResultadoSubida(true);
                        }
                        indice++;
                    }
                } catch (Exception ex) {
                    notificacion.setDescripcionExcepcion("Error al ejecutar el método receiveVidasLaborales: " + ex.getMessage());
                    notificacion.setExisteError(true);
                    return notificacion;
                }
            }
        } catch (SftpException ex) {
            System.out.println(ex.getMessage());
        }
        return notificacion;
    }

    /**
     * @param channelSftpTech
     * @return
     */
    public static NotificacionErrorAlCargarDocumento subirDocumentoKO(ChannelSftp channelSftpTech) {
        NotificacionErrorAlCargarDocumento notificacion = new NotificacionErrorAlCargarDocumento();
        notificacion.setResultadoSubida(false);
        notificacion.setExisteError(false);
        try {
            String rutaProcesadosTechFTP = "/home/BPO/Procesados/DocumentosKO/";
            Vector listaArchivosProcesados;
            listaArchivosProcesados = channelSftpTech.ls(rutaProcesadosTechFTP);
            ArrayOfKODocument arrayOfKODocument = new ArrayOfKODocument();
            List<String> listaNombreArchivos = new ArrayList<>();
            if (listaArchivosProcesados.size() > 2) {
                for (int i = 0; i < listaArchivosProcesados.size(); i++) {
                    ChannelSftp.LsEntry archivo = (ChannelSftp.LsEntry) listaArchivosProcesados.elementAt(i);
                    if (!archivo.getFilename().equals(".") && !archivo.getFilename().equals("..") && !esDirectorio(archivo.getFilename())) {
                        System.out.println(archivo.getFilename());
                        listaNombreArchivos.add(archivo.getFilename());
                        DatosXML datosXML = MetodosGenerales.leerXMLDocumentoKO(rutaProcesadosTechFTP.concat(archivo.getFilename()));
                        try {
                            KODocument kODocument = MetodosGenerales.devolverDocumentoKO(channelSftpTech, datosXML);
                            arrayOfKODocument.getKODocument().add(kODocument);
                        } catch (Exception ex) {
                            if (ex.getMessage() != null) {
                                String nombreDocumento = MetodosGenerales.devolverValorDadoNombre(datosXML.getListaComponentes(), "NOMBRE_DOCUMENTO");
                                String listaParaExt[] = nombreDocumento.split("_{3}");
                                if (listaParaExt.length == 2)
                                    notificacion.setDescripcionExcepcion("Error en el documento KO con ID=" + listaParaExt[1].split("\\.")[0] + " Descripción:" + ex.getMessage());
                                else
                                    notificacion.setDescripcionExcepcion("Error en el nombre del documento KO:" + nombreDocumento);
                                notificacion.setExisteError(true);
                                return notificacion;
                            }
                        }
                    }
                }
            }
            if (arrayOfKODocument.getKODocument().size() > 0) {
                try {
                    ArrayOfOCRWSResult arrayOfResult = receiveKODocuments(arrayOfKODocument);
                    List<OCRWSResult> lista = arrayOfResult.getOCRWSResult();
                    int indice = 0;
                    notificacion.setCantidadDocumentos(lista.size());
                    for (OCRWSResult result : lista) {
                        System.out.println(result.getDescripcionResultado().getValue());
                        if (result.getDescripcionResultado().getValue().equals("Grabación correcta")) {
                            KODocument kODocument = arrayOfKODocument.getKODocument().get(indice);
                            TimerTaskSchedule.generarTraza(channelSftpTech, "Documento KO", listaNombreArchivos.get(indice), "Subido al Grupo BC", String.valueOf(kODocument.getIdSolicitudOcr()), "Subidos");
                            channelSftpTech.put(rutaProcesadosTechFTP.concat(listaNombreArchivos.get(indice)), "/home/BPO/SubidosWS/DocumentosKO/".concat(listaNombreArchivos.get(indice)));
                            channelSftpTech.rm(rutaProcesadosTechFTP.concat(listaNombreArchivos.get(indice)));
                            notificacion.setResultadoSubida(true);
                        } else if ((result.getDescripcionResultado().getValue().equals("Error, la solicitud no se encuentra en estado pendiente de recepción"))) {
                            KODocument kODocument = arrayOfKODocument.getKODocument().get(indice);
                            TimerTaskSchedule.generarTraza(channelSftpTech, "Documento KO", listaNombreArchivos.get(indice), "Subido al Grupo BC:No está pendiente de solicitud", String.valueOf(kODocument.getIdSolicitudOcr()), "Subidos");
                            channelSftpTech.put(rutaProcesadosTechFTP.concat(listaNombreArchivos.get(indice)), "/home/BPO/SubidosWS/DocumentosKO/".concat(listaNombreArchivos.get(indice)));
                            channelSftpTech.rm(rutaProcesadosTechFTP.concat(listaNombreArchivos.get(indice)));
                            notificacion.setResultadoSubida(true);
                        }
                        indice++;
                    }
                } catch (Exception ex) {
                    notificacion.setDescripcionExcepcion("Error al ejecutar el método receiveKODocuments: " + ex.getMessage());
                    notificacion.setExisteError(true);
                    return notificacion;
                }
            }
        } catch (SftpException ex) {
            System.out.println(ex.getMessage());
        }
        return notificacion;
    }

    /**
     * @param channelSftpTech
     * @return
     */
    public static NotificacionErrorAlCargarDocumento subirNotaSimpleOCR(ChannelSftp channelSftpTech) {
        NotificacionErrorAlCargarDocumento notificacion = new NotificacionErrorAlCargarDocumento();
        notificacion.setResultadoSubida(false);
        notificacion.setExisteError(false);
        try {
            String rutaProcesadosTechFTP = "/home/BPO/Procesados/NotaSimpleOCR/";
            Vector listaArchivosProcesados;
            listaArchivosProcesados = channelSftpTech.ls(rutaProcesadosTechFTP);
            ArrayOfNotaSimpleNodulos arrayOfNotaSimpleNodulos = new ArrayOfNotaSimpleNodulos();
            List<String> listaNombreArchivos = new ArrayList<>();
            if (listaArchivosProcesados.size() > 2) {
                for (int i = 0; i < listaArchivosProcesados.size(); i++) {
                    ChannelSftp.LsEntry archivo = (ChannelSftp.LsEntry) listaArchivosProcesados.elementAt(i);
                    if (!archivo.getFilename().equals(".") && !archivo.getFilename().equals("..") && !esDirectorio(archivo.getFilename())) {
                        System.out.println(archivo.getFilename());
                        listaNombreArchivos.add(archivo.getFilename());
                        DatosXML datosXML = MetodosGenerales.leerXMLNotaSimpleOCR(rutaProcesadosTechFTP.concat(archivo.getFilename()));
                        try {
                            NotaSimpleNodulos notaSimpleNodulos = MetodosGenerales.devolverNotaSimpleOCR(channelSftpTech, datosXML);
                            arrayOfNotaSimpleNodulos.getNotaSimpleNodulos().add(notaSimpleNodulos);
                        } catch (Exception ex) {
                            if (ex.getMessage() != null) {
                                String nombreDocumento = MetodosGenerales.devolverValorDadoNombre(datosXML.getListaComponentes(), "ID_DOCUMENTO").concat(".pdf");
                                String listaParaExt[] = nombreDocumento.split("_{3}");
                                if (listaParaExt.length == 2)
                                    notificacion.setDescripcionExcepcion("Error en el documento Nota Simple OCR con ID=" + listaParaExt[1].split("\\.")[0] + " Descripción:" + ex.getMessage());
                                else
                                    notificacion.setDescripcionExcepcion("Error en el nombre de la Nota Simple OCR:" + nombreDocumento);
                                notificacion.setExisteError(true);
                                return notificacion;
                            }
                        }

                    }
                }
            }
            if (arrayOfNotaSimpleNodulos.getNotaSimpleNodulos().size() > 0) {
                try {
                    ArrayOfOCRWSResult arrayOfResult = receiveNotasSimplesNodulos(arrayOfNotaSimpleNodulos);
                    List<OCRWSResult> lista = arrayOfResult.getOCRWSResult();
                    int indice = 0;
                    notificacion.setCantidadDocumentos(lista.size());
                    for (OCRWSResult result : lista) {
                        System.out.println(result.getDescripcionResultado().getValue());
                        if ((result.getDescripcionResultado().getValue().equals("Grabación correcta"))) {
                            NotaSimpleNodulos notaSimpleNodulos = arrayOfNotaSimpleNodulos.getNotaSimpleNodulos().get(indice);
                            TimerTaskSchedule.generarTraza(channelSftpTech, "Nota Simple OCR", listaNombreArchivos.get(indice), "Subido al Grupo BC", String.valueOf(notaSimpleNodulos.getIdSolicitudOCR()), "Subidos");
                            channelSftpTech.put(rutaProcesadosTechFTP.concat(listaNombreArchivos.get(indice)), "/home/BPO/SubidosWS/NotaSimpleOCR/".concat(listaNombreArchivos.get(indice)));
                            channelSftpTech.rm(rutaProcesadosTechFTP.concat(listaNombreArchivos.get(indice)));
                            notificacion.setResultadoSubida(true);
                        } else if ((result.getDescripcionResultado().getValue().equals("Error, la solicitud no se encuentra en estado pendiente de recepción"))) {
                            NotaSimpleNodulos notaSimpleNodulos = arrayOfNotaSimpleNodulos.getNotaSimpleNodulos().get(indice);
                            TimerTaskSchedule.generarTraza(channelSftpTech, "Nota Simple OCR", listaNombreArchivos.get(indice), "Subido al Grupo BC:No está pendiente de solicitud", String.valueOf(notaSimpleNodulos.getIdSolicitudOCR()), "Subidos");
                            channelSftpTech.put(rutaProcesadosTechFTP.concat(listaNombreArchivos.get(indice)), "/home/BPO/SubidosWS/NotaSimpleOCR/".concat(listaNombreArchivos.get(indice)));
                            channelSftpTech.rm(rutaProcesadosTechFTP.concat(listaNombreArchivos.get(indice)));
                            notificacion.setResultadoSubida(true);
                        }
                        indice++;
                    }
                } catch (Exception ex) {
                    notificacion.setDescripcionExcepcion("Error al ejecutar el método receiveNotasSimplesNodulos: " + ex.getMessage());
                    notificacion.setExisteError(true);
                    return notificacion;
                }
            }
        } catch (SftpException ex) {
            System.out.println(ex.getMessage());
        }
        return notificacion;
    }

    /**
     * @param channelSftpTech
     * @return
     */
    public static NotificacionErrorAlCargarDocumento subirRecibo(ChannelSftp channelSftpTech) {
        NotificacionErrorAlCargarDocumento notificacion = new NotificacionErrorAlCargarDocumento();
        notificacion.setResultadoSubida(false);
        notificacion.setExisteError(false);
        try {
            String rutaProcesadosTechFTP = "/home/BPO/Procesados/Recibo/";
            Vector listaArchivosProcesados;
            listaArchivosProcesados = channelSftpTech.ls(rutaProcesadosTechFTP);
            ArrayOfRecibo arrayOfRecibo = new ArrayOfRecibo();
            List<String> listaNombreArchivos = new ArrayList<>();
            if (listaArchivosProcesados.size() > 2) {
                for (int i = 0; i < listaArchivosProcesados.size(); i++) {
                    ChannelSftp.LsEntry archivo = (ChannelSftp.LsEntry) listaArchivosProcesados.elementAt(i);
                    if (!archivo.getFilename().equals(".") && !archivo.getFilename().equals("..") && !esDirectorio(archivo.getFilename())) {
                        System.out.println("Archivo:" + archivo.getFilename());
                        listaNombreArchivos.add(archivo.getFilename());
                        DatosXML datosXML = MetodosGenerales.leerXMLRecibo(rutaProcesadosTechFTP.concat(archivo.getFilename()));
                        try {
                            Recibo recibo = MetodosGenerales.devolverRecibo(channelSftpTech, datosXML);
                            arrayOfRecibo.getRecibo().add(recibo);
                        } catch (Exception ex) {
                            if (ex.getMessage() != null) {
                                String nombreDocumento = MetodosGenerales.devolverValorDadoNombre(datosXML.getListaComponentes(), "NOMBRE_DOCUMENTO");
                                String listaParaExt[] = nombreDocumento.split("_{3}");
                                if (listaParaExt.length == 2)
                                    notificacion.setDescripcionExcepcion("Error en el documento Recibo con ID=" + listaParaExt[1].split("\\.")[0] + " Descripción:" + ex.getMessage());
                                else
                                    notificacion.setDescripcionExcepcion("Error en el nombre de la Recibo:" + nombreDocumento);
                                notificacion.setExisteError(true);
                                return notificacion;
                            }
                        }

                    }
                }
            }
            if (arrayOfRecibo.getRecibo().size() > 0) {
                try {
                    ArrayOfOCRWSResult arrayOfResult = receiveRecibos(arrayOfRecibo);
                    List<OCRWSResult> lista = arrayOfResult.getOCRWSResult();
                    int indice = 0;
                    notificacion.setCantidadDocumentos(lista.size());
                    for (OCRWSResult result : lista) {
                        System.out.println(result.getDescripcionResultado().getValue());
                        if ((result.getDescripcionResultado().getValue().equals("Grabación correcta"))) {
                            Recibo recibo = arrayOfRecibo.getRecibo().get(indice);
                            TimerTaskSchedule.generarTraza(channelSftpTech, "Recibo", listaNombreArchivos.get(indice), "Subido al Grupo BC", String.valueOf(recibo.getIdSolicitudOCR()), "Subidos");
                            channelSftpTech.put(rutaProcesadosTechFTP.concat(listaNombreArchivos.get(indice)), "/home/BPO/SubidosWS/Recibo/".concat(listaNombreArchivos.get(indice)));
                            channelSftpTech.rm(rutaProcesadosTechFTP.concat(listaNombreArchivos.get(indice)));
                            notificacion.setResultadoSubida(true);
                        } else if ((result.getDescripcionResultado().getValue().equals("Error, la solicitud no se encuentra en estado pendiente de recepción"))) {
                            Recibo recibo = arrayOfRecibo.getRecibo().get(indice);
                            TimerTaskSchedule.generarTraza(channelSftpTech, "Recibo", listaNombreArchivos.get(indice), "Subido al Grupo BC:No está pendiente de solicitud", String.valueOf(recibo.getIdSolicitudOCR()), "Subidos");
                            channelSftpTech.put(rutaProcesadosTechFTP.concat(listaNombreArchivos.get(indice)), "/home/BPO/SubidosWS/Recibo/".concat(listaNombreArchivos.get(indice)));
                            channelSftpTech.rm(rutaProcesadosTechFTP.concat(listaNombreArchivos.get(indice)));
                            notificacion.setResultadoSubida(true);
                        }
                        indice++;
                    }
                } catch (Exception ex) {
                    notificacion.setDescripcionExcepcion("Error al ejecutar el método receiveRecibos: " + ex.getMessage());
                    notificacion.setExisteError(true);
                    return notificacion;
                }
            }
        } catch (SftpException ex) {
            System.out.println(ex.getMessage());
        }
        return notificacion;
    }

    /**
     * @param channelSftpTech
     * @return
     */
    public static NotificacionErrorAlCargarDocumento subirTasacion(ChannelSftp channelSftpTech) {
        NotificacionErrorAlCargarDocumento notificacion = new NotificacionErrorAlCargarDocumento();
        notificacion.setResultadoSubida(false);
        notificacion.setExisteError(false);
        try {
            String rutaProcesadosTechFTP = "/home/BPO/Procesados/Tasacion/";
            Vector listaArchivosProcesados;
            listaArchivosProcesados = channelSftpTech.ls(rutaProcesadosTechFTP);
            ArrayOfTasacion arrayOfTasacion = new ArrayOfTasacion();
            List<String> listaNombreArchivos = new ArrayList<>();
            if (listaArchivosProcesados.size() > 2) {
                for (int i = 0; i < listaArchivosProcesados.size(); i++) {
                    ChannelSftp.LsEntry archivo = (ChannelSftp.LsEntry) listaArchivosProcesados.elementAt(i);
                    if (!archivo.getFilename().equals(".") && !archivo.getFilename().equals("..") && !esDirectorio(archivo.getFilename())) {
                        System.out.println("Archivo:" + archivo.getFilename());
                        listaNombreArchivos.add(archivo.getFilename());
                        DatosXML datosXML = MetodosGenerales.leerXMLTasacion(rutaProcesadosTechFTP.concat(archivo.getFilename()));
                        try {
                            Tasacion tasacion = MetodosGenerales.devolverTasacion(channelSftpTech, datosXML);
                            arrayOfTasacion.getTasacion().add(tasacion);
                        } catch (Exception ex) {
                            if (ex.getMessage() != null) {
                                String nombreDocumento = MetodosGenerales.devolverValorDadoNombre(datosXML.getListaComponentes(), "NOMBRE_DOCUMENTO");
                                String listaParaExt[] = nombreDocumento.split("_{3}");
                                if (listaParaExt.length == 2)
                                    notificacion.setDescripcionExcepcion("Error en el documento Tasacion con ID=" + listaParaExt[1].split("\\.")[0] + " Descripción:" + ex.getMessage());
                                else
                                    notificacion.setDescripcionExcepcion("Error en el nombre de la Tasacion:" + nombreDocumento);
                                notificacion.setExisteError(true);
                                return notificacion;
                            }
                        }

                    }
                }
            }
            if (arrayOfTasacion.getTasacion().size() > 0) {
                try {
                    ArrayOfOCRWSResult arrayOfResult = receiveTasaciones(arrayOfTasacion);
                    List<OCRWSResult> lista = arrayOfResult.getOCRWSResult();
                    int indice = 0;
                    notificacion.setCantidadDocumentos(lista.size());
                    for (OCRWSResult result : lista) {
                        System.out.println(result.getDescripcionResultado().getValue());
                        if ((result.getDescripcionResultado().getValue().equals("Grabación correcta"))) {
                            Tasacion tasacion = arrayOfTasacion.getTasacion().get(indice);
                            TimerTaskSchedule.generarTraza(channelSftpTech, "Tasacion", listaNombreArchivos.get(indice), "Subido al Grupo BC", String.valueOf(tasacion.getIdSolicitudOCR()), "Subidos");
                            channelSftpTech.put(rutaProcesadosTechFTP.concat(listaNombreArchivos.get(indice)), "/home/BPO/SubidosWS/Tasacion/".concat(listaNombreArchivos.get(indice)));
                            channelSftpTech.rm(rutaProcesadosTechFTP.concat(listaNombreArchivos.get(indice)));
                            notificacion.setResultadoSubida(true);
                        } else if ((result.getDescripcionResultado().getValue().equals("Error, la solicitud no se encuentra en estado pendiente de recepción"))) {
                            Tasacion tasacion = arrayOfTasacion.getTasacion().get(indice);
                            TimerTaskSchedule.generarTraza(channelSftpTech, "Tasacion", listaNombreArchivos.get(indice), "Subido al Grupo BC:No está pendiente de solicitud", String.valueOf(tasacion.getIdSolicitudOCR()), "Subidos");
                            channelSftpTech.put(rutaProcesadosTechFTP.concat(listaNombreArchivos.get(indice)), "/home/BPO/SubidosWS/Tasacion/".concat(listaNombreArchivos.get(indice)));
                            channelSftpTech.rm(rutaProcesadosTechFTP.concat(listaNombreArchivos.get(indice)));
                            notificacion.setResultadoSubida(true);
                        }
                        indice++;
                    }
                } catch (Exception ex) {
                    notificacion.setDescripcionExcepcion("Error al ejecutar el método receiveTasaciones: " + ex.getMessage());
                    notificacion.setExisteError(true);
                    return notificacion;
                }
            }
        } catch (SftpException ex) {
            System.out.println(ex.getMessage());
        }
        return notificacion;
    }
    
    /*
    public static Boolean subirRecibo(ChannelSftp channelSftpTech) throws Exception{
        Boolean alMenosUnoEnviado = false;
        try {
            String rutaProcesadosTechFTP = "/home/BPO/Procesados/Recibo/";
            Vector listaArchivosProcesados;
            listaArchivosProcesados = channelSftpTech.ls(rutaProcesadosTechFTP);
            ArrayOfRecibo arrayOfRecibo = new ArrayOfRecibo();
            List <String> listaNombreArchivos = new ArrayList<>();
            if (listaArchivosProcesados.size() > 2){
                for (int i = 0; i < listaArchivosProcesados.size(); i++) {
                    ChannelSftp.LsEntry archivo = (ChannelSftp.LsEntry)listaArchivosProcesados.elementAt(i);
                    if (!archivo.getFilename().equals(".") && !archivo.getFilename().equals("..") && !esDirectorio(archivo.getFilename())){
                        System.out.println(archivo.getFilename());
                        listaNombreArchivos.add(archivo.getFilename());
                        DatosXML datosXML = MetodosGenerales.leerXMLRecibo(rutaProcesadosTechFTP.concat(archivo.getFilename()));
                        Recibo recibo = MetodosGenerales.devolverRecibo(channelSftpTech, datosXML);
                        arrayOfRecibo.getRecibo().add(recibo);
                    }
                }
            }
             if (arrayOfRecibo.getRecibo().size() > 0){
                ArrayOfOCRWSResult arrayOfResult =  receiveRecibos(arrayOfRecibo);
                List<OCRWSResult> lista = arrayOfResult.getOCRWSResult();
                int indice = 0;
                for (OCRWSResult result : lista) {
                    System.out.println(result.getDescripcionResultado().getValue());    
                    if (result.getDescripcionResultado().getValue().equals("Grabación correcta")){
                        Recibo recibo = arrayOfRecibo.getRecibo().get(indice);
                        TimerTaskSchedule.generarTraza(channelSftpTech, "Recibo", listaNombreArchivos.get(indice), "Subido al Grupo BC",String.valueOf(recibo.getIdSolicitudOCR()), "Subidos");
                        channelSftpTech.put(rutaProcesadosTechFTP.concat(listaNombreArchivos.get(indice)), "/home/BPO/SubidosWS/Recibo/".concat(listaNombreArchivos.get(indice)));
                        channelSftpTech.rm(rutaProcesadosTechFTP.concat(listaNombreArchivos.get(indice)));
                        alMenosUnoEnviado = true;
                    }
                    indice++;
                }
            }
        } catch (SftpException ex) {
            System.out.println(ex.getMessage());    
        }
        return alMenosUnoEnviado;
    } 
    */
     
    /*
    public static void subirTasacion(ChannelSftp channelSftpTech){
        try {
            String rutaProcesadosTechFTP = "/home/BPO/Procesados/Tasacion/";
            Vector listaArchivosProcesados;
            listaArchivosProcesados = channelSftpTech.ls(rutaProcesadosTechFTP);
            ArrayOfTasacion arrayOfTasacion = new ArrayOfTasacion();
            ObjectFactory fact = new ObjectFactory();
            if (listaArchivosProcesados.size() > 2){
                for (int i = 0; i < listaArchivosProcesados.size(); i++) {
                    ChannelSftp.LsEntry archivo = (ChannelSftp.LsEntry)listaArchivosProcesados.elementAt(i);
                    System.out.println(archivo.getFilename());
                    if (!archivo.getFilename().equals(".") && !archivo.getFilename().equals("..") && !esDirectorio(archivo.getFilename())){
                        DatosXML datosXML = MetodosGenerales.leerXMLTasacion(rutaProcesadosTechFTP.concat(archivo.getFilename()));
                        Tasacion tasacion = MetodosGenerales.devolverTasacion(channelSftpTech, datosXML);
                        arrayOfTasacion.getTasacion().add(tasacion);
                        
                        

                        TimerTaskSchedule.generarTraza(channelSftpTech, "Tasación", archivo.getFilename(), "Subido al Grupo BC", String.valueOf(tasacion.getIdSolicitudOCR()), "Subidos");
                        channelSftpTech.put(rutaProcesadosTechFTP.concat(archivo.getFilename()), "/home/BPO/SubidosWS/Tasacion/".concat(archivo.getFilename()));
                        channelSftpTech.rm(rutaProcesadosTechFTP.concat(archivo.getFilename()));
                    }
                }
            }
            if (arrayOfTasacion.getTasacion().size() > 0){
                ArrayOfOCRWSResult arrayOfResult =  MetodosGenerales.receiveTasaciones(arrayOfTasacion);
                List<OCRWSResult> lista = arrayOfResult.getOCRWSResult();
                for (OCRWSResult result : lista) {
                    System.out.println(result.getDescripcionResultado().getValue());    
                }
            }
        } catch (SftpException ex) {
                        Logger.getLogger(MetodosGenerales.class.getName()).log(Level.SEVERE, null, ex);
                    }
    }
    */

    public static NotificacionErrorAlCargarDocumento subirNotaSimple(ChannelSftp channelSftpTech) {
        NotificacionErrorAlCargarDocumento notificacion = new NotificacionErrorAlCargarDocumento();
        notificacion.setResultadoSubida(false);
        notificacion.setExisteError(false);
        try {
            String rutaProcesadosTechFTP = "/home/BPO/Procesados/Nota Simple/";
            Vector listaArchivosProcesados;
            listaArchivosProcesados = channelSftpTech.ls(rutaProcesadosTechFTP);
            ArrayOfNotaSimple arrayOfNotaSimple = new ArrayOfNotaSimple();
            List<String> listaNombreArchivos = new ArrayList<>();
            //String titulares = "";
            String nombreNota = "";
            if (listaArchivosProcesados.size() > 2) {
                for (int i = 0; i < listaArchivosProcesados.size(); i++) {
                    ChannelSftp.LsEntry archivo = (ChannelSftp.LsEntry) listaArchivosProcesados.elementAt(i);
                    if (!archivo.getFilename().equals(".") && !archivo.getFilename().equals("..") && !esDirectorio(archivo.getFilename())) {
                        System.out.println(archivo.getFilename());
                        //titulares = titulares.concat(archivo.getFilename()).concat("\n");
                        nombreNota = nombreNota.concat(archivo.getFilename()).concat("___");
                        listaNombreArchivos.add(archivo.getFilename());
                        DatosXML datosXML = MetodosGenerales.leerXMLNotaSimple(rutaProcesadosTechFTP.concat(archivo.getFilename()));
                        try {
                            NotaSimple notaSimple = MetodosGenerales.devolverNotaSimple(channelSftpTech, datosXML);
                            arrayOfNotaSimple.getNotaSimple().add(notaSimple);

                            //Guardar trazas de titulares
                            /*
                            JAXBElement<ArrayOfFincaTitular> listaTitulares = notaSimple.getTitulares();
                            List<FincaTitular> listaF = listaTitulares.getValue().getFincaTitular();
                            for (FincaTitular fincaTitular : listaF) {
                               String nombre = fincaTitular.getTitular().getValue().getNombre().getValue();
                               titulares = titulares.concat(nombre).concat("\n");
                            }
                            titulares = titulares.concat("\n\n");
                            */

                        } catch (Exception ex) {
                            if (ex.getMessage() != null) {
                                String nombreDocumento = MetodosGenerales.devolverValorDadoNombre(datosXML.getListaComponentes(), "NOMBRE_DOCUMENTO");
                                String listaParaExt[] = nombreDocumento.split("_{3}");
                                if (listaParaExt.length == 2)
                                    notificacion.setDescripcionExcepcion("Error en el documento Nota Simple con ID=" + listaParaExt[1].split("\\.")[0] + " Descripción:" + ex.getMessage());
                                else
                                    notificacion.setDescripcionExcepcion("Error en el nombre de la Nota Simple:" + nombreDocumento);
                                notificacion.setExisteError(true);
                                return notificacion;
                            }
                        }

                    }
                }
            }

            if (arrayOfNotaSimple.getNotaSimple().size() > 0) {
                String titulares = "";
                Integer indiceNombreNota = 0;
                for (NotaSimple notaSimple : arrayOfNotaSimple.getNotaSimple()) {
                    titulares = titulares.concat(listaNombreArchivos.get(indiceNombreNota)).concat("\n");
                    JAXBElement<ArrayOfFincaTitular> listaTitulares = notaSimple.getTitulares();
                    List<FincaTitular> listaF = listaTitulares.getValue().getFincaTitular();
                    for (FincaTitular fincaTitular : listaF) {
                        String nombre = fincaTitular.getTitular().getValue().getNombre().getValue();
                        titulares = titulares.concat(nombre).concat("\n");
                    }
                    titulares = titulares.concat("\n\n");
                    indiceNombreNota++;
                }
                TimerTaskSchedule.generarTitulares(channelSftpTech, nombreNota, titulares);
                try {
                    ArrayOfOCRWSResult arrayOfResult = receiveNotasSimples(arrayOfNotaSimple);
                    List<OCRWSResult> lista = arrayOfResult.getOCRWSResult();
                    int indice = 0;
                    notificacion.setCantidadDocumentos(lista.size());
                    for (OCRWSResult result : lista) {
                        System.out.println(result.getDescripcionResultado().getValue());
                        if ((result.getDescripcionResultado().getValue().equals("Grabación correcta"))) {
                            NotaSimple notaSimple = arrayOfNotaSimple.getNotaSimple().get(indice);
                            TimerTaskSchedule.generarTraza(channelSftpTech, "Nota Simple", listaNombreArchivos.get(indice), "Subido al Grupo BC", String.valueOf(notaSimple.getIdSolicitudOCR()), "Subidos");
                            channelSftpTech.put(rutaProcesadosTechFTP.concat(listaNombreArchivos.get(indice)), "/home/BPO/SubidosWS/Nota Simple/".concat(listaNombreArchivos.get(indice)));
                            channelSftpTech.rm(rutaProcesadosTechFTP.concat(listaNombreArchivos.get(indice)));
                            notificacion.setResultadoSubida(true);
                        } else if ((result.getDescripcionResultado().getValue().equals("Error, la solicitud no se encuentra en estado pendiente de recepción"))) {
                            NotaSimple notaSimple = arrayOfNotaSimple.getNotaSimple().get(indice);
                            TimerTaskSchedule.generarTraza(channelSftpTech, "Nota Simple", listaNombreArchivos.get(indice), "Subido al Grupo BC:No está pendiente de solicitud", String.valueOf(notaSimple.getIdSolicitudOCR()), "Subidos");
                            channelSftpTech.put(rutaProcesadosTechFTP.concat(listaNombreArchivos.get(indice)), "/home/BPO/SubidosWS/Nota Simple/".concat(listaNombreArchivos.get(indice)));
                            channelSftpTech.rm(rutaProcesadosTechFTP.concat(listaNombreArchivos.get(indice)));
                            notificacion.setResultadoSubida(true);
                        }
                        indice++;
                    }
                } catch (Exception ex) {
                    notificacion.setDescripcionExcepcion("Error al ejecutar el método receiveNotasSimples: " + ex.getMessage());
                    notificacion.setExisteError(true);
                    return notificacion;
                }
            }

        } catch (SftpException ex) {
            System.out.println(ex.getMessage());
        }
        //return alMenosUnoEnviado;
        return notificacion;
    }

    private static ArrayOfOCRWSResult receiveNotasSimples(servicios.ArrayOfNotaSimple notasSimples) {
        servicios.OcrReceiver service = new servicios.OcrReceiver();
        //System.out.println(service.getWSDLDocumentLocation());
        servicios.IOcrReceiver port = service.getBasicHttpBindingIOcrReceiver();
        ArrayOfOCRWSResult result = port.receiveNotasSimples(notasSimples);
        return result;
    }


    private static ArrayOfOCRWSResult receiveNotasSimplesNodulos(servicios.ArrayOfNotaSimpleNodulos notasSimplesNodulos) {
        servicios.OcrReceiver service = new servicios.OcrReceiver();
        servicios.IOcrReceiver port = service.getBasicHttpBindingIOcrReceiver();
        ArrayOfOCRWSResult result = port.receiveNotasSimplesNodulos(notasSimplesNodulos);
        return result;
    }

    private static ArrayOfOCRWSResult receiveVidasLaborales(servicios.ArrayOfVidaLaboral vidasLaborales) {
        servicios.OcrReceiver service = new servicios.OcrReceiver();
        System.out.println(service.getWSDLDocumentLocation());
        servicios.IOcrReceiver port = service.getBasicHttpBindingIOcrReceiver();
        return port.receiveVidasLaborales(vidasLaborales);
    }


    private static ArrayOfOCRWSResult receiveTasaciones(servicios.ArrayOfTasacion tasaciones) {
        servicios.OcrReceiver service = new servicios.OcrReceiver();
        servicios.IOcrReceiver port = service.getBasicHttpBindingIOcrReceiver();
        return port.receiveTasaciones(tasaciones);
    }


    private static ArrayOfOCRWSResult receiveKODocuments(servicios.ArrayOfKODocument koDocuemnts) {
        servicios.OcrReceiver service = new servicios.OcrReceiver();
        servicios.IOcrReceiver port = service.getBasicHttpBindingIOcrReceiver();
        return port.receiveKODocuments(koDocuemnts);
    }

    private static ArrayOfOCRWSResult receiveIRPFs(servicios.ArrayOfIRPF irpFs) {
        servicios.OcrReceiver service = new servicios.OcrReceiver();
        System.out.println(service.getWSDLDocumentLocation());
        servicios.IOcrReceiver port = service.getBasicHttpBindingIOcrReceiver();
        return port.receiveIRPFs(irpFs);
    }

    private static ArrayOfOCRWSResult receiveNominas(servicios.ArrayOfNomina nominas) {
        servicios.OcrReceiver service = new servicios.OcrReceiver();
        servicios.IOcrReceiver port = service.getBasicHttpBindingIOcrReceiver();
        return port.receiveNominas(nominas);
    }

    private static ArrayOfOCRWSResult receiveRecibos(servicios.ArrayOfRecibo recibos) {
        servicios.OcrReceiver service = new servicios.OcrReceiver();
        servicios.IOcrReceiver port = service.getBasicHttpBindingIOcrReceiver();
        return port.receiveRecibos(recibos);
    }

    private static ArrayOfOCRWSResult receiveTasacion(servicios.ArrayOfTasacion tasaciones) {
        servicios.OcrReceiver service = new servicios.OcrReceiver();
        servicios.IOcrReceiver port = service.getBasicHttpBindingIOcrReceiver();
        return port.receiveTasaciones(tasaciones);
    }

    private static ArrayOfDatosEnvio getPendingDocuments(servicios.ConfigurationTTipoDocumento tipoDocumento) {
        servicios.OcrReceiver service = new servicios.OcrReceiver();
        System.out.println(service.getWSDLDocumentLocation());
        servicios.IOcrReceiver port = service.getBasicHttpBindingIOcrReceiver();
        return port.getPendingDocuments(tipoDocumento);
    }


    /**
     * @param textoError
     */
    private static void enviarCorreoNotificacionError(String textoError) {
        try {
            Properties props = new Properties();
            props.setProperty("mail.smtp.host", "smtp.gmail.com");
            props.setProperty("mail.smtp.starttls.enable", "true");
            props.setProperty("mail.smtp.port", "587");
            props.setProperty("mail.smtp.user", "techidbpo@gmail.com");
            props.setProperty("mail.smtp.auth", "true");
            props.put("mail.smtp.ssl.trust", "smtp.gmail.com");
            javax.mail.Session session = javax.mail.Session.getDefaultInstance(props);
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress("techidbpo@gmail.com"));

            InternetAddress listaDirecciones[] = null;
            String horaInicio = "13:50:00";
            String horaFin = "23:00:00";
            SimpleDateFormat formateador = new SimpleDateFormat("HH:mm:ss");
            try {
                Date dateInicio = formateador.parse(horaInicio);
                Date dateFinal = formateador.parse(horaFin);
                Date actual = new Date();
                actual.setDate(dateFinal.getDate());
                actual.setMonth(dateFinal.getMonth());
                actual.setYear(dateFinal.getYear());
                int res1 = DateTimeComparator.getInstance().compare(dateInicio.getTime(), actual.getTime());
                int res2 = DateTimeComparator.getInstance().compare(dateFinal.getTime(), actual.getTime());
                if ((res1 == -1) && (res2 == 1)) {
                    ArrayList<String> addressList = MetodosGenerales.getAddressList(2);
                    listaDirecciones = new InternetAddress[addressList.size()];
                    int index = 0;
                    for (String address : addressList) {
                        listaDirecciones[index] = new InternetAddress(address);
                        index++;
                    }
                    /*
                    listaDirecciones = new InternetAddress[5];
                    listaDirecciones[0] = new InternetAddress("bpo@tidinternationalgroup.com");
                    listaDirecciones[1] = new InternetAddress("angel.diaz@tidinternationalgroup.com");
                    listaDirecciones[2] = new InternetAddress("josepineroe@gmail.com");
                    listaDirecciones[3] = new InternetAddress("japestrada@nauta.cu");
                    listaDirecciones[4] = new InternetAddress("odalys.leon@tidinternationalgroup.com");
                    */
                    //listaDirecciones[4] = new InternetAddress("evaramon2016@gmail.com");
                }

                horaInicio = "06:00:00";
                horaFin = "13:40:00";
                dateInicio = formateador.parse(horaInicio);
                dateFinal = formateador.parse(horaFin);
                res1 = DateTimeComparator.getInstance().compare(dateInicio.getTime(), actual.getTime());
                res2 = DateTimeComparator.getInstance().compare(dateFinal.getTime(), actual.getTime());
                if ((res1 == -1) && (res2 == 1)) {
                    ArrayList<String> addressList = MetodosGenerales.getAddressList(1);
                    listaDirecciones = new InternetAddress[addressList.size()];
                    int index = 0;
                    for (String address : addressList) {
                        listaDirecciones[index] = new InternetAddress(address);
                        index++;
                    }
                    /*
                    listaDirecciones = new InternetAddress[4];
                    listaDirecciones[0] = new InternetAddress("bpo@tidinternationalgroup.com");
                    listaDirecciones[1] = new InternetAddress("angel.diaz@tidinternationalgroup.com");
                    listaDirecciones[2] = new InternetAddress("sltorres920120@gmail.com");
                    listaDirecciones[3] = new InternetAddress("odalys.leon@tidinternationalgroup.com");
                    */
                }

            } catch (ParseException ex) {
                Logger.getLogger(SincronizarRepoGrupoBC.class.getName()).log(Level.SEVERE, null, ex);
            }

            if (listaDirecciones != null) {
                message.addRecipients(Message.RecipientType.TO, listaDirecciones);
                message.setSubject("BPO:Error en la aplicación de sincronización con servicio web");
                message.setText(textoError);
                Transport t = session.getTransport("smtp");
                t.connect("techidbpo@gmail.com", "t3ch1dbp0");
                t.sendMessage(message, message.getAllRecipients());
                t.close();
            }

        } catch (MessagingException ex) {

        }
    }

    private static ArrayOfOCRWSResult receiveKODocuments_1(servicios.ArrayOfKODocument koDocuemnts) {
        servicios.OcrReceiver service = new servicios.OcrReceiver();
        servicios.IOcrReceiver port = service.getBasicHttpBindingIOcrReceiver();
        return port.receiveKODocuments(koDocuemnts);
    }

    /**
     * @param typeOfAddress 1 direcciones de envío en la mañana de España y 2 direcciones de envío en la tarde de España
     * @return
     */
    public static ArrayList<String> getAddressList(Integer typeOfAddress) {
        String filePath;
        if (typeOfAddress == 1)
            filePath = direccion.concat("/conf/address_morning.dat");//filePath = direccion.concat("\\conf\\address_morning.dat");
        else
            filePath = direccion.concat("/conf/address_afternoon.dat"); //filePath = direccion.concat("\\conf\\address_afternoon.dat");


        File archivo = new File(filePath);
        ArrayList<String> addressList = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(archivo);
            while (scanner.hasNextLine()) {
                addressList.add(scanner.nextLine());
            }
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return addressList;
    }

    public static void checkNotes() {
        //String filePathBC = direccion.concat("\\conf\\subidos.dat");
        //String filePathTech = direccion.concat("\\conf\\trazas_subidos_GrupoBCWS.dat");

        String filePathBC = direccion.concat("/conf/descargados.dat");
        String filePathTech = direccion.concat("/conf/trazas_descargados_GrupoBCWS.dat");


        File archivoTech = new File(filePathTech);
        File archivoBC = new File(filePathBC);
        ArrayList<String> idNotasTech = new ArrayList<>();
        ArrayList<String> idNotasBC = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(archivoTech);
            while (scanner.hasNextLine()) {
                idNotasTech.add(scanner.nextLine().split("\t\t")[4]);
                //idNotasTech.add(scanner.nextLine());
            }

            Scanner scannerBC = new Scanner(archivoBC);
            while (scannerBC.hasNextLine()) {
                idNotasBC.add(scannerBC.nextLine());
            }
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        ArrayList<String> idNotasNoDescargadas = new ArrayList<>();
        System.out.println("NOTAS QUE SI HAN SUBIDO");
        int count = 0;
        for (String idBC : idNotasBC) {
            Boolean encontrado = false;
            for (String idTech : idNotasTech) {
                if (idBC.equals(idTech)) {
                    System.out.println(idBC);
                    encontrado = true;
                    count++;
                    break;
                }
            }
            if (!encontrado)
                idNotasNoDescargadas.add(idBC);
        }
        System.out.println("CANTIDAD:" + count);
        System.out.println("NOTAS QUE NO HAN SUBIDO:" + idNotasNoDescargadas.size());
        for (String id : idNotasNoDescargadas) {
            System.out.println(id);
        }


    }

}
