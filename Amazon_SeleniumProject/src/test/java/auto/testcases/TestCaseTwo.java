package auto.testcases;

import auto.pages.AmazonHome;
import auto.pages.AmazonSearch;
import auto.utility.Init;
import org.testng.annotations.Test;

public class TestCaseTwo extends Init {

    @Test
    public void testDemoPage() throws InterruptedException {
        AmazonHome amazonpage = new AmazonHome(driver);
        AmazonSearch amazonsearch = new AmazonSearch(driver);

        amazonpage.verifyWelcomePageTitle();
        amazonpage.verifyWelcomePageHeader();
        amazonpage.Login();
        amazonsearch.Search("hard hat");
    }
}