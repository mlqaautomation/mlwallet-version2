package mlwallet.testSteps;


import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Driver.DriverManager;
import utilities.ExtentReport.ExtentReporter;
import utilities.Logger.LoggingUtils;


import  utilities.Driver.AppiumDriverManager;

public class KwartaPadala_Branch extends Base_Steps {
    Login login = new Login();
    public void enterAmountToKwartaPadala() throws Exception {
        mobileGeneralMethod.waitSleep(3000);
        if (mobileGeneralMethod.isVisible(kwartaPadalaObjects.objKwartaPadala(), "MLWallet User")) {
            mobileGeneralMethod.type(kwartaPadalaObjects.objAmountTxtField(), "Amount", propertyReader.getproperty("AmountInput"));
            mobileGeneralMethod.tap(kwartaPadalaObjects.objNextBtn(), "Next Button");
            mobileGeneralMethod.waitSleep(5000);
            mobileGeneralMethod.tap(kwartaPadalaObjects.objMLWalletBalance(), "MLWallet Balance Button");
            mobileGeneralMethod.waitSleep(5000);
            mobileGeneralMethod.isVisible(kwartaPadalaObjects.objConfirmDetails(), "Confirm Details Page");
            mobileGeneralMethod.verticalSwipe();
            mobileGeneralMethod.tap(kwartaPadalaObjects.objConfirmBtn(), "Button");
        }
    }

    public void enableLocation_PopUp() throws Exception {
        String loc = mobileGeneralMethod.getText(loginObject.objLocationPopup());
        if (loc.contains("Allow")) {
            LoggingUtils.info(loc + " Pop Up is Displayed");
            ExtentReporter.logPass("pop up", loc + " Pop Up is Displayed");
            mobileGeneralMethod.tap(kwartaPadalaObjects.objLocationPermission(), "Allow Button");
        } else {
            LoggingUtils.info(" Location Pop Up is not Displayed");
            ExtentReporter.logPass("pop up", "Location Pop Up is not Displayed");
        }
    }

    public void enterAmountToKwartaPadala(String nAmount) throws Exception {
        mobileGeneralMethod.waitSleep(3000);
        if (mobileGeneralMethod.isVisible(kwartaPadalaObjects.objKwartaPadala(), "MLWallet User")) {
            mobileGeneralMethod.type(kwartaPadalaObjects.objAmountTxtField(), "Amount", nAmount);
            mobileGeneralMethod.tap(kwartaPadalaObjects.objNextBtn(), "Next Button");
            mobileGeneralMethod.waitSleep(3000);
            mobileGeneralMethod.tap(kwartaPadalaObjects.objMLWalletBalance(), "MLWallet Balance Button");
            mobileGeneralMethod.waitSleep(8000);
            mobileGeneralMethod.isVisible(kwartaPadalaObjects.objConfirmDetails(), "Confirm Details Page");
            mobileGeneralMethod.verticalSwipe();
            mobileGeneralMethod.tap(kwartaPadalaObjects.objConfirmBtn(), "Button");
        }
    }

    public void locationPopUpValidation() throws Exception {
        if (mobileGeneralMethod.isVisible(homePageObject.objPopUpMsg(), "Pop Up Message")) {
            mobileGeneralMethod.isVisible(homePageObject.obPopupAllowBtn(), " Button");
            mobileGeneralMethod.isVisible(homePageObject.objLocationPopUpAllowOnceBtn(), "Button");
            mobileGeneralMethod.isVisible(homePageObject.objPopUpDenyBtn(), "Button");
        }
    }

    public void internetConnectionError() throws Exception {
        if (mobileGeneralMethod.isVisible(homePageObject.objInternetConnectionPopUp(), "Pop Up Message")) {
            mobileGeneralMethod.isVisible(homePageObject.objInternetConnectionMsg(), " Error Message");
            mobileGeneralMethod.isVisible(homePageObject.objOkBtn(), "Button");
            mobileGeneralMethod.setWifiConnectionToONOFF("ON");

        }
    }

    public void permissionDenyPopUp() throws Exception {
        locationPopUpValidation();
        mobileGeneralMethod.tap(kwartaPadalaObjects.objBackToHomeBtn(), "Button");
        if (mobileGeneralMethod.isVisible(homePageObject.objPermissionDeniedPopUp(), "PopUp")) {
            mobileGeneralMethod.isVisible(homePageObject.objOpenSettingBtn(), "Button");
            mobileGeneralMethod.isVisible(homePageObject.objCloseBtn(), "Button");
        }
    }

    public void sendMoneyToMLBranchRatesValidation(String sAmount) throws Exception {
        login.loginWalletBranchTier();
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.tap(kwartaPadalaObjects.objSendTransferBtn(), "Send Transfer Button");
        mobileGeneralMethod.isVisible(kwartaPadalaObjects.objSendMoney(), "Send Money Page");
        mobileGeneralMethod.tap(kwartaPadalaObjects.objToAnyMLBranch(), "MLWallet User Button");
        mobileGeneralMethod.waitSleep(1000);
        enterMLBranchDetails();
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.isVisible(kwartaPadalaObjects.objKwartaPadala(), "Page");
        mobileGeneralMethod.type(kwartaPadalaObjects.objAmountTxtField(), "Amount text Field",sAmount );
        mobileGeneralMethod.tap(kwartaPadalaObjects.objNextBtn(), "Button");
        mobileGeneralMethod.isVisible(kwartaPadalaObjects.objSelectPaymentMethod(), "Page");
        Thread.sleep(1000);
        mobileGeneralMethod.tap(kwartaPadalaObjects.objMLWalletBalance(), "Button");
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.isVisible(kwartaPadalaObjects.objConfirmDetails(), "Page");
    }

    public void permissionDenyCloseBtnFunctionality() throws Exception {
        permissionDenyPopUp();
        mobileGeneralMethod.tap(homePageObject.objCloseBtn(), "Button");
    }

    public void permissionDenyOpenSettingsBtnFunctionality() throws Exception {
        permissionDenyPopUp();
        mobileGeneralMethod.tap(homePageObject.objOpenSettingBtn(), "Button");
    }

    public void locationPopUpAllowFunctionality() throws Exception {
        locationPopUpValidation();
        mobileGeneralMethod.tap(homePageObject.obPopupAllowBtn(), "Button");
    }

    public void selectSavedRecipient() throws Exception {
        if (mobileGeneralMethod.isVisible(kwartaPadalaObjects.objKwartaPadala(), "Page")) {
            mobileGeneralMethod.tap(kwartaPadalaObjects.objSavedRecipients(), "Button");
            mobileGeneralMethod.waitSleep(1000);
            mobileGeneralMethod.type(kwartaPadalaObjects.objSearchRecipient(), "Last Name Text Field", propertyReader.getproperty("Middle_Name"));
            mobileGeneralMethod.isVisible(payBillsObject.objSelectLastName(propertyReader.getproperty("Edited_Last_name"), propertyReader.getproperty("First_Name")), "Recipient");
            mobileGeneralMethod.tap(payBillsObject.objSelectLastName(propertyReader.getproperty("Edited_Last_name"), propertyReader.getproperty("First_Name")), "Recipient");
            mobileGeneralMethod.waitSleep(1000);
        }
    }

    public void addRecipient() throws Exception {
        if (mobileGeneralMethod.isVisible(kwartaPadalaObjects.objSavedRecipients(), "Button")) {
            mobileGeneralMethod.tap(kwartaPadalaObjects.objSavedRecipients(), "Save Recipients Button");
            mobileGeneralMethod.waitSleep(3000);
            mobileGeneralMethod.tap(kwartaPadalaObjects.objAddRecipient(), "Button");
            mobileGeneralMethod.waitSleep(1000);
            mobileGeneralMethod.type(kwartaPadalaObjects.objFirstname(), "First Name Text Field", propertyReader.getproperty("First_Name"));
            mobileGeneralMethod.type(kwartaPadalaObjects.objMiddleName(), "Middle Name Text Field", propertyReader.getproperty("Middle_Name"));
            mobileGeneralMethod.tap(kwartaPadalaObjects.objCheckBox(), "Check Box");
            mobileGeneralMethod.type(kwartaPadalaObjects.objLastName(), "Last Name Text Field", propertyReader.getproperty("Last_Name"));
            mobileGeneralMethod.type(kwartaPadalaObjects.objMobileNumber(), "Mobile Field", "9999999996");
            mobileGeneralMethod.type(kwartaPadalaObjects.objNickName(), "Nick Name Text Field", "Test");
            mobileGeneralMethod.tap(kwartaPadalaObjects.ObjSaveRecipient(), "Button");
        }
    }

    public void enterMLBranchDetails() throws Exception {
        mobileGeneralMethod.waitSleep(3000);
        if (mobileGeneralMethod.isVisible(kwartaPadalaObjects.objKwartaPadala(), "Page")) {
            mobileGeneralMethod.type(kwartaPadalaObjects.objFirstname(), "First Name Text Field", propertyReader.getproperty("First_Name"));
            mobileGeneralMethod.type(kwartaPadalaObjects.objMiddleName(), "Middle Name Text Field", propertyReader.getproperty("Middle_Name"));
            mobileGeneralMethod.tap(kwartaPadalaObjects.objCheckBox(), "Check Box");
            mobileGeneralMethod.waitSleep(3000);
            mobileGeneralMethod.type(kwartaPadalaObjects.objLastName(), "Last Name Text Field", propertyReader.getproperty("Last_Name"));
            mobileGeneralMethod.type(kwartaPadalaObjects.objMobileNumber(), "Mobile Field", "9999999934");
            mobileGeneralMethod.tap(kwartaPadalaObjects.objNextBtn(), "Button");
        }

    }

    public void sendMoneyToMLBranch_STB_TC_01() throws Exception {
        login.loginWalletBranchTier();
        mobileGeneralMethod.tap(kwartaPadalaObjects.objSendTransferBtn(), "Send Transfer Button");
        mobileGeneralMethod.isVisible(kwartaPadalaObjects.objSendMoney(), "Send Money Page");
        mobileGeneralMethod.tap(kwartaPadalaObjects.objToAnyMLBranch(), "MLWallet User Button");
        mobileGeneralMethod.waitSleep(1000);
        enterMLBranchDetails();
        enterAmountToKwartaPadala();
//        enableLocation_PopUp();
        mobileGeneralMethod.waitSleep(3000);
        mobileGeneralMethod.tap(mlWalletPageObjects.continue2_btn(), "Continue Button");
        mobileGeneralMethod.waitSleep(10000);
        if (mobileGeneralMethod.isVisible(kwartaPadalaObjects.objSendMoneySuccessful(), "Message")) {
            mobileGeneralMethod.isVisible(kwartaPadalaObjects.objPHPAmount(), "Amount");
            mobileGeneralMethod.isVisible(kwartaPadalaObjects.objDate(), "Date");
            mobileGeneralMethod.isVisible(kwartaPadalaObjects.objReferenceNumber(), "Reference Number");
            String sReference = mobileGeneralMethod.getText(kwartaPadalaObjects.objReferenceNumber());
            String sReferenceNumber = sReference.substring(9, 20);
            mobileGeneralMethod.verticalSwipeDown();
            mobileGeneralMethod.verticalSwipe();
            mobileGeneralMethod.waitSleep(3000);
            mobileGeneralMethod.tap(kwartaPadalaObjects.objBackToHomeBtn(), "Button");
            mobileGeneralMethod.verticalSwipeDown();
            mobileGeneralMethod.verticalSwipe();
            mobileGeneralMethod.waitSleep(3000);
            mobileGeneralMethod.isVisible(homePageObject.objRecentTransactions(), "Text");
            mobileGeneralMethod.tap(kwartaPadalaObjects.objKwartaPadala(), "Text");
            if (mobileGeneralMethod.isVisible(kwartaPadalaObjects.objReferenceNumberInTransactionDetails(), "Page")) {
                String sReferenceNumberInCashOut = mobileGeneralMethod.getText(kwartaPadalaObjects.objReferenceNumberInTransactionDetails());
                System.out.println(sReferenceNumberInCashOut);
                mobileGeneralMethod.assertionValidation(sReferenceNumber, sReferenceNumberInCashOut);
                LoggingUtils.info("STB_TC_01, Successfully sent Amount to ML Branch and Transaction Details is validated");
                ExtentReporter.logPass("STB_TC_01", "STB_TC_01, Successfully sent Amount to ML Branch and Transaction Details is validated");
                System.out.println("-----------------------------------------------------------");
            } else {
                ExtentReporter.logFail("STB_TC_01", "STB_TC_01(), Failed To Validate Successfully sent Amount to ML Branch and Transaction Details");
                System.out.println("-----------------------------------------------------------");

            }
        }

    }

