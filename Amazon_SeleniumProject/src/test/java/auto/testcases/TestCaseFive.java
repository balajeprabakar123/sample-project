package auto.testcases;

import auto.pages.AmazonAddCart;
import auto.pages.AmazonHome;
import auto.pages.AmazonSearch;
import auto.utility.Init;
import org.testng.annotations.Test;

public class TestCaseFive extends Init {

    @Test
    public void testDemoPage() throws InterruptedException {
        AmazonHome amazonpage = new AmazonHome(driver);
        AmazonSearch amazonsearch = new AmazonSearch(driver);
        AmazonAddCart addcart = new AmazonAddCart(driver);
        amazonpage.verifyWelcomePageTitle();
        amazonpage.verifyWelcomePageHeader();
        amazonpage.Login();
        amazonsearch.Search("fire extinguishers");
        addcart.AddCartandDelete();
    }
}