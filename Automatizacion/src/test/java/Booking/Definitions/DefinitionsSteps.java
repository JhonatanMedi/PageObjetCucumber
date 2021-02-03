package Booking.Definitions;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import Booking.Paginas.CrearContraseña;
import Booking.Paginas.Registro;
import Booking.Steps.Conexion;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class DefinitionsSteps {

	private WebDriver driver;
	private Conexion conexion = new Conexion();
	private Registro registro = new Registro(driver);
	private CrearContraseña crearContraseña = new CrearContraseña(driver);

	@Given("^abrir el navegador$")
	public void abrir_navegador() {
		this.conexion = new Conexion();
		this.driver = this.conexion.abrirNavegador();

	}

	@When("^Ingresar al formulario (.*)$")
	public void diligenciar_Formulario(String Email) throws IOException {
		this.registro = new Registro(driver);
		this.registro.clicCrearCuenta(driver);
		this.registro.agregarEmail(driver, Email);

	}

	@And("^Diligenciar los campos de contraseña (.*)  confirmar (.*)$")
	public void diligenciar_contraseña(String NuevaContraseña, String ConfirmarContraseña) {
		this.crearContraseña = new CrearContraseña(driver);
		this.crearContraseña.Contraseña(driver, NuevaContraseña, ConfirmarContraseña);

	}

}
