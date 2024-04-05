package kpx.actual;

import kpx.base.BaseTest;
import org.testng.annotations.Test;
import utilities.ExtentReport.ExtentReporter;

public class SOReprinting_Tests extends BaseTest {
    @Test(description = "Logging in via gmail and kpx")
    public void loginGoogle() throws Exception {
        this.loginSteps.signInGoogle("teller");
        this.loginSteps.loginKpx("teller");
        if(this.homeSteps.isInHomePage()){
            ExtentReporter.logPass("loginGoogle", "Login, Passed!!");
        }
    }

    @Test(dependsOnMethods = "loginGoogle" , priority = 1, description = "Verify of Navigating SO Reprinting Page")
    public void navigatingSOReprintingPage()throws Exception{
        if(this.homeSteps.isInHomePage()) {
            this.soReprintingSteps.DS_TC_01();
            this.soReprintingSteps.SOR_TC_01();

        }

    }

}
