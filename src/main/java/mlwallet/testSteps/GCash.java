package mlwallet.testSteps;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.testng.Assert;
import utilities.ExtentReport.ExtentReporter;
import utilities.Logger.LoggingUtils;
import mlwallet.testSteps.Login;
import utilities.yamlReader.yamlReader;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class GCash extends Base_Steps{
    Login login = new Login();
    public double getWalletBalance() throws Exception {
        String balanceText = "";
        if (mobileGeneralMethod.isVisible(homePageObject.objEyeIcon(), "Eye Icon Visible")) {
            mobileGeneralMethod.tap(homePageObject.objEyeIcon(), "Eye Icon");
            mobileGeneralMethod.waitSleep(3000);
            balanceText =  mobileGeneralMethod.getText(homePageObject.objAvailableBalance());
            LoggingUtils.info("Balance is = " + balanceText);
        } else {
            balanceText =  mobileGeneralMethod.getText(homePageObject.objAvailableBalance());
            LoggingUtils.info("Balance is = " + balanceText);
        }
        // Remove commas from the balance text and parse it as a double
        double balance = Double.parseDouble(balanceText.replace(",", ""));
        return balance;
    }
    public void goToGcash() throws Exception {
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.tap(gCashObjects.objGcashText(), "Gcash Icon Text");
        if (mobileGeneralMethod.isVisible(gCashObjects.objGcashOptionsText(), "Gcash Options Text")) {
            LoggingUtils.info("Navigated to Gcash Services Page");
        } else {
            LoggingUtils.info("Not Navigated to Gcash Services Page");
        }
    }
    public double parseDouble(String value)throws Exception {
        String cleanValue = value.replace(",", "").trim();
        return Double.parseDouble(cleanValue);
    }
    public void verifyTransactionDetails() throws Exception {
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.isVisible(gCashObjects.objTransactionDetailsText(), "Transaction Details");
        mobileGeneralMethod.isVisible(gCashObjects.objReceiverNumber_Transaction(), "Receiver Number");
        mobileGeneralMethod.isVisible(gCashObjects.objSenderName_Transaction(), "Sender Name");
        mobileGeneralMethod.isVisible(gCashObjects.objSenderNumber_Transaction(), "Sender Number");
        mobileGeneralMethod.isVisible(gCashObjects.objGcashAmount(), "Gcash Amount");
        mobileGeneralMethod.isVisible(gCashObjects.objGcashServiceFee(), "Gcash Service Fee");
        mobileGeneralMethod.isVisible(gCashObjects.objGcashTotal(), "Total Amount");
        mobileGeneralMethod.isVisible(gCashObjects.objGcashReminder(), "Reminder");
    }
    public void cancelPreviousTransaction() throws Exception {
        mobileGeneralMethod.waitSleep(3000);
        try {
            if (mobileGeneralMethod.isDisplayed(gCashObjects.objProceedBtn())) {
                mobileGeneralMethod.tap(gCashObjects.objProceedBtn(),"Click Proceed");
                mobileGeneralMethod.isVisible(gCashObjects.objConfirmDetailsPage(), "Confirm Details Page");
                mobileGeneralMethod.tap(gCashObjects.objConfirmBtn(), "Confirm Button");
                mobileGeneralMethod.waitSleep(8000);
                mobileGeneralMethod.tap(loginObject.objContinueBtn(), "Continue Button");
                mobileGeneralMethod.waitSleep(25000);
            }
        }
        catch (NoSuchElementException e){
            mobileGeneralMethod.isVisible(gCashObjects.objConfirmDetailsPage(), "Confirm Details Page");
            mobileGeneralMethod.tap(gCashObjects.objConfirmBtn(), "Confirm Button");
            mobileGeneralMethod.waitSleep(8000);
            mobileGeneralMethod.tap(loginObject.objContinueBtn(), "Continue Button");
            mobileGeneralMethod.waitSleep(25000);
        }
    }
    public void confirmGcashTransaction() throws Exception {
        mobileGeneralMethod.tap(gCashObjects.objGcashText(), "Gcash Icon Button");
        mobileGeneralMethod.tap(gCashObjects.objGcashSendMoneyText(), "Send Money To Gcash");
        mobileGeneralMethod.type(gCashObjects.objGcashMobileNumber(), "Mobile Number",propertyReader.getproperty("GcashMobileNo"));
        mobileGeneralMethod.tap(gCashObjects.objNextBtn(), "Next Button");
        mobileGeneralMethod.waitSleep(3000);
        mobileGeneralMethod.type(gCashObjects.objAmountTextBox(),"Amount",propertyReader.getproperty("AmountInput"));
        mobileGeneralMethod.tap(gCashObjects.objNextBtn(), "Next Button");
        mobileGeneralMethod.waitSleep(8000);
        cancelPreviousTransaction();
    }
    //Positive
    public void GCashSuccessfulTransaction_GC_SM_TC_76() throws Exception {
        ExtentReporter.logInfo("GC_SM_TC_76","Back Home Button In GCash View Recent Transaction Dashboard Page Validated");
        login.loginWalletBranchTier();
        double prevBalance = getWalletBalance();
        confirmGcashTransaction();
        mobileGeneralMethod.isVisible(gCashObjects. objTransactionDetailsText(), "Transaction Details");
        mobileGeneralMethod.waitSleep(3000);
        mobileGeneralMethod.verticalSwipe();
        String total = mobileGeneralMethod.getText(gCashObjects.objGcashTotal());
        String numericTotal = total.replaceAll("[^\\d.]", ""); // Remove non-numeric characters    
        double totalValue = parseDouble(numericTotal);
        mobileGeneralMethod.tap(gCashObjects.objBack_to_Home_Page(), "Back to Home Page");
        mobileGeneralMethod.waitSleep(5000);
        if (mobileGeneralMethod.isVisible(loginObject.objAvailableBalance(),"Available Balance")) {
            mobileGeneralMethod.verticalSwipeDown();
            double newBalance = getWalletBalance();
            double expectedBalance = prevBalance - totalValue;
            mobileGeneralMethod.assertionValidationdouble(newBalance, expectedBalance);
            mobileGeneralMethod.verticalSwipe();
            mobileGeneralMethod.waitSleep(3000);
            mobileGeneralMethod.isVisible(homePageObject.objRecentTransactions(),"Recent Transactions Header");
            mobileGeneralMethod.verticalSwipe();
            mobileGeneralMethod.tap(historyObject.objSeeMoreBtn(),"See More Button");
            mobileGeneralMethod.waitSleep(10000);
            mobileGeneralMethod.isVisible(historyObject.objTransactionHistory(),"Transaction History Page");
            mobileGeneralMethod.tap(historyObject.objSendMoneyTab(),"Send Money Tab");
            mobileGeneralMethod.waitSleep(15000);
            mobileGeneralMethod.tap(historyObject.objFirstTransaction(),"First Transaction");
            String amountHistory = mobileGeneralMethod.getText(historyObject.objTotalAmount());
            String historyTotal = amountHistory.replaceAll("[^\\d.]", ""); // Remove non-numeric characters
            double amountHistoryValue = parseDouble(historyTotal);
            mobileGeneralMethod.assertionValidationdouble(totalValue, amountHistoryValue);
            LoggingUtils.info("GC_SM_TC_76, Back Home Button In GCash View Recent Transaction Dashboard Page Validated");
            ExtentReporter.logPass("GC_SM_TC_76", "To Validate Back Home Button In GCash View Recent Transaction Dashboard Page");
            System.out.println("-----------------------------------------------------------");
        }
        else{
            ExtentReporter.logFail("GC_SM_TC_76", " Failed To Validate Back Home Button In GCash View Recent Transaction Dashboard Page");
            System.out.println("-----------------------------------------------------------");
        }
    }
    //Positive
    public void GC_SM_TC_01_Verify_user_able_see_Gcash_icon_Dashborad() throws Exception {
        ExtentReporter.logInfo("GC_SM_TC_01_", "To verify user is able to see Gcash icon in Dashborad on successful login to the application");
        login.loginWalletBranchTier();
        mobileGeneralMethod.waitSleep(1000);
        if (mobileGeneralMethod.isVisible(gCashObjects.objGcashText(), "Gcash Services Page Text")){
            LoggingUtils.info("Gcash Page Navigation Success");
            ExtentReporter.logPass("GC_Land_TC_01", "To verify user is able to see Gcash icon in Dashborad on successful login to the application");
        }
        else{
            ExtentReporter.logFail("GC_Land_TC_01", " Failed To verify user is able to see Gcash icon in Dashborad on successful login to the application");
            System.out.println("-----------------------------------------------------------");
        }
    }
    //Positive
    //GC_Land_TC_02
    public void GC_SM_TC_02_Verify_user_able_navigate_Gcash_services_page_tapping_Gcash_icon() throws Exception {
        ExtentReporter.logInfo("GC_SM_TC_02","To verify user is able to navigate to \"Gcash services\" page on tapping Gcash icon from the Dashboard");
        login.loginWalletBranchTier();
        goToGcash();
        if (mobileGeneralMethod.isVisible(gCashObjects.objGcashServicesText(), "Gcash Services Page Text")) {
            mobileGeneralMethod.isVisible(gCashObjects.objGcashSendMoneyText(), "Send Money to Gcash Text");
            LoggingUtils.info("Gcash Page Navigation Success");
            ExtentReporter.logPass("GC_Land_TC_02", "To verify user is able to navigate to \"Gcash services\" page on tapping Gcash icon from the Dashboard");
        }
        else {
            ExtentReporter.logFail("GC_Land_TC_02", " Failed To verify user is able to navigate to \"Gcash services\" page on tapping Gcash icon from the Dashboard");
            System.out.println("-----------------------------------------------------------");
        }
    }
    //Positive
    //GC_Land_TC_04
    public void GC_SM_TC_03_Verify_UI_Gcash_Services_page() throws Exception {
        ExtentReporter.logInfo("GC_SM_TC_03","To verify the UI of Gcash Services page");
        login.loginWalletBranchTier();
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.tap(gCashObjects.objGcashText(), "Gcash Icon Text");
        if (mobileGeneralMethod.isVisible(gCashObjects.objGcashServicesText(), "Gcash Services Page Text")) {
            mobileGeneralMethod.isVisible(gCashObjects.objGcashSendMoneyText(), "Send Money to Gcash Text");
            LoggingUtils.info("Gcash Page Navigation Success");
            ExtentReporter.logPass("GC_Land_TC_03", "To verify the UI of Gcash Services page");
        }
        else {
            ExtentReporter.logFail("GC_Land_TC_03", " Failed To verify the UI of Gcash Services page");
            System.out.println("-----------------------------------------------------------");
        }
    }
    //Negative
    public void GC_SM_TC_04_Verify_user_redirected_back_Dashboard_tapping_back_arrow_btn() throws Exception {
        ExtentReporter.logInfo("GC_SM_TC_04","To verify user is redirected  back to Dashboard on tapping <(back arrow) from the Gcash Services page");
        login.loginWalletBranchTier();
        mobileGeneralMethod.waitSleep(1000);
        if(mobileGeneralMethod.isVisible(gCashObjects.objGcashText(), "Gcash Icon Text")) {
            mobileGeneralMethod.tap(gCashObjects.objGcashText(), "Gcash Icon Text");
            mobileGeneralMethod.tap(gCashObjects.objGcashPage_BackBtn(), "Gcash Icon Text");
            LoggingUtils.info("Back Gcash Page Navigation Success");
            ExtentReporter.logPass("GC_Land_TC_04", "To verify user is redirected  back to Dashboard on tapping <(back arrow) from the Gcash Services page");
        }
        else {
            ExtentReporter.logFail("GC_Land_TC_04", " Failed To verify user is redirected  back to Dashboard on tapping <(back arrow) from the Gcash Services page");
            System.out.println("-----------------------------------------------------------");
        }
    }
    //GC_RM_TC_43
    public void goToSendMoneyToGcash() throws Exception {
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.tap(gCashObjects.objGcashText(), "Gcash Icon Button");
        mobileGeneralMethod.tap(gCashObjects.objGcashSendMoneyText(), "Send Money Button");
        if (mobileGeneralMethod.isVisible(gCashObjects.objSendMoneyPageHeader(), "Send Money to GCash Page")) {
            LoggingUtils.info("Navigated to Send Money to GCash Page");
            ExtentReporter.logPass("GC_Land_TC_04", "To verify user is redirected  back to Dashboard on tapping <(back arrow) from the Gcash Services page");
        } else {
            LoggingUtils.info("Not Navigated to Send Money to GCash Page");
        }
    }
    //Positive
    public void GC_SM_TC_43_VerifyuserIsRedirectedToReceiveMoneyFromGcashPage() throws Exception {
        ExtentReporter.logInfo("GC_SM_TC_43","To verify user is redirected to Receive Money from Gcash page on tapping Receive Money from Gcash Services page");
        login.loginWalletBranchTier();
        goToSendMoneyToGcash();
        if(mobileGeneralMethod.isVisible(gCashObjects.objSendMoneyPageHeader(), "Send Money to GCash Page")) {
            mobileGeneralMethod.isVisible(gCashObjects.objGcashMobileNumber(), "GCash No Text");
            LoggingUtils.info("Send Money to Gcash Page Navigation Success");
            ExtentReporter.logPass("GC_Land_TC_43", "To verify user is redirected to Receive Money from Gcash page on tapping Receive Money from Gcash Services page");
        }else {
            ExtentReporter.logFail("GC_Land_TC_43", "Failed To verify user is redirected to Receive Money from Gcash page on tapping Receive Money from Gcash Services page");
            System.out.println("-----------------------------------------------------------");
        }
    }
//Negative
    //GC_RM_TC_49
    public void GC_SM_TC_49_EmptyReceiverNumber_ErrorMsg_Validation() throws Exception {
        ExtentReporter.logInfo("GC_SM_TC_49","To Validate Error Message When Receiver Number Field is Empty ");
        login.loginWalletBranchTier();
        goToGcash();
        if(mobileGeneralMethod.isVisible(gCashObjects.objGcashSendMoneyText(), "Send Money Option")) {
            mobileGeneralMethod.tap(gCashObjects.objGcashSendMoneyText(), "Send Money Option");
            mobileGeneralMethod.tap(gCashObjects.objNextBtn(), "Next Button");
            mobileGeneralMethod.assertionValidation(mobileGeneralMethod.getText(gCashObjects.objGetErrMsg(propertyReader.getproperty("EmptyMobileNum"))), propertyReader.getproperty("EmptyMobileNum"));
            LoggingUtils.info("Error Message When Empty Receiver Number Validated");
            ExtentReporter.logPass("GC_RM_TC_49", "To Validate Error Message When Receiver Number Field is Empty ");
        }else {
            ExtentReporter.logFail("GC_RM_TC_49", "Failed To Validate Error Message When Receiver Number Field is Empty");
            System.out.println("-----------------------------------------------------------");
        }
    }
    //Negative
    //GC_RM_TC_50
    public void GC_SM_TC_50_InvalidReceiverNumber_ErrorMsg_Validation() throws Exception {
        ExtentReporter.logInfo("GC_SM_TC_50","To verify user gets an appropriate error on entering Symbols and special characters in  Receiver Mobile number field in Send Money to Gcash page");
        login.loginWalletBranchTier();
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.tap(gCashObjects.objGcashText(), "Gcash Icon Button");
        mobileGeneralMethod.tap(gCashObjects.objGcashSendMoneyText(), "Send Money Button");
        mobileGeneralMethod.waitSleep(1000);
        if(mobileGeneralMethod.isVisible(gCashObjects.objGcashMobileNumber(),"Gcash Mobile Number TxtBox")) {
            mobileGeneralMethod.type(gCashObjects.objGcashMobileNumber(), "Type Characters", propertyReader.getproperty("SpecialChar"));
            mobileGeneralMethod.tap(gCashObjects.objNextBtn(), "GCash Next Button");
            mobileGeneralMethod.assertionValidation(mobileGeneralMethod.getText(gCashObjects.objGetErrMsg(propertyReader.getproperty("InvalidMobileNum"))), propertyReader.getproperty("InvalidMobileNum"));
            LoggingUtils.info("Prompt mobile no is Invalid Special Characters");
            ExtentReporter.logPass("GC_Land_TC_50", "To verify user gets an appropriate error on entering Symbols and special characters in  Receiver Mobile number field in Send Money to Gcash page");
        }else {
            ExtentReporter.logFail("GC_Land_TC_50", "Failed To verify user gets an appropriate error on entering Symbols and special characters in  Receiver Mobile number field in Send Money to Gcash page");
            System.out.println("-----------------------------------------------------------");
        }
    }
    //Negative
    //GC_RM_TC_54
    public void GC_SM_TC_54_MoreThanTwoDecimal_ErrorMsg_Validation() throws Exception {
        ExtentReporter.logInfo("GC_SM_TC_54","To Validate Error Message When Amount is More than 2 Decimal Places ");
        login.loginWalletBranchTier();
        goToGcash();
        mobileGeneralMethod.tap(gCashObjects.objGcashSendMoneyText(), "Send Money Option");
        if(mobileGeneralMethod.isVisible(gCashObjects.objGcashMobileNumber(),"Gcash Mobile Number TxtBox")) {
            mobileGeneralMethod.type(gCashObjects.objGcashMobileNumber(), "Receiver Number Field", propertyReader.getproperty("3DecimalPlaces"));
            mobileGeneralMethod.tap(gCashObjects.objNextBtn(), "Next Button");
            mobileGeneralMethod.assertionValidation(mobileGeneralMethod.getText(gCashObjects.objGetErrMsg(propertyReader.getproperty("InvalidMobileNum"))), propertyReader.getproperty("InvalidMobileNum"));
            LoggingUtils.info("Error Message More than two decimal places Validated");
            ExtentReporter.logPass("GC_RM_TC_54", "To Validate Error Message When Amount is More than 2 Decimal Places");
        }else {
            ExtentReporter.logFail("GC_RM_TC_54", "Failed To Validate Error Message When Amount is More than 2 Decimal Places");
            System.out.println("-----------------------------------------------------------");
        }
    }
    //Negative
    public void GC_SM_TC_57_SendMoneytoGcash_LessThan_One_Validation() throws Exception {
        ExtentReporter.logInfo("GC_SM_TC_57","To Send Money to Gcash Less Than One Validation");
        login.loginWalletBranchTier();
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.tap(gCashObjects.objGcashText(), "Gcash Icon Button");
        mobileGeneralMethod.tap(gCashObjects.objGcashSendMoneyText(), "Send Money Option");
        if(mobileGeneralMethod.isVisible(gCashObjects.objGcashMobileNumber(),"Gcash Mobile Number TxtBox")) {
            mobileGeneralMethod.type(gCashObjects.objGcashMobileNumber(), "Number Field", propertyReader.getproperty("GcashMobileNo"));
            mobileGeneralMethod.tap(gCashObjects.objNextBtn(), "Next Button");
            mobileGeneralMethod.waitSleep(1000);
            mobileGeneralMethod.type(gCashObjects.objAmountTextBox(), "InvalidLessAmount", propertyReader.getproperty("InvalidLessAmount"));
            mobileGeneralMethod.tap(gCashObjects.objNextBtn(), "Next Button");
            mobileGeneralMethod.assertionValidation(mobileGeneralMethod.getText(gCashObjects.objGetErrMsg(propertyReader.getproperty("InvalidLessAmount"))), propertyReader.getproperty("InvalidLessAmount"));
            mobileGeneralMethod.waitSleep(1000);
            LoggingUtils.info("GC_RM_TC_57, To Send Money to Gcash Less Than One Validation, Validated");
            ExtentReporter.logPass("GC_RM_TC_57", "To Send Money to Gcash Less Than One Validation, Validated");
        }else {
            ExtentReporter.logFail("GC_RM_TC_57", "Failed To Validate Send Money to Gcash Less Than One");
            System.out.println("-----------------------------------------------------------");
        }
    }
    //----------------------------------------------------------------------------------------------------------------------------------------------------
    public void cancelPreviousTransactionToConfirmationPage() throws Exception {
        mobileGeneralMethod.waitSleep(3000);
        try {
            if (mobileGeneralMethod.isDisplayed(gCashObjects.objProceedBtn())) {
                mobileGeneralMethod.tap(gCashObjects.objProceedBtn(),"Click Proceed");
                mobileGeneralMethod.isVisible(gCashObjects.objConfirmDetailsPage(), "Confirm Details Page");
            }
        }
        catch (NoSuchElementException e){
            mobileGeneralMethod.isVisible(gCashObjects.objConfirmDetailsPage(), "Confirm Details Page");
        }
    }
    public void confirmGcashAmountTransaction() throws Exception {
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.tap(gCashObjects.objGcashText(), "Gcash Icon Button");
        mobileGeneralMethod.tap(gCashObjects.objGcashSendMoneyText(), "Send Money Button");
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.type(gCashObjects.objGcashMobileNumber(), "Valid Number", propertyReader.getproperty("GcashMobileNo"));
        mobileGeneralMethod.tap(gCashObjects.objNextBtn(), "GCash Next Button");
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.type(gCashObjects.objAmountTextBox(), "Valid Amount", propertyReader.getproperty("ValidAmount"));
        mobileGeneralMethod.tap(gCashObjects.objNextBtn(), "Next Amount");
        cancelPreviousTransactionToConfirmationPage();
        mobileGeneralMethod.waitSleep(1000);
    }
    //Positive
    public void GC_SM_TC_58_Validate_user_able_see_NextBtn_Send_money_Gcash_page() throws Exception {
        ExtentReporter.logInfo("GC_SM_TC_58","To validate user is able to see Next button Send money to Gcash page");
        login.loginWalletBranchTier();
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.tap(gCashObjects.objGcashText(), "Gcash Icon Button");
        mobileGeneralMethod.tap(gCashObjects.objGcashSendMoneyText(), "Send Money Button");
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.type(gCashObjects.objGcashMobileNumber(), "Valid Number", propertyReader.getproperty("GcashMobileNo"));
        mobileGeneralMethod.tap(gCashObjects.objNextBtn(), "GCash Next Button");
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.type(gCashObjects.objAmountTextBox(), "Valid Amount", propertyReader.getproperty("ValidAmount"));
        if (mobileGeneralMethod.isVisible(gCashObjects.objNextBtn(), "Next Amount")) {
            LoggingUtils.info("GC_RM_TC_58, To validate user is able to see Next button Send money to Gcash page, Validated");
            ExtentReporter.logPass("GC_RM_TC_58", "To validate user is able to see Next button Send money to Gcash page, Validated");
        } else {
            ExtentReporter.logFail("GC_RM_TC_58", "Failed To validate user is able to see Next button Send money to Gcash page");
            System.out.println("-----------------------------------------------------------");
        }
    }
    //Negative
    //GC_RM_TC_59
    public void GC_SM_TC_59_RedirectBack_SendMoneytoGcash_From_ConfirmDetails_Validation() throws Exception {
        ExtentReporter.logInfo("GC_SM_TC_59","To Validate Redirection to Send Money to Gcash Page from Confirm Details Page using Back Button");
        login.loginWalletBranchTier();
        confirmGcashAmountTransaction();
        mobileGeneralMethod.tap(gCashObjects.objGcashPage_BackBtn(), "Back Button");
        if (mobileGeneralMethod.isVisible(gCashObjects.objGcashMobileNumText(), mobileGeneralMethod.getText(gCashObjects.objGcashMobileNumText()))) {
            mobileGeneralMethod.isVisible(gCashObjects.objReceiverNumber(), mobileGeneralMethod.getText(gCashObjects.objReceiverNumber()));
            LoggingUtils.info("Redirect to Send Money to Gcash Page from Confirm Details Page using Back Button, Validated");
            ExtentReporter.logPass("GC_RM_TC_59", "To Validate Redirection to Send Money to Gcash Page from Confirm Details Page using Back Button");
        }
        else {
            ExtentReporter.logFail("GC_RM_TC_59", "Failed To validate Redirection to Send Money to Gcash Page from Confirm Details Page using Back Button");
            System.out.println("-----------------------------------------------------------");
        }
    }
    //Positive
    //GC_RM_TC_60
    public void GC_SM_TC_60_InAppOtp_Page_Redirection_Validation() throws Exception {
        ExtentReporter.logInfo("GC_SM_TC_60","To Validate InAppOtp Page Redirection");
        login.loginWalletBranchTier();
        confirmGcashAmountTransaction();
        mobileGeneralMethod.tap(gCashObjects.objConfirmBtn(), "Confirm Button");
        if (mobileGeneralMethod.isVisible(loginObject.objOneTimePin(), "One Time Pin")
                || mobileGeneralMethod.isVisible(loginObject.objContinueBtn(), "Continue")
                || mobileGeneralMethod.isVisible(loginObject.objCancelBtn(), "MLPin")
        ) {
            LoggingUtils.info("OTP Page is Displayed");
            ExtentReporter.logPass("GC_RM_TC_60", "To Validate InAppOtp Page Redirection");
        }else {
            ExtentReporter.logFail("GC_RM_TC_60", "Failed To Validate InAppOtp Page Redirection");
            System.out.println("-----------------------------------------------------------");
        }
    }
    //Negative
    //GC_RM_TC_64
    public void GC_SM_TC_64_CancelOTP_Redirect_SendMoney_to_Gcash_Mobile_Entry() throws Exception {
        ExtentReporter.logInfo("GC_SM_TC_64","To Cancel OTP Redirect SendMoney to Gcash Mobile Entry");
        login.loginWalletBranchTier();
        confirmGcashAmountTransaction();
        if (mobileGeneralMethod.isVisible(gCashObjects.objConfirmDetailsPage(), "Confirm Details Page")) {
            mobileGeneralMethod.tap(gCashObjects.objConfirmBtn(), "Confirm Button");
            mobileGeneralMethod.tap(loginObject.objCancelBtn(), "OTP Cancel Button");
            LoggingUtils.info("Successfully Cancel InappOTP");
            ExtentReporter.logPass("GC_SM_TC_64", "To Validate Cancel OTP Redirect SendMoney to Gcash Mobile Entry");
        }else {
            ExtentReporter.logFail("GC_SM_TC_64", "Failed To Validate Cancel OTP Redirect SendMoney to Gcash Mobile Entry");
            System.out.println("-----------------------------------------------------------");
        }
    }
    //Positive
    //GC_RM_TC_72
    public void GC_SM_TC_72_ValidateSMSOTP_InApp_GCash_Send_Money() throws Exception {
        ExtentReporter.logInfo("GC_SM_TC_72","To Validate to SMS OTP screen Mpin GCash Send Money");
        login.loginWalletBranchTier();
        confirmGcashAmountTransaction();
        mobileGeneralMethod.isVisible(gCashObjects.objConfirmDetailsPage(), "Confirm Details Page");
        mobileGeneralMethod.tap(gCashObjects.objConfirmBtn(), "Confirm Button");
        if (mobileGeneralMethod.isVisible(loginObject.objOneTimePin(), mobileGeneralMethod.getText(loginObject.objOneTimePin()))) {
            mobileGeneralMethod.isVisible(loginObject.objOTP(), mobileGeneralMethod.getText(loginObject.objOTP()));
            mobileGeneralMethod.isVisible(loginObject.objCancelBtn(), "Obeserve Cancel Button");
            mobileGeneralMethod.isVisible(loginObject.objContinueBtn(), "Obeserve Continue Button");
            LoggingUtils.info("GC_SM_TC_72, GCash In App OTP Navigation validated");
            ExtentReporter.logPass("GC_SM_TC_70", "To Validate to SMS OTP Mpin GCash Send Money");
            System.out.println("-----------------------------------------------------------");
        }else {
            ExtentReporter.logFail("GC_SM_TC_70", "Failed To Validate SMS OTP Mpin GCash Send Money");
            System.out.println("-----------------------------------------------------------");
        }
    }
    //Positive
    //GC_RM_TC_73
    public void GC_SM_TC_73_Validate_Back_Btn_In_GCash_Transaction_Details_Page() throws Exception {
        ExtentReporter.logInfo("GC_SM_TC_73","To Validate Back Button In GCash Transaction Details Page");
        login.loginWalletBranchTier();
        confirmGcashTransaction();
        mobileGeneralMethod.isVisible(gCashObjects.objTransactionDetailsText(), "Transaction Detail");
        mobileGeneralMethod.isVisible(gCashObjects.objSendtoGCash_Transaction(), "Send Money GCash");
        mobileGeneralMethod.verticalSwipe();
        if (mobileGeneralMethod.isVisible(gCashObjects.objReceiverNumber_Transaction(),"Receiver GCash No.")) {
            mobileGeneralMethod.isVisible(gCashObjects.objSenderName_Transaction(),"Sender Name");
            mobileGeneralMethod.isVisible(gCashObjects.objSenderNumber_Transaction(),"Sender No.");
            mobileGeneralMethod.isVisible(gCashObjects.objGcashAmount(),"Amount");
            mobileGeneralMethod.isVisible(gCashObjects.objGcashServiceFee(),"Service Fee");
            mobileGeneralMethod.isVisible(gCashObjects.objGcashTotal(),"Total");
            mobileGeneralMethod.isVisible(gCashObjects.objBack_to_Home_Page(), "Back Home Button");
            mobileGeneralMethod.isVisible(gCashObjects.objNew_Transaction(), "New Transaction Button");
            LoggingUtils.info("GC_SM_TC_73, Back Button In GCash Transaction Details Page Validated");
            ExtentReporter.logPass("GC_SM_TC_73", "To Validate Back Button In GCash Transaction Details Page");
            System.out.println("-----------------------------------------------------------");
        }else {
            ExtentReporter.logFail("GC_SM_TC_73", "Failed To Validate Back Button In GCash Transaction Details Page");
            System.out.println("-----------------------------------------------------------");
        }
    }
    //Positive
    public void GC_SM_TC_83_Validate_Transaction_Details_Match_User_Entered_Details() throws Exception {
        ExtentReporter.logInfo("GC_SM_TC_83","To Validate transaction details are matching with user entered details");
        login.loginWalletBranchTier();
        confirmGcashAmountTransaction();
        if (mobileGeneralMethod.isVisible(gCashObjects.objConfirmDetailsPage(), "Confirm Details Page")) {
            mobileGeneralMethod.waitSleep(1000);
            mobileGeneralMethod.isVisible(gCashObjects.objSendtoGCash_Confirm(), "Send Money to GCash");
            mobileGeneralMethod.isVisible(gCashObjects.objReceiverNumber_Confirm(),"Receiver Number");
            mobileGeneralMethod.isVisible(gCashObjects.objSenderName_Confirm(),"Sender Name");
            mobileGeneralMethod.isVisible(gCashObjects.objSenderNumber_Confirm(),"Sender Number");
            mobileGeneralMethod.isVisible(gCashObjects.objAmount_Confirm(),"Gcash Amount");
            mobileGeneralMethod.isVisible(gCashObjects.objServiceFee_Confirm(),"Gcash Service Fee");
            mobileGeneralMethod.isVisible(gCashObjects.objTotal_Confirm(),"Total Amount");
            LoggingUtils.info("GC_SM_TC_83, Validate transaction details are matching with user entered details");
            ExtentReporter.logPass("GC_SM_TC_83", "To Validate transaction details are matching with user entered details");
            System.out.println("-----------------------------------------------------------");
        }else {
            ExtentReporter.logFail("GC_SM_TC_83", "Failed To Validate transaction details are not matching with user entered details");
            System.out.println("-----------------------------------------------------------");
        }

    }
    //Positive
    //GC_RM_TC_102
    public void GC_SM_TC_102_Validate_SendMoneyGCash_BuyerTier() throws Exception {
        ExtentReporter.logInfo("GC_SM_TC_102_","To validate if user gets popup message when sending money to Gcash when logged in with buyer tier");
        login.loginWalletBuyerTier();
        confirmGcashAmountTransaction();
        mobileGeneralMethod.isVisible(gCashObjects.objConfirmDetailsPage(), "Confirm Details Page");
        mobileGeneralMethod.tap(gCashObjects.objConfirmBtn(), "Confirm Button");
        mobileGeneralMethod.assertionValidation(mobileGeneralMethod.getText(gCashObjects.objGetErrMsg(propertyReader.getproperty("InvalidTierBuyerVer"))), propertyReader.getproperty("InvalidTierBuyerVer"));
        if(mobileGeneralMethod.isVisible(gCashObjects.objUpgradeNowLabel(), "Prompt Mobile No is Invalid")) {
            mobileGeneralMethod.tap(gCashObjects.objUpgradeBtn(), "Upgrade Now Visible");
            mobileGeneralMethod.waitSleep(1000);
            mobileGeneralMethod.isVisible(gCashObjects.objVerificationTierPerksLabel(), "Tier Upgrade Page");
            LoggingUtils.info("Prompt Invalid BuyerTier, Validated");
            LoggingUtils.info("GC_SM_TC_83, validate if user gets popup message when sending money to Gcash when logged in with buyer tier");
            ExtentReporter.logPass("GC_SM_TC_83", "To validate if user gets popup message when sending money to Gcash when logged in with buyer tier");
            System.out.println("-----------------------------------------------------------");
        }else {
            ExtentReporter.logFail("GC_SM_TC_83", "Failed To Validate user gets popup message when sending money to Gcash when logged in with buyer tier");
            System.out.println("-----------------------------------------------------------");
        }
    }

    public void confirmGcash50kTransaction() throws Exception {
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.tap(gCashObjects.objGcashText(), "Gcash Icon Button");
        mobileGeneralMethod.tap(gCashObjects.objGcashSendMoneyText(), "Send Money To Gcash");
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.type(gCashObjects.objGcashMobileNumber(), "Number Field", propertyReader.getproperty("GcashMobileNo"));
        mobileGeneralMethod.tap(gCashObjects.objNextBtn(), "Next Button");
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.type(gCashObjects.objAmountTextBox(), "Invalid50kAmount", propertyReader.getproperty("Invalid50kAmount"));
        mobileGeneralMethod.tap(gCashObjects.objNextBtn(), "Next Button");
        cancelPreviousTransactionToConfirmationPage();
        mobileGeneralMethod.tap(gCashObjects.objConfirmBtn(), "Confirm Button");
    }
    //Negative
    //GC_RM_TC_103
    public void GC_SM_TC_103_Validate_SendMoneyGCash50k_SemiVerified() throws Exception {
        ExtentReporter.logInfo("GC_SM_TC_103","To validate Sending Money to Gcash in a Single Transaction Amount Exceeding Maximum Limit as a Semi-Verified Tier");
        login.loginWalletSemiTier();
        confirmGcash50kTransaction();
        if(mobileGeneralMethod.isVisible(gCashObjects.objUpgrade50kNowLabel(), "Prompt Mobile No is Invalid")) {
            LoggingUtils.info("Prompt Invalid 50k SemiTier, Validated");
            LoggingUtils.info("GC_SM_TC_103, Validate Sending Money to Gcash in a Single Transaction Amount Exceeding Maximum Limit as a Semi-Verified Tier");
            ExtentReporter.logPass("GC_SM_TC_103", "To validate Sending Money to Gcash in a Single Transaction Amount Exceeding Maximum Limit as a Semi-Verified Tier");
            System.out.println("-----------------------------------------------------------");
        } else {
            ExtentReporter.logFail("GC_SM_TC_103", "Failed To Validate Sending Money to Gcash in a Single Transaction Amount Exceeding Maximum Limit as a Semi-Verified Tier");
            System.out.println("-----------------------------------------------------------");
        }
    }
    //Negative
    //GC_RM_TC_104
    public void GC_SM_TC_104_Validate_SendMoneyGCash50k_BranchVerified() throws Exception {
        ExtentReporter.logInfo("GC_SM_TC_104","To validate Sending Money to Gcash in a Single Transaction Amount Exceeding Maximum Limit as a Branch-Verified Tier");
        login.loginWalletBranchTier();
        confirmGcash50kTransaction();
        if(mobileGeneralMethod.isVisible(gCashObjects.objUpgrade50kNowLabel(), "Prompt Mobile No is Invalid")) {
        LoggingUtils.info("Prompt Invalid 50k BranchTier, Validated");
        LoggingUtils.info("GC_SM_TC_104, Validate Sending Money to Gcash in a Single Transaction Amount Exceeding Maximum Limit as a Branch-Verified Tier");
        ExtentReporter.logPass("GC_SM_TC_104", "To validate Sending Money to Gcash in a Single Transaction Amount Exceeding Maximum Limit as a Branch-Verified Tier");
        System.out.println("-----------------------------------------------------------");
        } else {
            ExtentReporter.logFail("GC_SM_TC_104", "Failed To Validate Sending Money to Gcash in a Single Transaction Amount Exceeding Maximum Limit as a Branch-Verified Tier");
            System.out.println("-----------------------------------------------------------");
        }
    }
    //Negative
    //GC_RM_TC_105
    public void GC_SM_TC_105_Validate_SendMoneyGCash50k_FullyVerified() throws Exception {
        ExtentReporter.logInfo("GC_SM_TC_105","To validate Sending Money to Gcash in a Single Transaction Amount Exceeding Maximum Limit as a Fully-Verified Tier");
        login.loginWalletFullyTier();
        confirmGcash50kTransaction();
        if(mobileGeneralMethod.isVisible(gCashObjects.objUpgrade50kNowLabel(), "Prompt Mobile No is Invalid")) {
            LoggingUtils.info("Prompt Invalid 50k FullyTier, Validated");
            LoggingUtils.info("GC_SM_TC_105, Validate Sending Money to Gcash in a Single Transaction Amount Exceeding Maximum Limit as a Branch-Verified Tier");
            ExtentReporter.logPass("GC_SM_TC_105", "To validate Sending Money to Gcash in a Single Transaction Amount Exceeding Maximum Limit as a Fully-Verified Tier");
            System.out.println("-----------------------------------------------------------");
        } else {
            ExtentReporter.logFail("GC_SM_TC_105", "Failed To Validate Sending Money to Gcash in a Single Transaction Amount Exceeding Maximum Limit as a Fully-Verified Tier");
            System.out.println("-----------------------------------------------------------");
        }
    }
    public void sendMoneyToGcash() throws Exception {
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.tap(gCashObjects.objGcashText(), "Gcash Icon Button");
        mobileGeneralMethod.tap(gCashObjects.objGcashSendMoneyText(), "Send Money To Gcash");
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.type(gCashObjects.objGcashMobileNumber(), "Number Field", propertyReader.getproperty("GcashMobileNo"));
        mobileGeneralMethod.tap(gCashObjects.objNextBtn(), "Next Button");
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.type(gCashObjects.objAmountTextBox(), "Valid Amount", propertyReader.getproperty("ValidAmount"));
        mobileGeneralMethod.tap(gCashObjects.objNextBtn(), "Next Button");
        cancelPreviousTransactionToConfirmationPage();
        mobileGeneralMethod.tap(gCashObjects.objConfirmBtn(), "Confirm Button");
        mobileGeneralMethod.waitSleep(8000);
        mobileGeneralMethod.tap(loginObject.objContinueBtn(), "Continue Button");
        mobileGeneralMethod.waitSleep(25000);
        mobileGeneralMethod.tap(gCashObjects.objBack_to_Home_Page(), "Back to Home Page Button");
        LoggingUtils.info("Send Money To Gcash, Success");
    }
    //Positive
    //GC_RM_TC_132 To Validate Successful Send Money to Gcash per Transaction while in Semi Verified Tier
    public void GC_SM_TC_132_SendMoney_as_SemiVerified() throws Exception {
        ExtentReporter.logInfo("GC_SM_TC_132","To Validate Successful Send Money to Gcash per Transaction while in Semi Verified Tier ");
        mobileGeneralMethod.waitSleep(1000);
        login.loginWalletSemiTier();
        sendMoneyToGcash();
        LoggingUtils.info("Send Money to Gcash as Semi Verified Validated");
        ExtentReporter.logPass("GC_RM_TC_132", "To Validate Successful Send Money to Gcash per Transaction while in Semi Verified Tier");
    }
    //Positive
    //GC_RM_TC_135 To Validate Successful Send Money to Gcash per Transaction while in Branch Verified Tier
    public void GC_RM_TC_135_SendMoney_as_BranchVerified() throws Exception {
        ExtentReporter.logInfo("GC_RM_TC_135","To Validate Successful Send Money to Gcash per Transaction while in Branch Verified Tier ");
        login.loginWalletBranchTier();
        sendMoneyToGcash();
        LoggingUtils.info("Send Money to Gcash as Branch Verified Validated");
        ExtentReporter.logPass("GC_RM_TC_135", "To Validate Successful Send Money to Gcash as Branch Verified Tier ");
    }
    public void confirmNoGcashgotoKwartaPadalaTransaction() throws Exception {
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.tap(gCashObjects.objGcashText(), "Gcash Icon Button");
        mobileGeneralMethod.tap(gCashObjects.objGcashSendMoneyText(), "Send Money To Gcash");
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.type(gCashObjects.objGcashMobileNumber(), "Number Field", propertyReader.getproperty("NoGcashKwartaPadalaNo"));
        mobileGeneralMethod.tap(gCashObjects.objNextBtn(), "Next Button");
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.type(gCashObjects.objAmountTextBox(), "Valid Amount", propertyReader.getproperty("ValidAmount"));
        mobileGeneralMethod.tap(gCashObjects.objNextBtn(), "Next Button");
        cancelPreviousTransactionToConfirmationPage();
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.tap(gCashObjects.objConfirmBtn(), "Confirm Button");
        mobileGeneralMethod.waitSleep(8000);
        mobileGeneralMethod.tap(loginObject.objContinueBtn(), "Continue Button");
        mobileGeneralMethod.waitSleep(25000);
    }

    public void confirmNoGcashggotoMLWalletTransaction() throws Exception {
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.tap(gCashObjects.objGcashText(), "Gcash Icon Button");
        mobileGeneralMethod.tap(gCashObjects.objGcashSendMoneyText(), "Send Money To Gcash");
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.type(gCashObjects.objGcashMobileNumber(), "Number Field", propertyReader.getproperty("NoGcashMlwalletNo"));
        mobileGeneralMethod.tap(gCashObjects.objNextBtn(), "Next Button");
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.type(gCashObjects.objAmountTextBox(), "Valid Amount", propertyReader.getproperty("ValidAmount"));
        mobileGeneralMethod.tap(gCashObjects.objNextBtn(), "Next Button");
        cancelPreviousTransactionToConfirmationPage();
        mobileGeneralMethod.tap(gCashObjects.objConfirmBtn(), "Confirm Button");
        mobileGeneralMethod.waitSleep(8000);
        mobileGeneralMethod.tap(loginObject.objContinueBtn(), "Continue Button");
        mobileGeneralMethod.waitSleep(25000);
    }
    public void sendViaMLWalletDisplayed() throws Exception {
        mobileGeneralMethod.waitSleep(3000);
        try {
            if(mobileGeneralMethod.isDisplayed(gCashObjects.objSendViaMLWalletBtn())){
                mobileGeneralMethod.tap(gCashObjects.objSendViaMLWalletBtn(), "Send Via Kwarta Padala Button");
                mobileGeneralMethod.isVisible(gCashObjects.objSendMoneyTab(),"Kwarta Padala Label");
            }
        }
        catch (NoSuchElementException e){
            mobileGeneralMethod.isVisible(gCashObjects. objTransactionDetailsText(), "Transaction Details");
        }
    }
    //Negative
    public void GC_RM_TC_180_SendMoney_NoGCash_thru_MLWallet()throws Exception{
        ExtentReporter.logInfo("GC_RM_TC_180","To Validate SendMoney NoGCash thru MLWallet");
        login.loginWalletBranchTier();
        confirmNoGcashggotoMLWalletTransaction();
        if(mobileGeneralMethod.isVisible(gCashObjects.objNoGCashOtherOptionLabel(), "Prompt Mobile No is Invalid")){
            mobileGeneralMethod.isVisible(gCashObjects.objSendViaMLWalletlabel(), "Send Via ML Wallet");
            mobileGeneralMethod.isVisible(gCashObjects.objSendViaMLWalletBtn(), "Send Via ML Wallet Button");
            mobileGeneralMethod.isVisible(gCashObjects.objCloseBtn(), "Close Button");
            sendViaMLWalletDisplayed();
            LoggingUtils.info("GC_RM_TC_180, To Validate SendMoney NoGCash thru MLWallet");
            ExtentReporter.logPass("GC_RM_TC_180", "To Validate SendMoney NoGCash thru MLWallet");
            System.out.println("-----------------------------------------------------------");
        }
        else {
            ExtentReporter.logFail("GC_SM_TC_105", "Failed To Validate To Validate SendMoney NoGCash thru MLWallet");
            System.out.println("-----------------------------------------------------------");
        }
    }
    public void sendViaKwartaPadalaDisplayed() throws Exception {
        mobileGeneralMethod.waitSleep(3000);
        try {
            if(mobileGeneralMethod.isDisplayed(gCashObjects.objSendViaMLKwartaPadalaBtn())){
                mobileGeneralMethod.tap(gCashObjects.objSendViaMLKwartaPadalaBtn(), "Send Via Kwarta Padala Button");
                mobileGeneralMethod.isVisible(gCashObjects.objKwartaPadala(),"Kwarta Padala Label");
            }
        }
        catch (NoSuchElementException e){
            mobileGeneralMethod.isVisible(gCashObjects. objTransactionDetailsText(), "Transaction Details");
        }
    }
    //Negative
    public void GC_RM_TC_181_SendMoney_NoGCash_thru_KwartaPadala()throws Exception{
        ExtentReporter.logInfo("GC_RM_TC_181","To Validate SendMoney NoGCash thru KwartaPadala");
        login.loginWalletBranchTier();
        confirmNoGcashgotoKwartaPadalaTransaction();
        if(mobileGeneralMethod.isVisible(gCashObjects.objNoGCashOtherOptionLabel(), "Prompt Mobile No is Invalid")){
            mobileGeneralMethod.isVisible(gCashObjects.objSendViaMLKwartaWallelabel(), "Send Via Kwarta Padala");
            mobileGeneralMethod.isVisible(gCashObjects.objSendViaMLKwartaPadalaBtn(), "Send Via Kwarta Padala Button");
            mobileGeneralMethod.isVisible(gCashObjects.objCloseBtn(), "Close Button");
            sendViaKwartaPadalaDisplayed();
            LoggingUtils.info("GC_RM_TC_181, To Validate SendMoney NoGCash thru KwartaPadala");
            ExtentReporter.logPass("GC_RM_TC_181", "To Validate SendMoney NoGCash thru KwartaPadala");
            System.out.println("-----------------------------------------------------------");
        }else {
            ExtentReporter.logFail("GC_RM_TC_181", "Failed To Validate SendMoney NoGCash thru KwartaPadala");
            System.out.println("-----------------------------------------------------------");
        }
    }
    public void GC_RM_TC_182_Contacts()throws Exception{
        ExtentReporter.logInfo("GC_RM_TC_182","To Validate Contact Page Redirection");
        login.loginWalletBranchTier();
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.tap(gCashObjects.objGcashText(), "Gcash Icon Button");
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.tap(gCashObjects.objGcashSendMoneyText(), "Send Money To Gcash");
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.isVisible(gCashObjects.objSelectContactText(), "Contact Buttons");
        mobileGeneralMethod.tap(gCashObjects.objSelectContactText(), "Contact Buttons");
       if(mobileGeneralMethod.isVisible(gCashObjects.objContactPageHeader(),"Contacts")){
           mobileGeneralMethod.waitSleep(5000);
           mobileGeneralMethod.isVisible(gCashObjects.objFavoritesBtn(), "Favorites Buttons");
           mobileGeneralMethod.isVisible(gCashObjects.objSearchBox(), "Select Box");
           mobileGeneralMethod.isVisible(gCashObjects.objContactButton(), "Select Contacts");
           LoggingUtils.info("GC_RM_TC_182, To Validate Contact Page Redirection");
           ExtentReporter.logPass("GC_RM_TC_182", "To Validate Contact Page Redirection");
        }
        else {
            ExtentReporter.logFail("GC_RM_TC_182", "Failed To Validate Contact Page Redirection");
            System.out.println("-----------------------------------------------------------");
        }
    }
}
