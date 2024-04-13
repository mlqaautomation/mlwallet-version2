package kpx.actual;

import kpx.base.BaseTest;

import org.testng.annotations.Test;
import utilities.ExtentReport.ExtentReporter;



public class LoginT extends BaseTest {

    @Test(priority = 1)
    public void loginValid()throws Exception{
       this.loginSteps.signInGoogle("admin2");
       this.loginSteps.loginKpx("admin2");
       if(this.homeSteps.isInHomePage()){
           ExtentReporter.logPass("loginValid","Login Successful");
       }
    }

}
