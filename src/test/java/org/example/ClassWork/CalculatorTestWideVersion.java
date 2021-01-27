package org.example.ClassWork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalculatorTestWideVersion {

    private WebDriver webDriver;



    @BeforeClass
    public static void init() {
        System.out.println("Init WebDriverManager");
        WebDriverManager.chromedriver().setup();

    }

//  TODO  перед каждым новым тестом создаем новый єкземпляр драйвера и прописываем @Before

    @Before
    public void setUp() {
        System.out.println("Set up WebDriver");
        webDriver = new ChromeDriver();
        System.out.println("Open site");
        webDriver.get("D:\\ШАГ\\WebDriver\\Selenium-3\\calculator.html");


    }

    @Test
    public void checkCalculatorResult() throws InterruptedException {
        Thread.sleep(2000);
        TestLogger testLogger = new TestLogger();
        testLogger.log("Get title");
        String stringTitle = webDriver.getTitle();
        testLogger.log("Check title");
        Assert.assertEquals("Simple calculator for testing", stringTitle);
        testLogger.log("Click button");
        WebElement webElement = webDriver.findElement(By.cssSelector("#calculator > div.keys > span:nth-child(10)"));
        webElement.click();
        testLogger.log("Click button");
        WebElement webElement2 = webDriver.findElement(By.cssSelector("#calculator > div.keys > span:nth-child(4)"));
        webElement2.click();
        testLogger.log("Click button");
        webElement = webDriver.findElement(By.cssSelector("#calculator > div.keys > span:nth-child(10)"));
        webElement.click();
        testLogger.log("Click button");
        WebElement btn = webDriver.findElement(By.cssSelector(" #calculator > div.keys > span.eval"));
        btn.click();
        testLogger.log("Check result");
        WebElement res = webDriver.findElement(By.cssSelector("#calculator > div.top > div"));
        String result = res.getText();
        Assert.assertEquals("4", result);



    }

    @Test
    public void clearButtonClick() throws InterruptedException {
        TestLogger testLogger = new TestLogger();
        Thread.sleep(2000);
        testLogger.log("Find button c");
        WebElement btnC = webDriver.findElement(By.cssSelector("#calculator > div.top > span"));
        testLogger.log("Find area of results");
        WebElement area = webDriver.findElement(By.cssSelector("#calculator > div.top > div"));
        testLogger.log("Pres button c");
        btnC.click();
        Thread.sleep(2000);
        testLogger.log("Check area");
        Assert.assertEquals("", area.getText());
        testLogger.log("Find button 7");
        WebElement btn7 = webDriver.findElement(By.cssSelector("#calculator > div.keys > span:nth-child(1)"));
        testLogger.log("Check button");
        Assert.assertEquals("must be 7", "7", btn7.getText());
        testLogger.log("Press button 7");
        Thread.sleep(2000);
        btn7.click();
        Assert.assertEquals("7", area.getText());
        testLogger.log("Cleaning for our aria press button c");
        Thread.sleep(2000);
        btnC.click();
        testLogger.log("Check area");
        Assert.assertEquals("", area.getText());

    }


    @After
    public void quitBrowser() {
        webDriver.quit();
        webDriver = null;

    }
}
