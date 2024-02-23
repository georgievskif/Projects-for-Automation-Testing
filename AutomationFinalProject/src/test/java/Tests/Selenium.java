package Tests;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Selenium  extends BaseTests{
    @Test
    public void registerPage() throws InterruptedException {
        registerPage.registerAcc();
        Thread.sleep(2000);
        registerPage.enterFirstName("Filip");
        Thread.sleep(2000);
        registerPage.enterLastName("Georgievski");
        Thread.sleep(2000);
        registerPage.enterEmail("filip123456@gmail.com");
        Thread.sleep(2000);
        registerPage.enterPassword("Filipfilip123");
        Thread.sleep(2000);
        registerPage.enterConfirmationPw("Filipfilip123");
        Thread.sleep(2000);
        registerPage.clickCreateBtn();
        Thread.sleep(2000);
        Assert.assertEquals(registerPage.getHeader(), "Thank you for registering with Main Website Store.");

    }
    @Test
    public void shoppingCartPage() throws InterruptedException {
        shoppingCartPage.navigateToShoppingCartUrl();
        Thread.sleep(1000);
        shoppingCartPage.clickWhatsNew();
        Thread.sleep(1000);
        shoppingCartPage.pickSize();
        Thread.sleep(1000);
        shoppingCartPage.pickColor();
        Thread.sleep(1000);
        shoppingCartPage.setClickAddToCart();
        Thread.sleep(1000);
        shoppingCartPage.clickWomenBtn();
        Thread.sleep(1000);
        shoppingCartPage.pickOtherSize();
        Thread.sleep(1000);
        shoppingCartPage.pickOtherColor();
        Thread.sleep(1000);
        shoppingCartPage.secondAddToCart();
        Thread.sleep(1000);
        shoppingCartPage.clickShoppingCart();
        Thread.sleep(1000);
        shoppingCartPage.clickOnCheckOut();
        Thread.sleep(1000);
        shoppingCartPage.enterStreetAdd("Franc");
        Thread.sleep(1000);
        shoppingCartPage.enterStreetAdd1("Rozman");
        Thread.sleep(1000);
        shoppingCartPage.enterStreetAdd2("47");
        Thread.sleep(2000);
        shoppingCartPage.enterCity("Kumanovo");
        Thread.sleep(2000);
        shoppingCartPage.selectStateByIndex(1);
        Thread.sleep(2000);
        shoppingCartPage.setZipCode("1300");
        Thread.sleep(2000);
        shoppingCartPage.selectCountryByIndex(1);
        Thread.sleep(2000);
        shoppingCartPage.enterPhoneNumber("077111222");
        Thread.sleep(2000);
        shoppingCartPage.clickShippingMetod(0);
        Thread.sleep(2000);
        shoppingCartPage.clickNextBtn();
        Thread.sleep(2000);

    }
    @Test
    public void EndToEnd() throws InterruptedException {
        registerPage.registerAcc();
        Thread.sleep(500);
        registerPage.enterFirstName("Filip");
        Thread.sleep(500);
        registerPage.enterLastName("Georgievski");
        Thread.sleep(500);
        registerPage.enterEmail("johndeere12355564@gmail.com");
        Thread.sleep(500);
        registerPage.enterPassword("Filipfilip123");
        Thread.sleep(500);
        registerPage.enterConfirmationPw("Filipfilip123");
        Thread.sleep(500);
        registerPage.clickCreateBtn();
        Thread.sleep(500);
        Assert.assertEquals(registerPage.getHeader(), "Thank you for registering with Main Website Store.");
        shoppingCartPage.clickWhatsNew();
        Thread.sleep(500);
        shoppingCartPage.pickSize();
        Thread.sleep(500);
        shoppingCartPage.pickColor();
        Thread.sleep(500);
        shoppingCartPage.setClickAddToCart();
        Thread.sleep(500);
        Assert.assertEquals(shoppingCartPage.getText(), "You added Phoebe Zipper Sweatshirt to your shopping cart.");
        Thread.sleep(500);
        shoppingCartPage.clickWomenBtn();
        Thread.sleep(500);
        shoppingCartPage.pickOtherSize();
        Thread.sleep(500);
        shoppingCartPage.pickOtherColor();
        Thread.sleep(500);
        shoppingCartPage.secondAddToCart();
        Thread.sleep(2000);
        Assert.assertEquals(shoppingCartPage.getHeaderText(),"You added Radiant Tee to your shopping cart.");
        shoppingCartPage.clickShoppingCart();
        Thread.sleep(2000);
        shoppingCartPage.clickOnCheckOut();
        Thread.sleep(500);
        //shoppingCartPage.enterFirstName("Filip");
        Thread.sleep(500);
        //shoppingCartPage.enterLastName("Georgievski");
        shoppingCartPage.enterStreetAdd("Franc");
        Thread.sleep(500);
        shoppingCartPage.enterStreetAdd1("Rozman");
        Thread.sleep(500);
        shoppingCartPage.enterStreetAdd2("47");
        Thread.sleep(500);
        shoppingCartPage.enterCity("Kumanovo");
        Thread.sleep(500);
        shoppingCartPage.selectStateByIndex(1);
        Thread.sleep(500);
        shoppingCartPage.setZipCode("1300");
        Thread.sleep(500);
        shoppingCartPage.selectCountryByIndex(1);
        Thread.sleep(2000);
        shoppingCartPage.enterPhoneNumber("077111222");
        Thread.sleep(2000);
        shoppingCartPage.clickShippingMetod(0);
        Thread.sleep(2000);
        shoppingCartPage.clickNextBtn();
        //Thread.sleep(3000);
        //shoppingCartPage.clickPlaceOrder();
        //Thread.sleep(2000);
        //Assert.assertEquals(shoppingCartPage.getHeaderFinal(), "Thank you for your purchase!");



    }
}
