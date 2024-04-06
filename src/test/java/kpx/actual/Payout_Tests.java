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

    @Test(dependsOnMethods = "loginGoogle", priority = 1, description = "Successful domestic payout transaction")
    public void Payout_TC_01()throws Exception{
        if(this.homeSteps.isInHomePage()){
            this.payoutSteps.navigatePayoutPage();
            this.payoutSteps.validateSuccessfulDomesticPayout();

        }

    }

    @Test(dependsOnMethods = "loginGoogle", priority = 2, description = "Successful remote domestic payout transaction")
    public void Payout_TC_02()throws Exception{
        if(this.homeSteps.isInHomePage()){
            this.payoutSteps.navigatePayoutPage();
            this.payoutSteps.validateSuccessfulRemoteDomesticPayout();
        }

 }
    @Test(dependsOnMethods = "loginGoogle", priority = 3, description = "Domestic payout transaction with invalid KPTN")
    public void Payout_TC_03()throws Exception{
        if(this.homeSteps.isInHomePage()){
            this.payoutSteps.navigatePayoutPage();
            this.payoutSteps.validateInvalidKTPN();
        }


    }

    @Test(dependsOnMethods = "loginGoogle", priority = 4, description = "Remote domestic payout transaction with invalid KPTN")
    public void Payout_TC_04()throws Exception{
        if(this.homeSteps.isInHomePage()){
            this.payoutSteps.navigatePayoutPage();
            this.payoutSteps.validateRemoteInvalidKTPN();
        }


    }
    @Test(dependsOnMethods = "loginGoogle", priority = 5, description = "Invalid amount domestic payout transaction")
    public void Payout_TC_05()throws Exception{
        if(this.homeSteps.isInHomePage()){
            this.payoutSteps.navigatePayoutPage();
            this.payoutSteps.validateInvalidAmountDPT();

        }

    }
    @Test(dependsOnMethods = "loginGoogle", priority = 6, description = "Invalid amount remote domestic payout transaction")
    public void Payout_TC_06()throws Exception{
        if(this.homeSteps.isInHomePage()){
            this.payoutSteps.navigatePayoutPage();
            this.payoutSteps.validateInvalidAmountRemoteDPT();

        }

    }
    @Test(dependsOnMethods = "loginGoogle", priority = 7, description = "Claimed domestic payout transaction")
    public void Payout_TC_07()throws Exception{
        if(this.homeSteps.isInHomePage()){
            this.payoutSteps.navigatePayoutPage();
            this.payoutSteps.validateClaimedDomesticPayout();

        }

    }
    @Test(dependsOnMethods = "loginGoogle", priority = 8, description = "Claimed remote domestic payout transaction")
    public void Payout_TC_08()throws Exception{
        if(this.homeSteps.isInHomePage()){
            this.payoutSteps.navigatePayoutPage();
            this.payoutSteps.validateClaimedRemoteDomesticPayout();

        }

    }
    @Test(dependsOnMethods = "loginGoogle", priority = 9, description = "Domestic and Remote payout transaction without KPTN input")
    public void Payout_TC_09and10()throws Exception{
        if(this.homeSteps.isInHomePage()){
            this.payoutSteps.navigatePayoutPage();
            this.payoutSteps.validateDPTwithoutKTPNInput();
            this.payoutSteps.validateRemoteDPTwithoutKTPNInput();

        }

    }
    @Test(dependsOnMethods = "loginGoogle", priority = 10, description = "Domestic payout transaction without Amount input")
    public void Payout_TC_11()throws Exception{
        if(this.homeSteps.isInHomePage()){
            this.payoutSteps.navigatePayoutPage();
            this.payoutSteps.validateDPTwithoutAmountInput();

        }

    }
    @Test(dependsOnMethods = "loginGoogle", priority = 11, description = "Remote payout transaction without Amount input")
    public void Payout_TC_12()throws Exception{
        if(this.homeSteps.isInHomePage()){
            this.payoutSteps.navigatePayoutPage();
            this.payoutSteps.validateRemoteDPTWithoutAmountInput();

        }

    }

    @Test(dependsOnMethods = "loginGoogle", priority = 12, description = "Remote domestic payout transaction with Invalid Branch Code")
    public void Payout_TC_13()throws Exception{
        if(this.homeSteps.isInHomePage()){
            this.payoutSteps.navigatePayoutPage();
            this.payoutSteps.validateRemoteInvalidBranchCode();

        }

    }
    @Test(dependsOnMethods = "loginGoogle", priority = 13, description = "Remote domestic payout transaction with Invalid Operator ID")
    public void Payout_TC_14()throws Exception{
        if(this.homeSteps.isInHomePage()){
            this.payoutSteps.navigatePayoutPage();
            this.payoutSteps.validateRemoteInvalidOperatorID();

        }

    }
    @Test(dependsOnMethods = "loginGoogle", priority = 14, description = "Domestic payout transaction for compliance assistance")
    public void Payout_TC_15()throws Exception{
        if(this.homeSteps.isInHomePage()){
            this.payoutSteps.navigatePayoutPage();
            this.payoutSteps.validateComplianceAssistance();

        }

    }
    @Test(dependsOnMethods = "loginGoogle", priority = 15, description = "Remote domestic payout transaction for compliance assistance")
    public void Payout_TC_16()throws Exception{
        if(this.homeSteps.isInHomePage()){
            this.payoutSteps.navigatePayoutPage();
            this.payoutSteps.validateRemoteComplianceAssistance();

        }

    }



   // P A Y O U T    C A N C E L L A T I O N
