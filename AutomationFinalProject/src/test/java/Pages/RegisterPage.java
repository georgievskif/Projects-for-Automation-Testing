package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.rmi.server.ExportException;

public class RegisterPage {
    WebDriver driver;
    WebDriverWait wait;
    By createAnAccBtn = By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[3]/a");
    By firstNameInput = By.xpath("//*[@id=\"firstname\"]");
    By lastNameInput = By.xpath("//*[@id=\"lastname\"]");
    By emailInput = By.xpath("//*[@id=\"email_address\"]");
    By passwordInput = By.xpath("//*[@id=\"password\"]");
    By confirmPasswordInput = By.xpath("//*[@id=\"password-confirmation\"]");
    By createAccBtn = By.xpath("//*[@id=\"form-validate\"]/div/div[1]/button/span");
    By returnHeader = By.xpath("//*[@id=\"maincontent\"]/div[1]/div[2]/div/div/div");

    public RegisterPage(WebDriver driver, WebDriverWait wait){
        this.driver = driver;
        this.wait = wait;
    }
    public void registerAcc(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(createAnAccBtn)).click();
    }
    public void enterFirstName(String firstName){
        wait.until(ExpectedConditions.visibilityOfElementLocated(firstNameInput)).sendKeys(firstName);
    }
    public void enterLastName(String lastName){
        wait.until(ExpectedConditions.visibilityOfElementLocated(lastNameInput)).sendKeys(lastName);
    }
    public void enterEmail(String email){
        wait.until(ExpectedConditions.visibilityOfElementLocated(emailInput)).sendKeys(email);
    }
    public void enterPassword(String password){
        wait.until(ExpectedConditions.visibilityOfElementLocated(passwordInput)).sendKeys(password);
    }
    public void enterConfirmationPw(String confirmationPw){
        wait.until(ExpectedConditions.visibilityOfElementLocated(confirmPasswordInput)).sendKeys(confirmationPw);
    }
    public void clickCreateBtn(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(createAccBtn)).click();
    }
    public String getHeader(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(returnHeader)).getText();
    }












}
