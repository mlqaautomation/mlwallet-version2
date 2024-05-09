package kpx.actual;

import kpx.base.BaseTest;
import org.testng.annotations.Test;
import utilities.ExtentReport.ExtentReporter;

public class HappyPath_Tests extends BaseTest {

    @Test(description = "Logging in via gmail and kpx")
    public void loginGoogle() throws Exception {
        this.loginSteps.signInGoogle("teller");
        this.loginSteps.loginKpx("teller");
        if (this.homeSteps.isInHomePage()) {
            ExtentReporter.logPass("loginGoogle", "Login, Passed!!");
        }
    }
    @Test(dependsOnMethods = "loginGoogle", priority = 11, description = "To Validate Submit SendOut Transaction")

    public void DS_TC_8() throws Exception {
        if (this.homeSteps.isInHomePage()) {
            this.sendOutSteps.DS_TC_08();
        }
    }


}
