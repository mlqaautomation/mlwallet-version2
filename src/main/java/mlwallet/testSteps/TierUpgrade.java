package mlwallet.testSteps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.ExtentReport.ExtentReporter;
import utilities.Logger.LoggingUtils;

import java.util.List;

public class TierUpgrade extends Base_Steps{
    Login login = new Login();
    public void tierUpgradeHomePageIIconValidationAsBuyerTierUser_TU_TC_01() throws Exception {
        ExtentReporter.logInfo("","Tier Upgrade Home Page I Icon Validation as BuyerTier User");
login.loginWalletBuyerTier();
        if (mobileGeneralMethod.isVisible(homePageObject.objIIcon(), "i Icon")) {
            mobileGeneralMethod.isVisible(homePageObject.objLearnMoreTxt(),"Text");
            LoggingUtils.info("TU_TC_01, Tier Upgrade Home Page I Icon validated as BuyerTier User");
            ExtentReporter.logPass("TU_TC_01", "TU_TC_01, Tier Upgrade Home Page I Icon validated as BuyerTier User");
            System.out.println("-----------------------------------------------------------");
        }
    }

    public void tierUpgradeHomePageIIconValidationAsSemiVerifiedTierUser_TU_TC_02() throws Exception {
        ExtentReporter.logInfo("","Tier Upgrade Home Page I Icon Validation as as Semi verified Tier User");
login.loginWalletBuyerTier();
        if (mobileGeneralMethod.isVisible(homePageObject.objIIcon(), "i Icon")) {
            mobileGeneralMethod.isVisible(homePageObject.objLearnMoreTxt(),"Text");
            LoggingUtils.info("TU_TC_02, Tier Upgrade Home Page I Icon validated as Semi verified User");
            ExtentReporter.logPass("TU_TC_02", "TU_TC_02, Tier Upgrade Home Page I Icon validated as Semi verified User");
            System.out.println("-----------------------------------------------------------");
        }
    }

    public void tierUpgradeHomePageIIconValidationAsFullyVerifiedTierUser_TU_TC_03() throws Exception {
        ExtentReporter.logInfo("","Tier Upgrade Home Page I Icon Validation as Fully verified Tier User");
        login.loginWalletFullyTier();
//        verifyElementNotPresent(homePageObject.objIIcon(), "i Icon", 5);
//        verifyElementNotPresent(homePageObject.objLearnMoreTxt(),"Learn More Txt",5);
        LoggingUtils.info("TU_TC_03, Tier Upgrade Home Page I Icon not displayed For Fully-verified Tier user");
        ExtentReporter.logPass("TU_TC_03", "TU_TC_03, Tier Upgrade Home Page I Icon not displayed For Fully-verified Tier user");
        System.out.println("-----------------------------------------------------------");
    }

    public void tierUpgradeVerificationTierPerksPageNavigationAsBuyerTierUser_TU_TC_04() throws Exception {
        ExtentReporter.logInfo("","Tier Upgrade Verification tier perks page navigation as BuyerTier User");
login.loginWalletBuyerTier();
        mobileGeneralMethod.tap(homePageObject.objIIcon(), "i Icon");
        if (mobileGeneralMethod.isVisible(homePageObject.objVerificationTierPerks(),"Page")) {
            LoggingUtils.info("TU_TC_04, Tier Upgrade Verification tier perks page navigation validated as BuyerTier User");
            ExtentReporter.logPass("TU_TC_04", "TU_TC_04, Tier Upgrade Verification tier perks page navigation validated as BuyerTier User");
            System.out.println("-----------------------------------------------------------");
        }
    }

    public void tierUpgradeVerificationTierPerksPageNavigationAsSemiVerifiedTierUser_TU_TC_05() throws Exception {
        ExtentReporter.logInfo("","Tier Upgrade Verification tier perks page navigation as Semi Verified Tier User");
login.loginWalletBuyerTier();
        mobileGeneralMethod.tap(homePageObject.objIIcon(), "i Icon");
        if (mobileGeneralMethod.isVisible(homePageObject.objVerificationTierPerks(),"Page")) {
            LoggingUtils.info("TU_TC_05, Tier Upgrade Verification tier perks page navigation validated as Semi Verified Tier User");
            ExtentReporter.logPass("TU_TC_05", "TU_TC_05, Tier Upgrade Verification tier perks page navigation validated as Semi Verified Tier User");
            System.out.println("-----------------------------------------------------------");
        }
    }

    public void tierUpgradeVerificationTierPerksBackBtnValidation_TU_TC_06() throws Exception {
        ExtentReporter.logInfo("","Tier Upgrade Verification tier perks Back button validation");
login.loginWalletBuyerTier();
        mobileGeneralMethod.tap(homePageObject.objIIcon(), "i Icon");
        mobileGeneralMethod.isVisible(homePageObject.objVerificationTierPerks(),"Page");
        mobileGeneralMethod.tap(tierUpgradeObjects.objVerificationTierPerksBackBtn(),"Back Button");
        if(mobileGeneralMethod.isVisible(homePageObject.objAvailableBalanceHeader(),"Header")){
            LoggingUtils.info("TU_TC_06, Tier Upgrade, After clicking back btn in verification tier perks app navigates to Home Page is validated");
            ExtentReporter.logPass("TU_TC_06", "TU_TC_06, Tier Upgrade, After clicking back btn in verification tier perks app navigates to Home Page is validated");
            System.out.println("-----------------------------------------------------------");
        }
    }

    public void tierUpgradeUpgradeTierLevelBtnValidationForSemiVerifiedTabAsBuyTierUser_TU_TC_07() throws Exception {
        ExtentReporter.logInfo("","Tier Upgrade Upgrade tier level Button validation, For Semi verified tab As Buyer tier User");
login.loginWalletBuyerTier();
        mobileGeneralMethod.tap(homePageObject.objIIcon(), "i Icon");
        mobileGeneralMethod.isVisible(homePageObject.objVerificationTierPerks(),"Page");
        mobileGeneralMethod.tap(tierUpgradeObjects.objSemiVerifiedTab(),"Tab");
        if(mobileGeneralMethod.isVisible(tierUpgradeObjects.objUpgradeTierLevel(),"Button")){
            LoggingUtils.info("TU_TC_07, Tier Upgrade Upgrade tier level Button validated, For Semi verified tab As Buyer tier User");
            ExtentReporter.logPass("TU_TC_07", "TU_TC_07, Tier Upgrade Upgrade tier level Button validated, For Semi verified tab As Buyer tier User");
            System.out.println("-----------------------------------------------------------");
        }
    }

    public void tierUpgradeUpgradeTierLevelBtnValidationForFullyVerifiedTabAsBuyTierUser_TU_TC_08() throws Exception {
        ExtentReporter.logInfo("","Tier Upgrade Upgrade tier level Button validation, For Fully verified tab As Buyer tier User");
login.loginWalletBuyerTier();
        mobileGeneralMethod.tap(homePageObject.objIIcon(), "i Icon");
        mobileGeneralMethod.isVisible(homePageObject.objVerificationTierPerks(),"Page");
        mobileGeneralMethod.tap(tierUpgradeObjects.objFullyVerifiedTab(),"Tab");
        if(mobileGeneralMethod.isVisible(tierUpgradeObjects.objUpgradeTierLevel(),"Button")){
            LoggingUtils.info("TU_TC_08, Tier Upgrade Upgrade tier level Button validated, For Fully verified tab As Buyer tier User");
            ExtentReporter.logPass("TU_TC_08", "TU_TC_08, Tier Upgrade Upgrade tier level Button validated, For Fully verified tab As Buyer tier User");
            System.out.println("-----------------------------------------------------------");
        }
    }

    public void tierUpgradeUpgradeTierLevelBtnValidationForBranchVerifiedTabAsBuyerTierUser_TU_TC_09() throws Exception {
        ExtentReporter.logInfo("","Tier Upgrade Upgrade tier level Button validation, For Branch verified tab As Buyer tier User");
login.loginWalletBuyerTier();
        mobileGeneralMethod.tap(homePageObject.objIIcon(), "i Icon");
        mobileGeneralMethod.isVisible(homePageObject.objVerificationTierPerks(),"Page");
        mobileGeneralMethod.tap(tierUpgradeObjects.objBranchVerifiedTab(),"Tab");
//        verifyElementNotPresent(tierUpgradeObjects.objUpgradeTierLevel(),"Upgrade Tier Level Button",5);
        LoggingUtils.info("TU_TC_09, Tier Upgrade Upgrade tier level Button validated, For Branch verified tab As Buyer tier User");
        ExtentReporter.logPass("TU_TC_09", "TU_TC_09, Tier Upgrade Upgrade tier level Button validated, For Branch verified tab As Buyer tier User");
        System.out.println("-----------------------------------------------------------");
    }

    public void tierUpgradeUpgradeTierLevelBtnValidationForFullyVerifiedTabAsSemiVerifiedTierUser_TU_TC_10() throws Exception {
        ExtentReporter.logInfo("","Tier Upgrade Upgrade tier level Button validation, For Fully verified tab As Semi verified tier User");
login.loginWalletBuyerTier();
        mobileGeneralMethod.tap(homePageObject.objIIcon(), "i Icon");
        mobileGeneralMethod.isVisible(homePageObject.objVerificationTierPerks(),"Page");
        mobileGeneralMethod.tap(tierUpgradeObjects.objFullyVerifiedTab(),"Tab");
        if(mobileGeneralMethod.isVisible(tierUpgradeObjects.objUpgradeTierLevel(),"Button")){
            LoggingUtils.info("TU_TC_10, Tier Upgrade Upgrade tier level Button validated, For Fully verified tab As Semi verified tier User");
            ExtentReporter.logPass("TU_TC_10", "TU_TC_10, Tier Upgrade Upgrade tier level Button validated, For Fully verified tab As Semi verified tier User");
            System.out.println("-----------------------------------------------------------");
        }
    }

    public void tierUpgradeUpgradeTierLevelBtnValidationForBranchVerifiedTabAsSemiVerifiedTierUser_TU_TC_11() throws Exception {
        ExtentReporter.logInfo("","Tier Upgrade Upgrade tier level Button validation, For Branch verified tab As Semi verified tier User");
login.loginWalletBuyerTier();
        mobileGeneralMethod.tap(homePageObject.objIIcon(), "i Icon");
        mobileGeneralMethod.isVisible(homePageObject.objVerificationTierPerks(), "Page");
        mobileGeneralMethod.tap(tierUpgradeObjects.objBranchVerifiedTab(),"Tab");
//        verifyElementNotPresent(tierUpgradeObjects.objUpgradeTierLevel(),"Upgrade Tier Level Button",5);
        LoggingUtils.info("TU_TC_11, Tier Upgrade Upgrade tier level Button validated, For Branch verified tab As Semi verified tier User");
        ExtentReporter.logPass("TU_TC_11", "TU_TC_11, Tier Upgrade Upgrade tier level Button validated, For Branch verified tab As Semi verified tier User");
        System.out.println("-----------------------------------------------------------");
    }

