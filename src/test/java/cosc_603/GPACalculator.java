package cosc_603;
// Generated by Selenium IDE

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
public class GPACalculator extends BaseTest{
    @Test
    public void test1() {
        driver.get("https://www.calculator.net/");
        driver.manage().window().setSize(new Dimension(701, 825));
        driver.findElement(By.linkText("GPA Calculator")).click();
        driver.findElement(By.cssSelector(".clearbtn:nth-child(1)")).click();
        driver.findElement(By.name("da1")).click();
        driver.findElement(By.name("da1")).sendKeys("Softwaare Engineering");
        driver.findElement(By.name("ca1")).click();
        driver.findElement(By.name("ca1")).sendKeys("3");
        driver.findElement(By.name("la1")).click();
        {
            WebElement dropdown = driver.findElement(By.name("la1"));
            dropdown.findElement(By.xpath("//option[. = 'A']")).click();
        }
        driver.findElement(By.cssSelector("table:nth-child(16) input")).click();
    }
    @Test
    public void test2() {
        driver.get("https://www.calculator.net/");
        driver.manage().window().setSize(new Dimension(701, 825));
        driver.findElement(By.linkText("GPA Calculator")).click();
        driver.findElement(By.name("da2")).click();
        driver.findElement(By.name("da2")).sendKeys("Data Mining");
        driver.findElement(By.name("da3")).click();
        driver.findElement(By.name("da3")).sendKeys("Psychology");
        driver.findElement(By.name("ca2")).click();
        driver.findElement(By.name("ca2")).sendKeys("4");
        driver.findElement(By.name("ca3")).click();
        driver.findElement(By.name("ca3")).sendKeys("3");
        driver.findElement(By.name("la2")).click();
        {
            WebElement dropdown = driver.findElement(By.name("la2"));
            dropdown.findElement(By.xpath("//option[. = 'B']")).click();
        }
        driver.findElement(By.name("la3")).click();
        {
            WebElement dropdown = driver.findElement(By.name("la3"));
            dropdown.findElement(By.xpath("//option[. = 'B+']")).click();
        }
        driver.findElement(By.cssSelector("table:nth-child(16) input")).click();
    }
    @Test
    public void test3() {
        driver.get("https://www.calculator.net/");
        driver.manage().window().setSize(new Dimension(701, 825));
        driver.findElement(By.linkText("GPA Calculator")).click();
        driver.findElement(By.name("da3")).click();
        driver.findElement(By.name("da3")).sendKeys("Physics");
        driver.findElement(By.name("da2")).click();
        driver.findElement(By.name("da2")).sendKeys("Micro");
        driver.findElement(By.name("ca2")).click();
        driver.findElement(By.name("ca2")).sendKeys("4");
        driver.findElement(By.name("la2")).click();
        {
            WebElement dropdown = driver.findElement(By.name("la2"));
            dropdown.findElement(By.xpath("//option[. = 'B']")).click();
        }
        driver.findElement(By.name("la3")).click();
        {
            WebElement dropdown = driver.findElement(By.name("la3"));
            dropdown.findElement(By.xpath("//option[. = 'D-']")).click();
        }
        driver.findElement(By.cssSelector("table:nth-child(16) input")).click();
    }
    @Test
    public void test4() {
        driver.get("https://www.calculator.net/");
        driver.manage().window().setSize(new Dimension(701, 825));
        driver.findElement(By.linkText("GPA Calculator")).click();
        driver.findElement(By.cssSelector(".clearbtn:nth-child(1)")).click();
        driver.findElement(By.name("da1")).click();
        driver.findElement(By.name("da1")).sendKeys("Chem Lab");
        driver.findElement(By.name("la1")).click();
        {
            WebElement dropdown = driver.findElement(By.name("la1"));
            dropdown.findElement(By.xpath("//option[. = 'C+']")).click();
        }
        driver.findElement(By.name("da2")).click();
        driver.findElement(By.name("da2")).sendKeys("Geology");
        driver.findElement(By.name("ca2")).click();
        driver.findElement(By.name("ca2")).sendKeys("3");
        driver.findElement(By.name("la2")).click();
        {
            WebElement dropdown = driver.findElement(By.name("la2"));
            dropdown.findElement(By.xpath("//option[. = 'B-']")).click();
        }
        driver.findElement(By.name("da3")).click();
        driver.findElement(By.name("da3")).sendKeys("English");
        driver.findElement(By.name("ca3")).click();
        driver.findElement(By.name("ca3")).sendKeys("4");
        driver.findElement(By.name("la3")).click();
        {
            WebElement dropdown = driver.findElement(By.name("la3"));
            dropdown.findElement(By.xpath("//option[. = 'A+']")).click();
        }
        driver.findElement(By.cssSelector("table:nth-child(16) input")).click();
    }
    @Test
    public void test5() {
        driver.get("https://www.calculator.net/");
        driver.manage().window().setSize(new Dimension(701, 825));
        driver.findElement(By.linkText("GPA Calculator")).click();
        driver.findElement(By.cssSelector(".clearbtn:nth-child(1)")).click();
        driver.findElement(By.name("da1")).click();
        driver.findElement(By.name("da1")).sendKeys("Writing");
        driver.findElement(By.name("da2")).click();
        driver.findElement(By.name("da2")).sendKeys("Russian");
        driver.findElement(By.name("da3")).click();
        driver.findElement(By.name("da3")).sendKeys("Poetry");
        driver.findElement(By.name("ca1")).click();
        driver.findElement(By.name("ca1")).sendKeys("3");
        driver.findElement(By.name("ca2")).click();
        driver.findElement(By.name("ca2")).sendKeys("3");
        driver.findElement(By.name("la1")).click();
        {
            WebElement dropdown = driver.findElement(By.name("la1"));
            dropdown.findElement(By.xpath("//option[. = 'F']")).click();
        }
        driver.findElement(By.name("la2")).click();
        {
            WebElement dropdown = driver.findElement(By.name("la2"));
            dropdown.findElement(By.xpath("//option[. = 'D']")).click();
        }
        driver.findElement(By.cssSelector("table:nth-child(16) input")).click();
    }
    @Test
    public void test6() {
        driver.get("https://www.calculator.net/");
        driver.manage().window().setSize(new Dimension(701, 825));
        driver.findElement(By.linkText("GPA Calculator")).click();
        driver.findElement(By.cssSelector(".clearbtn:nth-child(3)")).click();
        driver.findElement(By.name("grcCurrentGPA")).click();
        driver.findElement(By.name("grcCurrentGPA")).sendKeys("4.0");
        driver.findElement(By.name("grcCurrentGPA")).sendKeys(Keys.ENTER);
        driver.findElement(By.name("grcTargetGPA")).click();
        driver.findElement(By.name("grcTargetGPA")).sendKeys("3.5");
        driver.findElement(By.name("grcTargetGPA")).sendKeys(Keys.ENTER);
        driver.findElement(By.name("grcCurrentCredit")).click();
        driver.findElement(By.name("grcCurrentCredit")).sendKeys("9");
        driver.findElement(By.name("grcCurrentCredit")).sendKeys(Keys.ENTER);
        driver.findElement(By.name("grcAdditionalCredit")).click();
        driver.findElement(By.name("grcAdditionalCredit")).sendKeys("12");
        driver.findElement(By.cssSelector("td:nth-child(1) > input:nth-child(2)")).click();
    }
    @Test
    public void test7() {
        driver.get("https://www.calculator.net/");
        driver.manage().window().setSize(new Dimension(701, 825));
        driver.findElement(By.linkText("GPA Calculator")).click();
        driver.findElement(By.cssSelector(".clearbtn:nth-child(3)")).click();
        driver.findElement(By.name("grcCurrentGPA")).click();
        driver.findElement(By.name("grcCurrentGPA")).sendKeys("1.98");
        driver.findElement(By.name("grcTargetGPA")).click();
        driver.findElement(By.name("grcTargetGPA")).sendKeys("3.00");
        driver.findElement(By.name("grcCurrentCredit")).click();
        driver.findElement(By.name("grcCurrentCredit")).sendKeys("54");
        driver.findElement(By.name("grcAdditionalCredit")).click();
        driver.findElement(By.name("grcAdditionalCredit")).sendKeys("23");
        driver.findElement(By.cssSelector("td:nth-child(1) > input:nth-child(2)")).click();
    }
    @Test
    public void test8() {
        driver.get("https://www.calculator.net/");
        driver.manage().window().setSize(new Dimension(701, 825));
        driver.findElement(By.linkText("GPA Calculator")).click();
        driver.findElement(By.cssSelector(".clearbtn:nth-child(3)")).click();
        driver.findElement(By.name("grcTargetGPA")).click();
        driver.findElement(By.name("grcTargetGPA")).sendKeys("3.75");
        driver.findElement(By.name("grcCurrentCredit")).click();
        driver.findElement(By.name("grcCurrentCredit")).sendKeys("0");
        driver.findElement(By.name("grcAdditionalCredit")).click();
        driver.findElement(By.name("grcAdditionalCredit")).sendKeys("15");
        driver.findElement(By.cssSelector("td:nth-child(1) > input:nth-child(2)")).click();
    }
    @Test
    public void test9() {
        driver.get("https://www.calculator.net/");
        driver.manage().window().setSize(new Dimension(701, 825));
        driver.findElement(By.linkText("GPA Calculator")).click();
        js.executeScript("window.scrollTo(0,493)");
        driver.findElement(By.cssSelector(".clearbtn:nth-child(3)")).click();
        driver.findElement(By.name("grcCurrentGPA")).click();
        driver.findElement(By.name("grcCurrentGPA")).sendKeys("3.3");
        driver.findElement(By.name("grcCurrentCredit")).click();
        driver.findElement(By.name("grcCurrentCredit")).sendKeys("117");
        driver.findElement(By.cssSelector("td:nth-child(1) > input:nth-child(2)")).click();
    }
    @Test
    public void test10() {
        driver.get("https://www.calculator.net/");
        driver.manage().window().setSize(new Dimension(701, 825));
        driver.findElement(By.linkText("GPA Calculator")).click();
        driver.findElement(By.cssSelector(".clearbtn:nth-child(3)")).click();
        driver.findElement(By.name("grcCurrentGPA")).click();
        driver.findElement(By.name("grcCurrentGPA")).sendKeys("2.50");
        driver.findElement(By.name("grcTargetGPA")).click();
        driver.findElement(By.name("grcTargetGPA")).sendKeys("3.0");
        driver.findElement(By.name("grcTargetGPA")).sendKeys(Keys.ENTER);
        driver.findElement(By.name("grcCurrentCredit")).click();
        driver.findElement(By.name("grcCurrentCredit")).sendKeys("75");
        driver.findElement(By.name("grcAdditionalCredit")).click();
        driver.findElement(By.name("grcAdditionalCredit")).sendKeys("0");
        driver.findElement(By.cssSelector("td:nth-child(1) > input:nth-child(2)")).click();
    }
}
