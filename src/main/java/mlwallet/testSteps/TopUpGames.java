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
public class TopUpGames extends Base_Steps{

    Login login = new Login();

    public void selectGameAndLoadType() throws Exception {
          mobileGeneralMethod.tap(topUpGamesObjects.objValorant(),"Game");
          mobileGeneralMethod.waitSleep(3000);
          mobileGeneralMethod.tap(topUpGamesObjects.objBuyPHP149(),"Load Type");
          mobileGeneralMethod.waitSleep(5000);
    }
    public void topUpGamesHomePageNavigation() throws Exception {
        mobileGeneralMethod.tap(topUpGamesObjects.objTopUpGames(),"Icon");
    }
    public void inputRequiredDataAndContinue() throws Exception {
         mobileGeneralMethod.type(topUpGamesObjects.objGameUserID(),"Game User ID Input Field", propertyReader.getproperty("GameUserID"));
         mobileGeneralMethod.type(topUpGamesObjects.objEmailAddress(),"Email ID Input Field", propertyReader.getproperty("Email"));
         mobileGeneralMethod.type(topUpGamesObjects.objMobileNumber(),"Mobile Number", propertyReader.getproperty("GameMobileNumber"));
         mobileGeneralMethod.verticalSwipe();
         mobileGeneralMethod.waitSleep(3000);
         mobileGeneralMethod.tap(topUpGamesObjects.objContinue(),"Button");
         mobileGeneralMethod.waitSleep(5000);
    }
    //---------Happy Path
    public void topUpGamesSuccessfulTransaction_TUG_TC_06() throws Exception {
        ExtentReporter.logInfo("TUG_TC_06","topUp Games Successful Transaction");
        login.loginWalletBranchTier();
        mobileGeneralMethod.tap(homePageObject.objEyeIcon(), "Eye Icon");
        mobileGeneralMethod.waitSleep(3000);
        String sAvailableBalance = mobileGeneralMethod.getText(topUpGamesObjects.objAvailableBalance());
        mobileGeneralMethod.tap(topUpGamesObjects.objTopUpGames(),"Icon");
        mobileGeneralMethod.waitSleep(8000);
        mobileGeneralMethod.isVisible(topUpGamesObjects.objTopGamesPage(), "TopUp Games Page");
        selectGameAndLoadType();
        inputRequiredDataAndContinue();
        mobileGeneralMethod.tap(topUpGamesObjects.objConfirm(),"button");
        mobileGeneralMethod.waitSleep(8000);
        mobileGeneralMethod.tap(topUpGamesObjects.objContinueOTP(),"Continue Button");
        mobileGeneralMethod.waitSleep(25000);
        if( mobileGeneralMethod.isVisible(topUpGamesObjects.objTransactionDetails(),"Page")) {
             mobileGeneralMethod.isVisible(topUpGamesObjects.objTransactionCode(),"Transaction Code");
             mobileGeneralMethod.isVisible(topUpGamesObjects.objGameUserIDInTransactionDetails(),"Game User ID");
             mobileGeneralMethod.isVisible(topUpGamesObjects.objRedeemCode(),"Redeem code");
             mobileGeneralMethod.verticalSwipe();
             mobileGeneralMethod.verticalSwipe();
             mobileGeneralMethod.verticalSwipe();
             mobileGeneralMethod.tap(topUpGamesObjects.objBackToHome(),"Button");
             mobileGeneralMethod.waitSleep(5000);
             mobileGeneralMethod.verticalSwipeDown();
             mobileGeneralMethod.tap(homePageObject.objEyeIcon(), "Eye Icon");
             mobileGeneralMethod.waitSleep(3000);
             String sAvailableBalanceAfterTopUp = mobileGeneralMethod.getText(topUpGamesObjects.objAvailableBalance());
             mobileGeneralMethod.assertionNotSameValidation(sAvailableBalance, sAvailableBalanceAfterTopUp);
             LoggingUtils.info("TUG_TC_06, TopUp Games successful Load Transaction validated");
             ExtentReporter.logPass("TUG_TC_06", "TUG_TC_06, TopUp Games successful Load Transaction validated");
             System.out.println("-----------------------------------------------------------");
        }
        else{
             ExtentReporter.logFail("TUG_TC_06", "TUG_TC_06, TopUp Games Failed to Load Transaction validate!");
             System.out.println("-----------------------------------------------------------");
        }
    }
    //-----Positive
    public void topUpGamesHomePageValidation_TUG_TC_01() throws Exception {
        ExtentReporter.logInfo("TUG_TC_01","TopUp Games Home Page Validation");
        login.loginWalletBranchTier();
        topUpGamesHomePageNavigation();
        if(mobileGeneralMethod.isVisible(topUpGamesObjects.objTopGamesPage(), "TopUp Games Page")) {
            mobileGeneralMethod.waitSleep(1000);
            for (int i = 2; i < 8; i++) {
                mobileGeneralMethod.isVisible(topUpGamesObjects.objGames(i), "Games");
            }
            for (int j = 1; j < 4; j++) {
                mobileGeneralMethod.isVisible(topUpGamesObjects.objGames1(j), "Games");
            }
            LoggingUtils.info("TUG_TC_01, TopUp Games Home Page validated");
            ExtentReporter.logPass("TUG_TC_01", "TopUp Games Home Page validated");
            System.out.println("-----------------------------------------------------------");
        }
        else{
            ExtentReporter.logFail("TUG_TC_01", "TopUp Games Failed to Home Page validate!");
            System.out.println("-----------------------------------------------------------");
        }
    }
    //-----Positive
    public void topUPGamesLoadSelectionScreenNavigation_TUG_TC_05() throws Exception {
        ExtentReporter.logInfo("TUG_TC_05","TopUp Games Load Selection Screen Navigation");
        login.loginWalletBranchTier();
        topUpGamesHomePageNavigation();
        if(mobileGeneralMethod.isVisible(topUpGamesObjects.objTopGamesPage(), "TopUp Games Page")) {
            mobileGeneralMethod.tap(topUpGamesObjects.objValorant(), "Game");
            mobileGeneralMethod.waitSleep(1000);
            for (int i = 1; i <= 6; i++) {
                if (i % 2 != 0) {
                    mobileGeneralMethod.isVisible(topUpGamesObjects.objLoadTypeAndPoints(i), "Load Type");
                } else if (i % 2 == 0) {
                    mobileGeneralMethod.isVisible(topUpGamesObjects.objLoadTypeAndPoints(i), "Points");

                }
            }
            LoggingUtils.info("TUG_TC_05, TopUp Games Load Selection Screen navigation validated");
            ExtentReporter.logPass("TUG_TC_05", "TopUp Games Load Selection Screen navigation validated");
            System.out.println("-----------------------------------------------------------");
        }
        else{
            ExtentReporter.logFail("TUG_TC_01", "TopUp Games Failed to Load Selection Screen navigation validate!");
            System.out.println("-----------------------------------------------------------");
        }
    }
    //-----Positive
    public void topUPGamesLoadSelectionPageLoadTypesValidation_TUG_TC_08() throws Exception {
        ExtentReporter.logInfo("TUG_TC_08","TopUp Games Load Selection Page Load Types Validation");
        login.loginWalletBranchTier();
        topUpGamesHomePageNavigation();
        if(mobileGeneralMethod.isVisible(topUpGamesObjects.objTopGamesPage(), "TopUp Games Page")) {
            mobileGeneralMethod.tap(topUpGamesObjects.objValorant(), "Game");
            mobileGeneralMethod.waitSleep(1000);
            for (int i = 1; i <= 6; i++) {
                if (i % 2 != 0) {
                    mobileGeneralMethod.isVisible(topUpGamesObjects.objLoadTypeAndPoints(i), "Load Type");
                } else if (i % 2 == 0) {
                    mobileGeneralMethod.isVisible(topUpGamesObjects.objLoadTypeAndPoints(i), "Points");
                }
                mobileGeneralMethod.verticalSwipe();
            }
            LoggingUtils.info("TUG_TC_08, TopUp Games Load Selection Page Load Types Validation validated");
            ExtentReporter.logPass("TUG_TC_08", "TopUp Games Load Selection Page Load Types validated");
            System.out.println("-----------------------------------------------------------");
        }
        else{
            ExtentReporter.logFail("TUG_TC_08", "TopUp Games Failed to Load Selection Page Load Types validate!");
            System.out.println("-----------------------------------------------------------");
        }
    }
    //-----Positive
    public void topUPGamesTransactionDetailsPageNavigation_TUG_TC_09() throws Exception {
        ExtentReporter.logInfo("TUG_TC_09","TopUp Games Transaction Details Page Navigation");
        login.loginWalletBranchTier();
        topUpGamesHomePageNavigation();
        selectGameAndLoadType();
        inputRequiredDataAndContinue();
        if (mobileGeneralMethod.isVisible(topUpGamesObjects.objTransactionDetails(),"Page")) {
            LoggingUtils.info("TUG_TC_09, TopUp Games Transaction Details Page navigation validated");
            ExtentReporter.logPass("TUG_TC_09", "TopUp Games Transaction Details Page navigation validated");
            System.out.println("-----------------------------------------------------------");
        }
        else{
            ExtentReporter.logFail("TUG_TC_09", "TopUp Games Failed to ransaction Details Page navigation validate!");
            System.out.println("-----------------------------------------------------------");
        }
    }
    //-----Negative
    public void topUpGamesGameIDRequiredErrorMsgValidation_TUG_TC_10() throws Exception {
        ExtentReporter.logInfo("TUG_TC_10","TopUp Games Game ID Required Error Message validation");
        login.loginWalletBranchTier();
        topUpGamesHomePageNavigation();
        selectGameAndLoadType();
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.tap(topUpGamesObjects.objContinue(),"Button");
        mobileGeneralMethod.waitSleep(3000);
        if (mobileGeneralMethod.isVisible(topUpGamesObjects.objGameIDRequiredMsg(),"Error Message")) {
            String sActualErrorMsg = mobileGeneralMethod.getText(topUpGamesObjects.objGameIDRequiredMsg());
            String sExceptedErrorMsg = "Game ID is required";
             mobileGeneralMethod.assertionValidation(sActualErrorMsg, sExceptedErrorMsg);
            LoggingUtils.info("TUG_TC_10, TopUp Games Game ID Required Error Message validated");
            ExtentReporter.logPass("TUG_TC_10", "TopUp Games Game ID Required Error Message validated");
            System.out.println("-----------------------------------------------------------");
        }
        else{
            ExtentReporter.logFail("TUG_TC_10", "TopUp Games Failed to Game ID Required Error Message validate!");
            System.out.println("-----------------------------------------------------------");
        }
    }
    //-----Negative
    public void topUpGamesEmailAddressRequiredErrorMsgValidation_TUG_TC_11() throws Exception {
        ExtentReporter.logInfo("TUG_TC_11","TopUp Games Email Address Required Error Message validation");
        login.loginWalletBranchTier();
        topUpGamesHomePageNavigation();
        selectGameAndLoadType();
        mobileGeneralMethod.type(topUpGamesObjects.objGameUserID(),"Game User ID Input Field",propertyReader.getproperty("GameUserID"));
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.tap(topUpGamesObjects.objContinue(),"Button");
        mobileGeneralMethod.waitSleep(3000);
        if (mobileGeneralMethod.isVisible(topUpGamesObjects.objEmailRequiredMsg(),"Error Message")) {
            String sActualErrorMsg = mobileGeneralMethod.getText(topUpGamesObjects.objEmailRequiredMsg());
            String sExceptedErrorMsg = "Email address is required.";
             mobileGeneralMethod.assertionValidation(sActualErrorMsg, sExceptedErrorMsg);
            LoggingUtils.info("TUG_TC_11, TopUp Games Email Address Required Error Message validated");
            ExtentReporter.logPass("TUG_TC_11", "TopUp Games Email Address Required Error Message validated");
            System.out.println("-----------------------------------------------------------");
        }
        else{
            ExtentReporter.logFail("TUG_TC_11", "TopUp Games Failed to Email Address Required Error Message validate!");
            System.out.println("-----------------------------------------------------------");
        }
    }
    //-----Negative
    public void topUpGamesEmailAddressInvalidErrorMsgValidation_TUG_TC_12() throws Exception {
        ExtentReporter.logInfo("TUG_TC_12","TopUp Games Email Address invalid Error Message validation");
        login.loginWalletBranchTier();
        topUpGamesHomePageNavigation();
        selectGameAndLoadType();
        mobileGeneralMethod.type(topUpGamesObjects.objGameUserID(), "Game User ID Input Field", propertyReader.getproperty("GameUserID"));
        mobileGeneralMethod.type(topUpGamesObjects.objEmailAddress(), "Email ID Input Field", propertyReader.getproperty("Invalid_Email_Address"));
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.tap(topUpGamesObjects.objContinue(),"Button");
        mobileGeneralMethod.waitSleep(3000);
        if (mobileGeneralMethod.isVisible(topUpGamesObjects.objEmailAddressInvalidMsg(),"Error Message")) {
            String sActualErrorMsg = mobileGeneralMethod.getText(topUpGamesObjects.objEmailAddressInvalidMsg());
            String sExceptedErrorMsg = "Email address is invalid";
             mobileGeneralMethod.assertionValidation(sActualErrorMsg, sExceptedErrorMsg);
            LoggingUtils.info("TUG_TC_12, TopUp Games Email Address invalid Error Message validated");
            ExtentReporter.logPass("TUG_TC_12", "TopUp Games Email Address invalid Error Message validated");
            System.out.println("-----------------------------------------------------------");
        }
        else{
            ExtentReporter.logFail("TUG_TC_12", "TopUp Games Failed to Address invalid Error Message validate!");
            System.out.println("-----------------------------------------------------------");
        }
    }
    //-----Negative
    public void topUpGamesMobileNumberInvalidErrorMsgValidation_TUG_TC_13() throws Exception {
        ExtentReporter.logInfo("TUG_TC_13","TopUp Games Mobile Number invalid Error Message validation");
        login.loginWalletBranchTier();
        topUpGamesHomePageNavigation();
        selectGameAndLoadType();
        mobileGeneralMethod.type(topUpGamesObjects.objGameUserID(), "Game User ID Input Field", propertyReader.getproperty("GameUserID"));
        mobileGeneralMethod.type(topUpGamesObjects.objEmailAddress(), "Email ID Input Field", propertyReader.getproperty("Email"));
        mobileGeneralMethod.type(topUpGamesObjects.objMobileNumber(), "Mobile Number", propertyReader.getproperty("Invalid_MobileNumber"));
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.tap(topUpGamesObjects.objContinue(),"Button");
        mobileGeneralMethod.waitSleep(3000);
        if (mobileGeneralMethod.isVisible(topUpGamesObjects.objMobileNumberInvalidMsg(),"Error Message")) {
            String sActualErrorMsg = mobileGeneralMethod.getText(topUpGamesObjects.objMobileNumberInvalidMsg());
            String sExceptedErrorMsg = "Mobile number is invalid";
             mobileGeneralMethod.assertionValidation(sActualErrorMsg, sExceptedErrorMsg);
            LoggingUtils.info("TUG_TC_13, TopUp Games Mobile Number invalid Error Message validated");
            ExtentReporter.logPass("TUG_TC_13", "TopUp Games Mobile Number invalid Error Message validated");
            System.out.println("-----------------------------------------------------------");
        }
        else{
            ExtentReporter.logFail("TUG_TC_13", "TopUp Games Failed to Mobile Number invalid Error Message validate!");
            System.out.println("-----------------------------------------------------------");
        }
    }
    //-----Positive
    public void topUpGamesLandingPageNavigation_TUG_TC_14() throws Exception {
        ExtentReporter.logInfo("TUG_TC_14","TopUp Games Landing Page navigation");
        login.loginWalletBranchTier();
        mobileGeneralMethod.tap(topUpGamesObjects.objTopUpGames(),"Icon");
        if (mobileGeneralMethod.isVisible(topUpGamesObjects.objTopGamesPage(), "TopUp Games Page")) {
            LoggingUtils.info("TUG_TC_14, TopUp Games Landing Page navigation validated");
            ExtentReporter.logPass("TUG_TC_14", "TopUp Games Landing Page navigation validated");
            System.out.println("-----------------------------------------------------------");
        }
        else{
            ExtentReporter.logFail("TUG_TC_14", "TopUp Games Failed to Landing Page navigation validate!");
            System.out.println("-----------------------------------------------------------");
        }
    }
    //-----Positive
    public void topUpGamesTransactionDetailsPageUIValidation_TUG_TC_15() throws Exception {
        ExtentReporter.logInfo("TUG_TC_15","TopUp Games Transaction Details page UI navigation");
        login.loginWalletBranchTier();
        topUpGamesHomePageNavigation();
        selectGameAndLoadType();
        inputRequiredDataAndContinue();
        if (mobileGeneralMethod.isVisible(topUpGamesObjects.objTransactionDetails(),"Page")) {
            mobileGeneralMethod.isVisible(topUpGamesObjects.objGameUserIDInTransactionDetails(),"Game User ID");
            mobileGeneralMethod.isVisible(topUpGamesObjects.objMobileNumberInTransactionDetails(),"Mobile Number");
            mobileGeneralMethod.isVisible(topUpGamesObjects.objEmailInTransactionDetails(),"Email Address");
            mobileGeneralMethod.isVisible(topUpGamesObjects.objAmountInTransactionDetails(),"Amount");
            mobileGeneralMethod.isVisible(topUpGamesObjects.objConfirm(),"Button");
            LoggingUtils.info("TUG_TC_15, TopUp Games Transaction Details page UI navigation validated");
            ExtentReporter.logPass("TUG_TC_15", "TopUp Games Transaction Details page UI navigation validated");
            System.out.println("-----------------------------------------------------------");
        }
        else{
            ExtentReporter.logFail("TUG_TC_14", "TopUp Games Failed to Transaction Details page UI navigation validate!");
            System.out.println("-----------------------------------------------------------");
        }
    }
    //-----Positive
    public void topUpGamesSaveToFavorites_TUG_TC_16() throws Exception {
        ExtentReporter.logInfo("TUG_TC_16","TopUp Games Save To Favorites");
        login.loginWalletBranchTier();
        topUpGamesHomePageNavigation();
        selectGameAndLoadType();
        inputRequiredDataAndContinue();
        mobileGeneralMethod.tap(topUpGamesObjects.objConfirm(),"button");
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.waitSleep(8000);
        mobileGeneralMethod.tap(topUpGamesObjects.objContinueOTP(),"Continue Button");
        mobileGeneralMethod.waitSleep(15000);
        mobileGeneralMethod.isVisible(topUpGamesObjects.objTransactionDetails(),"Page");
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.tap(topUpGamesObjects.objSaveToMyFavorite(),"Button");
        if (mobileGeneralMethod.isVisible(topUpGamesObjects.objAddToFavoritesMsg(),"PopUp")) {
            mobileGeneralMethod.isVisible(topUpGamesObjects.objOkButton(),"Button");
            LoggingUtils.info("TUG_TC_16, TopUp Games Save To Favorites validated");
            ExtentReporter.logPass("TUG_TC_16", "TopUp Games Save To Favorites validated");
            System.out.println("-----------------------------------------------------------");
        }
        else{
            ExtentReporter.logFail("TUG_TC_16", "TopUp Games Failed to Save Favorites validate!");
            System.out.println("-----------------------------------------------------------");
        }
    }
    //-----Positive
    public void topUpGamesSRecipientAlreadySavedMsgValidation_TUG_TC_17() throws Exception {
        ExtentReporter.logInfo("TUG_TC_17","TopUp Games Recipient Already Saved Message validation");
        login.loginWalletBranchTier();
        topUpGamesHomePageNavigation();
        selectGameAndLoadType();
        inputRequiredDataAndContinue();
        mobileGeneralMethod.tap(topUpGamesObjects.objConfirm(),"button");
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.waitSleep(8000);
        mobileGeneralMethod.tap(topUpGamesObjects.objContinueOTP(),"Continue Button");
        mobileGeneralMethod.waitSleep(15000);
        mobileGeneralMethod.isVisible(topUpGamesObjects.objTransactionDetails(),"Page");
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.tap(topUpGamesObjects.objSaveToMyFavorite(),"Button");
        if (mobileGeneralMethod.isVisible(topUpGamesObjects.objDuplicateFavorites(),"PopUp")) {
            mobileGeneralMethod.isVisible(topUpGamesObjects.objOkButton(),"Button");
            LoggingUtils.info("TUG_TC_17, TopUp Games Recipient Already Saved Message validated");
            ExtentReporter.logPass("TUG_TC_17", "TUG_TC_17, TopUp Games Recipient Already Saved Message validated");
            System.out.println("-----------------------------------------------------------");
        }
        else{
            ExtentReporter.logFail("TUG_TC_16", "TopUp Games Failed to Save Favorites validate!");
            System.out.println("-----------------------------------------------------------");
        }
    }
    //-----Positive
    public void topUpGamesRemoveFromFavorites_TUG_TC_18() throws Exception {
        ExtentReporter.logInfo("TUG_TC_18","TopUp Games remove from favorites");
        login.loginWalletBranchTier();
        topUpGamesHomePageNavigation();
        mobileGeneralMethod.tap(topUpGamesObjects.objMyFavorites(),"Button");
        mobileGeneralMethod.type(topUpGamesObjects.objSearchFavField(), "Game User ID Input Field", propertyReader.getproperty("GameMobileNumber"));
        mobileGeneralMethod.tap(topUpGamesObjects.objHamburgerMenu(), "Hamburger menu");
        mobileGeneralMethod.tap(topUpGamesObjects.objRemoveBtn(),"Button");
        if (mobileGeneralMethod.isVisible(topUpGamesObjects.objFavoriteRecipient(), "Saved Recipient")) {
            LoggingUtils.info("TUG_TC_18, TopUp Games Recipient successfully removed from favorites validated");
            ExtentReporter.logPass("TUG_TC_18", "TopUp Games Recipient successfully removed from favorites validated");
            System.out.println("-----------------------------------------------------------");
        }
        else{
            ExtentReporter.logFail("TUG_TC_18", "TopUp Games Failed to Recipient successfully removed from favorites validate!");
            System.out.println("-----------------------------------------------------------");
        }
    }
    //-----Positive
    public void topUpGamesTransactionValidationInTransactionHistory_TUG_TC_19() throws Exception {
        ExtentReporter.logInfo("TUG_TC_19","TopUp Games Transaction Validation in Transaction History");
        login.loginWalletBranchTier();
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.tap(homePageObject.objSeeMore(),"Button");
        mobileGeneralMethod.waitSleep(8000);
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.tap(topUpGamesObjects.objTopUpGamesTransaction(),"Option");
        mobileGeneralMethod.waitSleep(5000);
        if (mobileGeneralMethod.isVisible(historyObject.objTransactionDetails(),"Page")) {
            mobileGeneralMethod.isVisible(historyObject.objReferenceNumberInTransactionDetails(),"Reference Number");
            mobileGeneralMethod.isVisible(historyObject.objReceiverMobileNo(),"Receiver Mobile Number");
            mobileGeneralMethod.isVisible(historyObject.objPaymentMethod(),"Payment Method");
            mobileGeneralMethod.isVisible(historyObject.objLoadType(),"Load Type");
            mobileGeneralMethod.isVisible(historyObject.objRedeemCode(),"Redeem Code");
            mobileGeneralMethod.isVisible(historyObject.objAmount(),"Amount To Send");
            mobileGeneralMethod.isVisible(historyObject.objServiceFee(),"Service Fee");
            mobileGeneralMethod.isVisible(historyObject.objTotalAmount(),"Total Amount");
            LoggingUtils.info("TUG_TC_19, TopUp Games Transaction Validated in Transaction History");
            ExtentReporter.logPass("TUG_TC_19", "TopUp Games Transaction Validated in Transaction History");
            System.out.println("-----------------------------------------------------------");
        }
        else{
            ExtentReporter.logFail("TUG_TC_19", "TopUp Games Failed to Transact in Transaction History validate!");
            System.out.println("-----------------------------------------------------------");
        }
    }
    //-----Positive
    public void topUpGamesTopUpAgainFunctionalityAfterFirstSuccessfulTransaction_TUG_TC_27() throws Exception {
        ExtentReporter.logInfo("TUG_TC_27","TopUp Games TopUp Again Functionality After First Successful Transaction");
        login.loginWalletBranchTier();
        topUpGamesHomePageNavigation();
        selectGameAndLoadType();
        inputRequiredDataAndContinue();
        mobileGeneralMethod.tap(topUpGamesObjects.objConfirm(),"button");
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.waitSleep(8000);
        mobileGeneralMethod.tap(topUpGamesObjects.objContinueOTP(),"Continue Button");
        mobileGeneralMethod.waitSleep(25000);
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.tap(topUpGamesObjects.objTopUpAgainBtn(),"Button");
        mobileGeneralMethod.waitSleep(5000);
        selectGameAndLoadType();
        inputRequiredDataAndContinue();
        mobileGeneralMethod.tap(topUpGamesObjects.objConfirm(),"button");
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.waitSleep(8000);
        mobileGeneralMethod.tap(topUpGamesObjects.objContinueOTP(),"Continue Button");
        mobileGeneralMethod.waitSleep(25000);
        if (mobileGeneralMethod.isVisible(topUpGamesObjects.objTransactionDetails(),"Page")) {
            mobileGeneralMethod.isVisible(topUpGamesObjects.objTransactionCode(),"Transaction Code");
            mobileGeneralMethod.isVisible(topUpGamesObjects.objGameUserIDInTransactionDetails(),"Game User ID");
            mobileGeneralMethod.isVisible(topUpGamesObjects.objRedeemCode(),"Redeem code");
            LoggingUtils.info("TUG_TC_27, TopUp Games TopUp Again Functionality After First Successful Transaction validated");
            ExtentReporter.logPass("TUG_TC_27", "TopUp Games TopUp Again Functionality After First Successful Transaction validated");
            System.out.println("-----------------------------------------------------------");
        }
        else{
            ExtentReporter.logFail("TUG_TC_27", "TopUp Games Failed to Functionality After First Successful Transaction validate!");
            System.out.println("-----------------------------------------------------------");
        }
    }
    //-----Positive
    public void topUpGamesRecentTransactionValidation_TUG_TC_28() throws Exception {
        ExtentReporter.logInfo("TUG_TC_28","Top Up Games Recent Transaction Validation");
        login.loginWalletBranchTier();
        topUpGamesHomePageNavigation();
        selectGameAndLoadType();
        inputRequiredDataAndContinue();
        mobileGeneralMethod.tap(topUpGamesObjects.objConfirm(),"button");
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.waitSleep(8000);
        mobileGeneralMethod.tap(topUpGamesObjects.objContinueOTP(),"Continue Button");
        mobileGeneralMethod.waitSleep(25000);
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.tap(topUpGamesObjects.objBackToHome(),"Button");
        mobileGeneralMethod.isVisible(homePageObject.objRecentTransactions(),"Header");
        mobileGeneralMethod.verticalSwipe();
        if (mobileGeneralMethod.isVisible(topUpGamesObjects.objTopUpGamesTransaction(),"Transaction")) {
            mobileGeneralMethod.isVisible(topUpGamesObjects.objCompleteStatus(),"Status");
            LoggingUtils.info("TUG_TC_28, Top Up Games Recent Transaction Validation");
            ExtentReporter.logPass("TUG_TC_28", "TUG_TC_28, Top Up Games Recent Transaction Validation");
            System.out.println("-----------------------------------------------------------");
        }
        else{
            ExtentReporter.logFail("TUG_TC_27", "TopUp Games Failed to Functionality After First Successful Transaction validate!");
            System.out.println("-----------------------------------------------------------");
        }
    }
    //-----Positive
    public void topUpGamesSelectRecipientWithSavedFavorites_TUG_TC_29() throws Exception {
        ExtentReporter.logInfo("TUG_TC_29","TopUp Games Select recipient with saved favorites");
        login.loginWalletBranchTier();
        topUpGamesHomePageNavigation();
        mobileGeneralMethod.tap(topUpGamesObjects.objMyFavorites(),"Button");
        mobileGeneralMethod.type(topUpGamesObjects.objSearchFavField(), "Game User ID Input Field", propertyReader.getproperty("GameMobileNumber"));
        mobileGeneralMethod.tap(topUpGamesObjects.objFavoriteRecipient(),"Favorite Recipient");
        if (mobileGeneralMethod.isVisible(topUpGamesObjects.objBuyPHP149(), "Load Selection Page")) {
            LoggingUtils.info("TUG_TC_29, TopUp Games Select recipient with saved favorites validated");
            ExtentReporter.logPass("TUG_TC_29", "Top Up Games Recent Transaction Validation validated");
            System.out.println("-----------------------------------------------------------");
        }
        else{
            ExtentReporter.logFail("TUG_TC_29", "TopUp Games Failed to Recent Transaction Validation validate!");
            System.out.println("-----------------------------------------------------------");
        }
    }
    public void handleMpin(String mPin) throws Exception {
        for (int i = 0; i < mPin.length(); i++) {
            char ch = mPin.charAt(i);
            String ch1 = String.valueOf(ch);
            mobileGeneralMethod.tap(mlWalletPageObjects.objEnterMpinVal(ch1), "MPIN");
        }
        LoggingUtils.info("Entered MLPin " + mPin + " Successfully");
        ExtentReporter.logPass("Enter MLPin", "Entered MLPin " + mPin + " Successfully");
    }
    //-----Positive
    public void topUpGamesTransactionWithValidMLPin_TUG_TC_31() throws Exception {
        ExtentReporter.logInfo("TUG_TC_31","TopUp Games Transaction with Valid MLPin");
        login.loginWalletBranchTier();
        topUpGamesHomePageNavigation();
        selectGameAndLoadType();
        inputRequiredDataAndContinue();
        mobileGeneralMethod.tap(topUpGamesObjects.objConfirm(),"button");
        mobileGeneralMethod.waitSleep(8000);
        handleMpin("1111");
        mobileGeneralMethod.waitSleep(25000);
        if (mobileGeneralMethod.isVisible(topUpGamesObjects.objTransactionDetails(),"Page")) {
            mobileGeneralMethod.isVisible(topUpGamesObjects.objTransactionCode(), "Transaction Code");
            mobileGeneralMethod.isVisible(topUpGamesObjects.objGameUserIDInTransactionDetails(), "Game User ID");
            mobileGeneralMethod.isVisible(topUpGamesObjects.objRedeemCode(), "Redeem code");
            LoggingUtils.info("TUG_TC_31, TopUp Games Transaction with Valid MLPin validated");
            ExtentReporter.logPass("TUG_TC_31", "TopUp Games Transaction with Valid MLPin validated");
            System.out.println("-----------------------------------------------------------");
        }
        else{
            ExtentReporter.logFail("TUG_TC_31", "TopUp Games Failed to Transaction with Valid MLPin validate!");
            System.out.println("-----------------------------------------------------------");
        }
    }
    //-----Negative
    public void topUpGamesTransactionWithInValidMLPin_TUG_TC_26() throws Exception {
        ExtentReporter.logInfo("TUG_TC_26","TopUp Games Transaction with InValid MLPin");
        login.loginWalletBranchTier();
        topUpGamesHomePageNavigation();
        selectGameAndLoadType();
        inputRequiredDataAndContinue();
        mobileGeneralMethod.tap(topUpGamesObjects.objConfirm(),"button");
        mobileGeneralMethod.waitSleep(8000);
        handleMpin("1234");
        mobileGeneralMethod.waitSleep(25000);
        if (mobileGeneralMethod.isVisible(cashInViaBranchObjects.objInvalidPINMsg(),"Message")) {
            String sActualErrorMsg = mobileGeneralMethod.getText(cashInViaBranchObjects.objInvalidPINMsg());
            String sExceptedErrorMsg = "You have entered an invalid PIN. Please try again.";
             mobileGeneralMethod.assertionValidation(sActualErrorMsg, sExceptedErrorMsg);
            LoggingUtils.info("TUG_TC_26, TopUp Games Transaction with InValid MLPin validated");
            ExtentReporter.logPass("TUG_TC_26", "TopUp Games Transaction with Valid MLPin validated");
            System.out.println("-----------------------------------------------------------");
        }
        else{
            ExtentReporter.logFail("TUG_TC_26", "TopUp Games Failed to Transact with Valid MLPin validate!");
            System.out.println("-----------------------------------------------------------");
        }
    }
    //-----Positive
    public void topUpGamesMLPinPageNavigation_TUG_TC_23() throws Exception {
        ExtentReporter.logInfo("TUG_TC_23","TopUp Games ML Pin Page Navigation");
        login.loginWalletBranchTier();
        topUpGamesHomePageNavigation();
        selectGameAndLoadType();
        inputRequiredDataAndContinue();
        mobileGeneralMethod.tap(topUpGamesObjects.objConfirm(),"button");
        mobileGeneralMethod.waitSleep(8000);
        if (mobileGeneralMethod.isVisible(topUpGamesObjects.objMLPinEditField(), "ML Pin Edit Field")) {
            LoggingUtils.info("TUG_TC_23, TopUp Games ML Pin Page navigation validated");
            ExtentReporter.logPass("TUG_TC_23", "TopUp Games ML Pin Page navigation validated");
            System.out.println("-----------------------------------------------------------");
        }
        else{
            ExtentReporter.logFail("TUG_TC_23", "TopUp Games Failed to ML Pin Page navigation validate!");
            System.out.println("-----------------------------------------------------------");
        }
    }
    //-----Positive
    public void topUpGamesInAppOTPPopupNavigation_TUG_TC_20() throws Exception {
        ExtentReporter.logInfo("TUG_TC_20","TopUp Games InApp popup navigation");
        login.loginWalletBranchTier();
        topUpGamesHomePageNavigation();
        selectGameAndLoadType();
        inputRequiredDataAndContinue();
        mobileGeneralMethod.tap(topUpGamesObjects.objConfirm(),"button");
        mobileGeneralMethod.waitSleep(8000);
        if (mobileGeneralMethod.isVisible(loginObject.objOneTimePin(),"Popup")) {
            mobileGeneralMethod.isVisible(loginObject.objOTP(),"OTP Generated");
            mobileGeneralMethod.isVisible(mlWalletPageObjects.continue2_btn(),"Continue Button");
            mobileGeneralMethod.isVisible(loginObject.objCancelBtn(),"Cancel Button");
            LoggingUtils.info("TUG_TC_20, TopUp Games InApp popup navigation validated");
            ExtentReporter.logPass("TUG_TC_20", "TopUp Games InApp popup navigation validated");
            System.out.println("-----------------------------------------------------------");
        }
        else{
            ExtentReporter.logFail("TUG_TC_20", "TopUp Games Failed to InApp popup navigation validate!");
            System.out.println("-----------------------------------------------------------");
        }
    }
}
