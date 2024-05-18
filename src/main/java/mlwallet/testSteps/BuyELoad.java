package mlwallet.testSteps;
import org.openqa.selenium.By;
import org.testng.Assert;
import utilities.ExtentReport.ExtentReporter;
import utilities.Logger.LoggingUtils;
import mlwallet.testSteps.Login;
import utilities.yamlReader.yamlReader;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public class BuyELoad extends Base_Steps{
    Login login = new Login();
    public void buyELoadSuccessfulTransaction_BE_TC_26() throws Exception {
        login.loginWalletFullyTier();
        mobileGeneralMethod.tap(buyEloadObject.objEloadTab(), "Buy eLoad");
        mobileGeneralMethod.waitSleep(5000);
        mobileGeneralMethod.isVisible(buyEloadObject.objEloadtransactionPage(), "eLoad Transaction Page");
        mobileGeneralMethod.tap(buyEloadObject.objSelectSmartTelco(), "Telco");
        mobileGeneralMethod.tap(buyEloadObject.objMobileNoField(), "Mobile Number Field");
        mobileGeneralMethod.type(buyEloadObject.objMobileNoField(),"Mobile Number",propertyReader.getproperty("MobileNo"));
        mobileGeneralMethod.waitSleep(3000);
        mobileGeneralMethod.tap(buyEloadObject.objSelectSmartTelco(), "Telco");
        mobileGeneralMethod.waitSleep(3000);
        mobileGeneralMethod.tap(buyEloadObject.objNextBtn(), "Next Button");
        mobileGeneralMethod.waitSleep(5000);
        mobileGeneralMethod.isVisible(buyEloadObject.objLoadSelectionPage(), "Load Selection Page");
        mobileGeneralMethod.waitSleep(3000);
        mobileGeneralMethod.tap(buyEloadObject.objPromoLoadTab(), "Promo Load Tab");
        mobileGeneralMethod.waitSleep(3000);
        mobileGeneralMethod.tap(buyEloadObject.obj10SmartRegular(), "Promo");
        mobileGeneralMethod.isVisible(buyEloadObject.objContinuePromoPopUp(), "Pop Up");
        mobileGeneralMethod.waitSleep(5000);
        mobileGeneralMethod.tap(buyEloadObject.objConfirmBtn(), "Confirm Button");
        mobileGeneralMethod.isVisible(buyEloadObject.objBuyLoad(), "Page");
        mobileGeneralMethod.tap(buyEloadObject.objConfirmBtn(), "Confirm Button");
        mobileGeneralMethod.waitSleep(10000);
        mobileGeneralMethod.tap(mlWalletPageObjects.continue2_btn(),"Continue Button");
        mobileGeneralMethod.waitSleep(15000);
        if (mobileGeneralMethod.isVisible(buyEloadObject.objTransactionDetailsPage(), "Page")) {
            mobileGeneralMethod.isVisible(buyEloadObject.objMobileNumberInTransactionDetails(), "Mobile Number");
            mobileGeneralMethod.isVisible(buyEloadObject.objBuyELoadTime(), "Date and Time");
            mobileGeneralMethod.isVisible(buyEloadObject.objTypeOfPromoUsed(), "Promo");
            mobileGeneralMethod.isVisible(buyEloadObject.objAmountToSend(), "Amount to Send");
            mobileGeneralMethod.isVisible(buyEloadObject.objServiceFee(), "Service Fee");
            mobileGeneralMethod.isVisible(buyEloadObject.objTotalAmount(), "Total Amount");
            LoggingUtils.info("BE_TC_26(), Buy ELoad Successful Transaction UI validated");
            ExtentReporter.logPass("BE_TC_26", "BE_TC_26(), Buy ELoad Successful Transaction UI validated");
            System.out.println("-----------------------------------------------------------");
        }
        else{
            ExtentReporter.logFail("BE_TC_26", "BE_TC_26(), Buy ELoad Failed Transaction UI validated");
            System.out.println("-----------------------------------------------------------");
        }
    }
}
