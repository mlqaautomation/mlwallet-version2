package kpx.actual;

import kpx.base.BaseTest;
import org.testng.annotations.Test;
import utilities.ExtentReport.ExtentReporter;

public class SendOutCancellation_Tests extends BaseTest {

    @Test(description = "Logging in via gmail and kpx")
    public void loginGoogle() throws Exception {
        this.loginSteps.signInGoogle("teller");
        this.loginSteps.loginKpx("teller");
        if(this.homeSteps.isInHomePage()){
            ExtentReporter.logPass("Login, Passed!!");
        }
    }
    @Test(dependsOnMethods = "loginGoogle" , priority = 1)
    public void navigatingSendOutPage()throws Exception{
        if(this.homeSteps.isInHomePage()) {
            this.sendOutCancellationSteps.DS_TC_01();
            this.sendOutCancellationSteps.SOC_TC_01();

        }

    }

}
