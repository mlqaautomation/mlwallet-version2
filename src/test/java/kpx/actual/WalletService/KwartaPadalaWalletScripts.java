package kpx.actual.WalletService;

import kpx.base.BaseTest;
import org.testng.annotations.Test;
import utilities.ExtentReport.ExtentReporter;

import static org.testng.Assert.assertTrue;
import static utilities.Driver.AppiumDriverManager.APP_ID;
import static utilities.Driver.AppiumDriverManager.getAndroidDriver;

public class KwartaPadalaWalletScripts extends BaseTest {
    @Test(description = "Test to verify app is installed")
    public void isAppInstalledTest(){
        assertTrue(getAndroidDriver().isAppInstalled(APP_ID));
        ExtentReporter.logPass("isAppInstalledTest", "MLWALLET is installed");
    }

    @Test(priority = 1, description = "kwarta_Padala_Via_MLWallet_Successful_Transaction_STW_TC_02")
    public void kwartaPadalaViaMLWalletSuccessfulTransaction_STW_TC_02() throws Exception {
        kwartaPadalaWallet.kwartaPadalaViaMLWalletSuccessfulTransaction_STW_TC_02();
    }
    @Test(priority = 2, description = "send_Money_Add_To_Favorites_STW_TC_12")
    public void sendMoneyAddToFavorites_STW_TC_12() throws Exception {
        kwartaPadalaWallet.sendMoneyAddToFavorites_STW_TC_12();
    }
//    @Test(priority = 3, description = "send_To_ML_Wallet_Invalid_MobNumber_STW_TC_03")
//    public void sendToMLWalletInvalidMobNumber_STW_TC_03() throws Exception {
//        kwartaPadalaWallet.sendToMLWalletInvalidMobNumber_STW_TC_03();
//    }
//    @Test(priority = 4, description = "send_To_MLWallet_UnRegistered_Number_STW_TC_04")
//    public void sendToMLWalletUnRegisteredNumber_STW_TC_04() throws Exception {
//        kwartaPadalaWallet.sendToMLWalletUnRegisteredNumber_STW_TC_04();
//    }
    @Test(priority = 5, description = "send_To_MLWallet_Invalid_Amount_STW_TC_05")
    public void sendToMLWalletInvalidAmount_STW_TC_05() throws Exception {
        kwartaPadalaWallet.sendToMLWalletInvalidAmount_STW_TC_05("0");
    }
//    @Test(priority = 6, description = "send_To_MLWallet_Insufficient_Amount_STW_TC_06")
//    public void sendToMLWalletInsufficientAmount_STW_TC_06() throws Exception {
//        kwartaPadalaWallet.sendToMLWalletInsufficientAmount_STW_TC_06();
//    }
    @Test(priority = 7, description = "send_Money_MLWallet_Maximum_Amount_STW_TC_07")
    public void sendMoneyMLWalletMaximumAmount_STW_TC_07() throws Exception {
        kwartaPadalaWallet.sendMoneyMLWalletMaximumAmount_STW_TC_07();
    }
    @Test(priority = 8, description = "send_Money_Delete_From_Favorites_STW_TC_09")
    public void sendMoneyDeleteFromFavorites_STW_TC_09() throws Exception {
        kwartaPadalaWallet.sendMoneyDeleteFromFavorites_STW_TC_09();
    }
    @Test(priority = 9, description = "send_Money_MLWallet_UI_Validation_STW_TC_10")
    public void sendMoneyMLWalletUIValidation_STW_TC_10() throws Exception {
        kwartaPadalaWallet.sendMoneyMLWalletUIValidation_STW_TC_10();
    }
    @Test(priority = 10, description = "send_Money_Favorites_UI_Validation_STW_TC_11")
    public void sendMoneyFavoritesUIValidation_STW_TC_11() throws Exception {
        kwartaPadalaWallet.sendMoneyFavoritesUIValidation_STW_TC_11();
    }
    @Test(priority = 11, description = "send_Money_MLWallet_Cancel_Transaction_STW_TC_13")
    public void sendMoneyMLWalletCancelTransaction_STW_TC_13() throws Exception {
        kwartaPadalaWallet.sendMoneyMLWalletCancelTransaction_STW_TC_13("100");
    }
    @Test(priority = 12, description = "send_Money_MLWallet_Search_UnFavoriteUser_STW_TC_14")
    public void sendMoneyMLWalletSearchUnFavoriteUser_STW_TC_14() throws Exception {
        kwartaPadalaWallet.sendMoneyMLWalletSearchUnFavoriteUser_STW_TC_14();
    }
    @Test(priority = 13, description = "send_Money_MLWallet_Search_Favorite_User_STW_TC_15")
    public void sendMoneyMLWalletSearchFavoriteUser_STW_TC_15() throws Exception {
        kwartaPadalaWallet.sendMoneyMLWalletSearchFavoriteUser_STW_TC_15();
    }
    @Test(priority = 14, description = "send_Money_MLWallet_Success_Page_UI_Validation_STW_TC_16")
    public void sendMoneyMLWalletSuccessPageUIValidation_STW_TC_16() throws Exception {
        kwartaPadalaWallet.sendMoneyMLWalletSuccessPageUIValidation_STW_TC_16();
    }
    @Test(priority = 15, description = "send_Money_MLWallet_OTP_Page_UI_Validation_STW_TC_17")
    public void sendMoneyMLWalletOTPPageUIValidation_STW_TC_17() throws Exception {
        kwartaPadalaWallet.sendMoneyMLWalletOTPPageUIValidation_STW_TC_17();
    }
    @Test(priority = 16, description = "send_Money_MLWallet_Confirm_Details_Page_UI_Validation_STW_TC_18")
    public void sendMoneyMLWalletConfirmDetailsPageUIValidation_STW_TC_18() throws Exception {
        kwartaPadalaWallet.sendMoneyMLWalletConfirmDetailsPageUIValidation_STW_TC_18("100");
    }
    @Test(priority = 17, description = "send_Money_To_MlWallet_Enter_Amount_Page_UI_Validation_STW_TC_19")
    public void sendMoneyToMlWalletEnterAmountPageUIValidation_STW_TC_19() throws Exception {
        kwartaPadalaWallet.sendMoneyToMlWalletEnterAmountPageUIValidation_STW_TC_19();
    }
    @Test(priority = 18, description = "send_Money_To_MLWallet_Page_UI_Validation_STW_TC_20")
    public void sendMoneyToMLWalletPageUIValidation_STW_TC_20() throws Exception {
        kwartaPadalaWallet.sendMoneyToMLWalletPageUIValidation_STW_TC_20();
    }@Test(priority = 19, description = "send_Money_MlWallet_Transaction_Details_UI_Validation_STW_TC_21")
    public void sendMoneyMlWalletTransactionDetailsUIValidation_STW_TC_21() throws Exception {
        kwartaPadalaWallet.sendMoneyMlWalletTransactionDetailsUIValidation_STW_TC_21();
    }
//    @Test(priority = 20, description = "send_Money_MLWallet_Buyer_Tier_Account_User_STW_TC_22")
//    public void sendMoneyMLWalletBuyerTierAccountUser_STW_TC_22() throws Exception {
//        kwartaPadalaWallet.sendMoneyMLWalletBuyerTierAccountUser_STW_TC_22();
//    }
//    @Test(priority = 21, description = "send_Money_MLWallet_Semi_Verified_AccountUser_STW_TC_23")
//    public void sendMoneyMLWalletSemiVerifiedAccountUser_STW_TC_23() throws Exception {
//        kwartaPadalaWallet.sendMoneyMLWalletSemiVerifiedAccountUser_STW_TC_23();
//    }
    @Test(priority = 22, description = "send_Money_MLWallet_Branch_Verified_Account_User_STW_TC_24")
    public void sendMoneyMLWalletBranchVerifiedAccountUser_STW_TC_24() throws Exception {
        kwartaPadalaWallet.sendMoneyMLWalletBranchVerifiedAccountUser_STW_TC_24();
    }
    @Test(priority = 23, description = "send_Money_MLWallet_Fully_Verified_AccountUser_STW_TC_25")
    public void sendMoneyMLWalletFullyVerifiedAccountUser_STW_TC_25() throws Exception {
        kwartaPadalaWallet.sendMoneyMLWalletFullyVerifiedAccountUser_STW_TC_25();
    }
//    @Test(priority = 24, description = "send_Money_MLWallet_Semi-Verified_Account_Max_Limit_STW_TC_26")
//    public void sendMoneyMLWalletSemiVerifiedAccountMaxLimit_STW_TC_26() throws Exception {
//        kwartaPadalaWallet.sendMoneyMLWalletSemiVerifiedAccountMaxLimit_STW_TC_26();
//    }
    @Test(priority = 25, description = "send_Money_MLWallet_Branch_Verified_Account_Max_Limit_STW_TC_29")
    public void sendMoneyMLWalletBranchVerifiedAccountMaxLimit_STW_TC_29() throws Exception {
        kwartaPadalaWallet.sendMoneyMLWalletBranchVerifiedAccountMaxLimit_STW_TC_29();
    }
    @Test(priority = 26, description = "send_Money_MLWallet_Fully_Verified_Account_Max_Limit_STW_TC_32")
    public void sendMoneyMLWalletFullyVerifiedAccountMaxLimit_STW_TC_32() throws Exception {
        kwartaPadalaWallet.sendMoneyMLWalletFullyVerifiedAccountMaxLimit_STW_TC_32();
    }
    @Test(priority = 27, description = "send_Money_To_MLWallet_Success_Msg_Validation_STW_TC_35")
    public void sendMoneyToMLWalletSuccessMsgValidation_STW_TC_35() throws Exception {
        kwartaPadalaWallet.sendMoneyToMLWalletSuccessMsgValidation_STW_TC_35();
    }
//    @Test(priority = 28, description = "send_Money_To_MLWallet_Max_Transaction_Receiving_Limit_Semi-VerifiedTier_STW_TC_36")
//    public void sendMoneyToMLWalletMaxTransactionReceivingLimitSemiVerifiedTier_STW_TC_36() throws Exception {
//        kwartaPadalaWallet.sendMoneyToMLWalletMaxTransactionReceivingLimitSemiVerifiedTier_STW_TC_36("50000");
//    }
//    @Test(priority = 29, description = "send_Money_To_MLWallet_Max_Transaction_Receiving_Limit_Branch_VerifiedTier_STW_TC_38")
//    public void sendMoneyToMLWalletMaxTransactionReceivingLimitBranchVerifiedTier_STW_TC_38() throws Exception {
//        kwartaPadalaWallet.sendMoneyToMLWalletMaxTransactionReceivingLimitBranchVerifiedTier_STW_TC_38("50000");
//    }
//    @Test(priority = 30, description = "send_Money_To_MLWallet_Max_Transaction_Receiving_Limit_Fully_Verified_Tier_STW_TC_40")
//    public void sendMoneyToMLWalletMaxTransactionReceivingLimitFullyVerifiedTier_STW_TC_40() throws Exception {
//        kwartaPadalaWallet.sendMoneyToMLWalletMaxTransactionReceivingLimitFullyVerifiedTier_STW_TC_40("50000");
//    }
//    @Test(priority = 31, description = "send_Money_To_MLWallet_Location_Popup_Validation_STW_TC_42")
//    public void sendMoneyToMLWalletLocationPopupValidation_STW_TC_42() throws Exception {
//        kwartaPadalaWallet.sendMoneyToMLWalletLocationPopupValidation_STW_TC_42();
//    }
//    @Test(priority = 32, description = "send_Money_To_MLWallet_Location_Deny_Functionality_STW_TC_43")
//    public void sendMoneyToMLWalletLocationDenyFunctionality_STW_TC_43() throws Exception {
//        kwartaPadalaWallet.sendMoneyToMLWalletLocationDenyFunctionality_STW_TC_43();
//    }
//    @Test(priority = 33, description = "send_Money_To_MLWallet_Location_Permission_Deny_Close_Btn_Functionality_STW_TC_44")
//    public void sendMoneyToMLWalletLocationPermissionDenyCloseBtnFunctionality_STW_TC_44() throws Exception {
//        kwartaPadalaWallet.sendMoneyToMLWalletLocationPermissionDenyCloseBtnFunctionality_STW_TC_44();
//    }
//    @Test(priority = 34, description = "send_Money_To_MLWallet_Location_Permission_Deny_Open_Settings_Btn_Functionality_STW_TC_45")
//    public void sendMoneyToMLWalletLocationPermissionDenyOpenSettingsBtnFunctionality_STW_TC_45() throws Exception {
//        kwartaPadalaWallet.sendMoneyToMLWalletLocationPermissionDenyOpenSettingsBtnFunctionality_STW_TC_45();
//    }
//    @Test(priority = 35, description = "send_Money_To_MLWallet_Location_PopUp_Allow_Functionality_STW_TC_46")
//    public void sendMoneyToMLWalletLocationPopUpAllowFunctionality_STW_TC_46() throws Exception {
//        kwartaPadalaWallet.sendMoneyToMLWalletLocationPopUpAllowFunctionality_STW_TC_46();
//    }
    @Test(priority = 36, description = "send_Money_To_MLWallet_Internet_Interruption_While_Entering_OTP_STW_TC_47")
    public void sendMoneyToMLWalletInternetInterruptionWhileEnteringOTP_STW_TC_47() throws Exception {
        kwartaPadalaWallet.sendMoneyToMLWalletInternetInterruptionWhileEnteringOTP_STW_TC_47();
    }
    @Test(priority = 37, description = "send_Money_To_MLWallet_Transaction_Validation_After_Minimizing_App_STW_TC_50")
    public void sendMoneyToMLWalletTransactionValidationAfterMinimizingApp_STW_TC_50() throws Exception {
        kwartaPadalaWallet.sendMoneyToMLWalletTransactionValidationAfterMinimizingApp_STW_TC_50();
    }
//@Test(priority = 38, description = "send_Money_To_MLWallet_Transaction_With_Valid_MLPin_STW_TC_56")
//public void sendMoneyToMLWalletTransactionWithValidMLPin_STW_TC_56() throws Exception {
//    kwartaPadalaWallet.sendMoneyToMLWalletTransactionWithValidMLPin_STW_TC_56();
//}

//    @Test(priority = 39, description = "send_Money_To_MLWallet_Transaction_With_InValid_MLPin_STW_TC_57")
//    public void sendMoneyToMLWalletTransactionWithInValidMLPin_STW_TC_57() throws Exception {
//        kwartaPadalaWallet.sendMoneyToMLWalletTransactionWithInValidMLPin_STW_TC_57();
//    }
    @Test(priority = 40, description = "send_Money_To_MLWallet_In_OTP_Popup_Validation_STW_TC_63")
    public void sendMoneyToMLWalletInOTPPopupValidation_STW_TC_63() throws Exception {
        kwartaPadalaWallet.sendMoneyToMLWalletInOTPPopupValidation_STW_TC_63();
    }
    @Test(priority = 41, description = "send_Money_To_MLWallet_Transaction_In_App_OTP_Popup_UI_Validation_STW_TC_64")
    public void sendMoneyToMLWalletTransactionInAppOTPPopupUIValidation_STW_TC_64() throws Exception {
        kwartaPadalaWallet.sendMoneyToMLWalletTransactionInAppOTPPopupUIValidation_STW_TC_64();
    }
    @Test(priority = 42, description = "send_Money_To_MLWallet_Transaction_NewOTP_After_Sixty_Seconds_Validation_STW_TC_65")
    public void sendMoneyToMLWalletTransactionNewOTPAfterSixtySecondsValidation_STW_TC_65() throws Exception {
        kwartaPadalaWallet.sendMoneyToMLWalletTransactionNewOTPAfterSixtySecondsValidation_STW_TC_65();
    }
    @Test(priority = 43, description = "send_Money_To_MLWallet_Transaction_OTP_Cancel_Btn_Functionality_STW_TC_66")
    public void sendMoneyToMLWalletTransactionOTPCancelBtnFunctionality_STW_TC_66() throws Exception {
        kwartaPadalaWallet.sendMoneyToMLWalletTransactionOTPCancelBtnFunctionality_STW_TC_66();
    }
    @Test(priority = 44, description = "send_Money_To_MLWallet_OTP_Continue_Btn_Functionality_STW_TC_67")
    public void sendMoneyToMLWalletOTPContinueBtnFunctionality_STW_TC_67() throws Exception {
        kwartaPadalaWallet.sendMoneyToMLWalletOTPContinueBtnFunctionality_STW_TC_67();
    }

}
