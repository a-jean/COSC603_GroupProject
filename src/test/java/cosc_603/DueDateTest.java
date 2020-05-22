package cosc_603;// Generated by Selenium IDE

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
public class DueDateTest extends BaseTest {
  @Test
  public void dueDateTest1() {
    driver.get("https://www.calculator.net/");
    driver.manage().window().setSize(new Dimension(617, 827));
    driver.findElement(By.linkText("Due Date Calculator")).click();
    {
      WebElement element = driver.findElement(By.linkText("Pregnancy Calculator"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
    driver.findElement(By.id("cLastPeriodDay_Month_ID")).click();
    {
      WebElement dropdown = driver.findElement(By.id("cLastPeriodDay_Month_ID"));
      dropdown.findElement(By.xpath("//option[. = 'May']")).click();
    }
    driver.findElement(By.id("cLastPeriodDay_Day_ID")).click();
    {
      WebElement dropdown = driver.findElement(By.id("cLastPeriodDay_Day_ID"));
      dropdown.findElement(By.xpath("//option[. = '5']")).click();
    }
    driver.findElement(By.name("cCycleLength")).click();
    {
      WebElement dropdown = driver.findElement(By.name("cCycleLength"));
      dropdown.findElement(By.xpath("//option[. = '23 days']")).click();
    }
    driver.findElement(By.cssSelector("td:nth-child(1) > input:nth-child(2)")).click();
  }
  @Test
  public void dueDateTest2() {
    driver.get("https://www.calculator.net/");
    driver.manage().window().setSize(new Dimension(617, 827));
    driver.findElement(By.linkText("Due Date Calculator")).click();
    driver.findElement(By.id("cLastPeriodDay_Month_ID")).click();
    {
      WebElement dropdown = driver.findElement(By.id("cLastPeriodDay_Month_ID"));
      dropdown.findElement(By.xpath("//option[. = 'May']")).click();
    }
    driver.findElement(By.id("cLastPeriodDay_Day_ID")).click();
    {
      WebElement dropdown = driver.findElement(By.id("cLastPeriodDay_Day_ID"));
      dropdown.findElement(By.xpath("//option[. = '10']")).click();
    }
    driver.findElement(By.id("cLastPeriodDay_Year_ID")).sendKeys("2019");
    driver.findElement(By.name("cCycleLength")).click();
    {
      WebElement dropdown = driver.findElement(By.name("cCycleLength"));
      dropdown.findElement(By.xpath("//option[. = '35 days']")).click();
    }
  }
  @Test
  public void dueDateTest3() {
    driver.get("https://www.calculator.net/");
    driver.manage().window().setSize(new Dimension(617, 827));
    driver.findElement(By.linkText("Due Date Calculator")).click();
    driver.findElement(By.id("cLastPeriodDay_Month_ID")).click();
    {
      WebElement dropdown = driver.findElement(By.id("cLastPeriodDay_Month_ID"));
      dropdown.findElement(By.xpath("//option[. = 'Apr']")).click();
    }
    driver.findElement(By.id("cLastPeriodDay_Day_ID")).click();
    {
      WebElement dropdown = driver.findElement(By.id("cLastPeriodDay_Day_ID"));
      dropdown.findElement(By.xpath("//option[. = '21']")).click();
    }
    driver.findElement(By.id("cLastPeriodDay_Year_ID")).sendKeys("2019");
    driver.findElement(By.name("cCycleLength")).click();
    {
      WebElement dropdown = driver.findElement(By.name("cCycleLength"));
      dropdown.findElement(By.xpath("//option[. = '28 days']")).click();
    }
  }
  @Test
  public void dueDateTest4() {
    driver.get("https://www.calculator.net/");
    driver.manage().window().setSize(new Dimension(1034, 825));
    driver.findElement(By.linkText("Due Date Calculator")).click();
    driver.findElement(By.name("ccalcmethod")).click();
    {
      WebElement dropdown = driver.findElement(By.name("ccalcmethod"));
      dropdown.findElement(By.xpath("//option[. = 'Ultrasound']")).click();
    }
    driver.findElement(By.cssSelector("td:nth-child(1) > input:nth-child(2)")).click();
  }
  @Test
  public void dueDateTest5() {
    driver.get("https://www.calculator.net/");
    driver.manage().window().setSize(new Dimension(1034, 825));
    driver.findElement(By.linkText("Due Date Calculator")).click();
    driver.findElement(By.name("ccalcmethod")).click();
    {
      WebElement dropdown = driver.findElement(By.name("ccalcmethod"));
      dropdown.findElement(By.xpath("//option[. = 'Ultrasound']")).click();
    }
    driver.findElement(By.id("cUltrasoundDate_Year_ID")).click();
    driver.findElement(By.id("cUltrasoundDate_Year_ID")).sendKeys("1985");
    driver.findElement(By.cssSelector("td:nth-child(1) > input:nth-child(2)")).click();
  }
  @Test
  public void dueDateTest6() {
    driver.get("https://www.calculator.net/");
    driver.manage().window().setSize(new Dimension(1034, 825));
    driver.findElement(By.linkText("Due Date Calculator")).click();
    driver.findElement(By.name("ccalcmethod")).click();
    {
      WebElement dropdown = driver.findElement(By.name("ccalcmethod"));
      dropdown.findElement(By.xpath("//option[. = 'Ultrasound']")).click();
    }
    driver.findElement(By.id("cUltrasoundDate_Year_ID")).click();
    driver.findElement(By.id("cUltrasoundDate_Year_ID")).sendKeys(" ");
    driver.findElement(By.cssSelector("td:nth-child(1) > input:nth-child(2)")).click();
  }
  @Test
  public void dueDateTest7() {
    driver.get("https://www.calculator.net/");
    driver.manage().window().setSize(new Dimension(1034, 825));
    driver.findElement(By.linkText("Due Date Calculator")).click();
    driver.findElement(By.name("ccalcmethod")).click();
    {
      WebElement dropdown = driver.findElement(By.name("ccalcmethod"));
      dropdown.findElement(By.xpath("//option[. = 'Ultrasound']")).click();
    }
    driver.findElement(By.id("cUltrasoundDate_Year_ID")).click();
    driver.findElement(By.id("cUltrasoundDate_Year_ID")).sendKeys(" ");
    driver.findElement(By.id("cUltrasoundDate_Year_ID")).click();
    driver.findElement(By.id("cUltrasoundDate_Year_ID")).sendKeys(" ");
    driver.findElement(By.cssSelector("td:nth-child(1) > input:nth-child(2)")).click();
  }
  @Test
  public void dueDateTest8() {
    driver.get("https://www.calculator.net/");
    driver.manage().window().setSize(new Dimension(1034, 825));
    driver.findElement(By.linkText("Due Date Calculator")).click();
    driver.findElement(By.name("ccalcmethod")).click();
    {
      WebElement dropdown = driver.findElement(By.name("ccalcmethod"));
      dropdown.findElement(By.xpath("//option[. = 'Conception Date']")).click();
    }
    driver.findElement(By.id("cConceptionDay_Year_ID")).click();
    driver.findElement(By.id("cConceptionDay_Year_ID")).sendKeys("2000");
    driver.findElement(By.cssSelector("td:nth-child(1) > input:nth-child(2)")).click();
  }
  @Test
  public void dueDateTest9() {
    driver.get("https://www.calculator.net/");
    driver.manage().window().setSize(new Dimension(1034, 825));
    driver.findElement(By.linkText("Due Date Calculator")).click();
    driver.findElement(By.name("ccalcmethod")).click();
    {
      WebElement dropdown = driver.findElement(By.name("ccalcmethod"));
      dropdown.findElement(By.xpath("//option[. = 'IVF Transfer Date']")).click();
    }
    driver.findElement(By.cssSelector(".cbcontainer:nth-child(1) > .rbmark")).click();
    driver.findElement(By.cssSelector("td:nth-child(1) > input:nth-child(2)")).click();
  }
  @Test
  public void dueDateTest10() {
    driver.get("https://www.calculator.net/");
    driver.manage().window().setSize(new Dimension(1034, 825));
    driver.findElement(By.linkText("Due Date Calculator")).click();
    driver.findElement(By.name("ccalcmethod")).click();
    {
      WebElement dropdown = driver.findElement(By.name("ccalcmethod"));
      dropdown.findElement(By.xpath("//option[. = 'IVF Transfer Date']")).click();
    }
    driver.findElement(By.cssSelector(".cbcontainer:nth-child(3) > .rbmark")).click();
    driver.findElement(By.cssSelector("td:nth-child(1) > input:nth-child(2)")).click();
  }
}