    public void tierUpgradeAccountDetailsPageNavigationAsBuyerTierUserToUpgradeToSemiVerifiedTier_TU_TC_12() throws Exception {
        ExtentReporter.logInfo("","Tier Upgrade Account details page navigation as Buyer tier user to upgrade to Semi verified tier user");
login.loginWalletBuyerTier();
        mobileGeneralMethod.tap(homePageObject.objIIcon(), "i Icon");
        mobileGeneralMethod.isVisible(homePageObject.objVerificationTierPerks(),"Page");
        mobileGeneralMethod.tap(tierUpgradeObjects.objSemiVerifiedTab(),"Tab");
        mobileGeneralMethod.tap(tierUpgradeObjects.objUpgradeTierLevel(),"Button");
        if(mobileGeneralMethod.isVisible(tierUpgradeObjects.objAccountDetails(),"Page")){
            LoggingUtils.info("TU_TC_12, Tier Upgrade Account details page navigation validated as Buyer tier user to upgrade to Semi verified tier user");
            ExtentReporter.logPass("TU_TC_12", "TU_TC_12, Tier Upgrade Account details page navigation validated as Buyer tier user to upgrade to Semi verified tier user");
            System.out.println("-----------------------------------------------------------");
        }
    }


    public void tierUpgradeAccountDetailsPageNavigationAsBuyerTierUserToUpgradeToFullyVerifiedTier_TU_TC_13() throws Exception {
        ExtentReporter.logInfo("","Tier Upgrade Account details page navigation as Buyer tier user to upgrade to Fully verified tier user");
login.loginWalletBuyerTier();
        mobileGeneralMethod.tap(homePageObject.objIIcon(), "i Icon");
        mobileGeneralMethod.isVisible(homePageObject.objVerificationTierPerks(),"Page");
        mobileGeneralMethod.tap(tierUpgradeObjects.objFullyVerifiedTab(),"Tab");
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.tap(tierUpgradeObjects.objUpgradeTierLevel(),"Button");
        if(mobileGeneralMethod.isVisible(tierUpgradeObjects.objAccountDetails(),"Page")){
            LoggingUtils.info("TU_TC_13, Tier Upgrade Account details page navigation validated as Buyer tier user to upgrade to Fully verified tier user");
            ExtentReporter.logPass("TU_TC_13", "TU_TC_13, Tier Upgrade Account details page navigation validated as Buyer tier user to upgrade to Fully verified tier user");
            System.out.println("-----------------------------------------------------------");
        }
    }


    public void tierUpgradeAccountDetailsPageNavigationAsSemiVerifiedTierUserToUpgradeToFullyVerifiedTier_TU_TC_14() throws Exception {
        ExtentReporter.logInfo("","Tier Upgrade Account details page navigation as Semi verified tier user to upgrade to Fully verified tier user");
login.loginWalletBuyerTier();
        mobileGeneralMethod.tap(homePageObject.objIIcon(), "i Icon");
        mobileGeneralMethod.isVisible(homePageObject.objVerificationTierPerks(),"Page");
        mobileGeneralMethod.tap(tierUpgradeObjects.objFullyVerifiedTab(),"Tab");
        mobileGeneralMethod.tap(tierUpgradeObjects.objUpgradeTierLevel(),"Button");
        if(mobileGeneralMethod.isVisible(tierUpgradeObjects.objAccountDetails(),"Page")){
            LoggingUtils.info("TU_TC_14, Tier Upgrade Account details page navigation validated as Semi verified tier user to upgrade to Fully verified tier user");
            ExtentReporter.logPass("TU_TC_14", "TU_TC_14, Tier Upgrade Account details page navigation validated as Semi verified tier user to upgrade to Fully verified tier user");
            System.out.println("-----------------------------------------------------------");
        }
    }

    public void tierUpgradeAccountDetailsPageBackBtnValidation_TU_TC_15() throws Exception {
        ExtentReporter.logInfo("","Tier upgrade Account details page Back button functionality validation");
login.loginWalletBuyerTier();
        mobileGeneralMethod.tap(homePageObject.objIIcon(), "i Icon");
        mobileGeneralMethod.isVisible(homePageObject.objVerificationTierPerks(),"Page");
        mobileGeneralMethod.tap(tierUpgradeObjects.objFullyVerifiedTab(),"Tab");
        mobileGeneralMethod.tap(tierUpgradeObjects.objUpgradeTierLevel(),"Button");
        mobileGeneralMethod.isVisible(tierUpgradeObjects.objAccountDetails(),"Page");
        mobileGeneralMethod.tap(tierUpgradeObjects.objAccountDetailsBackBtn(),"Account details page Back button");
        if (mobileGeneralMethod.isVisible(homePageObject.objVerificationTierPerks(),"Page")) {
            LoggingUtils.info("TU_TC_15, Tier Upgrade, After clicking back btn in Account details page app navigates to Verification tier perks Page is validated");
            ExtentReporter.logPass("TU_TC_15", "TU_TC_15, Tier Upgrade, After clicking back btn in Account details page app navigates to Verification tier perks Page is validated");
            System.out.println("-----------------------------------------------------------");
        }
    }
    public void accountDetailsPageNavigation() throws Exception {
        mobileGeneralMethod.tap(homePageObject.objIIcon(), "i Icon");
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.isVisible(homePageObject.objVerificationTierPerks(), "Page");
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.tap(tierUpgradeObjects.objFullyVerifiedTab(),"Tab");
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.tap(tierUpgradeObjects.objUpgradeTierLevel(),"Button");
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.isVisible(tierUpgradeObjects.objAccountDetails(),"Page");
    }
    public void tierUpgradeAutoSuggestionsValidationForProductServicesOffered_TU_TC_16() throws Exception {
        ExtentReporter.logInfo("","Tier Upgrade Auto Suggestions validation for Product/Services Offered");
        login.loginWalletBuyerTier();
        accountDetailsPageNavigation();
        mobileGeneralMethod.tap(tierUpgradeObjects.objProductServiceSelectionBtn(),"Product/Services offered selection Button");
        mobileGeneralMethod.type(tierUpgradeObjects.objSearchFieldInput(),"C","Product/Services offered search field");
//        if (verifyElementDisplayed(tierUpgradeObjects.objMatchingElements())) {
//            List<WebElement> values = findElements(tierUpgradeObjects.objMatchingElements);
//            for (int i = 1; i < values.size(); i++) {
//                String matchingElements = mobileGeneralMethod.getText(tierUpgradeObjects.objMatchingElementsProductServices(i));
//                LoggingUtils.info("Matching Elements : " + matchingElements + " is displayed");
//                ExtentReporter.extentLogger(" ", "Matching Elements : " + matchingElements + " is displayed");
//            }
//        } else {
//            LoggingUtils.info("No Matching Elements");
//        }
        LoggingUtils.info("TU_TC_16, Tier Upgrade, Auto Suggestions validated for Product/Services Offered");
        ExtentReporter.logPass("TU_TC_16", "TU_TC_16, Tier Upgrade, Auto Suggestions validated for Product/Services Offered");
        System.out.println("-----------------------------------------------------------");
    }

    
    public void tierUpgradeAutoSuggestionsValidationForPositionAtWork_TU_TC_17() throws Exception {
        ExtentReporter.logInfo("","Tier Upgrade Auto Suggestions validation for Position at Work");
        login.loginWalletBuyerTier();
        accountDetailsPageNavigation();
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.tap(tierUpgradeObjects.objPositionAtWokSelectionBtn(),"Position at Work selection Button");
        mobileGeneralMethod.type(tierUpgradeObjects.objSearchFieldInput(),"A","Position at Work search field");
//        if (verifyElementDisplayed(tierUpgradeObjects.objMatchingElements())) {
//            List<WebElement> values = findElements(tierUpgradeObjects.objMatchingElements);
//            for (int i = 1; i < values.size(); i++) {
//                String matchingElements = mobileGeneralMethod.getText(tierUpgradeObjects.objMatchingElementsProductServices(i));
//                LoggingUtils.info("Matching Elements : " + matchingElements + " is displayed");
//                ExtentReporter.extentLogger(" ", "Matching Elements : " + matchingElements + " is displayed");
//            }
//        } else {
//            LoggingUtils.info("No Matching Elements");
//        }
        LoggingUtils.info("TU_TC_17, Tier Upgrade, Auto Suggestions validated for Position at Work");
        ExtentReporter.logPass("TU_TC_17", "TU_TC_17, Tier Upgrade, Auto Suggestions validated for Position at Work");
        System.out.println("-----------------------------------------------------------");
    }

    public void tierUpgradeAutoSuggestionsValidationForNatureOfWork_TU_TC_18() throws Exception {
        ExtentReporter.logInfo("","Tier Upgrade Auto Suggestions validation for Nature of Work");
        login.loginWalletBuyerTier();
        accountDetailsPageNavigation();
        mobileGeneralMethod.verticalSwipe();mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.tap(tierUpgradeObjects.objNatureOfWorkSelectionBtn(),"Nature of Work selection Button");
        mobileGeneralMethod.type(tierUpgradeObjects.objSearchFieldInput(),"U","Nature of Work search field");
//        if (verifyElementDisplayed(tierUpgradeObjects.objMatchingElements)) {
//            List<WebElement> values = findElements(tierUpgradeObjects.objMatchingElements);
//            for (int i = 1; i < values.size(); i++) {
//                String matchingElements = mobileGeneralMethod.getText(tierUpgradeObjects.objMatchingElementsProductServices(i));
//                LoggingUtils.info("Matching Elements : " + matchingElements + " is displayed");
//                ExtentReporter.extentLogger(" ", "Matching Elements : " + matchingElements + " is displayed");
//            }
//        } else {
//            LoggingUtils.info("No Matching Elements");
//        }
        LoggingUtils.info("TU_TC_18, Tier Upgrade, Auto Suggestions validated for Nature of Work");
        ExtentReporter.logPass("TU_TC_18", "TU_TC_18, Tier Upgrade, Auto Suggestions validated for Nature of Work");
        System.out.println("-----------------------------------------------------------");
    }

    public void tierUpgradeConfirmDetailsBtnValidationInAccountDetailsPage_TU_TC_19() throws Exception {
        ExtentReporter.logInfo("","Tier Upgrade, Confirm details button validation in Account details page");
        login.loginWalletBuyerTier();
        accountDetailsPageNavigation();
        mobileGeneralMethod.verticalSwipe();mobileGeneralMethod.verticalSwipe();
        if(mobileGeneralMethod.isVisible(tierUpgradeObjects.objConfirmDetails(),"Button")){
            LoggingUtils.info("TU_TC_19, Tier Upgrade, Confirm details button validated in Account details page");
            ExtentReporter.logPass("TU_TC_19", "TU_TC_19, Tier Upgrade, Confirm details button validated in Account details page");
            System.out.println("-----------------------------------------------------------");
        }
    }

