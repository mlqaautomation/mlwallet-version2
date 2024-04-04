package kpx.actual;

import kpx.base.BaseTest;

import org.testng.annotations.Test;
import utilities.ExtentReport.ExtentReporter;
public class Payout_Tests extends BaseTest{

    @Test(description = "Logging in via gmail and kpx")
    public void loginGoogle() throws Exception {
        this.loginSteps.signInGoogle("teller");
        this.loginSteps.loginKpx("teller");
        if(this.homeSteps.isInHomePage()){
            ExtentReporter.logPass("Login, Passed!!");
        }
    }

//    @Test(priority = 1)
//    public void Payout_TC_01()throws Exception{
//        if(this.homeSteps.isInHomePage()){
//            this.payoutSteps.navigatePayoutPage();
//            this.payoutSteps.validateSuccessfulDomesticPayout();
//
//        }
//
//    }

//    @Test(priority = 1)
//    public void Payout_TC_02()throws Exception{
//        if(this.homeSteps.isInHomePage()){
//            this.payoutSteps.navigatePayoutPage();
//            this.payoutSteps.validateSuccessfulRemoteDomesticPayout();
//        }
//
//
//    }
//    @Test(priority = 3)
//    public void Payout_TC_03()throws Exception{
//        if(this.homeSteps.isInHomePage()){
//            this.payoutSteps.navigatePayoutPage();
//            this.payoutSteps.validateInvalidKTPN();
//        }
//
//
//    }

//    @Test(priority = 4)
//    public void Payout_TC_04()throws Exception{
//        if(this.homeSteps.isInHomePage()){
//            this.payoutSteps.navigatePayoutPage();
//            this.payoutSteps.validateRemoteInvalidKTPN();
//        }
//
//
//    }
//    @Test(priority = 1)
//    public void Payout_TC_05()throws Exception{
//        if(this.homeSteps.isInHomePage()){
//            this.payoutSteps.navigatePayoutPage();
//            this.payoutSteps.validateInvalidAmountDPT();
//
//        }
//
//    }
//    @Test(priority = 1)
//    public void Payout_TC_06()throws Exception{
//        if(this.homeSteps.isInHomePage()){
//            this.payoutSteps.navigatePayoutPage();
//            this.payoutSteps.validateInvalidAmountRemoteDPT();
//
//        }
//
//    }
    @Test(priority = 1)
    public void Payout_TC_07and08()throws Exception{
        if(this.homeSteps.isInHomePage()){
            this.payoutSteps.navigatePayoutPage();
//            this.payoutSteps.validateClaimedDomesticPayout();
            this.payoutSteps.validateClaimedRemoteDomesticPayout();

        }

    }


}
