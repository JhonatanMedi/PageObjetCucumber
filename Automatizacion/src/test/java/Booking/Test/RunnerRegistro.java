package Booking.Test;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import Booking.Paginas.Registro;

public class RunnerRegistro {

	WebDriver driver;

	private String PATHDRIVER = "Drivers/";
	private String baseURL = "https://www.booking.com/";

	@Before
	public void setup() {

		System.setProperty("webdriver.chrome.driver", PATHDRIVER + "chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		options.addArguments("--incognito");
		driver = new ChromeDriver(options);
		driver.get(baseURL);
	}

	/*@Test
	public void signUp() {

		Registro registro = new Registro(driver);
		registro.clicCrearCuenta();
		registro.agregarEmail();

	}*/
}
