package mlkpx.testSteps;

import org.testng.Assert;
import utilities.ExtentReport.ExtentReporter;

public class WS_ShopSafe_Steps extends Base_Steps{
    public void To_Validate_Shop_Safe_Page_WS_SS_01()throws Exception{
        click(wsShopSafePageObjects.walletServicesLink(), "Wallet Services Page ");
        isVisible(wsShopSafePageObjects.shopsafeTextheader(), "Shop Safe Header");

        if(isVisible(wsShopSafePageObjects.shopsafeText(), getText(wsShopSafePageObjects.shopsafeText()))){
            ExtentReporter.logPass("Shop Safe Page navigation", "Successfully Validated Shop Safe Page");
        }else{
            ExtentReporter.logFail("Shop Safe Page navigation", "Failed to Validate Shop Safe Page");
            Assert.fail("Failed to Validate Shop Safe Page");
        }
    }

    public void To_Validate_Shop_Safe_Page_WS_SS_02()throws Exception{
        click(wsShopSafePageObjects.walletServicesLink(), "Wallet Services Page ");
        if(isVisible(wsShopSafePageObjects.shopsafeText(), getText(wsShopSafePageObjects.shopsafeText()))){
            ExtentReporter.logPass("Shop Safe Page navigation", "Successfully Validated Shop Safe Page");
        }else{
            ExtentReporter.logFail("Shop Safe Page navigation", "Failed to Validate Shop Safe Page");
            Assert.fail("Failed to Validate Shop Safe Page");
        }
    }





}