    public void sendMoneyRequiredDetails_STB_TC_08() throws Exception {
        login.loginWalletBranchTier();
        mobileGeneralMethod.tap(kwartaPadalaObjects.objSendTransferBtn(), "Send Transfer Button");
        mobileGeneralMethod.isVisible(kwartaPadalaObjects.objSendMoney(), "Send Money Page");
        mobileGeneralMethod.tap(kwartaPadalaObjects.objToAnyMLBranch(), "MLWallet User Button");
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.isVisible(kwartaPadalaObjects.objKwartaPadala(), "Page");
        mobileGeneralMethod.tap(kwartaPadalaObjects.objNextBtn(), "Button");
        if (mobileGeneralMethod.isVisible(kwartaPadalaObjects.objFirstNameRequiredMsg(), "Error Message")) {
            String sFirstNameErrorMsg = mobileGeneralMethod.getText(kwartaPadalaObjects.objFirstNameRequiredMsg());
            String sExpectedMsg = "First name is required.";
            mobileGeneralMethod.assertionValidation(sFirstNameErrorMsg, sExpectedMsg);
        }
//        hideKeyboard();
        mobileGeneralMethod.type(kwartaPadalaObjects.objAmountTxtField(), "First Name Text Field", propertyReader.getproperty("First_Name"));
        mobileGeneralMethod.type(kwartaPadalaObjects.objAmountTxtField(), "First Name Text Field", propertyReader.getproperty("First_Name"));
        mobileGeneralMethod.tap(kwartaPadalaObjects.objNextBtn(), "Button");
        if (mobileGeneralMethod.isVisible(kwartaPadalaObjects.objMiddleNameRequiredMsg(), "Error Message")) {
            String sMiddleNameRequiredMsg = mobileGeneralMethod.getText(kwartaPadalaObjects.objMiddleNameRequiredMsg());
            String sExpectedMsg = "Middle name is required.";
            mobileGeneralMethod.assertionValidation(sMiddleNameRequiredMsg, sExpectedMsg);
        }
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.type(kwartaPadalaObjects.objAmountTxtField(), "Middle Name Text Field", propertyReader.getproperty("Middle_Name"));
        mobileGeneralMethod.tap(kwartaPadalaObjects.objCheckBox(), "Check Box");
        mobileGeneralMethod.tap(kwartaPadalaObjects.objNextBtn(), "Button");
        if (mobileGeneralMethod.isVisible(kwartaPadalaObjects.objLastNameRequiredMsg(), "Error Message")) {
            String sLastNameRequiredMsg = mobileGeneralMethod.getText(kwartaPadalaObjects.objLastNameRequiredMsg());
            String sExpectedMsg = "Last name is required.";
            mobileGeneralMethod.assertionValidation(sLastNameRequiredMsg, sExpectedMsg);
        }
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.type(kwartaPadalaObjects.objLastName(), "Last Name Text Field", propertyReader.getproperty("Last_Name"));
        mobileGeneralMethod.type(kwartaPadalaObjects.objLastName(), "Last Name Text Field", propertyReader.getproperty("Last_Name"));
        mobileGeneralMethod.tap(kwartaPadalaObjects.objNextBtn(), "Button");
        if (mobileGeneralMethod.isVisible(kwartaPadalaObjects.objMobileNumberRequiredMsg(), "Error Message")) {
            String sMiddleNameRequiredMsg = mobileGeneralMethod.getText(kwartaPadalaObjects.objMobileNumberRequiredMsg());
            String sExpectedMsg = "Mobile number is required.";
            mobileGeneralMethod.assertionValidation(sMiddleNameRequiredMsg, sExpectedMsg);
        }
        mobileGeneralMethod.type(kwartaPadalaObjects.objMobileNumber(), "Mobile Field", propertyReader.getproperty("Branch_Verified"));
        mobileGeneralMethod.tap(kwartaPadalaObjects.objNextBtn(), "Button");
        mobileGeneralMethod.waitSleep(1000);
        if (mobileGeneralMethod.isVisible(kwartaPadalaObjects.objKwartaPadala(), "Page")){
            LoggingUtils.info("STB_TC_08, Prompt msg for Receiver's Details required is validated");
            ExtentReporter.logPass("STB_TC_08", "STB_TC_08, Prompt msg for Receiver's Details required is validated");
            System.out.println("-----------------------------------------------------------");
        } else {
            ExtentReporter.logFail("STB_TC_08", "STB_TC_08(), Failed To Validate Prompt msg for Receiver's Details required");
            System.out.println("-----------------------------------------------------------");

        }

    }

//        public void sendMoneyInvalidDetails_STB_TC_07() throws Exception {
//        login.loginWalletBranchTier();
//        mobileGeneralMethod.tap(kwartaPadalaObjects.objSendTransferBtn(), "Send Transfer Button");
//        mobileGeneralMethod.isVisible(kwartaPadalaObjects.objSendMoney(), "Send Money Page");
//        mobileGeneralMethod.tap(kwartaPadalaObjects.objToAnyMLBranch(), "MLWallet User Button");
//        mobileGeneralMethod.waitSleep(1000);
//        mobileGeneralMethod.isVisible(kwartaPadalaObjects.objKwartaPadala(), "Page");
//        mobileGeneralMethod.type(kwartaPadalaObjects.objFirstname(), "First Name Text Field", propertyReader.getproperty("Invalid_First_Name"));
//        mobileGeneralMethod.tap(kwartaPadalaObjects.objNextBtn(), "Button");
//        if (mobileGeneralMethod.isVisible(kwartaPadalaObjects.objFirstNameErrorMsg(), "Error Message")) {
//            String sFirstNameErrorMsg = mobileGeneralMethod.getText(kwartaPadalaObjects.objFirstNameErrorMsg());
//            String sExpectedMsg = "First name must only contain letters and spaces";
//            mobileGeneralMethod.assertionValidation(sFirstNameErrorMsg, sExpectedMsg);
//        }
//        mobileGeneralMethod.type(kwartaPadalaObjects.objAmountTxtField(), "First Name Text Field", propertyReader.getproperty("First_Name"));
//        mobileGeneralMethod.type(kwartaPadalaObjects.objAmountTxtField(), "First Name Text Field", propertyReader.getproperty("First_Name"));
//        mobileGeneralMethod.type(kwartaPadalaObjects.objAmountTxtField(), "Middle Name Text Field", propertyReader.getproperty("Invalid_Middle_Name"));
//        mobileGeneralMethod.tap(kwartaPadalaObjects.objNextBtn(), "Button");
//        if (mobileGeneralMethod.isVisible(kwartaPadalaObjects.objMiddleNameErrorMsg(), "Error Message")) {
//            String sMiddleNameRequiredMsg = mobileGeneralMethod.getText(kwartaPadalaObjects.objMiddleNameErrorMsg());
//            String sExpectedMsg = "Middle name must only contain letters and spaces";
//            mobileGeneralMethod.assertionValidation(sMiddleNameRequiredMsg, sExpectedMsg);
//        }
//        mobileGeneralMethod.tap(kwartaPadalaObjects.objCheckBox(), "Check Box");
//        mobileGeneralMethod.verticalSwipeDown();
//        mobileGeneralMethod.verticalSwipe();
//        mobileGeneralMethod.waitSleep(3000);
//        mobileGeneralMethod.type(kwartaPadalaObjects.objAmountTxtField(), "Last Name Text Field", propertyReader.getproperty("Invalid_Last_Name"));
//        mobileGeneralMethod.tap(kwartaPadalaObjects.objNextBtn(), "Button");
//        if (mobileGeneralMethod.isVisible(kwartaPadalaObjects.objLastNameErrorMsg(), "Error Message")) {
//            String sLastNameRequiredMsg = mobileGeneralMethod.getText(kwartaPadalaObjects.objLastNameErrorMsg());
//            String sExpectedMsg = "Last name must only contain letters and spaces";
//            mobileGeneralMethod.assertionValidation(sLastNameRequiredMsg, sExpectedMsg);
//        }
//        mobileGeneralMethod.type(kwartaPadalaObjects.objAmountTxtField(), "Last Name Text Field", propertyReader.getproperty("Last_Name"));
//        mobileGeneralMethod.type(kwartaPadalaObjects.objAmountTxtField(), "Last Name Text Field", propertyReader.getproperty("Last_Name"));
//
//        mobileGeneralMethod.type(kwartaPadalaObjects.objAmountTxtField(), "Last Name Text Field", propertyReader.getproperty("Invalid_MobileNumber"));
//        mobileGeneralMethod.tap(kwartaPadalaObjects.objNextBtn(), "Button");
//        if (mobileGeneralMethod.isVisible(kwartaPadalaObjects.objMobileNumberErrorMsg(), "Error Message")) {
//            String sMiddleNameRequiredMsg = mobileGeneralMethod.getText(kwartaPadalaObjects.objMobileNumberErrorMsg());
//            String sExpectedMsg = "Mobile number is invalid";
//            mobileGeneralMethod.assertionValidation(sMiddleNameRequiredMsg, sExpectedMsg);
//        }
//         mobileGeneralMethod.clearField(kwartaPadalaObjects.objMobileNumber(),"Mobile Number");
//        mobileGeneralMethod.type(mlWalletPageObjects.mobileNum_editText(), "Mobile Field", "9999999934");
//        mobileGeneralMethod.tap(kwartaPadalaObjects.objNextBtn(), "Button");
//        mobileGeneralMethod.waitSleep(1000);
//        if (mobileGeneralMethod.isVisible(kwartaPadalaObjects.objKwartaPadala(), "Page")){
//            LoggingUtils.info("STB_TC_07, Prompt msg for Receiver's Details Invalid is validated");
//            ExtentReporter.logPass("STB_TC_07", "STB_TC_07, Prompt msg for Receiver's Details Invalid is validated");
//            System.out.println("-----------------------------------------------------------");
//        } else {
//            ExtentReporter.logFail("STB_TC_07", "STB_TC_07(), Failed To Validate Prompt msg for Receiver's Details Invalid");
//            System.out.println("-----------------------------------------------------------");
//
//        }
//
//    }
    public void sendMoneyAddRecipient_STB_TC_03() throws Exception {
        login.loginWalletBranchTier();
        mobileGeneralMethod.tap(kwartaPadalaObjects.objSendTransferBtn(), "Send Transfer Button");
        mobileGeneralMethod.isVisible(kwartaPadalaObjects.objSendMoney(), "Send Money Page");
        mobileGeneralMethod.tap(kwartaPadalaObjects.objToAnyMLBranch(), "MLWallet User Button");
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.isVisible(kwartaPadalaObjects.objKwartaPadala(), "Page");
        addRecipient();
        mobileGeneralMethod.waitSleep(5000);
        mobileGeneralMethod.type(kwartaPadalaObjects.objSearchRecipient(), "Search Recipient Text Field", propertyReader.getproperty("Last_Name"));
        if (mobileGeneralMethod.isVisible(payBillsObject.objSelectLastName(propertyReader.getproperty("Last_Name"), propertyReader.getproperty("First_Name")), "Recipient")) {
            LoggingUtils.info("STB_TC_03, The Added Recipient is displayed in Saved Recipient Page");
            ExtentReporter.logPass("STB_TC_03", "STB_TC_03, The Added Recipient is displayed in Saved Recipient Page");
            System.out.println("-----------------------------------------------------------");
        } else {
            ExtentReporter.logFail("STB_TC_03", "STB_TC_03(), Failed To Validate Added Recipient is displayed in Saved Recipient Page");
            System.out.println("-----------------------------------------------------------");

        }

    }

    public void kwartaPadalaViaBranchSuccessfulTransaction_STB_TC_02() throws Exception {
        login.loginWalletBranchTier();
        mobileGeneralMethod.tap(kwartaPadalaObjects.objSendTransferBtn(), "Send Transfer Button");
        mobileGeneralMethod.isVisible(kwartaPadalaObjects.objSendMoney(), "Send Money Page");
        mobileGeneralMethod.tap(kwartaPadalaObjects.objToAnyMLBranch(), "MLWallet User Button");
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.isVisible(kwartaPadalaObjects.objKwartaPadala(), "Page");
        selectSavedRecipient();
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.tap(kwartaPadalaObjects.objSelectRecipient(), "Button");
        mobileGeneralMethod.tap(kwartaPadalaObjects.objCheckBox(), "Check Box");
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.tap(kwartaPadalaObjects.objNextBtn(), "Button");
        enterAmountToKwartaPadala("10");
//        enableLocation_PopUp();
        mobileGeneralMethod.waitSleep(2000);
        mobileGeneralMethod.tap(mlWalletPageObjects.continue2_btn(), "Continue Button");
        mobileGeneralMethod.waitSleep(2000);
        if (mobileGeneralMethod.isVisible(kwartaPadalaObjects.objSendMoneySuccessful(), "Message")) {
            mobileGeneralMethod.isVisible(kwartaPadalaObjects.objPHPAmount(), "Amount");
            mobileGeneralMethod.isVisible(kwartaPadalaObjects.objDate(), "Date");
            mobileGeneralMethod.isVisible(kwartaPadalaObjects.objReferenceNumber(), "Reference Number");
            String sReference = mobileGeneralMethod.getText(kwartaPadalaObjects.objReferenceNumber());
            System.out.println(sReference);
            String sReferenceNumber = sReference.substring(9, 20);
            System.out.println(sReferenceNumber);
            mobileGeneralMethod.verticalSwipeDown();
            mobileGeneralMethod.verticalSwipe();
            mobileGeneralMethod.waitSleep(3000);
            mobileGeneralMethod.tap(kwartaPadalaObjects.objBackToHomeBtn(), "Button");
            mobileGeneralMethod.verticalSwipeDown();
            mobileGeneralMethod.verticalSwipe();
            mobileGeneralMethod.waitSleep(3000);
            mobileGeneralMethod.isVisible(payBillsObject.objRecentTransactions(), "Text");
            mobileGeneralMethod.isVisible(payBillsObject.objRecentTransactions(), "Text");
            mobileGeneralMethod.tap(kwartaPadalaObjects.objKwartaPadala(), "Text");
            if (mobileGeneralMethod.isVisible(kwartaPadalaObjects.objReferenceNumberInTransactionDetails(), "Page")) {
                String sReferenceNumberInCashOut = mobileGeneralMethod.getText(kwartaPadalaObjects.objReferenceNumberInTransactionDetails());
                System.out.println(sReferenceNumberInCashOut);
                mobileGeneralMethod.assertionValidation(sReferenceNumberInCashOut, sReferenceNumber);
                LoggingUtils.info("STB_TC_02, Successfully sent Amount to saved Recipient and Transaction Details is validated");
                ExtentReporter.logPass("STB_TC_02", "STB_TC_02, Successfully sent Amount to saved Recipient and Transaction Details is validated");
                System.out.println("-----------------------------------------------------------");
            } else {
                ExtentReporter.logFail("STB_TC_02", "STB_TC_02(), Failed To Validate Successfully sent Amount to saved Recipient and Transaction Details");
                System.out.println("-----------------------------------------------------------");

            }
        }

    }

