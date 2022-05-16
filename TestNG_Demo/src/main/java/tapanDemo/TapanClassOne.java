package tapanDemo;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TapanClassOne {

    public static WebDriver driver;


    public static void openBrowser() {

        /*
        // First option to open chrome browser
        WebDriverManager driverManager = new ChromeDriverManager();
        driverManager.setup(); // It will configure the chrome browser on particular machine

        // Second option to open chrome browser
        WebDriverManager.chromedriver().setup();
*/
    }

        @Test(priority = 0, enabled = false)
        public void methodOne(){
            System.out.println("In methodOne");
        }

        public void methodTwo(){
            System.out.println("In methodTwo");
        }

        public void methodThree(){
            System.out.println("In methodThree");
        }

        @Test(priority = 2, enabled = false)
        public void methodFour(){
            System.out.println("In methodFour");
        }

        public void methodFive(){
            System.out.println("In methodFive");
        }

                @Test(priority = 0, enabled = true, invocationCount = 5) //dependsOnMethods = {"methodFour"}
        public void methodSix(){
            System.out.println("In methodSix");
        }

        public void methodSeven(){
            System.out.println("In methodSeven");
        }

        @Test(priority = 1, enabled = false) // it will not execute if enabled set to false
        public void methodEight(){
            System.out.println("In methodEight");
        }

        @BeforeClass // it will execute at very first every time
        public void methodNine(){
            System.out.println("In methodNine");
        }
        @Test
        public void methodTen(){
            System.out.println("In methodTen");
        }

}

