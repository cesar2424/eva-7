package com.petSmile.ReservaHora;

import static org.junit.Assert.fail;



import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import Entidades.Conexion;


public class ConexionTest {

	public ConexionTest() 
	{
		
	   }
	
	@BeforeClass
	public static void setUpClass() {
		
	}
	
	@AfterClass
	
    public static void tearDownClass() {
		
	}
	
	@Before
	
	public static void setUp() {
			
	}
	
	@After
	
	public static void tearDown() {
		
	}
	
	@Test
	
     public static void testConexion () {
		
	
		System.out.println("conexion");
	try {
		Conexion conectar =new Conexion();
		
	    }catch() {
	    	
	    	System.out.println();
	    	
	    	fail();
	    	
	    }	
		
	}
	
	
}
