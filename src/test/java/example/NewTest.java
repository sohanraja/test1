package example;		

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;		
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;		
import org.testng.annotations.Test;	
import org.testng.annotations.BeforeTest;	
import org.testng.annotations.AfterTest;		
import java.io.BufferedWriter;                  
import java.io.File;                          
import java.io.FileWriter;                             
import java.util.concurrent.TimeUnit;                    
import java.io.IOException;
                       
import org.openqa.selenium.Cookie;                     

public class NewTest {		
    
    @Test
    public static void main(String[] args) {
        // declaration and instantiation of objects/variables
    	WebDriver driver ;
    	System.setProperty("webdriver.firefox.marionette","geckodriver");
    	driver = new FirefoxDriver();
        String baseUrl = "http://dvps-fd-vm13688.cloudapp.net:8090/";
        String expectedTitle = "License - Liferay DXP";
        String actualTitle = "";

        // launch Fire fox and direct it to the Base URL
        driver.get(baseUrl);
		

        // get the actual value of the title
        actualTitle = driver.getTitle();

        /*
         * compare the actual title of the page with the expected one and print
         * the result as "Passed" or "Failed"
         */
        if (actualTitle.contentEquals(expectedTitle)){
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed");
        }
       
        //close Fire fox
        driver.close();
       
        // exit the program explicitly
        System.exit(0);
                        }                          
                                    
    }
