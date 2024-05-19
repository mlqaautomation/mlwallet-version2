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
public class PayBills extends Base_Steps{
    Login login = new Login();

    public void payBillsNavigation() throws Exception {
        mobileGeneralMethod.isVisible(payBillsObject.objPayBills(),"Pay Bills Icon");
        mobileGeneralMethod.tap(payBillsObject.objPayBills(), "Click Pay Bills Icon");
        mobileGeneralMethod.waitSleep(3000);
    }
    public void searchBiller() throws Exception {
        mobileGeneralMethod.type(payBillsObject.objSearchBiller(), prop.getproperty("Biller_Name"), "Search Biller");
        mobileGeneralMethod.isVisible(payBillsObject.objMisBillsPayBiller(), "Mis Bills Pay Biller");
        mobileGeneralMethod.tap(payBillsObject.objMisBillsPayBiller(), "Mis Bills Pay Biller");
        mobileGeneralMethod.waitSleep(5000);
    }
    public void billerDetails(String sFirstName, String sLastName, String sMiddleName, String sAmount) throws Exception {
        if (mobileGeneralMethod.isVisible(payBillsObject.objBillsPayInformation(),"Bills Pay Information Page")) {
            mobileGeneralMethod.type(payBillsObject.objAccountNumberField(), prop.getproperty("AccountNumber"), "Account Number Text Field");
            mobileGeneralMethod.type(payBillsObject.objFirstNameField(), sFirstName, "First Name Text Field");
            mobileGeneralMethod.type(payBillsObject.objMiddleNameField(), sMiddleName, "Middle Name Text Field");
            mobileGeneralMethod.type(payBillsObject.objLastnameField(), sLastName, "Last Name Text Field");
            mobileGeneralMethod.verticalSwipe();
            mobileGeneralMethod.type(payBillsObject.objAmountField(), sAmount, "Amount to Send Text Field");
            mobileGeneralMethod.tap(payBillsObject.objConfirmBtn(),"Confirm Button");
            mobileGeneralMethod.waitSleep(8000);
        }
    }
    public void confirmDetailsAndPay() throws Exception {
        if (mobileGeneralMethod.isVisible(payBillsObject.objConfirmDetails(),"Confirmation Details Page")) {
            mobileGeneralMethod.verticalSwipe();
            mobileGeneralMethod.tap(payBillsObject.objPayBtn(),"Pay Button");
            mobileGeneralMethod.waitSleep(10000);
        }
    }
    public void paybillsSuccessfulTransaction_PB_TC_19() throws Exception {
        login.loginWalletFullyTier();
        payBillsNavigation();
        searchBiller();
        billerDetails(propertyReader.getproperty("First_Name"), propertyReader.getproperty("Middle_Name"), propertyReader.getproperty("Last_Name"), propertyReader.getproperty("AmountInput"));
        confirmDetailsAndPay();
        mobileGeneralMethod.tap(mlWalletPageObjects.continue2_btn(),"Continue Button");
        mobileGeneralMethod.waitSleep(10000);
        mobileGeneralMethod.isVisible(payBillsObject.objTransactionDetails(), "Transaction Details Page");
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.tap(payBillsObject.objNewTransactionBtn(),"New Transaction Button");
        mobileGeneralMethod.waitSleep(5000);
        mobileGeneralMethod.tap(payBillsObject.objRecentTransactionOne(), "Recent Transaction");
        mobileGeneralMethod.waitSleep(5000);
        if (mobileGeneralMethod.isVisible(payBillsObject.objBillsPayInformation(),"Bills Pay Information")) {
            mobileGeneralMethod.isVisible(payBillsObject.objMisBillsPayBiller(),"Mis Bills Pay Biller");
            LoggingUtils.info("PB_TC_19, Pay Bills Recent Transaction Validated");
            ExtentReporter.logPass("PB_TC_19", "PB_TC_19, Pay Bills Recent Transaction validated");
            System.out.println("-----------------------------------------------------------");
        }
        else{
            ExtentReporter.logFail("PB_TC_19", "PB_TC_19, Failed Pay Bills Recent Transaction to validate!");
            System.out.println("-----------------------------------------------------------");
        }
    }
}
