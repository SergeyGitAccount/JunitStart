package org.example.ClassWork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalculatorTest {

    private WebDriver webDriver;


    @BeforeClass
    public static void init(){
        System.out.println("Init WebdriverManager");
        WebDriverManager.chromedriver().setup();

    }
    @Before
    public void setUp(){
        System.out.println("Set up WebDriver");
        webDriver = new ChromeDriver();

    }
    @Test
    public void checkTitle() throws InterruptedException {
        System.out.println("Test title");
        System.out.println("Open site");
        webDriver.get("D:\\ШАГ\\WebDriver\\Selenium-3\\calculator.html");
        Thread.sleep(5000);
        System.out.println("Get title");
        String stringTitle = webDriver.getTitle();
        System.out.println("Check title");
        Assert.assertEquals("Simple calculator for testing",stringTitle );
    }

    @After
    public void quitBrowser(){
        webDriver.quit();
        webDriver = null;

    }
}