//    @Test(dependsOnMethods = "loginGoogle", priority = 1, description = "Validate successful payout cancellation")
//    public void Payout_TC_Cancellation_01()throws Exception{
//        if(this.homeSteps.isInHomePage()){
//            this.payoutSteps.navigatePayoutPage();
//            this.payoutSteps.validateSuccessfulPayoutCancellation();
//
//        }
//
//    }
//    @Test(dependsOnMethods = "loginGoogle", priority = 2, description = "Validate remote successful payout cancellation")
//    public void Payout_TC_Cancellation_02()throws Exception{
//        if(this.homeSteps.isInHomePage()){
//            this.payoutSteps.navigatePayoutPage();
//            this.payoutSteps.validateRemoteSuccessfulPayoutCancellation();
//
//        }
//
//    }
//    @Test(dependsOnMethods = "loginGoogle", priority = 3, description = "Validate payout cancellation with invalid KPTN")
//    public void Payout_TC_Cancellation_03()throws Exception{
//        if(this.homeSteps.isInHomePage()){
//            this.payoutSteps.navigatePayoutPage();
//            this.payoutSteps.validateInvalidKTPNPayoutCancellation();
//
//        }
//
//    }
//        @Test(dependsOnMethods = "loginGoogle", priority = 4, description = "Validate payout already been cancelled transaction")
//        public void Payout_TC_Cancellation_04()throws Exception{
//        if(this.homeSteps.isInHomePage()){
//            this.payoutSteps.navigatePayoutPage();
//            this.payoutSteps.validateAlreadyBeenCancelledTransaction();
//
//        }
//
//    }
//    @Test(dependsOnMethods = "loginGoogle", priority = 5, description = "To validate payout cancellation with no KPTN provided")
//    public void Payout_TC_Cancellation_05()throws Exception{
//        if(this.homeSteps.isInHomePage()){
//            this.payoutSteps.navigatePayoutPage();
//            this.payoutSteps.validatePayoutCancellationWithNoKPTN();
//
//        }
//
//    }
//    @Test(dependsOnMethods = "loginGoogle", priority = 6, description = "To validate payout cancellation with no IR number provided")
//    public void Payout_TC_Cancellation_06()throws Exception{
//        if(this.homeSteps.isInHomePage()){
//            this.payoutSteps.navigatePayoutPage();
//            this.payoutSteps.validateNoIRNumberProvided();
//
//        }
//
//    }
//    @Test(dependsOnMethods = "loginGoogle", priority = 7, description = "To validate payout cancellation with no Reason provided")
//    public void Payout_TC_Cancellation_08()throws Exception{
//        if(this.homeSteps.isInHomePage()){
//            this.payoutSteps.navigatePayoutPage();
//            this.payoutSteps.validateNoReasonProvided();
//
//        }
//
//    }
//    @Test(dependsOnMethods = "loginGoogle", priority = 8, description = "To validate Cannot Cancel Payout")
//    public void Payout_TC_Cancellation_14()throws Exception{
//        if(this.homeSteps.isInHomePage()){
//            this.payoutSteps.navigatePayoutPage();
//            this.payoutSteps.validateCannotCancelPayout();
//
//        }
//
//    }
//    @Test(dependsOnMethods = "loginGoogle", priority = 9, description = "To validate Keep the transaction In cancellation process")
//    public void Payout_TC_Cancellation_15()throws Exception{
//        if(this.homeSteps.isInHomePage()){
//            this.payoutSteps.navigatePayoutPage();
//            this.payoutSteps.validateKeepTheTransaction();
//
//        }
//
//    }


}
