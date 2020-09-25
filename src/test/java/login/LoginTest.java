package login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LoginTest {
    //import the selenium webDriver
    private WebDriver driver;
    //import the chromeDriver
    public void setUp() throws InterruptedException {
        System.setProperty ("webdriver.chrome.driver", "C:\\Users\\SOREMI TAIWO OLAMIDE\\Documents\\facebook_automation_test\\Resources\\chromedriver.exe");
        driver = new ChromeDriver();
        //input project URL = facebook login URL
        driver.get ("https://www.facebook.com/");
        //waiting for globally
        driver.manage ().timeouts ().implicitlyWait (10, TimeUnit.SECONDS);
        //maximize the window
        driver.manage ().window ().maximize ();
        //get page title
        System.out.println (driver.getTitle ());
        //locate username field
        driver.findElement (By.xpath ("//*[@id=\"email\"]")).sendKeys ("Too_great1@yahoo.com");
        //locate password field
        driver.findElement (By.xpath ("//*[@id=\"pass\"]")).sendKeys ("Olamide1221");
        //click on sign in button
        driver.findElement (By.xpath ("/html/body/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/form/div[2]/button")).click ();
        Thread.sleep (10000);
        //close the browser after test
        driver.quit();
    }

        //initiate the test run command
        public static void main(String[] args) throws InterruptedException {
        LoginTest test = new LoginTest ();
        test.setUp ();
    }
}
