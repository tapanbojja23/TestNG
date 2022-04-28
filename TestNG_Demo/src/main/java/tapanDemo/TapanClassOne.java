package tapanDemo;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.WebDriver;

public class TapanClassOne {

    public static WebDriver driver;


    public static void main(String[] args) {

        // First option to open chrome browser
        WebDriverManager driverManager = new ChromeDriverManager();
        driverManager.setup(); // It will configure the chrome browser on particular machine

        // Second option to open chrome browser
        WebDriverManager.chromedriver().setup();



    }








}
