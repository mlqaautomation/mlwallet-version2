package mlwallet.testSteps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.ExtentReport.ExtentReporter;
import utilities.Logger.LoggingUtils;

import java.util.List;

public class TierUpgrade extends Base_Steps{
    Login login = new Login();
    public void tierUpgradeHomePageIIconValidationAsBuyerTierUser_TU_TC_01() throws Exception {
        ExtentReporter.logInfo("TU_TC_01","Tier Upgrade Home Page I Icon Validation as BuyerTier User");
        login.loginWalletBuyerTier();
        if (mobileGeneralMethod.isVisible(homePageObject.objIIcon(), "i Icon")) {
            mobileGeneralMethod.isVisible(homePageObject.objLearnMoreTxt(),"Text");
            LoggingUtils.info("TU_TC_01, Tier Upgrade Home Page I Icon validated as BuyerTier User");
            ExtentReporter.logPass("TU_TC_01", "Tier Upgrade Home Page I Icon validated as BuyerTier User");
            System.out.println("-----------------------------------------------------------");
        }else{
            ExtentReporter.logFail("TU_TC_01", "Failed to validate Tier Upgrade Home Page I Icon as BuyerTier User");
        }
    }

    public void tierUpgradeHomePageIIconValidationAsSemiVerifiedTierUser_TU_TC_02() throws Exception {
        ExtentReporter.logInfo("TU_TC_02","Tier Upgrade Home Page I Icon Validation as as Semi verified Tier User");
        login.loginWalletBuyerTier();
        if (mobileGeneralMethod.isVisible(homePageObject.objIIcon(), "i Icon")) {
            mobileGeneralMethod.isVisible(homePageObject.objLearnMoreTxt(),"Text");
            LoggingUtils.info("TU_TC_02, Tier Upgrade Home Page I Icon validated as Semi verified User");
            ExtentReporter.logPass("TU_TC_02", "Tier Upgrade Home Page I Icon validated as Semi verified User");
            System.out.println("-----------------------------------------------------------");
        }else{
            ExtentReporter.logFail("TU_TC_02", "Failed to validate Tier Upgrade Home Page I Icon as Semi verified User");
        }
    }

    public void tierUpgradeVerificationTierPerksPageNavigationAsBuyerTierUser_TU_TC_04() throws Exception {
        ExtentReporter.logInfo("TU_TC_04","Tier Upgrade Verification tier perks page navigation as BuyerTier User");
        login.loginWalletBuyerTier();
        mobileGeneralMethod.tap(homePageObject.objIIcon(), "i Icon");
        if (mobileGeneralMethod.isVisible(homePageObject.objVerificationTierPerks(),"Page")) {
            LoggingUtils.info("TU_TC_04, Tier Upgrade Verification tier perks page navigation validated as BuyerTier User");
            ExtentReporter.logPass("TU_TC_04", "Tier Upgrade Verification tier perks page navigation validated as BuyerTier User");
            System.out.println("-----------------------------------------------------------");
        }else {
            ExtentReporter.logFail("TU_TC_04", "Failed to validate Tier Upgrade Verification tier perks page navigation as BuyerTier User");
        }
    }

    public void tierUpgradeVerificationTierPerksPageNavigationAsSemiVerifiedTierUser_TU_TC_05() throws Exception {
        ExtentReporter.logInfo("TU_TC_05","Tier Upgrade Verification tier perks page navigation as Semi Verified Tier User");
        login.loginWalletSemiTier();
        mobileGeneralMethod.tap(homePageObject.objIIcon(), "i Icon");
        if (mobileGeneralMethod.isVisible(homePageObject.objVerificationTierPerks(),"Page")) {
            LoggingUtils.info("TU_TC_05, Tier Upgrade Verification tier perks page navigation validated as Semi Verified Tier User");
            ExtentReporter.logPass("TU_TC_05", "Tier Upgrade Verification tier perks page navigation validated as Semi Verified Tier User");
            System.out.println("-----------------------------------------------------------");
        }else {
            ExtentReporter.logFail("TU_TC_05", "Failed to validate Tier Upgrade Verification tier perks page navigation as Semi Verified Tier User");
        }
    }

    public void tierUpgradeVerificationTierPerksBackBtnValidation_TU_TC_06() throws Exception {
        ExtentReporter.logInfo("TU_TC_06","Tier Upgrade Verification tier perks Back button validation");
        login.loginWalletBuyerTier();
        mobileGeneralMethod.tap(homePageObject.objIIcon(), "i Icon");
        mobileGeneralMethod.isVisible(homePageObject.objVerificationTierPerks(),"Page");
        mobileGeneralMethod.tap(tierUpgradeObjects.objVerificationTierPerksBackBtn(),"Back Button");
        if(mobileGeneralMethod.isVisible(homePageObject.objAvailableBalanceHeader(),"Header")){
            LoggingUtils.info("TU_TC_06, Tier Upgrade, After clicking back btn in verification tier perks app navigates to Home Page is validated");
            ExtentReporter.logPass("TU_TC_06", "Tier Upgrade, After clicking back btn in verification tier perks app navigates to Home Page is validated");
            System.out.println("-----------------------------------------------------------");
        }else {
            ExtentReporter.logFail("TU_TC_06", "Failed to validate Tier Upgrade, After clicking back btn in verification tier perks app navigates to Home Page");
        }
    }

    public void tierUpgradeUpgradeTierLevelBtnValidationForSemiVerifiedTabAsBuyTierUser_TU_TC_07() throws Exception {
        ExtentReporter.logInfo("TU_TC_07","Tier Upgrade Upgrade tier level Button validation, For Semi verified tab As Buyer tier User");
        login.loginWalletBuyerTier();
        mobileGeneralMethod.tap(homePageObject.objIIcon(), "i Icon");
        mobileGeneralMethod.isVisible(homePageObject.objVerificationTierPerks(),"Page");
        mobileGeneralMethod.tap(tierUpgradeObjects.objSemiVerifiedTab(),"Tab");
        if(mobileGeneralMethod.isVisible(tierUpgradeObjects.objUpgradeTierLevel(),"Button")){
            LoggingUtils.info("TU_TC_07, Tier Upgrade Upgrade tier level Button validated, For Semi verified tab As Buyer tier User");
            ExtentReporter.logPass("TU_TC_07", "Tier Upgrade Upgrade tier level Button validated, For Semi verified tab As Buyer tier User");
            System.out.println("-----------------------------------------------------------");
        }else {
            ExtentReporter.logFail("TU_TC_07", "Failed to validate Tier Upgrade Upgrade tier level Button For Semi verified tab As Buyer tier User");
        }
    }

    public void tierUpgradeUpgradeTierLevelBtnValidationForFullyVerifiedTabAsBuyTierUser_TU_TC_08() throws Exception {
        ExtentReporter.logInfo("TU_TC_08","Tier Upgrade Upgrade tier level Button validation, For Fully verified tab As Buyer tier User");
        login.loginWalletBuyerTier();
        mobileGeneralMethod.tap(homePageObject.objIIcon(), "i Icon");
        mobileGeneralMethod.isVisible(homePageObject.objVerificationTierPerks(),"Page");
        mobileGeneralMethod.tap(tierUpgradeObjects.objFullyVerifiedTab(),"Tab");
        if(mobileGeneralMethod.isVisible(tierUpgradeObjects.objUpgradeTierLevel(),"Button")){
            LoggingUtils.info("TU_TC_08, Tier Upgrade Upgrade tier level Button validated, For Fully verified tab As Buyer tier User");
            ExtentReporter.logPass("TU_TC_08", "Tier Upgrade Upgrade tier level Button validated, For Fully verified tab As Buyer tier User");
            System.out.println("-----------------------------------------------------------");
        }else {
            ExtentReporter.logFail("TU_TC_08", "Failed to validate Tier Upgrade Upgrade tier level Button For Fully verified tab As Buyer tier User");
        }
    }

    public void tierUpgradeUpgradeTierLevelBtnValidationForBranchVerifiedTabAsBuyerTierUser_TU_TC_09() throws Exception {
        ExtentReporter.logInfo("TU_TC_09", "Tier Upgrade Upgrade tier level Button validation, For Branch verified tab As Buyer tier User");
        login.loginWalletBuyerTier();
        mobileGeneralMethod.tap(homePageObject.objIIcon(), "i Icon");
        if(mobileGeneralMethod.isVisible(homePageObject.objVerificationTierPerks(), "Page")){
            mobileGeneralMethod.tap(tierUpgradeObjects.objBranchVerifiedTab(), "Tab");
            LoggingUtils.info("TU_TC_09, Tier Upgrade Upgrade tier level Button validated, For Branch verified tab As Buyer tier User");
            ExtentReporter.logPass("TU_TC_09", "Tier Upgrade Upgrade tier level Button validated, For Branch verified tab As Buyer tier User");
            System.out.println("-----------------------------------------------------------");
        }else {
            ExtentReporter.logFail("TU_TC_09", "Failed to validate Tier Upgrade Upgrade tier level Button For Branch verified tab As Buyer tier User");
        }
    }

    public void tierUpgradeUpgradeTierLevelBtnValidationForFullyVerifiedTabAsSemiVerifiedTierUser_TU_TC_10() throws Exception {
        ExtentReporter.logInfo("TU_TC_10","Tier Upgrade Upgrade tier level Button validation, For Fully verified tab As Semi verified tier User");
        login.loginWalletSemiTier();
        mobileGeneralMethod.tap(homePageObject.objIIcon(), "i Icon");
        mobileGeneralMethod.isVisible(homePageObject.objVerificationTierPerks(),"Page");
        mobileGeneralMethod.tap(tierUpgradeObjects.objFullyVerifiedTab(),"Tab");
        if(mobileGeneralMethod.isVisible(tierUpgradeObjects.objUpgradeTierLevel(),"Button")){
            LoggingUtils.info("TU_TC_10, Tier Upgrade Upgrade tier level Button validated, For Fully verified tab As Semi verified tier User");
            ExtentReporter.logPass("TU_TC_10", "Tier Upgrade Upgrade tier level Button validated, For Fully verified tab As Semi verified tier User");
            System.out.println("-----------------------------------------------------------");
        }else {
            ExtentReporter.logFail("TU_TC_10", "Failed to validate Tier Upgrade Upgrade tier level Button For Fully verified tab As Semi verified tier User");
        }
    }

    public void tierUpgradeUpgradeTierLevelBtnValidationForBranchVerifiedTabAsSemiVerifiedTierUser_TU_TC_11() throws Exception {
        ExtentReporter.logInfo("TU_TC_11","Tier Upgrade Upgrade tier level Button validation, For Branch verified tab As Semi verified tier User");
        login.loginWalletSemiTier();
        mobileGeneralMethod.tap(homePageObject.objIIcon(), "i Icon");
        if(mobileGeneralMethod.isVisible(homePageObject.objVerificationTierPerks(), "Page")){
            mobileGeneralMethod.tap(tierUpgradeObjects.objBranchVerifiedTab(),"Tab");
            LoggingUtils.info("TU_TC_11, Tier Upgrade Upgrade tier level Button validated, For Branch verified tab As Semi verified tier User");
            ExtentReporter.logPass("TU_TC_11", "Tier Upgrade Upgrade tier level Button validated, For Branch verified tab As Semi verified tier User");
            System.out.println("-----------------------------------------------------------");
        }else {
            ExtentReporter.logFail("TU_TC_11", "Failed to validate Tier Upgrade Upgrade tier level Button For Branch verified tab As Semi verified tier User");
        }
    }

    public void tierUpgradeAccountDetailsPageNavigationAsBuyerTierUserToUpgradeToSemiVerifiedTier_TU_TC_12() throws Exception {
        ExtentReporter.logInfo("TU_TC_12","Tier Upgrade Account details page navigation as Buyer tier user to upgrade to Semi verified tier user");
        login.loginWalletBuyerTier();
        mobileGeneralMethod.tap(homePageObject.objIIcon(), "i Icon");
        mobileGeneralMethod.isVisible(homePageObject.objVerificationTierPerks(),"Page");
        mobileGeneralMethod.tap(tierUpgradeObjects.objSemiVerifiedTab(),"Tab");
        mobileGeneralMethod.tap(tierUpgradeObjects.objUpgradeTierLevel(),"Button");
        if(mobileGeneralMethod.isVisible(tierUpgradeObjects.objAccountDetails(),"Page")){
            LoggingUtils.info("TU_TC_12, Tier Upgrade Account details page navigation validated as Buyer tier user to upgrade to Semi verified tier user");
            ExtentReporter.logPass("TU_TC_12", "Tier Upgrade Account details page navigation validated as Buyer tier user to upgrade to Semi verified tier user");
            System.out.println("-----------------------------------------------------------");
        }else {
            ExtentReporter.logFail("TU_TC_12", "Failed to validate Tier Upgrade Account details page navigation as Buyer tier user to upgrade to Semi verified tier user");
        }
    }


    public void tierUpgradeAccountDetailsPageNavigationAsBuyerTierUserToUpgradeToFullyVerifiedTier_TU_TC_13() throws Exception {
        ExtentReporter.logInfo("TU_TC_13","Tier Upgrade Account details page navigation as Buyer tier user to upgrade to Fully verified tier user");
        login.loginWalletBuyerTier();
        mobileGeneralMethod.tap(homePageObject.objIIcon(), "i Icon");
        mobileGeneralMethod.isVisible(homePageObject.objVerificationTierPerks(),"Page");
        mobileGeneralMethod.tap(tierUpgradeObjects.objFullyVerifiedTab(),"Tab");
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.tap(tierUpgradeObjects.objUpgradeTierLevel(),"Button");
        if(mobileGeneralMethod.isVisible(tierUpgradeObjects.objAccountDetails(),"Page")){
            LoggingUtils.info("TU_TC_13, Tier Upgrade Account details page navigation validated as Buyer tier user to upgrade to Fully verified tier user");
            ExtentReporter.logPass("TU_TC_13", "Tier Upgrade Account details page navigation validated as Buyer tier user to upgrade to Fully verified tier user");
            System.out.println("-----------------------------------------------------------");
        }else {
            ExtentReporter.logFail("TU_TC_13", "Failed to validate Tier Upgrade Account details page navigation as Buyer tier user to upgrade to Fully verified tier user");
        }
    }


    public void tierUpgradeAccountDetailsPageNavigationAsSemiVerifiedTierUserToUpgradeToFullyVerifiedTier_TU_TC_14() throws Exception {
        ExtentReporter.logInfo("TU_TC_14","Tier Upgrade Account details page navigation as Semi verified tier user to upgrade to Fully verified tier user");
        login.loginWalletBuyerTier();
        mobileGeneralMethod.tap(homePageObject.objIIcon(), "i Icon");
        mobileGeneralMethod.isVisible(homePageObject.objVerificationTierPerks(),"Page");
        mobileGeneralMethod.tap(tierUpgradeObjects.objFullyVerifiedTab(),"Tab");
        mobileGeneralMethod.tap(tierUpgradeObjects.objUpgradeTierLevel(),"Button");
        if(mobileGeneralMethod.isVisible(tierUpgradeObjects.objAccountDetails(),"Page")){
            LoggingUtils.info("TU_TC_14, Tier Upgrade Account details page navigation validated as Semi verified tier user to upgrade to Fully verified tier user");
            ExtentReporter.logPass("TU_TC_14", "Tier Upgrade Account details page navigation validated as Semi verified tier user to upgrade to Fully verified tier user");
            System.out.println("-----------------------------------------------------------");
        }else {
            ExtentReporter.logFail("TU_TC_14", "Failed to validate Tier Upgrade Account details page navigation as Semi verified tier user to upgrade to Fully verified tier user");
        }
    }

