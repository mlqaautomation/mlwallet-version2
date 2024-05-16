package kpx.actual.WalletService;

import kpx.base.BaseTest;
import org.testng.annotations.Test;
import utilities.ExtentReport.ExtentReporter;

import static org.testng.Assert.assertTrue;
import static utilities.Driver.AppiumDriverManager.APP_ID;
import static utilities.Driver.AppiumDriverManager.getAndroidDriver;

public class ShopSafeWallet extends BaseTest{
        @Test(description = "Test to verify app is installed")
        public void isAppInstalledTest(){
            assertTrue(getAndroidDriver().isAppInstalled(APP_ID));
            ExtentReporter.logPass("isAppInstalledTest", "MLWALLET is installed");
        }

    @Test(priority = 1, description = "SHOP SAFE BTCH 19")
    public void SSM_TC_04_Verify_enter_valid_seller_number_in_Create_Transaction_Page() throws Exception {
        shopSafe.SSM_TC_04_Verify_enter_valid_seller_number_in_Create_Transaction_Page();
    }
//    @Test(priority = 2, description = "SHOP SAFE BTCH 13")
//    public void SSM_TC_05_Verify_buyer_request_invites_click_View_Invitations_Button_in_Invites_Page() throws Exception {
//        shopSafe.SSM_TC_05_Verify_buyer_request_invites_click_View_Invitations_Button_in_Invites_Page();
//    }
//    @Test(priority = 3, description = "SHOP SAFE BTCH 12")
//    public void SSM_TC_06_Verify_seller_received_invites_click_View_Invitations_Button_in_Invites_Page() throws Exception {
//        shopSafe.SSM_TC_06_Verify_seller_received_invites_click_View_Invitations_Button_in_Invites_Page();
//    }
    @Test(priority = 4, description = "SHOP SAFE BTCH 21")
    public void SSM_TC_08_Verify_seller_fill_up_the_Item_Information_Page_and_clicking_proceed_button_Invites_Page() throws Exception {
        shopSafe.SSM_TC_08_Verify_seller_fill_up_the_Item_Information_Page_and_clicking_proceed_button_Invites_Page();
    }
    @Test(priority = 5, description = "SHOP SAFE BTCH 20")
    public void SSM_TC_09_Validate_Buyer_Ongoing_Transaction_Page() throws Exception {
        shopSafe.SSM_TC_09_Validate_Buyer_Ongoing_Transaction_Page();
    }
    @Test(priority = 6, description = "SHOP SAFE BTCH 21")
    public void SSM_TC_10_Validate_Seller_Ongoing_Transaction_Page() throws Exception {
        shopSafe.SSM_TC_10_Validate_Seller_Ongoing_Transaction_Page();
    }
    @Test(priority = 7, description = "SHOP SAFE BTCH 22")
    public void SSM_TC_11_Verify_seller_fill_up_the_Item_Information_Page_and_clicking_proceed_button_Invites_Page() throws Exception {
        shopSafe.SSM_TC_11_Verify_seller_fill_up_the_Item_Information_Page_and_clicking_proceed_button_Invites_Page();
    }
    @Test(priority = 8, description = "SHOP SAFE BTCH 23")
    public void SSM_TC_12_Verify_seller_Paid_Item_Transaction_Drop_off_Status_Invites_Page() throws Exception {
        shopSafe.SSM_TC_12_Verify_seller_Paid_Item_Transaction_Drop_off_Status_Invites_Page();
    }

//        @Test(priority = 6, description = "SHOP SAFE BTCH 23")
//        public void SSM_TC_15_Verify_buyer_and_Seller_Successful_Transaction() throws Exception {
//            shopSafe.SSM_TC_15_Verify_buyer_and_Seller_Successful_Transaction();
//        }

}
