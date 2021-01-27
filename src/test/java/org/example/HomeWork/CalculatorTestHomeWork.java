package org.example.HomeWork;

import com.sun.org.apache.bcel.internal.generic.Select;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.example.ClassWork.TestLogger;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class CalculatorTestHomeWork {


    private WebDriver webDriver;


    @BeforeClass
    public static void init() {
        System.out.println("Init WebDriverManager");
        WebDriverManager.chromedriver().setup();

    }

    @Before
    public void setUp() {
        System.out.println("Set up WebDriver");
        webDriver = new ChromeDriver();


    }

    @Test
    public void FunctionalityOfButtons() {
        TestLogger testLogger = new TestLogger();
        testLogger.log("Open app");
        webDriver.get("D:\\ШАГ\\WebDriver\\Selenium-3\\calculator.html");
        testLogger.log("Find button C");
        WebElement btnC = webDriver.findElement(By.cssSelector("#calculator > div.top > span"));
        testLogger.log("Find area of result");
        WebElement areaOfResult = webDriver.findElement(By.cssSelector("#calculator > div.top > div"));
        testLogger.log("Write checked buttons to the list");
        List<WebElement> m = new ArrayList<>();
        m.add(webDriver.findElement(By.cssSelector(".keys > span:nth-child(1)")));
        m.add(webDriver.findElement(By.cssSelector(".keys > span:nth-child(2)")));
        m.add(webDriver.findElement(By.cssSelector(".keys > span:nth-child(3)")));
        m.add(webDriver.findElement(By.cssSelector(".keys > span:nth-child(5)")));
        m.add(webDriver.findElement(By.cssSelector(".keys > span:nth-child(6)")));
        m.add(webDriver.findElement(By.cssSelector(".keys > span:nth-child(7)")));
        m.add(webDriver.findElement(By.cssSelector(".keys > span:nth-child(8)")));
        m.add(webDriver.findElement(By.cssSelector(".keys > span:nth-child(9)")));
        m.add(webDriver.findElement(By.cssSelector(".keys > span:nth-child(10)")));
        m.add(webDriver.findElement(By.cssSelector(".keys > span:nth-child(11)")));
        m.add(webDriver.findElement(By.cssSelector(".keys > span:nth-child(13)")));
        testLogger.log("Checking the buttons");
        for (WebElement i : m) {
            i.click();
            Assert.assertEquals(i.getText(), areaOfResult.getText());
            btnC.click();
        }
    }

    @Test
    public void MathematicalOperations() {
        TestLogger testLogger = new TestLogger();
        testLogger.log("Open app");
        webDriver.get("D:\\ШАГ\\WebDriver\\Selenium-3\\calculator.html");
        testLogger.log("Find button C");
        WebElement btnC = webDriver.findElement(By.cssSelector("#calculator > div.top > span"));
        testLogger.log("Find area of result");
        WebElement areaOfResult = webDriver.findElement(By.cssSelector("#calculator > div.top > div"));
        testLogger.log("Find equally");
        WebElement equally = webDriver.findElement(By.cssSelector("#calculator > div.keys > span.eval"));
        testLogger.log("Find arithmetic operators");
        List<WebElement> arithmeticOperators = webDriver.findElements(By.className("operator"));
        testLogger.log("Find first button");
        WebElement bthFirst = webDriver.findElement(By.cssSelector("#calculator > div.keys > span:nth-child(2)"));
        testLogger.log("Find second button");
        WebElement btnSecond = webDriver.findElement(By.cssSelector("#calculator > div.keys > span:nth-child(10)"));


        testLogger.log("Click bthFirst");
        bthFirst.click();
        testLogger.log("Click plus");
        arithmeticOperators.get(0).click();
        testLogger.log("Click btnSecond");
        btnSecond.click();
        testLogger.log("Click equally");
        equally.click();
        testLogger.log("Take result");
        String result = areaOfResult.getText();
        System.out.println(result);
        testLogger.log("Check result");
        Assert.assertEquals("must be 10", "10", result);
        testLogger.log("Click reset button C");
        btnC.click();

        testLogger.log("Click bthFirst");
        bthFirst.click();
        testLogger.log("Click plus");
        arithmeticOperators.get(1).click();
        testLogger.log("Click btnSecond");
        btnSecond.click();
        testLogger.log("Click equally");
        equally.click();
        testLogger.log("Take result");
        result = areaOfResult.getText();
        System.out.println(result);
        testLogger.log("Check result");
        Assert.assertEquals("must be 6", "6", result);
        testLogger.log("Click reset button C");
        btnC.click();

        testLogger.log("Click bthFirst");
        bthFirst.click();
        testLogger.log("Click plus");
        arithmeticOperators.get(2).click();
        testLogger.log("Click btnSecond");
        btnSecond.click();
        testLogger.log("Click equally");
        equally.click();
        testLogger.log("Take result");
        result = areaOfResult.getText();
        System.out.println(result);
        testLogger.log("Check result");
        Assert.assertEquals("must be 4", "4", result);
        testLogger.log("Click reset button C");
        btnC.click();

        testLogger.log("Click bthFirst");
        bthFirst.click();
        testLogger.log("Click plus");
        arithmeticOperators.get(3).click();
        testLogger.log("Click btnSecond");
        btnSecond.click();
        testLogger.log("Click equally");
        equally.click();
        testLogger.log("Take result");
        result = areaOfResult.getText();
        System.out.println(result);
        testLogger.log("Check result");
        Assert.assertEquals("must be 16", "16", result);
        testLogger.log("Click reset button C");
        btnC.click();
    }

    @Test
    public void MathematicalOperationsPhysical() {
        TestLogger testLogger = new TestLogger();
        testLogger.log("Open app");
        webDriver.get("D:\\ШАГ\\WebDriver\\Selenium-3\\calculator.html");
        testLogger.log("Find button C");
        WebElement btnC = webDriver.findElement(By.cssSelector("#calculator > div.top > span"));
        testLogger.log("Find area of result");
        WebElement areaOfResult = webDriver.findElement(By.cssSelector("#calculator > div.top > div"));
        testLogger.log("Find equally");
        WebElement equally = webDriver.findElement(By.cssSelector("#calculator > div.keys > span.eval"));
        testLogger.log("Find dot");
        WebElement dot = webDriver.findElement(By.cssSelector("#calculator > div.keys > span:nth-child(14)"));
        testLogger.log("Find arithmetic operators");
        List<WebElement> arithmeticOperators = webDriver.findElements(By.className("operator"));
        testLogger.log("Find first button");
        WebElement bthFirst = webDriver.findElement(By.cssSelector("#calculator > div.keys > span:nth-child(2)"));
        testLogger.log("Find second button");
        WebElement btnSecond = webDriver.findElement(By.cssSelector("#calculator > div.keys > span:nth-child(10)"));

        testLogger.log("Click bthFirst");
        bthFirst.click();
        testLogger.log("Click dot");
        dot.click();
        testLogger.log("Click btnSecond");
        btnSecond.click();
        testLogger.log("Click plus");
        arithmeticOperators.get(0).click();
        testLogger.log("Click bthFirst");
        bthFirst.click();
        testLogger.log("Click dot");
        dot.click();
        testLogger.log("Click btnSecond");
        btnSecond.click();
        testLogger.log("Click plus");
        testLogger.log("Click equally");
        equally.click();
        testLogger.log("Take result");
        String result = areaOfResult.getText();
        System.out.println(result);
        testLogger.log("Check result");
        Assert.assertEquals("must be 16.4", "16.4", result);
        testLogger.log("Click reset button C");
        btnC.click();

        testLogger.log("Click bthFirst");
        bthFirst.click();
        testLogger.log("Click dot");
        dot.click();
        testLogger.log("Click btnSecond");
        btnSecond.click();
        testLogger.log("Click plus");
        arithmeticOperators.get(1).click();
        testLogger.log("Click bthFirst");
        bthFirst.click();
        testLogger.log("Click dot");
        dot.click();
        testLogger.log("Click btnSecond");
        btnSecond.click();
        testLogger.log("Click plus");
        testLogger.log("Click equally");
        equally.click();
        testLogger.log("Take result");
        result = areaOfResult.getText();
        System.out.println(result);
        testLogger.log("Check result");
        Assert.assertEquals("must be 0", "0", result);
        testLogger.log("Click reset button C");
        btnC.click();

        testLogger.log("Click bthFirst");
        bthFirst.click();
        testLogger.log("Click dot");
        dot.click();
        testLogger.log("Click btnSecond");
        btnSecond.click();
        testLogger.log("Click plus");
        arithmeticOperators.get(2).click();
        testLogger.log("Click bthFirst");
        bthFirst.click();
        testLogger.log("Click dot");
        dot.click();
        testLogger.log("Click btnSecond");
        btnSecond.click();
        testLogger.log("Click plus");
        testLogger.log("Click equally");
        equally.click();
        testLogger.log("Take result");
        result = areaOfResult.getText();
        System.out.println(result);
        testLogger.log("Check result");
        Assert.assertEquals("must be 1", "1", result);
        testLogger.log("Click reset button C");
        btnC.click();

        testLogger.log("Click bthFirst");
        bthFirst.click();
        testLogger.log("Click dot");
        dot.click();
        testLogger.log("Click btnSecond");
        btnSecond.click();
        testLogger.log("Click plus");
        arithmeticOperators.get(3).click();
        testLogger.log("Click bthFirst");
        bthFirst.click();
        testLogger.log("Click dot");
        dot.click();
        testLogger.log("Click btnSecond");
        btnSecond.click();
        testLogger.log("Click plus");
        testLogger.log("Click equally");
        equally.click();
        testLogger.log("Take result");
        result = areaOfResult.getText();
        System.out.println(result);
        testLogger.log("Check result");
        Assert.assertEquals("must be 67.24", "67.24", result);
        testLogger.log("Click reset button C");
        btnC.click();




    }


    public void quitBroweser() {
        webDriver.quit();
        webDriver = null;
    }


}
