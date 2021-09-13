package Entidades;

public class Agenda {
	
	private int    idMascota;
	private String rutDueño;
	private String nombreMascota;
	private String hora ;
	private String fecha;
	
	
	public Agenda(int idMascota, String rutDueño, String nombreMascota, String hora, String fecha) {
		super();
		this.idMascota = idMascota;
		this.rutDueño = rutDueño;
		this.nombreMascota = nombreMascota;
		this.hora = hora;
		this.fecha = fecha;
	}



	public int getIdMascota() {
		return idMascota;
	}



	public void setIdMascota(int idMascota) {
		this.idMascota = idMascota;
	}



	public String getRutDueño() {
		return rutDueño;
	}



	public void setRutDueño(String rutDueño) {
		this.rutDueño = rutDueño;
	}



	public String getNombreMascota() {
		return nombreMascota;
	}



	public void setNombreMascota(String nombreMascota) {
		this.nombreMascota = nombreMascota;
	}



	public String getHora() {
		return hora;
	}



	public void setHora(String hora) {
		this.hora = hora;
	}



	public String getFecha() {
		return fecha;
	}



	public void setFecha(String fecha) {
		this.fecha = fecha;
	}



	@Override
	public String toString() {
		return "Agenda [idMascota=" + idMascota + ", rutDueño=" + rutDueño + ", nombreMascota=" + nombreMascota
				+ ", hora=" + hora + ", fecha=" + fecha + "]";
	}



	public void guardarAgenda() {
		
		 try {
            String strSql  = "INSERT INTO agenda VALUES ('+idMascota+','"+rutDueño+"','"+nombreMascota+"','"+hora+"','"+fecha+"')";
            
            Conexion.conectar();
            Conexion.sentencia = Conexion.con.prepareStatement(strSql);
            Conexion.sentencia.execute(strSql);
			 System.out.println("Datos Almasenados");
			 Conexion.desconectar();
			 
			 
		 } catch(Exception e) {
			 System.out.println("Error metodo guardar  Agenda ");			 	 
			 
		 }
	 }
	
}