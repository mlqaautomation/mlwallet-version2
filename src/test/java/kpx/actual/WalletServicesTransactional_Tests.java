package kpx.actual;

import kpx.base.BaseTest;
import org.testng.annotations.Test;
import utilities.ExtentReport.ExtentReporter;

public class WalletServicesTransactional_Tests extends BaseTest {
    @Test(description = "Logging in via gmail and kpx")
    public void loginGoogle() throws Exception {
        this.loginSteps.signInGoogle("teller");
        this.loginSteps.loginKpx("teller");
        if(this.homeSteps.isInHomePage()){
            ExtentReporter.logPass("loginGoogle", "Login, Passed!!");
        }
    }
////////////////////////////CASH IN TO OWN ACCOUNT TRANSACTIONAL////////////////////////////////////////////
//    @Test(dependsOnMethods = "loginGoogle", priority = 1, description = "Validate Cash In to Own Account Page")
//    public void CIOA_TC_01() throws Exception {
//        if (this.homeSteps.isInHomePage()) {
//            this.wsCashInToOwnAccountSteps.CIOA_TC_01();
//        }
//    }
//
//    @Test(dependsOnMethods = "loginGoogle" , priority = 2, description = "Verify CASH IN Remote")
//    public void CIOA_TC_11()throws Exception{
//        if(this.homeSteps.isInHomePage()) {
//            this.wsCashInToOwnAccountSteps.CIOA_TC_11();
//
//        }
//
//    }
//
//    ////////////////////////////CASH IN TO ANOTHER ACCOUNT TRANSACTIONAL////////////////////////////////////////////
//    @Test(dependsOnMethods = "loginGoogle", priority = 3, description = "To validate successful Cash In to another Account")
//    public void CashInAnotherAcc_TC_01()throws Exception{
//        if(this.homeSteps.isInHomePage()){
//            this.wsCashInToAnotherAccount.navigateWalletServicesPage();
//            this.wsCashInToAnotherAccount.ValidateSuccessCashInToAnotherAccount();
//
//        }
//
//    }
//    @Test(dependsOnMethods = "loginGoogle", priority = 4, description = "To validate remote successful Cash In to another Account")
//    public void CashInAnotherAcc_TC_02()throws Exception{
//        if(this.homeSteps.isInHomePage()){
//            this.wsCashInToAnotherAccount.navigateWalletServicesPage();
//            this.wsCashInToAnotherAccount.ValidateRemoteSuccessCashInToAnotherAccount();
//
//        }
//
//    }


    ////////////////////////////CASH OUT TRANSACTIONAL////////////////////////////////////////////
    @Test(dependsOnMethods = "loginGoogle", priority = 5, description = "Validate Cash Out")
    public void CO_TC_01() throws Exception {
        if (this.homeSteps.isInHomePage()) {
            this.wsCashOutSteps.CO_TC_01();

        }

    }

//    @Test(dependsOnMethods = "loginGoogle", priority = 6, description = "Validate verify remote Cash Out")
//    public void CO_TC_08() throws Exception {
//        if (this.homeSteps.isInHomePage()) {
//            this.wsCashOutSteps.CO_TC_08();
//
//        }
//
//    }

    ////////////////////////////KWARTA PADALA TRANSACTIONAL////////////////////////////////////////////
    @Test(dependsOnMethods = "loginGoogle", priority = 7, description = "Validate To validate successful Wallet Services Kwarta Padala Payout")
    public void KPP_TC_01() throws Exception {
        if (this.homeSteps.isInHomePage()) {
            this.wsKwartaPadalaPayOutSteps.KPP_TC_01();

        }

    }
    @Test(dependsOnMethods = "loginGoogle", priority = 8, description = "Validate To validate successful remote Wallet Services Kwarta Padala Payout")
    public void KPP_TC_02() throws Exception {
        if (this.homeSteps.isInHomePage()) {
            this.wsKwartaPadalaPayOutSteps.KPP_TC_02();

        }
    }

}
