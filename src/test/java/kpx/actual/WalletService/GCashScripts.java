package kpx.actual.WalletService;

import kpx.base.BaseTest;
import org.testng.annotations.Test;
import static org.testng.Assert.assertTrue;
public class GCashScripts extends BaseTest {
    //----------Happy Path
//    @Test(priority = 1, description = "GCashSuccessfulTransaction_1")
//    public void GCashSuccessfulTransaction_1() throws Exception {
//        gCash.GCashSuccessfulTransaction_GC_SM_TC_76();
//    }
    //------Positive Testing
//    @Test(priority = 2, description = "VerifyUserAbleSeeGcashIconDashboard_2")
//    public void VerifyUserAbleSeeGcashIconDashboard_2() throws Exception {
//        gCash.GC_SM_TC_01_Verify_user_able_see_Gcash_icon_Dashborad();
//    }
//    @Test(priority = 3, description = "VerifyUserAbleNavigateGcashServicesPageTappingGcashIcon_3")
//    public void VerifyUserAbleNavigateGcashServicesPageTappingGcashIcon_3() throws Exception {
//        gCash.GC_SM_TC_02_Verify_user_able_navigate_Gcash_services_page_tapping_Gcash_icon();
//    }
//    @Test(priority = 4, description = "VerifyUIGcashServicespage_4")
//    public void VerifyUIGcashServicespage_4() throws Exception {
//        gCash.GC_SM_TC_03_Verify_UI_Gcash_Services_page();
//    }
//    @Test(priority = 5, description = "VerifyuserIsRedirectedToReceiveMoneyFromGcashPage_5")
//    public void VerifyuserIsRedirectedToReceiveMoneyFromGcashPage_5() throws Exception {
//        gCash.GC_SM_TC_43_VerifyuserIsRedirectedToReceiveMoneyFromGcashPage();
//    }
//    @Test(priority = 6, description = "Validate_user_able_see_NextBtn_Send_money_Gcash_page_6")
//    public void Validate_user_able_see_NextBtn_Send_money_Gcash_page_6() throws Exception {
//        gCash.GC_SM_TC_58_Validate_user_able_see_NextBtn_Send_money_Gcash_page();
//    }
//    @Test(priority = 7, description = "InAppOtp_Page_Redirection_Validation_7")
//    public void InAppOtp_Page_Redirection_Validation_7() throws Exception {
//        gCash.GC_SM_TC_60_InAppOtp_Page_Redirection_Validation();
//    }
//    @Test(priority = 8, description = "ValidateSMSOTP_InApp_GCash_Send_Money_8")
//    public void ValidateSMSOTP_InApp_GCash_Send_Money_8() throws Exception {
//        gCash.GC_SM_TC_72_ValidateSMSOTP_InApp_GCash_Send_Money();
//    }
//    @Test(priority = 9, description = "Validate_Back_Btn_In_GCash_Transaction_Details_Page_9")
//    public void Validate_Back_Btn_In_GCash_Transaction_Details_Page_9() throws Exception {
//        gCash.GC_SM_TC_73_Validate_Back_Btn_In_GCash_Transaction_Details_Page();
//    }
//    @Test(priority = 10, description = "Validate_Transaction_Details_Match_User_Entered_Details_10")
//    public void Validate_Transaction_Details_Match_User_Entered_Details_10() throws Exception {
//        gCash.GC_SM_TC_83_Validate_Transaction_Details_Match_User_Entered_Details();
//    }
//    @Test(priority = 11, description = "Validate_Transaction_Details_Match_User_Entered_Details_10")
//    public void GC_SM_TC_102_Validate_SendMoneyGCash_BuyerTier() throws Exception {
//        gCash.GC_SM_TC_102_Validate_SendMoneyGCash_BuyerTier();
//    }
//    @Test(priority = 12, description = "SendMoney_as_SemiVerified_12")
//    public void SendMoney_as_SemiVerified_12() throws Exception {
//        gCash.GC_SM_TC_132_SendMoney_as_SemiVerified();
//    }
//    @Test(priority = 13, description = "SendMoney_as_BranchVerified_13")
//    public void SendMoney_as_BranchVerified_13() throws Exception {
//        gCash.GC_RM_TC_135_SendMoney_as_BranchVerified();
//    }
    @Test(priority = 14, description = "Contacts_14")
    public void Contacts_14() throws Exception {
        gCash.GC_RM_TC_182_Contacts();
    }

