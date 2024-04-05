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

    @Test(priority = 1)
    public void Payout_TC_01()throws Exception{
        if(this.homeSteps.isInHomePage()){
            this.payoutSteps.navigatePayoutPage();
            this.payoutSteps.validateSuccessfulDomesticPayout();

        }

    }

    @Test(priority = 2)
    public void Payout_TC_02()throws Exception{
        if(this.homeSteps.isInHomePage()){
            this.payoutSteps.navigatePayoutPage();
            this.payoutSteps.validateSuccessfulRemoteDomesticPayout();
        }


    }
    @Test(priority = 3)
    public void Payout_TC_03()throws Exception{
        if(this.homeSteps.isInHomePage()){
            this.payoutSteps.navigatePayoutPage();
            this.payoutSteps.validateInvalidKTPN();
        }


    }

    @Test(priority = 4)
    public void Payout_TC_04()throws Exception{
        if(this.homeSteps.isInHomePage()){
            this.payoutSteps.navigatePayoutPage();
            this.payoutSteps.validateRemoteInvalidKTPN();
        }


    }
    @Test(priority = 5)
    public void Payout_TC_05()throws Exception{
        if(this.homeSteps.isInHomePage()){
            this.payoutSteps.navigatePayoutPage();
            this.payoutSteps.validateInvalidAmountDPT();

        }

    }
    @Test(priority = 6)
    public void Payout_TC_06()throws Exception{
        if(this.homeSteps.isInHomePage()){
            this.payoutSteps.navigatePayoutPage();
            this.payoutSteps.validateInvalidAmountRemoteDPT();

        }

    }
    @Test(priority = 7)
    public void Payout_TC_07()throws Exception{
        if(this.homeSteps.isInHomePage()){
            this.payoutSteps.navigatePayoutPage();
            this.payoutSteps.validateClaimedDomesticPayout();

        }

    }
    @Test(priority = 7)
    public void Payout_TC_08()throws Exception{
        if(this.homeSteps.isInHomePage()){
            this.payoutSteps.navigatePayoutPage();
            this.payoutSteps.validateClaimedRemoteDomesticPayout();

        }

    }
    @Test(priority = 8)
    public void Payout_TC_09and10()throws Exception{
        if(this.homeSteps.isInHomePage()){
            this.payoutSteps.navigatePayoutPage();
            this.payoutSteps.validateDPTwithoutKTPNInput();
            this.payoutSteps.validateRemoteDPTwithoutKTPNInput();

        }

    }
    @Test(priority = 9)
    public void Payout_TC_11()throws Exception{
        if(this.homeSteps.isInHomePage()){
            this.payoutSteps.navigatePayoutPage();
            this.payoutSteps.validateDPTwithoutAmountInput();

        }

    }
    @Test(priority = 10)
    public void Payout_TC_12()throws Exception{
        if(this.homeSteps.isInHomePage()){
            this.payoutSteps.navigatePayoutPage();
            this.payoutSteps.validateRemoteDPTWithoutAmountInput();

        }

    }

    @Test(priority = 11)
    public void Payout_TC_13and14()throws Exception{
        if(this.homeSteps.isInHomePage()){
            this.payoutSteps.navigatePayoutPage();
            this.payoutSteps.validateRemoteInvalidBranchCode();
            this.payoutSteps.validateRemoteInvalidOperatorID();

        }

    }
    @Test(priority = 12)
    public void Payout_TC_14()throws Exception{
        if(this.homeSteps.isInHomePage()){
            this.payoutSteps.navigatePayoutPage();
            this.payoutSteps.validateRemoteInvalidBranchCode();
            this.payoutSteps.validateRemoteInvalidOperatorID();

        }

    }
    @Test(priority = 13)
    public void Payout_TC_15and16()throws Exception{
        if(this.homeSteps.isInHomePage()){
            this.payoutSteps.navigatePayoutPage();
            this.payoutSteps.validateComplianceAssistance();
            this.payoutSteps.validateRemoteComplianceAssistance();

        }

    }


}
