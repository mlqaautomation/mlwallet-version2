package kpx.actual.WalletService;

import kpx.base.BaseTest;
import org.testng.annotations.Test;
import utilities.ExtentReport.ExtentReporter;

import static org.testng.Assert.assertTrue;
import static utilities.Driver.AppiumDriverManager.APP_ID;
import static utilities.Driver.AppiumDriverManager.getAndroidDriver;

public class KwartaPadalaBranchScripts extends BaseTest {

    @Test(description = "Test to verify app is installed")
    public void isAppInstalledTest(){
        assertTrue(getAndroidDriver().isAppInstalled(APP_ID));
        ExtentReporter.logPass("isAppInstalledTest", "MLWALLET is installed");
    }

    @Test(priority = 1, description = "send_Money_To_ML_Branch_STB_TC_01")
    public void sendMoneyToMLBranch_STB_TC_01() throws Exception {
        kwartaPadalaBranch.sendMoneyToMLBranch_STB_TC_01();
    }
    @Test(priority = 1, description = "send_Money_Add_Recipient_STB_TC_03")
    public void sendMoneyAddRecipient_STB_TC_03() throws Exception {
        kwartaPadalaBranch.sendMoneyAddRecipient_STB_TC_03();
    }
    @Test(priority = 2, description = "send_Money_Contact_Duplicate_STB_TC_04")
    public void sendMoneyContactDuplicate_STB_TC_04() throws Exception {
        kwartaPadalaBranch.sendMoneyContactDuplicate_STB_TC_04();
    }
    @Test(priority = 3, description = "kwarta_Padala_Via_Branch_Successful_Transaction_STB_TC_02")
    public void kwartaPadalaViaBranchSuccessfulTransaction_STB_TC_02() throws Exception {
        kwartaPadalaBranch.kwartaPadalaViaBranchSuccessfulTransaction_STB_TC_02();
    }
    @Test(priority = 4, description = "send_Money_Edit_Recipient_STB_TC_06")
    public void sendMoneyEditRecipient_STB_TC_06() throws Exception {
        kwartaPadalaBranch.sendMoneyEditRecipient_STB_TC_06();
    }  @Test(priority = 5, description = "send_Money_Invalid_Amount_STB_TC_09")
    public void sendMoneyInvalidAmount_STB_TC_09() throws Exception {
        kwartaPadalaBranch.sendMoneyInvalidAmount_STB_TC_09("0");
    }
    @Test(priority = 6, description = "send_Money_Insufficient_Amount_STB_TC_10")
    public void sendMoneyInsufficientAmount_STB_TC_10() throws Exception {
        kwartaPadalaBranch.sendMoneyInsufficientAmount_STB_TC_10();
    }  @Test(priority = 7, description = "send_Money_Maximum_Amount_STB_TC_12")
    public void sendMoneyMaximumAmount_STB_TC_12() throws Exception {
        kwartaPadalaBranch.sendMoneyMaximumAmount_STB_TC_12();
    }
    @Test(priority = 8, description = "send_Money_Delete_Recipient_STB_TC_05")
    public void sendMoneyDeleteRecipient_STB_TC_05() throws Exception {
        kwartaPadalaBranch.sendMoneyDeleteRecipient_STB_TC_05();
    }
    @Test(priority = 9, description = "send_Transfer_UI_Validation_STB_TC_13")
    public void sendTransferUIValidation_STB_TC_13() throws Exception {
        kwartaPadalaBranch.sendTransferUIValidation_STB_TC_13();
    }
    @Test(priority = 10, description = "send_Money_To_Branch_UI_Validation_STB_TC_14")
    public void sendMoneyToBranchUIValidation_STB_TC_14() throws Exception {
        kwartaPadalaBranch.sendMoneyToBranchUIValidation_STB_TC_14();
    }
//    @Test(priority = 11, description = "sendMoney_To_Branch_Save_Recipient_Page_UI_Validation_STB_TC_15")
//    public void sendMoneyToBranchSaveRecipientPageUIValidation_STB_TC_15() throws Exception {
//        kwartaPadalaBranch.sendMoneyToBranchSaveRecipientPageUIValidation_STB_TC_15();
//    }
    @Test(priority = 12, description = "send_Money_To_Branch_Success_UI_Validation_STB_TC_16")
    public void sendMoneyToBranchSuccessUIValidation_STB_TC_16() throws Exception {
        kwartaPadalaBranch.sendMoneyToBranchSuccessUIValidation_STB_TC_16();
    }  @Test(priority = 13, description = "send_Money_To_Branch_Confirm_Details_Page_UI_Validation_STB_TC_17")
    public void sendMoneyToBranchConfirmDetailsPageUIValidation_STB_TC_17() throws Exception {
        kwartaPadalaBranch.sendMoneyToBranchConfirmDetailsPageUIValidation_STB_TC_17("100");
    }  @Test(priority = 14, description = "send_Money_To_Branch_Select_Payment_Method_Page_UI_Validation_STB_TC_18")
    public void sendMoneyToBranchSelectPaymentMethodPageUIValidation_STB_TC_18() throws Exception {
        kwartaPadalaBranch.sendMoneyToBranchSelectPaymentMethodPageUIValidation_STB_TC_18("100");
    }  @Test(priority = 15, description = "send_Money_To_Branch_Enter_Amount_Page_UI_Validation_STB_TC_19")
    public void sendMoneyToBranchEnterAmountPageUIValidation_STB_TC_19() throws Exception {
        kwartaPadalaBranch.sendMoneyToBranchEnterAmountPageUIValidation_STB_TC_19();
    }  @Test(priority = 16, description = "kwarta_Padala_Transaction_Details_UI_Validation_STB_TC_20")
    public void kwartaPadalaTransactionDetailsUIValidation_STB_TC_20() throws Exception {
        kwartaPadalaBranch.kwartaPadalaTransactionDetailsUIValidation_STB_TC_20();
    } @Test(priority = 17, description = "send_Money_To_Branch_Add_Recipient_Page_UI_Validation_STB_TC_21")
    public void sendMoneyToBranchAddRecipientPageUIValidation_STB_TC_21() throws Exception {
        kwartaPadalaBranch.sendMoneyToBranchAddRecipientPageUIValidation_STB_TC_21();
    }
//    @Test(priority = 18, description = "send_Money_To_ML_Branch_Buyer_Tier_Account_STB_TC_22")
//    public void sendMoneyToMLBranchBuyerTierAccount_STB_TC_22() throws Exception {
//        kwartaPadalaBranch().sendMoneyToMLBranchBuyerTierAccount_STB_TC_22();
//    }
//    @Test(priority = 19, description = "send_Money_To_ML_Branch_Semi_Verified_Tier_Account_STB_TC_23")
//    public void sendMoneyToMLBranchSemiVerifiedTierAccount_STB_TC_23() throws Exception {
//        kwartaPadalaBranch.sendMoneyToMLBranchSemiVerifiedTierAccount_STB_TC_23();
//    }
    @Test(priority = 20, description = "send_Money_To_ML_Branch_Branch_Verified_Account_STB_TC_24")
    public void sendMoneyToMLBranchBranchVerifiedAccount_STB_TC_24() throws Exception {
        kwartaPadalaBranch.sendMoneyToMLBranchBranchVerifiedAccount_STB_TC_24();
    }  @Test(priority = 21, description = "send_Money_To_ML_BranchFully_Verified_Account_STB_TC_25")
    public void sendMoneyToMLBranchFullyVerifiedAccount_STB_TC_25() throws Exception {
        kwartaPadalaBranch.sendMoneyToMLBranchFullyVerifiedAccount_STB_TC_25();
    }
//    @Test(priority = 22, description = "send_Money_To_ML_Branch_Semi_Verified_Tier_Account_Max_Amount_STB_TC_26")
//    public void sendMoneyToMLBranchSemiVerifiedTierAccountMaxAmount_STB_TC_26() throws Exception {
//        kwartaPadalaBranch.sendMoneyToMLBranchSemiVerifiedTierAccountMaxAmount_STB_TC_26();
//    }
    @Test(priority = 23, description = "send_Money_To_ML_Branch_Branch_Verified_Tier_Account_Max_Amount_STB_TC_29")
    public void sendMoneyToMLBranchBranchVerifiedTierAccountMaxAmount_STB_TC_29() throws Exception {
        kwartaPadalaBranch.sendMoneyToMLBranchBranchVerifiedTierAccountMaxAmount_STB_TC_29();
    }
//    @Test(priority = 24, description = "kwarta_Padala_Rates_STB_TC_35")
//    public void kwartaPadalaRates_STB_TC_35() throws Exception {
//        kwartaPadalaBranch.kwartaPadalaRates_STB_TC_35();
//    }
    @Test(priority = 25, description = "send_Money_To_ML_Branch_Rates_Validation_ScenarioOne_STB_TC_36")
    public void sendMoneyToMLBranchRatesValidationScenarioOne_STB_TC_36() throws Exception {
        kwartaPadalaBranch.sendMoneyToMLBranchRatesValidationScenarioOne_STB_TC_36("10");
    }  @Test(priority = 26, description = "send_Money_To_ML_Branch_Rates_Validation_ScenarioTwo_STB_TC_37")
    public void sendMoneyToMLBranchRatesValidationScenarioTwo_STB_TC_37() throws Exception {
        kwartaPadalaBranch.sendMoneyToMLBranchRatesValidationScenarioTwo_STB_TC_37("70");
    }  @Test(priority = 27, description = "send_Money_To_ML_Branch_Rates_Validation_ScenarioThree_STB_TC_38")
    public void sendMoneyToMLBranchRatesValidationScenarioThree_STB_TC_38() throws Exception {
        kwartaPadalaBranch.sendMoneyToMLBranchRatesValidationScenarioThree_STB_TC_38("200");
    }  @Test(priority = 28, description = "send_Money_To_ML_Branch_Rates_Validation_ScenarioFour_STB_TC_39")
    public void sendMoneyToMLBranchRatesValidationScenarioFour_STB_TC_39() throws Exception {
        kwartaPadalaBranch.sendMoneyToMLBranchRatesValidationScenarioFour_STB_TC_39("350");
    }  @Test(priority = 29, description = "send_Money_To_ML_Branch_Rates_Validation_ScenarioFive_STB_TC_40")
    public void sendMoneyToMLBranchRatesValidationScenarioFive_STB_TC_40() throws Exception {
        kwartaPadalaBranch.sendMoneyToMLBranchRatesValidationScenarioFive_STB_TC_40("450");
    }  @Test(priority = 30, description = "send_Money_To_ML_Branch_Rates_Validation_ScenarioSix_STB_TC_41")
    public void sendMoneyToMLBranchRatesValidationScenarioSix_STB_TC_41() throws Exception {
        kwartaPadalaBranch.sendMoneyToMLBranchRatesValidationScenarioSix_STB_TC_41("550");
    }  @Test(priority = 31, description = "send_Money_To_ML_Branch_Rates_Validation_ScenarioSeven_STB_TC_42")
    public void sendMoneyToMLBranchRatesValidationScenarioSeven_STB_TC_42() throws Exception {
        kwartaPadalaBranch.sendMoneyToMLBranchRatesValidationScenarioSeven_STB_TC_42("650");
    }  @Test(priority = 32, description = "send_Money_To_ML_Branch_Rates_Validation_ScenarioEight_STB_TC_43")
    public void sendMoneyToMLBranchRatesValidationScenarioEight_STB_TC_43() throws Exception {
        kwartaPadalaBranch.sendMoneyToMLBranchRatesValidationScenarioEight_STB_TC_43("800");
    }
    @Test(priority = 34, description = "send_Money_To_ML_Branch_Rates_Validation_ScenarioNine_STB_TC_44")
    public void sendMoneyToMLBranchRatesValidationScenarioNine_STB_TC_44() throws Exception {
        kwartaPadalaBranch.sendMoneyToMLBranchRatesValidationScenarioNine_STB_TC_44("950");
    }  @Test(priority = 35, description = "send_Money_To_ML_Branch_Rates_Validation_ScenarioTen_STB_TC_45")
    public void sendMoneyToMLBranchRatesValidationScenarioTen_STB_TC_45() throws Exception {
        kwartaPadalaBranch.sendMoneyToMLBranchRatesValidationScenarioTen_STB_TC_45("1300");
    }
    @Test(priority = 36, description = "send_Money_To_ML_Branch_Rates_Validation_ScenarioEleven_STB_TC_46")
    public void sendMoneyToMLBranchRatesValidationScenarioEleven_STB_TC_46() throws Exception {
        kwartaPadalaBranch.sendMoneyToMLBranchRatesValidationScenarioEleven_STB_TC_46("1800");
    }  @Test(priority = 37, description = "send_Money_To_ML_Branch_Rates_Validation_ScenarioTwelve_STB_TC_47")
    public void sendMoneyToMLBranchRatesValidationScenarioTwelve_STB_TC_47() throws Exception {
        kwartaPadalaBranch.sendMoneyToMLBranchRatesValidationScenarioTwelve_STB_TC_47("2300");
    }