    //------Negative Testing
//    @Test(priority = 1, description = "VerifyUserRedirectedBackDashboardTappingBackArrowBtn_1")
//    public void VerifyUserRedirectedBackDashboardTappingBackArrowBtn_1() throws Exception {
//        gCash.GC_SM_TC_04_Verify_user_redirected_back_Dashboard_tapping_back_arrow_btn();
//    }
//    @Test(priority = 2, description = "EmptyReceiverNumber_ErrorMsg_Validation_2")
//    public void EmptyReceiverNumber_ErrorMsg_Validation_2() throws Exception {
//        gCash.GC_SM_TC_49_EmptyReceiverNumber_ErrorMsg_Validation();
//    }
//    @Test(priority = 3, description = "InvalidReceiverNumber_ErrorMsg_Validation_3")
//    public void InvalidReceiverNumber_ErrorMsg_Validation_3() throws Exception {
//        gCash.GC_SM_TC_50_InvalidReceiverNumber_ErrorMsg_Validation();
//    }
//    @Test(priority = 4, description = "MoreThanTwoDecimal_ErrorMsg_Validation_4")
//    public void MoreThanTwoDecimal_ErrorMsg_Validation_4() throws Exception {
//        gCash.GC_SM_TC_54_MoreThanTwoDecimal_ErrorMsg_Validation();
//    }
//    @Test(priority = 5, description = "SendMoneytoGcash_LessThan_One_Validation_5")
//    public void SendMoneytoGcash_LessThan_One_Validation_5() throws Exception {
//        gCash.GC_SM_TC_57_SendMoneytoGcash_LessThan_One_Validation();
//    }
//    @Test(priority = 6, description = "RedirectBack_SendMoneytoGcash_From_ConfirmDetails_Validation_6")
//    public void RedirectBack_SendMoneytoGcash_From_ConfirmDetails_Validation_6() throws Exception {
//        gCash.GC_SM_TC_59_RedirectBack_SendMoneytoGcash_From_ConfirmDetails_Validation();
//    }
//    @Test(priority = 7, description = "CancelOTP_Redirect_SendMoney_to_Gcash_Mobile_Entry_7")
//    public void CancelOTP_Redirect_SendMoney_to_Gcash_Mobile_Entry_7() throws Exception {
//        gCash.GC_SM_TC_64_CancelOTP_Redirect_SendMoney_to_Gcash_Mobile_Entry();
//    }
//    @Test(priority = 8, description = "Validate_SendMoneyGCash50k_SemiVerified_8")
//    public void Validate_SendMoneyGCash50k_SemiVerified_8() throws Exception {
//        gCash.GC_SM_TC_103_Validate_SendMoneyGCash50k_SemiVerified();
//    }
//    @Test(priority = 9, description = "Validate_SendMoneyGCash50k_BranchVerified_9")
//    public void Validate_SendMoneyGCash50k_BranchVerified_9() throws Exception {
//        gCash.GC_SM_TC_104_Validate_SendMoneyGCash50k_BranchVerified();
//    }
//    @Test(priority = 10, description = "Validate_SendMoneyGCash50k_FullyVerified_10")
//    public void Validate_SendMoneyGCash50k_FullyVerified_10() throws Exception {
//        gCash.GC_SM_TC_105_Validate_SendMoneyGCash50k_FullyVerified();
//    }
//    @Test(priority = 11, description = "SendMoney_NoGCash_thru_MLWallet_11")
//    public void SendMoney_NoGCash_thru_MLWallet_11() throws Exception {
//        gCash.GC_RM_TC_180_SendMoney_NoGCash_thru_MLWallet();
//    }
//    @Test(priority = 12, description = "SendMoney_NoGCash_thru_KwartaPadala_12")
//    public void SendMoney_NoGCash_thru_KwartaPadala_12() throws Exception {
//        gCash.GC_RM_TC_181_SendMoney_NoGCash_thru_KwartaPadala();
//    }
}
