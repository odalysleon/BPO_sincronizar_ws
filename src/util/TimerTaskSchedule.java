/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import com.jcraft.jsch.ChannelSftp;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.Session;
import com.jcraft.jsch.SftpException;
import datos.DatosDocumento;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Properties;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import org.joda.time.DateTimeComparator;
import sincronizarrepogrupobc.SincronizarRepoGrupoBC;

/**
 *
 * @author TECH ID SOLUTIONS
 */
public class TimerTaskSchedule {
    private static String direccion=System.getProperty("user.dir");
    
    /**
     * 
     * @param asunto
     * @param texto
     * @param tipo 
     */
    private static void enviarCorreoNotificacion(String asunto, String texto, String tipo){
        try {
            Properties props = new Properties();
            props.setProperty("mail.smtp.host", "smtp.gmail.com");
            props.setProperty("mail.smtp.starttls.enable", "true");
            props.setProperty("mail.smtp.port","587");
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
                if ((res1 == -1)  && (res2 == 1)){
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
                if ((res1 == -1)  && (res2 == 1)){
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
            
            if (listaDirecciones != null){ 
                message.addRecipients(Message.RecipientType.TO, listaDirecciones);
                 //message.addRecipient(Message.RecipientType.TO, new InternetAddress("bpo@tidinternationalgroup.com"));
                message.setSubject(asunto);
                message.setText(texto);
                Transport t = session.getTransport("smtp");
                t.connect("techidbpo@gmail.com","t3ch1dbp0");
                t.sendMessage(message,message.getAllRecipients());
                t.close();
            }
         } catch (MessagingException ex) {
             
         }
    } 
    
    /**
     * 
     * @param channelSftp
     * @param directorio
     * @param nombreArchivo
     * @param estado
     * @param idSolicitud
     * @param tipo 
     */
    public static void generarTraza(ChannelSftp channelSftp, String directorio, String nombreArchivo, String estado, String idSolicitud, String tipo){
            try {
                String nombreArchivoTrazas = "trazas_descargados_GrupoBCWS.dat";
                if (tipo.equals("Subidos"))
                    nombreArchivoTrazas = "trazas_subidos_GrupoBCWS.dat";
                else if (tipo.equals("Directorios"))
                    nombreArchivoTrazas = "registro_directorios_procesados.dat";
                String fuente = "/home/BPO/Historico/".concat(nombreArchivoTrazas);
                String destino = direccion.concat("\\Enviados\\").concat(nombreArchivoTrazas); 
                channelSftp.get(fuente, destino);
                BufferedWriter bw;
                try {
                    bw = new BufferedWriter(new FileWriter(destino, true));
                    String fechaAccion = new Date().toString();
                    bw.write(nombreArchivo.concat("\t\t").concat(directorio).concat("\t\t").concat(estado).concat("\t\t").concat(fechaAccion).concat("\t\t").concat(idSolicitud).concat("\n"));
                    bw.close();
                } catch (IOException ex) {
                } 
                channelSftp.put(destino, "/home/BPO/Historico/".concat(nombreArchivoTrazas));
                File fichero = new File(destino);
                fichero.delete();
           } catch (SftpException ex) {
           }
    }
    
    public static void generarTitulares(ChannelSftp channelSftp, String nombreArchivo, String contenido){
            try {
                String fechaAccion = new Date().toString();
                //String nombreArchivoTrazas = nombreArchivo.concat("___").concat(fechaAccion).concat(".dat");
                String nombreArchivoTrazas = fechaAccion.concat(".dat");
                String destino = direccion.concat("\\Enviados\\").concat(nombreArchivoTrazas); 
                BufferedWriter bw;
                try {
                    bw = new BufferedWriter(new FileWriter(destino, true));
                    bw.write(contenido);
                    bw.close();
                } catch (IOException ex) {
                } 
                channelSftp.put(destino, "/home/BPO/Trazas_Titulares/".concat(nombreArchivoTrazas));
                File fichero = new File(destino);
                fichero.delete();
           } catch (SftpException ex) {
           }
    }
    
    /**
     * 
     * @param conexion
     * @param directorio
     * @param nombreArchivo
     * @param estado 
     */
    private static void generarTrazaBD(Connection conexion, String directorio, String nombreArchivo, String estado){
        DatosDocumento datosDocumento = new DatosDocumento();
        datosDocumento.insertar(conexion, nombreArchivo, estado, directorio, new Date().toString());
    } 
    
    /**
     * 
     * @param channelSftp
     * @param directorio
     * @return 
     */
    private static Boolean existeDirectorio(ChannelSftp channelSftp, String directorio){
        String destino = direccion.concat("\\Enviados\\").concat("registro_directorios_procesados.dat"); 
        String fuente = "/home/BPO/Historico/".concat("registro_directorios_procesados.dat");
         try {
             channelSftp.get(fuente, destino);
         } catch (SftpException ex) {
             Logger.getLogger(TimerTaskSchedule.class.getName()).log(Level.SEVERE, null, ex);
         }
        File archivoTrazas = new File(destino);
        Scanner scanner;
        String datosDocumento[];
        try {
            scanner = new Scanner(archivoTrazas);
            while (scanner.hasNextLine()){
                try {
                    datosDocumento = scanner.nextLine().split("\t\t");
                    if (datosDocumento[1].equals(directorio)){
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
     * 
     * @param channelSftp
     * @param nombreArchivo
     * @return 
     */
    private static Boolean existeArchivo(ChannelSftp channelSftp, String nombreArchivo){
        String destino = direccion.concat("\\Enviados\\").concat("trazas_descargados_GrupoBC.dat"); 
        String fuente = "/home/BPO/Historico/".concat("trazas_descargados_GrupoBC.dat");
         try {
             channelSftp.get(fuente, destino);
         } catch (SftpException ex) {
             Logger.getLogger(TimerTaskSchedule.class.getName()).log(Level.SEVERE, null, ex);
         }
        File archivoTrazas = new File(destino);
        Scanner scanner;
        String datosDocumento[];
        try {
            scanner = new Scanner(archivoTrazas);
            while (scanner.hasNextLine()){
                try {
                    datosDocumento = scanner.nextLine().split("\t\t");
                    if (datosDocumento[0].equals(nombreArchivo)){
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
     * 
     */
    public void setTimerTaskSchedule(/*final ChannelSftp channelSftp, final ChannelSftp channelSftpTech*/) {
        final Timer timer;
        timer = new Timer();
        

            TimerTask task = new TimerTask() {
                @Override
                public void run(){
                        //Connection conexion = SincronizarRepoGrupoBC.NuevaConexion();
                        //Session session = SincronizarRepoGrupoBC.connectFTPbySSH();
                        
                        //DEFINIR HORARIO DE ENVIO Y RECEPCION DE DOCUMENTOS
                        /*
                        String horaInicio = "08:00:00";
                        String horaFin = "22:00:00";
                        SimpleDateFormat formateador = new SimpleDateFormat("HH:mm:ss");
                        */
                        //try {
                            /*
                             Date dateInicio = formateador.parse(horaInicio);
                            Date dateFinal = formateador.parse(horaFin);
                            Date actual = new Date();
                            actual.setDate(dateFinal.getDate());
                            actual.setMonth(dateFinal.getMonth());
                            actual.setYear(dateFinal.getYear());
                            int res1 = DateTimeComparator.getInstance().compare(dateInicio.getTime(), actual.getTime());
                            int res2 = DateTimeComparator.getInstance().compare(dateFinal.getTime(), actual.getTime());
                            */
                            //if ((res1 == -1)  && (res2 == 1)){
                            
                            Session sessionTech = MetodosGenerales.connectFTPbySSHTech();
                            ChannelSftp channelSftpTech = null;
                            try {
                                if (sessionTech != null && sessionTech.isConnected()) {
                                    channelSftpTech = (ChannelSftp)sessionTech.openChannel("sftp");
                                    channelSftpTech.connect();
                                }
                            } catch (JSchException ex) {
                                System.out.println(ex.getMessage());
                            } 

                            System.out.println("Descargando archivos desde Grupo BC...");
                            DocumentosDescargados documentosDescargados = MetodosGenerales.descargarDocumentos(channelSftpTech);
                            if (documentosDescargados.getCantTotal() > 0){
                                enviarCorreoNotificacion("BPO utilizando servicio web:Nuevos documentos disponibles", "TECH ID Solutions: Se han descargado " + documentosDescargados.getCantTotal() + " documentos PDF desde Grupo BC:\n" +
                                                    "Nota Simple:" + documentosDescargados.getDescargdaNotas() +  "\n" + 
                                                    "IRPF:" + documentosDescargados.getDescargdaIRPF() + "\n" + 
                                                    "Nómina:" + documentosDescargados.getDescargdaNomina() + "\n" + 
                                                    "Vida laboral:" + documentosDescargados.getDescargdaVidaLaboral() + "\n" + 
                                                    "Recibo:" + documentosDescargados.getDescargdaRecibo() + "\n" + 
                                                    "Tasación:" + documentosDescargados.getDescargdaTasacion() + "\n" +
                                                    "Nota Simple OCR:" + documentosDescargados.getDescargdaNotasNodulos(), "Descargados");
                                System.out.println("SE HAN DESCARGADO DOCUMENTOS DE GRUPOBC!!!!");
                            } else if (documentosDescargados.getCantTotal() == -1)
                                System.out.println("ERROR EN EL SERVICIO WEB DE GRUPOBC!!!");
                            else System.out.println("NO EXISTEN DOCUMENTOS DISPONIBLES PARA DESCARGAR!!!!");
                            System.out.println("Descarga finalizada:" + new Date().toString());

                            //Subir archivos
                            System.out.println("Subiendo archivos procesados para Grupo BC...");
                            ResultadoSubida resultadoSubida = MetodosGenerales.subirDocumentos(channelSftpTech);
                            if (resultadoSubida.getResultado()){
                                enviarCorreoNotificacion("BPO utilizando servicio web:Documentos subidos", "TECH ID Solutions: Se han subido " + resultadoSubida.getDocumentosSubidos().getCantTotal() +  " documentos a Grupo BC:\n" + 
                                         "Nota Simple:" + resultadoSubida.getDocumentosSubidos().getCantidadNotas() +  "\n" + 
                                         "IRPF:" + resultadoSubida.getDocumentosSubidos().getCantidadIRPF() + "\n" + 
                                         "Nómina:" + resultadoSubida.getDocumentosSubidos().getCantidadNomina() + "\n" + 
                                         "Vida laboral:" + resultadoSubida.getDocumentosSubidos().getCantidadVidaLaboral() + "\n" + 
                                         "Recibo:" + resultadoSubida.getDocumentosSubidos().getCantidadRecibo() + "\n" + 
                                         "Tasación:" + resultadoSubida.getDocumentosSubidos().getCantidadTasacion()  + "\n" +
                                         "Documento KO:" + resultadoSubida.getDocumentosSubidos().getCantidadKO() + "\n" +
                                         "Nota Simple OCR:" + resultadoSubida.getDocumentosSubidos().getCantidadNotasOCR(), "Subidos");
                                
                            } 
                            System.out.println("Subida finalizada:" + new Date().toString());
                            channelSftpTech.disconnect();
                            sessionTech.disconnect();
                            //}
                    /*
                    } catch (ParseException ex) {
                            System.out.println(ex.getMessage());
                    }*/
                }
            };
            //Comienza dentro de 0ms y luego lanzamos la tarea cada 1000ms   60000
            //timer.schedule(task, 1000, 3600000);
            //timer.schedule(task, 1000, 300000); cada 5 minutos
            timer.schedule(task, 1000, 300000);
    }
}
