package mlkpx.testSteps;

import utilities.ExtentReport.ExtentReporter;
import utilities.Logger.LoggingUtils;

public class WS_CashInToOwnAccount_Steps extends Base_Steps{
    public void navigationWalletServices()throws Exception{
        click(wsCashInToOwnAccountPageObjects.walletServicesLink(), "Wallet Services Page ");
        if(isVisible(wsCashInToOwnAccountPageObjects.walletServicesText(), getText(wsCashInToOwnAccountPageObjects.walletServicesText()))){
            ExtentReporter.logPass("CIOA_TC_01", "Successfully Validated Wallet Services Page");
        }else{
            ExtentReporter.logFail("CIOA_TC_01", "Failed to Validate Wallet Services Page");
        }
    }
    public void CIOA_TC_01()throws Exception{
        navigationWalletServices();
//        if(isVisible(wsCashInToOwnAccountPageObjects.walletServicesText(), getText(wsCashInToOwnAccountPageObjects.walletServicesText()))){
//            ExtentReporter.logPass("CIOA_TC_01", "Successfully Validated SendOut Domestic Page Navigation");
//        }else{
//            ExtentReporter.logFail("CIOA_TC_01", "Failed to Validate SendOut Domestic Page Navigation");
//        }
    }
}