    public void tierUpgradeAccountDetailsPageBackBtnValidation_TU_TC_15() throws Exception {
        ExtentReporter.logInfo("TU_TC_15","Tier upgrade Account details page Back button functionality validation");
        login.loginWalletBuyerTier();
        mobileGeneralMethod.tap(homePageObject.objIIcon(), "i Icon");
        mobileGeneralMethod.isVisible(homePageObject.objVerificationTierPerks(),"Page");
        mobileGeneralMethod.tap(tierUpgradeObjects.objFullyVerifiedTab(),"Tab");
        mobileGeneralMethod.tap(tierUpgradeObjects.objUpgradeTierLevel(),"Button");
        mobileGeneralMethod.isVisible(tierUpgradeObjects.objAccountDetails(),"Page");
        mobileGeneralMethod.tap(tierUpgradeObjects.objAccountDetailsBackBtn(),"Account details page Back button");
        if (mobileGeneralMethod.isVisible(homePageObject.objVerificationTierPerks(),"Page")) {
            LoggingUtils.info("TU_TC_15, Tier Upgrade, After clicking back btn in Account details page app navigates to Verification tier perks Page is validated");
            ExtentReporter.logPass("TU_TC_15", "Tier Upgrade, After clicking back btn in Account details page app navigates to Verification tier perks Page is validated");
            System.out.println("-----------------------------------------------------------");
        }else {
            ExtentReporter.logFail("TU_TC_15", "Failed to validate Tier Upgrade, After clicking back btn in Account details page app navigates to Verification tier perks Page");
        }
    }
    public void accountDetailsPageNavigation() throws Exception {
        mobileGeneralMethod.tap(homePageObject.objIIcon(), "i Icon");
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.isVisible(homePageObject.objVerificationTierPerks(), "Page");
        mobileGeneralMethod.tap(tierUpgradeObjects.objFullyVerifiedTab(),"Tab");
        mobileGeneralMethod.tap(tierUpgradeObjects.objUpgradeTierLevel(),"Button");
        mobileGeneralMethod.waitSleep(1000);
    }
    public void tierUpgradeAccountDetailsPageValidation_TU_TC_16() throws Exception {
        ExtentReporter.logInfo("TU_TC_16","Upgrade Account Detail Page functionality validation");
        login.loginWalletBuyerTier();
        accountDetailsPageNavigation();
        if (mobileGeneralMethod.isVisible(tierUpgradeObjects.objAccountDetails(),"Account Details")) {
            mobileGeneralMethod.isVisible(tierUpgradeObjects.objPersonalInfoText(),"Personal Info");
            mobileGeneralMethod.isVisible(tierUpgradeObjects.objPlaceOfBirthText(),"Place Of Birth");
            mobileGeneralMethod.isVisible(tierUpgradeObjects.objPlaceOfBirthField(),"Place Of Birth Field");
            mobileGeneralMethod.isVisible(tierUpgradeObjects.objNationalityText(),"Nationality");
            mobileGeneralMethod.isVisible(tierUpgradeObjects.objNationalityField(),"Nationality Field");
            mobileGeneralMethod.isVisible(tierUpgradeObjects.objCityStatusText(),"City Status");
            mobileGeneralMethod.isVisible(tierUpgradeObjects.objCityStatusField(),"City Status Field");
            mobileGeneralMethod.isVisible(tierUpgradeObjects.objGenderAtBirthText(),"Gender At Birth");
            mobileGeneralMethod.isVisible(tierUpgradeObjects.objGenderAtBirthField(),"Gender At Birth Field");
            mobileGeneralMethod.isVisible(tierUpgradeObjects.objNatureOfWorkText(),"Nature Of Work");
            mobileGeneralMethod.isVisible(tierUpgradeObjects.objSourceOfIncomeText(),"Source Of Income");
            mobileGeneralMethod.isVisible(tierUpgradeObjects.objSourceOfIncomeField(),"Source Of Income Field");
            mobileGeneralMethod.isVisible(tierUpgradeObjects.objOccupationText(),"Occupation");
            mobileGeneralMethod.isVisible(tierUpgradeObjects.objOccupationField(),"Occupation Field");
            mobileGeneralMethod.isVisible(tierUpgradeObjects.objSourceOfFundsText(),"Source Of Funds");
            mobileGeneralMethod.isVisible(tierUpgradeObjects.objSourceOfFundsField(),"Source Of Funds Field");
            mobileGeneralMethod.isVisible(tierUpgradeObjects.objConfirmDetails(),"Confirm Details Button");
            LoggingUtils.info("TU_TC_16, Upgrade Account DetailPage functionality is validated");
            ExtentReporter.logPass("TU_TC_16", "Upgrade Account Detail Page functionality is validated");
            System.out.println("-----------------------------------------------------------");
        }else {
            ExtentReporter.logFail("TU_TC_16", "Failed to validate Upgrade Account Detail Page functionality");
        }
    }
    public void tierUpgradeAccountDetailsPageNationalityValidation_TU_TC_17() throws Exception {
        ExtentReporter.logInfo("TU_TC_17","Upgrade Account Detail Page Nationality validation");
        login.loginWalletBuyerTier();
        accountDetailsPageNavigation();
        mobileGeneralMethod.waitSleep(3000);
        if (mobileGeneralMethod.isVisible(tierUpgradeObjects.objAccountDetails(),"Account Details")) {
            mobileGeneralMethod.isVisible(tierUpgradeObjects.objPersonalInfoText(),"Personal Info");
            mobileGeneralMethod.tap(tierUpgradeObjects.objNationalityField(),"Nationality Field");
            mobileGeneralMethod.isVisible(tierUpgradeObjects.objNationalityTitle(),"Place Of Birth");
            mobileGeneralMethod.isVisible(tierUpgradeObjects.objBackBtn(),"Place Of Birth");
            mobileGeneralMethod.isVisible(tierUpgradeObjects.objSearchFieldInput(),"Place Of Birth");
            LoggingUtils.info("TU_TC_17, Upgrade Account Detail Page Nationality is validated");
            ExtentReporter.logPass("TU_TC_17", "Upgrade Account Detail Page Nationality is validated");
            System.out.println("-----------------------------------------------------------");
        }else {
            ExtentReporter.logFail("TU_TC_17", "Failed to validate Upgrade Account DetailPage Nationality");
        }
    }
    public void tierUpgradeAccountDetailsPageCivilStatusValidation_TU_TC_18() throws Exception {
        ExtentReporter.logInfo("TU_TC_18","Upgrade Account Detail Page Civil Status validation");
        login.loginWalletBuyerTier();
        accountDetailsPageNavigation();
        mobileGeneralMethod.waitSleep(3000);
        if (mobileGeneralMethod.isVisible(tierUpgradeObjects.objAccountDetails(),"Account Details")) {
            mobileGeneralMethod.isVisible(tierUpgradeObjects.objPersonalInfoText(),"Personal Info");
            mobileGeneralMethod.tap(tierUpgradeObjects.objCityStatusField(),"City Status Field");
            mobileGeneralMethod.isVisible(tierUpgradeObjects.objCityStatusText(),"City Status");
            mobileGeneralMethod.isVisible(tierUpgradeObjects.objBackBtn(),"Back Button");
            mobileGeneralMethod.isVisible(tierUpgradeObjects.objSearchFieldInput(),"Search Field");
            LoggingUtils.info("TU_TC_18, Upgrade Account Detail Page Civil Status is validated");
            ExtentReporter.logPass("TU_TC_18", "Upgrade Account Detail Page Civil Status is validated");
            System.out.println("-----------------------------------------------------------");
        }else {
            ExtentReporter.logFail("TU_TC_18", "Failed to validate Upgrade Account Detail Page Civil Status");
        }
    }
    public void tierUpgradeAccountDetailsPageGenderAtBirthValidation_TU_TC_19() throws Exception {
        ExtentReporter.logInfo("TU_TC_19","Upgrade Account Detail Page Gender At Birth validation");
        login.loginWalletBuyerTier();
        accountDetailsPageNavigation();
        mobileGeneralMethod.waitSleep(3000);
        if (mobileGeneralMethod.isVisible(tierUpgradeObjects.objAccountDetails(),"Account Details")) {
            mobileGeneralMethod.isVisible(tierUpgradeObjects.objPersonalInfoText(),"Personal Info");
            mobileGeneralMethod.tap(tierUpgradeObjects.objGenderAtBirthField(),"Gender At Birth Field");
            mobileGeneralMethod.isVisible(tierUpgradeObjects.objGenderAtBirthText(),"Gender At Birth");
            mobileGeneralMethod.isVisible(tierUpgradeObjects.objBackBtn(),"Back Button");
            mobileGeneralMethod.isVisible(tierUpgradeObjects.objSearchFieldInput(),"Search Field");
            LoggingUtils.info("TU_TC_19, Upgrade Account Detail Page Gender At Birth is validated");
            ExtentReporter.logPass("TU_TC_19", "Upgrade Account Detail Page Gender At Birth is validated");
            System.out.println("-----------------------------------------------------------");
        }else {
            ExtentReporter.logFail("TU_TC_19", "Failed to validate Upgrade Account Detail Page Gender At Birth");
        }
    }
    public void tierUpgradeAccountDetailsPageSourceOfIncomeValidation_TU_TC_20() throws Exception {
        ExtentReporter.logInfo("TU_TC_20","Upgrade Account Detail Page Source Of Income validation");
        login.loginWalletBuyerTier();
        accountDetailsPageNavigation();
        mobileGeneralMethod.waitSleep(3000);
        if (mobileGeneralMethod.isVisible(tierUpgradeObjects.objAccountDetails(),"Account Details")) {
            mobileGeneralMethod.isVisible(tierUpgradeObjects.objPersonalInfoText(),"Personal Info");
            mobileGeneralMethod.tap(tierUpgradeObjects.objSourceOfIncomeField(),"Source Of Income Field");
            mobileGeneralMethod.isVisible(tierUpgradeObjects.objSourceOfIncomeText(),"Source Of Income");
            mobileGeneralMethod.isVisible(tierUpgradeObjects.objBackBtn(),"Back Button");
            mobileGeneralMethod.isVisible(tierUpgradeObjects.objSearchFieldInput(),"Search Field");
            LoggingUtils.info("TU_TC_20, Upgrade Account Detail Page Source Of Income is validated");
            ExtentReporter.logPass("TU_TC_20", "Upgrade Account Detail Page Source Of Income is validated");
            System.out.println("-----------------------------------------------------------");
        }else {
            ExtentReporter.logFail("TU_TC_20", "Failed to validate Upgrade Account Detail Page Source Of Income");
        }
    }
    public void tierUpgradeAccountDetailsPageSelectNationalityValidation_TU_TC_21() throws Exception {
        ExtentReporter.logInfo("TU_TC_21","Upgrade Account Detail Page Select Nationality validation");
        login.loginWalletBuyerTier();
        accountDetailsPageNavigation();
        mobileGeneralMethod.waitSleep(3000);
        if (mobileGeneralMethod.isVisible(tierUpgradeObjects.objAccountDetails(),"Account Details")) {
            mobileGeneralMethod.isVisible(tierUpgradeObjects.objPersonalInfoText(),"Personal Info");
            mobileGeneralMethod.tap(tierUpgradeObjects.objNationalityField(),"Nationality Field");
            mobileGeneralMethod.type(tierUpgradeObjects.objSearchFieldInput(),"Type Nationality","FILI");
            mobileGeneralMethod.tap(tierUpgradeObjects.objFilipinoNationality(),"Select Nationality");
            String sExceptedErrorMsg = mobileGeneralMethod.getText(tierUpgradeObjects.objFilipinoNationality());
            String sActualErrorMsg = mobileGeneralMethod.getText(tierUpgradeObjects.objNationalityField());
            mobileGeneralMethod.assertionValidation(sActualErrorMsg, sExceptedErrorMsg);
            LoggingUtils.info("TU_TC_21, Upgrade Account Detail Page Select Nationality is validated");
            ExtentReporter.logPass("TU_TC_21", "Upgrade Account Detail Page Select Nationality is validated");
            System.out.println("-----------------------------------------------------------");
        }else {
            ExtentReporter.logFail("TU_TC_21", "Failed to validate Upgrade Account DetailPage Select Nationality");
        }
    }
    public void tierUpgradeAccountDetailsPageSelectCivilStatusValidation_TU_TC_22() throws Exception {
        ExtentReporter.logInfo("TU_TC_22","Upgrade Account Detail Page Select Civil Status validation");
        login.loginWalletBuyerTier();
        accountDetailsPageNavigation();
        mobileGeneralMethod.waitSleep(3000);
        if (mobileGeneralMethod.isVisible(tierUpgradeObjects.objAccountDetails(),"Account Details")) {
            mobileGeneralMethod.isVisible(tierUpgradeObjects.objPersonalInfoText(),"Personal Info");
            mobileGeneralMethod.tap(tierUpgradeObjects.objCityStatusField(),"City Status Field");
            mobileGeneralMethod.type(tierUpgradeObjects.objSearchFieldInput(),"Type Civil Status","Sing");
            mobileGeneralMethod.tap(tierUpgradeObjects.objSingleCivilStatus(),"Select Civil Status");
            String sExceptedErrorMsg = mobileGeneralMethod.getText(tierUpgradeObjects.objSingleCivilStatus());
            String sActualErrorMsg = mobileGeneralMethod.getText(tierUpgradeObjects.objCityStatusField());
            mobileGeneralMethod.assertionValidation(sActualErrorMsg, sExceptedErrorMsg);
            LoggingUtils.info("TU_TC_22, Upgrade Account Detail Page Select Civil Status is validated");
            ExtentReporter.logPass("TU_TC_22", "Upgrade Account Detail Page Select Civil Status is validated");
            System.out.println("-----------------------------------------------------------");
        }else {
            ExtentReporter.logFail("TU_TC_22", "Failed to validate Upgrade Account Detail Page Select Civil Status");
        }
    }
    public void tierUpgradeAccountDetailsPageSelectGenderAtBirthValidation_TU_TC_23() throws Exception {
        ExtentReporter.logInfo("TU_TC_23","Upgrade Account Detail Page Select Gender At Birth validation");
        login.loginWalletBuyerTier();
        accountDetailsPageNavigation();
        mobileGeneralMethod.waitSleep(3000);
        if (mobileGeneralMethod.isVisible(tierUpgradeObjects.objAccountDetails(),"Account Details")) {
            mobileGeneralMethod.isVisible(tierUpgradeObjects.objPersonalInfoText(),"Personal Info");
            mobileGeneralMethod.tap(tierUpgradeObjects.objGenderAtBirthField(),"Gender At Birth Field");
            mobileGeneralMethod.type(tierUpgradeObjects.objSearchFieldInput(),"Type Gender","Ma");
            mobileGeneralMethod.tap(tierUpgradeObjects.objMaleGender(),"Select Gender");
            String sExceptedErrorMsg = mobileGeneralMethod.getText(tierUpgradeObjects.objMaleGender());
            String sActualErrorMsg = mobileGeneralMethod.getText(tierUpgradeObjects.objGenderAtBirthField());
            mobileGeneralMethod.assertionValidation(sActualErrorMsg, sExceptedErrorMsg);
            LoggingUtils.info("TU_TC_23, Upgrade Account Detail Page Select Gender At Birth is validated");
            ExtentReporter.logPass("TU_TC_23", "Upgrade Account Detail Page Select Gender At Birth is validated");
            System.out.println("-----------------------------------------------------------");
        }else {
            ExtentReporter.logFail("TU_TC_23", "Failed to validate Upgrade Account Detail Page Select Gender At Birth");
        }
    }
    public void tierUpgradeAccountDetailsPageSelectSourceOfIncomeValidation_TU_TC_24() throws Exception {
        ExtentReporter.logInfo("TU_TC_24","Upgrade Account Detail Page Select Source Of Income validation");
        login.loginWalletBuyerTier();
        accountDetailsPageNavigation();
        mobileGeneralMethod.waitSleep(3000);
        if (mobileGeneralMethod.isVisible(tierUpgradeObjects.objAccountDetails(),"Account Details")) {
            mobileGeneralMethod.isVisible(tierUpgradeObjects.objPersonalInfoText(),"Personal Info");
            mobileGeneralMethod.tap(tierUpgradeObjects.objSourceOfIncomeField(),"Source Of Income Field");
            mobileGeneralMethod.type(tierUpgradeObjects.objSearchFieldInput(),"Type Source Of Income","OTHE");
            mobileGeneralMethod.tap(tierUpgradeObjects.objOtherSourceOfIncome(),"Select Gender");
            String sExceptedErrorMsg = mobileGeneralMethod.getText(tierUpgradeObjects.objOtherSourceOfIncome());
            String sActualErrorMsg = mobileGeneralMethod.getText(tierUpgradeObjects.objSourceOfIncomeField());
            mobileGeneralMethod.assertionValidation(sActualErrorMsg, sExceptedErrorMsg);
            LoggingUtils.info("TU_TC_24, Upgrade Account Detail Page Select Source Of Income is validated");
            ExtentReporter.logPass("TU_TC_24", "Upgrade Account Detail Page Select Source Of Income is validated");
            System.out.println("-----------------------------------------------------------");
        }else {
            ExtentReporter.logFail("TU_TC_24", "Failed to validate Upgrade Account Detail Page Select Source Of Income");
        }
    }
    public void tierUpgradeConfirmDetailsBtnValidationInAccountDetailsPage_TU_TC_25() throws Exception {
        ExtentReporter.logInfo("TU_TC_25","Tier Upgrade, Confirm details button validation in Account details page");
        login.loginWalletBuyerTier();
        accountDetailsPageNavigation();
        if(mobileGeneralMethod.isVisible(tierUpgradeObjects.objConfirmDetails(),"Button")){
            LoggingUtils.info("TU_TC_25, Tier Upgrade, Confirm details button validated in Account details page");
            ExtentReporter.logPass("TU_TC_25", "Tier Upgrade, Confirm details button validated in Account details page");
            System.out.println("-----------------------------------------------------------");
        }else {
            ExtentReporter.logFail("TU_TC_25", "Failed to validate Tier Upgrade, Confirm details button in Account details page");
        }
    }
    public void tierUpgradePageNavigation_TU_TC_26() throws Exception {
        ExtentReporter.logInfo("TU_TC_26","Tier upgrade page navigation");
        login.loginWalletBuyerTier();
        accountDetailsPageNavigation();
        mobileGeneralMethod.tap(tierUpgradeObjects.objConfirmDetails(),"Button");
        if(mobileGeneralMethod.isVisible(tierUpgradeObjects.objTierUpgrade(),"Page")){
            LoggingUtils.info("TU_TC_26, Tier Upgrade page navigation validated");
            ExtentReporter.logPass("TU_TC_26", "Tier Upgrade page navigation validated");
            System.out.println("-----------------------------------------------------------");
        }else {
            ExtentReporter.logFail("TU_TC_26", "Failed to validate Tier Upgrade page navigation");
        }
    }
    public void verificationTierPerksPageValidation() throws Exception {
        mobileGeneralMethod.isVisible(homePageObject.objMaxBalanceText(),"Header");
        mobileGeneralMethod.isVisible(homePageObject.objMaxBalanceAmount(), "Max Balance");
        mobileGeneralMethod.isVisible(homePageObject.objSendingLimitsCashOut(), "Header");
        }
    public void tierUpgradeFullyVerifiedTierTabUIValidation_TU_TC_27() throws Exception {
        ExtentReporter.logInfo("TU_TC_27","Tier Upgrade Fully verified ter Tab UI Validation");
        login.loginWalletBuyerTier();
        mobileGeneralMethod.tap(homePageObject.objIIcon(), "i Icon");
        mobileGeneralMethod.isVisible(homePageObject.objVerificationTierPerks(),"Page");
        mobileGeneralMethod.tap(tierUpgradeObjects.objFullyVerifiedTab(),"Tab");
        mobileGeneralMethod.waitSleep(1000);
        if(mobileGeneralMethod.isVisible(homePageObject.objTier(),"Header")) {
            verificationTierPerksPageValidation();
            mobileGeneralMethod.isVisible(tierUpgradeObjects.objUpgradeTierLevel(),"Button");
            LoggingUtils.info("TU_TC_27, Tier Upgrade Fully verified ter Tab UI validated");
            ExtentReporter.logPass("TU_TC_27", "Tier Upgrade Fully verified ter Tab UI validated");
            System.out.println("-----------------------------------------------------------");
        }else {
            ExtentReporter.logFail("TU_TC_27", "Failed to validate Tier Upgrade Fully verified ter Tab UI");
        }
    }
    public void tierUpgradeAccountDetailsPageUIValidation_TU_TC_28() throws Exception {
        ExtentReporter.logInfo("TU_TC_28","Tier upgrade Account details page UI validation");
        login.loginWalletBuyerTier();
        accountDetailsPageNavigation();
        if(mobileGeneralMethod.isVisible(tierUpgradeObjects.objAccountDetails(),"Page")){
            mobileGeneralMethod.isVisible(tierUpgradeObjects.objPersonalInformation(),"Header");
            mobileGeneralMethod.isVisible(tierUpgradeObjects.objPlaceOfBirth(),"Place of Birth");
            mobileGeneralMethod.isVisible(tierUpgradeObjects.objNationality(),"Nationality");
            mobileGeneralMethod.isVisible(tierUpgradeObjects.objCivilStatus(),"Civil Status");
            mobileGeneralMethod.isVisible(tierUpgradeObjects.objGenderAtBirth(),"Gender at Birth");
            mobileGeneralMethod.isVisible(tierUpgradeObjects.objSourceOfIncome(),"Source of Income");
            LoggingUtils.info("TU_TC_28, Tier upgrade Account details page UI validated");
            ExtentReporter.logPass("TU_TC_28", "Tier upgrade Account details page UI validated");
            System.out.println("-----------------------------------------------------------");
        }else {
            ExtentReporter.logFail("TU_TC_28", "Failed to validate Tier upgrade Account details page UI");
        }
    }
    public void tierUpgradePageUIValidation_TU_TC_29() throws Exception {
        ExtentReporter.logInfo("TU_TC_29","Tier upgrade page UI validation");
        login.loginWalletBuyerTier();
        accountDetailsPageNavigation();
        mobileGeneralMethod.tap(tierUpgradeObjects.objConfirmDetails(),"Button");
        if (mobileGeneralMethod.isVisible(tierUpgradeObjects.objTierUpgrade(),"Page")) {
            mobileGeneralMethod.isVisible(tierUpgradeObjects.objSelectAnyValidID(),"Header");
            mobileGeneralMethod.isVisible(tierUpgradeObjects.objSelectID(),"Input field Header");
            mobileGeneralMethod.isVisible(tierUpgradeObjects.objSelectIDSelectionBtn(),"Select ID Selection Button");
            LoggingUtils.info("TU_TC_29, Tier upgrade page UI validated");
            ExtentReporter.logPass("TU_TC_29", "Tier upgrade page UI validated");
            System.out.println("-----------------------------------------------------------");
        }else {
            ExtentReporter.logFail("TU_TC_29", "Failed to validate Tier upgrade page UI");
        }
    }
    public void tierUpgradeBackArrowBtnValidation_TU_TC_30() throws Exception {
        ExtentReporter.logInfo("TU_TC_30","Tier upgrade page UI validation");
        login.loginWalletBuyerTier();
        accountDetailsPageNavigation();
        mobileGeneralMethod.tap(tierUpgradeObjects.objConfirmDetails(),"Button");
        mobileGeneralMethod.isVisible(tierUpgradeObjects.objTierUpgrade(),"Page");
        mobileGeneralMethod.tap(tierUpgradeObjects.objTierUpgradeBackBtn(),"Tier upgrade Back Arrow Btn");
        if(mobileGeneralMethod.isVisible(tierUpgradeObjects.objAccountDetails(),"Page")){
            LoggingUtils.info("TU_TC_30, After clicking on Back Arrow Btn on Tier upgrade Page, Application Navigates to Account Details Page is validated");
            ExtentReporter.logPass("TU_TC_30", "After clicking on Back Arrow Btn on Tier upgrade Page, Application Navigates to Account Details Page is validated");
            System.out.println("-----------------------------------------------------------");
        }else {
            ExtentReporter.logFail("TU_TC_30", "Failed to validate After clicking on Back Arrow Btn on Tier upgrade Page, Application Navigates to Account Details Page");
        }
    }
    public void tierUpgradeUploadIDPhotosUIValidationAfterSelectingPHILHEALTH_TU_TC_31() throws Exception {
        ExtentReporter.logInfo("TU_TC_31","Tier Upgrade, Upload ID photos UI validation After Selecting PHIL HEALTH");
        login.loginWalletBuyerTier();
        accountDetailsPageNavigation();
        mobileGeneralMethod.tap(tierUpgradeObjects.objConfirmDetails(),"Button");
        mobileGeneralMethod.isVisible(tierUpgradeObjects.objTierUpgrade(),"Page");
        mobileGeneralMethod.tap(tierUpgradeObjects.objSelectIDSelectionBtn(),"Select ID Selection Button");
        mobileGeneralMethod.type(tierUpgradeObjects.objSearchFieldInput(),"Select ID Input field","PhilHea");
        mobileGeneralMethod.tap(tierUpgradeObjects.objPhilHealth(),"ID");
        if (mobileGeneralMethod.isVisible(tierUpgradeObjects.objUploadIDPhotos(), "Header")) {
            mobileGeneralMethod.isVisible(tierUpgradeObjects.objSelectIDField(),"Selected ID Field");
            mobileGeneralMethod.isVisible(tierUpgradeObjects.objCardInputField(),"Card Input Field");
            mobileGeneralMethod.isVisible(tierUpgradeObjects.objScanFrontOfID(),"Button");
            mobileGeneralMethod.isVisible(tierUpgradeObjects.objScanBackOfID(),"Button");
            mobileGeneralMethod.isVisible(tierUpgradeObjects.objTakeAFaceIdentityPhoto(),"Button");
            LoggingUtils.info("TU_TC_31, Tier Upgrade, Upload ID photos UI validated After Selecting PHIL HEALTH");
            ExtentReporter.logPass("TU_TC_31", "Tier Upgrade, Upload ID photos UI validated After Selecting PHIL HEALTH");
            System.out.println("-----------------------------------------------------------");
        }else {
            ExtentReporter.logFail("TU_TC_31", "Failed to validate Tier Upgrade, Upload ID photos UI After Selecting PHIL HEALTH");
        }
    }
    public void tierUpgradeUploadIDPhotosBackArrowBtnValidation_TU_TC_32() throws Exception {
        ExtentReporter.logInfo("TU_TC_32","Tier upgrade page UI validation");
        login.loginWalletBuyerTier();
        accountDetailsPageNavigation();
        mobileGeneralMethod.tap(tierUpgradeObjects.objConfirmDetails(),"Button");
        mobileGeneralMethod.isVisible(tierUpgradeObjects.objTierUpgrade(), "Page");
        mobileGeneralMethod.tap(tierUpgradeObjects.objSelectIDSelectionBtn(), "Select ID Selection Button");
        mobileGeneralMethod.type(tierUpgradeObjects.objSearchFieldInput(), "Select ID Input field", "PhilHeal");
        mobileGeneralMethod.tap(tierUpgradeObjects.objPhilHealth(),"ID");
        mobileGeneralMethod.tap(tierUpgradeObjects.objTierUpgradeBackBtn(), "Tier upgrade Back Arrow Btn");
        if (mobileGeneralMethod.isVisible(tierUpgradeObjects.objAccountDetails(),"Page")) {
            LoggingUtils.info("TU_TC_32, After clicking on Back Arrow Btn on Tier upgrade Upload ID Photos Page, Application Navigates to Account Details Page is validated");
            ExtentReporter.logPass("TU_TC_32", "After clicking on Back Arrow Btn on Tier upgrade Upload ID Photos Page, Application Navigates to Account Details Page is validated");
            System.out.println("-----------------------------------------------------------");
        }else {
            ExtentReporter.logFail("TU_TC_32", "Failed to validate After clicking on Back Arrow Btn on Tier upgrade Upload ID Photos Page, Application Navigates to Account Details Page");
        }
    }
    public void tierUpgradeScanFrontOfIDPageUIValidation_TU_TC_33() throws Exception {
        ExtentReporter.logInfo("TU_TC_33","Tier Upgrade Scan front of ID page UI Validation");
        login.loginWalletBuyerTier();
        accountDetailsPageNavigation();
        mobileGeneralMethod.tap(tierUpgradeObjects.objConfirmDetails(),"Button");
        mobileGeneralMethod.isVisible(tierUpgradeObjects.objTierUpgrade(),"Page");
        mobileGeneralMethod.tap(tierUpgradeObjects.objSelectIDSelectionBtn(),"Select ID Selection Button");
        mobileGeneralMethod.type(tierUpgradeObjects.objSearchFieldInput(),"Select ID Input field","PhilHea");
        mobileGeneralMethod.tap(tierUpgradeObjects.objPhilHealth(),"ID");
        mobileGeneralMethod.tap(tierUpgradeObjects.objScanFrontOfID(),"Button");
        if(mobileGeneralMethod.isVisible(tierUpgradeObjects.objScanFrontOfID(),"Page")){
            mobileGeneralMethod.isVisible(tierUpgradeObjects.objScanFrontOfIDInfo(),"info");
            mobileGeneralMethod.isVisible(tierUpgradeObjects.objCaptureScreen(),"Capture Screen");
            mobileGeneralMethod.isVisible(tierUpgradeObjects.objCaptureButton(),"Capture Button");
            LoggingUtils.info("TU_TC_33, Tier Upgrade Scan front of ID page UI validated");
            ExtentReporter.logPass("TU_TC_33", "Tier Upgrade Scan front of ID page UI validated");
            System.out.println("-----------------------------------------------------------");
        }else {
            ExtentReporter.logFail("TU_TC_33", "Failed to validate Tier Upgrade Scan front of ID page UI");
        }
    }

