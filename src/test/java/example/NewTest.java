package example;		

//import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;		
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
	
import org.testng.annotations.Test;	
//import org.testng.Assert;
                       
//import org.openqa.selenium.Cookie;                     

public class NewTest {			
	
	public static String driverPath = "C:\\Users\\SGARG5\\Downloads\\";
	 public static WebDriver driver;
	
	 @Test()
    public static void main(String[] args) {
        // declaration and instantiation of objects/variables
    	WebDriver driver ;
    	System.out.println("launching chrome browser");
		System.setProperty("webdriver.chrome.driver", driverPath+"chromedriver.exe");
  
    	driver = new ChromeDriver();
    	driver.navigate().to("http://google.com");
        String baseUrl = "http://google.com/";
        String expectedTitle = "Google";
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
