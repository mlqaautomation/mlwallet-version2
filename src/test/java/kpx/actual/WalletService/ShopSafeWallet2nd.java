package kpx.actual.WalletService;

import kpx.base.BaseTest;
import org.testng.annotations.Test;
import utilities.ExtentReport.ExtentReporter;

import static org.testng.Assert.assertTrue;
import static utilities.Driver.AppiumDriverManager.APP_ID;
import static utilities.Driver.AppiumDriverManager.getAndroidDriver;

public class ShopSafeWallet2nd extends BaseTest {
    @Test(description = "Test to verify app is installed")
    public void isAppInstalledTest(){
        assertTrue(getAndroidDriver().isAppInstalled(APP_ID));
        ExtentReporter.logPass("isAppInstalledTest", "MLWALLET is installed");
    }

    @Test(priority = 8, description = "SHOP SAFE BTCH 22")
    public void SSM_TC_14_Verify_buyer_Receive_Item_Ready_For_Pick_Up() throws Exception {
        shopSafe.SSM_TC_14_Verify_buyer_Receive_Item_Ready_For_Pick_Up();
    }
}
