package datos;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import modelo.Documento;
import util.MetodosGenerales;

public class DatosDocumento {
    
    /**
     * 
     * @param conexion
     * @param nombre
     * @param estado
     * @param directorioPadre
     * @param fecha
     * @return 
     */
    public int insertar(Connection conexion, String nombre, String estado, String directorioPadre, String fecha){
        int result = 0;
        try {
             CallableStatement cs =  conexion.prepareCall("{call insertar_doc_historico(?,?,?,?,?)}");
             cs.setString(1, nombre);
             cs.setString(2, estado);
             cs.setString(3, directorioPadre);
             cs.setString(4, fecha);
             cs.executeUpdate();
             result = cs.getInt("error");
         }  
         catch(SQLException e){
           System.out.println(e.getMessage());
         }
        return result;
    }
    
    /**
     * 
     * @param conexion
     * @return 
     */
    public ArrayList<Documento> listarDocumentos(Connection conexion){
        ArrayList<Documento> listaDocumentos = new ArrayList<>();
        try {
            ResultSet resultDocumentos = conexion.prepareCall("{call listar_documentos()}").executeQuery();
            while (resultDocumentos.next()){
                 listaDocumentos.add(new Documento(resultDocumentos.getInt("id_documento"),
                                                                                   resultDocumentos.getString("nombre"), 
                                                                                   resultDocumentos.getString("estado"),  
                                                                                   resultDocumentos.getString("directorio_padre"),
                                                                                   resultDocumentos.getString("screenName")!=null?resultDocumentos.getString("screenName"):"Sin Asignar",
                                                                                   resultDocumentos.getDate("fecha_terminado")!=null?MetodosGenerales.convertirFechaDDMMYYYY(new java.util.Date(resultDocumentos.getDate("fecha_terminado").getTime())):null,
                                                                                   resultDocumentos.getString("tipo"))); 
            }
        }  
        catch(SQLException e){
        }
        return listaDocumentos;
    }
    
    /**
     * 
     * @param conexion
     * @param idDocumento
     * @param estado
     * @param idUsuario
     * @param tipo
     * @return 
     */
    public int modificarDocumento(Connection conexion, Integer idDocumento, String estado, long idUsuario, String tipo ){
                    int result = 0;
                    try {
                            CallableStatement cs =  conexion.prepareCall("{call modificar_documento(?,?,?,?,?)}");
                            cs.setInt(1, idDocumento);
                            cs.setString(2, estado);
                            cs.setLong(3, idUsuario);
                            cs.setString(4, tipo);
                            cs.executeUpdate();
                            result = cs.getInt("error");
                    }  
                    catch(SQLException e){
                    }
            return result;
    }
}
