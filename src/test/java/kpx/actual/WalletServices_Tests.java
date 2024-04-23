package kpx.actual;

import kpx.base.BaseTest;
import org.testng.annotations.Test;
import utilities.ExtentReport.ExtentReporter;

public class WalletServices_Tests extends BaseTest {
    @Test(description = "Logging in via gmail and kpx")
    public void loginGoogle() throws Exception {
        this.loginSteps.signInGoogle("teller");
        this.loginSteps.loginKpx("teller");
        if(this.homeSteps.isInHomePage()){
            ExtentReporter.logPass("Login, Passed!!");
        }
    }
    @Test(dependsOnMethods = "loginGoogle", priority = 1, description = "To validate successful Cash In to another Account")
    public void CashInAnotherAcc_TC_01()throws Exception{
        if(this.homeSteps.isInHomePage()){
            this.walletServicesSteps.navigateWalletServicesPage();
            this.walletServicesSteps.ValidateSuccessCashInToAnotherAccount();

        }

    }
    @Test(dependsOnMethods = "loginGoogle", priority = 2, description = "To validate remote successful Cash In to another Account")
    public void CashInAnotherAcc_TC_02()throws Exception{
        if(this.homeSteps.isInHomePage()){
            this.walletServicesSteps.navigateWalletServicesPage();
            this.walletServicesSteps.ValidateRemoteSuccessCashInToAnotherAccount();

        }

    }
    @Test(dependsOnMethods = "loginGoogle", priority = 3, description = "To validate Cash In to another Account with no mobile number")
    public void CashInAnotherAcc_TC_03()throws Exception{
        if(this.homeSteps.isInHomePage()){
            this.walletServicesSteps.navigateWalletServicesPage();
            this.walletServicesSteps.ValidateCashInToAnotherAccWithNoMobileProvided();

        }

    }
    @Test(dependsOnMethods = "loginGoogle", priority = 4, description = "To validate Cash In to another Account with Invalid mobile number")
    public void CashInAnotherAcc_TC_04()throws Exception{
        if(this.homeSteps.isInHomePage()){
            this.walletServicesSteps.navigateWalletServicesPage();
            this.walletServicesSteps.ValidateCashInToAnotherAccWithInvalidMobileProvided();

        }

    }
    @Test(dependsOnMethods = "loginGoogle", priority = 5, description = "To validate Cash In to another Account with No Principal Amount")
    public void CashInAnotherAcc_TC_05()throws Exception{
        if(this.homeSteps.isInHomePage()){
            this.walletServicesSteps.navigateWalletServicesPage();
            this.walletServicesSteps.ValidateCashInToAnotherAccWithNoPrincipal();

        }

    }
    @Test(dependsOnMethods = "loginGoogle", priority = 6, description = "To validate Cash In to another Account with Inputted Zero Amount")
    public void CashInAnotherAcc_TC_06()throws Exception{
        if(this.homeSteps.isInHomePage()){
            this.walletServicesSteps.navigateWalletServicesPage();
            this.walletServicesSteps.ValidateCashInToAnotherAccWithInputtedZero();

        }

    }
    @Test(dependsOnMethods = "loginGoogle", priority = 7, description = "To validate Cash In to another Account with Inputted less than from the total amount")
    public void CashInAnotherAcc_TC_07()throws Exception{
        if(this.homeSteps.isInHomePage()){
            this.walletServicesSteps.navigateWalletServicesPage();
            this.walletServicesSteps.ValidateCashInToAnotherAccWithInputtedLessTotal();

        }

    }
    @Test(dependsOnMethods = "loginGoogle", priority = 8, description = "To validate Cash In to another Account with Inputted max 50,000")
    public void CashInAnotherAcc_TC_08()throws Exception{
        if(this.homeSteps.isInHomePage()){
            this.walletServicesSteps.navigateWalletServicesPage();
            this.walletServicesSteps.ValidateCashInToAnotherAccWithInputtedFiftyThousandsAbove();

        }

    }
    @Test(dependsOnMethods = "loginGoogle", priority = 9, description = "To validate Cash In to another Account Customer cannot found")
    public void CashInAnotherAcc_TC_09()throws Exception{
        if(this.homeSteps.isInHomePage()){
            this.walletServicesSteps.navigateWalletServicesPage();
            this.walletServicesSteps.ValidateCashInToAnotherAccCustomerCannotFound();

        }

    }


