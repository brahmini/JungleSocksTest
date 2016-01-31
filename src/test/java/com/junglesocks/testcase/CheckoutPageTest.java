package com.junglesocks.testcase;

import com.junglesocks.pages.CheckoutPage;
import com.junglesocks.pages.WelcomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.text.DecimalFormat;

/**
 * Created by brahmini on 1/30/2016.
 */
public class CheckoutPageTest extends BaseTest {

    @Test(dataProvider = "stateTaxDataProvider")
    public void testStateTax(String state, Double taxPercent){
        driver.get("https://jungle-socks.herokuapp.com");
        WelcomePage welcomePage = new WelcomePage(driver);
        Integer zebra = 1;
        Integer lion = 1;
        Integer elephant = 1;
        Integer giraffe = 1;

        welcomePage.clickCheckout(zebra.toString(),lion.toString(),elephant.toString(),giraffe.toString(), state, taxPercent);
        checkPrice(welcomePage);
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("total")));
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        //TODO also check any rounding issues
        Assert.assertEquals(checkoutPage.getTaxes() , new DecimalFormat("#0.00").format(welcomePage.getExpectedTax()));
    }

    //check the displayed price is same as the catalog price
    private void checkPrice(WelcomePage welcomePage) {
        //TODO get catalog prices from properties or config
        Assert.assertEquals(welcomePage.getZebraPrice(), "13");
        Assert.assertEquals(welcomePage.getLionPrice() ,"20");
        Assert.assertEquals(welcomePage.getElephantPrice() ,"35");
        Assert.assertEquals(welcomePage.getGiraffePrice(), "17");
    }
}
