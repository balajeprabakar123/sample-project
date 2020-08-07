package auto.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.testng.Assert.assertEquals;

public class AmazonHome {

    final static String TITLE = "Amazon.ca: Low Prices – Fast Shipping – Millions of Items";
    final static String HEADING = ".ca";
    static WebDriver driver;
    static String xpathHeading = "//*[@id=\"nav-logo\"]/a";

    public AmazonHome(WebDriver driver) {
        this.driver = driver;
    }

    public static void verifyWelcomePageTitle() {
        String actualTitle = driver.getTitle();
        assertEquals(actualTitle, TITLE,
                "Actual title " + actualTitle + " should be same as expected " + TITLE);
    }

    public static void verifyWelcomePageHeader() {
        WebElement headerEle = driver.findElement(By.xpath(xpathHeading));
        String actualHeading = headerEle.getText();
        assertEquals(actualHeading, HEADING,
                "Actual heading '" + actualHeading + "' should be same as expected '" + HEADING + "'.");
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

    public void Login() {
        clickOnLink("//*[@id=\"nav-link-accountList\"]");
        driver.findElement(By.xpath("//*[@id=\"ap_email\"]")).sendKeys("balaje.prabakar@gmail.com");
        clickOnLink("//*[@id='continue']");
        driver.findElement(By.xpath("//*[@id=\"ap_password\"]")).sendKeys("Tester12345");
        clickOnLink("//*[@id=\"signInSubmit\"]");
}

    public void Logout() {
        clickOnLink("//*[@id=\"nav-link-accountList\"]/span/span");
        clickOnLink("//a[@id='nav-item-signout']/span");
    }
}
