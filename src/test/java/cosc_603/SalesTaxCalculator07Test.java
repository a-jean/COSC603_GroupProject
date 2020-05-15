package cosc_603;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class SalesTaxCalculator07Test extends BaseTest {

    @Test
    public void salesTaxCalculator07() {
        driver.get("https://www.calculator.net/sales-tax-calculator.html");
        driver.manage().window().setSize(new Dimension(1680, 1027));
        {
            WebElement element = driver.findElement(By.name("beforetax"));
            Actions builder = new Actions(driver);
            builder.doubleClick(element).perform();
        }
        driver.findElement(By.name("beforetax")).sendKeys(" ");

        {
            WebElement element = driver.findElement(By.name("taxrate"));
            Actions builder = new Actions(driver);
            builder.doubleClick(element).perform();
        }

        driver.findElement(By.name("taxrate")).sendKeys("4.75");
        driver.findElement(By.name("finalprice")).sendKeys("500000");
        driver.findElement(By.cssSelector("tr:nth-child(4) input")).click();

        assertThat(driver.findElement(By.cssSelector(".verybigtext:nth-child(4)")).getText(), is("Before Tax Price: $477,326.97"));
        assertThat(driver.findElement(By.cssSelector(".verybigtext:nth-child(5)")).getText(), is("Sale Tax: 4.75% or $22,673.03"));
        assertThat(driver.findElement(By.cssSelector(".verybigtext:nth-child(6)")).getText(), is("After Tax Price: $500,000.00"));
    }
}
