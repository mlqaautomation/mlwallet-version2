package kpx.actual;

import kpx.base.BaseTest;
import org.testng.annotations.Test;
import utilities.ExtentReport.ExtentReporter;

public class SendOut_Tests extends BaseTest {
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
        if(this.homeSteps.isInHomePage()){
            this.sendOutSteps.navigateSendOutPage();
//            this.sendOutSteps.DS_TC_01();
            this.sendOutSteps.DS_TC_02();
            this.sendOutSteps.DS_TC_03();
            this.sendOutSteps.DS_TC_04();
            this.sendOutSteps.DS_TC_06();
        }
    }
}
