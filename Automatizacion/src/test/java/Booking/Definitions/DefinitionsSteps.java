package Booking.Definitions;

import org.openqa.selenium.WebDriver;

import Booking.Paginas.Registro;
import Booking.Steps.Conexion;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;

public class DefinitionsSteps {

	private WebDriver driver;
	private Conexion conexion = new Conexion();
	private Registro registro = new Registro(driver);
	
	@Given("^abrir el navegador$")
	public void abrir_navegador() {
		this.conexion = new Conexion();
		this.driver = this.conexion.abrirNavegador();
		
	}
	@And("^Registro$")
	public void diligenciar_Formulario() {
		this.registro = new Registro(driver);
		this.registro.clicCrearCuenta(driver);
		this.registro.agregarEmail(driver);
	
	}
}
