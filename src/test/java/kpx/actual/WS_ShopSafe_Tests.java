package kpx.actual;

import kpx.base.BaseTest;
import org.testng.annotations.Test;
import utilities.ExtentReport.ExtentReporter;
public class WS_ShopSafe_Tests extends BaseTest {

//----------------Positive Test
    @Test(description = "Logging in via gmail and kpx")
    public void loginGoogle() throws Exception {
        this.loginSteps.signInGoogle("teller");
        this.loginSteps.loginKpx("teller");
//        if(this.homeSteps.isInHomePage()){
//            ExtentReporter.logPass("loginGoogle", "Login, Passed!!");
//        }
    }

//    @Test(dependsOnMethods = "loginGoogle" , priority = 1)
//    public void To_Validate_Shop_Safe_Page_WS_SS_01() throws Exception {
//        if (this.homeSteps.isInHomePage()) {
//            this.wsShopSafeSteps.To_Validate_Shop_Safe_Page_WS_SS_01();
//        }
//    }
//
//    @Test(dependsOnMethods = "loginGoogle" , priority = 2)
//    public void To_Validate_Valid_Reference_Number_WS_SS_02() throws Exception {
//        if (this.homeSteps.isInHomePage()) {
//            this.wsShopSafeSteps.To_Validate_Valid_Reference_Number_WS_SS_02();
//        }
//    }
//
//    @Test(dependsOnMethods = "loginGoogle" , priority = 3)
//    public void To_Validate_Transaction_Information_WS_SS_03() throws Exception {
//        if (this.homeSteps.isInHomePage()) {
//            this.wsShopSafeSteps.To_Validate_Transaction_Information_WS_SS_03();
//        }
//    }
//
//    @Test(dependsOnMethods = "loginGoogle", priority = 4)
//    public void To_Validate_Item_Photo_WS_SS_04() throws Exception {
//        if (this.homeSteps.isInHomePage()) {
//            this.wsShopSafeSteps.To_Validate_Item_Photo_WS_SS_04();
//        }
//    }
//
//    @Test(dependsOnMethods = "loginGoogle", priority = 5)
//    public void To_Validate_Sellers_Photo_WS_SS_05() throws Exception {
//        if (this.homeSteps.isInHomePage()) {
//            this.wsShopSafeSteps.To_Validate_Sellers_Photo_WS_SS_05();
//        }
//    }
//
//    @Test(dependsOnMethods = "loginGoogle", priority = 6)
//    public void To_Validate_Buyer_Photo_WS_SS_06() throws Exception {
//        if (this.homeSteps.isInHomePage()) {
//            this.wsShopSafeSteps.To_Validate_Buyer_Photo_WS_SS_06();
//        }
//    }
//
//    @Test(dependsOnMethods = "loginGoogle", priority = 7)
//    public void To_Validate_Transaction_Details_WS_SS_07() throws Exception {
//        if (this.homeSteps.isInHomePage()) {
//            this.wsShopSafeSteps.To_Validate_Transaction_Details_WS_SS_07();
//        }
//    }
//
//    @Test(dependsOnMethods = "loginGoogle", priority = 8)
//    public void To_Validate_Amount_Information_WS_SS_08() throws Exception {
//        if (this.homeSteps.isInHomePage()) {
//            this.wsShopSafeSteps.To_Validate_Amount_Information_WS_SS_08();
//        }
//    }
//
//    @Test(dependsOnMethods = "loginGoogle", priority = 9)
//    public void To_Validate_Parcel_Status_As_Transit_WS_SS_09() throws Exception {
//        if (this.homeSteps.isInHomePage()) {
//            this.wsShopSafeSteps.To_Validate_Parcel_Status_As_Transit_WS_SS_09();
//        }
//    }
//
//    @Test(dependsOnMethods = "loginGoogle", priority = 10)
//    public void To_Validate_Input_Tracking_Number_And_Remarks_WS_SS_10() throws Exception {
//        if (this.homeSteps.isInHomePage()) {
//            this.wsShopSafeSteps.To_Validate_Input_Tracking_Number_And_Remarks_WS_SS_10();
//        }
//    }

//
//    @Test(dependsOnMethods = "loginGoogle", priority = 10, description = "Validate Cash In to Own Account Page")
//    public void To_Validate_Update_Status_By_Clicking_Yes_Button_For_Transit_WS_SS_11() throws Exception {
//        if (this.homeSteps.isInHomePage()) {
//            this.wsShopSafeSteps.To_Validate_Update_Status_By_Clicking_Yes_Button_For_Transit_WS_SS_11();
//        }
//    }
//

