package kpx.actual.WalletService;

import kpx.base.BaseTest;
import mlwallet.testSteps.KwartaPadala_Wallet;
import org.testng.annotations.Test;
import utilities.ExtentReport.ExtentReporter;

import static org.testng.Assert.assertTrue;
import static utilities.Driver.AppiumDriverManager.APP_ID;
import static utilities.Driver.AppiumDriverManager.getAndroidDriver;

public class EloadScripts extends BaseTest {
    @Test(priority = 7, description = "TEST TO")
    public void paybillsSuccessfulTransaction_PB_TC_19() throws Exception {
        payBills.paybillsSuccessfulTransaction_PB_TC_19();
    }
}
