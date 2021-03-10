package Booking.Paginas;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import Booking.Steps.Questions;
import net.thucydides.core.annotations.Step;

public class Registro {

	private Questions questions = new Questions();
// WebDriver driver;

	@FindBy(how = How.XPATH, using = "//header/nav[1]/div[2]/div[5]/a[1]")
	private WebElement CrearCuenta;

	@FindBy(how = How.ID, using = "username")
	private WebElement email;

	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[3]/button[1]/span[1]")
	private WebElement btnContinuar;
	private Boolean b;

	public Registro(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}

	@Step
	public void clicCrearCuenta(WebDriver driver) {
		CrearCuenta.click();

	}

	@Step
	public void agregarEmail(WebDriver driver, String Email) throws IOException {

		email.click();
		email.sendKeys(Email);

		this.questions.screenShot(driver);
		this.questions.textoCrearCuentaAssert(driver);

		btnContinuar.click();

	}
}
