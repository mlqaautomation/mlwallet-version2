package kpx.actual;

import kpx.base.BaseTest;
import org.testng.annotations.Test;
import utilities.ExtentReport.ExtentReporter;

public class RequestForChange_Tests extends BaseTest {
    @Test(description = "Logging in via gmail and kpx")
    public void loginGoogle() throws Exception {
        this.loginSteps.signInGoogle("teller");
        this.loginSteps.loginKpx("teller");
        if (this.homeSteps.isInHomePage()) {
            ExtentReporter.logPass("loginGoogle", "Login, Passed!!");
        }
    }


    @Test(dependsOnMethods = "loginGoogle" , priority = 1, description = "Verify Navigation of Request for Change Page")
    public void rfcNavigation_RFC_TC_01()throws Exception{
        if(this.homeSteps.isInHomePage()){
            this.requestForChangeSteps.RFC_TC_01();
        }
    }

    @Test(dependsOnMethods = "loginGoogle" , priority = 1, description = "Invalid KPTN Code")
    public void invalidKPTN_RFC_TC_02()throws Exception{
        if(this.homeSteps.isInHomePage()){
            this.requestForChangeSteps.RFC_TC_02();
        }
    }
}
