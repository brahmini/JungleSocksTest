package com.junglesocks.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by brahmini on 1/30/2016.
 */
public class BasePage {

    WebDriver driver;

    public void init(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
}
