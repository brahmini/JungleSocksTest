package com.junglesocks.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by brahmini on 1/30/2016.
 */
public class CheckoutPage extends BasePage {

    public CheckoutPage(WebDriver driver){
        super.init(driver);
    }

    @FindBy(how = How.ID , using ="subtotal")
    WebElement subTotal;

    @FindBy(how = How.ID , using ="taxes")
    WebElement taxes;

    @FindBy(how = How.ID , using ="total")
    WebElement total;

    @FindBy(how = How.TAG_NAME , using="h1")
    WebElement confirm;

    public Double getSubTotal(){
        int len = subTotal.getText().length();
        return Double.parseDouble(subTotal.getText().substring(1,len));
    }

    public String getTaxes(){
        int len = taxes.getText().length();
        return taxes.getText().substring(1,len);
    }

    public Double getTotal(){
        int len = total.getText().length();
        return Double.parseDouble(total.getText().substring(1,len));
    }

}
