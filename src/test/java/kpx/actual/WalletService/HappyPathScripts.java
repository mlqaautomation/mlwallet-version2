package kpx.actual.WalletService;

import kpx.base.BaseTest;
import mlwallet.testSteps.KwartaPadala_Wallet;
import org.testng.annotations.Test;
import utilities.ExtentReport.ExtentReporter;

import static org.testng.Assert.assertTrue;
import static utilities.Driver.AppiumDriverManager.APP_ID;
import static utilities.Driver.AppiumDriverManager.getAndroidDriver;

public class HappyPathScripts extends BaseTest {
//    @Test(description = "Test to verify app is installed")
//    public void isAppInstalledTest(){
//        assertTrue(getAndroidDriver().isAppInstalled(APP_ID));
//        ExtentReporter.logPass("isAppInstalledTest", "MLWALLET is installed");
//    }
//    ----------Transactionals
//    --------------CashOutViaBranch
//    @Test(priority = 1, description = "cashOutViaBranchSuccessfulTransaction_WM_TC_05")
//    public void cashOutViaBranchSuccessfulTransaction_WM_TC_05() throws Exception {
//        cashOutViaBranch.cashOutViaBranchSuccessfulTransaction_WM_TC_05();
//    }
////    --------------CashInViaBranch
//    @Test(priority = 2, description = "cashInViaBranchSuccessfulTransaction_CIBR_1")
//    public void cashInViaBranchSuccessfulTransaction_CIBR_1() throws Exception {
//        cashInViaBranch.cashInViaBranchSuccessfulTransaction_CIBR_TC_16();
//    }
////    --------------KwartaPadalaViaWalletUser
//    @Test(priority = 3, description = "kwartaPadalaViaMLWalletSuccessfulTransaction_STW_TC_02")
//    public void kwartaPadalaViaMLWalletSuccessfulTransaction_STW_TC_02() throws Exception{
//        kwartaPadalaWallet.kwartaPadalaViaMLWalletSuccessfulTransaction_STW_TC_02();
//    }
//    //--------------ELoad
//    @Test(priority = 4, description = "buyELoadSuccessfulTransaction_BE_TC_26")
//    public void buyELoadSuccessfulTransaction_BE_TC_26() throws Exception {
//        buyELoad.buyELoadSuccessfulTransaction_BE_TC_26();
//    }
////    --------------GCash
//    @Test(priority = 5, description = "GCashSuccessfulTransaction_GC_SM_TC_76")
//    public void GCashSuccessfulTransaction_GC_SM_TC_76() throws Exception {
//        gCash.GCashSuccessfulTransaction_GC_SM_TC_76();
//    }
////    --------------PayBills
//    @Test(priority = 6, description = "paybillsSuccessfulTransaction_PB_TC_19")
//    public void paybillsSuccessfulTransaction_PB_TC_19() throws Exception {
//        payBills.paybillsSuccessfulTransaction_PB_TC_19();
//    }
//    //--------------TopUpGames
//    @Test(priority = 7, description = "topUpGamesSuccessfulTransaction_TUG_TC_06")
//    public void topUpGamesSuccessfulTransaction_TUG_TC_06() throws Exception {
//        topUpGames.topUpGamesSuccessfulTransaction_TUG_TC_06();
//    }
////    --------------KwartaPadalaViaWalletBranch
//    @Test(priority = 8, description = "kwartaPadalaViaBranchSuccessfulTransaction_STB_TC_02")
//    public void kwartaPadalaViaBranchSuccessfulTransaction_STB_TC_02() throws Exception {
//        kwartaPadalaBranch.kwartaPadalaViaBranchSuccessfulTransaction_STB_TC_02();
//    }






//   ----------Non Transactionals
    //-----------History
//    @Test(priority = 9, description = "mlWallet_TransactionHistory_01")
//    public void mlWallet_TransactionHistory_01() throws Exception {
//        history.mlWallet_TransactionHistory_TH_TC_01();
//    }
//
//    @Test(priority = 10, description = "SuccessfulRequestTransactionPage_30")
//    public void SuccessfulRequestTransactionPage_30() throws Exception {
//        history.SuccessfulRequestTransactionPage_TH_TC_30();
//    }
//    //-----------Login
//    @Test(priority = 11, description = "loginWalletBranchTier_01")
//    public void loginWalletBranchTier_01() throws Exception {
//        loginWalletSteps.loginWalletBranchTier();
//    }
//    //----------Logout
//    @Test(priority = 12, description = "logInWithChangeNumber_01")
//    public void logInWithChangeNumber_01() throws Exception {
//        logout.logInWithChangeNumber_Lout_TC_09();
//    }
//    ----------Registration
    @Test(priority = 13, description = "registrationTermsAndConditionPageBackBtnValidation_08")
    public void registrationTermsAndConditionPageBackBtnValidation_08() throws Exception {
        registration.registrationTermsAndConditionPageBackBtnValidation_RG_TC_37();
    }
    //----------Trouble Sign In
//    @Test(priority = 14, description = "troubleSigningInSuccessRequestValidation_01")
//    public void troubleSigningInSuccessRequestValidation_01() throws Exception {
//        troubleSignIn.troubleSigningInSuccessRequestValidation_02();
//    }
}
