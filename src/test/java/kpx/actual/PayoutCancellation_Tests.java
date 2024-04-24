package kpx.actual;

import kpx.base.BaseTest;
import org.testng.annotations.Test;
import utilities.ExtentReport.ExtentReporter;

public class PayoutCancellation_Tests extends BaseTest {
    @Test(description = "Logging in via gmail and kpx")
    public void loginGoogle() throws Exception {
        this.loginSteps.signInGoogle("teller");
        this.loginSteps.loginKpx("teller");
        if(this.homeSteps.isInHomePage()){
            ExtentReporter.logPass("Login, Passed!!");
        }
    }

    // P A Y O U T    C A N C E L L A T I O N

    @Test(dependsOnMethods = "loginGoogle", priority = 5, description = "Validate successful payout cancellation")
    public void Payout_TC_Cancellation_01()throws Exception{
        if(this.homeSteps.isInHomePage()){
            this.payoutCancellationSteps.navigatePayoutPage();
            this.payoutCancellationSteps.validateSuccessfulPayoutCancellation();

        }

    }
    @Test(dependsOnMethods = "loginGoogle", priority = 6, description = "Validate remote successful payout cancellation")
    public void Payout_TC_Cancellation_02()throws Exception{
        if(this.homeSteps.isInHomePage()){
            this.payoutCancellationSteps.navigatePayoutPage();
            this.payoutCancellationSteps.validateRemoteSuccessfulPayoutCancellation();

        }
    }
    //
    @Test(dependsOnMethods = "loginGoogle", priority = 17, description = "Validate payout cancellation with invalid KPTN")
    public void Payout_TC_Cancellation_03()throws Exception{
        if(this.homeSteps.isInHomePage()){
            this.payoutCancellationSteps.navigatePayoutPage();
            this.payoutCancellationSteps.validateInvalidKTPNPayoutCancellation();

        }

    }
    @Test(dependsOnMethods = "loginGoogle", priority = 18, description = "Validate payout already been cancelled transaction")
    public void Payout_TC_Cancellation_04()throws Exception{
        if(this.homeSteps.isInHomePage()){
            this.payoutCancellationSteps.navigatePayoutPage();
            this.payoutCancellationSteps.validateAlreadyBeenCancelledTransaction();

        }

    }
    @Test(dependsOnMethods = "loginGoogle", priority = 19, description = "To validate payout cancellation with no KPTN provided")
    public void Payout_TC_Cancellation_05()throws Exception{
        if(this.homeSteps.isInHomePage()){
            this.payoutCancellationSteps.navigatePayoutPage();
            this.payoutCancellationSteps.validatePayoutCancellationWithNoKPTN();

        }

    }
    @Test(dependsOnMethods = "loginGoogle", priority = 20, description = "To validate payout cancellation with no IR number provided")
    public void Payout_TC_Cancellation_06()throws Exception{
        if(this.homeSteps.isInHomePage()){
            this.payoutCancellationSteps.navigatePayoutPage();
            this.payoutCancellationSteps.validateNoIRNumberProvided();

        }

    }
    //    @Test(dependsOnMethods = "loginGoogle", priority = 0, description = "To validate remote payout cancellation with no IR number provided")
//    public void Payout_TC_Cancellation_07()throws Exception{
//        if(this.homeSteps.isInHomePage()){
//            this.payoutCancellationSteps.navigatePayoutPage();
//            this.payoutCancellationSteps.validateRemoteNoIRNumberProvided();
//
//        }
//
//    }
    @Test(dependsOnMethods = "loginGoogle", priority = 21, description = "To validate payout cancellation with no Reason provided")
    public void Payout_TC_Cancellation_08()throws Exception{
        if(this.homeSteps.isInHomePage()){
            this.payoutCancellationSteps.navigatePayoutPage();
            this.payoutCancellationSteps.validateNoReasonProvided();

        }

    }
    //    @Test(dependsOnMethods = "loginGoogle", priority = 0, description = "To validate remote payout cancellation with no Reason provided")
//    public void Payout_TC_Cancellation_09()throws Exception{
//        if(this.homeSteps.isInHomePage()){
//            this.payoutCancellationSteps.navigatePayoutPage();
//            this.payoutCancellationSteps.validateRemoteNoReasonProvided();
//
//        }
//
//    }
//    @Test(dependsOnMethods = "loginGoogle", priority = 0, description = "To validate remote payout cancellation with Invalid Branch Code")
//    public void Payout_TC_Cancellation_10()throws Exception{
//        if(this.homeSteps.isInHomePage()){
//            this.payoutCancellationSteps.navigatePayoutPage();
//            this.payoutCancellationSteps.validateRemoteInvalidBranchCodeProvided();
//
//        }
//
//    }
//    @Test(dependsOnMethods = "loginGoogle", priority = 0, description = "To validate remote payout cancellation with Invalid Operator ID")
//    public void Payout_TC_Cancellation_11()throws Exception{
//        if(this.homeSteps.isInHomePage()){
//            this.payoutCancellationSteps.navigatePayoutPage();
//            this.payoutCancellationSteps.validateRemoteInvalidOperatorIDProvided();
//
//        }
//
//    }
    @Test(dependsOnMethods = "loginGoogle", priority = 23, description = "To validate Keep the transaction In cancellation process")
    public void Payout_TC_Cancellation_12()throws Exception{
        if(this.homeSteps.isInHomePage()){
            this.payoutCancellationSteps.navigatePayoutPage();
            this.payoutCancellationSteps.validateKeepTheTransaction();

        }

    }
//    @Test(dependsOnMethods = "loginGoogle", priority = 24, description = "To validate Cancel Payout after 5 minutes of transaction")
//    public void Payout_TC_Cancellation_13()throws Exception{
//        if(this.homeSteps.isInHomePage()){
//            this.payoutCancellationSteps.navigatePayoutPage();
//            this.payoutCancellationSteps.validateKeepTheTransactionAfterFiveMinutes();
//
//        }
//
//    }
}
