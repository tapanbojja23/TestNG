package tapanDemo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.sql.DriverManager;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class PracticeOne {
    public static WebDriver driver;

    public static void main(String[] args) {
          openUrl();
    }

    @Test(priority = 0)
    public static void openUrl(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://demoqa.com/");
        driver.manage().window().maximize();
        System.out.println("I am in openUrl");


        //WebElement menu = driver.findElement(By.xpath("//div[@class='card mt-4 top-card']"));
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); //implicit wait
       // driver.findElement(By.xpath("//div[@class='card mt-4 top-card']//div[@class=\"card-body\"]//h5[contains(text(),'Alerts, Frame & Windows')]"));

        /*
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("//div[@class='card mt-4 top-card']//div[@class=\"card-body\"]//h5[contains(text(),'Alerts, Frame & Windows')]).click()");

*/
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(By.xpath("//div[@class='card mt-4 top-card']//div[@class=\"card-body\"]//h5[contains(text(),'Alerts, Frame & Windows')]"))).click().build().perform();
       // action.moveToElement(driver.findElement(By.xpath("//div[@class='card mt-4 top-card']//div[@class=\"card-body\"]//h5[contains(text(),'Interactions')]"))).click().build().perform();



        System.out.println("Clicking Alerts Div");



    } // End of openUrl

   /*
   @Test(priority = 1)
    public static void checkElements(){
        // check element with h5 tag
        // xpath madhe get text to get the element, save all elements in a list, print with for loop,
        //

        driver.findElement(By.xpath("card mt-4 top-card")).click();
        System.out.println("I am in checkElements");
    } // End of checkElements
    */



} // End of PracticeOne
