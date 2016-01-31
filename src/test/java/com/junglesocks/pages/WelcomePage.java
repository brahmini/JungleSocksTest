package com.junglesocks.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by brahmini on 1/30/2016.
 */
public class WelcomePage extends BasePage{

    public WelcomePage(WebDriver driver) {
        super.init(driver);
    }

    @FindBy(how = How.ID , using ="line_item_quantity_zebra")
    WebElement zebra;

    @FindBy(how = How.XPATH ,using ="//tr[@class='line_item zebra']/td[2]")
    WebElement zebraPrice;

    @FindBy(how = How.ID , using ="line_item_quantity_lion")
    WebElement lion;

    @FindBy(how = How.XPATH ,using ="//tr[@class='line_item lion']/td[2]")
    WebElement lionPrice;

    @FindBy(how = How.ID , using ="line_item_quantity_elephant")
    WebElement elephant;

    @FindBy(how = How.XPATH ,using ="//tr[@class='line_item elephant']/td[2]")
    WebElement elephantPrice;

    @FindBy(how = How.ID , using ="line_item_quantity_giraffe")
    WebElement giraffe;

    @FindBy(how = How.XPATH ,using ="//tr[@class='line_item giraffe']/td[2]")
    WebElement giraffePrice;

    @FindBy(how = How.NAME , using ="state")
    WebElement state;

    @FindBy(how = How.NAME , using = "commit")
    WebElement checkout;

    public Double expectedTax;

    public void clickCheckout( String zebra, String lion, String elephant, String giraffe, String state, Double taxPercent){
        this.zebra.sendKeys(zebra);
        this.lion.sendKeys(lion);
        this.elephant.sendKeys(elephant);
        this.giraffe.sendKeys(giraffe);
        new Select(this.state).selectByVisibleText(state);
        expectedTax = taxPercent*(13.00*Integer.parseInt(zebra) + 20.00* Integer.parseInt(lion) + 35.00*Integer.parseInt(elephant) + 17.00*Integer.parseInt(giraffe));

        this.checkout.click();
    }

    public Double getExpectedTax() {
        return expectedTax;
    }

    public String getZebraPrice(){
        return this.zebraPrice.getText();
    }

    public String getElephantPrice(){
        return this.elephantPrice.getText();
    }

    public String getLionPrice(){
        return this.lionPrice.getText();
    }

    public String getGiraffePrice(){
        return this.giraffePrice.getText();
    }
}
