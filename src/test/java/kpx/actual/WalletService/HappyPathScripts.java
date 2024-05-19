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

    //--------------KwartaPadalaViaWalletUser
    @Test(priority = 3, description = "TEST TO")
    public void kwartaPadalaViaMLWalletSuccessfulTransaction_STW_TC_02() throws Exception{
        kwartaPadalaWallet.kwartaPadalaViaMLWalletSuccessfulTransaction_STW_TC_02();
    }
    //--------------ELoad
    @Test(priority = 5, description = "TEST TO")
    public void buyELoadSuccessfulTransaction_BE_TC_26() throws Exception {
        buyELoad.buyELoadSuccessfulTransaction_BE_TC_26();
    }
    //--------------GCash
    @Test(priority = 6, description = "TEST TO")
    public void GCashSuccessfulTransaction_GC_SM_TC_76() throws Exception {
        gCash.GCashSuccessfulTransaction_GC_SM_TC_76();
    }
    @Test(priority = 7, description = "TEST TO")
    public void paybillsSuccessfulTransaction_PB_TC_19() throws Exception {
        payBills.paybillsSuccessfulTransaction_PB_TC_19();
    }
}
