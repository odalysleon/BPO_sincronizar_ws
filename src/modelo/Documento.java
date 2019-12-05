package modelo;

public class Documento {
	private Integer idDocumento;
	private String nombre;
	private String estado;
	private String directorioPadre;
	private String fecha;
	public Documento(String nombre, String estado, String directorioPadre, String usuario, String tipoDocumento, String fecha) {
		this.nombre = nombre;
		this.estado = estado;
		this.directorioPadre = directorioPadre;
                this.fecha = fecha;
	}
	public Documento(Integer idDocumento, String nombre, String estado, String directorioPadre, String usuario, String fecha, String tipoDocumento) {
		this.idDocumento = idDocumento;
		this.nombre = nombre;
		this.estado = estado;
		this.directorioPadre = directorioPadre;
		this.fecha = fecha;
	}
	public String getEstado() {
		return estado;
	}
	public String getNombre() {
		return nombre;
	}
	public String getDirectorioPadre() {
		return directorioPadre;
	}
	public Integer getIdDocumento() {
		return idDocumento;
	}
        public String getFecha() {
            return fecha;
        }
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setDirectorioPadre(String directorioPadre) {
		this.directorioPadre = directorioPadre;
	}
	public void setIdDocumento(Integer idDocumento) {
		this.idDocumento = idDocumento;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
}