    public void tierUpgradeScanFrontOfIDPageBackArrowBtnValidation_TU_TC_34() throws Exception {
        ExtentReporter.logInfo("TU_TC_34","Tier Upgrade Scan front of ID page BAck Arrow button Validation");
        login.loginWalletBuyerTier();
        accountDetailsPageNavigation();
        mobileGeneralMethod.tap(tierUpgradeObjects.objConfirmDetails(),"Button");
        mobileGeneralMethod.isVisible(tierUpgradeObjects.objTierUpgrade(),"Page");
        mobileGeneralMethod.tap(tierUpgradeObjects.objSelectIDSelectionBtn(), "Select ID Selection Button");
        mobileGeneralMethod.type(tierUpgradeObjects.objSearchFieldInput(), "Select ID Input field", "PhilHealth");
        mobileGeneralMethod.tap(tierUpgradeObjects.objPhilHealth(),"ID");
        mobileGeneralMethod.tap(tierUpgradeObjects.objScanFrontOfID(),"Button");
        mobileGeneralMethod.isVisible(tierUpgradeObjects.objScanFrontOfID(),"Button");
        mobileGeneralMethod.tap(tierUpgradeObjects.objTierUpgradeBackBtn(),"Tier Upgrade Scan Front of ID Back Arrow Button");
        mobileGeneralMethod.waitSleep(1000);
        if(mobileGeneralMethod.isVisible(tierUpgradeObjects.objTierUpgrade(),"Page")){
            LoggingUtils.info("TU_TC_34, Tier Upgrade, After clicking back btn in Tier Upgrade Scan Front of ID app navigates to Tier Upgrade page is validated");
            ExtentReporter.logPass("TU_TC_34", "Tier Upgrade, After clicking back btn in Tier Upgrade Scan Front of ID app navigates to Tier Upgrade page is validated");
            System.out.println("-----------------------------------------------------------");
        }else {
            ExtentReporter.logFail("TU_TC_34", "Failed to validate Tier Upgrade, After clicking back btn in Tier Upgrade Scan Front of ID app navigates to Tier Upgrade page");
        }
    }

