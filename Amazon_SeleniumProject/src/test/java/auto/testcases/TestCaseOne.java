package auto.testcases;

import auto.pages.*;
import auto.utility.Init;
import org.testng.annotations.Test;

public class TestCaseOne extends Init {

    @Test
    public void testDemoPage() throws InterruptedException {
        AmazonHome amazonpage = new AmazonHome(driver);
        amazonpage.verifyWelcomePageTitle();
        amazonpage.verifyWelcomePageHeader();
        amazonpage.Login();
        amazonpage.Logout();
    }
}