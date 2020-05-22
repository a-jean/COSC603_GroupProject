package cosc_603;
// Generated by Selenium IDE

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
public class TriangleCalculatorTest extends BaseTest {
    @Test
    public void triangleCalcTest1() {
        driver.get("https://www.calculator.net/");
        driver.manage().window().setSize(new Dimension(1104, 827));
        driver.findElement(By.linkText("Triangle Calculator")).click();
        driver.findElement(By.name("va")).click();
        driver.findElement(By.name("va")).sendKeys("1");
        driver.findElement(By.cssSelector("td:nth-child(1) tr:nth-child(1) > td")).click();
        driver.findElement(By.name("vc")).sendKeys("1");
        driver.findElement(By.name("vb")).click();
        driver.findElement(By.name("vb")).sendKeys("1");
        driver.findElement(By.name("vz")).click();
        driver.findElement(By.name("vz")).sendKeys("1");
        driver.findElement(By.cssSelector("tr:nth-child(5) input")).click();
    }
    @Test
    public void triangleCalcTest2() {
        driver.get("https://www.calculator.net/");
        driver.manage().window().setSize(new Dimension(577, 827));
        driver.findElement(By.linkText("Triangle Calculator")).click();
        driver.findElement(By.name("va")).click();
        driver.findElement(By.name("va")).sendKeys("30");
        driver.findElement(By.name("vy")).click();
        driver.findElement(By.name("vy")).sendKeys("1");
        driver.findElement(By.cssSelector("tr:nth-child(5) input")).click();
        {
            WebElement element = driver.findElement(By.cssSelector("span:nth-child(3) > a > span"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).perform();
        }
    }
    @Test
    public void triangleCalcTest3() {
        driver.get("https://www.calculator.net/");
        driver.manage().window().setSize(new Dimension(577, 827));
        driver.findElement(By.linkText("Triangle Calculator")).click();
        driver.findElement(By.name("va")).click();
        driver.findElement(By.name("va")).click();
        {
            WebElement element = driver.findElement(By.name("va"));
            Actions builder = new Actions(driver);
            builder.doubleClick(element).perform();
        }
        driver.findElement(By.name("va")).sendKeys("85");
        driver.findElement(By.name("vc")).click();
        driver.findElement(By.name("vc")).sendKeys("15");
        driver.findElement(By.name("vb")).click();
        driver.findElement(By.name("vb")).sendKeys("80");
        driver.findElement(By.name("vx")).click();
        driver.findElement(By.name("vy")).click();
        driver.findElement(By.cssSelector("tr:nth-child(5) input")).click();
    }
    @Test
    public void triangleCalcTest4() {
        driver.get("https://www.calculator.net/");
        driver.manage().window().setSize(new Dimension(577, 827));
        driver.findElement(By.linkText("Triangle Calculator")).click();
        driver.findElement(By.name("vz")).click();
        driver.findElement(By.name("vz")).sendKeys("2");
        driver.findElement(By.name("vc")).click();
        driver.findElement(By.name("vc")).sendKeys("1");
        driver.findElement(By.cssSelector("tr:nth-child(5) input")).click();
    }
    @Test
    public void triangleCalcTest5() {
        driver.get("https://www.calculator.net/");
        driver.manage().window().setSize(new Dimension(577, 827));
        driver.findElement(By.linkText("Triangle Calculator")).click();
        driver.findElement(By.cssSelector(".clearbtn")).click();
        driver.findElement(By.name("vc")).click();
        driver.findElement(By.name("vc")).sendKeys("110");
        driver.findElement(By.name("vb")).click();
        driver.findElement(By.name("vb")).sendKeys("50");
        driver.findElement(By.name("vx")).click();
        driver.findElement(By.name("vx")).sendKeys("1");
        driver.findElement(By.cssSelector("tr:nth-child(5) input")).click();
    }
    @Test
    public void triangleCalcTest6() {
        driver.get("https://www.calculator.net/");
        driver.manage().window().setSize(new Dimension(577, 827));
        driver.findElement(By.linkText("Triangle Calculator")).click();
        driver.findElement(By.cssSelector(".clearbtn")).click();
        driver.findElement(By.name("vc")).click();
        driver.findElement(By.name("vc")).sendKeys("90");
        driver.findElement(By.name("va")).click();
        driver.findElement(By.name("va")).sendKeys("30");
        driver.findElement(By.name("vx")).click();
        driver.findElement(By.name("vx")).sendKeys("1");
        driver.findElement(By.cssSelector("td:nth-child(1) tr:nth-child(2) > td:nth-child(1)")).click();
        driver.findElement(By.cssSelector("tr:nth-child(5) input")).click();
    }
    @Test
    public void triangleCalcTest7() {
        driver.get("https://www.calculator.net/");
        driver.manage().window().setSize(new Dimension(1088, 827));
        driver.findElement(By.linkText("Triangle Calculator")).click();
        driver.findElement(By.cssSelector(".clearbtn")).click();
        driver.findElement(By.name("vx")).click();
        driver.findElement(By.name("vx")).sendKeys("1");
        driver.findElement(By.name("va")).click();
        driver.findElement(By.name("va")).sendKeys("75");
        driver.findElement(By.name("vc")).click();
        driver.findElement(By.name("vc")).sendKeys("100");
        driver.findElement(By.cssSelector("tr:nth-child(4) > td")).click();
        driver.findElement(By.cssSelector("tr:nth-child(5) input")).click();
    }
    @Test
    public void triangleCalcTest8() {
        driver.get("https://www.calculator.net/");
        driver.manage().window().setSize(new Dimension(577, 827));
        driver.findElement(By.linkText("Triangle Calculator")).click();
        driver.findElement(By.cssSelector(".clearbtn")).click();
        driver.findElement(By.name("vc")).click();
        driver.findElement(By.name("vc")).sendKeys("40");
        driver.findElement(By.name("vy")).click();
        driver.findElement(By.name("vy")).sendKeys("1");
        driver.findElement(By.name("va")).click();
        driver.findElement(By.name("va")).sendKeys("70");
        driver.findElement(By.cssSelector("tr:nth-child(5) input")).click();
    }
    @Test
    public void triangleCalcTest9() {
        driver.get("https://www.calculator.net/");
        driver.manage().window().setSize(new Dimension(577, 827));
        driver.findElement(By.linkText("Triangle Calculator")).click();
        driver.findElement(By.cssSelector(".clearbtn")).click();
        driver.findElement(By.name("angleunits")).click();
        {
            WebElement dropdown = driver.findElement(By.name("angleunits"));
            dropdown.findElement(By.xpath("//option[. = 'radian']")).click();
        }
        driver.findElement(By.name("vc")).click();
        driver.findElement(By.name("vc")).sendKeys("60");
        driver.findElement(By.name("vx")).click();
        driver.findElement(By.name("vx")).sendKeys("1");
        driver.findElement(By.name("vy")).click();
        driver.findElement(By.name("vy")).sendKeys("1");
        driver.findElement(By.cssSelector("tr:nth-child(5) input")).click();
    }
    @Test
    public void triangleCalcTest10() {
        driver.get("https://www.calculator.net/");
        driver.manage().window().setSize(new Dimension(577, 827));
        driver.findElement(By.linkText("Triangle Calculator")).click();
        driver.findElement(By.cssSelector(".clearbtn")).click();
        driver.findElement(By.name("vc")).click();
        driver.findElement(By.name("vc")).sendKeys("89");
        driver.findElement(By.name("va")).click();
        driver.findElement(By.name("va")).sendKeys("19");
        driver.findElement(By.name("vy")).click();
        driver.findElement(By.name("vy")).sendKeys("1");
        driver.findElement(By.cssSelector("tr:nth-child(5) input")).click();
    }
}