    public void tierUpgradeScanBackOfIDPageUIValidation_TU_TC_35() throws Exception {
        ExtentReporter.logInfo("TU_TC_35","Tier Upgrade Scan Back of ID page UI Validation");
        login.loginWalletBuyerTier();
        accountDetailsPageNavigation();
        mobileGeneralMethod.tap(tierUpgradeObjects.objConfirmDetails(),"Button");
        mobileGeneralMethod.isVisible(tierUpgradeObjects.objTierUpgrade(),"Page");
        mobileGeneralMethod.tap(tierUpgradeObjects.objSelectIDSelectionBtn(), "Select ID Selection Button");
        mobileGeneralMethod.type(tierUpgradeObjects.objSearchFieldInput(), "Select ID Input field", "PhilHealth");
        mobileGeneralMethod.tap(tierUpgradeObjects.objPhilHealth(),"ID");
        mobileGeneralMethod.tap(tierUpgradeObjects.objScanBackOfID(),"Button");
        if(mobileGeneralMethod.isVisible(tierUpgradeObjects.objScanBackOfID(),"Page")){
            mobileGeneralMethod.isVisible(tierUpgradeObjects.objScanFrontOfIDInfo(),"info");
            mobileGeneralMethod.isVisible(tierUpgradeObjects.objCaptureScreen(),"Capture Screen");
            mobileGeneralMethod.isVisible(tierUpgradeObjects.objCaptureButton(),"Capture Button");
            LoggingUtils.info("TU_TC_35, Tier Upgrade Scan Back of ID page UI validated");
            ExtentReporter.logPass("TU_TC_35", "Tier Upgrade Scan Back of ID page UI validated");
            System.out.println("-----------------------------------------------------------");
        }else {
            ExtentReporter.logFail("TU_TC_35", "Failed to validate Tier Upgrade Scan Back of ID page UI");
        }
    }
    public void tierUpgradeScanBackOfIDPageBackArrowBtnValidation_TU_TC_36() throws Exception {
        ExtentReporter.logInfo("TU_TC_36","Tier Upgrade Scan Back of ID page BAck Arrow button Validation");
        login.loginWalletBuyerTier();
        accountDetailsPageNavigation();
        mobileGeneralMethod.tap(tierUpgradeObjects.objConfirmDetails(),"Button");
        mobileGeneralMethod.isVisible(tierUpgradeObjects.objTierUpgrade(),"Page");
        mobileGeneralMethod.tap(tierUpgradeObjects.objSelectIDSelectionBtn(), "Select ID Selection Button");
        mobileGeneralMethod.type(tierUpgradeObjects.objSearchFieldInput(), "Select ID Input field", "PhilHealth");
        mobileGeneralMethod.tap(tierUpgradeObjects.objPhilHealth(),"ID");
        mobileGeneralMethod.tap(tierUpgradeObjects.objScanBackOfID(),"Button");
        mobileGeneralMethod.isVisible(tierUpgradeObjects.objScanBackOfID(),"Button");
        mobileGeneralMethod.tap(tierUpgradeObjects.objTierUpgradeBackBtn(),"Tier Upgrade Scan Back of ID Back Arrow Button");
        mobileGeneralMethod.waitSleep(1000);
        if(mobileGeneralMethod.isVisible(tierUpgradeObjects.objTierUpgrade(),"Page")){
            LoggingUtils.info("TU_TC_36, Tier Upgrade, After clicking back btn in Tier Upgrade Scan Back of ID app navigates to Tier Upgrade page is validated");
            ExtentReporter.logPass("TU_TC_36", "Tier Upgrade, After clicking back btn in Tier Upgrade Scan Back of ID app navigates to Tier Upgrade page is validated");
            System.out.println("-----------------------------------------------------------");
        }else {
            ExtentReporter.logFail("TU_TC_36", "Failed to validate Tier Upgrade, After clicking back btn in Tier Upgrade Scan Back of ID app navigates to Tier Upgrade page");
        }
    }
    public void tierUpgradeTakeAFaceIdentityPhotoPageUIValidation_TU_TC_37() throws Exception {
        ExtentReporter.logInfo("TU_TC_37","Tier Upgrade Take a face identity photo page UI Validation");
        login.loginWalletBuyerTier();
        accountDetailsPageNavigation();
        mobileGeneralMethod.tap(tierUpgradeObjects.objConfirmDetails(),"Button");
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.isVisible(tierUpgradeObjects.objTierUpgrade(),"Page");
        mobileGeneralMethod.tap(tierUpgradeObjects.objSelectIDSelectionBtn(), "Select ID Selection Button");
        mobileGeneralMethod.type(tierUpgradeObjects.objSearchFieldInput(), "Select ID Input field", "PhilHealth");
        mobileGeneralMethod.tap(tierUpgradeObjects.objPhilHealth(),"ID");
        mobileGeneralMethod.tap(tierUpgradeObjects.objTakeAFaceIdentityPhoto(),"Button");
        if(mobileGeneralMethod.isVisible(tierUpgradeObjects.objTierUpgrade(),"Page")){
            mobileGeneralMethod.isVisible(tierUpgradeObjects.objTakeAFaceIdentityPhotoInfo(),"info");
            mobileGeneralMethod.isVisible(tierUpgradeObjects.objCaptureScreen(),"Capture Screen");
            mobileGeneralMethod.isVisible(tierUpgradeObjects.objCaptureButton(),"Capture Button");
            LoggingUtils.info("TU_TC_37, Tier Upgrade Take a face identity photo page UI validated");
            ExtentReporter.logPass("TU_TC_37", "Tier Upgrade Take a face identity photo page UI validated");
            System.out.println("-----------------------------------------------------------");
        }else {
            ExtentReporter.logFail("TU_TC_37", "Failed to validate Tier Upgrade Take a face identity photo page UI");
        }
    }

    public void tierUpgradeTakeAFaceIdentityPhotoPageBackArrowBtnValidation_TU_TC_38() throws Exception {
        ExtentReporter.logInfo("TU_TC_38","Tier Upgrade Take a face identity photo Back arrow button Validation");
        login.loginWalletBuyerTier();
        accountDetailsPageNavigation();
        mobileGeneralMethod.tap(tierUpgradeObjects.objConfirmDetails(),"Button");
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.isVisible(tierUpgradeObjects.objTierUpgrade(),"Page");
        mobileGeneralMethod.tap(tierUpgradeObjects.objSelectIDSelectionBtn(), "Select ID Selection Button");
        mobileGeneralMethod.type(tierUpgradeObjects.objSearchFieldInput(), "Select ID Input field", "PhilHealth");
        mobileGeneralMethod.tap(tierUpgradeObjects.objPhilHealth(),"ID");
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.tap(tierUpgradeObjects.objTakeAFaceIdentityPhoto(),"Button");
        mobileGeneralMethod.isVisible(tierUpgradeObjects.objTierUpgrade(),"Page");
        mobileGeneralMethod.tap(tierUpgradeObjects.objTierUpgradeBackBtn(),"Tier Upgrade, Take a face identity photo Back Arrow Btn");
        mobileGeneralMethod.waitSleep(1000);
        if(mobileGeneralMethod.isVisible(tierUpgradeObjects.objTierUpgrade(),"Page")) {
            LoggingUtils.info("TU_TC_38, Tier Upgrade, After clicking back btn in Tier Upgrade Take a face identity photo app navigates to Tier Upgrade page is validated");
            ExtentReporter.logPass("TU_TC_38", "Tier Upgrade, After clicking back btn in Tier Upgrade Take a face identity photo app navigates to Tier Upgrade page is validated");
            System.out.println("-----------------------------------------------------------");
        }else {
            ExtentReporter.logFail("TU_TC_38", "Failed to validate Tier Upgrade, After clicking back btn in Tier Upgrade Take a face identity photo app navigates to Tier Upgrade page");
        }
    }
    public void selectProductServiceOffered(String service)throws Exception{
        try{
            mobileGeneralMethod.tap(tierUpgradeObjects.objProductServiceOffered(),"DropDown");
            mobileGeneralMethod.waitSleep(1000);
            mobileGeneralMethod.isVisible(tierUpgradeObjects.objProductServicePage(),"Header");
            mobileGeneralMethod.type(tierUpgradeObjects.objSearchField(), "Search Field", "INFORMA");
            mobileGeneralMethod.tap(tierUpgradeObjects.getObjProductServiceOffered(service),"Value");
        }catch (Exception e){
             LoggingUtils.info("error : " + e);
        }
    }
    public void selectSourceOfIncome(String source)throws Exception{
        try{
            mobileGeneralMethod.tap(tierUpgradeObjects.objSourceOfIncomeField(),"DropDown");
            mobileGeneralMethod.isVisible(tierUpgradeObjects.objSourceOfIncomePage(),"Header");
            mobileGeneralMethod.type(tierUpgradeObjects.objSearchField(), "Search Field", "SALA");
            mobileGeneralMethod.tap(tierUpgradeObjects.getObjSourceOfIncome(source),"Value");
        }catch (Exception e){
             LoggingUtils.info("error : " + e);
        }
    }
    public void selectSourceBusinessIncome(String source)throws Exception{
        try{
            mobileGeneralMethod.tap(tierUpgradeObjects.objSourceOfIncomeField(),"DropDown");
            mobileGeneralMethod.isVisible(tierUpgradeObjects.objSourceOfIncomePage(),"Header");
            mobileGeneralMethod.type(tierUpgradeObjects.objSearchField(), "Search Field", "BUSINE");
            mobileGeneralMethod.tap(tierUpgradeObjects.getObjSourceOfIncome(source),"Value");
        }catch (Exception e){
            LoggingUtils.info("error : " + e);
        }
    }
    public void selectSourceStudent(String source)throws Exception{
        try{
            mobileGeneralMethod.tap(tierUpgradeObjects.objSourceOfIncomeField(),"DropDown");
            mobileGeneralMethod.isVisible(tierUpgradeObjects.objSourceOfIncomePage(),"Header");
            mobileGeneralMethod.type(tierUpgradeObjects.objSearchField(), "Search Field", "STUDEN");
            mobileGeneralMethod.tap(tierUpgradeObjects.getObjSourceOfIncome(source),"Value");
        }catch (Exception e){
            LoggingUtils.info("error : " + e);
        }
    }
    public void selectSourceFinancial(String source)throws Exception{
        try{
            mobileGeneralMethod.tap(tierUpgradeObjects.objSourceOfIncomeField(),"DropDown");
            mobileGeneralMethod.isVisible(tierUpgradeObjects.objSourceOfIncomePage(),"Header");
            mobileGeneralMethod.type(tierUpgradeObjects.objSearchField(), "Search Field", "FINANC");
            mobileGeneralMethod.tap(tierUpgradeObjects.getObjSourceOfIncome(source),"Value");
        }catch (Exception e){
            LoggingUtils.info("error : " + e);
        }
    }
    public void selectSourceRegular(String source)throws Exception{
        try{
            mobileGeneralMethod.tap(tierUpgradeObjects.objSourceOfIncomeField(),"DropDown");
            mobileGeneralMethod.isVisible(tierUpgradeObjects.objSourceOfIncomePage(),"Header");
            mobileGeneralMethod.type(tierUpgradeObjects.objSearchField(), "Search Field", "REGU");
            mobileGeneralMethod.tap(tierUpgradeObjects.getObjSourceOfIncome(source),"Value");
        }catch (Exception e){
            LoggingUtils.info("error : " + e);
        }
    }
    public void selectSourcePension(String source)throws Exception{
        try{
            mobileGeneralMethod.tap(tierUpgradeObjects.objSourceOfIncomeField(),"DropDown");
            mobileGeneralMethod.isVisible(tierUpgradeObjects.objSourceOfIncomePage(),"Header");
            mobileGeneralMethod.type(tierUpgradeObjects.objSearchField(), "Search Field", "PENS");
            mobileGeneralMethod.tap(tierUpgradeObjects.getObjSourceOfIncome(source),"Value");
        }catch (Exception e){
            LoggingUtils.info("error : " + e);
        }
    }
    public void selectSourceGovernment(String source)throws Exception{
        try{
            mobileGeneralMethod.tap(tierUpgradeObjects.objSourceOfIncomeField(),"DropDown");
            mobileGeneralMethod.isVisible(tierUpgradeObjects.objSourceOfIncomePage(),"Header");
            mobileGeneralMethod.type(tierUpgradeObjects.objSearchField(), "Search Field", "GOVERN");
            mobileGeneralMethod.tap(tierUpgradeObjects.getObjSourceOfIncome(source),"Value");
        }catch (Exception e){
            LoggingUtils.info("error : " + e);
        }
    }
    public void selectSourceOther(String source)throws Exception{
        try{
            mobileGeneralMethod.tap(tierUpgradeObjects.objSourceOfIncomeField(),"DropDown");
            mobileGeneralMethod.isVisible(tierUpgradeObjects.objSourceOfIncomePage(),"Header");
            mobileGeneralMethod.type(tierUpgradeObjects.objSearchField(), "Search Field", "OTH");
            mobileGeneralMethod.tap(tierUpgradeObjects.getObjSourceOfIncome(source),"Value");
        }catch (Exception e){
            LoggingUtils.info("error : " + e);
        }
    }
    public void selectCompanyEmployer()throws Exception{
        try{
            mobileGeneralMethod.isVisible(tierUpgradeObjects.objCompanyOrEmployerName(),"Header");
            mobileGeneralMethod.type(tierUpgradeObjects.objCompanyOrEmployerName(), "Company name", propertyReader.getproperty("COMPANY"));
        }catch (Exception e){
            LoggingUtils.info("error : " + e);
        }
    }
    public void selectPositionAtWork(String position)throws Exception{
        try{
            mobileGeneralMethod.tap(tierUpgradeObjects.objPositionAtWork(),"DropDown");
            mobileGeneralMethod.isVisible(tierUpgradeObjects.objPositionAtWorkPage(),"Header");
            mobileGeneralMethod.type(tierUpgradeObjects.objSearchField(), "Search Field", "ENGI");
            mobileGeneralMethod.tap(tierUpgradeObjects.getObjPositionAtWork(position), "Value");
        }catch (Exception e){
             LoggingUtils.info("error : " + e);
        }
    }
    public void selectNatureOfWork(String nature)throws Exception{
        try{
            mobileGeneralMethod.tap(tierUpgradeObjects.ObjNatureOfWork(),"DropDown");
            mobileGeneralMethod.isVisible(tierUpgradeObjects.ObjNatureOfWorkPage(),"Header");
            mobileGeneralMethod.type(tierUpgradeObjects.objSearchField(), "Search Field", "Accou");
            mobileGeneralMethod.tap(tierUpgradeObjects.getObjNatureOfWork(nature), "Value");
        }catch (Exception e){
             LoggingUtils.info("error : " + e);
        }
    }
    public void TierUpgradeCompanyFieldValidation_TU_TC_39() throws Exception{
        ExtentReporter.logInfo("TU_TC_39","Company/Employer Name is required when field is empty.");
        login.loginWalletBuyerTier();
        accountDetailsPageNavigation();
        selectSourceOfIncome(propertyReader.getproperty("SALARY"));
        selectProductServiceOffered(propertyReader.getproperty("IT"));
        mobileGeneralMethod.type(tierUpgradeObjects.objWorkAddress(), "Edit Text", propertyReader.getproperty("Address"));
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.verticalSwipe();
        selectPositionAtWork(propertyReader.getproperty("ENGR"));
        selectNatureOfWork(propertyReader.getproperty("ACCOUNTANT_FINANCE_STAFF"));
        mobileGeneralMethod.tap(tierUpgradeObjects.objConfirmDetails(),"Button");
        String val = propertyReader.getproperty("Company_Empty_Err");
        if(mobileGeneralMethod.isVisible(tierUpgradeObjects.objIsRequiredCompanyEmployerName(),"Message")){
            String actual = mobileGeneralMethod.getText(tierUpgradeObjects.objIsRequiredCompanyEmployerName());
            String expected = propertyReader.getproperty("Company_Empty_Err");
            mobileGeneralMethod.assertionValidation(actual, expected);
            LoggingUtils.info("TU_TC_39, Tier Upgrade, After keeping the Company/Employer Name field as empty. Error Message Should Pop Up");
            ExtentReporter.logPass("TU_TC_39", "Tier Upgrade, After keeping the Company/Employer Name field as empty. Error Message Should Pop Up");
            System.out.println("-----------------------------------------------------------");
        }else {
            ExtentReporter.logFail("TU_TC_39", "Failed to validate Tier Upgrade, After keeping the Company/Employer Name field as empty. Error Message Should Pop Up");
        }
    }
    public void TierUpgradeOrganizationNameFieldValidation_TU_TC_40() throws Exception{
        ExtentReporter.logInfo("TU_TC_40"," When user enters special characters in Company/Employer name field.");
        login.loginWalletBuyerTier();
        accountDetailsPageNavigation();
        selectSourceOfIncome(propertyReader.getproperty("SALARY"));
        mobileGeneralMethod.type(tierUpgradeObjects.objCompanyOrEmployerName(), "Company Name", propertyReader.getproperty("Invalid_Company_Name"));
        selectProductServiceOffered(propertyReader.getproperty("IT"));
        mobileGeneralMethod.type(tierUpgradeObjects.objWorkAddress(), "Work Address", propertyReader.getproperty("Address"));
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.verticalSwipe();
        selectPositionAtWork(propertyReader.getproperty("ENGR"));
        selectNatureOfWork(propertyReader.getproperty("ACCOUNTANT_FINANCE_STAFF"));
        mobileGeneralMethod.tap(tierUpgradeObjects.objConfirmDetails(),"Button");
        String val = propertyReader.getproperty("Company_Special_Err");
        if(mobileGeneralMethod.isVisible(tierUpgradeObjects.getObjIsRequired(val),"Message")){
            String actual = mobileGeneralMethod.getText(tierUpgradeObjects.getObjIsRequired(val));
            String expected = propertyReader.getproperty("Company_Special_Err");
            mobileGeneralMethod.assertionValidation(actual, expected);
            LoggingUtils.info("TU_TC_40, Tier Upgrade, When user enters special characters in Company/Employer name field. Error Message Should Pop Up");
            ExtentReporter.logPass("TU_TC_40", "Tier Upgrade, When user enters special characters in Company/Employer name field. Error Message Should Pop Up");
            System.out.println("-----------------------------------------------------------");
        }else {
            ExtentReporter.logFail("TU_TC_40", "Failed to validate Tier Upgrade, When user enters special characters in Company/Employer name field. Error Message Should Pop Up");
        }
    }
    public void TierUpgradeProductServicesFieldValidation_TU_TC_41() throws Exception{
        ExtentReporter.logInfo("TU_TC_41"," Product/services offered is required when field is empty.");
        login.loginWalletBuyerTier();
        accountDetailsPageNavigation();
        selectSourceOfIncome(propertyReader.getproperty("SALARY"));
        mobileGeneralMethod.type(tierUpgradeObjects.objCompanyOrEmployerName(), "Company Name", propertyReader.getproperty("Company_Name"));
        mobileGeneralMethod.type(tierUpgradeObjects.objWorkAddress(), "Work Address", propertyReader.getproperty("Address"));
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.verticalSwipe();
        selectPositionAtWork(propertyReader.getproperty("ENGR"));
        selectNatureOfWork(propertyReader.getproperty("ACCOUNTANT_FINANCE_STAFF"));
        mobileGeneralMethod.tap(tierUpgradeObjects.objConfirmDetails(),"Button");
        String val = propertyReader.getproperty("Product_Err");
        if(mobileGeneralMethod.isVisible(tierUpgradeObjects.getObjIsRequired(val),"Message")){
            String actual = mobileGeneralMethod.getText(tierUpgradeObjects.getObjIsRequired(val));
            String expected = propertyReader.getproperty("Product_Err");
            mobileGeneralMethod.assertionValidation(actual, expected);
            LoggingUtils.info("TU_TC_41, Tier Upgrade, After keeping the Product/services field  empty. Error Message Should Pop Up");
            ExtentReporter.logPass("TU_TC_41", "Tier Upgrade, " + "After keeping the  Product/services field  empty. Error Message Should Pop Up");
            System.out.println("-----------------------------------------------------------");
        }else {
            ExtentReporter.logFail("TU_TC_41", "Failed to validate Tier Upgrade, After keeping the  Product/services field  empty. Error Message Should Pop Up");
        }
    }
    public void TierUpgradeEmptyAddressFieldValidation_TU_TC_42() throws Exception{
        ExtentReporter.logInfo("TU_TC_42"," Work Address is required when field is empty.");
        login.loginWalletBuyerTier();
        accountDetailsPageNavigation();
        selectSourceOfIncome(propertyReader.getproperty("SALARY"));
        mobileGeneralMethod.type(tierUpgradeObjects.objCompanyOrEmployerName(), "Company Name", propertyReader.getproperty("Company_Name"));
        selectProductServiceOffered(propertyReader.getproperty("IT"));
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.verticalSwipe();
        selectPositionAtWork(propertyReader.getproperty("ENGR"));
        selectNatureOfWork(propertyReader.getproperty("ACCOUNTANT_FINANCE_STAFF"));
        mobileGeneralMethod.tap(tierUpgradeObjects.objConfirmDetails(),"Button");
        String val = propertyReader.getproperty("WorkAddress_Empty_Err");
        if(mobileGeneralMethod.isVisible(tierUpgradeObjects.getObjIsRequired(val),"Message")){
            String actual = mobileGeneralMethod.getText(tierUpgradeObjects.getObjIsRequired(val));
            String expected = propertyReader.getproperty("WorkAddress_Empty_Err");
            mobileGeneralMethod.assertionValidation(actual, expected);
            LoggingUtils.info("TU_TC_42, Tier Upgrade, After keeping the Work Address field  empty. Error Message Should Pop Up");
            ExtentReporter.logPass("TU_TC_42", "Tier Upgrade, " + "After keeping the  Work Address field  empty. Error Message Should Pop Up");
            System.out.println("-----------------------------------------------------------");
        }else {
            ExtentReporter.logFail("TU_TC_42", "Failed to validate Tier Upgrade, After keeping the  Work Address field  empty. Error Message Should Pop Up");
        }
    }
    public void TierUpgradeSpecialAddressFieldValidation_TU_TC_43() throws Exception{
        ExtentReporter.logInfo("TU_TC_43"," When user enters special characters in work address field.");
        login.loginWalletBuyerTier();
        accountDetailsPageNavigation();
        selectSourceOfIncome(propertyReader.getproperty("SALARY"));
        mobileGeneralMethod.type(tierUpgradeObjects.objCompanyOrEmployerName(), "Company Name", propertyReader.getproperty("Company_Name"));
        selectProductServiceOffered(propertyReader.getproperty("IT"));
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.type(tierUpgradeObjects.objWorkAddress(), "Work Address", propertyReader.getproperty("Invalid_Address"));
        selectPositionAtWork(propertyReader.getproperty("ENGR"));
        selectNatureOfWork(propertyReader.getproperty("ACCOUNTANT_FINANCE_STAFF"));
        mobileGeneralMethod.tap(tierUpgradeObjects.objConfirmDetails(),"Button");
        String val = propertyReader.getproperty("WorkAddress_Invalid_Err");
        if(mobileGeneralMethod.isVisible(tierUpgradeObjects.getObjIsRequired(val),"Message")){
            String actual = mobileGeneralMethod.getText(tierUpgradeObjects.getObjIsRequired(val));
            String expected = propertyReader.getproperty("WorkAddress_Invalid_Err");
            mobileGeneralMethod.assertionValidation(actual, expected);
            LoggingUtils.info("TU_TC_43, Tier Upgrade, After user enters special characters in work address field. Error Message Should Pop Up");
            ExtentReporter.logPass("TU_TC_43", "Tier Upgrade, " + "After user enters special characters in work address field. Error Message Should Pop Up");
            System.out.println("-----------------------------------------------------------");
        }else {
            ExtentReporter.logFail("TU_TC_43", "Failed to validate After user enters special characters in work address field. Error Message Should Pop Up");
        }
    }
    public void TierUpgradePositionFieldValidation_TU_TC_44() throws Exception{
        ExtentReporter.logInfo("TU_TC_44"," When keeping the required Position at work field empty.");
        login.loginWalletBuyerTier();
        accountDetailsPageNavigation();
        selectSourceOfIncome(propertyReader.getproperty("SALARY"));
        mobileGeneralMethod.type(tierUpgradeObjects.objCompanyOrEmployerName(), "Company Name", propertyReader.getproperty("Company_Name"));
        selectProductServiceOffered(propertyReader.getproperty("IT"));
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.type(tierUpgradeObjects.objWorkAddress(), "Work Address", propertyReader.getproperty("Address"));
        selectNatureOfWork(propertyReader.getproperty("ACCOUNTANT_FINANCE_STAFF"));
        mobileGeneralMethod.tap(tierUpgradeObjects.objConfirmDetails(),"Button");
        String val = propertyReader.getproperty("Position_Err");
        if(mobileGeneralMethod.isVisible(tierUpgradeObjects.getObjIsRequired(val), "Message")){
            String actual = mobileGeneralMethod.getText(tierUpgradeObjects.getObjIsRequired(val));
            String expected = propertyReader.getproperty("Position_Err");
            mobileGeneralMethod.assertionValidation(actual, expected);
            LoggingUtils.info("TU_TC_91, Tier Upgrade, When keeping the required Position at work field empty. Error Message Should Pop Up");
            ExtentReporter.logPass("TU_TC_44", "Tier Upgrade, " + "When keeping the required Position at work field empty. Error Message Should Pop Up");
        }else {
            ExtentReporter.logFail("TU_TC_44", "Failed to validate When keeping the required Position at work field empty. Error Message Should Pop Up");
        }
    }
    public void TierUpgradeNatureOfWorkFieldValidation_TU_TC_45() throws Exception{
        ExtentReporter.logInfo("TU_TC_45"," When keeping the required Nature of work field empty.");
        login.loginWalletBuyerTier();
        accountDetailsPageNavigation();
        selectSourceOfIncome(propertyReader.getproperty("SALARY"));
        mobileGeneralMethod.type(tierUpgradeObjects.objCompanyOrEmployerName(), "Company Name", propertyReader.getproperty("Company_Name"));
        selectProductServiceOffered(propertyReader.getproperty("IT"));
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.type(tierUpgradeObjects.objWorkAddress(), "Work Address", propertyReader.getproperty("Address"));
        selectPositionAtWork(propertyReader.getproperty("ENGR"));
        mobileGeneralMethod.tap(tierUpgradeObjects.objConfirmDetails(),"Button");
        String val = propertyReader.getproperty("Nature_Err");
        if(mobileGeneralMethod.isVisible(tierUpgradeObjects.getObjIsRequired(val),"Message")){
            String actual = mobileGeneralMethod.getText(tierUpgradeObjects.getObjIsRequired(val));
            String expected = propertyReader.getproperty("Nature_Err");
            mobileGeneralMethod.assertionValidation(actual, expected);
            LoggingUtils.info("TU_TC_45, Tier Upgrade, When keeping the required Nature of work field empty. Error Message Should Pop Up");
            ExtentReporter.logPass("TU_TC_45", "Tier Upgrade, " + "When keeping the required Nature of work field empty. Error Message Should Pop Up");
            System.out.println("-----------------------------------------------------------");
        }else {
            ExtentReporter.logFail("TU_TC_45", "Failed to validate When keeping the required Nature of work field empty. Error Message Should Pop Up");
        }
    }
    public void TierUpgradePensionFieldValidation_TU_TC_46() throws Exception{
        ExtentReporter.logInfo("TU_TC_46"," When keeping the required Receiving Pension Form field empty.");
        login.loginWalletBuyerTier();
        accountDetailsPageNavigation();
        selectSourcePension(propertyReader.getproperty("PENSION"));
        mobileGeneralMethod.waitSleep(2000);
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.tap(tierUpgradeObjects.objConfirmDetails(),"Button");
        String val = propertyReader.getproperty("ReceivingPension_Err");
        if(mobileGeneralMethod.isVisible(tierUpgradeObjects.getObjIsRequired(val),"Message")){
            String actual = mobileGeneralMethod.getText(tierUpgradeObjects.getObjIsRequired(val));
            String expected = propertyReader.getproperty("ReceivingPension_Err");
            mobileGeneralMethod.assertionValidation(actual, expected);
            LoggingUtils.info("TU_TC_46, Tier Upgrade, When keeping the required Receiving Pension Form field empty. Error Message Should Pop Up");
            ExtentReporter.logPass("TU_TC_46", "Tier Upgrade, " + "When keeping the required Receiving Pension Form field empty. Error Message Should Pop Up");
            System.out.println("-----------------------------------------------------------");
        }else {
            ExtentReporter.logFail("TU_TC_46", "Failed to validate When keeping the required Receiving Pension Form field empty. Error Message Should Pop Up");
        }
    }

