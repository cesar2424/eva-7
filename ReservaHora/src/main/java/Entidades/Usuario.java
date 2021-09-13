package Entidades;

public class Usuario {

	private String NombreUsuario;
	private String Password;
	
	
	public Usuario(String nombreUsuario, String password) {
		
		NombreUsuario = nombreUsuario;
		Password = password;
	}


	public String getNombreUsuario() {
		return NombreUsuario;
	}


	public void setNombreUsuario(String nombreUsuario) {
		NombreUsuario = nombreUsuario;
	}


	public String getPassword() {
		return Password;
	}


	public void setPassword(String password) {
		Password = password;
	}


	@Override
	public String toString() {
		return "Usuario [NombreUsuario=" + NombreUsuario + ", Password=" + Password + "]";
	}

	
	public void guardarUsuario() {
		
		 try {
           String strSql  = "INSERT INTO usuario VALUES ('"+NombreUsuario+"','"+Password+"')";
           
           Conexion.conectar();
           Conexion.sentencia = Conexion.con.prepareStatement(strSql);
           Conexion.sentencia.execute(strSql);
			 System.out.println("Datos Almasenados");
			 Conexion.desconectar();
			 
			 
		 } catch(Exception e) {
			 System.out.println("Error metodo guardar  Usuario ");			 	 
			 
		 }
	 }
	
	
}
