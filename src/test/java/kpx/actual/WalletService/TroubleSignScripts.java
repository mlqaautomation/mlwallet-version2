package kpx.actual.WalletService;
import kpx.base.BaseTest;
import org.testng.annotations.Test;
import static org.testng.Assert.assertTrue;
public class TroubleSignScripts extends BaseTest {
    //------HappyPath
    @Test(priority = 1, description = "troubleSigningInSuccessRequestValidation_01")
    public void troubleSigningInSuccessRequestValidation_01() throws Exception {
        troubleSignIn.troubleSigningInSuccessRequestValidation_02();
    }


    //------Positive Test
//    @Test(priority = 2, description = "registrationNumberPageUIValidation_02")
//    public void registrationNumberPageUIValidation_02() throws Exception {
//        troubleSignIn.troubleSigningInPageNavigationFromMpinScreen_TS_TC_01();
//    }
//    @Test(priority = 3, description = "troubleSigningInPageNavigationFromLoginScreen_03")
//    public void troubleSigningInPageNavigationFromLoginScreen_03() throws Exception {
//        troubleSignIn.troubleSigningInPageNavigationFromLoginScreen_TS_TC_10();
//    }



    //------Negative Test
//    @Test(priority = 1, description = "troubleSigningInPageBackArrowBtnFunctionality_02")
//    public void troubleSigningInPageBackArrowBtnFunctionality_02() throws Exception {
//        troubleSignIn.troubleSigningInPageBackArrowBtnFunctionality_TS_TC_11();
//    }
//    @Test(priority = 2, description = "troubleSigningInClearFormFunctionality_02")
//    public void troubleSigningInClearFormFunctionality_02() throws Exception {
//        troubleSignIn.troubleSigningInClearFormFunctionality_TS_TC_12();
//    }
//    @Test(priority = 3, description = "troubleSigningInClearFormButtonOnClearFormPopupFunctionality_03")
//    public void troubleSigningInClearFormButtonOnClearFormPopupFunctionality_03() throws Exception {
//        troubleSignIn.troubleSigningInClearFormButtonOnClearFormPopupFunctionality_TS_TC_13();
//    }
//    @Test(priority = 4, description = "troubleSigningInCancelButtonOnClearFormPopupFunctionality_04")
//    public void troubleSigningInCancelButtonOnClearFormPopupFunctionality_04() throws Exception {
//        troubleSignIn.troubleSigningInCancelButtonOnClearFormPopupFunctionality_TS_TC_14();
//    }
//    @Test(priority = 5, description = "troubleSigningInEmptyFullNameFunctionality_05")
//    public void troubleSigningInEmptyFullNameFunctionality_05() throws Exception {
//        troubleSignIn.troubleSigningInEmptyFullNameFunctionality_TS_TC_15();
//    }
//    @Test(priority = 6, description = "troubleSigningInEmptyRegisteredEmailFunctionality_06")
//    public void troubleSigningInEmptyRegisteredEmailFunctionality_06() throws Exception {
//        troubleSignIn.troubleSigningInEmptyRegisteredEmailFunctionality_TS_TC_16();
//    }
//    @Test(priority = 7, description = "troubleSigningInEmptyRegisteredEmailFunctionality_07")
//    public void troubleSigningInEmptyRegisteredEmailFunctionality_07() throws Exception {
//        troubleSignIn.troubleSigningInEmptyRegisteredMobileNumberFunctionality_TS_TC_17();
//    }
}
