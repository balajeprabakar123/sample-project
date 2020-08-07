package auto.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AmazonReview {

    static WebDriver driver;

    public AmazonReview(WebDriver driver) {
        this.driver = driver;
    }

    public void Review(String Text) {

        clickOnLink("//*[@id=\"search\"]//div[7]//h2/a/span");
          driver.findElement(By.xpath("//*[@id=\"ask-btf-container\"]//span/div/div/div/input")).sendKeys(Text);
        driver.findElement(By.xpath("//*[@id=\"ask-btf-container\"]//span/div/div/div/input")).click();

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
