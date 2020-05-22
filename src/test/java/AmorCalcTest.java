// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;

public class AmorCalcTest {
    private WebDriver driver;
    private Map <String, Object> vars;
    JavascriptExecutor js;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
        driver = new ChromeDriver();
        js = (JavascriptExecutor) driver;
        vars = new HashMap <String, Object>();
    }

    @After
    public void tearDown() {
        driver.quit();
    }
    @Test
    public void amorCalc0() {
        driver.get("https://www.calculator.net/");
        driver.manage().window().setSize(new Dimension(819, 447));
        driver.findElement(By.linkText("Amortization Calculator")).click();
        driver.findElement(By.cssSelector("input:nth-child(2)")).click();
        assertThat(driver.findElement(By.cssSelector("td:nth-child(2) > table")).getText(), is("Total of 180 Loan Payments $303,788.46\\\\nTotal Interest $103,788.46"));
        driver.findElement(By.cssSelector("table:nth-child(4) > tbody > tr > td:nth-child(2)")).click();
    }
    @Test
    public void amorCalc1() {
        driver.get("https://www.calculator.net/");
        driver.manage().window().setSize(new Dimension(819, 447));
        driver.findElement(By.linkText("Amortization Calculator")).click();
        driver.findElement(By.id("cloanamount")).click();
        driver.findElement(By.id("cloanamount")).sendKeys("300000");
        driver.findElement(By.id("cloanterm")).click();
        driver.findElement(By.id("cloanterm")).sendKeys("8");
        driver.findElement(By.id("cinterestrate")).click();
        driver.findElement(By.id("cinterestrate")).sendKeys("7");
        driver.findElement(By.cssSelector("input:nth-child(2)")).click();
        assertThat(driver.findElement(By.cssSelector(".h2result")).getText(), is("Monthly Pay:   $4,090.12"));
        driver.findElement(By.cssSelector(".h2result")).click();
    }
    @Test
    public void amorCalc2() {
        driver.get("https://www.calculator.net/");
        driver.manage().window().setSize(new Dimension(819, 447));
        driver.findElement(By.linkText("Amortization Calculator")).click();
        driver.findElement(By.id("cloanamount")).click();
        driver.findElement(By.id("cloanamount")).sendKeys("400000");
        driver.findElement(By.id("cloanterm")).click();
        driver.findElement(By.id("cloanterm")).sendKeys("9");
        driver.findElement(By.id("cinterestrate")).click();
        driver.findElement(By.cssSelector("input:nth-child(2)")).click();
        assertThat(driver.findElement(By.cssSelector("table:nth-child(4) > tbody > tr > td:nth-child(1)")).getText(), is("Loan Amount\\\\nLoan Term years\\\\nInterest Rate (APR)"));
        driver.findElement(By.cssSelector(".h2result")).click();
        assertThat(driver.findElement(By.cssSelector(".h2result")).getText(), is("Monthly Pay:   $4,802.30"));
    }
    @Test
    public void amorCalc3() {
        driver.get("https://www.calculator.net/");
        driver.manage().window().setSize(new Dimension(819, 447));
        driver.findElement(By.linkText("Amortization Calculator")).click();
        driver.findElement(By.id("cloanamount")).click();
        driver.findElement(By.id("cloanamount")).sendKeys("600000");
        driver.findElement(By.id("cloanterm")).click();
        driver.findElement(By.id("cloanterm")).sendKeys("11");
        driver.findElement(By.id("cinterestrate")).click();
        driver.findElement(By.id("cinterestrate")).sendKeys("4");
        driver.findElement(By.cssSelector("input:nth-child(2)")).click();
        assertThat(driver.findElement(By.cssSelector(".h2result")).getText(), is("Monthly Pay:   $5,626.00"));
        driver.findElement(By.cssSelector("table:nth-child(4)")).click();
        assertThat(driver.findElement(By.cssSelector("table:nth-child(4)")).getText(), is("Loan Amount\\\\nLoan Term years\\\\nInterest Rate (APR)\\\\nMonthly Pay:   $5,626.00\\\\nTotal of 132 Loan Payments $742,632.41\\\\nTotal Interest $142,632.41"));
        driver.findElement(By.cssSelector("table:nth-child(4) > tbody > tr > td:nth-child(2)")).click();
        driver.findElement(By.cssSelector("table:nth-child(4) > tbody > tr > td:nth-child(2)")).click();
    }


    @Test
    public void amorCalc5() {
        driver.get("https://www.calculator.net/");
        driver.manage().window().setSize(new Dimension(819, 447));
        driver.findElement(By.linkText("Amortization Calculator")).click();
        driver.findElement(By.id("cloanamount")).click();
        driver.findElement(By.id("cloanamount")).sendKeys("560000");
        driver.findElement(By.id("cloanterm")).click();
        driver.findElement(By.id("cloanterm")).sendKeys("12");
        driver.findElement(By.id("cinterestrate")).click();
        driver.findElement(By.id("cinterestrate")).sendKeys("5");
        driver.findElement(By.cssSelector("input:nth-child(2)")).click();
        assertThat(driver.findElement(By.cssSelector(".h2result")).getText(), is("Monthly Pay:   $5,179.39"));
        driver.findElement(By.cssSelector("table:nth-child(4) > tbody > tr > td:nth-child(1)")).click();
        assertThat(driver.findElement(By.cssSelector("table:nth-child(4) > tbody > tr > td:nth-child(1)")).getText(), is("Loan Amount\\\\nLoan Term years\\\\nInterest Rate (APR)"));
    }
    @Test
    public void amorCalc6() {
        driver.get("https://www.calculator.net/");
        driver.manage().window().setSize(new Dimension(819, 447));
        driver.findElement(By.linkText("Amortization Calculator")).click();
        driver.findElement(By.id("cloanamount")).click();
        driver.findElement(By.id("cloanamount")).sendKeys("780000");
        driver.findElement(By.id("cloanterm")).click();
        driver.findElement(By.id("cloanterm")).sendKeys("17");
        driver.findElement(By.id("cinterestrate")).click();
        driver.findElement(By.id("cinterestrate")).sendKeys("4");
        driver.findElement(By.cssSelector("input:nth-child(2)")).click();
        assertThat(driver.findElement(By.cssSelector(".h2result")).getText(), is("Monthly Pay:   $5,275.87"));
        driver.findElement(By.cssSelector("table:nth-child(2) > tbody:nth-child(1) > tr:nth-child(1) > td:nth-child(1)")).click();
        assertThat(driver.findElement(By.cssSelector("table:nth-child(2) > tbody:nth-child(1) > tr:nth-child(1) > td:nth-child(1)")).getText(), is("Total of 204 Loan Payments"));
    }
    @Test
    public void amorCalc7() {
        driver.get("https://www.calculator.net/");
        driver.manage().window().setSize(new Dimension(819, 447));
        driver.findElement(By.linkText("Amortization Calculator")).click();
        driver.findElement(By.id("cloanamount")).click();
        driver.findElement(By.id("cloanamount")).sendKeys("20000");
        driver.findElement(By.id("cloanterm")).click();
        driver.findElement(By.id("cloanterm")).sendKeys("11");
        driver.findElement(By.id("cinterestrate")).click();
        driver.findElement(By.id("cinterestrate")).sendKeys("12");
        driver.findElement(By.cssSelector("input:nth-child(2)")).click();
        assertThat(driver.findElement(By.cssSelector(".h2result")).getText(), is("Monthly Pay:   $273.56"));
        assertThat(driver.findElement(By.cssSelector("table:nth-child(2) > tbody:nth-child(1) > tr:nth-child(1) > td:nth-child(1)")).getText(), is("Total of 132 Loan Payments"));
    }
    @Test
    public void amorCalc8() {
        driver.get("https://www.calculator.net/");
        driver.manage().window().setSize(new Dimension(819, 447));
        driver.findElement(By.linkText("Amortization Calculator")).click();
        driver.findElement(By.id("cloanamount")).click();
        driver.findElement(By.id("cloanamount")).sendKeys("230000");
        driver.findElement(By.id("cloanterm")).click();
        driver.findElement(By.id("cloanterm")).sendKeys("12");
        driver.findElement(By.id("cinterestrate")).click();
        driver.findElement(By.id("cinterestrate")).sendKeys("5");
        driver.findElement(By.cssSelector("input:nth-child(2)")).click();
        assertThat(driver.findElement(By.cssSelector(".h2result")).getText(), is("Monthly Pay:   $2,127.25"));
        driver.findElement(By.cssSelector("table:nth-child(2) > tbody:nth-child(1) > tr:nth-child(1) > td:nth-child(1)")).click();
        assertThat(driver.findElement(By.cssSelector("table:nth-child(2) > tbody:nth-child(1) > tr:nth-child(1) > td:nth-child(1)")).getText(), is("Total of 144 Loan Payments"));
        driver.findElement(By.cssSelector("table:nth-child(2) > tbody:nth-child(1) > tr:nth-child(2) > td:nth-child(1)")).click();
        assertThat(driver.findElement(By.cssSelector("table:nth-child(2) > tbody:nth-child(1) > tr:nth-child(2) > td:nth-child(1)")).getText(), is("Total Interest"));
    }
    @Test
    public void amorCalc9() {
        driver.get("https://www.calculator.net/");
        driver.manage().window().setSize(new Dimension(819, 447));
        driver.findElement(By.linkText("Amortization Calculator")).click();
        driver.findElement(By.id("cloanamount")).click();
        driver.findElement(By.id("cloanamount")).sendKeys("160000");
        driver.findElement(By.id("cloanterm")).click();
        driver.findElement(By.id("cloanterm")).sendKeys("10");
        driver.findElement(By.id("cinterestrate")).click();
        driver.findElement(By.id("cinterestrate")).sendKeys("9");
        driver.findElement(By.cssSelector("input:nth-child(2)")).click();
        assertThat(driver.findElement(By.cssSelector(".h2result")).getText(), is("Monthly Pay:   $2,026.81"));
        driver.findElement(By.cssSelector("table:nth-child(2) > tbody:nth-child(1) > tr:nth-child(1) > td:nth-child(1)")).click();
        assertThat(driver.findElement(By.cssSelector("table:nth-child(2) > tbody:nth-child(1) > tr:nth-child(1) > td:nth-child(1)")).getText(), is("Total of 120 Loan Payments"));
        driver.findElement(By.cssSelector("table:nth-child(2) > tbody:nth-child(1) > tr:nth-child(2) > td:nth-child(1)")).click();
        assertThat(driver.findElement(By.cssSelector("table:nth-child(2) > tbody:nth-child(1) > tr:nth-child(2) > td:nth-child(1)")).getText(), is("Total Interest"));
    }
}
