package laxmanDemo.demoqa;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;

public class Elements {

    String elementsTab = "div.card.mt-4.top-card:nth-child(1)";
    String innerElementsTab = "div.element-group:nth-child(1)";
    //div[@class='element-group']//span[@class='pr-1'])[1]

    String formsTab = "//h5[contains(text(),'Forms')]";
    String alertsFrameWindowsTab = "//h5[contains(text(),'Alerts, Frame & Windows')]";
    String WidgetsTab = "//h5[contains(text(),'Widgets')]";
    String interactionsTab = "//h5[contains(text(),'Interactions')]";
    String bookStoreApplicationTab = "//h5[contains(text(),'Book Store Application')]";


    String textboxTab = "//span[text()='Text Box']";
    String checkboxTab ="//span[text()='Check Box']";
    String radioButtonTab ="//span[text()='Radio Button']";
    String webTablesTab ="//span[text()='Web Tables']";
    String buttonsTab ="//span[text()='Buttons']";
    String linkTab ="//span[text()='Links']";
    String brokenlinkTab ="//span[text()='Broken Links - Images']";
    String uploadAndDownloadTab ="//span[text()='Upload and Download']";
    String dynamicPropertiesTab ="//span[text()='Dynamic Properties']";


    String fullNameTextBox = "//input[@id='userName']";
    String emailTextBox = "//input[@id='userEmail']";
    String currentAddressTextArea = "//textarea[@id='currentAddress']";
    String permanentAddressTextArea = "//textarea[@id='permanentAddress']";
    String submitButton= "//button[@id='submit']";


    String checkBoxTab= "//span[text()='Check Box' and @class='text']";
    String expandAll= "//*[@title='Expand all']";
    String collapsAll= "//*[@title='Collapse all']";
    String checkAllCheckBoxes= "//li[@class='rct-node rct-node-leaf']//span[@class='rct-title']";
    String listCheckAllCheckbox ="//*[@class='rct-node rct-node-parent rct-node-expanded']";
    String DesktopCheckbox= "//span[@class='rct-title' and text()='Desktop']";
    String NotesCheckboxTab= "//span[@class='rct-title' and text()='Notes']";








    public static WebDriver driver;
    /*public void openBrowser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();


    }*/
    @Test
    public void closeBrowser() {
        driver.quit();
    }
    @Test
    public void openurl() {
        driver.get("https://demoqa.com/");
    }
    @Test
    public void textBoxTabFunctionality() throws InterruptedException {
        driver.findElement(By.cssSelector(elementsTab)).click();
        driver.findElement(By.xpath(textboxTab)).click();
        driver.findElement(By.xpath(fullNameTextBox)).sendKeys("Laxman Waghmare");
        driver.findElement(By.xpath(emailTextBox)).sendKeys("Laxman@waghmare.lcl");
        driver.findElement(By.xpath(currentAddressTextArea)).sendKeys("LaxmanWaghmarecurrentaddress");
        driver.findElement(By.xpath(permanentAddressTextArea)).sendKeys("Laxman Waghmare permanent address");
        Actions a = new Actions(driver);
        WebElement we =  driver.findElement(By.xpath(submitButton));


    a.moveToElement(we).click().build().perform();


       // driver.findElement(By.xpath(submitButton)).click();
        Thread.sleep(5000);
        System.out.println("Text box functionality working fine");


    }
    @Test
    public void checkboxTabFunctionality() throws InterruptedException {
        driver.findElement(By.cssSelector(elementsTab)).click();
        System.out.println("clicked on element tab");
        driver.findElement(By.xpath(checkBoxTab)).click();
        System.out.println("Clicked on Checkbox tab");
        Thread.sleep(2000);
        driver.findElement(By.xpath(expandAll)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(collapsAll)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(expandAll)).click();
//        driver.findElement(By.xpath(DesktopCheckbox)).click();
//        Thread.sleep(5000);
//        driver.findElement(By.xpath(DesktopCheckbox)).click();
//        Thread.sleep(5000);
//        driver.findElement(By.xpath(NotesCheckboxTab)).click();
//        Thread.sleep(5000);



        List<WebElement> list = driver.findElements(By.xpath(listCheckAllCheckbox));

        for (WebElement str:list) {
            if(str.getText().equalsIgnoreCase("Notes"))
            {
                System.out.println("Inside if"+str.getText());
                str.click();
            }


        }


     /*   for (int i = 0; i <= list.size() - 1; i++) {
            System.out.println(list.get(i).getText());

            if (list.get(i).getText().equalsIgnoreCase("Notes")) {
                System.out.println("inside ");
                list.get(i).click();
                Thread.sleep(5000);
                System.out.println("outside ");

                break;
            }

        }*/
    }
            @Test
            public void test () throws InterruptedException {
                Elements el = new Elements();
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                driver.manage().window().maximize();


                // el.openBrowser();
                el.openurl();
                //el.textBoxTabFunctionality();
                el.checkboxTabFunctionality();
                el.closeBrowser();
            }


        }
