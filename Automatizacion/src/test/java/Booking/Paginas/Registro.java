package Booking.Paginas;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import net.thucydides.core.annotations.Step;

public class Registro {

	
	
	@FindBy(how = How.XPATH, using = "//header/nav[1]/div[2]/div[5]/a[1]")
	 private WebElement CrearCuenta;

	@FindBy(how = How.ID, using = "username")
	WebElement email;
	

	public Registro(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}

	@Step
	public void clicCrearCuenta(WebDriver driver) {
		CrearCuenta.click();
		
	}

	@Step
	public void agregarEmail(WebDriver driver) {
		email.click();
		email.sendKeys("pruebas");
	}

}
