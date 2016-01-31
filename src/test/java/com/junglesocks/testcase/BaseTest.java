package com.junglesocks.testcase;

import com.junglesocks.helper.BrowserFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

/**
 * Created by brahmini on 1/30/2016.
 */
public class BaseTest {

    WebDriver driver;

    @BeforeTest
    public void init(){
        driver = BrowserFactory.startBrowser("unit", "https://jungle-socks.herokuapp.com");
    }

    @AfterTest
    public void cleanup(){
        driver.close();
        driver.quit();

    }

    @DataProvider(name = "productDataProvider")
    public Object[][] productDataProvider(){
        return new Object[][]{};
    }

    @DataProvider(name = "stateTaxDataProvider")
    public Object[][] stateTaxDataProvider() {
        return new Object[][]{
                {"Alabama" , 0.05},
                {"Alaska" , 0.05},
                {"Arizona" , 0.05},
                {"Arkansas" , 0.05},
                {"California" , 0.08},
                {"Colorado" , 0.05},
                {"Connecticut" , 0.05},
                {"Delaware" , 0.05},
                {"Florida" , 0.05},
                {"Georgia" , 0.05},
                {"Hawaii" , 0.05},
                {"Idaho" , 0.05},
                {"Illinois" , 0.05},
                {"Indiana" , 0.05},
                {"Iowa" , 0.05},
                {"Kansas" , 0.05},
                {"Kentucky" , 0.05},
                {"Louisiana" , 0.05},
                {"Maine" , 0.05},
                {"Maryland" , 0.05},
                {"Massachusetts" , 0.05},
                {"Michigan" , 0.05},
                {"Minnesota" , 0.00},
                {"Mississippi" , 0.05},
                {"Missouri" , 0.05},
                {"Montana" , 0.05},
                {"Nebraska" , 0.05},
                {"Nevada" , 0.05},
                {"New Hampshire" , 0.05},
                {"New Jersey" , 0.05},
                {"New Mexico" , 0.05},
                {"New York" , 0.06},
                {"North Carolina" , 0.05},
                {"North Dakota" , 0.05},
                {"Ohio" , 0.05},
                {"Oklahoma" , 0.05},
                {"Oregon" , 0.05},
                {"Pennsylvania" , 0.05},
                {"Rhode Island" , 0.05},
                {"South Carolina" , 0.05},
                {"South Dakota" , 0.05},
                {"Tennessee" , 0.05},
                {"Texas" , 0.05},
                {"Utah" , 0.05},
                {"Vermont" , 0.05},
                {"Virginia" , 0.05},
                {"Washington" , 0.05},
                {"West Virginia" , 0.05},
                {"Wisconsin" , 0.05},
                {"Wyoming" , 0.05}
        };

    /*    return new Object[][] {
                 {"AL" ,  0.05}
                ,{"AK" ,  0.05}
                ,{"AZ" ,  0.05}
                ,{"AR" ,  0.05}
                ,{"CA" ,  0.08}
                ,{"CO" ,  0.05}
                ,{"CT" ,  0.05}
                ,{"DE" ,  0.05}
                ,{"FL" ,  0.05}
                ,{"GA" ,  0.05}
                ,{"HI" ,  0.05}
                ,{"ID" ,  0.05}
                ,{"IL" ,  0.05}
                ,{"IN" ,  0.05}
                ,{"IA" ,  0.05}
                ,{"KS" ,  0.05}
                ,{"KY" ,  0.05}
                ,{"LA" ,  0.05}
                ,{"ME" ,  0.05}
                ,{"MD" ,  0.05}
                ,{"MA" ,  0.05}
                ,{"MI" ,  0.05}
                ,{"MN" ,  0.00}
                ,{"MS" ,  0.05}
                ,{"MO" ,  0.05}
                ,{"MT" ,  0.05}
                ,{"NE" ,  0.05}
                ,{"NV" ,  0.05}
                ,{"NH" ,  0.05}
                ,{"NJ" ,  0.05}
                ,{"NM" ,  0.05}
                ,{"NY" ,  0.06}
                ,{"NC" ,  0.05}
                ,{"ND" ,  0.05}
                ,{"OH" ,  0.05}
                ,{"OK" ,  0.05}
                ,{"OR" ,  0.05}
                ,{"PA" ,  0.05}
                ,{"RI" ,  0.05}
                ,{"SC" ,  0.05}
                ,{"SD" ,  0.05}
                ,{"TN" ,  0.05}
                ,{"TX" ,  0.05}
                ,{"UT" ,  0.05}
                ,{"VT" ,  0.05}
                ,{"VA" ,  0.05}
                ,{"WA" ,  0.05}
                ,{"WV" ,  0.05}
                ,{"WI" ,  0.05}
                ,{"WY" ,  0.05}
        };*/
    }
}