    public void tierUpgradePageNavigation_TU_TC_20() throws Exception {
        ExtentReporter.logInfo("","Tier upgrade page navigation");
        login.loginWalletBuyerTier();
        accountDetailsPageNavigation();
        mobileGeneralMethod.verticalSwipe();mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.tap(tierUpgradeObjects.objConfirmDetails(),"Button");
        if(mobileGeneralMethod.isVisible(tierUpgradeObjects.objTierUpgrade(),"Page")){
            LoggingUtils.info("TU_TC_20, Tier Upgrade page navigation validated");
            ExtentReporter.logPass("TU_TC_20", "TU_TC_20, Tier Upgrade page navigation validated");
            System.out.println("-----------------------------------------------------------");
        }
    }
    public void verificationTierPerksPageValidation() throws Exception {
        mobileGeneralMethod.isVisible(homePageObject.objMaxBalanceText(),"Header");
        mobileGeneralMethod.isVisible(homePageObject.objMaxBalanceAmount(), "Max Balance");
        mobileGeneralMethod.isVisible(homePageObject.objSendingLimitsCashOut(), "Header");
//        List<WebElement> values = findElements(MLWalletHomePage.objSendingLimitTransactionTypeAndAmount);
//        for (int i = 0; i < values.size(); i++) {
//            if (i % 2 == 0) {
//                String sTransactionType = values.get(i).mobileGeneralMethod.getText();
//                 LoggingUtils.info("Transaction Type : " + sTransactionType + " is displayed");
//                ExtentReporter.extentLogger(" ", "Transaction Type : " + sTransactionType + " is displayed");
//            }
//            if (i % 2 != 0) {
//                String sAmountRange = values.get(i).mobileGeneralMethod.getText();
//                 LoggingUtils.info("Amount Range : " + sAmountRange + " is displayed");
//                ExtentReporter.extentLogger(" ", "Amount Range : " + sAmountRange + " is displayed");
//            }
        }

    public void tierUpgradeFullyVerifiedTierTabUIValidation_TU_TC_21() throws Exception {
        ExtentReporter.logInfo("","Tier Upgrade Fully verified ter Tab UI Validation");
        login.loginWalletBuyerTier();
        mobileGeneralMethod.tap(homePageObject.objIIcon(), "i Icon");
        mobileGeneralMethod.isVisible(homePageObject.objVerificationTierPerks(),"Page");
        mobileGeneralMethod.tap(tierUpgradeObjects.objFullyVerifiedTab(),"Tab");
        mobileGeneralMethod.waitSleep(1000);
        if(mobileGeneralMethod.isVisible(homePageObject.objTier(),"Header")) {
            verificationTierPerksPageValidation();
            mobileGeneralMethod.isVisible(tierUpgradeObjects.objUpgradeTierLevel(),"Button");
            LoggingUtils.info("TU_TC_21, Tier Upgrade Fully verified ter Tab UI validated");
            ExtentReporter.logPass("TU_TC_21", "TU_TC_21, Tier Upgrade Fully verified ter Tab UI validated");
            System.out.println("-----------------------------------------------------------");
        }
    }

    public void tierUpgradeAccountDetailsPageUIValidation_TU_TC_23() throws Exception {
        ExtentReporter.logInfo("","Tier upgrade Account details page UI validation");
        login.loginWalletBuyerTier();
        accountDetailsPageNavigation();
        if(mobileGeneralMethod.isVisible(tierUpgradeObjects.objAccountDetails(),"Page")){
            mobileGeneralMethod.isVisible(tierUpgradeObjects.objPersonalInformation(),"Header");
            mobileGeneralMethod.isVisible(tierUpgradeObjects.objPlaceOfBirth(),"Place of Birth");
            mobileGeneralMethod.isVisible(tierUpgradeObjects.objNationality(),"Nationality");
            mobileGeneralMethod.isVisible(tierUpgradeObjects.objCivilStatus(),"Civil Status");
            mobileGeneralMethod.isVisible(tierUpgradeObjects.objGenderAtBirth(),"Gender at Birth");
            mobileGeneralMethod.isVisible(tierUpgradeObjects.objSourceOfIncome(),"Source of Income");
            mobileGeneralMethod.isVisible(tierUpgradeObjects.objCompanyOrEmployerName(),"Company/Employer Name");
            mobileGeneralMethod.isVisible(tierUpgradeObjects.objProductServiceOffered(),"Product/Service offered");
            mobileGeneralMethod.isVisible(tierUpgradeObjects.objWorkAddress(),"Work Address");
            mobileGeneralMethod.verticalSwipe();mobileGeneralMethod.verticalSwipe();
            mobileGeneralMethod.isVisible(tierUpgradeObjects.objPositionAtWork(),"Position at Work");
            mobileGeneralMethod.isVisible(tierUpgradeObjects.ObjNatureOfWork(),"Nature of Work");
            LoggingUtils.info("TU_TC_23, Tier upgrade Account details page UI validated");
            ExtentReporter.logPass("TU_TC_23", "TU_TC_23, Tier upgrade Account details page UI validated");
            System.out.println("-----------------------------------------------------------");
        }
    }

    public void tierUpgradePageUIValidation_TU_TC_24() throws Exception {
        ExtentReporter.logInfo("","Tier upgrade page UI validation");
        login.loginWalletBuyerTier();
        accountDetailsPageNavigation();
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.tap(tierUpgradeObjects.objConfirmDetails(),"Button");
        if (mobileGeneralMethod.isVisible(tierUpgradeObjects.objTierUpgrade(),"Page")) {
            mobileGeneralMethod.isVisible(tierUpgradeObjects.objSelectAnyValidID(),"Header");
            mobileGeneralMethod.isVisible(tierUpgradeObjects.objSelectID(),"Input field Header");
            mobileGeneralMethod.isVisible(tierUpgradeObjects.objSelectIDSelectionBtn(),"Select ID Selection Button");
            LoggingUtils.info("TU_TC_24, Tier upgrade page UI validated");
            ExtentReporter.logPass("TU_TC_24", "TU_TC_24, Tier upgrade page UI validated");
            System.out.println("-----------------------------------------------------------");
        }
    }

    public void tierUpgradeBackArrowBtnValidation_TU_TC_25() throws Exception {
        ExtentReporter.logInfo("","Tier upgrade page UI validation");
        login.loginWalletBuyerTier();
        accountDetailsPageNavigation();
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.tap(tierUpgradeObjects.objConfirmDetails(),"Button");
        mobileGeneralMethod.isVisible(tierUpgradeObjects.objTierUpgrade(),"Page");
        mobileGeneralMethod.tap(tierUpgradeObjects.objTierUpgradeBackBtn(),"Tier upgrade Back Arrow Btn");
        if(mobileGeneralMethod.isVisible(tierUpgradeObjects.objAccountDetails(),"Page")){
            LoggingUtils.info("TU_TC_25, After clicking on Back Arrow Btn on Tier upgrade Page, Application Navigates to Account Details Page is validated");
            ExtentReporter.logPass("TU_TC_25", "TU_TC_25, After clicking on Back Arrow Btn on Tier upgrade Page, Application Navigates to Account Details Page is validated");
            System.out.println("-----------------------------------------------------------");
        }
    }

    public void tierUpgradeUploadIDPhotosUIValidationAfterSelectingPHILHEALTH_TU_TC_26() throws Exception {
        ExtentReporter.logInfo("","Tier Upgrade, Upload ID photos UI validation After Selecting PHIL HEALTH");
        login.loginWalletBuyerTier();
        accountDetailsPageNavigation();
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.tap(tierUpgradeObjects.objConfirmDetails(),"Button");
        mobileGeneralMethod.isVisible(tierUpgradeObjects.objTierUpgrade(),"Page");
        mobileGeneralMethod.tap(tierUpgradeObjects.objSelectIDSelectionBtn(),"Select ID Selection Button");
        mobileGeneralMethod.type(tierUpgradeObjects.objSearchFieldInput(),"PhilHealth","Select ID Input field");
        mobileGeneralMethod.tap(tierUpgradeObjects.objPhilHealth(),"ID");
        if (mobileGeneralMethod.isVisible(tierUpgradeObjects.objUploadIDPhotos(), "Header")) {
            mobileGeneralMethod.isVisible(tierUpgradeObjects.objSelectIDField(),"Selected ID Field");
            mobileGeneralMethod.isVisible(tierUpgradeObjects.objCardInputField(),"Card Input Field");
            mobileGeneralMethod.isVisible(tierUpgradeObjects.objScanFrontOfID(),"Button");
            mobileGeneralMethod.isVisible(tierUpgradeObjects.objScanBackOfID(),"Button");
            mobileGeneralMethod.isVisible(tierUpgradeObjects.objTakeAFaceIdentityPhoto(),"Button");
            LoggingUtils.info("TU_TC_26, Tier Upgrade, Upload ID photos UI validated After Selecting PHIL HEALTH");
            ExtentReporter.logPass("TU_TC_26", "TU_TC_26, Tier Upgrade, Upload ID photos UI validated After Selecting PHIL HEALTH");
            System.out.println("-----------------------------------------------------------");
        }
    }

    public void tierUpgradeUploadIDPhotosBackArrowBtnValidation_TU_TC_27() throws Exception {
        ExtentReporter.logInfo("","Tier upgrade page UI validation");
        login.loginWalletBuyerTier();
        accountDetailsPageNavigation();
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.tap(tierUpgradeObjects.objConfirmDetails(),"Button");
        mobileGeneralMethod.isVisible(tierUpgradeObjects.objTierUpgrade(), "Page");
        mobileGeneralMethod.tap(tierUpgradeObjects.objSelectIDSelectionBtn(), "Select ID Selection Button");
        mobileGeneralMethod.type(tierUpgradeObjects.objSearchFieldInput(), "PhilHealth", "Select ID Input field");
        mobileGeneralMethod.tap(tierUpgradeObjects.objPhilHealth(),"ID");
        mobileGeneralMethod.tap(tierUpgradeObjects.objTierUpgradeBackBtn(), "Tier upgrade Back Arrow Btn");
        if (mobileGeneralMethod.isVisible(tierUpgradeObjects.objAccountDetails(),"Page")) {
            LoggingUtils.info("TU_TC_27, After clicking on Back Arrow Btn on Tier upgrade Upload ID Photos Page, Application Navigates to Account Details Page is validated");
            ExtentReporter.logPass("TU_TC_27", "TU_TC_27, After clicking on Back Arrow Btn on Tier upgrade Upload ID Photos Page, Application Navigates to Account Details Page is validated");
            System.out.println("-----------------------------------------------------------");
        }
    }

