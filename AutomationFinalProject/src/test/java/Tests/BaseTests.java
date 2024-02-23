package Tests;

import Pages.RegisterPage;
import Pages.ShoppingCartPage;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class BaseTests {
    WebDriver driver;
    WebDriverWait wait;
    String url = "https://magento.softwaretestingboard.com/";
    RegisterPage registerPage;
    ShoppingCartPage shoppingCartPage;

    @BeforeMethod
    public void start(){
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        registerPage = new RegisterPage(driver, wait);
        shoppingCartPage = new ShoppingCartPage(driver, wait);


        driver.get(url);
        driver.manage().window().maximize();
    }
    @AfterMethod
    public void quit(){
        driver.quit();
    }
}
