package Entidades;

public class Mascota {

	private String Rut_Dueño;	
	private String TipoMascota;
	private int Edad;
	private String NombreMascota;
		

	public Mascota(String rut_Dueño, String tipoMascota, int edad, String nombreMascota) {
		
		Rut_Dueño = rut_Dueño;
		TipoMascota = tipoMascota;
		Edad = edad;
		NombreMascota = nombreMascota;
	}
 
	public String getRut_Dueño() {
		return Rut_Dueño;
	}

	public void setRut_Dueño(String rut_Dueño) {
		Rut_Dueño = rut_Dueño;
	}

	public String getTipoMascota() {
		return TipoMascota;
	}

	public void setTipoMascota(String tipoMascota) {
		TipoMascota = tipoMascota;
	}

	public int getEdad() {
		return Edad;
	}

	public void setEdad(int edad) {
		Edad = edad;
	}

	public String getNombreMascota() {
		return NombreMascota;
	}

	public void setNombreMascota(String nombreMascota) {
		NombreMascota = nombreMascota;
	}

	
	@Override
	public String toString() {
		return "Mascota [Rut_Dueño=" + Rut_Dueño + ", TipoMascota=" + TipoMascota + ", Edad=" + Edad
				+ ", NombreMascota=" + NombreMascota + "]";
	}

	public void guardarMascota() {
		
		 try {
             String strSql  = "INSERT INTO mascota VALUES ('"+Rut_Dueño+"','"+TipoMascota+"',"+Edad+",'"+NombreMascota+"')";
             
             Conexion.conectar();
             Conexion.sentencia = Conexion.con.prepareStatement(strSql);
             Conexion.sentencia.execute(strSql);
			 System.out.println("Datos Almasenados");
			 Conexion.desconectar();
			 
			 
		 } catch(Exception e) {
			 System.out.println("Error metodo guardar  Mascota ");			 	 
			 
		 }
	 }
}
