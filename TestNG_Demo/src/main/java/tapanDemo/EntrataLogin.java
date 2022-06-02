package tapanDemo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class EntrataLogin {



    public static void main(String[] args) throws IOException {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        File file = new File("D:\\TestNG\\TestNG_Demo\\Xpath.properties");
        FileInputStream fis = new FileInputStream(file);
        Properties pr = new Properties();
        pr.load(fis);

        System.out.println(pr.getProperty("Dropdown"));


        driver.findElement(By.xpath(pr.getProperty("Dropdown1")));



    }

}