    @Test(dependsOnMethods = "loginGoogle", priority = 1, description = "Validate Cash In to Own Account Page")
    public void To_Validate_Complete_Transaction_WS_SS_12() throws Exception {
         this.wsShopSafeSteps.To_Validate_Complete_Transaction_WS_SS_12();
    }
//
//    @Test(dependsOnMethods = "loginGoogle", priority = 10, description = "Validate Cash In to Own Account Page")
//    public void To_Validate_Input_Remarks_And_Clicking_Update_Status_Button_For_PickUp_WS_SS_13() throws Exception {
//            this.wsShopSafeSteps.To_Validate_Input_Remarks_And_Clicking_Update_Status_Button_For_PickUp_WS_SS_13();
//    }
//
//    @Test(dependsOnMethods = "loginGoogle", priority = 10, description = "Validate Cash In to Own Account Page")
//    public void To_Validate_Parcel_Status_As_Transit_WS_SS_14() throws Exception {
//        if (this.homeSteps.isInHomePage()) {
//            this.wsShopSafeSteps.To_Validate_Parcel_Status_As_Transit_WS_SS_14();
//        }
//    }
//
//    @Test(dependsOnMethods = "loginGoogle", priority = 10, description = "Validate Cash In to Own Account Page")
//    public void To_Validate_Clicking_Complete_Button_For_PickUp_WS_SS_15() throws Exception {
//        if (this.homeSteps.isInHomePage()) {
//            this.wsShopSafeSteps.To_Validate_Clicking_Complete_Button_For_PickUp_WS_SS_15();
//        }
//    }
//
////----------------Negative Test
//    @Test(dependsOnMethods = "loginGoogle", priority = 11)
//    public void To_Validate_Empty_Reference_Number_WS_RR_01() throws Exception {
//        if (this.homeSteps.isInHomePage()) {
//            this.wsShopSafeSteps.To_Validate_Empty_Reference_Number_WS_RR_01();
//        }
//    }

//    @Test(dependsOnMethods = "loginGoogle", priority = 12)
//    public void To_Validate_Invalid_Reference_Number_WS_RR_02() throws Exception {
//
//            this.wsShopSafeSteps.To_Validate_Invalid_Reference_Number_WS_RR_02();
//
//    }

//    @Test(dependsOnMethods = "loginGoogle", priority = 13)
//    public void To_Validate_Empty_Tracking_Number_WS_RR_03() throws Exception {
//        if (this.homeSteps.isInHomePage()) {
//            this.wsShopSafeSteps.To_Validate_Empty_Tracking_Number_WS_RR_03();
//        }
//    }

//    @Test(dependsOnMethods = "loginGoogle", priority = 14)
//    public void To_Validate_Modal_Display_By_Clicking_Back_Button_WS_RR_04() throws Exception {
//        if (this.homeSteps.isInHomePage()) {
//            this.wsShopSafeSteps.To_Validate_Modal_Display_By_Clicking_Back_Button_WS_RR_04();
//        }
//    }

//    @Test(dependsOnMethods = "loginGoogle", priority = 15)
//    public void To_Validate_Back_To_Wallet_Services_Page_WS_RR_05() throws Exception {
//
//            this.wsShopSafeSteps.To_Validate_Back_To_Wallet_Services_Page_WS_RR_05();
//
//    }

//    @Test(dependsOnMethods = "loginGoogle", priority = 16)
//    public void To_Validate_Stay_In_The_Page_WS_RR_06() throws Exception {
//        if (this.homeSteps.isInHomePage()) {
//            this.wsShopSafeSteps.To_Validate_Stay_In_The_Page_WS_RR_06();
//        }
//    }
//
//    @Test(dependsOnMethods = "loginGoogle", priority = 17)
//    public void To_Validate_Stay_In_The_Page_WS_RR_07() throws Exception {
//        if (this.homeSteps.isInHomePage()) {
//            this.wsShopSafeSteps.To_Validate_Stay_In_The_Page_WS_RR_07();
//        }
//    }
//
//    @Test(dependsOnMethods = "loginGoogle", priority = 18)
//    public void To_Validate_Stay_In_The_Page_WS_RR_08() throws Exception {
//        if (this.homeSteps.isInHomePage()) {
//            this.wsShopSafeSteps.To_Validate_Stay_In_The_Page_WS_RR_08();
//        }
//    }

}
