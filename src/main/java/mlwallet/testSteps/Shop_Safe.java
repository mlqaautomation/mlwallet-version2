package mlwallet.testSteps;

import org.testng.Assert;
import utilities.ExtentReport.ExtentReporter;
import utilities.Logger.LoggingUtils;
import mlwallet.testSteps.Login;
import utilities.yamlReader.yamlReader;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Shop_Safe extends Base_Steps{
    
    Login login = new Login();

    //--------------------Positive Test--------------------

    public void SSM_TC_01_Verify_if_the_Shop_Safe_button_Icon_Visible() throws Exception {
        login.loginWalletBranchTier();
        mobileGeneralMethod.waitSleep(1000);
        if(mobileGeneralMethod.isVisible(mlWalletPageObjects.objShopSafeIconBtn(), "Shop Safe Icon Button")) {
            LoggingUtils.info("Shop Safe Navigation Success");
            ExtentReporter.logPass("SSM_TC_01", "To verify if the Shop Safe button Icon Visible");
        }
        else{
            ExtentReporter.logFail("Shop Safe Page ", "Failed to Validate if the Shop Safe button Icon Visible");
            Assert.fail("Failed to Validate if the Shop Safe button Icon Visible");
        }
    }
    public void SSM_TC_02_Verify_click_Shop_Safe_button_Redirect_to_Shop_Safe_Page() throws Exception {
        login.loginWalletBranchTier();
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.tap(mlWalletPageObjects.objShopSafeIconBtn(), "Shop Safe Icon Button");
        if(mobileGeneralMethod.isVisible(mlWalletPageObjects.objShopSafeLabel(),"Shop Safe label")){
            mobileGeneralMethod.isVisible(mlWalletPageObjects.objStartTransactBtn(),"Start Transaction Button");
            mobileGeneralMethod.isVisible(mlWalletPageObjects.objInvitesLabel(),"Invites Label");
            mobileGeneralMethod.isVisible(mlWalletPageObjects.objOngoingTransactLabel(),"Ongoing Transaction Label");
            mobileGeneralMethod.isVisible(mlWalletPageObjects.objCompletedTransactLabel(),"Completed Transaction Label");
            mobileGeneralMethod.verticalSwipe();
            mobileGeneralMethod.verticalSwipe();
            mobileGeneralMethod.verticalSwipe();
            mobileGeneralMethod.isVisible(mlWalletPageObjects.objCancelledTransactLabel(),"Cancelled Transact Label");
            mobileGeneralMethod.isVisible(mlWalletPageObjects.objReturnedTransactLabel(),"Returned Transaction Label");
            LoggingUtils.info("Redirect to Shop Safe Page Navigation Success");
            ExtentReporter.logPass("SSM_TC_02", "To verify click Shop Safe button Redirect to Shop Safe Page");
        }
        else{
            ExtentReporter.logFail("Shop Safe Page ", "Failed to Validate click Shop Safe button Redirect to Shop Safe Page");
            Assert.fail("Failed to Validate click Shop Safe button Redirect to Shop Safe Page");
        }
    }

    public void SSM_TC_03_Verify_click_Start_Transaction_button_Redirect_to_Create_Transaction_Page() throws Exception {
        login.loginWalletBranchTier();
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.tap(mlWalletPageObjects.objShopSafeIconBtn(), "Shop Safe Icon Button");
        mobileGeneralMethod.tap(mlWalletPageObjects.objStartTransactBtn(),"Start Transaction Button");
        if(mobileGeneralMethod.isVisible(mlWalletPageObjects.objCreateTransactLabel(),"Create Transact Label")){
            mobileGeneralMethod.isVisible(mlWalletPageObjects.objBackBtn(),"Back Button");
            mobileGeneralMethod.isVisible(mlWalletPageObjects.objSellerNoTxtbx(),"Seller Number Textbox");
            mobileGeneralMethod.isVisible(mlWalletPageObjects.objInviteSellerBtn(),"Invite Seller Button");
            LoggingUtils.info("Redirect to Create Transaction Page Navigation Success");
            ExtentReporter.logPass("SSM_TC_03", "To verify click Start Transaction button Redirect to Create Transaction Page");
        }
        else{
            ExtentReporter.logFail("Shop Safe Page ", "Failed to Validate click Start Transaction button Redirect to Create Transaction Page");
            Assert.fail("Failed to Validate click Start Transaction button Redirect to Create Transaction Page");
        }

    }

    public void SSM_TC_04_Verify_enter_valid_seller_number_in_Create_Transaction_Page() throws Exception {
        login.loginWalletBranchTier();
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.tap(mlWalletPageObjects.objShopSafeIconBtn(), "Shop Safe Icon Button");
        mobileGeneralMethod.tap(mlWalletPageObjects.objStartTransactBtn(),"Start Transaction Button");
        mobileGeneralMethod.isVisible(mlWalletPageObjects.objCreateTransactLabel(),"Start Transaction Button");
        mobileGeneralMethod.isVisible(mlWalletPageObjects.objBackBtn(),"Back Button");
        mobileGeneralMethod.isVisible(mlWalletPageObjects.objSellerNoTxtbx(),"Seller Number Textbox");
        mobileGeneralMethod.type(mlWalletPageObjects.objSellerNoTxtbx(),"Input Seller Number",reader.getNumberByTier("seller").toString());
        mobileGeneralMethod.tap(mlWalletPageObjects.objInviteSellerBtn(),"Invite Seller Button");
        mobileGeneralMethod.waitSleep(5000);
        if(mobileGeneralMethod.isVisible(mlWalletPageObjects.objSuccessfInviteLabel(),"Successful Label")){
            mobileGeneralMethod.isVisible(mlWalletPageObjects.objOkayBtn(),"Okay Button");
            //mobileGeneralMethod.closeApp();
            //mobileGeneralMethod.startActivity();
            LoggingUtils.info("Enter valid seller number in Create Transaction Page Success");
            ExtentReporter.logPass("SSM_TC_04", "To verify enter valid seller number in Create Transaction Page");
        }
        else{
            ExtentReporter.logFail("Shop Safe Page ", "Failed to enter valid seller number in Create Transaction Page");
            Assert.fail("Failed to Validate enter valid seller number in Create Transaction Page");
        }
    }

    public void SSM_TC_05_Verify_buyer_request_invites_click_View_Invitations_Button_in_Invites_Page () throws Exception {
        login.loginWalletBranchTier();
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.tap(mlWalletPageObjects.objShopSafeIconBtn(), "Shop Safe Icon Button");
        mobileGeneralMethod.waitSleep(5000);
        mobileGeneralMethod.tap(mlWalletPageObjects.objInvitesTransactTxtBtn(),"View all Invites Text Button");
        mobileGeneralMethod.waitSleep(5000);
        if(mobileGeneralMethod.isVisible(mlWalletPageObjects.objFirstInTab(),"First in TAB")){
            mobileGeneralMethod.tap(mlWalletPageObjects.objFirstInTab(),"Click New Invitation in Invites list");
            mobileGeneralMethod.waitSleep(3000);
            mobileGeneralMethod.isVisible(mlWalletPageObjects.objBuyerDetailsLabel(),"Buyer Details Label");
            mobileGeneralMethod.isVisible(mlWalletPageObjects.objBuyerNameVal(),"Buyer Name Value");
            mobileGeneralMethod.isVisible(mlWalletPageObjects.objBuyerNoVal(),"Buyer Number Value");
            mobileGeneralMethod.isVisible(mlWalletPageObjects.objSellerDetailsLabel(),"Seller Details Label");
            mobileGeneralMethod.isVisible(mlWalletPageObjects.objSellerNoVal(),"Seller Number Value");
            mobileGeneralMethod.isVisible(mlWalletPageObjects.objCancelInviteBtn(),"Cancel Invite Button");
            mobileGeneralMethod.isVisible(mlWalletPageObjects.objBackToHomesBtn(),"Back To Homes Button");
            //mobileGeneralMethod.closeApp();
            //mobileGeneralMethod.startActivity();
            LoggingUtils.info("View buyer request new invitations in Invites Page Success");
            ExtentReporter.logPass("SSM_TC_05", "To verify buyer request invites click View Invitations Button in Invites Page");
        }
        else{
            ExtentReporter.logFail("Shop Safe Page ", "Failed to Validate buyer request invites click View Invitations Button in Invites Page");
            Assert.fail("Failed to Validate buyer request invites click View Invitations Button in Invites Page");
        }
    }
    public void SSM_TC_06_Verify_seller_received_invites_click_View_Invitations_Button_in_Invites_Page () throws Exception {
        login.loginWalletFullyTier();
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.tap(mlWalletPageObjects.objShopSafeIconBtn(), "Shop Safe Icon Button");
        mobileGeneralMethod.waitSleep(3000);
        mobileGeneralMethod.tap(mlWalletPageObjects.objInvitesTransactTxtBtn(),"View all Invites Text Button");
        mobileGeneralMethod.waitSleep(5000);
        if(mobileGeneralMethod.isVisible(mlWalletPageObjects.objFirstInTab(),"First in TAB")){
            mobileGeneralMethod.tap(mlWalletPageObjects.objFirstInTab(),"New Invitation in Invites list");
            mobileGeneralMethod.waitSleep(5000);
            mobileGeneralMethod.isVisible(mlWalletPageObjects.objPicOfItemBtn(),"Picture Of Item Button");
            mobileGeneralMethod.isVisible(mlWalletPageObjects.objItemNameTxtBx(),"Item Name textbox");
            mobileGeneralMethod.isVisible(mlWalletPageObjects.objItemDescriptTxtBx(),"Item Description TextBox");
            mobileGeneralMethod.waitSleep(3000);
            mobileGeneralMethod.verticalSwipe();
            mobileGeneralMethod.waitSleep(3000);
            mobileGeneralMethod.isVisible(mlWalletPageObjects.objBrandTxtBx(),"Brand TextBox");
            mobileGeneralMethod.isVisible(mlWalletPageObjects.objModelNoTxtbox(),"Model No TextBox");
            mobileGeneralMethod.isVisible(mlWalletPageObjects.objItemQuantityTxtbx(),"Item Quantity Textbx");
            mobileGeneralMethod.isVisible(mlWalletPageObjects.objCategoryDropDownlist(),"Category DropDownlist");
            mobileGeneralMethod.isVisible(mlWalletPageObjects.objItemPriceTxtbx(),"Item Price Textbox");
            mobileGeneralMethod.verticalSwipe();
            mobileGeneralMethod.isVisible(mlWalletPageObjects.objWeightRangeDropDownList(),"Weight Range DropDownList");
            mobileGeneralMethod.isVisible(mlWalletPageObjects.objNearestDropOffGMap(),"Nearest Drop Off GMap");
            mobileGeneralMethod.verticalSwipe();
            mobileGeneralMethod.isVisible(mlWalletPageObjects.objProceedsBtn(),"Proceeds Button");
            mobileGeneralMethod.isVisible(mlWalletPageObjects.objDeclineBtn(),"Decline Button");
            //mobileGeneralMethod.closeApp();
            //mobileGeneralMethod.startActivity();
            LoggingUtils.info("View new invitations in Invites Page Success");
            ExtentReporter.logPass("SSM_TC_06", "To verify seller received invites click View Invitations Button in Invites Page");
        }
        else{
            ExtentReporter.logFail("Shop Safe Page ", "Failed to Validate seller received invites click View Invitations Button in Invites Page");
            Assert.fail("Failed to Validate seller received invites click View Invitations Button in Invites Page");
        }
    }

    public void Camera()throws Exception{
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.waitSleep(5000);
        mobileGeneralMethod.tap(mlWalletPageObjects.objPicOfItemBtn(),"Picture Of Item Button");
        mobileGeneralMethod.tap(mlWalletPageObjects.objCameraBtn(),"Camera Button");
        mobileGeneralMethod.waitSleep(3000);
//        if(mobileGeneralMethod.isVisible(mlWalletPageObjects.objAllowCameraWhileUsingAppBtn(),"Allow Camera Using App")){
//            mobileGeneralMethod.tap(mlWalletPageObjects.objAllowCameraWhileUsingAppBtn(),"Allow Camera");
//        }
        mobileGeneralMethod.tap(mlWalletPageObjects.objTakeAPicBtn(),"Take a Photo Button");
        mobileGeneralMethod.waitSleep(5000);
        mobileGeneralMethod.tap(mlWalletPageObjects.objTakeAPicOkBtn(),"Photo OK Button");
    }

    public void DropOff() throws Exception{
        mobileGeneralMethod.tap(mlWalletPageObjects.objNearestDropOffGMap(),"Nearest Drop Off GMap");
//        mobileGeneralMethod.tap(mlWalletPageObjects.objAllowWhileUsingAppBtn(),"Allow G Map");
        mobileGeneralMethod.waitSleep(5000);
        if(mobileGeneralMethod.isVisible(mlWalletPageObjects.objSelectNearest(),"Near Appear")){
            mobileGeneralMethod.waitSleep(3000);
            mobileGeneralMethod.tap(mlWalletPageObjects.objSelectNearest(), "Select Near");
        }
        mobileGeneralMethod.isVisible(mlWalletPageObjects.objBranchNameGMapVal(),"");
        mobileGeneralMethod.isVisible(mlWalletPageObjects.objBranchAddressGMapVal(),"");
        mobileGeneralMethod.tap(mlWalletPageObjects.objConfirmBranchBtn(),"Confirm Branch Button");
    }
    public void VerifyConfirmationPage() throws Exception{
        mobileGeneralMethod.isVisible(mlWalletPageObjects.objConfirmDetailsPage(),"Confirmation Page");
        mobileGeneralMethod.isVisible(mlWalletPageObjects.objPicture(),"Picture ");
        mobileGeneralMethod.isVisible(mlWalletPageObjects.objRFTN(),"RFTN");
        mobileGeneralMethod.isVisible(mlWalletPageObjects.objSellersDetailLabel(),"Sellers Detail");
        mobileGeneralMethod.isVisible(mlWalletPageObjects.objSellersNameVal(),"Sellers Name");
        mobileGeneralMethod.isVisible(mlWalletPageObjects.objSellersNoVal(),"Sellers Number");
        mobileGeneralMethod.isVisible(mlWalletPageObjects.objBuyersDetailLabel(),"Buyers Detail");
        mobileGeneralMethod.isVisible(mlWalletPageObjects.objBuyersNameVal(),"Buyers Name");
        mobileGeneralMethod.isVisible(mlWalletPageObjects.objBuyersNoVal(),"Buyers No");
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.isVisible(mlWalletPageObjects.objItemDetailsLabel(),"Item Details");
        mobileGeneralMethod.isVisible(mlWalletPageObjects.objItemNameVal(),"Item Name");
        mobileGeneralMethod.isVisible(mlWalletPageObjects.objItemDescriptVal(),"Item Description");
        mobileGeneralMethod.isVisible(mlWalletPageObjects.objBrandVal(),"Brand");
        mobileGeneralMethod.isVisible(mlWalletPageObjects.objModelNoVal(),"Mode Number");
        mobileGeneralMethod.isVisible(mlWalletPageObjects.objCategoryVal(),"Category");
        mobileGeneralMethod.isVisible(mlWalletPageObjects.objItemPriceVal(),"Item Price");
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.isVisible(mlWalletPageObjects.objShipDetailLabel(),"Ship Detail");
        mobileGeneralMethod.isVisible(mlWalletPageObjects.objOriginBranchVal(),"Origin Branch");
        mobileGeneralMethod.isVisible(mlWalletPageObjects.objConfirmInvitationBtn(),"Confirm Invitation");
        mobileGeneralMethod.isVisible(mlWalletPageObjects.objBacksBtn(),"Back Button");
    }
    public void FillItemInformation() throws Exception{
        mobileGeneralMethod.type(mlWalletPageObjects.objItemNameTxtBx(),"Type Item Name",reader.getFillInfo("ValidItemName"));
        mobileGeneralMethod.type(mlWalletPageObjects.objItemDescriptTxtBx(), "Type Item Description",reader.getFillInfo("ValidItemDescript"));
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.type(mlWalletPageObjects.objBrandTxtBx(), "Type Brand",reader.getFillInfo("ValidBrand"));
        mobileGeneralMethod.type(mlWalletPageObjects.objModelNoTxtbox(), "Type Model No",reader.getFillInfo("ValidModelNo"));
        mobileGeneralMethod.type(mlWalletPageObjects.objItemQuantityTxtbx(), "Type Item Quantity",reader.getInputNum("ValidItemQuantity").toString());
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.tap(mlWalletPageObjects.objCategoryDropDownlist(),"Category DropDownlist");
        mobileGeneralMethod.waitSleep(5000);
        mobileGeneralMethod.tap(mlWalletPageObjects.objClothesTxtBtn(),"Select Clothes");
        mobileGeneralMethod.type(mlWalletPageObjects.objItemPriceTxtbx(), "Type Item Price",reader.getInputNum("ValidItemPrice").toString());
        mobileGeneralMethod.tap(mlWalletPageObjects.objWeightRangeDropDownList(),"Weight Range DropDownList");
        mobileGeneralMethod.waitSleep(5000);
        mobileGeneralMethod.tap(mlWalletPageObjects.obj0kgTxtBtn(), "Select 0 to 3 kg");
    }
    public void SSM_TC_07_Verify_seller_fill_up_the_Item_Information_Page_and_clicking_proceed_button_Invites_Page () throws Exception {
        login.loginWalletFullyTier();
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.tap(mlWalletPageObjects.objShopSafeIconBtn(), "Shop Safe Icon Button");
        mobileGeneralMethod.waitSleep(5000);
        mobileGeneralMethod.tap(mlWalletPageObjects.objInvitesTransactTxtBtn(),"View all Invites Text Button");
        mobileGeneralMethod.waitSleep(5000);
        if(mobileGeneralMethod.isVisible(mlWalletPageObjects.objFirstInTab(),"First in TAB")) {
            mobileGeneralMethod.tap(mlWalletPageObjects.objFirstInTab(), "New Invitation in Invites list");
            Camera();
            Camera();
            FillItemInformation();
            mobileGeneralMethod.verticalSwipe();
            DropOff();
            mobileGeneralMethod.waitSleep(5000);
            mobileGeneralMethod.tap(mlWalletPageObjects.objProceedsBtn(), "Proceeds Button");
            VerifyConfirmationPage();
            //mobileGeneralMethod.closeApp();
            //mobileGeneralMethod.startActivity();
            LoggingUtils.info("Verify seller fill up the Item Information Page and clicking proceed button Invites Page");
            ExtentReporter.logPass("SSM_TC_07", "To Verify seller fill up the Item Information Page and clicking proceed button Invites Page");
        }
        else{
            ExtentReporter.logFail("Shop Safe Page ", "Failed to Validate seller fill up the Item Information Page and clicking proceed button Invites Page");
            Assert.fail("Failed to Validate seller fill up the Item Information Page and clicking proceed button Invites Page");
        }
    }

    public void VerifyTransactionPage() throws Exception{
        mobileGeneralMethod.waitSleep(10000);
        mobileGeneralMethod.isVisible(mlWalletPageObjects.objSRFTN(),"RFTN");
        mobileGeneralMethod.isVisible(mlWalletPageObjects.objSellersDetailTransactLabel(),"Sellers Detail");
        mobileGeneralMethod.isVisible(mlWalletPageObjects.objSellersNameTransactVal(),"Sellers Name");
        mobileGeneralMethod.isVisible(mlWalletPageObjects.objSellersNoTransactVal(),"Sellers Number");
        mobileGeneralMethod.isVisible(mlWalletPageObjects.objBuyersDetailTransactLabel(),"Buyers Detail");
        mobileGeneralMethod.isVisible(mlWalletPageObjects.objBuyersNameTransactVal(),"Buyers Name");
        mobileGeneralMethod.isVisible(mlWalletPageObjects.objBuyersNoTransactVal(),"Buyers No");
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.isVisible(mlWalletPageObjects.objItemDetailsTransactLabel(),"Item Details");
        mobileGeneralMethod.isVisible(mlWalletPageObjects.objItemNameTransactVal(),"Item Name");
        mobileGeneralMethod.isVisible(mlWalletPageObjects.objItemDescriptTransactVal(),"Item Description");
        mobileGeneralMethod.isVisible(mlWalletPageObjects.objBrandTransactVal(),"Brand");
        mobileGeneralMethod.isVisible(mlWalletPageObjects.objModelNoTransactVal(),"Mode Number");
        mobileGeneralMethod.isVisible(mlWalletPageObjects.objCategoryTransactVal(),"Category");
        mobileGeneralMethod.isVisible(mlWalletPageObjects.objItemPriceTransactVal(),"Item Price");
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.isVisible(mlWalletPageObjects.objShipDetailTransactLabel(),"Ship Detail");
        mobileGeneralMethod.isVisible(mlWalletPageObjects.objOriginBranchTransactVal(),"Origin Branch");
        mobileGeneralMethod.isVisible(mlWalletPageObjects.objPictureTransact(),"Picture ");
    }

    public void SSM_TC_08_Verify_seller_fill_up_the_Item_Information_Page_and_clicking_proceed_button_Invites_Page () throws Exception {
        login.loginWalletFullyTier();
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.tap(mlWalletPageObjects.objShopSafeIconBtn(), "Shop Safe Icon Button");
        mobileGeneralMethod.waitSleep(5000);
        mobileGeneralMethod.tap(mlWalletPageObjects.objInvitesTransactTxtBtn(),"View all Invites Text Button");
        mobileGeneralMethod.waitSleep(5000);
        mobileGeneralMethod.tap(mlWalletPageObjects.objFirstInTab(),"New Invitation in Invites list");
        Camera();
        Camera();
        FillItemInformation();
        mobileGeneralMethod.verticalSwipe();
        DropOff();
        if( mobileGeneralMethod.isVisible(mlWalletPageObjects.objProceedsBtn(),"Show Proceeds Button")){
            mobileGeneralMethod.tap(mlWalletPageObjects.objProceedsBtn(),"Proceeds Button");
            mobileGeneralMethod.verticalSwipe();
            mobileGeneralMethod.verticalSwipe();
            mobileGeneralMethod.tap(mlWalletPageObjects.objConfirmInvitationBtn(),"Confirm Invitation");
            VerifyTransactionPage();
            //mobileGeneralMethod.closeApp();
            //mobileGeneralMethod.startActivity();
            LoggingUtils.info("Verify seller fill up the Item Information Page and clicking proceed button Invites Page");
            ExtentReporter.logPass("SSM_TC_08", "To Verify seller fill up the Item Information Page and clicking proceed button Invites Page");
        }
        else{
            ExtentReporter.logFail("Shop Safe Page ", "Failed to Validate seller fill up the Item Information Page and clicking proceed button Invites Page");
            Assert.fail("Failed to Validate seller fill up the Item Information Page and clicking proceed button Invites Page");
        }
    }

    public void validateBuyerOngoing() throws Exception{
        mobileGeneralMethod.waitSleep(8000);
        mobileGeneralMethod.isVisible(mlWalletPageObjects.objOngoingBuyerPicture(),"Buyer Picture");
        mobileGeneralMethod.isVisible(mlWalletPageObjects.objOngoingRFTN(),"Reference Number");
        mobileGeneralMethod.isVisible(mlWalletPageObjects.objOngoingellersDetailLabel(),"Seller Detail Label");
        mobileGeneralMethod.isVisible(mlWalletPageObjects.objOngoingSellersNameVal(),"Sellers Name");
        mobileGeneralMethod.isVisible(mlWalletPageObjects.objOngoingSellersNoVal(),"Sellers No");
        mobileGeneralMethod.isVisible(mlWalletPageObjects.objOngoingBuyersDetailLabel(),"Buyers Detail Label");
        mobileGeneralMethod.isVisible(mlWalletPageObjects.objOngoingBuyersNameVal(),"Buyers Name");
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.isVisible(mlWalletPageObjects.objOngoingBuyersNoVal(),"Buyers No");
        mobileGeneralMethod.isVisible(mlWalletPageObjects.objOngoingItemDetailsLabel(),"Item Details Label");
        mobileGeneralMethod.isVisible(mlWalletPageObjects.objOngoingItemNameVal(),"Item Name");
        mobileGeneralMethod.isVisible(mlWalletPageObjects.objOngoingItemDescriptVal(),"Item Description");
        mobileGeneralMethod.isVisible(mlWalletPageObjects.objOngoingBrandVal(),"Brand");
        mobileGeneralMethod.isVisible(mlWalletPageObjects.objOngoingModelNoVal(),"Model No");
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.isVisible(mlWalletPageObjects.objOngoingCategoryVal(),"Category");
        mobileGeneralMethod.isVisible(mlWalletPageObjects.objOngoingItemPriceVal(),"Item Price");
        mobileGeneralMethod.isVisible(mlWalletPageObjects.objOngoingChooseNearestBranchBtn(),"Choose Nearest Branch");
        mobileGeneralMethod.isVisible(mlWalletPageObjects.objOngoingProceedToReviewBtn(),"Proceed To Review Btn");
        mobileGeneralMethod.isVisible(mlWalletPageObjects.objOngoingCancelBtn(),"Cancel Btn");
    }

    public void validateSellerOngoing() throws Exception{
        mobileGeneralMethod.waitSleep(8000);
        mobileGeneralMethod.isVisible(mlWalletPageObjects.objOngoingWaitPaymentStatus(),"Waiting For Payment Status");
        mobileGeneralMethod.isVisible(mlWalletPageObjects.objOngoingRFTN(),"Reference Number");
        mobileGeneralMethod.isVisible(mlWalletPageObjects.objOngoingellersDetailLabel(),"Seller Detail Label");
        mobileGeneralMethod.isVisible(mlWalletPageObjects.objOngoingSellersNameVal(),"Sellers Name");
        mobileGeneralMethod.isVisible(mlWalletPageObjects.objOngoingSellersNoVal(),"Sellers No");
        mobileGeneralMethod.isVisible(mlWalletPageObjects.objOngoingBuyersDetailLabel(),"Buyers Detail Label");
        mobileGeneralMethod.isVisible(mlWalletPageObjects.objOngoingBuyersNameVal(),"Buyers Name");
        mobileGeneralMethod.isVisible(mlWalletPageObjects.objOngoingBuyersNoVal(),"Buyers No");
        mobileGeneralMethod.isVisible(mlWalletPageObjects.objOngoingItemDetailsLabel(),"Item Details");
        mobileGeneralMethod.isVisible(mlWalletPageObjects.objOngoingItemNameVal(),"Item Name");
        mobileGeneralMethod.isVisible(mlWalletPageObjects.objOngoingItemDescriptVal(),"Item Description");
        mobileGeneralMethod.isVisible(mlWalletPageObjects.objOngoingBrandVal(),"Brand");
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.isVisible(mlWalletPageObjects.objOngoingModelNoVal(),"Model No");
        mobileGeneralMethod.isVisible(mlWalletPageObjects.objOngoingCategoryVal(),"Category");
        mobileGeneralMethod.isVisible(mlWalletPageObjects.objOngoingItemPriceVal(),"Item Price");
        mobileGeneralMethod.isVisible(mlWalletPageObjects.objOngoingShipDetailLabel(),"Ship Detail");
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.isVisible(mlWalletPageObjects.objOngoingOriginBranchVal(),"Origin Branch");
        mobileGeneralMethod.isVisible(mlWalletPageObjects.objOngoingSellerPicture(),"Buyer Picture");
    }

    public void SSM_TC_09_Validate_Buyer_Ongoing_Transaction_Page() throws Exception {
        login.loginWalletBranchTier();
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.tap(mlWalletPageObjects.objShopSafeIconBtn(), "Shop Safe Icon Button");
        mobileGeneralMethod.waitSleep(3000);
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.waitSleep(5000);
        mobileGeneralMethod.tap(mlWalletPageObjects.objOngoingTransactTxtBtn(),"View all Invites Text Button");
        mobileGeneralMethod.waitSleep(5000);
        if(mobileGeneralMethod.isVisible(mlWalletPageObjects.objFirstInTab(),"New Invitation in Invites list")) {
            mobileGeneralMethod.tap(mlWalletPageObjects.objFirstInTab(), "New Invitation in Invites list");
            validateBuyerOngoing();
            LoggingUtils.info("View new invitations in Invites Page Success");
            ExtentReporter.logPass("SSM_TC_09", "To verify seller received invites click View Invitations Button in Invites Page");
        }
        else{
            ExtentReporter.logFail("Shop Safe Page ", "Failed to Validate seller received invites click View Invitations Button in Invites Page");
            Assert.fail("Failed to Validate Seller received invites click View Invitations Button in Invites Page");
        }
        //mobileGeneralMethod.closeApp();
        //mobileGeneralMethod.startActivity();
    }

    public void SSM_TC_10_Validate_Seller_Ongoing_Transaction_Page () throws Exception {
        login.loginWalletFullyTier();
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.tap(mlWalletPageObjects.objShopSafeIconBtn(), "Shop Safe Icon Button");
        mobileGeneralMethod.waitSleep(5000);
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.waitSleep(5000);
        mobileGeneralMethod.tap(mlWalletPageObjects.objOngoingTransactTxtBtn(), "View all Invites Text Button");
        mobileGeneralMethod.waitSleep(5000);
        if(mobileGeneralMethod.isVisible(mlWalletPageObjects.objFirstInTab(),"New Invitation in Invites list")) {
            mobileGeneralMethod.tap(mlWalletPageObjects.objFirstInTab(), "New Invitation in Invites list");
            validateSellerOngoing();
            LoggingUtils.info("View new invitations in Invites Page Success");
            ExtentReporter.logPass("SSM_TC_10", "To verify seller received invites click View Invitations Button in Invites Page");
        }
        else{
            ExtentReporter.logFail("Shop Safe Page ", "Failed to Validate seller received invites click View Invitations Button in Invites Page");
            Assert.fail("Failed to Validate seller received invites click View Invitations Button in Invites Page");
        }
        //mobileGeneralMethod.closeApp();

    }

    public void DropOffBuyer() throws Exception{
        mobileGeneralMethod.tap(mlWalletPageObjects.objOngoingChooseNearestBranchBtn(),"Nearest Drop Off GMap");
//        mobileGeneralMethod.tap(mlWalletPageObjects.objOngoingGmapWhileUSingAppBtn(),"Allow G Map");
        mobileGeneralMethod.waitSleep(5000);
        if(mobileGeneralMethod.isVisible(mlWalletPageObjects.objOngoingSelectNearestBtn(),"Near Appear")){
            mobileGeneralMethod.waitSleep(3000);
            mobileGeneralMethod.tap(mlWalletPageObjects.objOngoingSelectNearestBtn(), "Select Near");
        }
        mobileGeneralMethod.isVisible(mlWalletPageObjects.objOngoingBranchNameGMapVal(),"");
        mobileGeneralMethod.isVisible(mlWalletPageObjects.objOngoingBranchAddressGMapVal(),"");
        mobileGeneralMethod.tap(mlWalletPageObjects.objOngoingConfirmBranchBtn(),"Confirm Branch Button");
    }
    public void ValidatePayment() throws Exception{
        mobileGeneralMethod.waitSleep(5000);
        mobileGeneralMethod.isVisible(mlWalletPageObjects.objPaymentPicture(),"Picture");
        mobileGeneralMethod.isVisible(mlWalletPageObjects.objPaymentRFTN(),"RFTN");
        mobileGeneralMethod.isVisible(mlWalletPageObjects.objPaymentSellersNameVal(),"Sellers Name");
        mobileGeneralMethod.isVisible(mlWalletPageObjects.objPaymentSellersNoVal(),"Sellers No");
        mobileGeneralMethod.isVisible(mlWalletPageObjects.objPaymentBuyersDetailLabel(),"Buyers Detail Label");
        mobileGeneralMethod.isVisible(mlWalletPageObjects.objPaymentBuyersNameVal(),"Buyers Name");
        mobileGeneralMethod.isVisible(mlWalletPageObjects.objPaymentBuyersNoVal(),"Buyers No");
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.isVisible(mlWalletPageObjects.objPaymentItemDetailsLabel(),"Item Details");
        mobileGeneralMethod.isVisible(mlWalletPageObjects.objPaymentItemNameVal(),"Item Name");
        mobileGeneralMethod.isVisible(mlWalletPageObjects.objPaymentItemDescriptVal(),"Item Description");
        mobileGeneralMethod.isVisible(mlWalletPageObjects.objPaymentBrandVal(),"Brand");
        mobileGeneralMethod.isVisible(mlWalletPageObjects.objPaymentModelNoVal(),"Model No");
        mobileGeneralMethod.isVisible(mlWalletPageObjects.objPaymentCategoryVal(),"Category");
        mobileGeneralMethod.isVisible(mlWalletPageObjects.objPaymentItemPriceVal(),"Item Price");
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.isVisible(mlWalletPageObjects.objShippingFeeVal(),"Shipping Fee");
        mobileGeneralMethod.isVisible(mlWalletPageObjects.objReturnShippingDepositVal(),"Return Shipping Deposit");
        mobileGeneralMethod.isVisible(mlWalletPageObjects.objInsuranceFeeVal(),"Insurance Fee");
        mobileGeneralMethod.isVisible(mlWalletPageObjects.objServiceFeeVal(),"Service Fee");
        mobileGeneralMethod.isVisible(mlWalletPageObjects.objTotalAmountVal(),"Total Amount");
        mobileGeneralMethod.isVisible(mlWalletPageObjects.objShippingDetailsLabel(),"Shipping Details Label");
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.isVisible(mlWalletPageObjects.objPaymentOriginBranchVal(),"Origin Branch");
        mobileGeneralMethod.isVisible(mlWalletPageObjects.objPaymentTotalAmountVal(),"Total Amount");
        mobileGeneralMethod.isVisible(mlWalletPageObjects.objPaymentBackBtn(),"Back Btn");
        mobileGeneralMethod.tap(mlWalletPageObjects.objPaymentAmountBtn(),"Amount Btn");
        mobileGeneralMethod.waitSleep(5000);
    }
    public void SSM_TC_11_Verify_seller_fill_up_the_Item_Information_Page_and_clicking_proceed_button_Invites_Page () throws Exception {
        //mobileGeneralMethod.startActivity();
        login.loginWalletBranchTier();
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.tap(mlWalletPageObjects.objShopSafeIconBtn(), "Shop Safe Icon Button");
        mobileGeneralMethod.waitSleep(3000);
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.waitSleep(5000);
        mobileGeneralMethod.tap(mlWalletPageObjects.objOngoingTransactTxtBtn(),"View all Invites Text Button");
        mobileGeneralMethod.waitSleep(5000);
        mobileGeneralMethod.tap(mlWalletPageObjects.objFirstInTab(),"New Invitation in Invites list");
        mobileGeneralMethod.waitSleep(3000);
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.verticalSwipe();
        DropOffBuyer();
        mobileGeneralMethod.tap(mlWalletPageObjects.objOngoingProceedToReviewBtn(),"Proceed To Review Btn");
        mobileGeneralMethod.waitSleep(3000);
        if(mobileGeneralMethod.isVisible(mlWalletPageObjects.objTermsAndConditionsLabel(),"Terms And Conditions Label")) {
            mobileGeneralMethod.isVisible(mlWalletPageObjects.objTermsAndConditionsBackBtn(), "Back Btn");
            mobileGeneralMethod.tap(mlWalletPageObjects.objAcceptTermsAndConditionsBtn(), "Accept Btn");
            ValidatePayment();
            mobileGeneralMethod.waitSleep(10000);
            mobileGeneralMethod.isVisible(mlWalletPageObjects.objSuccessfullyPaidLabel(), "Successfully Paid Label");
            mobileGeneralMethod.tap(mlWalletPageObjects.objPaymentOkayBtn(), "Okay Btn");
            LoggingUtils.info("Verify seller fill up the Item Information Page and clicking proceed button Invites Page");
            ExtentReporter.logPass("SSM_TC_11", "To Verify seller fill up the Item Information Page and clicking proceed button Invites Page");
        }
        else{
            ExtentReporter.logFail("Shop Safe Page ", "Failed to Validate seller fill up the Item Information Page and clicking proceed button Invites Page");
            Assert.fail("Failed to Validate seller fill up the Item Information Page and clicking proceed button Invites Pagee");
        }
        //mobileGeneralMethod.closeApp();
    }
    public void validateSellerDropOffOngoing() throws Exception{
        mobileGeneralMethod.isVisible(mlWalletPageObjects.objOngoingellersDetailLabel(),"Seller Detail Label");
        mobileGeneralMethod.isVisible(mlWalletPageObjects.objOngoingSellersNameVal(),"Sellers Name");
        mobileGeneralMethod.isVisible(mlWalletPageObjects.objOngoingSellersNoVal(),"Sellers No");
        mobileGeneralMethod.isVisible(mlWalletPageObjects.objOngoingBuyersDetailLabel(),"Buyers Detail Label");
        mobileGeneralMethod.isVisible(mlWalletPageObjects.objOngoingBuyersNameVal(),"Buyers Name");
        mobileGeneralMethod.isVisible(mlWalletPageObjects.objOngoingBuyersNoVal(),"Buyers No");
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.isVisible(mlWalletPageObjects.objOngoingItemDetailsLabel(),"Item Details");
        mobileGeneralMethod.isVisible(mlWalletPageObjects.objOngoingItemNameVal(),"Item Name");
        mobileGeneralMethod.isVisible(mlWalletPageObjects.objOngoingItemDescriptVal(),"Item Description");
        mobileGeneralMethod.isVisible(mlWalletPageObjects.objOngoingBrandVal(),"Brand");
        mobileGeneralMethod.isVisible(mlWalletPageObjects.objOngoingModelNoVal(),"Model No");
        mobileGeneralMethod.isVisible(mlWalletPageObjects.objOngoingCategoryVal(),"Category");
        mobileGeneralMethod.isVisible(mlWalletPageObjects.objOngoingItemPriceVal(),"Item Price");
        mobileGeneralMethod.isVisible(mlWalletPageObjects.objFeesLabel(),"Fees Label");
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.isVisible(mlWalletPageObjects.objShippingFeeVal(),"Shipping Fee");
        mobileGeneralMethod.isVisible(mlWalletPageObjects.objReturnShippingDepositDropOffVal(),"Drop Off Fee");
        mobileGeneralMethod.isVisible(mlWalletPageObjects.objServiceFeeVal(),"Service Fee");
        mobileGeneralMethod.isVisible(mlWalletPageObjects.objInsuranceFeeVal(),"Insurance Fee");
        mobileGeneralMethod.isVisible(mlWalletPageObjects.objOngoingShipDetailLabel(),"Ship Detail Label");
        mobileGeneralMethod.isVisible(mlWalletPageObjects.objOngoingOriginBranchVal(),"Origin Branch");
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.isVisible(mlWalletPageObjects.objOngoingDestinationBranchVal(),"Destination Branch");
        mobileGeneralMethod.isVisible(mlWalletPageObjects.objOngoingSellerPicture(),"Buyer Picture");
        mobileGeneralMethod.isVisible(mlWalletPageObjects.objOngoingCancelBtn(),"Cancel Transaction");
    }
    public void SSM_TC_12_Verify_seller_Paid_Item_Transaction_Drop_off_Status_Invites_Page () throws Exception {
        //mobileGeneralMethod.startActivity();
        login.loginWalletBranchTier();
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.tap(mlWalletPageObjects.objShopSafeIconBtn(), "Shop Safe Icon Button");
        mobileGeneralMethod.waitSleep(3000);
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.waitSleep(5000);
        mobileGeneralMethod.tap(mlWalletPageObjects.objOngoingTransactTxtBtn(),"View all Invites Text Button");
        mobileGeneralMethod.waitSleep(5000);
        if(mobileGeneralMethod.isVisible(mlWalletPageObjects.objFirstInTab(),"New Invitation in Invites list")) {
            mobileGeneralMethod.tap(mlWalletPageObjects.objFirstInTab(), "New Invitation in Invites list");
            mobileGeneralMethod.waitSleep(5000);
            mobileGeneralMethod.isVisible(mlWalletPageObjects.objOngoingDropOffStatus(),"Drop Off Status");
            mobileGeneralMethod.isVisible(mlWalletPageObjects.objDropOffRFTN(),"Reference Number");
            String kptnText = (mlWalletPageObjects.objDropOffRFTN().getText());
            List<String> kptnValues = Collections.singletonList(kptnText);
            yamlReader.writeKptnShopSafeData(kptnValues);
            validateSellerDropOffOngoing();

            LoggingUtils.info("Verify seller Paid Item Transaction Drop off Status in Invites Page");
            ExtentReporter.logPass("SSM_TC_12", "Verify seller Paid Item Transaction Drop off Status in Invites Page");
        }
        else{
            ExtentReporter.logFail("Shop Safe Page ", "Failed to seller Paid Item Transaction Drop off Status in Invites Page");
            Assert.fail("Failed to Validate seller Paid Item Transaction Drop off Status in Invites Page");
        }
        //mobileGeneralMethod.closeApp();
        //mobileGeneralMethod.startActivity();
    }

    public void validateCancelledTransactions() throws Exception{

        mobileGeneralMethod.isVisible(mlWalletPageObjects.objCancelledStatusLabel(),"Cancelled Status");
        mobileGeneralMethod.isVisible(mlWalletPageObjects.objCancelledRFTN(),"Reference Number");
        mobileGeneralMethod.isVisible(mlWalletPageObjects.objCancelledellersDetailLabel(),"Seller Detail Label");
        mobileGeneralMethod.isVisible(mlWalletPageObjects.objCancelledSellersNameVal(),"Sellers Name");
        mobileGeneralMethod.isVisible(mlWalletPageObjects.objCancelledSellersNoVal(),"Sellers No");
        mobileGeneralMethod.isVisible(mlWalletPageObjects.objCancelledBuyersDetailLabel(),"Buyers Detail Label");
        mobileGeneralMethod.isVisible(mlWalletPageObjects.objCancelledBuyersNameVal(),"Buyers Name");
        mobileGeneralMethod.isVisible(mlWalletPageObjects.objCancelledBuyersNoVal(),"Buyers No");
        mobileGeneralMethod.isVisible(mlWalletPageObjects.objCancelledItemDetailsLabel(),"Item Details");
        mobileGeneralMethod.isVisible(mlWalletPageObjects.objCancelledItemNameVal(),"Item Name");
        mobileGeneralMethod.isVisible(mlWalletPageObjects.objCancelledItemDescriptVal(),"Item Description");
        mobileGeneralMethod.isVisible(mlWalletPageObjects.objCancelledBrandVal(),"Brand");
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.isVisible(mlWalletPageObjects.objCancelledModelNoVal(),"Model No");
        mobileGeneralMethod.isVisible(mlWalletPageObjects.objCancelledCategoryVal(),"Category");
        mobileGeneralMethod.isVisible(mlWalletPageObjects.objCancelledItemPriceVal(),"Item Price");
        mobileGeneralMethod.isVisible(mlWalletPageObjects.objFeesLabel(),"Fees Label");
        mobileGeneralMethod.isVisible(mlWalletPageObjects.objShippingFeeVal(),"Shipping Fee");
        mobileGeneralMethod.isVisible(mlWalletPageObjects.objReturnShippingDepositDropOffVal(),"Drop Off Fee");
        mobileGeneralMethod.isVisible(mlWalletPageObjects.objServiceFeeVal(),"Service Fee");
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.isVisible(mlWalletPageObjects.objInsuranceFeeVal(),"Insurance Fee");
        mobileGeneralMethod.isVisible(mlWalletPageObjects.objCancelledShipDetailLabel(),"Ship Detail Label");
        mobileGeneralMethod.isVisible(mlWalletPageObjects.objCancelledOriginBranchVal(),"Origin Branch");
        mobileGeneralMethod.isVisible(mlWalletPageObjects.objCancelledDestinationBranchVal(),"Destination Branch");
        mobileGeneralMethod.isVisible(mlWalletPageObjects.objCancelledSellerPicture(),"Buyer Picture");
    }

    public void SSM_TC_13_Cancelled_Transactions () throws Exception {
        login.loginWalletBranchTier();
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.tap(mlWalletPageObjects.objShopSafeIconBtn(), "Shop Safe Icon Button");
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.tap(mlWalletPageObjects.objCancelTransactTxtBtn(),"See More Text Button");
        mobileGeneralMethod.waitSleep(3000);
        if(mobileGeneralMethod.isVisible(mlWalletPageObjects.objFirstInTab(),"New Invitation in Invites list")) {
            mobileGeneralMethod.tap(mlWalletPageObjects.objFirstInTab(),"New Invitation in Invites list");
            validateCancelledTransactions();
            LoggingUtils.info("Verify Cancelled Transactions Paqe Success");
            ExtentReporter.logPass("SSM_TC_13", "To Verify Cancelled Transactions");
        }
        else{
            ExtentReporter.logFail("Shop Safe Page ", "Failed to Validate Cancelled Transactions");
            Assert.fail("Failed to Validate Cancelled Transactions");
        }
        //mobileGeneralMethod.closeApp();
        //mobileGeneralMethod.startActivity();
    }

    public void validateBuyerReadyForPickUpOngoing() throws Exception{
        mobileGeneralMethod.waitSleep(5000);
        mobileGeneralMethod.isVisible(mlWalletPageObjects.objReadyForPickUPStatus(),"Drop Off Status");
        mobileGeneralMethod.isVisible(mlWalletPageObjects.objReadyFOrPickUPRFTN(),"Reference Number");
        mobileGeneralMethod.isVisible(mlWalletPageObjects.objOngoingellersDetailLabel(),"Seller Detail Label");
        mobileGeneralMethod.isVisible(mlWalletPageObjects.objOngoingSellersNameVal(),"Sellers Name");
        mobileGeneralMethod.isVisible(mlWalletPageObjects.objOngoingSellersNoVal(),"Sellers No");
        mobileGeneralMethod.isVisible(mlWalletPageObjects.objOngoingBuyersDetailLabel(),"Buyers Detail Label");
        mobileGeneralMethod.isVisible(mlWalletPageObjects.objOngoingBuyersNameVal(),"Buyers Name");
        mobileGeneralMethod.isVisible(mlWalletPageObjects.objOngoingBuyersNoVal(),"Buyers No");
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.isVisible(mlWalletPageObjects.objOngoingItemDetailsLabel(),"Item Details");
        mobileGeneralMethod.isVisible(mlWalletPageObjects.objOngoingItemNameVal(),"Item Name");
        mobileGeneralMethod.isVisible(mlWalletPageObjects.objOngoingItemDescriptVal(),"Item Description");
        mobileGeneralMethod.isVisible(mlWalletPageObjects.objOngoingBrandVal(),"Brand");
        mobileGeneralMethod.isVisible(mlWalletPageObjects.objOngoingModelNoVal(),"Model No");
        mobileGeneralMethod.isVisible(mlWalletPageObjects.objOngoingCategoryVal(),"Category");
        mobileGeneralMethod.isVisible(mlWalletPageObjects.objOngoingItemPriceVal(),"Item Price");
        mobileGeneralMethod.isVisible(mlWalletPageObjects.objFeesLabel(),"Fees Label");
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.isVisible(mlWalletPageObjects.objShippingFeeVal(),"Shipping Fee");
        mobileGeneralMethod.isVisible(mlWalletPageObjects.objReturnShippingDepositDropOffVal(),"Drop Off Fee");
        mobileGeneralMethod.isVisible(mlWalletPageObjects.objServiceFeeVal(),"Service Fee");
        mobileGeneralMethod.isVisible(mlWalletPageObjects.objInsuranceFeeVal(),"Insurance Fee");
        mobileGeneralMethod.isVisible(mlWalletPageObjects.objOngoingShipDetailLabel(),"Ship Detail Label");
        mobileGeneralMethod.isVisible(mlWalletPageObjects.objOngoingOriginBranchVal(),"Origin Branch");
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.isVisible(mlWalletPageObjects.objOngoingDestinationBranchVal(),"Destination Branch");
        mobileGeneralMethod.isVisible(mlWalletPageObjects.objOngoingSellerPicture(),"Buyer Picture");
        mobileGeneralMethod.isVisible(mlWalletPageObjects.objOngoingDeclineItem(),"Decline Item Btn");
        mobileGeneralMethod.isVisible(mlWalletPageObjects.objOngoingAcceptItem(),"Accept Item Btn");
        mobileGeneralMethod.tap(mlWalletPageObjects.objOngoingAcceptItem(),"Accept Item Btn");
        mobileGeneralMethod.waitSleep(8000);
        mobileGeneralMethod.isVisible(mlWalletPageObjects.objSuccessfulAcceptedLabel(),"Successful Accept Label");
        mobileGeneralMethod.isVisible(mlWalletPageObjects.objSuccessfulOkayBtn(),"Successful Okay Btn");
        mobileGeneralMethod.tap(mlWalletPageObjects.objSuccessfulOkayBtn(),"Click Successful Okay Btn");
    }
    public void SSM_TC_14_Verify_buyer_Receive_Item_Ready_For_Pick_Up() throws Exception {
        login.loginWalletBranchTier();
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.tap(mlWalletPageObjects.objShopSafeIconBtn(), "Shop Safe Icon Button");
        mobileGeneralMethod.waitSleep(3000);
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.waitSleep(5000);
        mobileGeneralMethod.tap(mlWalletPageObjects.objOngoingTransactTxtBtn(),"View all Invites Text Button");
        mobileGeneralMethod.waitSleep(8000);
        if(mobileGeneralMethod.isVisible(mlWalletPageObjects.objFirstInTab(),"New Invitation in Invites list")) {
            mobileGeneralMethod.tap(mlWalletPageObjects.objFirstInTab(), "New Invitation in Invites list");
            validateBuyerReadyForPickUpOngoing();
            //Back to Web
            LoggingUtils.info("Buyer Receive Item Ready For PickUp Success");
            ExtentReporter.logPass("SSM_TC_14", "To Verify Buyer Receive Item Ready For PickUp Success");
        }
        else{
            ExtentReporter.logFail("Shop Safe Page ", "Failed to Validate Buyer Receive Item Ready For PickUp");
            Assert.fail("Failed to Validate Buyer Receive Item Ready For PickUp");
        }
        //mobileGeneralMethod.closeApp();
        //mobileGeneralMethod.startActivity();
    }

    public void validateSuccessfulTransaction() throws Exception {
        mobileGeneralMethod.waitSleep(5000);
        mobileGeneralMethod.isVisible(mlWalletPageObjects.objCompleteStatus(), "Complete Status");
        mobileGeneralMethod.isVisible(mlWalletPageObjects.objCompleteRFTN(), "Reference Number");
        mobileGeneralMethod.isVisible(mlWalletPageObjects.objOngoingellersDetailLabel(), "Seller Detail Label");
        mobileGeneralMethod.isVisible(mlWalletPageObjects.objOngoingSellersNameVal(), "Sellers Name");
        mobileGeneralMethod.isVisible(mlWalletPageObjects.objOngoingSellersNoVal(), "Sellers No");
        mobileGeneralMethod.isVisible(mlWalletPageObjects.objOngoingBuyersDetailLabel(), "Buyers Detail Label");
        mobileGeneralMethod.isVisible(mlWalletPageObjects.objOngoingBuyersNameVal(), "Buyers Name");
        mobileGeneralMethod.isVisible(mlWalletPageObjects.objOngoingBuyersNoVal(), "Buyers No");
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.isVisible(mlWalletPageObjects.objOngoingItemDetailsLabel(), "Item Details");
        mobileGeneralMethod.isVisible(mlWalletPageObjects.objOngoingItemNameVal(), "Item Name");
        mobileGeneralMethod.isVisible(mlWalletPageObjects.objOngoingItemDescriptVal(), "Item Description");
        mobileGeneralMethod.isVisible(mlWalletPageObjects.objOngoingBrandVal(), "Brand");
        mobileGeneralMethod.isVisible(mlWalletPageObjects.objOngoingModelNoVal(), "Model No");
        mobileGeneralMethod.isVisible(mlWalletPageObjects.objOngoingCategoryVal(), "Category");
        mobileGeneralMethod.isVisible(mlWalletPageObjects.objOngoingItemPriceVal(), "Item Price");
        mobileGeneralMethod.isVisible(mlWalletPageObjects.objFeesLabel(), "Fees Label");
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.isVisible(mlWalletPageObjects.objShippingFeeVal(), "Shipping Fee");
        mobileGeneralMethod.isVisible(mlWalletPageObjects.objReturnShippingDepositDropOffVal(), "Drop Off Fee");
        mobileGeneralMethod.isVisible(mlWalletPageObjects.objServiceFeeVal(), "Service Fee");
        mobileGeneralMethod.isVisible(mlWalletPageObjects.objInsuranceFeeVal(), "Insurance Fee");
        mobileGeneralMethod.isVisible(mlWalletPageObjects.objOngoingShipDetailLabel(), "Ship Detail Label");
        mobileGeneralMethod.isVisible(mlWalletPageObjects.objOngoingOriginBranchVal(), "Origin Branch");
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.isVisible(mlWalletPageObjects.objOngoingDestinationBranchVal(), "Destination Branch");
        mobileGeneralMethod.isVisible(mlWalletPageObjects.objOngoingSellerPicture(), "Buyer Picture");
    }
    public void SSM_TC_15_Verify_buyer_and_Seller_Successful_Transaction() throws Exception {
        login.loginWalletBranchTier();
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.tap(mlWalletPageObjects.objShopSafeIconBtn(), "Shop Safe Icon Button");
        mobileGeneralMethod.waitSleep(3000);
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.waitSleep(5000);
        mobileGeneralMethod.tap(mlWalletPageObjects.objCompleteTransactTxtBtn(),"View all Invites Text Button");
        mobileGeneralMethod.waitSleep(5000);
        if(mobileGeneralMethod.isVisible(mlWalletPageObjects.objFirstInTab(),"New Invitation in Invites list")) {
            mobileGeneralMethod.tap(mlWalletPageObjects.objFirstInTab(), "New Invitation in Invites list");
            validateSuccessfulTransaction();
            //Back to Web

            LoggingUtils.info("Buyer and Seller Successful Transaction");
            ExtentReporter.logPass("SSM_TC_15", "To Buyer and Seller Successful Transaction");
        }
        else{
            ExtentReporter.logFail("Shop Safe Page ", "Failed to Validate To Buyer and Seller Successful Transaction");
            Assert.fail("Failed to To Buyer and Seller Successful Transaction");
        }
    }


//    public void Shop_Safe_Successful_Transaction_SSM_TC_00() throws Exception {
//        ExtentReporter.HeaderChildNode("To verify enter valid seller number in Create Transaction Page");
//        login.loginWalletBranchTier();
//         mobileGeneralMethod.waitSleep(1000);
//        mobileGeneralMethod.tap(mlWalletPageObjects.objShopSafeIconBtn(), "Shop Safe Icon Button");
//        mobileGeneralMethod.tap(mlWalletPageObjects.objStartTransactBtn(), "Start Transaction Button");
//        mobileGeneralMethod.type(mlWalletPageObjects.objSellerNoTxtbx(), prop.getproperty("VaildShopSafeNumber"), "Type Valid Number");
//        mobileGeneralMethod.tap(mlWalletPageObjects.objInviteSellerBtn(), "Invite Seller Button");
//        if (mobileGeneralMethod.isVisible(mlWalletPageObjects.objSuccessfInviteLabel(), "Successful Invite")) {
//            mobileGeneralMethod.tap(mlWalletPageObjects.objOkayBtn(), "Okay Button");
//            mobileGeneralMethod.tap(mlWalletPageObjects.objBackBtn(), "Back Button");
//        }
//        shopSafeLogout();
//        login.loginWalletFullyTier();
//         mobileGeneralMethod.waitSleep(1000);
//        mobileGeneralMethod.tap(mlWalletPageObjects.objShopSafeIconBtn(), "Shop Safe Icon Button");
//        mobileGeneralMethod.tap(mlWalletPageObjects.objInvitesTransactTxtBtn(), "View all Invites Text Button");
//         mobileGeneralMethod.waitSleep(3000);
//        mobileGeneralMethod.isVisible(mlWalletPageObjects.objFirstInTab(), "New Invitation in Invites list");
//        mobileGeneralMethod.tap(mlWalletPageObjects.objFirstInTab(), "New Invitation in Invites list");
//        Camera();
//        mobileGeneralMethod.verticalSwipe();
//        Camera();
//        FillItemInformation();
//         mobileGeneralMethod.waitSleep(1000);
//        mobileGeneralMethod.verticalSwipe();
//        DropOff();
//        mobileGeneralMethod.verticalSwipe();
//         mobileGeneralMethod.waitSleep(1000);
//        mobileGeneralMethod.tap(mlWalletPageObjects.objProceedsBtn(), "Proceeds Button");
//        Swipe("UP", 4);
//         mobileGeneralMethod.waitSleep(1000);
//        mobileGeneralMethod.tap(mlWalletPageObjects.objConfirmInvitationBtn(), "Confirm Invitation");
//        Swipe("UP", 4);
//        mobileGeneralMethod.tap(mlWalletPageObjects.objBackBtn(), "Okay Button");
//        mobileGeneralMethod.tap(mlWalletPageObjects.objBackBtn(), "Back Button");
//         mobileGeneralMethod.waitSleep(3000);
//        if(mobileGeneralMethod.isVisible(mlWalletPageObjects.objBackBtn)) {
//             mobileGeneralMethod.tap(mlWalletPageObjects.objBackBtn(), "Back Button");
//        }
//        shopSafeLogout();
//        login.loginWalletBranchTier();
//         mobileGeneralMethod.waitSleep(1000);
//        mobileGeneralMethod.tap(mlWalletPageObjects.objShopSafeIconBtn(), "Shop Safe Icon Button");
//         mobileGeneralMethod.waitSleep(1000);
//        mobileGeneralMethod.verticalSwipe();
//        mobileGeneralMethod.tap(mlWalletPageObjects.objOngoingTransactTxtBtn(),"View all Invites Text Button");
//         mobileGeneralMethod.waitSleep(3000);
//        mobileGeneralMethod.tap(mlWalletPageObjects.objFirstInTab(),"New Invitation in Invites list");
//        Swipe("UP", 4);
//        DropOffBuyer();
//        mobileGeneralMethod.tap(mlWalletPageObjects.objOngoingProceedToReviewBtn(),"Proceed To Review Btn");
//        mobileGeneralMethod.tap(mlWalletPageObjects.objAcceptTermsAndConditionsBtn(),"Accept Btn");
//        Swipe("UP", 4);
//        mobileGeneralMethod.tap(mlWalletPageObjects.objPaymentAmountBtn(),"Amount Btn");
//        mobileGeneralMethod.isVisible(mlWalletPageObjects.objSuccessfullyPaidLabel(),"Successfully Paid Label");
//        mobileGeneralMethod.tap(mlWalletPageObjects.objPaymentOkayBtn(),"Okay Btn");
//         mobileGeneralMethod.waitSleep(3000);
//        mobileGeneralMethod.tap(mlWalletPageObjects.objFirstInTab(),"New Invitation in Invites list");
//        mobileGeneralMethod.isVisible(mlWalletPageObjects.objOngoingDropOffStatus(),"Drop Off Status");
//        mobileGeneralMethod.isVisible(mlWalletPageObjects.objDropOffRFTN(),"Reference Number");
//
//        LoggingUtils.info("Redirect to Shop Safe Page Navigation Success");
//        ExtentReporter.logPass("SSM_TC_02", "To verify click Shop Safe button Redirect to Shop Safe Page");
//    }












    //--------------------Negative Test--------------------
    public void SSM_TC_100_Validate_back_button_to_Shop_Safe_Page_back_to_Dashboard() throws Exception {
        login.loginWalletBranchTier();
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.tap(mlWalletPageObjects.objShopSafeIconBtn(), "Shop Safe Icon Button");
        mobileGeneralMethod.tap(mlWalletPageObjects.objBackBtn(), "Back Button");
        mobileGeneralMethod.isVisible(mlWalletPageObjects.objEyeIcon(),"Eye Icon");
        mobileGeneralMethod.tap(mlWalletPageObjects.objEyeIcon(),"Eye Icon");
        mobileGeneralMethod.isVisible(mlWalletPageObjects.objAvailableBalance()," Available Text");
        LoggingUtils.info("Redirect back to Dashboard Page Navigation Success");
        ExtentReporter.logPass("SSM_TC_03", "Validate back button to Shop Safe Page back to Dashboard");
    }
    public void SSM_TC_101_Validate_back_button_to_Create_Transaction_Page_back_to_Shop_Safe_page() throws Exception {
        login.loginWalletBranchTier();
         mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.tap(mlWalletPageObjects.objShopSafeIconBtn(), "Shop Safe Icon Button");
        mobileGeneralMethod.tap(mlWalletPageObjects.objStartTransactBtn(), "Start Transaction Button");
        mobileGeneralMethod.tap(mlWalletPageObjects.objBackBtn(), "Back Button");
        mobileGeneralMethod.isVisible(mlWalletPageObjects.objShopSafeLabel(), "Shop Safe Label");
        mobileGeneralMethod.isVisible(mlWalletPageObjects.objStartTransactBtn(), "Start Transaction Button");
        LoggingUtils.info("Redirect back to Shop Safe Page Navigation Success");
        ExtentReporter.logPass("SSM_TC_03", "Validate back button to Create Transaction Page back to Shop Safe page");
    }
    public void SSM_TC_102_Validate_back_button_to_Invites_Page_back_to_Shop_Safe_page() throws Exception {
        login.loginWalletBranchTier();
         mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.tap(mlWalletPageObjects.objShopSafeIconBtn(), "Shop Safe Icon Button");
        mobileGeneralMethod.tap(mlWalletPageObjects.objInvitesTransactTxtBtn(), "View All Invites Button");
        mobileGeneralMethod.tap(mlWalletPageObjects.objBackBtn(), "Back Button");
        mobileGeneralMethod.isVisible(mlWalletPageObjects.objShopSafeLabel(), "Shop Safe Label");
        LoggingUtils.info("Redirect back to Shop Safe Page Navigation Success");
        ExtentReporter.logPass("SSM_TC_03", "Validate back button to Invites Page back to Shop Safe page");
    }

    public void SSM_TC_103_Validate_back_button_to_Invitation_Request_back_to_Shop_Invites_Page() throws Exception {
        login.loginWalletBranchTier();
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.tap(mlWalletPageObjects.objShopSafeIconBtn(), "Shop Safe Icon Button");
        mobileGeneralMethod.tap(mlWalletPageObjects.objInvitesTransactTxtBtn(), "View All Invites Button");
        mobileGeneralMethod.waitSleep(3000);
        mobileGeneralMethod.tap(mlWalletPageObjects.objFirstInTab(),"New Invitation");
        mobileGeneralMethod.waitSleep(3000);
        mobileGeneralMethod.tap(mlWalletPageObjects.objBackBtn(), "Back Button");
        mobileGeneralMethod.isVisible(mlWalletPageObjects.objViewAllInvitation(), "View All Invitation Label");
        LoggingUtils.info("Redirect back to Invites Page Navigation Success");
        ExtentReporter.logPass("SSM_TC_03", "Validate back button to Invitation Request back to Invites Page");
    }

    public void SSM_TC_104_Validate_back_button_to_Shop_Ongoing_Transaction_Page_back_to_Shop_Safe_Page() throws Exception {
        login.loginWalletBranchTier();
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.tap(mlWalletPageObjects.objShopSafeIconBtn(), "Shop Safe Icon Button");
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.tap(mlWalletPageObjects.objOngoingTransactTxtBtn(), "View All Invites Button");
        mobileGeneralMethod.tap(mlWalletPageObjects.objBackBtn(), "Back Button");
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.isVisible(mlWalletPageObjects.objShopSafeLabel(), "Shop Safe Label");
        mobileGeneralMethod.isVisible(mlWalletPageObjects.objStartTransactBtn(), "Start Transaction Button");
        LoggingUtils.info("Redirect back to Dashboard Page Navigation Success");
        ExtentReporter.logPass("SSM_TC_03", "Validate back button to Ongoing Transaction Page back to Shop Safe Page");
    }
    //----------New
    public void SSM_TC_105_Verify_seller_Cancelled_Invites_Page () throws Exception {
        login.loginWalletBranchTier();
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.tap(mlWalletPageObjects.objShopSafeIconBtn(), "Shop Safe Icon Button");
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.tap(mlWalletPageObjects.objOngoingTransactTxtBtn(),"View all Invites Text Button");
        mobileGeneralMethod.waitSleep(3000);
        mobileGeneralMethod.tap(mlWalletPageObjects.objFirstInTab(),"New Invitation in Invites list");
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.tap(mlWalletPageObjects.objOngoingCancelBtn(),"Click Cancel Transaction");
        mobileGeneralMethod.isVisible(mlWalletPageObjects.objCancelModalLabel(), "Cancelled Modal Label");
        mobileGeneralMethod.tap(mlWalletPageObjects.objPaymentOkayBtn(),"Click Okay Button");
        mobileGeneralMethod.isVisible(mlWalletPageObjects.objSuccessfCancelledLabel(), "Cancelled Label");
        mobileGeneralMethod.tap(mlWalletPageObjects.objPaymentOkayBtn(),"Click Okay Button");

        LoggingUtils.info("View new invitations in Invites Page Success");
        ExtentReporter.logPass("SSM_TC_05", "To verify seller received invites click View Invitations Button in Invites Page");
    }
    //----------New
    public void SSM_TC_106_Verify_seller_Cancelled_DropOff_Invites_Page () throws Exception {
        login.loginWalletBranchTier();
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.tap(mlWalletPageObjects.objShopSafeIconBtn(), "Shop Safe Icon Button");
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.tap(mlWalletPageObjects.objOngoingTransactTxtBtn(),"View all Invites Text Button");
        mobileGeneralMethod.waitSleep(3000);
        mobileGeneralMethod.tap(mlWalletPageObjects.objFirstInTab(),"New Invitation in Invites list");
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.isVisible(mlWalletPageObjects.objSuccessfCancelledLabel(), "Cancelled Label");
        mobileGeneralMethod.tap(mlWalletPageObjects.objPaymentOkayBtn(),"Click Okay Button");

        LoggingUtils.info("View new invitations in Invites Page Success");
        ExtentReporter.logPass("SSM_TC_05", "To verify seller received invites click View Invitations Button in Invites Page");
    }

    //--------------------Invalid Input textbox
    public void SSM_TC_150_Validate_enter_characters_seller_number_in_Create_Transaction_Page() throws Exception {
        login.loginWalletBranchTier();
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.tap(mlWalletPageObjects.objShopSafeIconBtn(), "Shop Safe Icon Button");
        mobileGeneralMethod.tap(mlWalletPageObjects.objStartTransactBtn(), "Start Transaction Button");
        mobileGeneralMethod.type(mlWalletPageObjects.objSellerNoTxtbx(), prop.getproperty("CharacterNumber"), "Enter Character");
        mobileGeneralMethod.tap(mlWalletPageObjects.objInviteSellerBtn(), "Invite Seller Button");
        mobileGeneralMethod.assertionValidation(mobileGeneralMethod.getText(mlWalletPageObjects.objGetErrMsg(prop.getproperty("InvalidMobileNum"))), prop.getproperty("InvalidMobileNum"));
        LoggingUtils.info("Prompt Display should be Mobile number is invalid");
        ExtentReporter.logPass("SSM_TC_03", "Validate enter characters seller number in Create Transaction Page");
    }

    public void SSM_TC_151_Validate_enter_decimal_seller_number_in_Create_Transaction_Page() throws Exception {
        login.loginWalletBranchTier();
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.tap(mlWalletPageObjects.objShopSafeIconBtn(), "Shop Safe Icon Button");
        mobileGeneralMethod.tap(mlWalletPageObjects.objStartTransactBtn(), "Start Transaction Button");
        mobileGeneralMethod.type(mlWalletPageObjects.objSellerNoTxtbx(), prop.getproperty("DecimalNumber"), "Enter Decimal");
        mobileGeneralMethod.tap(mlWalletPageObjects.objInviteSellerBtn(), "Invite Seller Button");
        mobileGeneralMethod.assertionValidation(mobileGeneralMethod.getText(mlWalletPageObjects.objGetErrMsg(prop.getproperty("InvalidMobileNum"))), prop.getproperty("InvalidMobileNum"));
        LoggingUtils.info("Prompt Display should be Mobile number is invalid");
        ExtentReporter.logPass("SSM_TC_03", "Validate enter decimal seller number in Create Transaction Page");
    }

    public void SSM_TC_152_Validate_enter_empty_seller_number_in_Create_Transaction_Page() throws Exception {
        login.loginWalletBranchTier();
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.tap(mlWalletPageObjects.objShopSafeIconBtn(), "Shop Safe Icon Button");
        mobileGeneralMethod.tap(mlWalletPageObjects.objStartTransactBtn(), "Start Transaction Button");
        mobileGeneralMethod.tap(mlWalletPageObjects.objInviteSellerBtn(), "Invite Seller Button");
        mobileGeneralMethod.assertionValidation(mobileGeneralMethod.getText(mlWalletPageObjects.objGetErrMsg(prop.getproperty("EmptyMobileNum"))), prop.getproperty("EmptyMobileNum"));
        LoggingUtils.info("Prompt Display should be Mobile number is required");
        ExtentReporter.logPass("SSM_TC_03", "Validate enter empty seller number in Create Transaction Page");
    }

    public String trimKPTN(String val){
        String prefix="KPTN: ";
        if(val.startsWith(prefix)){
            return val.substring(prefix.length());
        }
        return val;
    }
}