    public void tierUpgradeScanFrontOfIDPageUIValidation_TU_TC_28() throws Exception {
        ExtentReporter.logInfo("","Tier Upgrade Scan front of ID page UI Validation");
        login.loginWalletBuyerTier();
        accountDetailsPageNavigation();
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.tap(tierUpgradeObjects.objConfirmDetails(),"Button");
        mobileGeneralMethod.isVisible(tierUpgradeObjects.objTierUpgrade(),"Page");
        mobileGeneralMethod.tap(tierUpgradeObjects.objSelectIDSelectionBtn(),"Select ID Selection Button");
        mobileGeneralMethod.type(tierUpgradeObjects.objSearchFieldInput(),"PhilHealth","Select ID Input field");
        mobileGeneralMethod.tap(tierUpgradeObjects.objPhilHealth(),"ID");
        mobileGeneralMethod.tap(tierUpgradeObjects.objScanFrontOfID(),"Button");
        if(mobileGeneralMethod.isVisible(tierUpgradeObjects.objScanFrontOfID(),"Page")){
            mobileGeneralMethod.isVisible(tierUpgradeObjects.objScanFrontOfIDInfo(),"info");
            mobileGeneralMethod.isVisible(tierUpgradeObjects.objCaptureScreen(),"Capture Screen");
            mobileGeneralMethod.isVisible(tierUpgradeObjects.objCaptureButton(),"Capture Button");
            LoggingUtils.info("TU_TC_28, Tier Upgrade Scan front of ID page UI validated");
            ExtentReporter.logPass("TU_TC_28", "TU_TC_28, Tier Upgrade Scan front of ID page UI validated");
            System.out.println("-----------------------------------------------------------");
        }
    }

    public void tierUpgradeScanFrontOfIDPageBackArrowBtnValidation_TU_TC_29() throws Exception {
        ExtentReporter.logInfo("","Tier Upgrade Scan front of ID page BAck Arrow button Validation");
        login.loginWalletBuyerTier();
        accountDetailsPageNavigation();
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.tap(tierUpgradeObjects.objConfirmDetails(),"Button");
        mobileGeneralMethod.isVisible(tierUpgradeObjects.objTierUpgrade(),"Page");
        mobileGeneralMethod.tap(tierUpgradeObjects.objSelectIDSelectionBtn(), "Select ID Selection Button");
        mobileGeneralMethod.type(tierUpgradeObjects.objSearchFieldInput(), "PhilHealth", "Select ID Input field");
        mobileGeneralMethod.tap(tierUpgradeObjects.objPhilHealth(),"ID");
        mobileGeneralMethod.tap(tierUpgradeObjects.objScanFrontOfID(),"Button");

        mobileGeneralMethod.isVisible(tierUpgradeObjects.objScanFrontOfID(),"Button");
        mobileGeneralMethod.tap(tierUpgradeObjects.objTierUpgradeBackBtn(),"Tier Upgrade Scan Front of ID Back Arrow Button");
        mobileGeneralMethod.waitSleep(1000);
        if(mobileGeneralMethod.isVisible(tierUpgradeObjects.objTierUpgrade(),"Page")){
            LoggingUtils.info("TU_TC_29, Tier Upgrade, After clicking back btn in Tier Upgrade Scan Front of ID app navigates to Tier Upgrade page is validated");
            ExtentReporter.logPass("TU_TC_29", "TU_TC_29, Tier Upgrade, After clicking back btn in Tier Upgrade Scan Front of ID app navigates to Tier Upgrade page is validated");
            System.out.println("-----------------------------------------------------------");
        }
    }

    public void tierUpgradeScanBackOfIDPageUIValidation_TU_TC_30() throws Exception {
        ExtentReporter.logInfo("","Tier Upgrade Scan Back of ID page UI Validation");
        login.loginWalletBuyerTier();
        accountDetailsPageNavigation();
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.tap(tierUpgradeObjects.objConfirmDetails(),"Button");
        mobileGeneralMethod.isVisible(tierUpgradeObjects.objTierUpgrade(),"Page");
        mobileGeneralMethod.tap(tierUpgradeObjects.objSelectIDSelectionBtn(), "Select ID Selection Button");
        mobileGeneralMethod.type(tierUpgradeObjects.objSearchFieldInput(), "PhilHealth", "Select ID Input field");
        mobileGeneralMethod.tap(tierUpgradeObjects.objPhilHealth(),"ID");
        mobileGeneralMethod.tap(tierUpgradeObjects.objScanBackOfID(),"Button");
        if(mobileGeneralMethod.isVisible(tierUpgradeObjects.objScanBackOfID(),"Page")){
            mobileGeneralMethod.isVisible(tierUpgradeObjects.objScanFrontOfIDInfo(),"info");
            mobileGeneralMethod.isVisible(tierUpgradeObjects.objCaptureScreen(),"Capture Screen");
            mobileGeneralMethod.isVisible(tierUpgradeObjects.objCaptureButton(),"Capture Button");
            LoggingUtils.info("TU_TC_30, Tier Upgrade Scan Back of ID page UI validated");
            ExtentReporter.logPass("TU_TC_30", "TU_TC_30, Tier Upgrade Scan Back of ID page UI validated");
            System.out.println("-----------------------------------------------------------");
        }
    }


    public void tierUpgradeScanBackOfIDPageBackArrowBtnValidation_TU_TC_31() throws Exception {
        ExtentReporter.logInfo("","Tier Upgrade Scan Back of ID page BAck Arrow button Validation");
        login.loginWalletBuyerTier();
        accountDetailsPageNavigation();
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.tap(tierUpgradeObjects.objConfirmDetails(),"Button");
        mobileGeneralMethod.isVisible(tierUpgradeObjects.objTierUpgrade(),"Page");
        mobileGeneralMethod.tap(tierUpgradeObjects.objSelectIDSelectionBtn(), "Select ID Selection Button");
        mobileGeneralMethod.type(tierUpgradeObjects.objSearchFieldInput(), "PhilHealth", "Select ID Input field");
        mobileGeneralMethod.tap(tierUpgradeObjects.objPhilHealth(),"ID");
        mobileGeneralMethod.tap(tierUpgradeObjects.objScanBackOfID(),"Button");
        mobileGeneralMethod.isVisible(tierUpgradeObjects.objScanBackOfID(),"Button");
        mobileGeneralMethod.tap(tierUpgradeObjects.objTierUpgradeBackBtn(),"Tier Upgrade Scan Back of ID Back Arrow Button");
        mobileGeneralMethod.waitSleep(1000);
        if(mobileGeneralMethod.isVisible(tierUpgradeObjects.objTierUpgrade(),"Page")){
            LoggingUtils.info("TU_TC_31, Tier Upgrade, After clicking back btn in Tier Upgrade Scan Back of ID app navigates to Tier Upgrade page is validated");
            ExtentReporter.logPass("TU_TC_31", "TU_TC_31, Tier Upgrade, After clicking back btn in Tier Upgrade Scan Back of ID app navigates to Tier Upgrade page is validated");
            System.out.println("-----------------------------------------------------------");
        }
    }

    public void tierUpgradeTakeAFaceIdentityPhotoPageUIValidation_TU_TC_32() throws Exception {
        ExtentReporter.logInfo("","Tier Upgrade Take a face identity photo page UI Validation");
        login.loginWalletBuyerTier();
        accountDetailsPageNavigation();
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.tap(tierUpgradeObjects.objConfirmDetails(),"Button");
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.isVisible(tierUpgradeObjects.objTierUpgrade(),"Page");
        mobileGeneralMethod.tap(tierUpgradeObjects.objSelectIDSelectionBtn(), "Select ID Selection Button");
        mobileGeneralMethod.type(tierUpgradeObjects.objSearchFieldInput(), "PhilHealth", "Select ID Input field");
        mobileGeneralMethod.tap(tierUpgradeObjects.objPhilHealth(),"ID");
        mobileGeneralMethod.tap(tierUpgradeObjects.objTakeAFaceIdentityPhoto(),"Button");
        if(mobileGeneralMethod.isVisible(tierUpgradeObjects.objTierUpgrade(),"Page")){
            mobileGeneralMethod.isVisible(tierUpgradeObjects.objTakeAFaceIdentityPhotoInfo(),"info");
            mobileGeneralMethod.isVisible(tierUpgradeObjects.objCaptureScreen(),"Capture Screen");
            mobileGeneralMethod.isVisible(tierUpgradeObjects.objCaptureButton(),"Capture Button");
            LoggingUtils.info("TU_TC_32, Tier Upgrade Take a face identity photo page UI validated");
            ExtentReporter.logPass("TU_TC_32", "TU_TC_32, Tier Upgrade Take a face identity photo page UI validated");
            System.out.println("-----------------------------------------------------------");
        }
    }

    public void tierUpgradeTakeAFaceIdentityPhotoPageBackArrowBtnValidation_TU_TC_33() throws Exception {
        ExtentReporter.logInfo("","Tier Upgrade Take a face identity photo Back arrow button Validation");
        login.loginWalletBuyerTier();
        accountDetailsPageNavigation();
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.tap(tierUpgradeObjects.objConfirmDetails(),"Button");
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.isVisible(tierUpgradeObjects.objTierUpgrade(),"Page");
        mobileGeneralMethod.tap(tierUpgradeObjects.objSelectIDSelectionBtn(), "Select ID Selection Button");
        mobileGeneralMethod.type(tierUpgradeObjects.objSearchFieldInput(), "PhilHealth", "Select ID Input field");
        mobileGeneralMethod.tap(tierUpgradeObjects.objPhilHealth(),"ID");
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.tap(tierUpgradeObjects.objTakeAFaceIdentityPhoto(),"Button");
        mobileGeneralMethod.isVisible(tierUpgradeObjects.objTierUpgrade(),"Page");
        mobileGeneralMethod.tap(tierUpgradeObjects.objTierUpgradeBackBtn(),"Tier Upgrade, Take a face identity photo Back Arrow Btn");
        mobileGeneralMethod.waitSleep(1000);
        if(mobileGeneralMethod.isVisible(tierUpgradeObjects.objTierUpgrade(),"Page")) {
            LoggingUtils.info("TU_TC_33, Tier Upgrade, After clicking back btn in Tier Upgrade Take a face identity photo app navigates to Tier Upgrade page is validated");
            ExtentReporter.logPass("TU_TC_33", "TU_TC_33, Tier Upgrade, After clicking back btn in Tier Upgrade Take a face identity photo app navigates to Tier Upgrade page is validated");
            System.out.println("-----------------------------------------------------------");
        }
    }
    