    public void TierUpgradeYearRetiredFieldValidation_TU_TC_47() throws Exception{
        ExtentReporter.logInfo("TU_TC_47"," When keeping the required Year Retired field empty.");
        login.loginWalletBuyerTier();
        accountDetailsPageNavigation();
        selectSourcePension(propertyReader.getproperty("PENSION"));
        mobileGeneralMethod.waitSleep(2000);
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.tap(tierUpgradeObjects.objConfirmDetails(),"Button");
        String val = propertyReader.getproperty("YearRetired_Err");
        if(mobileGeneralMethod.isVisible(tierUpgradeObjects.getObjIsRequired(val),"Message")){
            String actual = mobileGeneralMethod.getText(tierUpgradeObjects.getObjIsRequired(val));
            String expected = propertyReader.getproperty("YearRetired_Err");
            mobileGeneralMethod.assertionValidation(actual, expected);
            LoggingUtils.info("TU_TC_47, When keeping the required Year Retired field empty. Error Message Should Pop Up");
            ExtentReporter.logPass("TU_TC_47", "When keeping the required Year Retired field empty. Error Message Should Pop Up");
            System.out.println("-----------------------------------------------------------");
        }else {
            ExtentReporter.logFail("TU_TC_47", "Failed to validate When keeping the required Year Retired field empty. Error Message Should Pop Up");
        }
    }
    public void TierUpgradePositionRetirementFieldValidation_TU_TC_48() throws Exception{
        ExtentReporter.logInfo("TU_TC_48"," When  keeping the required Position Upon Retirement empty");
        login.loginWalletBuyerTier();
        accountDetailsPageNavigation();
        selectSourcePension(propertyReader.getproperty("PENSION"));
        mobileGeneralMethod.waitSleep(2000);
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.tap(tierUpgradeObjects.objConfirmDetails(),"Button");
        String val = propertyReader.getproperty("PositionRetirement_Err");
        if(mobileGeneralMethod.isVisible(tierUpgradeObjects.getObjIsRequired(val),"Message")){
            String actual = mobileGeneralMethod.getText(tierUpgradeObjects.getObjIsRequired(val));
            String expected = propertyReader.getproperty("PositionRetirement_Err");
            mobileGeneralMethod.assertionValidation(actual, expected);
            LoggingUtils.info("TU_TC_48, Tier Upgrade, When  keeping the required Position Upon Retirement empty. Error Message Should Pop Up");
            ExtentReporter.logPass("TU_TC_48", "Tier Upgrade, " + "When  keeping the required Position Upon Retirement empty. Error Message Should Pop Up");
            System.out.println("-----------------------------------------------------------");
        }else {
            ExtentReporter.logFail("TU_TC_48", "Failed to validate When keeping the required Position Upon Retirement empty. Error Message Should Pop Up");
        }
    }
    public void TierUpgradeRemarksFieldValidation_TU_TC_49() throws Exception{
        ExtentReporter.logInfo("TU_TC_49"," When keeping the required Remarks field empty.");
        login.loginWalletBuyerTier();
        accountDetailsPageNavigation();
        selectSourceFinancial(propertyReader.getproperty("FINANCIAL_ASSISTANCE"));
        mobileGeneralMethod.waitSleep(2000);
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.tap(tierUpgradeObjects.objConfirmDetails(),"Button");
        String val = propertyReader.getproperty("Remarks_Err");
        if(mobileGeneralMethod.isVisible(tierUpgradeObjects.getObjIsRequired(val),"Message")){
            String actual = mobileGeneralMethod.getText(tierUpgradeObjects.getObjIsRequired(val));
            String expected = propertyReader.getproperty("Remarks_Err");
            mobileGeneralMethod.assertionValidation(actual, expected);
            LoggingUtils.info("TU_TC_49, Tier Upgrade, When keeping the required Remarks field empty Error Message Should Pop Up");
            ExtentReporter.logPass("TU_TC_49", "Tier Upgrade, " + "When keeping the required Remarks field empty. Error Message Should Pop Up");
            System.out.println("-----------------------------------------------------------");
        }else {
            ExtentReporter.logFail("TU_TC_49", "Failed to validate When keeping the required Position Upon Retirement empty. Error Message Should Pop Up");
        }
    }
    public void TierUpgradeErrorMessageUniversityIsRequiredEmptyFieldValidation_TU_TC_50() throws Exception{
        ExtentReporter.logInfo("TU_TC_50"," When keeping the required School/University field empty.");
        login.loginWalletBuyerTier();
        accountDetailsPageNavigation();
        selectSourceStudent(propertyReader.getproperty("STUDENT_SCHOLARSHIP"));
        mobileGeneralMethod.waitSleep(2000);
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.tap(tierUpgradeObjects.objConfirmDetails(),"Button");
        String val = propertyReader.getproperty("University_Err");
        if(mobileGeneralMethod.isVisible(tierUpgradeObjects.getObjIsRequired(val),"Message")){
            String actual = mobileGeneralMethod.getText(tierUpgradeObjects.getObjIsRequired(val));
            String expected = propertyReader.getproperty("University_Err");
            mobileGeneralMethod.assertionValidation(actual, expected);
            LoggingUtils.info("TU_TC_50, When keeping the required School/University field empty. Error Message Should Pop Up");
            ExtentReporter.logPass("TU_TC_50", "When keeping the required School/University field empty. Error Message Should Pop Up");
            System.out.println("-----------------------------------------------------------");
        }else {
            ExtentReporter.logFail("TU_TC_50", "Failed to validate When keeping the required School/University field empty. Error Message Should Pop Up");
        }
    }
    public void TierUpgradeErrorMessageUniversityNameSpecialCharactersValidation_TU_TC_51() throws Exception{
        ExtentReporter.logInfo("TU_TC_51"," When user enters special characters in School/University field.");
        login.loginWalletBuyerTier();
        accountDetailsPageNavigation();
        selectSourceStudent(propertyReader.getproperty("STUDENT_SCHOLARSHIP"));
        mobileGeneralMethod.waitSleep(2000);
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.type(tierUpgradeObjects.objUniversityField(), "Universty_Name", propertyReader.getproperty("Invalid_University_Name"));
        mobileGeneralMethod.tap(tierUpgradeObjects.objConfirmDetails(),"Button");
        String val = propertyReader.getproperty("University_Special_Err");
        if(mobileGeneralMethod.isVisible(tierUpgradeObjects.getObjIsRequired(val),"Message")){
            String actual = mobileGeneralMethod.getText(tierUpgradeObjects.objSchoolFieldMessage());
            String expected = propertyReader.getproperty("University_Special_Err");
            mobileGeneralMethod.assertionValidation(actual, expected);
            LoggingUtils.info("TU_TC_51, Tier Upgrade, When user enters special characters in School/University field. Error Message Should Pop Up");
            ExtentReporter.logPass("TU_TC_51", "TU_TC_98, Tier Upgrade, " + "When user enters special characters in School/University field. Error Message Should Pop Up");
            System.out.println("-----------------------------------------------------------");
        }else {
            ExtentReporter.logFail("TU_TC_51", "Failed to validate When user enters special characters in School/University field. Error Message Should Pop Up");
        }
    }
    public void TierUpgradeErrorMessageSchoolAddressIsRequiredEmptyValidation_TU_TC_52() throws Exception{
        ExtentReporter.logInfo("TU_TC_52"," When keeping the required School Address field empty.");
        login.loginWalletBuyerTier();
        accountDetailsPageNavigation();
        selectSourceStudent(propertyReader.getproperty("STUDENT_SCHOLARSHIP"));
        mobileGeneralMethod.waitSleep(2000);
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.tap(tierUpgradeObjects.objConfirmDetails(),"Button");
        if(mobileGeneralMethod.isVisible(tierUpgradeObjects.objSchoolAddressFieldMessage(),"Message")){
            String actual = mobileGeneralMethod.getText(tierUpgradeObjects.objSchoolAddressFieldMessage());
            String expected = propertyReader.getproperty("SchoolAddress_Err");
            mobileGeneralMethod.assertionValidation(actual, expected);
            LoggingUtils.info("TU_TC_52, Tier Upgrade, When keeping the required School Address field empty. Error Message Should Pop Up");
            ExtentReporter.logPass("TU_TC_52", "When keeping the required School Address field empty. Error Message Should Pop Up");
            System.out.println("-----------------------------------------------------------");
        }else {
            ExtentReporter.logFail("TU_TC_52", "Failed to validate When keeping the required School Address field empty. Error Message Should Pop Up");
        }
    }
    public void TierUpgradeErrorMessageSchoolAddressSpecialCharactersValidation_TU_TC_53() throws Exception{
        ExtentReporter.logInfo("TU_TC_53"," When user enters special characters in School Address field.");
        login.loginWalletBuyerTier();
        accountDetailsPageNavigation();
        selectSourceStudent(propertyReader.getproperty("STUDENT_SCHOLARSHIP"));
        mobileGeneralMethod.waitSleep(2000);
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.type(tierUpgradeObjects.objSchoolAddressField(), "School_Address", propertyReader.getproperty("Invalid_School_Address"));
        mobileGeneralMethod.tap(tierUpgradeObjects.objConfirmDetails(),"Button");
        if(mobileGeneralMethod.isVisible(tierUpgradeObjects.objSchoolAddressFieldMessage(), "Message")){
            String actual = mobileGeneralMethod.getText(tierUpgradeObjects.objSchoolAddressFieldMessage());
            String expected = propertyReader.getproperty("SchoolAddress_Special_Err");
            mobileGeneralMethod.assertionValidation(actual, expected);
            LoggingUtils.info("TU_TC_53, Tier Upgrade, When user enters special characters in School Address field. Error Message Should Pop Up");
            ExtentReporter.logPass("TU_TC_53", "When user enters special characters in School Address field. Error Message Should Pop Up");
            System.out.println("-----------------------------------------------------------");
        }else {
            ExtentReporter.logFail("TU_TC_53", "Failed to validate When user enters special characters in School Address field. Error Message Should Pop Up");
        }
    }
    public void TierUpgradeErrorMessageProgramTypeIsRequiredEmptyFieldValidation_TU_TC_54() throws Exception{
        ExtentReporter.logInfo("TU_TC_54"," When keeping the required Program Type field empty.");
        login.loginWalletBuyerTier();
        accountDetailsPageNavigation();
        selectSourceGovernment(propertyReader.getproperty("GOVERNMENT_AID"));
        mobileGeneralMethod.waitSleep(2000);
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.tap(tierUpgradeObjects.objConfirmDetails(),"Button");
        if(mobileGeneralMethod.isVisible(tierUpgradeObjects.objGrantFieldMessage(),"Message")){
            String actual = mobileGeneralMethod.getText(tierUpgradeObjects.objGrantFieldMessage());
            String expected = propertyReader.getproperty("ProgramType_Err");
            mobileGeneralMethod.assertionValidation(actual, expected);
            LoggingUtils.info("TU_TC_54, Tier Upgrade, When keeping the required Program Type field empty. Error Message Should Pop Up");
            ExtentReporter.logPass("TU_TC_54", " When keeping the required Program Type field empty. Error Message Should Pop Up");
            System.out.println("-----------------------------------------------------------");
        }else {
            ExtentReporter.logFail("TU_TC_54", "Failed to validate When keeping the required Program Type field empty. Error Message Should Pop Up");
        }
    }
    public void TierUpgradeErrorMessageProgramTypeSpecialCharactersValidation_TU_TC_55() throws Exception{
        ExtentReporter.logInfo("TU_TC_55"," When user enters special characters in Program Type field.");
        login.loginWalletBuyerTier();
        accountDetailsPageNavigation();
        selectSourceGovernment(propertyReader.getproperty("GOVERNMENT_AID"));
        mobileGeneralMethod.waitSleep(2000);
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.type(tierUpgradeObjects.objProgramTypeField(), "Program_Type", propertyReader.getproperty("Invalid_Program_Type"));
        mobileGeneralMethod.tap(tierUpgradeObjects.objConfirmDetails(),"Button");
        if(mobileGeneralMethod.isVisible(tierUpgradeObjects.objGrantFieldMessage(),"Message")){
            String actual = mobileGeneralMethod.getText(tierUpgradeObjects.objGrantFieldMessage());
            String expected = propertyReader.getproperty("ProgramType_Special_Err");
            mobileGeneralMethod.assertionValidation(actual, expected);
            LoggingUtils.info("TU_TC_55, Tier Upgrade, When user enters special characters in Program Type field. Error Message Should Pop Up");
            ExtentReporter.logPass("TU_TC_55", "When user enters special characters in Program Type field. Error Message Should Pop Up");
            System.out.println("-----------------------------------------------------------");
        }else {
            ExtentReporter.logFail("TU_TC_55", "Failed to validate When user enters special characters in Program Type field. Error Message Should Pop Up");
        }
    }
    public void TierUpgradeErrorMessageOccupationNameIsRequiredEmptyFieldValidation_TU_TC_56() throws Exception{
        ExtentReporter.logInfo("TU_TC_56"," When keeping the required Occupation field empty.");
        login.loginWalletBuyerTier();
        accountDetailsPageNavigation();
        selectSourceOther(propertyReader.getproperty("OTHER"));
        mobileGeneralMethod.waitSleep(2000);
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.tap(tierUpgradeObjects.objConfirmDetails(),"Button");
        if(mobileGeneralMethod.isVisible(tierUpgradeObjects.objOccupationFieldMessage(),"Message")){
            String actual = mobileGeneralMethod.getText(tierUpgradeObjects.objOccupationFieldMessage());
            String expected = propertyReader.getproperty("Occupation_Err");
            mobileGeneralMethod.assertionValidation(actual, expected);
            LoggingUtils.info("TU_TC_56, Tier Upgrade, When keeping the required Occupation field empty. Error Message Should Pop Up");
            ExtentReporter.logPass("TU_TC_56", "When keeping the required Occupation field empty. Error Message Should Pop Up");
            System.out.println("-----------------------------------------------------------");
        }else {
            ExtentReporter.logFail("TU_TC_56", "Failed to validate When keeping the required Occupation field empty. Error Message Should Pop Up");
        }
    }
    public void TierUpgradeErrorMessageOccupationNameSpecialCharactersValidation_TU_TC_57() throws Exception{
        ExtentReporter.logInfo("TU_TC_57","When user enters special characters in Occupation field.");
        login.loginWalletBuyerTier();
        accountDetailsPageNavigation();
        selectSourceOther(propertyReader.getproperty("OTHER"));
        mobileGeneralMethod.waitSleep(2000);
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.type(tierUpgradeObjects.objOccupationField(), "Occupation", propertyReader.getproperty("Invalid_Occupation"));
        mobileGeneralMethod.tap(tierUpgradeObjects.objConfirmDetails(),"Button");
        if(mobileGeneralMethod.isVisible(tierUpgradeObjects.objOccupationFieldMessage(),"Message")){
            String actual = mobileGeneralMethod.getText(tierUpgradeObjects.objOccupationFieldMessage());
            String expected = propertyReader.getproperty("Occupation_Special_Err");
            mobileGeneralMethod.assertionValidation(actual, expected);
            LoggingUtils.info("TU_TC_57, Tier Upgrade, When user enters special characters in Occupation field. Error Message Should Pop Up");
            ExtentReporter.logPass("TU_TC_57", "When user enters special characters in Occupation field. Error Message Should Pop Up");
            System.out.println("-----------------------------------------------------------");
        }else {
            ExtentReporter.logFail("TU_TC_57", "Failed to validate When user enters special characters in Occupation field. Error Message Should Pop Up");
        }
    }
    public void TierUpgradeErrorMessageSourceOfFundsIsRequiredEmptyFieldValidation_TU_TC_58() throws Exception{
        ExtentReporter.logInfo("TU_TC_58"," When keeping the required Source of Funds field empty.");
        login.loginWalletBuyerTier();
        accountDetailsPageNavigation();
        selectSourceOther(propertyReader.getproperty("OTHER"));
        mobileGeneralMethod.waitSleep(2000);
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.tap(tierUpgradeObjects.objConfirmDetails(),"Button");
        if(mobileGeneralMethod.isVisible(tierUpgradeObjects.objSourceOfFundsFieldMessage(),"Message")){
            String actual = mobileGeneralMethod.getText(tierUpgradeObjects.objSourceOfFundsFieldMessage());
            String expected = propertyReader.getproperty("SourceOfFunds_Err");
            mobileGeneralMethod.assertionValidation(actual, expected);
            LoggingUtils.info("TU_TC_58, Tier Upgrade, When keeping the required Source of Funds field empty. Error Message Should Pop Up");
            ExtentReporter.logPass("TU_TC_58", "When keeping the required Source of Funds field empty. Error Message Should Pop Up");
            System.out.println("-----------------------------------------------------------");
        }else {
            ExtentReporter.logFail("TU_TC_58", "Failed to validate When keeping the required Source of Funds field empty. Error Message Should Pop Up");
        }
    }
    public void TierUpgradeErrorMessageRetiredFieldSpecialCharactersValidation_TU_TC_59() throws Exception{
        ExtentReporter.logInfo("TU_TC_59"," When user enters special characters in Year Retired field.");
        login.loginWalletBuyerTier();
        accountDetailsPageNavigation();
        selectSourcePension(propertyReader.getproperty("PENSION"));
        mobileGeneralMethod.waitSleep(2000);
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.type(tierUpgradeObjects.objYearRetiredField(), "Retired_Year", propertyReader.getproperty("Invalid_Retired_Year"));
        mobileGeneralMethod.tap(tierUpgradeObjects.objConfirmDetails(),"Button");
        if(mobileGeneralMethod.isVisible(tierUpgradeObjects.objYearRetiredFieldMessage(),"Message")){
            String actual = mobileGeneralMethod.getText(tierUpgradeObjects.objYearRetiredFieldMessage());
            String expected = propertyReader.getproperty("YearRetired_Err");
            mobileGeneralMethod.assertionValidation(actual, expected);
            LoggingUtils.info("TU_TC_59, When user enters special characters in Year Retired field. Error Message Should Pop Up");
            ExtentReporter.logPass("TU_TC_59", "When user enters special characters in Year Retired field. Error Message Should Pop Up");
            System.out.println("-----------------------------------------------------------");
        }else {
            ExtentReporter.logFail("TU_TC_59", "Failed to validate When user enters special characters in Year Retired field. Error Message Should Pop Up");
        }
    }
    public void TierUpgradeBranchTierVerificationTierNavigation_TU_TC_60() throws Exception{
        ExtentReporter.logInfo("TU_TC_60"," When branch tier user navigates to verification tier perk page.");
        login.loginWalletBranchTier();
        mobileGeneralMethod.tap(homePageObject.objHamburgerMenu(), "Hamburger Menu");
        mobileGeneralMethod.tap(homePageObject.objViewTier(),"Button");
        if(mobileGeneralMethod.isVisible(homePageObject.objVerificationTierPerks(),"Page")){
            mobileGeneralMethod.isVisible(homePageObject.objBranchVerified(),"Current Tier");
            LoggingUtils.info("TU_TC_60, When branch tier user navigates to verification tier perk page. User should be navigated");
            ExtentReporter.logPass("TU_TC_60", "When branch tier user navigates to verification tier perk page. User should be navigated");
            System.out.println("-----------------------------------------------------------");
        }else {
            ExtentReporter.logFail("TU_TC_60", "Failed to validate When branch tier user navigates to verification tier perk page. User should be navigated");
        }
    }
    public void TierUpgradeSchoolUniveristyFieldValidation_TU_TC_61() throws Exception{
        ExtentReporter.logInfo("TU_TC_61"," When user enters alphabets, space, and numbers in School/University Name field.");
        login.loginWalletBuyerTier();
        accountDetailsPageNavigation();
        selectSourceStudent(propertyReader.getproperty("STUDENT_SCHOLARSHIP"));
        mobileGeneralMethod.waitSleep(2000);
        mobileGeneralMethod.verticalSwipe();
        if(mobileGeneralMethod.isVisible(tierUpgradeObjects.objUniversityField(), "School/University Name")) {
            mobileGeneralMethod.type(tierUpgradeObjects.objUniversityField(), "School/University Name", propertyReader.getproperty("University_Name_v1"));
            mobileGeneralMethod.tap(tierUpgradeObjects.objConfirmDetails(), "Button");
            String actual = mobileGeneralMethod.getText(tierUpgradeObjects.objUniversityField());
            String exptected = propertyReader.getproperty("University_Name_v1");
            mobileGeneralMethod.assertionValidation(actual, exptected);
            LoggingUtils.info("TU_TC_61, When user enters alphabets, space, and numbers in School/University field. User should be able to input");
            ExtentReporter.logPass("TU_TC_61", "When user enters alphabets, space, and numbers in School/University field. User should be able to input");
            System.out.println("-----------------------------------------------------------");
        }else {
            ExtentReporter.logFail("TU_TC_61", "Failed to validate When user enters alphabets, space, and numbers in School/University field. User should be able to input");
        }
    }
    public void TierUpgradeSchoolAddressFieldValidation_TU_TC_62() throws Exception{
        ExtentReporter.logInfo("TU_TC_62"," When user enters alphabets, space, and numbers in School/University Address field.");
        login.loginWalletBuyerTier();
        accountDetailsPageNavigation();
        selectSourceStudent(propertyReader.getproperty("STUDENT_SCHOLARSHIP"));
        mobileGeneralMethod.waitSleep(2000);
        mobileGeneralMethod.verticalSwipe();
        if(mobileGeneralMethod.isVisible(tierUpgradeObjects.objUniversityField(), "School/University Name")) {
            mobileGeneralMethod.type(tierUpgradeObjects.objUniversityField(), "School/University Name", propertyReader.getproperty("University_Name_v1"));
            mobileGeneralMethod.type(tierUpgradeObjects.objSchoolAddressField(), "School/University Address", propertyReader.getproperty("School_Address_v1"));
            mobileGeneralMethod.tap(tierUpgradeObjects.objConfirmDetails(), "Button");
            String actual = mobileGeneralMethod.getText(tierUpgradeObjects.objSchoolAddressField());
            String exptected = propertyReader.getproperty("School_Address_v1");
            mobileGeneralMethod.assertionValidation(actual, exptected);
            LoggingUtils.info("TU_TC_62, Tier Upgrade, When user enters alphabets, space, and numbers in School/University Address field. User should be able to input");
            ExtentReporter.logPass("TU_TC_62", "Tier Upgrade, " + " When user enters alphabets, space, and numbers in School/University Address field. User should be able to input");
            System.out.println("-----------------------------------------------------------");
        }else {
            ExtentReporter.logFail("TU_TC_62", "Failed to validate When user enters alphabets, space, and numbers in School/University Address field. User should be able to input");
        }
    }
    public void TierUpgradeGrantProgramFIeldValidation_TU_TC_63() throws Exception{
        ExtentReporter.logInfo("TU_TC_63"," When user enters alphabets, space, and numbers in Grant/Program Type field.");
        login.loginWalletBuyerTier();
        accountDetailsPageNavigation();
        selectSourceGovernment(propertyReader.getproperty("GOVERNMENT_AID"));
        mobileGeneralMethod.waitSleep(2000);
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.type(tierUpgradeObjects.objProgramTypeField(), "Grant/Program Type Field", propertyReader.getproperty("Program_Type_v1"));
        mobileGeneralMethod.tap(tierUpgradeObjects.objConfirmDetails(),"Button");
        if(mobileGeneralMethod.isVisible(tierUpgradeObjects.objSelectAnyValidID(),"Page")){
            LoggingUtils.info("TU_TC_63, When user enters alphabets, space, and numbers in Grant/Program Type field. User should be able to input");
            ExtentReporter.logPass("TU_TC_63", "When user enters alphabets, space, and numbers in Grant/Program Type field. User should be able to input");
            System.out.println("-----------------------------------------------------------");
        }else {
            ExtentReporter.logFail("TU_TC_63", "Failed to validate When user enters alphabets, space, and numbers in Grant/Program Type field. User should be able to input");
        }
    }
    public void TierUpgradeOccupationFieldValidation_TU_TC_64() throws Exception{
        ExtentReporter.logInfo("TU_TC_64"," When user enters alphabets, space, and numbers in Occupation Type field.");
        login.loginWalletBuyerTier();
        accountDetailsPageNavigation();
        selectSourceOther(propertyReader.getproperty("OTHER"));
        mobileGeneralMethod.waitSleep(2000);
        mobileGeneralMethod.verticalSwipe();
        if(mobileGeneralMethod.isVisible(tierUpgradeObjects.objOccupationField(), "Occupation Field")) {
            mobileGeneralMethod.type(tierUpgradeObjects.objOccupationField(), "Occupation Field", propertyReader.getproperty("Occupation_v1"));
            mobileGeneralMethod.tap(tierUpgradeObjects.objConfirmDetails(), "Button");
            String actual = mobileGeneralMethod.getText(tierUpgradeObjects.objOccupationField());
            String exptected = propertyReader.getproperty("Occupation_v1");
            mobileGeneralMethod.assertionValidation(actual, exptected);
            LoggingUtils.info("TU_TC_64, When user enters alphabets, space, and numbers in Occupation Type field. User should be able to input");
            ExtentReporter.logPass("TU_TC_64", "When user enters alphabets, space, and numbers in Occupation Type field. User should be able to input");
            System.out.println("-----------------------------------------------------------");
        }else {
            ExtentReporter.logFail("TU_TC_64", "Failed to validate When user enters alphabets, space, and numbers in Occupation Type field. User should be able to input");
        }
    }
    public void TierUpgradeOccupationFieldValidation_TU_TC_65() throws Exception{
        ExtentReporter.logInfo("TU_TC_65"," When user enters alphabets, space, and numbers in Source of Fund field.");
        login.loginWalletBuyerTier();
        accountDetailsPageNavigation();
        selectSourceOther(propertyReader.getproperty("OTHER"));
        mobileGeneralMethod.waitSleep(2000);
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.type(tierUpgradeObjects.objOccupationField(), "Occupation Field", propertyReader.getproperty("Occupation_v1"));
        mobileGeneralMethod.type(tierUpgradeObjects.objSourceOfFundsField(), "Source of Fund Field", propertyReader.getproperty("SourceFund_v1"));
        mobileGeneralMethod.tap(tierUpgradeObjects.objConfirmDetails(),"Button");
        if(mobileGeneralMethod.isVisible(tierUpgradeObjects.objSelectAnyValidID(),"Page")){
            LoggingUtils.info("TU_TC_65, When user enters alphabets, space, and numbers in Source of Fund field. User should be able to input");
            ExtentReporter.logPass("TU_TC_65", "When user enters alphabets, space, and numbers in Source of Fund field. User should be able to input");
            System.out.println("-----------------------------------------------------------");
        }else {
            ExtentReporter.logFail("TU_TC_65", "Failed to validate When user enters alphabets, space, and numbers in Source of Fund field. User should be able to input");
        }
    }
    public void TierUpgradeCompanyFieldValidation_TU_TC_66() throws Exception{
        ExtentReporter.logInfo("TU_TC_66","Company/Employer Name is required when field is empty.");
        login.loginWalletBuyerTier();
        accountDetailsPageNavigation();
        selectSourceBusinessIncome(propertyReader.getproperty("BUSINESS_INCOME"));
        selectProductServiceOffered(propertyReader.getproperty("IT"));
        mobileGeneralMethod.type(tierUpgradeObjects.objWorkAddress(), "Edit Text", propertyReader.getproperty("Address"));
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.verticalSwipe();
        selectPositionAtWork(propertyReader.getproperty("ENGR"));
        selectNatureOfWork(propertyReader.getproperty("ACCOUNTANT_FINANCE_STAFF"));
        mobileGeneralMethod.tap(tierUpgradeObjects.objConfirmDetails(),"Button");
        String val = propertyReader.getproperty("Company_Empty_Err");
        if(mobileGeneralMethod.isVisible(tierUpgradeObjects.objIsRequiredCompanyEmployerName(),"Message")){
            String actual = mobileGeneralMethod.getText(tierUpgradeObjects.objIsRequiredCompanyEmployerName());
            String expected = propertyReader.getproperty("Company_Empty_Err");
            mobileGeneralMethod.assertionValidation(actual, expected);
            LoggingUtils.info("TU_TC_66, After keeping the Company/Employer Name field as empty. Error Message Should Pop Up");
            ExtentReporter.logPass("TU_TC_66", "After keeping the Company/Employer Name field as empty. Error Message Should Pop Up");
            System.out.println("-----------------------------------------------------------");
        }else {
            ExtentReporter.logFail("TU_TC_66", "Failed to validate Tier Upgrade, After keeping the Company/Employer Name field as empty. Error Message Should Pop Up");
        }
    }
    public void TierUpgradeOrganizationNameFieldValidation_TU_TC_67() throws Exception{
        ExtentReporter.logInfo("TU_TC_67"," When user enters special characters in Company/Employer name field.");
        login.loginWalletBuyerTier();
        accountDetailsPageNavigation();
        selectSourceBusinessIncome(propertyReader.getproperty("BUSINESS_INCOME"));
        mobileGeneralMethod.type(tierUpgradeObjects.objCompanyOrEmployerName(), "Company Name", propertyReader.getproperty("Invalid_Company_Name"));
        selectProductServiceOffered(propertyReader.getproperty("IT"));
        mobileGeneralMethod.type(tierUpgradeObjects.objWorkAddress(), "Work Address", propertyReader.getproperty("Address"));
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.verticalSwipe();
        selectPositionAtWork(propertyReader.getproperty("ENGR"));
        selectNatureOfWork(propertyReader.getproperty("ACCOUNTANT_FINANCE_STAFF"));
        mobileGeneralMethod.tap(tierUpgradeObjects.objConfirmDetails(),"Button");
        String val = propertyReader.getproperty("Company_Special_Err");
        if(mobileGeneralMethod.isVisible(tierUpgradeObjects.getObjIsRequired(val),"Message")){
            String actual = mobileGeneralMethod.getText(tierUpgradeObjects.getObjIsRequired(val));
            String expected = propertyReader.getproperty("Company_Special_Err");
            mobileGeneralMethod.assertionValidation(actual, expected);
            LoggingUtils.info("TU_TC_67, When user enters special characters in Company/Employer name field. Error Message Should Pop Up");
            ExtentReporter.logPass("TU_TC_67", "When user enters special characters in Company/Employer name field. Error Message Should Pop Up");
            System.out.println("-----------------------------------------------------------");
        }else {
            ExtentReporter.logFail("TU_TC_67", "Failed to validate Tier Upgrade, When user enters special characters in Company/Employer name field. Error Message Should Pop Up");
        }
    }
    public void TierUpgradeProductServicesFieldValidation_TU_TC_68() throws Exception{
        ExtentReporter.logInfo("TU_TC_68"," Product/services offered is required when field is empty.");
        login.loginWalletBuyerTier();
        accountDetailsPageNavigation();
        selectSourceBusinessIncome(propertyReader.getproperty("BUSINESS_INCOME"));
        mobileGeneralMethod.type(tierUpgradeObjects.objCompanyOrEmployerName(), "Company Name", propertyReader.getproperty("Company_Name"));
        mobileGeneralMethod.type(tierUpgradeObjects.objWorkAddress(), "Work Address", propertyReader.getproperty("Address"));
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.verticalSwipe();
        selectPositionAtWork(propertyReader.getproperty("ENGR"));
        selectNatureOfWork(propertyReader.getproperty("ACCOUNTANT_FINANCE_STAFF"));
        mobileGeneralMethod.tap(tierUpgradeObjects.objConfirmDetails(),"Button");
        String val = propertyReader.getproperty("Product_Err");
        if(mobileGeneralMethod.isVisible(tierUpgradeObjects.getObjIsRequired(val),"Message")){
            String actual = mobileGeneralMethod.getText(tierUpgradeObjects.getObjIsRequired(val));
            String expected = propertyReader.getproperty("Product_Err");
            mobileGeneralMethod.assertionValidation(actual, expected);
            LoggingUtils.info("TU_TC_68, Tier Upgrade, After keeping the Product/services field  empty. Error Message Should Pop Up");
            ExtentReporter.logPass("TU_TC_68", "Tier Upgrade, " + "After keeping the  Product/services field  empty. Error Message Should Pop Up");
            System.out.println("-----------------------------------------------------------");
        }else {
            ExtentReporter.logFail("TU_TC_68", "Failed to validate Tier Upgrade, After keeping the  Product/services field  empty. Error Message Should Pop Up");
        }
    }
    public void TierUpgradeEmptyAddressFieldValidation_TU_TC_69() throws Exception{
        ExtentReporter.logInfo("TU_TC_69"," Work Address is required when field is empty.");
        login.loginWalletBuyerTier();
        accountDetailsPageNavigation();
        selectSourceBusinessIncome(propertyReader.getproperty("BUSINESS_INCOME"));
        mobileGeneralMethod.type(tierUpgradeObjects.objCompanyOrEmployerName(), "Company Name", propertyReader.getproperty("Company_Name"));
        selectProductServiceOffered(propertyReader.getproperty("IT"));
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.verticalSwipe();
        selectPositionAtWork(propertyReader.getproperty("ENGR"));
        selectNatureOfWork(propertyReader.getproperty("ACCOUNTANT_FINANCE_STAFF"));
        mobileGeneralMethod.tap(tierUpgradeObjects.objConfirmDetails(),"Button");
        String val = propertyReader.getproperty("WorkAddress_Empty_Err");
        if(mobileGeneralMethod.isVisible(tierUpgradeObjects.getObjIsRequired(val),"Message")){
            String actual = mobileGeneralMethod.getText(tierUpgradeObjects.getObjIsRequired(val));
            String expected = propertyReader.getproperty("WorkAddress_Empty_Err");
            mobileGeneralMethod.assertionValidation(actual, expected);
            LoggingUtils.info("TU_TC_69, Tier Upgrade, After keeping the Work Address field  empty. Error Message Should Pop Up");
            ExtentReporter.logPass("TU_TC_69", "Tier Upgrade, " + "After keeping the  Work Address field  empty. Error Message Should Pop Up");
            System.out.println("-----------------------------------------------------------");
        }else {
            ExtentReporter.logFail("TU_TC_69", "Failed to validate Tier Upgrade, After keeping the  Work Address field  empty. Error Message Should Pop Up");
        }
    }
    public void TierUpgradeSpecialAddressFieldValidation_TU_TC_70() throws Exception{
        ExtentReporter.logInfo("TU_TC_70"," When user enters special characters in work address field.");
        login.loginWalletBuyerTier();
        accountDetailsPageNavigation();
        selectSourceBusinessIncome(propertyReader.getproperty("BUSINESS_INCOME"));
        mobileGeneralMethod.type(tierUpgradeObjects.objCompanyOrEmployerName(), "Company Name", propertyReader.getproperty("Company_Name"));
        selectProductServiceOffered(propertyReader.getproperty("IT"));
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.type(tierUpgradeObjects.objWorkAddress(), "Work Address", propertyReader.getproperty("Invalid_Address"));
        selectPositionAtWork(propertyReader.getproperty("ENGR"));
        selectNatureOfWork(propertyReader.getproperty("ACCOUNTANT_FINANCE_STAFF"));
        mobileGeneralMethod.tap(tierUpgradeObjects.objConfirmDetails(),"Button");
        String val = propertyReader.getproperty("WorkAddress_Invalid_Err");
        if(mobileGeneralMethod.isVisible(tierUpgradeObjects.getObjIsRequired(val),"Message")){
            String actual = mobileGeneralMethod.getText(tierUpgradeObjects.getObjIsRequired(val));
            String expected = propertyReader.getproperty("WorkAddress_Invalid_Err");
            mobileGeneralMethod.assertionValidation(actual, expected);
            LoggingUtils.info("TU_TC_70, After user enters special characters in work address field. Error Message Should Pop Up");
            ExtentReporter.logPass("TU_TC_70", "After user enters special characters in work address field. Error Message Should Pop Up");
            System.out.println("-----------------------------------------------------------");
        }else {
            ExtentReporter.logFail("TU_TC_70", "Failed to validate After user enters special characters in work address field. Error Message Should Pop Up");
        }
    }
    public void TierUpgradePositionFieldValidation_TU_TC_71() throws Exception{
        ExtentReporter.logInfo("TU_TC_71"," When keeping the required Position at work field empty.");
        login.loginWalletBuyerTier();
        accountDetailsPageNavigation();
        selectSourceBusinessIncome(propertyReader.getproperty("BUSINESS_INCOME"));
        mobileGeneralMethod.type(tierUpgradeObjects.objCompanyOrEmployerName(), "Company Name", propertyReader.getproperty("Company_Name"));
        selectProductServiceOffered(propertyReader.getproperty("IT"));
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.type(tierUpgradeObjects.objWorkAddress(), "Work Address", propertyReader.getproperty("Address"));
        selectNatureOfWork(propertyReader.getproperty("ACCOUNTANT_FINANCE_STAFF"));
        mobileGeneralMethod.tap(tierUpgradeObjects.objConfirmDetails(),"Button");
        String val = propertyReader.getproperty("Position_Err");
        if(mobileGeneralMethod.isVisible(tierUpgradeObjects.getObjIsRequired(val), "Message")){
            String actual = mobileGeneralMethod.getText(tierUpgradeObjects.getObjIsRequired(val));
            String expected = propertyReader.getproperty("Position_Err");
            mobileGeneralMethod.assertionValidation(actual, expected);
            LoggingUtils.info("TU_TC_71, When keeping the required Position at work field empty. Error Message Should Pop Up");
            ExtentReporter.logPass("TU_TC_71", "When keeping the required Position at work field empty. Error Message Should Pop Up");
        }else {
            ExtentReporter.logFail("TU_TC_71", "Failed to validate When keeping the required Position at work field empty. Error Message Should Pop Up");
        }
    }
    public void TierUpgradeRemarksFieldValidation_TU_TC_72() throws Exception{
        ExtentReporter.logInfo("TU_TC_72"," When keeping the required Remarks field empty.");
        login.loginWalletBuyerTier();
        accountDetailsPageNavigation();
        selectSourceRegular(propertyReader.getproperty("REGULAR_REMITTANCE"));
        mobileGeneralMethod.waitSleep(2000);
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.tap(tierUpgradeObjects.objConfirmDetails(),"Button");
        String val = propertyReader.getproperty("Remarks_Err");
        if(mobileGeneralMethod.isVisible(tierUpgradeObjects.getObjIsRequired(val),"Message")){
            String actual = mobileGeneralMethod.getText(tierUpgradeObjects.getObjIsRequired(val));
            String expected = propertyReader.getproperty("Remarks_Err");
            mobileGeneralMethod.assertionValidation(actual, expected);
            LoggingUtils.info("TU_TC_72, When keeping the required Remarks field empty Error Message Should Pop Up");
            ExtentReporter.logPass("TU_TC_72", "When keeping the required Remarks field empty. Error Message Should Pop Up");
            System.out.println("-----------------------------------------------------------");
        }else {
            ExtentReporter.logFail("TU_TC_72", "Failed to validate When keeping the required Position Upon Retirement empty. Error Message Should Pop Up");
        }
    }
    public void tierUpgradeBackIDPageUIValidation_TU_TC_73() throws Exception {
        ExtentReporter.logInfo("TU_TC_73","Tier Upgrade Scan Back of ID page UI Validation");
        login.loginWalletBuyerTier();
        accountDetailsPageNavigation();
        mobileGeneralMethod.tap(tierUpgradeObjects.objConfirmDetails(),"Button");
        mobileGeneralMethod.isVisible(tierUpgradeObjects.objTierUpgrade(),"Page");
        mobileGeneralMethod.tap(tierUpgradeObjects.objSelectIDSelectionBtn(), "Select ID Selection Button");
        mobileGeneralMethod.type(tierUpgradeObjects.objSearchFieldInput(), "Select ID Input field", "PhilHealth");
        mobileGeneralMethod.tap(tierUpgradeObjects.objPhilHealth(),"ID");
        mobileGeneralMethod.tap(tierUpgradeObjects.objScanBackOfID(),"Button");
        if(mobileGeneralMethod.isVisible(tierUpgradeObjects.objScanBackOfID(),"Page")){
            mobileGeneralMethod.isVisible(tierUpgradeObjects.objScanFrontOfIDInfo(),"info");
            mobileGeneralMethod.isVisible(tierUpgradeObjects.objCaptureScreen(),"Capture Screen");
            mobileGeneralMethod.tap(tierUpgradeObjects.objCaptureButton(),"Capture Button");
            LoggingUtils.info("TU_TC_73, Tier Upgrade Scan Back of ID page UI validated");
            ExtentReporter.logPass("TU_TC_73", "Tier Upgrade Scan Back of ID page UI validated");
            System.out.println("-----------------------------------------------------------");
        }else {
            ExtentReporter.logFail("TU_TC_73", "Failed to validate Tier Upgrade Scan Back of ID page UI");
        }
    }
    public void tierUpgradeFrontIDPageUIValidation_TU_TC_74() throws Exception {
        ExtentReporter.logInfo("TU_TC_74","Tier Upgrade Scan Front of ID page UI Validation");
        login.loginWalletBuyerTier();
        accountDetailsPageNavigation();
        mobileGeneralMethod.tap(tierUpgradeObjects.objConfirmDetails(),"Button");
        mobileGeneralMethod.isVisible(tierUpgradeObjects.objTierUpgrade(),"Page");
        mobileGeneralMethod.tap(tierUpgradeObjects.objSelectIDSelectionBtn(), "Select ID Selection Button");
        mobileGeneralMethod.type(tierUpgradeObjects.objSearchFieldInput(), "Select ID Input field", "PhilHealth");
        mobileGeneralMethod.tap(tierUpgradeObjects.objPhilHealth(),"ID");
        mobileGeneralMethod.tap(tierUpgradeObjects.objScanFrontOfID(),"Button");
        mobileGeneralMethod.isVisible(tierUpgradeObjects.objScanFrontOfID(),"Page");
        mobileGeneralMethod.isVisible(tierUpgradeObjects.objScanFrontOfIDInfo(),"info");
        mobileGeneralMethod.isVisible(tierUpgradeObjects.objCaptureScreen(),"Capture Screen");
        mobileGeneralMethod.tap(tierUpgradeObjects.objCaptureButton(),"Capture Button");
        if(mobileGeneralMethod.isVisible(tierUpgradeObjects.objScanBackOfID(),"Page")){
            mobileGeneralMethod.tap(tierUpgradeObjects.objScanBackOfID(),"Button");
            mobileGeneralMethod.isVisible(tierUpgradeObjects.objScanBackOfIDInfo(),"info");
            mobileGeneralMethod.isVisible(tierUpgradeObjects.objCaptureScreen(),"Capture Screen");
            mobileGeneralMethod.tap(tierUpgradeObjects.objCaptureButton(),"Capture Button");
            LoggingUtils.info("TU_TC_74, Tier Upgrade Scan Front of ID page UI validated");
            ExtentReporter.logPass("TU_TC_74", "Tier Upgrade Scan Front of ID page UI validated");
            System.out.println("-----------------------------------------------------------");
        }else {
            ExtentReporter.logFail("TU_TC_74", "Failed to validate Tier Upgrade Scan Front of ID page UI");
        }
    }
    public void tierUpgradeFaceIDPageUIValidation_TU_TC_75() throws Exception {
        ExtentReporter.logInfo("TU_TC_75","Tier Upgrade Scan Face ID page UI Validation");
        login.loginWalletBuyerTier();
        accountDetailsPageNavigation();
        mobileGeneralMethod.tap(tierUpgradeObjects.objConfirmDetails(),"Button");
        mobileGeneralMethod.isVisible(tierUpgradeObjects.objTierUpgrade(),"Page");
        mobileGeneralMethod.tap(tierUpgradeObjects.objSelectIDSelectionBtn(), "Select ID Selection Button");
        mobileGeneralMethod.type(tierUpgradeObjects.objSearchFieldInput(), "Select ID Input field", "PhilHealth");
        mobileGeneralMethod.tap(tierUpgradeObjects.objPhilHealth(),"ID");
        mobileGeneralMethod.tap(tierUpgradeObjects.objScanFrontOfID(),"Button");
        mobileGeneralMethod.isVisible(tierUpgradeObjects.objScanFrontOfID(),"Page");
        mobileGeneralMethod.isVisible(tierUpgradeObjects.objScanFrontOfIDInfo(),"info");
        mobileGeneralMethod.isVisible(tierUpgradeObjects.objCaptureScreen(),"Capture Screen");
        mobileGeneralMethod.tap(tierUpgradeObjects.objCaptureButton(),"Capture Button");
        mobileGeneralMethod.isVisible(tierUpgradeObjects.objScanBackOfID(),"Page");
        mobileGeneralMethod.tap(tierUpgradeObjects.objScanBackOfID(),"Button");
        mobileGeneralMethod.isVisible(tierUpgradeObjects.objScanBackOfIDInfo(),"info");
        mobileGeneralMethod.isVisible(tierUpgradeObjects.objCaptureScreen(),"Capture Screen");
        mobileGeneralMethod.tap(tierUpgradeObjects.objCaptureButton(),"Capture Button");
        if(mobileGeneralMethod.isVisible(tierUpgradeObjects.objTakeAFaceIdentityPhoto(),"Page")){
            mobileGeneralMethod.tap(tierUpgradeObjects.objTakeAFaceIdentityPhoto(),"Button");
            mobileGeneralMethod.isVisible(tierUpgradeObjects.objCaptureScreen(),"Capture Screen");
            mobileGeneralMethod.tap(tierUpgradeObjects.objCaptureButton(),"Capture Button");
            LoggingUtils.info("TU_TC_75, Tier Upgrade Scan Face of ID page UI validated");
            ExtentReporter.logPass("TU_TC_75", "Tier Upgrade Scan Face ID page UI validated");
            System.out.println("-----------------------------------------------------------");
        }else {
            ExtentReporter.logFail("TU_TC_75", "Failed to validate Tier Upgrade Scan Face ID page UI");
        }
    }
    public void tierUpgradeEmptyCardIDPageUIValidation_TU_TC_76() throws Exception {
        ExtentReporter.logInfo("TU_TC_76","Tier Upgrade Empty Card ID page UI Validation");
        tierUpgradeFaceIDPageUIValidation_TU_TC_75();
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.isVisible(tierUpgradeObjects.objContinueBtn(),"Page");
        mobileGeneralMethod.tap(tierUpgradeObjects.objContinueBtn(),"Button");
        mobileGeneralMethod.isVisible(tierUpgradeObjects.objCardInputField(),"Card Filed");
        if(mobileGeneralMethod.isVisible(tierUpgradeObjects.objCardError(),"Card Error Message")){
            String actual = mobileGeneralMethod.getText(tierUpgradeObjects.objCardError());
            String expected = propertyReader.getproperty("CardNumber_Error");
            mobileGeneralMethod.assertionValidation(actual, expected);
            LoggingUtils.info("TU_TC_76, Tier Upgrade Empty Card of ID page UI validated");
            ExtentReporter.logPass("TU_TC_76", "Tier Upgrade Empty Card ID page UI validated");
            System.out.println("-----------------------------------------------------------");
        }else {
            ExtentReporter.logFail("TU_TC_76", "Failed to validate Tier Upgrade Empty Card ID page UI");
        }
    }
    public void tierUpgradeExpiryDateIDPageUIValidation_TU_TC_77() throws Exception {
        ExtentReporter.logInfo("TU_TC_77","Tier Upgrade Expiry Date ID page UI Validation");
        login.loginWalletBuyerTier();
        accountDetailsPageNavigation();
        mobileGeneralMethod.tap(tierUpgradeObjects.objConfirmDetails(),"Button");
        mobileGeneralMethod.isVisible(tierUpgradeObjects.objTierUpgrade(),"Page");
        mobileGeneralMethod.tap(tierUpgradeObjects.objSelectIDSelectionBtn(), "Select ID Selection Button");
        mobileGeneralMethod.type(tierUpgradeObjects.objSearchFieldInput(), "Select ID Input field", "GSIS");
        mobileGeneralMethod.tap(tierUpgradeObjects.objGSIS(),"ID");
        mobileGeneralMethod.tap(tierUpgradeObjects.objScanFrontOfID(),"Button");
        mobileGeneralMethod.isVisible(tierUpgradeObjects.objScanFrontOfID(),"Page");
        mobileGeneralMethod.isVisible(tierUpgradeObjects.objScanFrontOfIDInfo(),"info");
        mobileGeneralMethod.isVisible(tierUpgradeObjects.objCaptureScreen(),"Capture Screen");
        mobileGeneralMethod.tap(tierUpgradeObjects.objCaptureButton(),"Capture Button");
        mobileGeneralMethod.isVisible(tierUpgradeObjects.objScanBackOfID(),"Page");
        mobileGeneralMethod.tap(tierUpgradeObjects.objScanBackOfID(),"Button");
        mobileGeneralMethod.isVisible(tierUpgradeObjects.objScanBackOfIDInfo(),"info");
        mobileGeneralMethod.isVisible(tierUpgradeObjects.objCaptureScreen(),"Capture Screen");
        mobileGeneralMethod.tap(tierUpgradeObjects.objCaptureButton(),"Capture Button");
        mobileGeneralMethod.isVisible(tierUpgradeObjects.objTakeAFaceIdentityPhoto(),"Page");
        mobileGeneralMethod.tap(tierUpgradeObjects.objTakeAFaceIdentityPhoto(),"Button");
        mobileGeneralMethod.isVisible(tierUpgradeObjects.objCaptureScreen(),"Capture Screen");
        mobileGeneralMethod.tap(tierUpgradeObjects.objCaptureButton(),"Capture Button");
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.isVisible(tierUpgradeObjects.objContinueBtn(),"Page");
        mobileGeneralMethod.tap(tierUpgradeObjects.objContinueBtn(),"Button");
        mobileGeneralMethod.isVisible(tierUpgradeObjects.objCardInputField(),"Card Field");
        mobileGeneralMethod.isVisible(tierUpgradeObjects.objExpiryDateField(),"Expiry Date Field");
        if(mobileGeneralMethod.isVisible(tierUpgradeObjects.objCardError(),"Card Error Message") && mobileGeneralMethod.isVisible(tierUpgradeObjects.objExpiryDateError(),"Expiry Date Error Message")){
            String actual = mobileGeneralMethod.getText(tierUpgradeObjects.objCardError());
            String expected = propertyReader.getproperty("CardNumber_Error");
            String actual2nd = mobileGeneralMethod.getText(tierUpgradeObjects.objExpiryDateError());
            String expected2nd = propertyReader.getproperty("ExpiryDateNumber_Error");
            mobileGeneralMethod.assertionValidation(actual, expected);
            mobileGeneralMethod.assertionValidation(actual2nd, expected2nd);
            LoggingUtils.info("TU_TC_77, Tier Upgrade Expiry Date ID page UI validated");
            ExtentReporter.logPass("TU_TC_77", "Tier Upgrade Expiry Date ID page UI validated");
            System.out.println("-----------------------------------------------------------");
        }else {
            ExtentReporter.logFail("TU_TC_77", "Failed to validate Tier Upgrade Expiry Date ID page UI");
        }
    }
    public void tierUpgradeOneTakeIDPageUIValidation_TU_TC_78() throws Exception {
        ExtentReporter.logInfo("TU_TC_78","Tier Upgrade One Take ID page UI Validation");
        login.loginWalletBuyerTier();
        accountDetailsPageNavigation();
        mobileGeneralMethod.tap(tierUpgradeObjects.objConfirmDetails(),"Button");
        mobileGeneralMethod.isVisible(tierUpgradeObjects.objTierUpgrade(),"Page");
        mobileGeneralMethod.tap(tierUpgradeObjects.objSelectIDSelectionBtn(), "Select ID Selection Button");
        mobileGeneralMethod.type(tierUpgradeObjects.objSearchFieldInput(), "Select ID Input field", "DRIVER");
        mobileGeneralMethod.tap(tierUpgradeObjects.objDriverLicense(),"ID");
        if(mobileGeneralMethod.isVisible(tierUpgradeObjects.objLetsTakePicture(),"Button")){
            LoggingUtils.info("TU_TC_78, Tier Upgrade One Take ID page UI validated");
            ExtentReporter.logPass("TU_TC_78", "Tier Upgrade One Take ID page UI validated");
            System.out.println("-----------------------------------------------------------");
        }else {
            ExtentReporter.logFail("TU_TC_78", "Failed to validate Tier Upgrade One Take ID page UI");
        }
    }
    public void tierUpgradeRequestTierUpgradeIDPageUIValidation_TU_TC_79() throws Exception {
        ExtentReporter.logInfo("TU_TC_79","Tier Upgrade Request Tier Upgrade ID page UI Validation");
        tierUpgradeFaceIDPageUIValidation_TU_TC_75();
        mobileGeneralMethod.type(tierUpgradeObjects.objCardInputField(),"Card Field", "Test");
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.isVisible(tierUpgradeObjects.objContinueBtn(),"Page");
        mobileGeneralMethod.tap(tierUpgradeObjects.objContinueBtn(),"Button");
        if(mobileGeneralMethod.isVisible(tierUpgradeObjects.objTierMessage(),"Tier Message")){
            mobileGeneralMethod.isVisible(tierUpgradeObjects.objConfirmTierBtn(),"Confirm Button");
            mobileGeneralMethod.tap(tierUpgradeObjects.objConfirmTierBtn(),"Confirm Button");
            LoggingUtils.info("TU_TC_79, Request Tier Upgrade ID page UI validated");
            ExtentReporter.logPass("TU_TC_79", "Request Tier Upgrade ID page UI validated");
            System.out.println("-----------------------------------------------------------");
        }else {
            ExtentReporter.logFail("TU_TC_79", "Failed to validate Request Tier Upgrade ID page UI");
        }
    }
    public void tierUpgradePendingRequestIDPageUIValidation_TU_TC_80() throws Exception {
        ExtentReporter.logInfo("TU_TC_80","Tier Upgrade Pending Request ID page UI Validation");
        tierUpgradeFaceIDPageUIValidation_TU_TC_75();
        mobileGeneralMethod.type(tierUpgradeObjects.objCardInputField(),"Card Field", "Test");
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.isVisible(tierUpgradeObjects.objContinueBtn(),"Page");
        mobileGeneralMethod.tap(tierUpgradeObjects.objContinueBtn(),"Button");
        mobileGeneralMethod.isVisible(tierUpgradeObjects.objTierMessage(),"Tier Message");
        mobileGeneralMethod.isVisible(tierUpgradeObjects.objConfirmTierBtn(),"Confirm Button");
        mobileGeneralMethod.tap(tierUpgradeObjects.objConfirmTierBtn(),"Confirm Button");
        mobileGeneralMethod.tap(homePageObject.objIIcon(), "i Icon");
        mobileGeneralMethod.waitSleep(1000);
        if(mobileGeneralMethod.isVisible(tierUpgradeObjects.objPendingVerificationMessage(),"Pending Request Tier Upgrade")){
            LoggingUtils.info("TU_TC_80, Tier Upgrade Pending Request ID page UI validated");
            ExtentReporter.logPass("TU_TC_80", "Tier Upgrade Pending Request ID page UI validated");
            System.out.println("-----------------------------------------------------------");
        }else {
            ExtentReporter.logFail("TU_TC_80", "Failed to validate Tier Upgrade Pending Request ID page UI");
        }
    }
}
