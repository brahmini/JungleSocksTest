package com.junglesocks.helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.concurrent.TimeUnit;
/**
 * Created by brahmini on 1/30/2016.
 */
public class BrowserFactory {

    static WebDriver driver;

    public static WebDriver startBrowser(String browserName , String url ){

        if(browserName.equals("firefox")){
            driver = new FirefoxDriver();
        }else if(browserName.equals("chrome")){
            //TODO set property for chrome driver
            //System.setProperty("webdriver.chrome.driver", "C:\\Users\\brahmini\\Downloads\\chromedriver_win32\\chromedriver.exe");
            driver = new ChromeDriver();
        }else if(browserName.equals("unit")){
            driver = new HtmlUnitDriver();
        }else if(browserName.equalsIgnoreCase("IE")){
            driver = new InternetExplorerDriver();
        }else{
            driver = new HtmlUnitDriver();
        }

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        driver.get(url);

        return driver;
    }
}


