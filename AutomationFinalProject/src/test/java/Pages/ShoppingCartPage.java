package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ShoppingCartPage {
    WebDriver driver;
    WebDriverWait wait;
    Select selectElement;
    By whatsNewBtn = By.xpath("//*[@id=\"ui-id-3\"]/span");
    By size = By.xpath("//*[@id=\"option-label-size-143-item-166\"]");
    By color = By.xpath("//*[@id=\"option-label-color-93-item-52\"]");
    By clickAddToCart = By.xpath("//*[@id=\"maincontent\"]/div[4]/div[1]/div[2]/div[3]/div/div/ol/li[1]/div/div/div[3]/div/div[1]/form/button/span");
    By retunrTxt = By.xpath("//div[@data-bind=\"html: $parent.prepareMessageForHtml(message.text)\"]");
    By women = By.xpath("//*[@id=\"ui-id-4\"]/span[2]");
    By anotherSize = By.xpath("//*[@id=\"option-label-size-143-item-168\"]");
    By anotherColor = By.xpath("//*[@id=\"option-label-color-93-item-56\"]");
    By secondAddToCart = By.xpath("//span[text()='Add to Cart']");
    By getHeader = By.xpath("//*[@id=\"maincontent\"]/div[2]/div[2]/div/div/div");
    By shoppingCart = By.xpath("//a[span[@class='text' and text()='My Cart']]");
    By checkOut = By.xpath("//button[@id='top-cart-btn-checkout']");
    //By firstNameInput = By.xpath("//*[@id=\"C2NDN0B\"]");
    //By lastNameInput = By.xpath("//*[@id=\"AI5BH4X\"]");
    By streetAddressInput = By.xpath("//input[@name='street[0]']");
    By streetAddress1Input = By.xpath("//input[@name='street[1]']");
    By streetAddress2Input = By.xpath("//input[@name='street[2]']");
    By cityInput = By.xpath("//input[@name='city']");
    By stateDropdown = By.xpath("//select[@name='region_id']");
    By zipCodeInput = By.xpath("//input[@name='postcode']");
    By countryDropdown = By.xpath("//select[@name='country_id']");
    By phoneNumberInput = By.xpath("//input[@type='text' and @name='telephone']");
    By shippingMethods = By.xpath("//*[@id=\"checkout-shipping-method-load\"]/table/tbody/tr[1]/td[1]/input");
    By nextBtn = By.xpath("//button[@data-role='opc-continue']/span[@data-bind=\"i18n: 'Next'\"]");
   // By placeOrderBtn = By.xpath("//button[@title=\"Place Order\"]/span[@data-bind=\"i18n: 'Place Order'\"]");
   // By getHeaderTextFinal = By.xpath("//span[@class=\"base\" and @data-ui-id=\"page-title-wrapper\"]");

    public ShoppingCartPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public void navigateToShoppingCartUrl() {
        driver.navigate().to("https://magento.softwaretestingboard.com/customer/account/");
    }

    public void clickWhatsNew() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(whatsNewBtn)).click();
    }

    public void pickSize() {
        WebElement button = wait.until(ExpectedConditions.visibilityOfElementLocated(size));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView()", button);
        button.click();

    }

    public void pickColor() {
        WebElement button = wait.until(ExpectedConditions.visibilityOfElementLocated(color));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView()", button);
        button.click();
    }

    public void setClickAddToCart() {
        WebElement button = wait.until(ExpectedConditions.visibilityOfElementLocated(clickAddToCart));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView()", button);
        button.click();
    }

    public String getText() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(retunrTxt)).getText();
    }

    public void clickWomenBtn() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(women)).click();
    }

    public void pickOtherSize() {
        WebElement button = wait.until(ExpectedConditions.visibilityOfElementLocated(anotherSize));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView()", button);
        button.click();
    }

    public void pickOtherColor() {
        WebElement button = wait.until(ExpectedConditions.visibilityOfElementLocated(anotherColor));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView()", button);
        button.click();
    }

    public void secondAddToCart() {
        WebElement button = wait.until(ExpectedConditions.visibilityOfElementLocated(secondAddToCart));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView()", button);
        button.click();

    }

    public String getHeaderText() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(getHeader)).getText();
    }

    public void clickShoppingCart() {
        WebElement button = wait.until(ExpectedConditions.visibilityOfElementLocated(shoppingCart));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView()", button);
        button.click();
    }

    public void clickOnCheckOut() {
        WebElement button = wait.until(ExpectedConditions.visibilityOfElementLocated(checkOut));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView()", button);
        button.click();
    }

    /*public void enterFirstName(String firstName) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(firstNameInput)).sendKeys(firstName);
    }

    public void enterLastName(String lastName) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(lastNameInput)).sendKeys(lastName);
    }*/

    public void enterStreetAdd(String address) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(streetAddressInput)).sendKeys(address);
    }

    public void enterStreetAdd1(String address1) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(streetAddress1Input)).sendKeys(address1);

    }

    public void enterStreetAdd2(String address2) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(streetAddress2Input)).sendKeys(address2);
    }

    public void enterCity(String city) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(cityInput)).sendKeys(city);
    }

    public void selectStateByIndex(int number) {
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(stateDropdown));
        selectElement = new Select(element);
        selectElement.selectByIndex(number);
    }

    public void setZipCode(String zipCOde) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(zipCodeInput)).sendKeys(zipCOde);
    }

    public void selectCountryByIndex(int number) {
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(countryDropdown));
        selectElement = new Select(element);
        selectElement.selectByIndex(number);
    }

    public void enterPhoneNumber(String phoneNumber) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(phoneNumberInput)).sendKeys(phoneNumber);
    }

    public void clickShippingMetod(int index) {
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(shippingMethods)).get(index).click();
    }

    public void clickNextBtn() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(nextBtn)).click();
    }

   /* public void clickPlaceOrder() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(placeOrderBtn)).click();
    }

    public String getHeaderFinal() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(getHeaderTextFinal)).getText();
    }*/
}