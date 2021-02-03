package Booking.Paginas;

import java.io.File;
import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import Booking.Steps.Questions;
import net.thucydides.core.annotations.Step;

public class Registro {

	@FindBy(how = How.XPATH, using = "//header/nav[1]/div[2]/div[5]/a[1]")
	private WebElement CrearCuenta;

	@FindBy(how = How.ID, using = "username")
	private WebElement email;

	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[3]/button[1]/span[1]")
	private WebElement btnContinuar;

	private Questions testQuestion = new Questions();

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
		Assert.assertTrue(driver.getCurrentUrl().contains("register"));
		
		//File source = ((TakesScreenshot) btnContinuar).getScreenshotAs(OutputType.FILE);
		//FileHandler.copy(source, new File("Downloads"));
		btnContinuar.click();
	}

}
