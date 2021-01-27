package Booking.Paginas;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import net.thucydides.core.annotations.Step;

public class CrearContraseña {

	@FindBy(how = How.ID, using = "new_password")
	private WebElement NewContraseña;

	@FindBy(how = How.ID, using = "confirmed_password")
	private WebElement ConfirmedContraseña;

	public CrearContraseña(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}

	@Step
	public void Contraseña(WebDriver driver, String NuevaContraseña, String ConfirmarContraseña) {
		NewContraseña.sendKeys(NuevaContraseña);
		ConfirmedContraseña.sendKeys(ConfirmarContraseña);

	}

}