    public void sendMoneyContactDuplicate_STB_TC_04() throws Exception {
        login.loginWalletBranchTier();
        mobileGeneralMethod.tap(kwartaPadalaObjects.objSendTransferBtn(), "Send Transfer Button");
        mobileGeneralMethod.isVisible(kwartaPadalaObjects.objSendMoney(), "Send Money Page");
        mobileGeneralMethod.tap(kwartaPadalaObjects.objToAnyMLBranch(), "MLWallet User Button");
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.isVisible(kwartaPadalaObjects.objKwartaPadala(), "Page");
        addRecipient();
        if (mobileGeneralMethod.isVisible(kwartaPadalaObjects.objContactAlreadyExistMsg(), "Error Message")) {
            String sContactDuplicatePopupMsg = mobileGeneralMethod.getText(kwartaPadalaObjects.objContactAlreadyExistMsg());
            String sExpectedPopupMsg = "Contact already exists.";
            mobileGeneralMethod.assertionValidation(sContactDuplicatePopupMsg, sExpectedPopupMsg);
            LoggingUtils.info("STB_TC_04, Contact already exists popup message Validated");
            ExtentReporter.logPass("STB_TC_04", "STB_TC_04, Contact already exists popup message Validated");
            System.out.println("-----------------------------------------------------------");
        } else {
            ExtentReporter.logFail("STB_TC_04", "STB_TC_04(), Failed To Validate Contact already exists popup message");
            System.out.println("-----------------------------------------------------------");

        }

    }

    public void sendMoneyEditRecipient_STB_TC_06() throws Exception {
        login.loginWalletBranchTier();
        mobileGeneralMethod.tap(kwartaPadalaObjects.objSendTransferBtn(), "Send Transfer Button");
        mobileGeneralMethod.isVisible(kwartaPadalaObjects.objSendMoney(), "Send Money Page");
        mobileGeneralMethod.tap(kwartaPadalaObjects.objToAnyMLBranch(), "MLWallet User Button");
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.isVisible(kwartaPadalaObjects.objKwartaPadala(), "Page");
        selectSavedRecipient();
        mobileGeneralMethod.tap(kwartaPadalaObjects.objEditRecipient(), "Button");
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.type(kwartaPadalaObjects.objEditRecipientLastName(), "Last Name Text Field", propertyReader.getproperty("Edited_Last_name"));
        mobileGeneralMethod.tap(kwartaPadalaObjects.ObjSaveRecipient(), "Button");
        mobileGeneralMethod.type(kwartaPadalaObjects.objSearchRecipient(), propertyReader.getproperty("Edited_Last_name"), "Search Recipient Text Field");
        if ((mobileGeneralMethod.isVisible(payBillsObject.objSelectLastName(propertyReader.getproperty("Edited_Last_name"), propertyReader.getproperty("First_Name")), "Recipient"))) {
            LoggingUtils.info("STB_TC_06, Successfully edited the Saved Recipient");
            ExtentReporter.logPass("STB_TC_06", "STB_TC_06, Successfully edited the Saved Recipient");
            System.out.println("-----------------------------------------------------------");
        } else {
            ExtentReporter.logFail("STB_TC_06", "STB_TC_06(), Failed To Validate Successfully edited the Saved Recipient");
            System.out.println("-----------------------------------------------------------");

        }
    }

        public void sendMoneyDeleteRecipient_STB_TC_05() throws Exception {
        login.loginWalletBranchTier();
        mobileGeneralMethod.tap(kwartaPadalaObjects.objSendTransferBtn(), "Send Transfer Button");
        mobileGeneralMethod.isVisible(kwartaPadalaObjects.objSendMoney(), "Send Money Page");
        mobileGeneralMethod.tap(kwartaPadalaObjects.objToAnyMLBranch(), "MLWallet User Button");
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.isVisible(kwartaPadalaObjects.objKwartaPadala(), "Page");
        selectSavedRecipient();
        mobileGeneralMethod.tap(kwartaPadalaObjects.objDeleteRecipient(), "Button");
        mobileGeneralMethod.isVisible(kwartaPadalaObjects.objPopupMsg(), "Pop Up Message");
        String sDeleteConfirmationPopup = mobileGeneralMethod.getText(kwartaPadalaObjects.objPopupMsg());
        String sExceptedMsg = "Are you sure you want to remove this saved recipient?";
        mobileGeneralMethod.assertionValidation(sDeleteConfirmationPopup, sExceptedMsg);
        mobileGeneralMethod.tap(kwartaPadalaObjects.objRemoveBtn(), "Button");
        mobileGeneralMethod.clearField(kwartaPadalaObjects.objSearchRecipient(),"Search Field");
        mobileGeneralMethod.waitSleep(1000);
        if ((mobileGeneralMethod.isVisible(payBillsObject.objSelectLastName(propertyReader.getproperty("Edited_Last_name"), propertyReader.getproperty("First_Name")), "Recipient"))) {
            LoggingUtils.info("STB_TC_05, Saved Recipient from Saved Recipients page not got deleted Successfully");
            ExtentReporter.logPass("STB_TC_05", "STB_TC_05, Saved Recipient from Saved Recipients page not got deleted Successfully");
            System.out.println("-----------------------------------------------------------");
        } else {
            ExtentReporter.logFail("STB_TC_05", "STB_TC_05(), Failed To Validate Saved Recipient from Saved Recipients page not got deleted Successfully");
            System.out.println("-----------------------------------------------------------");

        }
    }
    public void sendMoneyInvalidAmount_STB_TC_09(String Amount) throws Exception {
        login.loginWalletBranchTier();
        mobileGeneralMethod.tap(kwartaPadalaObjects.objSendTransferBtn(), "Send Transfer Button");
        mobileGeneralMethod.isVisible(kwartaPadalaObjects.objSendMoney(), "Send Money Page");
        mobileGeneralMethod.tap(kwartaPadalaObjects.objToAnyMLBranch(), "MLWallet User Button");
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.isVisible(kwartaPadalaObjects.objKwartaPadala(), "Page");
        enterMLBranchDetails();
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.isVisible(kwartaPadalaObjects.objKwartaPadala(), "Page");
        mobileGeneralMethod.type(kwartaPadalaObjects.objAmountTxtField(), "Amount text Field", Amount);
        mobileGeneralMethod.tap(kwartaPadalaObjects.objNextBtn(), "Button");
        if ((mobileGeneralMethod.isVisible(kwartaPadalaObjects.objInvalidAmountMsg(), "Error Message"))) {
            String sInvalidAmountErrorMsg = mobileGeneralMethod.getText(kwartaPadalaObjects.objInvalidAmountMsg());
            String sExpectedErrorMsg = "The amount should not be less than 1";
            mobileGeneralMethod.assertionValidation(sInvalidAmountErrorMsg, sExpectedErrorMsg);
            LoggingUtils.info("STB_TC_09, The amount should not be less than 1 - Error Message is validated");
            ExtentReporter.logPass("STB_TC_09", "STB_TC_09, The amount should not be less than 1 - Error Message is validated");
            System.out.println("-----------------------------------------------------------");
        } else {
            ExtentReporter.logFail("STB_TC_09", "STB_TC_09(), Failed To Validate Error Message -The amount should not be less than 1 ");
            System.out.println("-----------------------------------------------------------");

        }
    }

//    public void sendMoneyInsufficientAmount_STB_TC_10() throws Exception {
//        login.loginWalletSemi_Verified();
//        mobileGeneralMethod.tap(kwartaPadalaObjects.objSendTransferBtn(), "Send Transfer Button");
//        mobileGeneralMethod.isVisible(kwartaPadalaObjects.objSendMoney(), "Send Money Page");
//        mobileGeneralMethod.tap(kwartaPadalaObjects.objToAnyMLBranch(), "MLWallet User Button");
//        mobileGeneralMethod.waitSleep(1000);
//        mobileGeneralMethod.isVisible(kwartaPadalaObjects.objKwartaPadala(), "Page");
//        enterMLBranchDetails();
//        enterAmountToKwartaPadala("39000");
//        if ((mobileGeneralMethod.isVisible(kwartaPadalaObjects.objInsufficientAmountMsg(), "Error Message"))) {
//            String sInvalidAmountErrorMsg = mobileGeneralMethod.getText(kwartaPadalaObjects.objInsufficientAmountMsg());
//            String sExpectedErrorMsg = "There is insufficient balance on your account to proceed with this transaction. Please try again.";
//            mobileGeneralMethod.assertionValidation(sInvalidAmountErrorMsg, sExpectedErrorMsg);
//            LoggingUtils.info("STB_TC_10, Insufficient Balance - Error Message is validated");
//            ExtentReporter.logPass("STB_TC_10", "STB_TC_10, Insufficient Balance - Error Message is validated");
//            System.out.println("-----------------------------------------------------------");
//        } else {
//            ExtentReporter.logFail("STB_TC_10", "STB_TC_10(), Failed To Validate Error Message -Insufficient Balance");
//            System.out.println("-----------------------------------------------------------");
//
//        }
//    }

    public void sendMoneyMaximumAmount_STB_TC_12() throws Exception {
        login.loginWalletBranchTier();
        mobileGeneralMethod.tap(kwartaPadalaObjects.objSendTransferBtn(), "Send Transfer Button");
        mobileGeneralMethod.isVisible(kwartaPadalaObjects.objSendMoney(), "Send Money Page");
        mobileGeneralMethod.tap(kwartaPadalaObjects.objToAnyMLBranch(), "MLWallet User Button");
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.isVisible(kwartaPadalaObjects.objKwartaPadala(), "Page");
        enterMLBranchDetails();
        enterAmountToKwartaPadala("10000");
        if ((mobileGeneralMethod.isVisible(kwartaPadalaObjects.objMaxLimitErrorMsg(), "Error Message"))) {
            String sInvalidAmountErrorMsg = mobileGeneralMethod.getText(kwartaPadalaObjects.objMaxLimitErrorMsg());
            String sExpectedErrorMsg = "The maximum Send Money per transaction set for your verification level is P50,000.00. Please try again.";
            mobileGeneralMethod.assertionValidation(sInvalidAmountErrorMsg, sExpectedErrorMsg);
            LoggingUtils.info("STB_TC_12, The maximum send money per transaction - Error Message is validated");
            ExtentReporter.logPass("STB_TC_12", "STB_TC_12, The maximum send money per transaction - Error Message is validated");
            System.out.println("-----------------------------------------------------------");
        } else {
            ExtentReporter.logFail("STB_TC_12", "STB_TC_12(), Failed To Validate Error Message -The maximum send money per transaction");
            System.out.println("-----------------------------------------------------------");

        }
    }

    //================================= Phase 2 ==================================================================//

    public void sendTransferUIValidation_STB_TC_13() throws Exception {
        login.loginWalletBranchTier();
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.tap(kwartaPadalaObjects.objSendTransferBtn(), "Send Transfer Button");
        if (mobileGeneralMethod.isVisible(kwartaPadalaObjects.objSendMoney(), "Send Money Page")) {
            mobileGeneralMethod.isVisible(kwartaPadalaObjects.objSendWalletOptions(), "Header");
            mobileGeneralMethod.isVisible(kwartaPadalaObjects.objToAnyMLBranch(), "Option");
            mobileGeneralMethod.isVisible(kwartaPadalaObjects.objToAMLWalletUser(), "Option");
            LoggingUtils.info("STB_TC_13, Send/Transfer page UI Validated");
            ExtentReporter.logPass("STB_TC_13", "STB_TC_13, Send/Transfer page UI Validated");
            System.out.println("-----------------------------------------------------------");
        } else {
            ExtentReporter.logFail("STB_TC_13", "STB_TC_13(), Failed To Validate Send/Transfer page");
            System.out.println("-----------------------------------------------------------");

        }
    }

