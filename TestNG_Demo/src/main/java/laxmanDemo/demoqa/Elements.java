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

    public static WebDriver driver;
    /*public void openBrowser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }*/
    @Test
    public void openurl() {
        driver.get("https://demoqa.com/");
    }
    @Test
    public void closeBrowser() {
        driver.quit();
    }



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

    String checkBoxTab= "//span[text()='Check Box' and @class='text']";
    String expandAll= "//*[@title='Expand all']";
    String collapsAll= "//*[@title='Collapse all']";
    String checkAllCheckBoxes = "//li[@class='rct-node rct-node-leaf']//span[@class='rct-title']";
    String checkAllCheckBoxes1 ="//span[@class='rct-title']";
    String listCheckAllCheckbox ="//*[@class='rct-node rct-node-parent rct-node-expanded']";
    String DesktopCheckbox= "//span[@class='rct-title' and text()='Desktop']";
    String NotesCheckboxTab= "//span[@class='rct-title' and text()='Notes']";

    @Test
    public void checkboxTabFunctionality() throws InterruptedException {
        driver.findElement(By.cssSelector(elementsTab)).click();
        System.out.println("clicked on element tab");
        driver.findElement(By.xpath(checkboxTab)).click();
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

        List<WebElement> list = driver.findElements(By.xpath(checkAllCheckBoxes1));

        for (WebElement str : list) {
            if (str.getText().equalsIgnoreCase("Notes")) {
                System.out.println("Inside if" + str.getText());
                str.click();
                Thread.sleep(5000);

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

        String yesRadioButton="//label[@for='yesRadio']";
        String impressiveRadioButton="//label[@for='impressiveRadio']";
        String NoRadioButton="//label[@for='noRadio']";

        @Test
        public void radioButtonFunctionality() throws InterruptedException {
            driver.findElement(By.cssSelector(elementsTab)).click();
            driver.findElement(By.xpath(radioButtonTab)).click();
            driver.findElement(By.xpath(yesRadioButton)).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath(impressiveRadioButton)).click();
            Thread.sleep(2000);

        }


        String addButton="#addNewRecordButton";
        String firstNameTextBox="#firstName";
        String lastNameTextBox="#lastName";
        String emailWebTablesTextBox="#userEmail";
        String ageTextBox="#age";
        String salaryTextBox="#salary";
        String departmentTextBox="#department";
        String webTableSubmitButton="#submit";
        String editWebTableButton="//div[@class='ReactTable -striped -highlight']//*[text()='Laxman@gmail.lcl']/following-sibling::div/div//span[@title='Edit']";
        String deleteWebTableButton="//div[@class='ReactTable -striped -highlight']//*[text()='Laxman@gmail.lcl']/following-sibling::div/div//span[@title='Delete']";

        @Test
        public void webTablesFunctionality() throws InterruptedException {
            driver.findElement(By.cssSelector(elementsTab)).click();
            driver.findElement(By.xpath(webTablesTab)).click();
            driver.findElement(By.cssSelector(addButton)).click();
            Thread.sleep(2000);
            driver.findElement(By.cssSelector(firstNameTextBox)).sendKeys("Laxman");
            Thread.sleep(2000);
            driver.findElement(By.cssSelector(lastNameTextBox)).sendKeys("Waghmare");
            Thread.sleep(2000);
            driver.findElement(By.cssSelector(emailWebTablesTextBox)).sendKeys("Laxman@gmail.lcl");
            Thread.sleep(2000);
            driver.findElement(By.cssSelector(ageTextBox)).sendKeys("36");
            Thread.sleep(2000);
            driver.findElement(By.cssSelector(salaryTextBox)).sendKeys("2000");
            Thread.sleep(2000);
            driver.findElement(By.cssSelector(departmentTextBox)).sendKeys("QA");
            Thread.sleep(2000);
            driver.findElement(By.cssSelector(webTableSubmitButton)).click();
            Thread.sleep(2000);

            driver.findElement(By.xpath(editWebTableButton)).click();
            Thread.sleep(2000);
            driver.findElement(By.cssSelector(salaryTextBox)).clear();
            Thread.sleep(2000);
            driver.findElement(By.cssSelector(salaryTextBox)).sendKeys("3000");
            Thread.sleep(2000);
            driver.findElement(By.cssSelector(webTableSubmitButton)).click();
            Thread.sleep(2000);

            driver.findElement(By.xpath(deleteWebTableButton)).click();
            Thread.sleep(2000);

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
                //el.checkboxTabFunctionality();
                //el.radioButtonFunctionality();
                el.webTablesFunctionality();

                el.closeBrowser();
            }


        }