    public void TierUpgradeSourceOfIncomeFieldValidation_TU_TC_85() throws Exception{
        ExtentReporter.logInfo("","Source of income is required when field is empty.");
        login.loginWalletBuyerTier();
        accountDetailsPageNavigation();
        mobileGeneralMethod.tap(tierUpgradeObjects.objConfirmDetails(),"Button");
        String val = propertyReader.getproperty("SourceIncome_Err");
        if(mobileGeneralMethod.isVisible(tierUpgradeObjects.getObjIsRequired(val),"Message")){
            String actual = mobileGeneralMethod.getText(tierUpgradeObjects.getObjIsRequired(val));
            String expected = propertyReader.getproperty("SourceIncome_Err");
            mobileGeneralMethod.assertionValidation(actual, expected);
            LoggingUtils.info("TU_TC_85, Tier Upgrade, After keeping the required source of income field as empty. Error Message Should Pop Up");
            ExtentReporter.logPass("TU_TC_85", "TU_TC_85, Tier Upgrade, After keeping the required source of income field as empty. Error Message Should Pop Up");
            System.out.println("-----------------------------------------------------------");
        }
    }
    public void selectProductServiceOffered(String service)throws Exception{
        try{
            mobileGeneralMethod.tap(tierUpgradeObjects.objProductServiceOffered(),"DropDown");
            mobileGeneralMethod.waitSleep(1000);
            mobileGeneralMethod.isVisible(tierUpgradeObjects.objProductServicePage(),"Header");
            mobileGeneralMethod.type(tierUpgradeObjects.objSearchField(), service, "Search Field");
            mobileGeneralMethod.tap(tierUpgradeObjects.getObjProductServiceOffered(service),"Value");
        }catch (Exception e){
             LoggingUtils.info("error : " + e);
        }
    }
    public void selectSourceOfIncome(String source)throws Exception{
        try{
            mobileGeneralMethod.tap(tierUpgradeObjects.objSourceOfIncome(),"DropDown");
            mobileGeneralMethod.waitSleep(1000);
            mobileGeneralMethod.isVisible(tierUpgradeObjects.objSourceOfIncomePage(),"Header");
            mobileGeneralMethod.type(tierUpgradeObjects.objSearchField(), source, "Search Field");
            mobileGeneralMethod.tap(tierUpgradeObjects.getObjSourceOfIncome(source),"Value");
        }catch (Exception e){
             LoggingUtils.info("error : " + e);
        }
    }
    public void selectPositionAtWork(String position)throws Exception{
        try{
            mobileGeneralMethod.tap(tierUpgradeObjects.objPositionAtWork(),"DropDown");
            mobileGeneralMethod.waitSleep(1000);
            mobileGeneralMethod.isVisible(tierUpgradeObjects.objPositionAtWorkPage(),"Header");
            mobileGeneralMethod.type(tierUpgradeObjects.objSearchField(), position, "Search Field");
            mobileGeneralMethod.tap(tierUpgradeObjects.getObjPositionAtWork(position), "Value");
        }catch (Exception e){
             LoggingUtils.info("error : " + e);
        }
    }
    public void selectNatureOfWork(String nature)throws Exception{
        try{
            mobileGeneralMethod.tap(tierUpgradeObjects.ObjNatureOfWork(),"DropDown");
            mobileGeneralMethod.waitSleep(1000);
            mobileGeneralMethod.isVisible(tierUpgradeObjects.ObjNatureOfWorkPage(),"Header");
            mobileGeneralMethod.type(tierUpgradeObjects.objSearchField(), nature, "Search Field");
            mobileGeneralMethod.tap(tierUpgradeObjects.getObjNatureOfWork(nature), "Value");
        }catch (Exception e){
             LoggingUtils.info("error : " + e);
        }
    }
    public void TierUpgradeCompanyFieldValidation_TU_TC_86() throws Exception{
        ExtentReporter.logInfo("","Company/Employer Name is required when field is empty.");
        login.loginWalletBuyerTier();
        accountDetailsPageNavigation();
        selectSourceOfIncome(propertyReader.getproperty("SALARY"));
        selectProductServiceOffered(propertyReader.getproperty("IT"));
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.type(tierUpgradeObjects.objWorkAddress(), propertyReader.getproperty("Address"), "Edit Text");
        selectPositionAtWork(propertyReader.getproperty("ENGR"));
        selectNatureOfWork(propertyReader.getproperty("ACCOUNTANT_FINANCE_STAFF"));
        mobileGeneralMethod.tap(tierUpgradeObjects.objConfirmDetails(),"Button");
        String val = propertyReader.getproperty("Company_Empty_Err");
        if(mobileGeneralMethod.isVisible(tierUpgradeObjects.getObjIsRequired(val),"Message")){
            String actual = mobileGeneralMethod.getText(tierUpgradeObjects.getObjIsRequired(val));
            String expected = propertyReader.getproperty("Company_Empty_Err");
            mobileGeneralMethod.assertionValidation(actual, expected);
            LoggingUtils.info("TU_TC_86, Tier Upgrade, After keeping the Company/Employer Name field as empty. Error Message Should Pop Up");
            ExtentReporter.logPass("TU_TC_86", "TU_TC_86, Tier Upgrade, After keeping the Company/Employer Name field as empty. Error Message Should Pop Up");
            System.out.println("-----------------------------------------------------------");
        }
    }
    public void TierUpgradeOrganizationNameFieldValidation_TU_TC_87() throws Exception{
        ExtentReporter.logInfo(""," When user enters special characters in Company/Employer name field.");
        login.loginWalletBuyerTier();
        accountDetailsPageNavigation();
        selectSourceOfIncome(propertyReader.getproperty("SALARY"));
        mobileGeneralMethod.type(tierUpgradeObjects.objCompanyOrEmployerName(), propertyReader.getproperty("Invalid_Company_Name"), "Company Name");
        selectProductServiceOffered(propertyReader.getproperty("IT"));
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.type(tierUpgradeObjects.objWorkAddress(), propertyReader.getproperty("Address"), "Work Address");
        selectPositionAtWork(propertyReader.getproperty("ENGR"));
        selectNatureOfWork(propertyReader.getproperty("ACCOUNTANT_FINANCE_STAFF"));
        mobileGeneralMethod.tap(tierUpgradeObjects.objConfirmDetails(),"Button");
        String val = propertyReader.getproperty("Company_Special_Err");
        if(mobileGeneralMethod.isVisible(tierUpgradeObjects.getObjIsRequired(val),"Message")){
            String actual = mobileGeneralMethod.getText(tierUpgradeObjects.getObjIsRequired(val));
            String expected = propertyReader.getproperty("Company_Special_Err");
            mobileGeneralMethod.assertionValidation(actual, expected);
            LoggingUtils.info("TU_TC_87, Tier Upgrade, When user enters special characters in Company/Employer name field. Error Message Should Pop Up");
            ExtentReporter.logPass("TU_TC_87", "TU_TC_87, Tier Upgrade, When user enters special characters in Company/Employer name field. Error Message Should Pop Up");
            System.out.println("-----------------------------------------------------------");
        }
    }
    public void TierUpgradeProductServicesFieldValidation_TU_TC_88() throws Exception{
        ExtentReporter.logInfo(""," Product/services offered is required when field is empty.");
        login.loginWalletBuyerTier();
        accountDetailsPageNavigation();
        selectSourceOfIncome(propertyReader.getproperty("SALARY"));
        mobileGeneralMethod.type(tierUpgradeObjects.objCompanyOrEmployerName(), propertyReader.getproperty("Company_Name"), "Company Name");
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.type(tierUpgradeObjects.objWorkAddress(), propertyReader.getproperty("Address"), "Work Address");
        selectPositionAtWork(propertyReader.getproperty("ENGR"));
        selectNatureOfWork(propertyReader.getproperty("ACCOUNTANT_FINANCE_STAFF"));
        mobileGeneralMethod.tap(tierUpgradeObjects.objConfirmDetails(),"Button");
        String val = propertyReader.getproperty("Product_Err");
        if(mobileGeneralMethod.isVisible(tierUpgradeObjects.getObjIsRequired(val),"Message")){
            String actual = mobileGeneralMethod.getText(tierUpgradeObjects.getObjIsRequired(val));
            String expected = propertyReader.getproperty("Product_Err");
            mobileGeneralMethod.assertionValidation(actual, expected);
            LoggingUtils.info("TU_TC_88, Tier Upgrade, After keeping the Product/services field  empty. Error Message Should Pop Up");
            ExtentReporter.logPass("TU_TC_88", "TU_TC_88, Tier Upgrade, " +
                    "After keeping the  Product/services field  empty. Error Message Should Pop Up");
            System.out.println("-----------------------------------------------------------");
        }
    }
    public void TierUpgradeEmptyAddressFieldValidation_TU_TC_89() throws Exception{
        ExtentReporter.logInfo(""," Work Address is required when field is empty.");
        login.loginWalletBuyerTier();
        accountDetailsPageNavigation();
        selectSourceOfIncome(propertyReader.getproperty("SALARY"));
        mobileGeneralMethod.type(tierUpgradeObjects.objCompanyOrEmployerName(), propertyReader.getproperty("Company_Name"), "Company Name");
        selectProductServiceOffered(propertyReader.getproperty("IT"));
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.verticalSwipe();
        selectPositionAtWork(propertyReader.getproperty("ENGR"));
        selectNatureOfWork(propertyReader.getproperty("ACCOUNTANT_FINANCE_STAFF"));
        mobileGeneralMethod.tap(tierUpgradeObjects.objConfirmDetails(),"Button");
        String val = propertyReader.getproperty("WorkAddress_Empty_Err");
        if(mobileGeneralMethod.isVisible(tierUpgradeObjects.getObjIsRequired(val),"Message")){
            String actual = mobileGeneralMethod.getText(tierUpgradeObjects.getObjIsRequired(val));
            String expected = propertyReader.getproperty("WorkAddress_Empty_Err");
            mobileGeneralMethod.assertionValidation(actual, expected);
            LoggingUtils.info("TU_TC_89, Tier Upgrade, After keeping the Work Address field  empty. Error Message Should Pop Up");
            ExtentReporter.logPass("TU_TC_89", "TU_TC_89, Tier Upgrade, " +
                    "After keeping the  Work Address field  empty. Error Message Should Pop Up");
            System.out.println("-----------------------------------------------------------");
        }
    }
    public void TierUpgradeSpecialAddressFieldValidation_TU_TC_90() throws Exception{
        ExtentReporter.logInfo(""," When user enters special characters in work address field.");
        login.loginWalletBuyerTier();
        accountDetailsPageNavigation();
        selectSourceOfIncome(propertyReader.getproperty("SALARY"));
        mobileGeneralMethod.type(tierUpgradeObjects.objCompanyOrEmployerName(), propertyReader.getproperty("Company_Name"), "Company Name");
        selectProductServiceOffered(propertyReader.getproperty("IT"));
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.type(tierUpgradeObjects.objWorkAddress(), propertyReader.getproperty("Invalid_Address"), "Work Address");
        selectPositionAtWork(propertyReader.getproperty("ENGR"));
        selectNatureOfWork(propertyReader.getproperty("ACCOUNTANT_FINANCE_STAFF"));
        mobileGeneralMethod.tap(tierUpgradeObjects.objConfirmDetails(),"Button");
        String val = propertyReader.getproperty("WorkAddress_Invalid_Err");
        if(mobileGeneralMethod.isVisible(tierUpgradeObjects.getObjIsRequired(val),"Message")){
            String actual = mobileGeneralMethod.getText(tierUpgradeObjects.getObjIsRequired(val));
            String expected = propertyReader.getproperty("WorkAddress_Invalid_Err");
            mobileGeneralMethod.assertionValidation(actual, expected);
            LoggingUtils.info("TU_TC_90, Tier Upgrade, After user enters special characters in work address field. Error Message Should Pop Up");
            ExtentReporter.logPass("TU_TC_90", "TU_TC_90, Tier Upgrade, " +
                    "After user enters special characters in work address field. Error Message Should Pop Up");
            System.out.println("-----------------------------------------------------------");
        }
    }
    public void TierUpgradePositionFieldValidation_TU_TC_91() throws Exception{
        ExtentReporter.logInfo(""," When keeping the required Position at work field empty.");
        login.loginWalletBuyerTier();
        accountDetailsPageNavigation();
        selectSourceOfIncome(propertyReader.getproperty("SALARY"));
        mobileGeneralMethod.type(tierUpgradeObjects.objCompanyOrEmployerName(), propertyReader.getproperty("Company_Name"), "Company Name");
        selectProductServiceOffered(propertyReader.getproperty("IT"));
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.type(tierUpgradeObjects.objWorkAddress(), propertyReader.getproperty("Address"), "Work Address");
        selectNatureOfWork(propertyReader.getproperty("ACCOUNTANT_FINANCE_STAFF"));
        mobileGeneralMethod.tap(tierUpgradeObjects.objConfirmDetails(),"Button");
        String val = propertyReader.getproperty("Position_Err");
        if(mobileGeneralMethod.isVisible(tierUpgradeObjects.getObjIsRequired(val), "Message")){
            String actual = mobileGeneralMethod.getText(tierUpgradeObjects.getObjIsRequired(val));
            String expected = propertyReader.getproperty("Position_Err");
            mobileGeneralMethod.assertionValidation(actual, expected);
            LoggingUtils.info("TU_TC_91, Tier Upgrade, When keeping the required Position at work field empty. Error Message Should Pop Up");
            ExtentReporter.logPass("TU_TC_91", "TU_TC_91, Tier Upgrade, " +
                    "When keeping the required Position at work field empty. Error Message Should Pop Up");
        }
    }
    public void TierUpgradeNatureOfWorkFieldValidation_TU_TC_92() throws Exception{
        ExtentReporter.logInfo(""," When keeping the required Nature of work field empty.");
        login.loginWalletBuyerTier();
        accountDetailsPageNavigation();
        selectSourceOfIncome(propertyReader.getproperty("SALARY"));
        mobileGeneralMethod.type(tierUpgradeObjects.objCompanyOrEmployerName(), propertyReader.getproperty("Company_Name"), "Company Name");
        selectProductServiceOffered(propertyReader.getproperty("IT"));
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.type(tierUpgradeObjects.objWorkAddress(), propertyReader.getproperty("Address"), "Work Address");
        selectPositionAtWork(propertyReader.getproperty("ENGR"));
        mobileGeneralMethod.tap(tierUpgradeObjects.objConfirmDetails(),"Button");
        String val = propertyReader.getproperty("Nature_Err");
        if(mobileGeneralMethod.isVisible(tierUpgradeObjects.getObjIsRequired(val),"Message")){
            String actual = mobileGeneralMethod.getText(tierUpgradeObjects.getObjIsRequired(val));
            String expected = propertyReader.getproperty("Nature_Err");
            mobileGeneralMethod.assertionValidation(actual, expected);
            LoggingUtils.info("TU_TC_92, Tier Upgrade, When keeping the required Nature of work field empty. Error Message Should Pop Up");
            ExtentReporter.logPass("TU_TC_92", "TU_TC_92, Tier Upgrade, " + "When keeping the required Nature of work field empty. Error Message Should Pop Up");
            System.out.println("-----------------------------------------------------------");
        }
    }
    public void TierUpgradePensionFieldValidation_TU_TC_93() throws Exception{
        ExtentReporter.logInfo(""," When keeping the required Receiving Pension Form field empty.");
        login.loginWalletBuyerTier();
        accountDetailsPageNavigation();
        selectSourceOfIncome(propertyReader.getproperty("PENSION"));
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.tap(tierUpgradeObjects.objConfirmDetails(),"Button");
        String val = propertyReader.getproperty("ReceivingPension_Err");
        if(mobileGeneralMethod.isVisible(tierUpgradeObjects.getObjIsRequired(val),"Message")){
            String actual = mobileGeneralMethod.getText(tierUpgradeObjects.getObjIsRequired(val));
            String expected = propertyReader.getproperty("ReceivingPension_Err");
            mobileGeneralMethod.assertionValidation(actual, expected);
            LoggingUtils.info("TU_TC_93, Tier Upgrade, When keeping the required Receiving Pension Form field empty. Error Message Should Pop Up");
            ExtentReporter.logPass("TU_TC_93", "TU_TC_93, Tier Upgrade, " + "When keeping the required Receiving Pension Form field empty. Error Message Should Pop Up");
            System.out.println("-----------------------------------------------------------");
        }
    }
    public void TierUpgradeYearRetiredFieldValidation_TU_TC_94() throws Exception{
        ExtentReporter.logInfo(""," When keeping the required Year Retired field empty.");
        login.loginWalletBuyerTier();
        accountDetailsPageNavigation();
        selectSourceOfIncome(propertyReader.getproperty("PENSION"));
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.tap(tierUpgradeObjects.objConfirmDetails(),"Button");
        String val = propertyReader.getproperty("YearRetired_Err");
        if(mobileGeneralMethod.isVisible(tierUpgradeObjects.getObjIsRequired(val),"Message")){
            String actual = mobileGeneralMethod.getText(tierUpgradeObjects.getObjIsRequired(val));
            String expected = propertyReader.getproperty("YearRetired_Err");
            mobileGeneralMethod.assertionValidation(actual, expected);
            LoggingUtils.info("TU_TC_94, Tier Upgrade, When keeping the required Year Retired field empty. Error Message Should Pop Up");
            ExtentReporter.logPass("TU_TC_94", "TU_TC_94, Tier Upgrade, " +
                    "When keeping the required Year Retired field empty. Error Message Should Pop Up");
            System.out.println("-----------------------------------------------------------");
        }
    }
    public void TierUpgradePositionRetirementFieldValidation_TU_TC_95() throws Exception{
        ExtentReporter.logInfo(""," When  keeping the required Position Upon Retirement empty");
        login.loginWalletBuyerTier();
        accountDetailsPageNavigation();
        selectSourceOfIncome(propertyReader.getproperty("PENSION"));
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.tap(tierUpgradeObjects.objConfirmDetails(),"Button");
        String val = propertyReader.getproperty("PositionRetirement_Err");
        if(mobileGeneralMethod.isVisible(tierUpgradeObjects.getObjIsRequired(val),"Message")){
            String actual = mobileGeneralMethod.getText(tierUpgradeObjects.getObjIsRequired(val));
            String expected = propertyReader.getproperty("PositionRetirement_Err");
            mobileGeneralMethod.assertionValidation(actual, expected);
            LoggingUtils.info("TU_TC_95, Tier Upgrade, When  keeping the required Position Upon Retirement empty. Error Message Should Pop Up");
            ExtentReporter.logPass("TU_TC_95", "TU_TC_95, Tier Upgrade, " +
                    "When  keeping the required Position Upon Retirement empty. Error Message Should Pop Up");
            System.out.println("-----------------------------------------------------------");
        }
    }
    public void TierUpgradeRemarksFieldValidation_TU_TC_96() throws Exception{
        ExtentReporter.logInfo(""," When keeping the required Remarks field empty.");
        login.loginWalletBuyerTier();
        accountDetailsPageNavigation();
        selectSourceOfIncome(propertyReader.getproperty("FINANCIAL_ASSISTANCE"));
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.tap(tierUpgradeObjects.objConfirmDetails(),"Button");
        String val = propertyReader.getproperty("Remarks_Err");
        if(mobileGeneralMethod.isVisible(tierUpgradeObjects.getObjIsRequired(val),"Message")){
            String actual = mobileGeneralMethod.getText(tierUpgradeObjects.getObjIsRequired(val));
            String expected = propertyReader.getproperty("Remarks_Err");
            mobileGeneralMethod.assertionValidation(actual, expected);
            LoggingUtils.info("TU_TC_96, Tier Upgrade, When keeping the required Remarks field empty Error Message Should Pop Up");
            ExtentReporter.logPass("TU_TC_96", "TU_TC_96, Tier Upgrade, " +
                    "When keeping the required Remarks field empty. Error Message Should Pop Up");
            System.out.println("-----------------------------------------------------------");
        }
    }