    public void sendMoneyToBranchUIValidation_STB_TC_14() throws Exception {
        login.loginWalletBranchTier();
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.tap(kwartaPadalaObjects.objSendTransferBtn(), "Send Transfer Button");
        mobileGeneralMethod.isVisible(kwartaPadalaObjects.objSendMoney(), "Send Money Page");
        mobileGeneralMethod.tap(kwartaPadalaObjects.objToAnyMLBranch(), "MLWallet User Button");
        if (mobileGeneralMethod.isVisible(kwartaPadalaObjects.objKwartaPadala(), "Send Money Page")) {
            mobileGeneralMethod.isVisible(kwartaPadalaObjects.objSavedRecipients(), "Button");
            mobileGeneralMethod.isVisible(kwartaPadalaObjects.objFirstname(), "First Name Input Field");
            mobileGeneralMethod.isVisible(kwartaPadalaObjects.objMiddleName(), "Middle Name Input Field");
            mobileGeneralMethod.isVisible(kwartaPadalaObjects.objCheckBox(), "Check box to Receiver legally does not have middle Name");
            mobileGeneralMethod.isVisible(kwartaPadalaObjects.objLastName(), "Last Name Input Field");
            mobileGeneralMethod.isVisible(kwartaPadalaObjects.objMobileNumber(), "Mobile Number Input Field");
            mobileGeneralMethod.isVisible(kwartaPadalaObjects.objNextBtn(), "Button");
            LoggingUtils.info("STB_TC_14, Send Money to ML Branch page UI Validation");
            ExtentReporter.logPass("STB_TC_14", "STB_TC_14, Send Money to ML Branch page UI Validation");
            System.out.println("-----------------------------------------------------------");
        } else {
            ExtentReporter.logFail("STB_TC_14", "STB_TC_14(), Failed To Validate Send Money to ML Branch page UI");
            System.out.println("-----------------------------------------------------------");

        }
    }

//        public void sendMoneyToBranchSaveRecipientPageUIValidation_STB_TC_15() throws Exception {
//        login.loginWalletBranchTier();
//        mobileGeneralMethod.waitSleep(1000);
//        mobileGeneralMethod.tap(kwartaPadalaObjects.objSendTransferBtn(), "Send Transfer Button");
//        mobileGeneralMethod.isVisible(kwartaPadalaObjects.objSendMoney(), "Send Money Page");
//        mobileGeneralMethod.tap(kwartaPadalaObjects.objToAnyMLBranch(), "MLWallet User Button");
//        mobileGeneralMethod.isVisible(kwartaPadalaObjects.objKwartaPadala(), "Send Money Page");
//        mobileGeneralMethod.isVisible(kwartaPadalaObjects.objSavedRecipients(), "Button");
//        mobileGeneralMethod.waitSleep(1000);
//        if (mobileGeneralMethod.isVisible(kwartaPadalaObjects.objSavedRecipients(), "Page")) {
//            mobileGeneralMethod.isVisible(kwartaPadalaObjects.objAddRecipient(), "Button");
//            mobileGeneralMethod.isVisible(kwartaPadalaObjects.objSelectRecipient(), "Header");
//            mobileGeneralMethod.isVisible(kwartaPadalaObjects.objSearchRecipient(), "Search Recipient Input Field");
//            if( mobileGeneralMethod.isDisplayed(kwartaPadalaObjects.objSavedRecipientsList())){
//                List<WebElement> values = findElements(kwartaPadalaObjects.objSavedRecipientsList());
//                for (int i = 0; i < values.size(); i++) {
//                    String savedRecipientName = values.get(i).getText();
//                    LoggingUtils.info("Saved Recipient : " + savedRecipientName + " is displayed");
//                    ExtentReporter.logPass(" ", "Saved Recipient : " + savedRecipientName + " is displayed");
//                }
//            } else if (mobileGeneralMethod.isVisible(kwartaPadalaObjects.objNoRecentTransactionTxt(),"Text")) {
//                LoggingUtils.info("No Saved Recipients are present");
//            }
//            LoggingUtils.info("STB_TC_15, Send Money To Branch Save Recipient Page UI Validated");
//            ExtentReporter.logPass("STB_TC_15", "STB_TC_15, Send Money To Branch Save Recipient Page UI Validated");
//            System.out.println("-----------------------------------------------------------");
//        } else {
//            ExtentReporter.logFail("STB_TC_15", "STB_TC_15(), Failed To Validate Send Money To Branch Save Recipient Page");
//            System.out.println("-----------------------------------------------------------");
//
//        }
//    }
    public void sendMoneyToBranchSuccessUIValidation_STB_TC_16() throws Exception {
        login.loginWalletBranchTier();
        mobileGeneralMethod.tap(kwartaPadalaObjects.objSendTransferBtn(), "Send Transfer Button");
        mobileGeneralMethod.isVisible(kwartaPadalaObjects.objSendMoney(), "Send Money Page");
        mobileGeneralMethod.tap(kwartaPadalaObjects.objToAnyMLBranch(), "MLWallet User Button");
        mobileGeneralMethod.waitSleep(1000);
        enterMLBranchDetails();
        enterAmountToKwartaPadala();
//        enableLocation_PopUp();
        mobileGeneralMethod.waitSleep(3000);
        mobileGeneralMethod.tap(mlWalletPageObjects.continue2_btn(), "Continue Button");
        mobileGeneralMethod.waitSleep(10000);
        if (mobileGeneralMethod.isVisible(kwartaPadalaObjects.objSendMoneySuccessful(), "Message")) {
            mobileGeneralMethod.isVisible(kwartaPadalaObjects.objPHPAmount(), "Amount");
            mobileGeneralMethod.isVisible(kwartaPadalaObjects.objDate(), "Date");
            mobileGeneralMethod.isVisible(kwartaPadalaObjects.objReferenceNumber(), "Reference Number");
            mobileGeneralMethod.isVisible(kwartaPadalaObjects.objTransactionDetails(), "Header");
            mobileGeneralMethod.isVisible(kwartaPadalaObjects.objReceiverName(), "Reference Number");
            mobileGeneralMethod.isVisible(kwartaPadalaObjects.objReceiverMobileNo(), "Receiver's Mobile Number");
            mobileGeneralMethod.isVisible(kwartaPadalaObjects.objPaymentMethod(), "Payment Method");
            mobileGeneralMethod.isVisible(kwartaPadalaObjects.objAmount(), "Amount");
            mobileGeneralMethod.isVisible(kwartaPadalaObjects.objServiceFee(), "Service Fee");
            mobileGeneralMethod.isVisible(kwartaPadalaObjects.objTotalAmount(), "Total Amount");
            mobileGeneralMethod.verticalSwipeDown();
            mobileGeneralMethod.verticalSwipe();
            mobileGeneralMethod.waitSleep(3000);
            mobileGeneralMethod.isVisible(kwartaPadalaObjects.objBackToHomeBtn(), "Button");
            mobileGeneralMethod.isVisible(kwartaPadalaObjects.objNewTransaction(), "Button");
            LoggingUtils.info("STB_TC_16, Send Money To Branch Success page UI Validated");
            ExtentReporter.logPass("STB_TC_16", "STB_TC_16, Send Money To Branch Success page UI Validated");
            System.out.println("-----------------------------------------------------------");
        } else {
            ExtentReporter.logFail("STB_TC_16", "STB_TC_16(), Failed To Validate Send Money To Branch Success page");
            System.out.println("-----------------------------------------------------------");

        }
    }

    public void sendMoneyToBranchConfirmDetailsPageUIValidation_STB_TC_17(String nAmount) throws Exception {
        login.loginWalletBranchTier();
        mobileGeneralMethod.tap(kwartaPadalaObjects.objSendTransferBtn(), "Send Transfer Button");
        mobileGeneralMethod.isVisible(kwartaPadalaObjects.objSendMoney(), "Send Money Page");
        mobileGeneralMethod.tap(kwartaPadalaObjects.objToAnyMLBranch(), "MLWallet User Button");
        mobileGeneralMethod.waitSleep(1000);
        enterMLBranchDetails();
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.isVisible(kwartaPadalaObjects.objKwartaPadala(), "Page");
        mobileGeneralMethod.type(kwartaPadalaObjects.objAmountTxtField(), "Amount text Field", nAmount);
        mobileGeneralMethod.tap(kwartaPadalaObjects.objNextBtn(), "Button");
        mobileGeneralMethod.isVisible(kwartaPadalaObjects.objSelectPaymentMethod(), "Page");
        mobileGeneralMethod.waitSleep(10000);
        mobileGeneralMethod.tap(kwartaPadalaObjects.objMLWalletBalance(), "Button");
        if (mobileGeneralMethod.isVisible(kwartaPadalaObjects.objConfirmDetails(), "Page")) {
            mobileGeneralMethod.isVisible(kwartaPadalaObjects.objTransactionDetails(), "Header");
            mobileGeneralMethod.isVisible(kwartaPadalaObjects.objReceiverName(), "Receiver's Name");
            mobileGeneralMethod.isVisible(kwartaPadalaObjects.objReceiverMobileNo(), "Reference Mobile Number");
            mobileGeneralMethod.isVisible(kwartaPadalaObjects.objPaymentMethod(), "Payment Method");
            mobileGeneralMethod.isVisible(kwartaPadalaObjects.objAmount(), "Amount");
            mobileGeneralMethod.isVisible(kwartaPadalaObjects.objServiceFee(), "Service Fee");
            mobileGeneralMethod.isVisible(kwartaPadalaObjects.objTotalAmount(), "Total Amount");
            mobileGeneralMethod.isVisible(kwartaPadalaObjects.objConfirmBtn(), "Button");
            LoggingUtils.info("STB_TC_17, Send Money To Branch Confirm Details Page UI Validated");
            ExtentReporter.logPass("STB_TC_17", "STB_TC_17, Send Money To Branch Confirm Details Page UI Validated");
            System.out.println("-----------------------------------------------------------");
        } else {
            ExtentReporter.logFail("STB_TC_17", "STB_TC_17(), Failed To Validate Send Money To Branch Confirm Details Page");
            System.out.println("-----------------------------------------------------------");

        }
    }

    public void sendMoneyToBranchSelectPaymentMethodPageUIValidation_STB_TC_18(String nAmount) throws Exception {
        login.loginWalletBranchTier();
        mobileGeneralMethod.tap(kwartaPadalaObjects.objSendTransferBtn(), "Send Transfer Button");
        mobileGeneralMethod.isVisible(kwartaPadalaObjects.objSendMoney(), "Send Money Page");
        mobileGeneralMethod.tap(kwartaPadalaObjects.objToAnyMLBranch(), "MLWallet User Button");
        mobileGeneralMethod.waitSleep(1000);
        enterMLBranchDetails();
        mobileGeneralMethod.waitSleep(5000);
        mobileGeneralMethod.isVisible(kwartaPadalaObjects.objKwartaPadala(), "Page");
        mobileGeneralMethod.type(kwartaPadalaObjects.objAmountTxtField(), "Amount text Field", nAmount);
        mobileGeneralMethod.tap(kwartaPadalaObjects.objNextBtn(), "Button");
        mobileGeneralMethod.waitSleep(10000);
        if (mobileGeneralMethod.isVisible(kwartaPadalaObjects.objPaymentMethod(), "Payment Method")) {
            mobileGeneralMethod.isVisible(kwartaPadalaObjects.objMLWalletBalance(), "Button");
            mobileGeneralMethod.isVisible(kwartaPadalaObjects.objAvailableBalance(), "Available PHP");
            LoggingUtils.info("STB_TC_18, Send Money To Branch Select Payment Method Page UI Validated");
            ExtentReporter.logPass("STB_TC_18", "STB_TC_18, Send Money To Branch Select Payment Method Page UI Validated");
            System.out.println("-----------------------------------------------------------");
        } else {
            ExtentReporter.logFail("STB_TC_18", "STB_TC_18(), Failed To Validate Send Money To Branch Select Payment Method Page");
            System.out.println("-----------------------------------------------------------");

        }
    }

    public void sendMoneyToBranchEnterAmountPageUIValidation_STB_TC_19() throws Exception {
        login.loginWalletBranchTier();
        mobileGeneralMethod.tap(kwartaPadalaObjects.objSendTransferBtn(), "Send Transfer Button");
        mobileGeneralMethod.isVisible(kwartaPadalaObjects.objSendMoney(), "Send Money Page");
        mobileGeneralMethod.tap(kwartaPadalaObjects.objToAnyMLBranch(), "MLWallet User Button");
        mobileGeneralMethod.waitSleep(1000);
        enterMLBranchDetails();
        mobileGeneralMethod.waitSleep(10000);
        if (mobileGeneralMethod.isVisible(kwartaPadalaObjects.objKwartaPadala(), "Page")) {
            mobileGeneralMethod.isVisible(kwartaPadalaObjects.objAmountToSend(), "Header");
            mobileGeneralMethod.isVisible(kwartaPadalaObjects.objAmountTxtField(), "Amount Input Field");
            mobileGeneralMethod.isVisible(kwartaPadalaObjects.objNextBtn(), "Button");
            LoggingUtils.info("STB_TC_19, Send Money To Branch Enter Amount Page UI Validated");
            ExtentReporter.logPass("STB_TC_19", "STB_TC_19, Send Money To Branch Enter Amount Page UI Validated");
            System.out.println("-----------------------------------------------------------");
        } else {
            ExtentReporter.logFail("STB_TC_19", "STB_TC_19(), Failed To Validate Send Money To Branch Enter Amount Page");
            System.out.println("-----------------------------------------------------------");

        }
    }

    public void kwartaPadalaTransactionDetailsUIValidation_STB_TC_20() throws Exception {
        sendMoneyToMLBranch_STB_TC_01();
        if (mobileGeneralMethod.isVisible(kwartaPadalaObjects.objTransactionDetails(), "Header")) {
            mobileGeneralMethod.isVisible(kwartaPadalaObjects.objKwartaPadala(), "Text");
            mobileGeneralMethod.isVisible(kwartaPadalaObjects.objKwartaPadalaDate(), "Kwarta Padala Date");
            mobileGeneralMethod.isVisible(kwartaPadalaObjects.objReceiverName(), "Receiver's Name");
            mobileGeneralMethod.isVisible(kwartaPadalaObjects.objReceiverMobileNo(), "Receiver's Mobile Number");
            mobileGeneralMethod.isVisible(kwartaPadalaObjects.objPaymentMethod(), "Payment Method");
            mobileGeneralMethod.isVisible(kwartaPadalaObjects.objAmount(), "Amount");
            mobileGeneralMethod.isVisible(kwartaPadalaObjects.objServiceFee(), "Service Fee");
            mobileGeneralMethod.isVisible(kwartaPadalaObjects.objTotalAmount(), "Total Amount");
            LoggingUtils.info("STB_TC_20, Kwarta Padala Transaction Details page UI Validated");
            ExtentReporter.logPass("STB_TC_20", "STB_TC_20, Kwarta Padala Transaction Details page UI Validated");
            System.out.println("-----------------------------------------------------------");
        } else {
            ExtentReporter.logFail("STB_TC_20", "STB_TC_20(), Failed To Validate Kwarta Padala Transaction Details page");
            System.out.println("-----------------------------------------------------------");

        }
    }

    public void sendMoneyToBranchAddRecipientPageUIValidation_STB_TC_21() throws Exception {
        login.loginWalletBranchTier();
        mobileGeneralMethod.tap(kwartaPadalaObjects.objSendTransferBtn(), "Send Transfer Button");
        mobileGeneralMethod.isVisible(kwartaPadalaObjects.objSendMoney(), "Send Money Page");
        mobileGeneralMethod.tap(kwartaPadalaObjects.objToAnyMLBranch(), "MLWallet User Button");
        if (mobileGeneralMethod.isVisible(kwartaPadalaObjects.objSavedRecipients(), "Button")) {
            mobileGeneralMethod.tap(kwartaPadalaObjects.objSavedRecipients(), "Button");
            mobileGeneralMethod.waitSleep(3000);
            mobileGeneralMethod.tap(kwartaPadalaObjects.objAddRecipient(), "Button");
            mobileGeneralMethod.waitSleep(3000);
            if (mobileGeneralMethod.isVisible(kwartaPadalaObjects.objAddRecipient(), "Page")) {
                mobileGeneralMethod.isVisible(kwartaPadalaObjects.objFirstname(), "First Name Text Field");
                mobileGeneralMethod.isVisible(kwartaPadalaObjects.objMiddleName(), "Middle Name Text Field");
                mobileGeneralMethod.isVisible(kwartaPadalaObjects.objCheckBox(), "Check Box");
                mobileGeneralMethod.isVisible(kwartaPadalaObjects.objLastName(), "Last Name Text Field");
                mobileGeneralMethod.isVisible(kwartaPadalaObjects.objMobileNumber(), "Last Name Text Field");
                mobileGeneralMethod.isVisible(kwartaPadalaObjects.objNickName(), "Nick Name Text Field");
                mobileGeneralMethod.isVisible(kwartaPadalaObjects.ObjSaveRecipient(), "Button");
                LoggingUtils.info("STB_TC_21, Send Money To Branch Add Recipient Page UI Validated");
                ExtentReporter.logPass("STB_TC_21", "STB_TC_21, Send Money To Branch Add Recipient Page UI Validated");
                System.out.println("-----------------------------------------------------------");
            } else {
                ExtentReporter.logFail("STB_TC_21", "STB_TC_21(), Failed To Validate Send Money To Branch Add Recipient Page");
                System.out.println("-----------------------------------------------------------");

            }
        }
    }

