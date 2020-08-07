package auto.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.testng.Assert.assertEquals;

public class AmazonAddCart {

    static WebDriver driver;

    public AmazonAddCart(WebDriver driver) {
        this.driver = driver;
    }

    public void AddCart() {

        clickOnLink("//div[@id='ef925a12-7529-4ce2-925a-1275293ce2ff']/div/div[2]/div/a/div/div/div/img");
        clickOnLink("//input[@id='add-to-cart-button']");
        clickOnLink("//a[@id='nav-cart']/span");
        String text =  driver.findElement(By.xpath("//div[@id='sc-item-C595ea7e3-ae17-40b1-8eee-99c98005ec47']/div[4]/div/div/div/div/div[2]/ul/li/span/a/span")).getText();
        assertEquals(text, "Safety Glasses Adjustable Protective Goggles Eyewear Eyeglasses for Eye Protection Glass Safety Spec, Standard, Black Frame",
                "Actual title " + text + " should be same as expected " + "Safety Glasses Adjustable Protective Goggles Eyewear Eyeglasses for Eye Protection Glass Safety Spec, Standard, Black Frame");
    }

    public void AddCartandDelete() {

        clickOnLink("//div[@id='92b03a67-76f1-4018-b03a-6776f1501892']/div/div[2]/div/a/div/div/div/img");
        clickOnLink("//input[@id='add-to-cart-button']");
        clickOnLink("//a[@id='nav-cart']/span");
        clickOnLink("//input[@name='submit.delete.C9d574cad-5bb3-40ae-8114-a1c38ae54ce9']");
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