    @Test(priority = 38, description = "send_Money_To_ML_Branch_Rates_Validation_ScenarioThirteen_STB_TC_48")
    public void sendMoneyToMLBranchRatesValidationScenarioThirteen_STB_TC_48() throws Exception {
        kwartaPadalaBranch.sendMoneyToMLBranchRatesValidationScenarioThirteen_STB_TC_48("25000");
    }
    @Test(priority = 39, description = "send_Money_To_ML_Branch_Location_Popup_Validation_STB_TC_50")
    public void sendMoneyToMLBranchLocationPopupValidation_STB_TC_50() throws Exception {
        kwartaPadalaBranch.sendMoneyToMLBranchLocationPopupValidation_STB_TC_50();
    }
    @Test(priority = 40, description = "send_Money_To_ML_Branch_Location_Deny_Functionality_STB_TC_51")
    public void sendMoneyToMLBranchLocationDenyFunctionality_STB_TC_51() throws Exception {
        kwartaPadalaBranch.sendMoneyToMLBranchLocationDenyFunctionality_STB_TC_51();
    }
    @Test(priority = 41, description = "send_Money_To_ML_Branch_Location_Permission_Deny_Close_Btn_Functionality_STB_TC_52")
    public void sendMoneyToMLBranchLocationPermissionDenyCloseBtnFunctionality_STB_TC_52() throws Exception {
        kwartaPadalaBranch.sendMoneyToMLBranchLocationPermissionDenyCloseBtnFunctionality_STB_TC_52();
    }
    @Test(priority = 42, description = "send_Money_To_ML_Branch_Location_Permission_Deny_Open_Settings_Btn_Functionality_STB_TC_53")
    public void sendMoneyToMLBranchLocationPermissionDenyOpenSettingsBtnFunctionality_STB_TC_53() throws Exception {
        kwartaPadalaBranch.sendMoneyToMLBranchLocationPermissionDenyOpenSettingsBtnFunctionality_STB_TC_53();
    }
    @Test(priority = 43, description = "send_Money_To_ML_Branch_Location_PopUp_Allow_Functionality_STB_TC_54")
    public void sendMoneyToMLBranchLocationPopUpAllowFunctionality_STB_TC_54() throws Exception {
        kwartaPadalaBranch.sendMoneyToMLBranchLocationPopUpAllowFunctionality_STB_TC_54();
    }
    @Test(priority = 44, description = "send_Money_To_ML_Branch_Internet_Interruption_While_Entering_OTP_STB_TC_55")
    public void sendMoneyToMLBranchInternetInterruptionWhileEnteringOTP_STB_TC_55() throws Exception {
        kwartaPadalaBranch.sendMoneyToMLBranchInternetInterruptionWhileEnteringOTP_STB_TC_55();
    }
    @Test(priority = 45, description = "send_Money_To_ML_Branch_Transaction_With_Valid_ML_Pin_STB_TC_64")
    public void sendMoneyToMLBranchTransactionWithValidMLPin_STB_TC_64() throws Exception {
        kwartaPadalaBranch.sendMoneyToMLBranchTransactionWithValidMLPin_STB_TC_64();
    }
    @Test(priority = 46, description = "send_Money_To_ML_Branch_Transaction_With_In_Valid_ML_Pin_STB_TC_65")
    public void sendMoneyToMLBranchTransactionWithInValidMLPin_STB_TC_65() throws Exception {
        kwartaPadalaBranch.sendMoneyToMLBranchTransactionWithInValidMLPin_STB_TC_65();
    }
    @Test(priority = 47, description = "send_Money_To_ML_Branch_In_OTP_Popup_Validation_STB_TC_71")
    public void sendMoneyToMLBranchInOTPPopupValidation_STB_TC_71() throws Exception {
        kwartaPadalaBranch.sendMoneyToMLBranchInOTPPopupValidation_STB_TC_71();
    }
    @Test(priority = 48, description = "send_Money_To_ML_Branch_Transaction_In_App_OTP_Popup_UI_Validation_STB_TC_72")
    public void sendMoneyToMLBranchTransactionInAppOTPPopupUIValidation_STB_TC_72() throws Exception {
        kwartaPadalaBranch.sendMoneyToMLBranchTransactionInAppOTPPopupUIValidation_STB_TC_72();
    }
    @Test(priority = 49, description = "send_Money_To_ML_Branch_Transaction_New_OTP_After_Sixty_Seconds_Validation_STB_TC_73")
    public void sendMoneyToMLBranchTransactionNewOTPAfterSixtySecondsValidation_STB_TC_73() throws Exception {
        kwartaPadalaBranch.sendMoneyToMLBranchTransactionNewOTPAfterSixtySecondsValidation_STB_TC_73();
    }
    @Test(priority = 50, description = "send_Money_To_ML_Branch_Transaction_OTP_Cancel_Btn_Functionality_STB_TC_74")
    public void sendMoneyToMLBranchTransactionOTPCancelBtnFunctionality_STB_TC_74() throws Exception {
        kwartaPadalaBranch.sendMoneyToMLBranchTransactionOTPCancelBtnFunctionality_STB_TC_74();
    }
    @Test(priority = 51, description = "send_Money_To_ML_Branch_Transaction_OTP_Continue_Btn_Functionality_STB_TC_75")
    public void sendMoneyToMLBranchTransactionOTPContinueBtnFunctionality_STB_TC_75() throws Exception {
        kwartaPadalaBranch.sendMoneyToMLBranchTransactionOTPContinueBtnFunctionality_STB_TC_75();
    }
    @Test(priority = 52, description = "send_Money_Required_Details_STB_TC_08")
    public void sendMoneyRequiredDetails_STB_TC_08() throws Exception {
        kwartaPadalaBranch.sendMoneyRequiredDetails_STB_TC_08();
    }
    @Test(priority = 53, description = "send_Money_Invalid_Details_STB_TC_07")
    public void sendMoneyInvalidDetails_STB_TC_07() throws Exception {
        kwartaPadalaBranch.sendMoneyInvalidDetails_STB_TC_07();
    }
    @Test(priority = 54, description = "send_Money_To_ML_Branch_Transaction_Validation_After_MinimizingApp_STB_TC_58")
    public void sendMoneyToMLBranchTransactionValidationAfterMinimizingApp_STB_TC_58() throws Exception {
        kwartaPadalaBranch.sendMoneyToMLBranchTransactionValidationAfterMinimizingApp_STB_TC_58();
    }
        @Test(priority = 55, description = "send_Money_To_ML_Branch_Fully_Verified_Tier_Account_Max_Amount_STB_TC_32")
    public void sendMoneyToMLBranchFullyVerifiedTierAccountMaxAmount_STB_TC_32() throws Exception {
        kwartaPadalaBranch.sendMoneyToMLBranchFullyVerifiedTierAccountMaxAmount_STB_TC_32();
    }
































}