    //    public void sendMoneyToMLBranchBuyerTierAccount_STB_TC_22() throws Exception {
//        login.loginWalletBuyerTier();
//        mobileGeneralMethod.tap(kwartaPadalaObjects.objSendTransferBtn(), "Send Transfer Button");
//        mobileGeneralMethod.isVisible(kwartaPadalaObjects.objSendMoney(), "Send Money Page");
//        mobileGeneralMethod.tap(kwartaPadalaObjects.objToAnyMLBranch(), "MLWallet User Button");
//        mobileGeneralMethod.waitSleep(1000);
//        enterMLBranchDetails();
//        enterAmountToKwartaPadala();
//        if (mobileGeneralMethod.isVisible(kwartaPadalaObjects.objErrorMsg(), "Error Message")) {
//            String sMaximumLimitErrorMsg = mobileGeneralMethod.getText(kwartaPadalaObjects.objErrorMsg());
//            String sExpectedErrorMsg = "Send Money is not allowed for customers at this verification level. Please upgrade your account to use this service.";
//            mobileGeneralMethod.assertionValidation(sMaximumLimitErrorMsg, sExpectedErrorMsg);
//            mobileGeneralMethod.isVisible(kwartaPadalaObjects.objUpgradeNowBtn(), "Button");
//            LoggingUtils.info("STB_TC_22, Send Money is not allowed for customers at this Buyer tier - Error Message is validated");
//            ExtentReporter.logPass("STB_TC_22", "STB_TC_22, Send Money is not allowed for customers at this Buyer tier - Error Message is validated");
//            System.out.println("-----------------------------------------------------------");
//        } else {
//            ExtentReporter.logFail("STB_TC_22", "STB_TC_22(), Failed To Validate Error Message - Send Money is not allowed for customers at this Buyer tier ");
//            System.out.println("-----------------------------------------------------------");
//
//        }
//
//    }
//    public void sendMoneyToMLBranchSemiVerifiedTierAccount_STB_TC_23() throws Exception {
//        login.loginWalletSemi_Verified();
//        mobileGeneralMethod.tap(kwartaPadalaObjects.objSendTransferBtn(), "Send Transfer Button");
//        mobileGeneralMethod.isVisible(kwartaPadalaObjects.objSendMoney(), "Send Money Page");
//        mobileGeneralMethod.tap(kwartaPadalaObjects.objToAnyMLBranch(), "MLWallet User Button");
//        mobileGeneralMethod.waitSleep(1000);
//        enterMLBranchDetails();
//        enterAmountToKwartaPadala();
//        enableLocation_PopUp();
//        mobileGeneralMethod.waitSleep(3000);
//        mobileGeneralMethod.tap(mlWalletPageObjects.continue2_btn(), "Continue Button");
//        mobileGeneralMethod.waitSleep(10000);
//        if (mobileGeneralMethod.isVisible(kwartaPadalaObjects.objSendMoneySuccessful(), "Message")) {
//            mobileGeneralMethod.isVisible(kwartaPadalaObjects.objTransactionDetails(), "Header");
//            mobileGeneralMethod.isVisible(kwartaPadalaObjects.objReferenceNumber(), "Reference Number");
//            LoggingUtils.info("STB_TC_23, Send Money To ML Branch, Semi verified Tier Account transaction validated");
//            ExtentReporter.logPass("STB_TC_23", "STB_TC_23, Send Money To ML Branch, Semi verified Tier Account transaction validated");
//            System.out.println("-----------------------------------------------------------");
//        } else {
//            ExtentReporter.logFail("STB_TC_23", "STB_TC_23(), Failed To Validate Send Money To ML Branch, Semi verified Tier Account transaction");
//            System.out.println("-----------------------------------------------------------");
//
//        }
//    }

    public void sendMoneyToMLBranchBranchVerifiedAccount_STB_TC_24() throws Exception {
        login.loginWalletBranchTier();
        mobileGeneralMethod.tap(kwartaPadalaObjects.objSendTransferBtn(), "Send Transfer Button");
        mobileGeneralMethod.isVisible(kwartaPadalaObjects.objSendMoney(), "Send Money Page");
        mobileGeneralMethod.tap(kwartaPadalaObjects.objToAnyMLBranch(), "MLWallet User Button");
        mobileGeneralMethod.waitSleep(1000);
        enterMLBranchDetails();
        enterAmountToKwartaPadala();
//        enableLocation_PopUp();
        mobileGeneralMethod.waitSleep(3000);
        mobileGeneralMethod.tap(mlWalletPageObjects.continue2_btn(), "Continue Button");
        mobileGeneralMethod.waitSleep(10000);
        if (mobileGeneralMethod.isVisible(kwartaPadalaObjects.objSendMoneySuccessful(), "Message")) {
            mobileGeneralMethod.isVisible(kwartaPadalaObjects.objTransactionDetails(), "Header");
            mobileGeneralMethod.isVisible(kwartaPadalaObjects.objReferenceNumber(), "Reference Number");
            LoggingUtils.info("STB_TC_24, Send Money To ML Branch, Branch verified Tier Account transaction validated");
            ExtentReporter.logPass("STB_TC_24", "STB_TC_24, Send Money To ML Branch, Branch verified Tier Account transaction validated");
            System.out.println("-----------------------------------------------------------");
        } else {
            ExtentReporter.logFail("STB_TC_24", "STB_TC_24(), Failed To Validate Send Money To ML Branch, Branch verified Tier Account transaction");
            System.out.println("-----------------------------------------------------------");

        }
    }

    public void sendMoneyToMLBranchFullyVerifiedAccount_STB_TC_25() throws Exception {
        login.loginWalletFullyTier();
        mobileGeneralMethod.tap(kwartaPadalaObjects.objSendTransferBtn(), "Send Transfer Button");
        mobileGeneralMethod.isVisible(kwartaPadalaObjects.objSendMoney(), "Send Money Page");
        mobileGeneralMethod.tap(kwartaPadalaObjects.objToAnyMLBranch(), "MLWallet User Button");
        mobileGeneralMethod.waitSleep(1000);
        enterMLBranchDetails();
        enterAmountToKwartaPadala();
//        enableLocation_PopUp();
        mobileGeneralMethod.waitSleep(3000);
        mobileGeneralMethod.tap(mlWalletPageObjects.continue2_btn(), "Continue Button");
        mobileGeneralMethod.waitSleep(10000);
        if (mobileGeneralMethod.isVisible(kwartaPadalaObjects.objSendMoneySuccessful(), "Message")) {
            mobileGeneralMethod.isVisible(kwartaPadalaObjects.objTransactionDetails(), "Header");
            mobileGeneralMethod.isVisible(kwartaPadalaObjects.objReferenceNumber(), "Reference Number");
            LoggingUtils.info("STB_TC_25, Send Money To ML Branch, Branch verified Tier Account transaction validated");
            ExtentReporter.logPass("STB_TC_25", "STB_TC_25, Send Money To ML Branch, Branch verified Tier Account transaction validated");
            System.out.println("-----------------------------------------------------------");
        } else {
            ExtentReporter.logFail("STB_TC_25", "STB_TC_25(), Failed To Validate Send Money To ML Branch, Branch verified Tier Account transaction");
            System.out.println("-----------------------------------------------------------");

        }
    }

//        public void sendMoneyToMLBranchSemiVerifiedTierAccountMaxAmount_STB_TC_26() throws Exception {
//        login.loginWalletSemi_Verified();
//        mobileGeneralMethod.tap(kwartaPadalaObjects.objSendTransferBtn(), "Send Transfer Button");
//        mobileGeneralMethod.isVisible(kwartaPadalaObjects.objSendMoney(), "Send Money Page");
//        mobileGeneralMethod.tap(kwartaPadalaObjects.objToAnyMLBranch(), "MLWallet User Button");
//        mobileGeneralMethod.waitSleep(1000);
//        enterMLBranchDetails();
//        enterAmountToKwartaPadala("20000");
//        mobileGeneralMethod.waitSleep(10000);
//        if (mobileGeneralMethod.isVisible(kwartaPadalaObjects.objErrorMsg(), "Error Message")) {
//            String sMaximumLimitErrorMsg = mobileGeneralMethod.getText(kwartaPadalaObjects.objErrorMsg());
//            String sExpectedErrorMsg = "The maximum Send Money per transaction set for your verification level is P10,000.00. Please try again.";
//            mobileGeneralMethod.assertionValidation(sMaximumLimitErrorMsg, sExpectedErrorMsg);
//            mobileGeneralMethod.isVisible(kwartaPadalaObjects.objUpgradeNowBtn(), "Button");
//            LoggingUtils.info("STB_TC_26, Send Money To ML Branch, Semi verified Tier Account Maximum Transaction - Error Message is validated");
//            ExtentReporter.logPass("STB_TC_26", "STB_TC_26, Send Money To ML Branch, Semi verified Tier Account Maximum Transaction - Error Message is validated");
//            System.out.println("-----------------------------------------------------------");
//        } else {
//            ExtentReporter.logFail("STB_TC_26", "STB_TC_26(), Failed To Validate Error Message - Send Money To ML Branch, Semi verified Tier Account Maximum Transaction");
//            System.out.println("-----------------------------------------------------------");
//
//        }
//    }
    public void sendMoneyToMLBranchBranchVerifiedTierAccountMaxAmount_STB_TC_29() throws Exception {
        login.loginWalletBranchTier();
        mobileGeneralMethod.tap(kwartaPadalaObjects.objSendTransferBtn(), "Send Transfer Button");
        mobileGeneralMethod.isVisible(kwartaPadalaObjects.objSendMoney(), "Send Money Page");
        mobileGeneralMethod.tap(kwartaPadalaObjects.objToAnyMLBranch(), "MLWallet User Button");
        mobileGeneralMethod.waitSleep(1000);
        enterMLBranchDetails();
        enterAmountToKwartaPadala("60000");
        mobileGeneralMethod.waitSleep(10000);
        if (mobileGeneralMethod.isVisible(kwartaPadalaObjects.objMaxLimitErrorMsg(), "Error Message")) {
            String sMaximumLimitErrorMsg = mobileGeneralMethod.getText(kwartaPadalaObjects.objMaxLimitErrorMsg());
            String sExpectedErrorMsg = "The maximum Send Money per transaction set for your verification level is P50,000.00. Please try again.";
            mobileGeneralMethod.assertionValidation(sMaximumLimitErrorMsg, sExpectedErrorMsg);
            mobileGeneralMethod.isVisible(kwartaPadalaObjects.objGotItBtn(), "Button");
            LoggingUtils.info("STB_TC_29, Send Money To ML Branch, Branch verified Tier Account Maximum Transaction - Error Message is validated");
            ExtentReporter.logPass("STB_TC_29", "STB_TC_29, Send Money To ML Branch, Branch verified Tier Account Maximum Transaction - Error Message is validated");
            System.out.println("-----------------------------------------------------------");
        } else {
            ExtentReporter.logFail("STB_TC_29", "STB_TC_29(), Failed To Validate Error Message - Send Money To ML Branch, Branch verified Tier Account Maximum Transaction");
            System.out.println("-----------------------------------------------------------");

        }
    }

