package auto.testcases;

import auto.pages.AmazonHome;
import auto.pages.AmazonReview;
import auto.pages.AmazonSearch;
import auto.utility.Init;
import org.testng.annotations.Test;

public class TestCaseThree extends Init {

    @Test
    public void testDemoPage() throws InterruptedException {
        AmazonHome amazonpage = new AmazonHome(driver);
        AmazonSearch amazonsearch = new AmazonSearch(driver);
        AmazonReview amazonreview = new AmazonReview(driver);
        amazonpage.verifyWelcomePageTitle();
        amazonpage.verifyWelcomePageHeader();
        amazonpage.Login();
        amazonsearch.Search("Ratchet Hard Hat");
        amazonreview.Review("quality");
    }
}