package kpx.actual;

import kpx.base.BaseTest;
import org.testng.annotations.Test;
import utilities.ExtentReport.ExtentReporter;

public class BillsPay_Tests extends BaseTest {
    @Test(description = "Logging in via gmail and kpx")
    public void loginGoogle() throws Exception {
        this.loginSteps.signInGoogle("teller");
        this.loginSteps.loginKpx("teller");
        if(this.homeSteps.isInHomePage()){
            ExtentReporter.logPass("Login, Passed!!");
        }
    }


    //B I L L S  P A Y    S E N D O U T
    @Test(dependsOnMethods = "loginGoogle", priority = 1, description = "To validate successful bills payment transaction")
    public void BillsPay_TC_01()throws Exception{
        if(this.homeSteps.isInHomePage()){
            this.billsPaySteps.navigatePayoutPage();
            this.billsPaySteps.validateSuccessfulBillsPayTransaction();

        }

    }







}