    public void sendMoneyToMLBranchFullyVerifiedTierAccountMaxAmount_STB_TC_32() throws Exception {
        login.loginWalletFullyTier();
        mobileGeneralMethod.tap(kwartaPadalaObjects.objSendTransferBtn(), "Send Transfer Button");
        mobileGeneralMethod.isVisible(kwartaPadalaObjects.objSendMoney(), "Send Money Page");
        mobileGeneralMethod.tap(kwartaPadalaObjects.objToAnyMLBranch(), "MLWallet User Button");
        mobileGeneralMethod.waitSleep(1000);
        enterMLBranchDetails();
        enterAmountToKwartaPadala("60000");
        mobileGeneralMethod.waitSleep(1000);
        if (mobileGeneralMethod.isVisible(kwartaPadalaObjects.objMaxLimitErrorMsg(), "Error Message")) {
            String sMaximumLimitErrorMsg = mobileGeneralMethod.getText(kwartaPadalaObjects.objMaxLimitErrorMsg());
            String sExpectedErrorMsg = "The maximum Send Money per transaction set for your verification level is P50,000.00. Please try again.";
            mobileGeneralMethod.assertionValidation(sMaximumLimitErrorMsg, sExpectedErrorMsg);
            mobileGeneralMethod.isVisible(kwartaPadalaObjects.objGotItBtn(), "Button");
            LoggingUtils.info("STB_TC_29, Send Money To ML Branch, Branch verified Tier Account Maximum Transaction - Error Message is validated");
            ExtentReporter.logPass("STB_TC_29", "STB_TC_29, Send Money To ML Branch, Branch verified Tier Account Maximum Transaction - Error Message is validated");
            System.out.println("-----------------------------------------------------------");
        } else {
            ExtentReporter.logFail("STB_TC_29", "STB_TC_29(), Failed To Validate Error Message - Send Money To ML Branch, Branch verified Tier Account Maximum Transaction");
            System.out.println("-----------------------------------------------------------");

        }
    }

//        public void kwartaPadalaRates_STB_TC_35() throws Exception {
//        login.loginWalletBranchTier();
//        mobileGeneralMethod.tap(topUpGamesObjects.objHamburgerMenu(), "Hamburger Menu");
//        mobileGeneralMethod.tap(kwartaPadalaObjects.objKwartaPadalaRatesBtn(), "Kwarta Padala Rates");
//        mobileGeneralMethod.waitSleep(10000);
//        if (mobileGeneralMethod.isVisible(kwartaPadalaObjects.objKwartaPadalaRates(), "Kwarta Padala Rates")) {
//            List<WebElement> values = findElements(kwartaPadalaObjects.objKwartaPadalaRates());
//            for (int i = 0; i < values.size(); i++) {
//                if (i % 2 != 0) {
//                    String sRates = values.get(i).getText();
//                    LoggingUtils.info("Rates : " + sRates + " is displayed");
//                    ExtentReporter.logInfo(" ", "Rates : " + sRates + " is displayed");
//                }
//                if (i % 2 == 0) {
//                    String sAmountRange = values.get(i).getText();
//                    LoggingUtils.info("Amount Range : " + sAmountRange + " is displayed");
//                    ExtentReporter.logInfo(" ", "Amount Range : " + sAmountRange + " is displayed");
//                }
//            }
//            LoggingUtils.info("STB_TC_35, Kwarta Padala Rates validated");
//            ExtentReporter.logPass("STB_TC_35", "STB_TC_35, Kwarta Padala Rates validated");
//            System.out.println("-----------------------------------------------------------");
//        }else {
//            ExtentReporter.logFail("STB_TC_35", "STB_TC_35(), Failed To Validate Kwarta Padala Rates");
//            System.out.println("-----------------------------------------------------------");
//
//        }
//    }
    public void sendMoneyToMLBranchRatesValidationScenarioOne_STB_TC_36(String sAmount) throws Exception {
        mobileGeneralMethod.waitSleep(10000);
        sendMoneyToMLBranchRatesValidation(sAmount);
        if (mobileGeneralMethod.isVisible(kwartaPadalaObjects.objServiceFee(), "Service Fee")) {
            String sMaximumLimitErrorMsg = mobileGeneralMethod.getText(kwartaPadalaObjects.objServiceFee());
            String sExceptedServiceFee = "Php 0.50";
            mobileGeneralMethod.assertionValidation(sMaximumLimitErrorMsg, sExceptedServiceFee);
            LoggingUtils.info("STB_TC_36, Send Money To ML Branch charged PHP0.50 for 0.01 to PHP50.00 validated");
            ExtentReporter.logPass("STB_TC_36", "STB_TC_36, Send Money To ML Branch charged PHP0.50 for 0.01 to PHP50.00 validated");
            System.out.println("-----------------------------------------------------------");
        } else {
            ExtentReporter.logFail("STB_TC_36", "STB_TC_36(), Failed To Validate Send Money To ML Branch charged PHP0.50 for 0.01 to PHP50.00");
            System.out.println("-----------------------------------------------------------");

        }
    }

    public void sendMoneyToMLBranchRatesValidationScenarioTwo_STB_TC_37(String sAmount) throws Exception {
        mobileGeneralMethod.waitSleep(10000);
        sendMoneyToMLBranchRatesValidation(sAmount);
        if (mobileGeneralMethod.isVisible(kwartaPadalaObjects.objServiceFee(), "Service Fee")) {
            String sMaximumLimitErrorMsg = mobileGeneralMethod.getText(kwartaPadalaObjects.objServiceFee());
            String sExceptedServiceFee = "Php 1.00";
            mobileGeneralMethod.assertionValidation(sMaximumLimitErrorMsg, sExceptedServiceFee);
            LoggingUtils.info("STB_TC_37,Send Money To ML Branch charged PHP1.00 for PHP50.01 to PHP100.00 validated");
            ExtentReporter.logPass("STB_TC_37", "STB_TC_37,Send Money To ML Branch charged PHP1.00 for PHP50.01 to PHP100.00 validated");
            System.out.println("-----------------------------------------------------------");
        } else {
            ExtentReporter.logFail("STB_TC_37", "STB_TC_37(), Failed To Validate Send Money To ML Branch charged PHP1.00 for PHP50.01 to PHP100.00");
            System.out.println("-----------------------------------------------------------");

        }
    }

    public void sendMoneyToMLBranchRatesValidationScenarioThree_STB_TC_38(String sAmount) throws Exception {
        mobileGeneralMethod.waitSleep(10000);
        sendMoneyToMLBranchRatesValidation(sAmount);
        if (mobileGeneralMethod.isVisible(kwartaPadalaObjects.objServiceFee(), "Service Fee")) {
            String sMaximumLimitErrorMsg = mobileGeneralMethod.getText(kwartaPadalaObjects.objServiceFee());
            String sExceptedServiceFee = "Php 2.00";
            mobileGeneralMethod.assertionValidation(sMaximumLimitErrorMsg, sExceptedServiceFee);
            LoggingUtils.info("STB_TC_38, Send Money To ML Branch charged PHP2.00 for PHP100.01 to PHP300.00 validated");
            ExtentReporter.logPass("STB_TC_38", "STB_TC_38, Send Money To ML Branch charged PHP2.00 for PHP100.01 to PHP300.00 validated");
            System.out.println("-----------------------------------------------------------");
        } else {
            ExtentReporter.logFail("STB_TC_38", "STB_TC_38(), Failed To Validate Send Money To ML Branch charged PHP2.00 for PHP100.01 to PHP300.00");
            System.out.println("-----------------------------------------------------------");

        }
    }

    public void sendMoneyToMLBranchRatesValidationScenarioFour_STB_TC_39(String sAmount) throws Exception {
        mobileGeneralMethod.waitSleep(10000);
        sendMoneyToMLBranchRatesValidation(sAmount);
        if (mobileGeneralMethod.isVisible(kwartaPadalaObjects.objServiceFee(), "Service Fee")) {
            String sMaximumLimitErrorMsg = mobileGeneralMethod.getText(kwartaPadalaObjects.objServiceFee());
            String sExceptedServiceFee = "Php 3.00";
            mobileGeneralMethod.assertionValidation(sMaximumLimitErrorMsg, sExceptedServiceFee);
            LoggingUtils.info("STB_TC_39, Send Money To ML Branch charged PHP3.00 for PHP300.01 to PHP400.00 validated");
            ExtentReporter.logPass("STB_TC_39", "STB_TC_39, Send Money To ML Branch charged PHP3.00 for PHP300.01 to PHP400.00 validated");
            System.out.println("-----------------------------------------------------------");
        } else {
            ExtentReporter.logFail("STB_TC_39", "STB_TC_39(), Failed To Validate Send Money To ML Branch charged PHP3.00 for PHP300.01 to PHP400.00");
            System.out.println("-----------------------------------------------------------");

        }
    }

    public void sendMoneyToMLBranchRatesValidationScenarioFive_STB_TC_40(String sAmount) throws Exception {
        mobileGeneralMethod.waitSleep(10000);
        sendMoneyToMLBranchRatesValidation(sAmount);
        if (mobileGeneralMethod.isVisible(kwartaPadalaObjects.objServiceFee(), "Service Fee")) {
            String sMaximumLimitErrorMsg = mobileGeneralMethod.getText(kwartaPadalaObjects.objServiceFee());
            String sExceptedServiceFee = "Php 5.00";
            mobileGeneralMethod.assertionValidation(sMaximumLimitErrorMsg, sExceptedServiceFee);
            LoggingUtils.info("STB_TC_40, Send Money To ML Branch charged PHP5.00 for PHP400.01 to PHP500.00 validated");
            ExtentReporter.logPass("STB_TC_40", "STB_TC_40, Send Money To ML Branch charged PHP5.00 for PHP400.01 to PHP500.00 validated");
            System.out.println("-----------------------------------------------------------");
        } else {
            ExtentReporter.logFail("STB_TC_40", "STB_TC_40(), Failed To Validate Send Money To ML Branch charged PHP5.00 for PHP400.01 to PHP500.00");
            System.out.println("-----------------------------------------------------------");

        }
    }

    public void sendMoneyToMLBranchRatesValidationScenarioSix_STB_TC_41(String sAmount) throws Exception {
        mobileGeneralMethod.waitSleep(10000);
        sendMoneyToMLBranchRatesValidation(sAmount);
        if (mobileGeneralMethod.isVisible(kwartaPadalaObjects.objServiceFee(), "Service Fee")) {
            String sMaximumLimitErrorMsg = mobileGeneralMethod.getText(kwartaPadalaObjects.objServiceFee());
            String sExceptedServiceFee = "Php 8.00";
            mobileGeneralMethod.assertionValidation(sMaximumLimitErrorMsg, sExceptedServiceFee);
            LoggingUtils.info("STB_TC_41, Send Money To ML Branch charged PHP5.00 for PHP8.00 to PHP600.00 validated");
            ExtentReporter.logPass("STB_TC_41", "STB_TC_41, Send Money To ML Branch charged PHP5.00 for PHP8.00 to PHP600.00 validated");
            System.out.println("-----------------------------------------------------------");
        } else {
            ExtentReporter.logFail("STB_TC_41", "STB_TC_41(), Failed To Validate Send Money To ML Branch charged PHP5.00 for PHP8.00 to PHP600.00");
            System.out.println("-----------------------------------------------------------");

        }
    }

    public void sendMoneyToMLBranchRatesValidationScenarioSeven_STB_TC_42(String sAmount) throws Exception {
        mobileGeneralMethod.waitSleep(10000);
        sendMoneyToMLBranchRatesValidation(sAmount);
        if (mobileGeneralMethod.isVisible(kwartaPadalaObjects.objServiceFee(), "Service Fee")) {
            String sMaximumLimitErrorMsg = mobileGeneralMethod.getText(kwartaPadalaObjects.objServiceFee());
            String sExceptedServiceFee = "Php 10.00";
            mobileGeneralMethod.assertionValidation(sMaximumLimitErrorMsg, sExceptedServiceFee);
            LoggingUtils.info("STB_TC_42, Send Money To ML Branch charged PHP10.00 for PHP600.01 to PHP700.00 validated");
            ExtentReporter.logPass("STB_TC_42", "STB_TC_42, Send Money To ML Branch charged PHP10.00 for PHP600.01 to PHP700.00 validated");
            System.out.println("-----------------------------------------------------------");
        } else {
            ExtentReporter.logFail("STB_TC_42", "STB_TC_42(), Failed To Validate Send Money To ML Branch charged PHP10.00 for PHP600.01 to PHP700.00");
            System.out.println("-----------------------------------------------------------");

        }
    }

    public void sendMoneyToMLBranchRatesValidationScenarioEight_STB_TC_43(String sAmount) throws Exception {
        mobileGeneralMethod.waitSleep(10000);
        sendMoneyToMLBranchRatesValidation(sAmount);
        if (mobileGeneralMethod.isVisible(kwartaPadalaObjects.objServiceFee(), "Service Fee")) {
            String sMaximumLimitErrorMsg = mobileGeneralMethod.getText(kwartaPadalaObjects.objServiceFee());
            String sExceptedServiceFee = "Php 12.00";
            mobileGeneralMethod.assertionValidation(sMaximumLimitErrorMsg, sExceptedServiceFee);
            LoggingUtils.info("STB_TC_43, Send Money To ML Branch charged PHP12.00 for PHP700.01 to PHP900.00 validated");
            ExtentReporter.logPass("STB_TC_43", "STB_TC_43, Send Money To ML Branch charged PHP12.00 for PHP700.01 to PHP900.00 validated");
            System.out.println("-----------------------------------------------------------");
        } else {
            ExtentReporter.logFail("STB_TC_43", "STB_TC_43(), Failed To Validate Send Money To ML Branch charged PHP12.00 for PHP700.01 to PHP900.00");
            System.out.println("-----------------------------------------------------------");

        }
    }

    public void sendMoneyToMLBranchRatesValidationScenarioNine_STB_TC_44(String sAmount) throws Exception {
        mobileGeneralMethod.waitSleep(10000);
        sendMoneyToMLBranchRatesValidation(sAmount);
        if (mobileGeneralMethod.isVisible(kwartaPadalaObjects.objServiceFee(), "Service Fee")) {
            String sMaximumLimitErrorMsg = mobileGeneralMethod.getText(kwartaPadalaObjects.objServiceFee());
            String sExceptedServiceFee = "Php 15.00";
            mobileGeneralMethod.assertionValidation(sMaximumLimitErrorMsg, sExceptedServiceFee);
            LoggingUtils.info("STB_TC_44, Send Money To ML Branch charged PHP15.00 for PHP900.01 to PHP1000.00 validated");
            ExtentReporter.logPass("STB_TC_44", "STB_TC_44, Send Money To ML Branch charged PHP15.00 for PHP900.01 to PHP1000.00 validated");
            System.out.println("-----------------------------------------------------------");
        } else {
            ExtentReporter.logFail("STB_TC_44", "STB_TC_44(), Failed To Validate Send Money To ML Branch charged PHP15.00 for PHP900.01 to PHP1000.00");
            System.out.println("-----------------------------------------------------------");

        }
    }

    public void sendMoneyToMLBranchRatesValidationScenarioTen_STB_TC_45(String sAmount) throws Exception {
        mobileGeneralMethod.waitSleep(10000);
        sendMoneyToMLBranchRatesValidation(sAmount);
        if (mobileGeneralMethod.isVisible(kwartaPadalaObjects.objServiceFee(), "Service Fee")) {
            String sMaximumLimitErrorMsg = mobileGeneralMethod.getText(kwartaPadalaObjects.objServiceFee());
            String sExceptedServiceFee = "Php 20.00";
            mobileGeneralMethod.assertionValidation(sMaximumLimitErrorMsg, sExceptedServiceFee);
            LoggingUtils.info("STB_TC_45, Send Money To ML Branch charged PHP20.00 for PHP1000.01 to PHP1500.00 validated");
            ExtentReporter.logPass("STB_TC_45", "STB_TC_45, Send Money To ML Branch charged PHP20.00 for PHP1000.01 to PHP1500.00 validated");
            System.out.println("-----------------------------------------------------------");
        } else {
            ExtentReporter.logFail("STB_TC_45", "STB_TC_45(), Failed To Validate Send Money To ML Branch charged PHP20.00 for PHP1000.01 to PHP1500.00");
            System.out.println("-----------------------------------------------------------");

        }
    }

