package kpx.actual.WalletService;
import kpx.base.BaseTest;
import org.testng.annotations.Test;
import static org.testng.Assert.assertTrue;
public class SettingScripts extends BaseTest {
//    ------Positive Testing
    @Test(priority = 1, description = "settingsAccountDetailsValidation_01")
    public void settingsAccountDetailsValidation_01() throws Exception {
        settings.settingsAccountDetailsValidation_SS_TC_01();
    }
//    @Test(priority = 2, description = "settingsInvalidMLPinValidation_03")
//    public void settingsInvalidMLPinValidation_03() throws Exception {
//        settings.settingsInvalidMLPinValidation_SS_TC_03();
//    }
    //dependent of test data MLPIN
//    @Test(priority = 3, description = "settingsValidMLPinValidation_02")
//    public void settingsValidMLPinValidation_02() throws Exception {
//        settings.settingsValidMLPinValidation_SS_TC_02();
//    }
    //Missing activity Biometrics
//    @Test(priority = 4, description = "settingsBiometricsLogin_04")
//    public void settingsBiometricsLogin_04() throws Exception {
//        settings.settingsBiometricsLogin_SS_TC_04();
//    }
//    @Test(priority = 5, description = "settingAccRecovery_05")
//    public void settingAccRecovery_05() throws Exception {
//        settings.settingAccRecovery_SS_TC_05();
//    }
//    @Test(priority = 6, description = "settingsBackBtnValidation_SS_TC_06")
//    public void settingsBackBtnValidation_06() throws Exception {
//        settings.settingsBackBtnValidation_SS_TC_07();
//    }
//    @Test(priority = 7, description = "settingsDeleteAccountPopUpUIValidation_07")
//    public void settingsDeleteAccountPopUpUIValidation_07() throws Exception {
//        settings.settingsDeleteAccountPopUpUIValidation_SS_TC_10();
//    }
//    @Test(priority = 8, description = "settingsChangeMLPinNavigation_08")
//    public void settingsChangeMLPinNavigation_08() throws Exception {
//        settings.settingsChangeMLPinNavigation_SS_TC_12();
//    }
//    @Test(priority = 9, description = "settingsChangeMlPinBackBtnValidation_09")
//    public void settingsChangeMlPinBackBtnValidation_09() throws Exception {
//        settings.settingsChangeMlPinBackBtnValidation_SS_TC_13();
//    }
    //-----Missing Biometrics
//    @Test(priority = 10, description = "settingsPageUIValidation_10")
//    public void settingsPageUIValidation_10() throws Exception {
//        settings.settingsPageUIValidation_SS_TC_06();
//    }
//    @Test(priority = 11, description = "settingsPageUIValidation_11")
//    public void settingsPageUIValidation_11() throws Exception {
//        settings.settingsAccountDetailsNavigation_SS_TC_14();
//    }
//    @Test(priority = 12, description = "settingsAccountDetailsBackBtnValidation_12")
//    public void settingsAccountDetailsBackBtnValidation_12() throws Exception {
//        settings.settingsAccountDetailsBackBtnValidation_SS_TC_15();
//    }
//    @Test(priority = 13, description = "settingChangeMLPinUIValidation_13")
//    public void settingChangeMLPinUIValidation_13() throws Exception {
//        settings.settingChangeMLPinUIValidation_SS_TC_16();
//    }
//    @Test(priority = 14, description = "settingsAccountRecoveryUIValidation_14")
//    public void settingsAccountRecoveryUIValidation_14() throws Exception {
//        settings.settingsAccountRecoveryUIValidation_SS_TC_17();
//    }
//    @Test(priority = 15, description = "settingsDeleteAccountCancelBtnValidation_15")
//    public void settingsDeleteAccountCancelBtnValidation_15() throws Exception {
//        settings.settingsDeleteAccountCancelBtnValidation_SS_TC_18();
//    }
    //-----Missing Biometrics
//    @Test(priority = 16, description = "settingsBiometricsLoginUIValidation_16")
//    public void settingsBiometricsLoginUIValidation_16() throws Exception {
//        settings.settingsBiometricsLoginUIValidation_SS_TC_20();
//    }
//    @Test(priority = 17, description = "settingsAccountRecoveryNavigation_17")
//    public void settingsAccountRecoveryNavigation_17() throws Exception {
//        settings.settingsAccountRecoveryNavigation_SS_TC_21();
//    }
//    @Test(priority = 18, description = "settingsTroubleSigningInBackBtnValidation_18")
//    public void settingsTroubleSigningInBackBtnValidation_18() throws Exception {
//        settings.settingsTroubleSigningInBackBtnValidation_SS_TC_22();
//    }
    //-----Missing Biometrics
//    @Test(priority = 19, description = "settingsBiometricsLoginNavigation_19")
//    public void settingsBiometricsLoginNavigation_19() throws Exception {
//        settings.settingsBiometricsLoginNavigation_SS_TC_23();
//    }
    //-----Missing Biometrics
//        @Test(priority = 20, description = "settingsBiometricsLoginBackBtnValidation_20")
//    public void settingsBiometricsLoginBackBtnValidation_20() throws Exception {
//        settings.settingsBiometricsLoginBackBtnValidation_SS_TC_24();
//    }
    //------Dont test this It will delete account
//    @Test(priority = 21, description = "settingsDeleteAccountPageUIValidation_21")
//    public void settingsDeleteAccountPageUIValidation_21() throws Exception {
//        settings.settingsDeleteAccountPageUIValidation_SS_TC_25();
//    }
    //------Dont test this It will delete account
//    @Test(priority = 22, description = "settingsDeleteAccountIWantToStayButtonFunctionality_22")
//    public void settingsDeleteAccountIWantToStayButtonFunctionality_22() throws Exception {
//        settings.settingsDeleteAccountIWantToStayButtonFunctionality_SS_TC_26();
//    }
//------Dont test this It will delete account
//    @Test(priority = 23, description = "settingsDeleteAccountPageBackButtonValidation_23v")
//    public void settingsDeleteAccountPageBackButtonValidation_23() throws Exception {
//        settings.settingsDeleteAccountPageBackButtonValidation_SS_TC_27();
//    }
//    @Test(priority = 24, description = "settingsDeleteAccountButtonFunctionality_24")
//    public void settingsDeleteAccountButtonFunctionality_24() throws Exception {
//        settings.settingsDeleteAccountButtonFunctionality_SS_TC_28();
//    }
//    @Test(priority = 25, description = "settingsDeleteAccountConfirmationPopupCancelBtnFunctionality_25")
//    public void settingsDeleteAccountConfirmationPopupCancelBtnFunctionality_25() throws Exception {
//        settings.settingsDeleteAccountConfirmationPopupCancelBtnFunctionality_SS_TC_29();
//    }
    //------Dont test this It will delete account
//    @Test(priority = 26, description = "settingsDeleteAccountConfirmationPopupProceedBtnFunctionality_26")
//    public void settingsDeleteAccountConfirmationPopupProceedBtnFunctionality_26() throws Exception {
//        settings.settingsDeleteAccountConfirmationPopupProceedBtnFunctionality_SS_TC_30();
//    }
    //------Dont test this It will delete account
//    @Test(priority = 27, description = "settingsDeleteAccountMLPinPageUIValidation_27")
//    public void settingsDeleteAccountMLPinPageUIValidation_27() throws Exception {
//        settings.settingsDeleteAccountMLPinPageUIValidation_SS_TC_31();
//    }
    //------Dont test this It will delete account
//    @Test(priority = 28, description = "settingsDeleteAccountMLPinPageBackArrowBtnFunctionality_28")
//    public void settingsDeleteAccountMLPinPageBackArrowBtnFunctionality_28() throws Exception {
//        settings.settingsDeleteAccountMLPinPageBackArrowBtnFunctionality_SS_TC_32();
//    }
    //------Dont test this It will delete account
//    @Test(priority = 28, description = "settingsDeleteAccountMLPinPageBackArrowBtnFunctionality_28")
//    public void settingsDeleteAccountMLPinPageBackArrowBtnFunctionality_28() throws Exception {
//        settings.settingsDeleteAccountMLPinPageBackArrowBtnFunctionality_SS_TC_32();
//    }
    //------Dont test this It will delete account
//    @Test(priority = 29, description = "settingsDeleteAccountInvalidMLPin_29")
//    public void settingsDeleteAccountInvalidMLPin_29() throws Exception {
//        settings.settingsDeleteAccountInvalidMLPin_SS_TC_34();
//    }
    //------Dont test this It will delete account
//    @Test(priority = 30, description = "settingsDeleteAccountInvalidMLPinPopupOkBtnFunctionality_30")
//    public void settingsDeleteAccountInvalidMLPinPopupOkBtnFunctionality_30() throws Exception {
//        settings.settingsDeleteAccountInvalidMLPinPopupOkBtnFunctionality_SS_TC_35();
//    }
}