    // WALLET SERVICES / RECEIPT REPRINTING / Cash In To Own Account

    @Test(dependsOnMethods = "loginGoogle", priority = 1, description = "To validate successful WS-Reprint Cash In to Own Account Receipt Reprinting")
    public void WS_RR_TC_01()throws Exception{
        if(this.homeSteps.isInHomePage()){
            this.walletServicesSteps.navigateWalletServicesPage();
            this.walletServicesSteps.validateSuccessfulCashInOwnReprinting();

        }

    }
    @Test(dependsOnMethods = "loginGoogle", priority = 2, description = "To validate WS-Reprint Cash In to Own Account Receipt Reprinting with Incomplete Invalid Reference Number")
    public void WS_RR_TC_02()throws Exception{
        if(this.homeSteps.isInHomePage()){
            this.walletServicesSteps.navigateWalletServicesPage();
            this.walletServicesSteps.validateCashInOwnInvalidRefNumReprinting();

        }

    }
    @Test(dependsOnMethods = "loginGoogle", priority = 3, description = "To validate WS-Reprint Cash In to Own Account Receipt Reprinting with Empty Reference Number")
    public void WS_RR_TC_03()throws Exception{
        if(this.homeSteps.isInHomePage()){
            this.walletServicesSteps.navigateWalletServicesPage();
            this.walletServicesSteps.validateCashInOwnEmptyRefNumReprinting();

        }

    }
    @Test(dependsOnMethods = "loginGoogle", priority = 4, description = "To validate WS-Reprint Cash In to Own Account Receipt Reprinting with Complete Invalid Reference Number")
    public void WS_RR_TC_04()throws Exception{
        if(this.homeSteps.isInHomePage()){
            this.walletServicesSteps.navigateWalletServicesPage();
            this.walletServicesSteps.validateCashInOwnCompleteInvalidRefNumReprinting();

        }

    }


