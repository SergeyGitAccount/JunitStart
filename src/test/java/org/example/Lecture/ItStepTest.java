package org.example.Lecture;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ItStepTest {


    private WebDriver driver;


    @BeforeClass
    public static void init() {

        System.out.println("Init WebDriverManager");
        WebDriverManager.chromedriver().setup();

    }

    @Before
    public  void setUp() {
        System.out.println("Set up Webdriver");
        driver = new ChromeDriver();

    }

    @Test
    public void titleMustBe (){
        System.out.println("Test title");
        driver.get("http://itstep.dp.ua");
        String title = driver.getTitle();
        Assert.assertEquals("Комп’ютерна Академія ШАГ | Дніпро",title);


    }
    @After
    public void tearDown(){
        driver.quit();
        driver = null;
    }


}