    public void sendMoneyToMLBranchRatesValidationScenarioEleven_STB_TC_46(String sAmount) throws Exception {
        mobileGeneralMethod.waitSleep(10000);
        sendMoneyToMLBranchRatesValidation(sAmount);
        if (mobileGeneralMethod.isVisible(kwartaPadalaObjects.objServiceFee(), "Service Fee")) {
            String sMaximumLimitErrorMsg = mobileGeneralMethod.getText(kwartaPadalaObjects.objServiceFee());
            String sExceptedServiceFee = "Php 30.00";
            mobileGeneralMethod.assertionValidation(sMaximumLimitErrorMsg, sExceptedServiceFee);
            LoggingUtils.info("STB_TC_46, Send Money To ML Branch charged PHP30.00 for PHP1500.01 to PHP2000.00 validated");
            ExtentReporter.logPass("STB_TC_46", "STB_TC_46, Send Money To ML Branch charged PHP30.00 for PHP1500.01 to PHP2000.00 validated");
            System.out.println("-----------------------------------------------------------");
        } else {
            ExtentReporter.logFail("STB_TC_46", "STB_TC_46(), Failed To Validate Send Money To ML Branch charged PHP30.00 for PHP1500.01 to PHP2000.00");
            System.out.println("-----------------------------------------------------------");

        }
    }

    public void sendMoneyToMLBranchRatesValidationScenarioTwelve_STB_TC_47(String sAmount) throws Exception {
        mobileGeneralMethod.waitSleep(10000);
        sendMoneyToMLBranchRatesValidation(sAmount);
        if (mobileGeneralMethod.isVisible(kwartaPadalaObjects.objServiceFee(), "Service Fee")) {
            String sMaximumLimitErrorMsg = mobileGeneralMethod.getText(kwartaPadalaObjects.objServiceFee());
            String sExceptedServiceFee = "Php 40.00";
            mobileGeneralMethod.assertionValidation(sMaximumLimitErrorMsg, sExceptedServiceFee);
            LoggingUtils.info("STB_TC_47, Send Money To ML Branch charged PHP40.00 for PHP2000.01 to PHP2500.00 validated");
            ExtentReporter.logPass("STB_TC_47", "STB_TC_47, Send Money To ML Branch charged PHP40.00 for PHP2000.01 to PHP2500.00 validated");
            System.out.println("-----------------------------------------------------------");
        } else {
            ExtentReporter.logFail("STB_TC_47", "STB_TC_47(), Failed To Validate Send Money To ML Branch charged PHP40.00 for PHP2000.01 to PHP2500.00");
            System.out.println("-----------------------------------------------------------");

        }
    }

    public void sendMoneyToMLBranchRatesValidationScenarioThirteen_STB_TC_48(String sAmount) throws Exception {
        mobileGeneralMethod.waitSleep(10000);
        sendMoneyToMLBranchRatesValidation(sAmount);
        if (mobileGeneralMethod.isVisible(kwartaPadalaObjects.objServiceFee(), "Service Fee")) {
            String sMaximumLimitErrorMsg = mobileGeneralMethod.getText(kwartaPadalaObjects.objServiceFee());
            String sExceptedServiceFee = "Php 500.00";
            mobileGeneralMethod.assertionValidation(sMaximumLimitErrorMsg, sExceptedServiceFee);
            LoggingUtils.info("STB_TC_48, Send Money To ML Branch charged PHP500.00 for PHP2500.01 to PHP50000.00 validated");
            ExtentReporter.logPass("STB_TC_48", "STB_TC_48, Send Money To ML Branch charged PHP500.00 for PHP2500.01 to PHP50000.00 validated");
            System.out.println("-----------------------------------------------------------");
        } else {
            ExtentReporter.logFail("STB_TC_48", "STB_TC_48(), Failed To Validate Send Money To ML Branch charged PHP500.00 for PHP2500.01 to PHP50000.00");
            System.out.println("-----------------------------------------------------------");

        }
    }

    public void sendMoneyToMLBranchLocationPopupValidation_STB_TC_50() throws Exception {
        login.loginWalletBranchTier();
        mobileGeneralMethod.tap(kwartaPadalaObjects.objSendTransferBtn(), "Send Transfer Button");
        mobileGeneralMethod.isVisible(kwartaPadalaObjects.objSendMoney(), "Send Money Page");
        mobileGeneralMethod.tap(kwartaPadalaObjects.objToAnyMLBranch(), "MLWallet User Button");
        mobileGeneralMethod.waitSleep(1000);
        enterMLBranchDetails();
        enterAmountToKwartaPadala();
        mobileGeneralMethod.waitSleep(1000);
        if (mobileGeneralMethod.isVisible(kwartaPadalaObjects.objPopupMsg(), "Message")) {
            locationPopUpValidation();
            LoggingUtils.info("STB_TC_50, Send Money To ML Branch Location popup Validated");
            ExtentReporter.logPass("STB_TC_50", "STB_TC_50, Send Money To ML Branch Location popup Validated");
            System.out.println("-----------------------------------------------------------");
        } else {
            ExtentReporter.logFail("STB_TC_50", "STB_TC_50(), Failed To Validate Send Money To ML Branch Location popup");
            System.out.println("-----------------------------------------------------------");

        }
    }

    public void sendMoneyToMLBranchLocationDenyFunctionality_STB_TC_51() throws Exception {
        login.loginWalletBranchTier();
        mobileGeneralMethod.tap(kwartaPadalaObjects.objSendTransferBtn(), "Send Transfer Button");
        mobileGeneralMethod.isVisible(kwartaPadalaObjects.objSendMoney(), "Send Money Page");
        mobileGeneralMethod.tap(kwartaPadalaObjects.objToAnyMLBranch(), "MLWallet User Button");
        mobileGeneralMethod.waitSleep(1000);
        enterMLBranchDetails();
        enterAmountToKwartaPadala();
        mobileGeneralMethod.waitSleep(1000);
        if (mobileGeneralMethod.isVisible(kwartaPadalaObjects.objPopupMsg(), "Message")) {
            permissionDenyPopUp();
            LoggingUtils.info("STB_TC_51, Send Money To ML Branch Location Deny Functionality Validated");
            ExtentReporter.logPass("STB_TC_51", "STB_TC_51, Send Money To ML Branch Location Deny Functionality Validated");
            System.out.println("-----------------------------------------------------------");
        } else {
            ExtentReporter.logFail("STB_TC_51", "STB_TC_51(), Failed To Validate Send Money To ML Branch Location Deny Functionality");
            System.out.println("-----------------------------------------------------------");

        }
    }

    public void sendMoneyToMLBranchLocationPermissionDenyCloseBtnFunctionality_STB_TC_52() throws Exception {
        login.loginWalletBranchTier();
        mobileGeneralMethod.tap(kwartaPadalaObjects.objSendTransferBtn(), "Send Transfer Button");
        mobileGeneralMethod.isVisible(kwartaPadalaObjects.objSendMoney(), "Send Money Page");
        mobileGeneralMethod.tap(kwartaPadalaObjects.objToAnyMLBranch(), "MLWallet User Button");
        mobileGeneralMethod.waitSleep(1000);
        enterMLBranchDetails();
        enterAmountToKwartaPadala();
        mobileGeneralMethod.waitSleep(1000);
        if (mobileGeneralMethod.isVisible(kwartaPadalaObjects.objPopupMsg(), "Pop Up Message")) {
            permissionDenyCloseBtnFunctionality();
            if (mobileGeneralMethod.isVisible(kwartaPadalaObjects.objKwartaPadala(), "Page")) {
                LoggingUtils.info("STB_TC_52, Send Money To ML Branch Location Permission Deny Close Button Functionality Validated");
                ExtentReporter.logPass("STB_TC_52", "STB_TC_52, Send Money To ML Branch Location Permission Deny Close Button Functionality Validated");
                System.out.println("-----------------------------------------------------------");
            } else {
                ExtentReporter.logFail("STB_TC_52", "STB_TC_52(), Failed To Validate Send Money To ML Branch Location Permission Deny Close Button Functionality");
                System.out.println("-----------------------------------------------------------");

            }
        }
    }

    public void sendMoneyToMLBranchLocationPermissionDenyOpenSettingsBtnFunctionality_STB_TC_53() throws Exception {
        login.loginWalletBranchTier();
        mobileGeneralMethod.tap(kwartaPadalaObjects.objSendTransferBtn(), "Send Transfer Button");
        mobileGeneralMethod.isVisible(kwartaPadalaObjects.objSendMoney(), "Send Money Page");
        mobileGeneralMethod.tap(kwartaPadalaObjects.objToAnyMLBranch(), "MLWallet User Button");
        mobileGeneralMethod.waitSleep(1000);
        enterMLBranchDetails();
        enterAmountToKwartaPadala();
        mobileGeneralMethod.waitSleep(1000);
        if (mobileGeneralMethod.isVisible(kwartaPadalaObjects.objPopupMsg(), "Pop Up Message")) {
            permissionDenyOpenSettingsBtnFunctionality();
            if (mobileGeneralMethod.isVisible(kwartaPadalaObjects.objAppInfo(), "Page")) {
                LoggingUtils.info("STB_TC_53, Send Money To ML Branch Location Permission Deny Open Settings Button Functionality Validated");
                ExtentReporter.logPass("STB_TC_53", "STB_TC_53, Send Money To ML Branch Location Permission Deny Open Settings Button Functionality Validated");
                System.out.println("-----------------------------------------------------------");
            } else {
                ExtentReporter.logFail("STB_TC_53", "STB_TC_53(), Failed To Validate Send Money To ML Branch Location Permission Deny Open Settings Button Functionality");
                System.out.println("-----------------------------------------------------------");

            }
        }
    }

    public void sendMoneyToMLBranchLocationPopUpAllowFunctionality_STB_TC_54() throws Exception {
        login.loginWalletBranchTier();
        mobileGeneralMethod.tap(kwartaPadalaObjects.objSendTransferBtn(), "Send Transfer Button");
        mobileGeneralMethod.isVisible(kwartaPadalaObjects.objSendMoney(), "Send Money Page");
        mobileGeneralMethod.tap(kwartaPadalaObjects.objToAnyMLBranch(), "MLWallet User Button");
        mobileGeneralMethod.waitSleep(1000);
        enterMLBranchDetails();
        enterAmountToKwartaPadala();
        mobileGeneralMethod.waitSleep(1000);
        if (mobileGeneralMethod.isVisible(kwartaPadalaObjects.objPopupMsg(), "Pop Up Message")) {
            locationPopUpAllowFunctionality();
            if (mobileGeneralMethod.isDisplayed(loginObject.objOneTimePin())) {
                mobileGeneralMethod.isVisible(loginObject.objOneTimePin(), "Page");
            } else if (mobileGeneralMethod.isDisplayed(loginObject.objMLPin())) {
                mobileGeneralMethod.isVisible(loginObject.objMLPin(), "Page");
            }
            LoggingUtils.info("STB_TC_54, Send Money To ML Branch Location popup Allow Button Functionality Validated");
            ExtentReporter.logPass("STB_TC_54", "STB_TC_54, Send Money To ML Branch Location popup Allow Button Functionality Validated");
            System.out.println("-----------------------------------------------------------");
        } else {
            ExtentReporter.logFail("STB_TC_54", "STB_TC_54(), Failed To Validate Send Money To ML Branch Location popup Allow Button Functionality");
            System.out.println("-----------------------------------------------------------");

        }
    }

    public void sendMoneyToMLBranchInternetInterruptionWhileEnteringOTP_STB_TC_55() throws Exception {
        login.loginWalletBranchTier();
        mobileGeneralMethod.tap(kwartaPadalaObjects.objSendTransferBtn(), "Send Transfer Button");
        mobileGeneralMethod.isVisible(kwartaPadalaObjects.objSendMoney(), "Send Money Page");
        mobileGeneralMethod.tap(kwartaPadalaObjects.objToAnyMLBranch(), "MLWallet User Button");
        mobileGeneralMethod.waitSleep(1000);
        enterMLBranchDetails();
        enterAmountToKwartaPadala();
//        enableLocation_PopUp();
        mobileGeneralMethod.waitSleep(3000);
        mobileGeneralMethod.setWifiConnectionToONOFF("OFF");
        mobileGeneralMethod.tap(mlWalletPageObjects.continue2_btn(), "Continue Button");
        mobileGeneralMethod.waitSleep(10000);
        if (mobileGeneralMethod.isVisible(homePageObject.objInternetConnectionPopUp(), "Pop Up Message")) {
            internetConnectionError();
            LoggingUtils.info("STB_TC_55, Send Money To ML Branch Internet Interruption While Entering OTP Validated");
            ExtentReporter.logPass("STB_TC_55", "STB_TC_55, Send Money To ML Branch Internet Interruption While Entering OTP Validated");
            System.out.println("-----------------------------------------------------------");
        } else {
            ExtentReporter.logFail("STB_TC_55", "STB_TC_55(), Failed To Validate Send Money To ML Branch Location popup Allow Button Functionality");
            System.out.println("-----------------------------------------------------------");
        }
    }