    // WALLET SERVICES / RECEIPT REPRINTING / Cash In To Another Account
    @Test(dependsOnMethods = "loginGoogle", priority = 5, description = "To validate successful WS-Reprint Cash In to Another Account Receipt Reprinting")
    public void WS_RR_TC_05()throws Exception{
        if(this.homeSteps.isInHomePage()){
            this.walletServicesSteps.navigateWalletServicesPage();
            this.walletServicesSteps.validateSuccessfulCashInAnotherAccReprinting();

        }

    }
    @Test(dependsOnMethods = "loginGoogle", priority = 6, description = "To validate WS-Reprint Cash In to Another Account Receipt Reprinting with Incomplete Invalid Reference Number")
    public void WS_RR_TC_06()throws Exception{
        if(this.homeSteps.isInHomePage()){
            this.walletServicesSteps.navigateWalletServicesPage();
            this.walletServicesSteps.validateCashInAnotherAccInvalidRefNumReprinting();

        }

    }
    @Test(dependsOnMethods = "loginGoogle", priority = 7, description = "To validate WS-Reprint Cash In to Another Account Receipt Reprinting with Empty Reference Number")
    public void WS_RR_TC_07()throws Exception{
        if(this.homeSteps.isInHomePage()){
            this.walletServicesSteps.navigateWalletServicesPage();
            this.walletServicesSteps.validateCashInAnotherAccEmptyRefNumReprinting();

        }

    }
    @Test(dependsOnMethods = "loginGoogle", priority = 8, description = "To validate WS-Reprint Cash In to Another Account Receipt Reprinting with Complete Invalid Reference Number")
    public void WS_RR_TC_08()throws Exception{
        if(this.homeSteps.isInHomePage()){
            this.walletServicesSteps.navigateWalletServicesPage();
            this.walletServicesSteps.validateCashInAnotherAccCompleteInvalidRefNumReprinting();

        }

    }
    // WALLET SERVICES / RECEIPT REPRINTING / Cash Out
    @Test(dependsOnMethods = "loginGoogle", priority = 9, description = "To validate successful WS-ReprintCash Out Receipt Reprinting")
    public void WS_RR_TC_09()throws Exception{
        if(this.homeSteps.isInHomePage()){
            this.walletServicesSteps.navigateWalletServicesPage();
            this.walletServicesSteps.validateSuccessfulCashOutReprinting();

        }

    }
    @Test(dependsOnMethods = "loginGoogle", priority = 10, description = "To validate WS-Reprint Cash Out Receipt Reprinting with Incomplete Invalid Reference Number")
    public void WS_RR_TC_10()throws Exception{
        if(this.homeSteps.isInHomePage()){
            this.walletServicesSteps.navigateWalletServicesPage();
            this.walletServicesSteps.validateCashOutInvalidRefNumReprinting();

        }

    }
    @Test(dependsOnMethods = "loginGoogle", priority = 11, description = "To validate WS-Reprint Cash Out Receipt Reprinting with Empty Reference Number")
    public void WS_RR_TC_11()throws Exception{
        if(this.homeSteps.isInHomePage()){
            this.walletServicesSteps.navigateWalletServicesPage();
            this.walletServicesSteps.validateCashOutEmptyRefNumReprinting();

        }

    }
    @Test(dependsOnMethods = "loginGoogle", priority = 12, description = "To validate WS-Reprint Cash Out Receipt Reprinting with Complete Invalid Reference Number")
    public void WS_RR_TC_12()throws Exception{
        if(this.homeSteps.isInHomePage()){
            this.walletServicesSteps.navigateWalletServicesPage();
            this.walletServicesSteps.validateCashOutCompleteInvalidRefNumReprinting();

        }

    }

    // WALLET SERVICES / RECEIPT REPRINTING / Kwarta Padala Payout Receipt
    @Test(dependsOnMethods = "loginGoogle", priority = 13, description = "To validate successful WS-Reprint Kwarta Padala Payout Receipt Reprinting")
    public void WS_RR_TC_13()throws Exception{
        if(this.homeSteps.isInHomePage()){
            this.walletServicesSteps.navigateWalletServicesPage();
            this.walletServicesSteps.validateSuccessfulKPPayoutReprinting();

        }

    }
    @Test(dependsOnMethods = "loginGoogle", priority = 14, description = "To validate WS-Reprint Kwarta Padala Payout Receipt Reprinting with Incomplete Invalid Reference Number")
    public void WS_RR_TC_14()throws Exception{
        if(this.homeSteps.isInHomePage()){
            this.walletServicesSteps.navigateWalletServicesPage();
            this.walletServicesSteps.validateKPPayoutInvalidRefNumReprinting();

        }

    }
    @Test(dependsOnMethods = "loginGoogle", priority = 15, description = "To validate WS-Reprint Kwarta Padala Payout Receipt Reprinting with Empty Reference Number")
    public void WS_RR_TC_15()throws Exception{
        if(this.homeSteps.isInHomePage()){
            this.walletServicesSteps.navigateWalletServicesPage();
            this.walletServicesSteps.validateKPPayoutCompleteInvalidRefNumReprinting();

        }

    }
    @Test(dependsOnMethods = "loginGoogle", priority = 16, description = "To validate WS-Reprint Kwarta Padala Payout Receipt Reprinting with Complete Invalid Reference Number")
    public void WS_RR_TC_16()throws Exception{
        if(this.homeSteps.isInHomePage()){
            this.walletServicesSteps.navigateWalletServicesPage();
            this.walletServicesSteps.validateKPPayoutEmptyRefNumReprinting();

        }

    }
}