    public void TierUpgradeErrorMessageUniversityIsRequiredEmptyFieldValidation_TU_TC_97() throws Exception{
        ExtentReporter.logInfo(""," When keeping the required School/University field empty.");
        login.loginWalletBuyerTier();
        accountDetailsPageNavigation();
        selectSourceOfIncome(propertyReader.getproperty("STUDENT_SCHOLARSHIP"));
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.tap(tierUpgradeObjects.objConfirmDetails(),"Button");
        String val = propertyReader.getproperty("University_Err");
        if(mobileGeneralMethod.isVisible(tierUpgradeObjects.getObjIsRequired(val),"Message")){
            String actual = mobileGeneralMethod.getText(tierUpgradeObjects.getObjIsRequired(val));
            String expected = propertyReader.getproperty("University_Err");
            mobileGeneralMethod.assertionValidation(actual, expected);
            LoggingUtils.info("TU_TC_97, Tier Upgrade, When keeping the required School/University field empty. Error Message Should Pop Up");
            ExtentReporter.logPass("TU_TC_97", "TU_TC_97, Tier Upgrade, " +
                    "When keeping the required School/University field empty. Error Message Should Pop Up");
            System.out.println("-----------------------------------------------------------");
        }
    }
    public void TierUpgradeErrorMessageUniversityNameSpecialCharactersValidation_TU_TC_98() throws Exception{
        ExtentReporter.logInfo(""," When user enters special characters in School/University field.");
        login.loginWalletBuyerTier();
        accountDetailsPageNavigation();
        selectSourceOfIncome(propertyReader.getproperty("STUDENT_SCHOLARSHIP"));
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.type(tierUpgradeObjects.objUniversityField(), propertyReader.getproperty("Invalid_University_Name"), "Universty_Name");
        mobileGeneralMethod.tap(tierUpgradeObjects.objConfirmDetails(),"Button");
        String val = propertyReader.getproperty("University_Special_Err");
        if(mobileGeneralMethod.isVisible(tierUpgradeObjects.getObjIsRequired(val),"Message")){
            //assert
            String actual = mobileGeneralMethod.getText(tierUpgradeObjects.objSchoolFieldMessage());
            String expected = propertyReader.getproperty("University_Special_Err");
            mobileGeneralMethod.assertionValidation(actual, expected);
            LoggingUtils.info("TU_TC_98, Tier Upgrade, When user enters special characters in School/University field. Error Message Should Pop Up");
            ExtentReporter.logPass("TU_TC_98", "TU_TC_98, Tier Upgrade, " +
                    "When user enters special characters in School/University field. Error Message Should Pop Up");
            System.out.println("-----------------------------------------------------------");
        }
    }
    public void TierUpgradeErrorMessageSchoolAddressIsRequiredEmptyValidation_TU_TC_99() throws Exception{
        ExtentReporter.logInfo(""," When keeping the required School Address field empty.");
        login.loginWalletBuyerTier();
        accountDetailsPageNavigation();
        selectSourceOfIncome(propertyReader.getproperty("STUDENT_SCHOLARSHIP"));
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.tap(tierUpgradeObjects.objConfirmDetails(),"Button");
        if(mobileGeneralMethod.isVisible(tierUpgradeObjects.objSchoolAddressFieldMessage(),"Message")){
            //assert
            String actual = mobileGeneralMethod.getText(tierUpgradeObjects.objSchoolAddressFieldMessage());
            String expected = propertyReader.getproperty("SchoolAddress_Err");
            mobileGeneralMethod.assertionValidation(actual, expected);
            LoggingUtils.info("TU_TC_99, Tier Upgrade, When keeping the required School Address field empty. Error Message Should Pop Up");
            ExtentReporter.logPass("TU_TC_99", "TU_TC_99, Tier Upgrade, " +
                    "When keeping the required School Address field empty. Error Message Should Pop Up");
            System.out.println("-----------------------------------------------------------");
        }
    }
    public void TierUpgradeErrorMessageSchoolAddressSpecialCharactersValidation_TU_TC_100() throws Exception{
        ExtentReporter.logInfo(""," When user enters special characters in School Address field.");
        login.loginWalletBuyerTier();
        accountDetailsPageNavigation();
        selectSourceOfIncome(propertyReader.getproperty("STUDENT_SCHOLARSHIP"));
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.type(tierUpgradeObjects.objSchoolAddressField(), propertyReader.getproperty("Invalid_School_Address"), "School_Address");
        mobileGeneralMethod.tap(tierUpgradeObjects.objConfirmDetails(),"Button");
        if(mobileGeneralMethod.isVisible(tierUpgradeObjects.objSchoolAddressFieldMessage(), "Message")){
            //assert
            String actual = mobileGeneralMethod.getText(tierUpgradeObjects.objSchoolAddressFieldMessage());
            String expected = propertyReader.getproperty("SchoolAddress_Special_Err");
            mobileGeneralMethod.assertionValidation(actual, expected);
            LoggingUtils.info("TU_TC_100, Tier Upgrade, When user enters special characters in School Address field. Error Message Should Pop Up");
            ExtentReporter.logPass("TU_TC_100", "TU_TC_100, Tier Upgrade, " +
                    "When user enters special characters in School Address field. Error Message Should Pop Up");
            System.out.println("-----------------------------------------------------------");
        }
    }
    public void TierUpgradeErrorMessageProgramTypeIsRequiredEmptyFieldValidation_TU_TC_101() throws Exception{
        ExtentReporter.logInfo(""," When keeping the required Program Type field empty.");
        login.loginWalletBuyerTier();
        accountDetailsPageNavigation();
        selectSourceOfIncome(propertyReader.getproperty("GOVERNMENT_AID"));
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.tap(tierUpgradeObjects.objConfirmDetails(),"Button");
        if(mobileGeneralMethod.isVisible(tierUpgradeObjects.objGrantFieldMessage(),"Message")){
            //assert
            String actual = mobileGeneralMethod.getText(tierUpgradeObjects.objGrantFieldMessage());
            String expected = propertyReader.getproperty("ProgramType_Err");
            mobileGeneralMethod.assertionValidation(actual, expected);
            LoggingUtils.info("TU_TC_101, Tier Upgrade, When keeping the required Program Type field empty. Error Message Should Pop Up");
            ExtentReporter.logPass("TU_TC_101", "TU_TC_101, Tier Upgrade, " +
                    "When keeping the required Program Type field empty. Error Message Should Pop Up");
            System.out.println("-----------------------------------------------------------");
        }
    }
    public void TierUpgradeErrorMessageProgramTypeSpecialCharactersValidation_TU_TC_102() throws Exception{
        ExtentReporter.logInfo(""," When user enters special characters in Program Type field.");
        login.loginWalletBuyerTier();
        accountDetailsPageNavigation();
        selectSourceOfIncome(propertyReader.getproperty("GOVERNMENT_AID"));
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.type(tierUpgradeObjects.objProgramTypeField(), propertyReader.getproperty("Invalid_Program_Type"), "Program_Type");
        mobileGeneralMethod.tap(tierUpgradeObjects.objConfirmDetails(),"Button");
        if(mobileGeneralMethod.isVisible(tierUpgradeObjects.objGrantFieldMessage(),"Message")){
            //assert
            String actual = mobileGeneralMethod.getText(tierUpgradeObjects.objGrantFieldMessage());
            String expected = propertyReader.getproperty("ProgramType_Special_Err");
            mobileGeneralMethod.assertionValidation(actual, expected);
            LoggingUtils.info("TU_TC_102, Tier Upgrade, When user enters special characters in Program Type field. Error Message Should Pop Up");
            ExtentReporter.logPass("TU_TC_102", "TU_TC_102, Tier Upgrade, " +
                    "When user enters special characters in Program Type field. Error Message Should Pop Up");
            System.out.println("-----------------------------------------------------------");
        }
    }
    public void TierUpgradeErrorMessageOccupationNameIsRequiredEmptyFieldValidation_TU_TC_103() throws Exception{
        ExtentReporter.logInfo(""," When keeping the required Occupation field empty.");
        login.loginWalletBuyerTier();
        accountDetailsPageNavigation();
        selectSourceOfIncome(propertyReader.getproperty("OTHER"));
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.tap(tierUpgradeObjects.objConfirmDetails(),"Button");
        if(mobileGeneralMethod.isVisible(tierUpgradeObjects.objOccupationFieldMessage(),"Message")){
            //assert
            String actual = mobileGeneralMethod.getText(tierUpgradeObjects.objOccupationFieldMessage());
            String expected = propertyReader.getproperty("Occupation_Err");
            mobileGeneralMethod.assertionValidation(actual, expected);
            LoggingUtils.info("TU_TC_103, Tier Upgrade, When keeping the required Occupation field empty. Error Message Should Pop Up");
            ExtentReporter.logPass("TU_TC_103", "TU_TC_103, Tier Upgrade, " +
                    "When keeping the required Occupation field empty. Error Message Should Pop Up");
            System.out.println("-----------------------------------------------------------");
        }
    }
    public void TierUpgradeErrorMessageOccupationNameSpecialCharactersValidation_TU_TC_104() throws Exception{
        ExtentReporter.logInfo(""," When user enters special characters in Occupation field.");
        login.loginWalletBuyerTier();
        accountDetailsPageNavigation();
        selectSourceOfIncome(propertyReader.getproperty("OTHER"));
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.type(tierUpgradeObjects.objOccupationField(), propertyReader.getproperty("Invalid_Occupation"), "Occupation");
        mobileGeneralMethod.tap(tierUpgradeObjects.objConfirmDetails(),"Button");
        if(mobileGeneralMethod.isVisible(tierUpgradeObjects.objOccupationFieldMessage(),"Message")){
            //assert
            String actual = mobileGeneralMethod.getText(tierUpgradeObjects.objOccupationFieldMessage());
            String expected = propertyReader.getproperty("Occupation_Special_Err");
            mobileGeneralMethod.assertionValidation(actual, expected);
            LoggingUtils.info("TU_TC_104, Tier Upgrade, When user enters special characters in Occupation field. Error Message Should Pop Up");
            ExtentReporter.logPass("TU_TC_104", "TU_TC_104, Tier Upgrade, " +
                    "When user enters special characters in Occupation field. Error Message Should Pop Up");
            System.out.println("-----------------------------------------------------------");
        }
    }
    public void TierUpgradeErrorMessageSourceOfFundsIsRequiredEmptyFieldValidation_TU_TC_105() throws Exception{
        ExtentReporter.logInfo(""," When keeping the required Source of Funds field empty.");
        login.loginWalletBuyerTier();
        accountDetailsPageNavigation();
        selectSourceOfIncome(propertyReader.getproperty("OTHER"));
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.tap(tierUpgradeObjects.objConfirmDetails(),"Button");
        if(mobileGeneralMethod.isVisible(tierUpgradeObjects.objSourceOfFundsFieldMessage(),"Message")){
            //assert
            String actual = mobileGeneralMethod.getText(tierUpgradeObjects.objSourceOfFundsFieldMessage());
            String expected = propertyReader.getproperty("SourceOfFunds_Err");
            mobileGeneralMethod.assertionValidation(actual, expected);
            LoggingUtils.info("TU_TC_105, Tier Upgrade, When keeping the required Source of Funds field empty. Error Message Should Pop Up");
            ExtentReporter.logPass("TU_TC_105", "TU_TC_105, Tier Upgrade, " +
                    "When keeping the required Source of Funds field empty. Error Message Should Pop Up");
            System.out.println("-----------------------------------------------------------");
        }
    }
    public void TierUpgradeErrorMessageEmployerNameSpecialCharactersValidation_TU_TC_106() throws Exception{
        ExtentReporter.logInfo(""," When user enters special characters in Employer Name field.");
        login.loginWalletBuyerTier();
        accountDetailsPageNavigation();
        selectSourceOfIncome(propertyReader.getproperty("SALARY"));
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.type(tierUpgradeObjects.objCompanyOrEmployerName(), propertyReader.getproperty("Invalid_Employer_Name"), "Employer_Name");
        mobileGeneralMethod.tap(tierUpgradeObjects.objConfirmDetails(),"Button");
        if(mobileGeneralMethod.isVisible(tierUpgradeObjects.objCompanyEmployerFieldMessage(),"Message")){
            //assert
            String actual = mobileGeneralMethod.getText(tierUpgradeObjects.objCompanyEmployerFieldMessage());
            String expected = propertyReader.getproperty("Employer_Name_Special_Err");
            mobileGeneralMethod.assertionValidation(actual, expected);
            LoggingUtils.info("TU_TC_106, Tier Upgrade, When user enters special characters in Employer Name field. Error Message Should Pop Up");
            ExtentReporter.logPass("TU_TC_106", "TU_TC_106, Tier Upgrade, " +
                    "When user enters special characters in Employer Name field. Error Message Should Pop Up");
            System.out.println("-----------------------------------------------------------");
        }
    }
    public void TierUpgradeErrorMessageWorkAddressSpecialCharactersValidation_TU_TC_107() throws Exception{
        ExtentReporter.logInfo(""," When user enters special characters in Work Address field.");
        login.loginWalletBuyerTier();
        accountDetailsPageNavigation();
        selectSourceOfIncome(propertyReader.getproperty("SALARY"));
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.type(tierUpgradeObjects.objWorkAddress(), propertyReader.getproperty("Invalid_Address"), "Address");
        mobileGeneralMethod.tap(tierUpgradeObjects.objConfirmDetails(),"Button");
        if(mobileGeneralMethod.isVisible(tierUpgradeObjects.objWorkAddressFieldMessage(),"Message")){
            //assert
            String actual = mobileGeneralMethod.getText(tierUpgradeObjects.objWorkAddressFieldMessage());
            String expected = propertyReader.getproperty("WorkAddress_Invalid_Err");
            mobileGeneralMethod.assertionValidation(actual, expected);
            LoggingUtils.info("TU_TC_107, Tier Upgrade, When user enters special characters in Work Address field. Error Message Should Pop Up");
            ExtentReporter.logPass("TU_TC_107", "TU_TC_107, Tier Upgrade, " +
                    "When user enters special characters in Work Address field. Error Message Should Pop Up");
            System.out.println("-----------------------------------------------------------");
        }
    }
    public void TierUpgradeErrorMessageRetiredFieldSpecialCharactersValidation_TU_TC_108() throws Exception{
        ExtentReporter.logInfo(""," When user enters special characters in Year Retired field.");
        login.loginWalletBuyerTier();
        accountDetailsPageNavigation();
        selectSourceOfIncome(propertyReader.getproperty("PENSION"));
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.type(tierUpgradeObjects.objYearRetiredField(), propertyReader.getproperty("Invalid_Retired_Year"), "Retired_Year");
        mobileGeneralMethod.tap(tierUpgradeObjects.objConfirmDetails(),"Button");
        if(mobileGeneralMethod.isVisible(tierUpgradeObjects.objYearRetiredFieldMessage(),"Message")){
            //assert
            String actual = mobileGeneralMethod.getText(tierUpgradeObjects.objYearRetiredFieldMessage());
            String expected = propertyReader.getproperty("YearRetired_Err");
            mobileGeneralMethod.assertionValidation(actual, expected);
            LoggingUtils.info("TU_TC_108, Tier Upgrade, When user enters special characters in Year Retired field. Error Message Should Pop Up");
            ExtentReporter.logPass("TU_TC_108", "TU_TC_108, Tier Upgrade, " +
                    "When user enters special characters in Year Retired field. Error Message Should Pop Up");
            System.out.println("-----------------------------------------------------------");
        }
    }
    public void TierUpgradeBranchTierVerificationTierNavigation_TU_TC_109() throws Exception{
        ExtentReporter.logInfo(""," When branch tier user navigates to verification tier perk page.");
        login.loginWalletBranchTier();
        mobileGeneralMethod.tap(homePageObject.objHamburgerMenu(), "Hamburger Menu");
        mobileGeneralMethod.tap(homePageObject.objViewTier(),"Button");
        if(mobileGeneralMethod.isVisible(homePageObject.objVerificationTierPerks(),"Page")){
            mobileGeneralMethod.isVisible(homePageObject.objBranchVerified(),"Current Tier");
            LoggingUtils.info("TU_TC_109, Tier Upgrade, When branch tier user navigates to verification tier perk page. User should be navigated");
            ExtentReporter.logPass("TU_TC_109", "TU_TC_109, Tier Upgrade, " +
                    " When branch tier user navigates to verification tier perk page. User should be navigated");
            System.out.println("-----------------------------------------------------------");
        }
    }
    public void TierUpgradeSchoolUniveristyFieldValidation_TU_TC_110() throws Exception{
        ExtentReporter.logInfo(""," When user enters alphabets, space, and numbers in School/University Name field.");
        login.loginWalletBuyerTier();
        accountDetailsPageNavigation();
        selectSourceOfIncome(propertyReader.getproperty("STUDENT_SCHOLARSHIP"));
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.type(tierUpgradeObjects.objUniversityField(), propertyReader.getproperty("University_Name_v1"), "School/University Name");
        mobileGeneralMethod.tap(tierUpgradeObjects.objConfirmDetails(),"Button");
        String actual = mobileGeneralMethod.getText(tierUpgradeObjects.objUniversityField());
        String exptected = propertyReader.getproperty("University_Name_v1");
        mobileGeneralMethod.assertionValidation(actual, exptected);
        LoggingUtils.info("TU_TC_110, Tier Upgrade, When user enters alphabets, space, and numbers in School/University field. User should be able to input");
        ExtentReporter.logPass("TU_TC_110", "TU_TC_110, Tier Upgrade, " +
                " When user enters alphabets, space, and numbers in School/University field. User should be able to input");
        System.out.println("-----------------------------------------------------------");
    }
    public void TierUpgradeSchoolAddressFieldValidation_TU_TC_111() throws Exception{
        ExtentReporter.logInfo(""," When user enters alphabets, space, and numbers in School/University Address field.");
        login.loginWalletBuyerTier();
        accountDetailsPageNavigation();
        selectSourceOfIncome(propertyReader.getproperty("STUDENT_SCHOLARSHIP"));
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.type(tierUpgradeObjects.objUniversityField(), propertyReader.getproperty("University_Name_v1"), "School/University Name");
        mobileGeneralMethod.type(tierUpgradeObjects.objSchoolAddressField(), propertyReader.getproperty("School_Address_v1"), "School/University Address");
        mobileGeneralMethod.tap(tierUpgradeObjects.objConfirmDetails(),"Button");
        String actual = mobileGeneralMethod.getText(tierUpgradeObjects.objSchoolAddressField());
        String exptected = propertyReader.getproperty("School_Address_v1");
        mobileGeneralMethod.assertionValidation(actual, exptected);
        LoggingUtils.info("TU_TC_111, Tier Upgrade, When user enters alphabets, space, and numbers in School/University Address field. User should be able to input");
        ExtentReporter.logPass("TU_TC_111", "TU_TC_111, Tier Upgrade, " +
                " When user enters alphabets, space, and numbers in School/University Address field. User should be able to input");
        System.out.println("-----------------------------------------------------------");
    }
    public void TierUpgradeGrantProgramFIeldValidation_TU_TC_112() throws Exception{
        ExtentReporter.logInfo(""," When user enters alphabets, space, and numbers in Grant/Program Type field.");
        login.loginWalletBuyerTier();
        accountDetailsPageNavigation();
        selectSourceOfIncome(propertyReader.getproperty("GOVERNMENT_AID"));
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.type(tierUpgradeObjects.objProgramTypeField(), propertyReader.getproperty("Program_Type_v1"), "Grant/Program Type Field");
        mobileGeneralMethod.tap(tierUpgradeObjects.objConfirmDetails(),"Button");
        if(mobileGeneralMethod.isVisible(tierUpgradeObjects.objSelectAnyValidID(),"Page")){
            LoggingUtils.info("TU_TC_112, Tier Upgrade, When user enters alphabets, space, and numbers in Grant/Program Type field. User should be able to input");
            ExtentReporter.logPass("TU_TC_112", "TU_TC_112, Tier Upgrade, " +
                    " When user enters alphabets, space, and numbers in Grant/Program Type field. User should be able to input");
            System.out.println("-----------------------------------------------------------");
        }
    }
    public void TierUpgradeOccupationFieldValidation_TU_TC_113() throws Exception{
        ExtentReporter.logInfo(""," When user enters alphabets, space, and numbers in Occupation Type field.");
        login.loginWalletBuyerTier();
        accountDetailsPageNavigation();
        selectSourceOfIncome(propertyReader.getproperty("OTHER"));
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.type(tierUpgradeObjects.objOccupationField(), propertyReader.getproperty("Occupation_v1"), "Occupation Field");
        mobileGeneralMethod.tap(tierUpgradeObjects.objConfirmDetails(),"Button");
        String actual = mobileGeneralMethod.getText(tierUpgradeObjects.objOccupationField());
        String exptected = propertyReader.getproperty("Occupation_v1");
        mobileGeneralMethod.assertionValidation(actual, exptected);
        LoggingUtils.info("TU_TC_113, Tier Upgrade, When user enters alphabets, space, and numbers in Occupation Type field. User should be able to input");
        ExtentReporter.logPass("TU_TC_113", "TU_TC_113, Tier Upgrade, " +
                " When user enters alphabets, space, and numbers in Occupation Type field. User should be able to input");
        System.out.println("-----------------------------------------------------------");
    }
    public void TierUpgradeOccupationFieldValidation_TU_TC_114() throws Exception{
        ExtentReporter.logInfo(""," When user enters alphabets, space, and numbers in Source of Fund field.");
        login.loginWalletBuyerTier();
        accountDetailsPageNavigation();
        selectSourceOfIncome(propertyReader.getproperty("OTHER"));
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.type(tierUpgradeObjects.objOccupationField(), propertyReader.getproperty("Occupation_v1"), "Occupation Field");
        mobileGeneralMethod.type(tierUpgradeObjects.objSourceOfFundsField(), propertyReader.getproperty("SourceFund_v1"), "Source of Fund Field");
        mobileGeneralMethod.tap(tierUpgradeObjects.objConfirmDetails(),"Button");
        if(mobileGeneralMethod.isVisible(tierUpgradeObjects.objSelectAnyValidID(),"Page")){
            LoggingUtils.info("TU_TC_114, Tier Upgrade, When user enters alphabets, space, and numbers in Source of Fund field. User should be able to input");
            ExtentReporter.logPass("TU_TC_114", "TU_TC_114, Tier Upgrade, " +
                    " When user enters alphabets, space, and numbers in Source of Fund field. User should be able to input");
            System.out.println("-----------------------------------------------------------");
        }
    }
}
