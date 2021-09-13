package com.petSmile.ReservarHora;

import static org.junit.Assert.assertEquals;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest {
	private WebDriver driver;
	
  @Test
  public void f() {
	  
	  WebElement cuadroBusqueda = driver.findElement(By.name("q"));
	  
	  cuadroBusqueda.clear();
	  
	  cuadroBusqueda.sendKeys("pagina principal iplacex");
	 	  
	  cuadroBusqueda.submit();
	  
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
	  assertEquals("pagina principal iplacex",driver.getTitle());
	  
  }
  @BeforeTest
  public void beforeTest() {
	
	  System.setProperty("webdriver.chrome.driver","./src/test/resources/chromedriver.exe");
	  
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.google.com/");
  }

  @AfterTest
  public void afterTest() {
	  
	  driver.quit();
	   }
  
  
}
