package util;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConexionBD {
	/**
     * nombreHost: Variable que almacena el nombre del Host a donde se hace la conexión
     * usuario: Variable que almacena el nombre de usuario.
     * clave: Variable que almacena la contraseña
     * cadenaConexion: Variable que almacena la cadena de conexión.
     */
    private final String nombreHost; 
    private final String usuario; 
    private final String clave;
    private String cadenaConexion;
    
    /**
     * Constructor de la clase ConexionManejoBD.
     * @param nombreHost Nombre de la PC a la cual se hará la conexión
     * @param usuario Usuario bajo el cual se realizará la conexión
     * @param clave Contraseña bajo la cual se realizará la conexión
     */
    public ConexionBD(String nombreHost, String usuario, String clave ){
        this.nombreHost = nombreHost;
        this.usuario = usuario;
        this.clave = clave;      
    }
    
    /**
     * Método que devuelve una Conexión.
     * @return Conexión (Connection)
     * @throws java.sql.SQLException Si existe algún error
     */
    public Connection Conexion()throws java.sql.SQLException {
        try {
           Class.forName("com.mysql.jdbc.Driver").newInstance(); // Se registra el driver
         }
         catch (ClassNotFoundException | InstantiationException | IllegalAccessException e ){ 
         } 
       cadenaConexion = "jdbc:mysql://" + this.nombreHost + "/liferay"; // Se crea la cadena de conexión
       return DriverManager.getConnection(cadenaConexion, this.usuario, this.clave); 
    }
}
