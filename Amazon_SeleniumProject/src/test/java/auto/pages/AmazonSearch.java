package auto.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.testng.Assert.assertEquals;

public class AmazonSearch {

    static WebDriver driver;

    public AmazonSearch(WebDriver driver) {
        this.driver = driver;
    }

    public void Search(String Text) {

        driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys(Text);
        clickOnLink("//*[@id=\"nav-search\"]/form/div[2]/div/input");
    }



    public void clickOnLinkViaLinkText(String link) {
        driver.findElement(By.linkText(link)).click();
    }

    public void clickOnLinkViaPartialText(String link) {
        driver.findElement(By.partialLinkText(link)).click();
    }

    public Object clickOnLink(String link) {
    		driver.findElement(By.xpath(link)).click();
        return this;
    }
}
