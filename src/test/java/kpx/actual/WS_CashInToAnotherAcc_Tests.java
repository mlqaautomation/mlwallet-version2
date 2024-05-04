package kpx.actual;

import kpx.base.BaseTest;
import org.testng.annotations.Test;
import utilities.ExtentReport.ExtentReporter;

public class WS_CashInToAnotherAcc_Tests extends BaseTest {
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
            this.wsCashInToAnotherAccount.navigateWalletServicesPage();
            this.wsCashInToAnotherAccount.ValidateSuccessCashInToAnotherAccount();

        }

    }
    @Test(dependsOnMethods = "loginGoogle", priority = 2, description = "To validate remote successful Cash In to another Account")
    public void CashInAnotherAcc_TC_02()throws Exception{
        if(this.homeSteps.isInHomePage()){
            this.wsCashInToAnotherAccount.navigateWalletServicesPage();
            this.wsCashInToAnotherAccount.ValidateRemoteSuccessCashInToAnotherAccount();

        }

    }
    @Test(dependsOnMethods = "loginGoogle", priority = 3, description = "To validate Cash In to another Account with no mobile number")
    public void CashInAnotherAcc_TC_03()throws Exception{
        if(this.homeSteps.isInHomePage()){
            this.wsCashInToAnotherAccount.navigateWalletServicesPage();
            this.wsCashInToAnotherAccount.ValidateCashInToAnotherAccWithNoMobileProvided();

        }

    }
    @Test(dependsOnMethods = "loginGoogle", priority = 4, description = "To validate Cash In to another Account with Invalid mobile number")
    public void CashInAnotherAcc_TC_04()throws Exception{
        if(this.homeSteps.isInHomePage()){
            this.wsCashInToAnotherAccount.navigateWalletServicesPage();
            this.wsCashInToAnotherAccount.ValidateCashInToAnotherAccWithInvalidMobileProvided();

        }

    }
    @Test(dependsOnMethods = "loginGoogle", priority = 5, description = "To validate Cash In to another Account with No Principal Amount")
    public void CashInAnotherAcc_TC_05()throws Exception{
        if(this.homeSteps.isInHomePage()){
            this.wsCashInToAnotherAccount.navigateWalletServicesPage();
            this.wsCashInToAnotherAccount.ValidateCashInToAnotherAccWithNoPrincipal();

        }

    }
    @Test(dependsOnMethods = "loginGoogle", priority = 6, description = "To validate Cash In to another Account with Inputted Zero Amount")
    public void CashInAnotherAcc_TC_06()throws Exception{
        if(this.homeSteps.isInHomePage()){
            this.wsCashInToAnotherAccount.navigateWalletServicesPage();
            this.wsCashInToAnotherAccount.ValidateCashInToAnotherAccWithInputtedZero();

        }

    }
    @Test(dependsOnMethods = "loginGoogle", priority = 7, description = "To validate Cash In to another Account with Inputted less than from the total amount")
    public void CashInAnotherAcc_TC_07()throws Exception{
        if(this.homeSteps.isInHomePage()){
            this.wsCashInToAnotherAccount.navigateWalletServicesPage();
            this.wsCashInToAnotherAccount.ValidateCashInToAnotherAccWithInputtedLessTotal();

        }

    }
    @Test(dependsOnMethods = "loginGoogle", priority = 8, description = "To validate Cash In to another Account with Inputted max 50,000")
    public void CashInAnotherAcc_TC_08()throws Exception{
        if(this.homeSteps.isInHomePage()){
            this.wsCashInToAnotherAccount.navigateWalletServicesPage();
            this.wsCashInToAnotherAccount.ValidateCashInToAnotherAccWithInputtedFiftyThousandsAbove();

        }

    }
    @Test(dependsOnMethods = "loginGoogle", priority = 9, description = "To validate Cash In to another Account Customer cannot found")
    public void CashInAnotherAcc_TC_09()throws Exception{
        if(this.homeSteps.isInHomePage()){
            this.wsCashInToAnotherAccount.navigateWalletServicesPage();
            this.wsCashInToAnotherAccount.ValidateCashInToAnotherAccCustomerCannotFound();

        }

    }

}
