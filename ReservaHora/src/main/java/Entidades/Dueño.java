package Entidades;

public class Dueño {

	private String Rut;
	private String Nombre;
	private String Apellido;
	private String Direccion;
	private String Correo;	
	private String Telefono;
	private String NombreMascota ;

	public Dueño(String rut, String nombre, String apellido, String direccion, String correo, String telefono,
			String nombreMascota) {
		
		Rut = rut;
		Nombre = nombre;
		Apellido = apellido;
		Direccion = direccion;
		Correo = correo;
		Telefono = telefono;
		NombreMascota = nombreMascota;
	}

	public String getRut() {
		return Rut;
	}

	public void setRut(String rut) {
		Rut = rut;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getApellido() {
		return Apellido;
	}

	public void setApellido(String apellido) {
		Apellido = apellido;
	}

	public String getDireccion() {
		return Direccion;
	}
		
	public void setDireccion(String direccion) {
	Direccion = direccion;
	}

	public String getCorreo() {
		return Correo;
	}
	
	public void setCorreo(String correo) {
		Correo = correo;
	}
	
	public String getTelefono() {
		return Telefono;
	}
	
	public void setTelefono(String telefono) {
		Telefono = telefono;
	}
	
	public String getNombreMascota() {
		return NombreMascota;
	}
	
	public void setNombreMascota(String nombreMascota) {
		NombreMascota = nombreMascota;
	}
	
		
	
	@Override
	public String toString() {
		return "Dueño [Rut=" + Rut + ", Nombre=" + Nombre + ", Apellido=" + Apellido + ", Direccion=" + Direccion
				+ ", Correo=" + Correo + ", Telefono=" + Telefono + ", NombreMascota=" + NombreMascota + "]";
	}

	public void guardarDueño() {
		
		 try {
            String strSql  = "INSERT INTO dueño VALUES ('"+Rut+"','"+Nombre+"','"+Apellido+"','"+Direccion+"','"+Telefono+"','"+NombreMascota+"')";
            
            Conexion.conectar();
            Conexion.sentencia = Conexion.con.prepareStatement(strSql);
            Conexion.sentencia.execute(strSql);
			 System.out.println("Datos Almasenados");
			 Conexion.desconectar();
			 
			 
		 } catch(Exception e) {
			 System.out.println("Error metodo guardar  Dueño ");			 	 
			 
		 }

	}
}