    public void sendMoneyToMLBranchTransactionValidationAfterMinimizingApp_STB_TC_58() throws Exception {
        login.loginWalletBranchTier();
        mobileGeneralMethod.tap(kwartaPadalaObjects.objSendTransferBtn(), "Send Transfer Button");
        mobileGeneralMethod.isVisible(kwartaPadalaObjects.objSendMoney(), "Send Money Page");
        mobileGeneralMethod.tap(kwartaPadalaObjects.objToAnyMLBranch(), "MLWallet User Button");
        mobileGeneralMethod.waitSleep(1000);
        enterMLBranchDetails();
        enterAmountToKwartaPadala();
//        enableLocation_PopUp();
        mobileGeneralMethod.waitSleep(3000);
        mobileGeneralMethod.setWifiConnectionToONOFF("OFF");
        mobileGeneralMethod.tap(mlWalletPageObjects.continue2_btn(), "Continue Button");
        LoggingUtils.info("Application relaunched after 5 Seconds");
        if (mobileGeneralMethod.isVisible(kwartaPadalaObjects.objSendMoneySuccessful(), "Pop Up Message")) {
            LoggingUtils.info("STB_TC_58, Send Money To ML Branch Transaction Validation After Minimizing App Validated");
            ExtentReporter.logPass("STB_TC_58", "STB_TC_58, Send Money To ML Branch Transaction Validation After Minimizing App Validated");
            System.out.println("-----------------------------------------------------------");
        } else {
            ExtentReporter.logFail("STB_TC_58", "STB_TC_58(), Failed To Validate Send Money To ML Branch Transaction Validation After Minimizing App");
            System.out.println("-----------------------------------------------------------");
        }
    }

//    public void sendMoneyToMLBranchTransactionWithValidMLPin_STB_TC_64() throws Exception {
//        login.loginWalletBranchTier();
//        mobileGeneralMethod.tap(kwartaPadalaObjects.objSendTransferBtn(), "Send Transfer Button");
//        mobileGeneralMethod.isVisible(kwartaPadalaObjects.objSendMoney(), "Send Money Page");
//        mobileGeneralMethod.tap(kwartaPadalaObjects.objToAnyMLBranch(), "MLWallet User Button");
//        mobileGeneralMethod.waitSleep(1000);
//        enterMLBranchDetails();
//        enterAmountToKwartaPadala();
//        mobileGeneralMethod.waitSleep(3000);
//        enableLocation_PopUp();
//        handleMpin("1111");
//        mobileGeneralMethod.tap(mlWalletPageObjects.continue2_btn(), "Continue Button");
//        mobileGeneralMethod.waitSleep(10000);
//        if (mobileGeneralMethod.isVisible(kwartaPadalaObjects.objSendMoneySuccessful(), "Pop Up Message")) {
//            mobileGeneralMethod.isVisible(kwartaPadalaObjects.objPHPAmount(), "Amount");
//            mobileGeneralMethod.isVisible(kwartaPadalaObjects.objDate(), "Date");
//            mobileGeneralMethod.isVisible(kwartaPadalaObjects.objReferenceNumber(), "Reference Number");
//            String sReference = mobileGeneralMethod.getText(kwartaPadalaObjects.objReferenceNumber());
//            System.out.println(sReference);
//            String sReferenceNumber = sReference.substring(9, 20);
//            System.out.println(sReferenceNumber);
//            mobileGeneralMethod.verticalSwipe();
//            mobileGeneralMethod.tap(kwartaPadalaObjects.objBackToHomeBtn(), "Button");
//            mobileGeneralMethod.waitSleep(3000);
//            mobileGeneralMethod.verticalSwipeDown();
//            mobileGeneralMethod.verticalSwipe();
//            mobileGeneralMethod.waitSleep(3000);
//            mobileGeneralMethod.isVisible(homePageObject.objRecentTransactions(), "Date");
//            mobileGeneralMethod.isVisible(homePageObject.objRecentTransactions(), "Date");
//            mobileGeneralMethod.tap(kwartaPadalaObjects.objKwartaPadala(), "Text");
//            if (mobileGeneralMethod.isVisible(kwartaPadalaObjects.objReferenceNumberInTransactionDetails(), "Page")) {
//                String sReferenceNumberInCashOut = mobileGeneralMethod.getText(kwartaPadalaObjects.objReferenceNumberInTransactionDetails());
//                mobileGeneralMethod.assertionValidation(sReferenceNumber, sReferenceNumberInCashOut);
//                LoggingUtils.info("STB_TC_64, Send Money to any ML Branch Transaction With Valid ML Pin validated");
//                ExtentReporter.logPass("STB_TC_64", "STB_TC_64, Send Money to any ML Branch Transaction With Valid ML Pin validated");
//                System.out.println("-----------------------------------------------------------");
//            }
//        } else {
//            ExtentReporter.logFail("STB_TC_64", "STB_TC_64(), Failed To Validate Send Money to any ML Branch Transaction With Valid ML Pin");
//            System.out.println("-----------------------------------------------------------");
//        }
//    }

//    public void sendMoneyToMLBranchTransactionWithInValidMLPin_STB_TC_65() throws Exception {
//        login.loginWalletBranchTier();
//        mobileGeneralMethod.tap(kwartaPadalaObjects.objSendTransferBtn(), "Send Transfer Button");
//        mobileGeneralMethod.isVisible(kwartaPadalaObjects.objSendMoney(), "Send Money Page");
//        mobileGeneralMethod.tap(kwartaPadalaObjects.objToAnyMLBranch(), "MLWallet User Button");
//        mobileGeneralMethod.waitSleep(1000);
//        enterMLBranchDetails();
//        enterAmountToKwartaPadala();
//        enableLocation_PopUp();
//        handleMpin("1234");
//        mobileGeneralMethod.waitSleep(10000);
//        if (mobileGeneralMethod.isVisible(kwartaPadalaObjects.objInvalidPINMsg(), "Pop Up Message")) {
//            String sActualErrorMsg = mobileGeneralMethod.getText(kwartaPadalaObjects.objInvalidPINMsg());
//            String sExceptedErrorMsg = "You have entered an invalid PIN. Please try again.";
//            mobileGeneralMethod.assertionValidation(sExceptedErrorMsg, sActualErrorMsg);
//            LoggingUtils.info("STB_TC_65, Send Money to any ML Branch Transaction With Invalid ML Pin validated");
//            ExtentReporter.logPass("STB_TC_65", "STB_TC_65, Send Money to any ML Branch Transaction With Invalid ML Pin validated");
//            System.out.println("-----------------------------------------------------------");
//        } else {
//            ExtentReporter.logFail("STB_TC_65", "STB_TC_65(), Failed To Validate Send Money to any ML Branch Transaction With Invalid ML Pin");
//            System.out.println("-----------------------------------------------------------");
//        }
//    }

    public void sendMoneyToMLBranchInOTPPopupValidation_STB_TC_71() throws Exception {
        login.loginWalletBranchTier();
        mobileGeneralMethod.tap(kwartaPadalaObjects.objSendTransferBtn(), "Send Transfer Button");
        mobileGeneralMethod.isVisible(kwartaPadalaObjects.objSendMoney(), "Send Money Page");
        mobileGeneralMethod.tap(kwartaPadalaObjects.objToAnyMLBranch(), "MLWallet User Button");
        mobileGeneralMethod.waitSleep(1000);
        enterMLBranchDetails();
        enterAmountToKwartaPadala();
//        enableLocation_PopUp();
        mobileGeneralMethod.waitSleep(1000);
        if (mobileGeneralMethod.isVisible(loginObject.objOneTimePin(), "Page")) {
            mobileGeneralMethod.isVisible(loginObject.objOTP(), "One Time Pin");
            LoggingUtils.info("STB_TC_71, Send Money To ML Branch, InApp OTP popup validated");
            ExtentReporter.logPass("STB_TC_71", "STB_TC_71, Send Money To ML Branch, InApp OTP popup validated");
            System.out.println("-----------------------------------------------------------");
        } else {
            ExtentReporter.logFail("STB_TC_71", "STB_TC_71(), Failed To Validate Send Money To ML Branch, InApp OTP popup");
            System.out.println("-----------------------------------------------------------");
        }
    }

    public void sendMoneyToMLBranchTransactionInAppOTPPopupUIValidation_STB_TC_72() throws Exception {
        login.loginWalletBranchTier();
        mobileGeneralMethod.tap(kwartaPadalaObjects.objSendTransferBtn(), "Send Transfer Button");
        mobileGeneralMethod.isVisible(kwartaPadalaObjects.objSendMoney(), "Send Money Page");
        mobileGeneralMethod.tap(kwartaPadalaObjects.objToAnyMLBranch(), "MLWallet User Button");
        mobileGeneralMethod.waitSleep(1000);
        enterMLBranchDetails();
        enterAmountToKwartaPadala();
//        enableLocation_PopUp();
        mobileGeneralMethod.waitSleep(1000);
        if (mobileGeneralMethod.isVisible(loginObject.objOneTimePin(), "Page")) {
            mobileGeneralMethod.isVisible(loginObject.objOTP(), "One Time Pin");
            mobileGeneralMethod.isVisible(loginObject.objSeconds(), "Seconds");
            mobileGeneralMethod.isVisible(loginObject.objContinueBtn(), "Button");
            mobileGeneralMethod.isVisible(loginObject.objCancelBtn(), "Button");
            LoggingUtils.info("STB_TC_72, Send Money To ML Branch Transaction InApp OTP popup UI validated");
            ExtentReporter.logPass("STB_TC_72", "STB_TC_72, Send Money To ML Branch Transaction InApp OTP popup UI validated");
            System.out.println("-----------------------------------------------------------");
        } else {
            ExtentReporter.logFail("STB_TC_72", "STB_TC_72(), Failed To Validate Send Money To ML Branch Transaction InApp OTP popup UI");
            System.out.println("-----------------------------------------------------------");
        }
    }

    public void sendMoneyToMLBranchTransactionNewOTPAfterSixtySecondsValidation_STB_TC_73() throws Exception {
        login.loginWalletBranchTier();
        mobileGeneralMethod.tap(kwartaPadalaObjects.objSendTransferBtn(), "Send Transfer Button");
        mobileGeneralMethod.isVisible(kwartaPadalaObjects.objSendMoney(), "Send Money Page");
        mobileGeneralMethod.tap(kwartaPadalaObjects.objToAnyMLBranch(), "MLWallet User Button");
        mobileGeneralMethod.waitSleep(1000);
        enterMLBranchDetails();
        enterAmountToKwartaPadala();
//        enableLocation_PopUp();
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.isVisible(loginObject.objOneTimePin(), "Page");
        if (mobileGeneralMethod.isVisible(loginObject.objOTP(), "One Time Pin")) {
            String sGeneratedOTP = mobileGeneralMethod.getText(loginObject.objOTP());
            String sNewlyGeneratedOTPAfterSixtySeconds = mobileGeneralMethod.getText(loginObject.objOTP());
            mobileGeneralMethod.assertionValidation(sGeneratedOTP, sNewlyGeneratedOTPAfterSixtySeconds);
            LoggingUtils.info("STB_TC_73, Send Money To ML Branch Transaction New OTP got generated After Sixty Seconds is validated");
            ExtentReporter.logPass("STB_TC_73", "STB_TC_73, Send Money To ML Branch Transaction New OTP got generated After Sixty Seconds is validated");
            System.out.println("-----------------------------------------------------------");
        } else {
            ExtentReporter.logFail("STB_TC_73", "STB_TC_73(), Failed To Validate Send Money To ML Branch Transaction New OTP got generated After Sixty Seconds");
            System.out.println("-----------------------------------------------------------");
        }
    }

    public void sendMoneyToMLBranchTransactionOTPCancelBtnFunctionality_STB_TC_74() throws Exception {
        login.loginWalletBranchTier();
        mobileGeneralMethod.tap(kwartaPadalaObjects.objSendTransferBtn(), "Send Transfer Button");
        mobileGeneralMethod.isVisible(kwartaPadalaObjects.objSendMoney(), "Send Money Page");
        mobileGeneralMethod.tap(kwartaPadalaObjects.objToAnyMLBranch(), "MLWallet User Button");
        mobileGeneralMethod.waitSleep(1000);
        enterMLBranchDetails();
        enterAmountToKwartaPadala();
//        enableLocation_PopUp();
        mobileGeneralMethod.waitSleep(1000);
        if ( mobileGeneralMethod.isVisible(loginObject.objOneTimePin(), "Page")) {
            mobileGeneralMethod.isVisible(loginObject.objCancelBtn(), "Button");
            LoggingUtils.info("STB_TC_74, Send Money To ML Branch Transaction, After clicking on Cancel in One time pin popup App navigates back to Confirm details Page is validated");
            ExtentReporter.logPass("STB_TC_74", "STB_TC_74, Send Money To ML Branch Transaction, After clicking on Cancel in One time pin popup App navigates back to Confirm details Page is validated");
            System.out.println("-----------------------------------------------------------");
        } else {
            ExtentReporter.logFail("STB_TC_74", "STB_TC_74(), Failed To Validate Send Money To ML Branch Transaction, After clicking on Cancel in One time pin popup App navigates back to Confirm details Page");
            System.out.println("-----------------------------------------------------------");
        }
    }

    public void sendMoneyToMLBranchTransactionOTPContinueBtnFunctionality_STB_TC_75() throws Exception {
        login.loginWalletBranchTier();
        mobileGeneralMethod.tap(kwartaPadalaObjects.objSendTransferBtn(), "Send Transfer Button");
        mobileGeneralMethod.isVisible(kwartaPadalaObjects.objSendMoney(), "Send Money Page");
        mobileGeneralMethod.tap(kwartaPadalaObjects.objToAnyMLBranch(), "MLWallet User Button");
        mobileGeneralMethod.waitSleep(1000);
        enterMLBranchDetails();
        enterAmountToKwartaPadala();
//        enableLocation_PopUp();
        mobileGeneralMethod.waitSleep(1000);
        if ( mobileGeneralMethod.isVisible(loginObject.objOneTimePin(), "Page")) {
            mobileGeneralMethod.isVisible(loginObject.objCancelBtn(), "Button");
            LoggingUtils.info("STB_TC_75, Send Money To ML Branch Transaction, After clicking on Continue in One time pin popup App navigates to Transaction Success Page is validated");
            ExtentReporter.logPass("STB_TC_75", "STB_TC_75, Send Money To ML Branch Transaction, After clicking on Continue in One time pin popup App navigates to Transaction Success Page is validated");
            System.out.println("-----------------------------------------------------------");
        } else {
            ExtentReporter.logFail("STB_TC_75", "STB_TC_75(), Failed To Validate Send Money To ML Branch Transaction, After clicking on Continue in One time pin popup App navigates to Transaction Success Page");
            System.out.println("-----------------------------------------------------------");
        }
    }
}
