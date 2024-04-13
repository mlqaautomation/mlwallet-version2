package kpx.actual;

import kpx.base.BaseTest;
import org.testng.annotations.Test;
import utilities.ExtentReport.ExtentReporter;

public class BillsPay_Tests extends BaseTest {
    @Test(description = "Logging in via gmail and kpx")
    public void loginGoogle() throws Exception {
        this.loginSteps.signInGoogle("admin2");
        this.loginSteps.loginKpx("admin2");
        if(this.homeSteps.isInHomePage()){
            ExtentReporter.logPass("Login, Passed!!");
        }
    }
//    @Test(dependsOnMethods = "loginGoogle", priority = 1, description = "To validate successful bills payment transaction")
//    public void BillsPay_TC_01()throws Exception{
//        if(this.homeSteps.isInHomePage()){
//            this.billsPaySteps.navigatePayoutPage();
//            this.billsPaySteps.validateSuccessfulBillsPayTransaction();
//
//        }
//
//    }



    //B I L L S  P A Y    C A N C E L L A T I O N
//    @Test(dependsOnMethods = "loginGoogle", priority = 1, description = "To validate successful Bills Pay Cancellation ")
//    public void BPC_TC_01()throws Exception{
//        if(this.homeSteps.isInHomePage()){
//            this.billsPaySteps.navigatePayoutPage();
//            this.billsPaySteps.validateSuccessfulBillsPayCancellation();
//
//        }
//
//    }
//    @Test(dependsOnMethods = "loginGoogle", priority = 2, description = "To validate remote successful Bills Pay Cancellation ")
//    public void BPC_TC_02()throws Exception{
//        if(this.homeSteps.isInHomePage()){
//            this.billsPaySteps.navigatePayoutPage();
//            this.billsPaySteps.validateSuccessfulRemoteBillsPayCancellation();
//
//        }
//
//    }
    @Test(dependsOnMethods = "loginGoogle", priority = 3, description = "To validate Empty Reference Bills Pay Cancellation ")
    public void BPC_TC_03()throws Exception{
        if(this.homeSteps.isInHomePage()){
            this.billsPaySteps.navigatePayoutPage();
            this.billsPaySteps.validateEmptyRefBillsPayCancellation();

        }

    }
    @Test(dependsOnMethods = "loginGoogle", priority = 3, description = "To validate Invalid Reference Bills Pay Cancellation ")
    public void BPC_TC_04()throws Exception{
        if(this.homeSteps.isInHomePage()){
            this.billsPaySteps.navigatePayoutPage();
            this.billsPaySteps.validateInvalidRefBillsPayCancellation();

        }

    }
    @Test(dependsOnMethods = "loginGoogle", priority = 3, description = "To validate Cancelled Reference Bills Pay Transaction ")
    public void BPC_TC_05()throws Exception{
        if(this.homeSteps.isInHomePage()){
            this.billsPaySteps.navigatePayoutPage();
            this.billsPaySteps.validateCancelledBillsPayRefNum();

        }

    }



}
