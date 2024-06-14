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
        if(mobileGeneralMethod.isVisible(shopSafeObjects.objShopSafeIconBtn(), "Shop Safe Icon Button")) {
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
        mobileGeneralMethod.tap(shopSafeObjects.objShopSafeIconBtn(), "Shop Safe Icon Button");
        if(mobileGeneralMethod.isVisible(shopSafeObjects.objShopSafeLabel(),"Shop Safe label")){
            mobileGeneralMethod.isVisible(shopSafeObjects.objStartTransactBtn(),"Start Transaction Button");
            mobileGeneralMethod.isVisible(shopSafeObjects.objInvitesLabel(),"Invites Label");
            mobileGeneralMethod.isVisible(shopSafeObjects.objOngoingTransactLabel(),"Ongoing Transaction Label");
            mobileGeneralMethod.isVisible(shopSafeObjects.objCompletedTransactLabel(),"Completed Transaction Label");
            mobileGeneralMethod.verticalSwipe();
            mobileGeneralMethod.verticalSwipe();
            mobileGeneralMethod.verticalSwipe();
            mobileGeneralMethod.isVisible(shopSafeObjects.objCancelledTransactLabel(),"Cancelled Transact Label");
            mobileGeneralMethod.isVisible(shopSafeObjects.objReturnedTransactLabel(),"Returned Transaction Label");
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
        mobileGeneralMethod.tap(shopSafeObjects.objShopSafeIconBtn(), "Shop Safe Icon Button");
        mobileGeneralMethod.tap(shopSafeObjects.objStartTransactBtn(),"Start Transaction Button");
        if(mobileGeneralMethod.isVisible(shopSafeObjects.objCreateTransactLabel(),"Create Transact Label")){
            mobileGeneralMethod.isVisible(shopSafeObjects.objBackBtn(),"Back Button");
            mobileGeneralMethod.isVisible(shopSafeObjects.objSellerNoTxtbx(),"Seller Number Textbox");
            mobileGeneralMethod.isVisible(shopSafeObjects.objInviteSellerBtn(),"Invite Seller Button");
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
        mobileGeneralMethod.tap(shopSafeObjects.objShopSafeIconBtn(), "Shop Safe Icon Button");
        mobileGeneralMethod.tap(shopSafeObjects.objStartTransactBtn(),"Start Transaction Button");
        mobileGeneralMethod.isVisible(shopSafeObjects.objCreateTransactLabel(),"Start Transaction Button");
        mobileGeneralMethod.isVisible(shopSafeObjects.objBackBtn(),"Back Button");
        mobileGeneralMethod.isVisible(shopSafeObjects.objSellerNoTxtbx(),"Seller Number Textbox");
        mobileGeneralMethod.type(shopSafeObjects.objSellerNoTxtbx(),"Input Seller Number",reader.getNumberByTier("seller").toString());
        mobileGeneralMethod.tap(shopSafeObjects.objInviteSellerBtn(),"Invite Seller Button");
        mobileGeneralMethod.waitSleep(5000);
        if(mobileGeneralMethod.isVisible(shopSafeObjects.objSuccessfInviteLabel(),"Successful Label")){
            mobileGeneralMethod.isVisible(shopSafeObjects.objOkayBtn(),"Okay Button");
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
        mobileGeneralMethod.tap(shopSafeObjects.objShopSafeIconBtn(), "Shop Safe Icon Button");
        mobileGeneralMethod.waitSleep(5000);
        mobileGeneralMethod.tap(shopSafeObjects.objInvitesTransactTxtBtn(),"View all Invites Text Button");
        mobileGeneralMethod.waitSleep(5000);
        if(mobileGeneralMethod.isVisible(shopSafeObjects.objFirstInTab(),"First in TAB")){
            mobileGeneralMethod.tap(shopSafeObjects.objFirstInTab(),"Click New Invitation in Invites list");
            mobileGeneralMethod.waitSleep(3000);
            mobileGeneralMethod.isVisible(shopSafeObjects.objBuyerDetailsLabel(),"Buyer Details Label");
            mobileGeneralMethod.isVisible(shopSafeObjects.objBuyerNameVal(),"Buyer Name Value");
            mobileGeneralMethod.isVisible(shopSafeObjects.objBuyerNoVal(),"Buyer Number Value");
            mobileGeneralMethod.isVisible(shopSafeObjects.objSellerDetailsLabel(),"Seller Details Label");
            mobileGeneralMethod.isVisible(shopSafeObjects.objSellerNoVal(),"Seller Number Value");
            mobileGeneralMethod.isVisible(shopSafeObjects.objCancelInviteBtn(),"Cancel Invite Button");
            mobileGeneralMethod.isVisible(shopSafeObjects.objBackToHomesBtn(),"Back To Homes Button");
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
        mobileGeneralMethod.tap(shopSafeObjects.objShopSafeIconBtn(), "Shop Safe Icon Button");
        mobileGeneralMethod.waitSleep(3000);
        mobileGeneralMethod.tap(shopSafeObjects.objInvitesTransactTxtBtn(),"View all Invites Text Button");
        mobileGeneralMethod.waitSleep(5000);
        if(mobileGeneralMethod.isVisible(shopSafeObjects.objFirstInTab(),"First in TAB")){
            mobileGeneralMethod.tap(shopSafeObjects.objFirstInTab(),"New Invitation in Invites list");
            mobileGeneralMethod.waitSleep(5000);
            mobileGeneralMethod.isVisible(shopSafeObjects.objPicOfItemBtn(),"Picture Of Item Button");
            mobileGeneralMethod.isVisible(shopSafeObjects.objItemNameTxtBx(),"Item Name textbox");
            mobileGeneralMethod.isVisible(shopSafeObjects.objItemDescriptTxtBx(),"Item Description TextBox");
            mobileGeneralMethod.waitSleep(3000);
            mobileGeneralMethod.verticalSwipe();
            mobileGeneralMethod.waitSleep(3000);
            mobileGeneralMethod.isVisible(shopSafeObjects.objBrandTxtBx(),"Brand TextBox");
            mobileGeneralMethod.isVisible(shopSafeObjects.objModelNoTxtbox(),"Model No TextBox");
            mobileGeneralMethod.isVisible(shopSafeObjects.objItemQuantityTxtbx(),"Item Quantity Textbx");
            mobileGeneralMethod.isVisible(shopSafeObjects.objCategoryDropDownlist(),"Category DropDownlist");
            mobileGeneralMethod.isVisible(shopSafeObjects.objItemPriceTxtbx(),"Item Price Textbox");
            mobileGeneralMethod.verticalSwipe();
            mobileGeneralMethod.isVisible(shopSafeObjects.objWeightRangeDropDownList(),"Weight Range DropDownList");
            mobileGeneralMethod.isVisible(shopSafeObjects.objNearestDropOffGMap(),"Nearest Drop Off GMap");
            mobileGeneralMethod.verticalSwipe();
            mobileGeneralMethod.isVisible(shopSafeObjects.objProceedsBtn(),"Proceeds Button");
            mobileGeneralMethod.isVisible(shopSafeObjects.objDeclineBtn(),"Decline Button");
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
        mobileGeneralMethod.tap(shopSafeObjects.objPicOfItemBtn(),"Picture Of Item Button");
        mobileGeneralMethod.tap(shopSafeObjects.objCameraBtn(),"Camera Button");
        mobileGeneralMethod.waitSleep(3000);
//        if(mobileGeneralMethod.isVisible(shopSafeObjects.objAllowCameraWhileUsingAppBtn(),"Allow Camera Using App")){
//            mobileGeneralMethod.tap(shopSafeObjects.objAllowCameraWhileUsingAppBtn(),"Allow Camera");
//        }
        mobileGeneralMethod.tap(shopSafeObjects.objTakeAPicBtn(),"Take a Photo Button");
        mobileGeneralMethod.waitSleep(5000);
        mobileGeneralMethod.tap(shopSafeObjects.objTakeAPicOkBtn(),"Photo OK Button");
    }

    public void DropOff() throws Exception{
        mobileGeneralMethod.tap(shopSafeObjects.objNearestDropOffGMap(),"Nearest Drop Off GMap");
//        mobileGeneralMethod.tap(shopSafeObjects.objAllowWhileUsingAppBtn(),"Allow G Map");
        mobileGeneralMethod.waitSleep(5000);
        if(mobileGeneralMethod.isVisible(shopSafeObjects.objSelectNearest(),"Near Appear")){
            mobileGeneralMethod.waitSleep(3000);
            mobileGeneralMethod.tap(shopSafeObjects.objSelectNearest(), "Select Near");
        }
        mobileGeneralMethod.isVisible(shopSafeObjects.objBranchNameGMapVal(),"");
        mobileGeneralMethod.isVisible(shopSafeObjects.objBranchAddressGMapVal(),"");
        mobileGeneralMethod.tap(shopSafeObjects.objConfirmBranchBtn(),"Confirm Branch Button");
    }
    public void VerifyConfirmationPage() throws Exception{
        mobileGeneralMethod.isVisible(shopSafeObjects.objConfirmDetailsPage(),"Confirmation Page");
        mobileGeneralMethod.isVisible(shopSafeObjects.objPicture(),"Picture ");
        mobileGeneralMethod.isVisible(shopSafeObjects.objRFTN(),"RFTN");
        mobileGeneralMethod.isVisible(shopSafeObjects.objSellersDetailLabel(),"Sellers Detail");
        mobileGeneralMethod.isVisible(shopSafeObjects.objSellersNameVal(),"Sellers Name");
        mobileGeneralMethod.isVisible(shopSafeObjects.objSellersNoVal(),"Sellers Number");
        mobileGeneralMethod.isVisible(shopSafeObjects.objBuyersDetailLabel(),"Buyers Detail");
        mobileGeneralMethod.isVisible(shopSafeObjects.objBuyersNameVal(),"Buyers Name");
        mobileGeneralMethod.isVisible(shopSafeObjects.objBuyersNoVal(),"Buyers No");
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.isVisible(shopSafeObjects.objItemDetailsLabel(),"Item Details");
        mobileGeneralMethod.isVisible(shopSafeObjects.objItemNameVal(),"Item Name");
        mobileGeneralMethod.isVisible(shopSafeObjects.objItemDescriptVal(),"Item Description");
        mobileGeneralMethod.isVisible(shopSafeObjects.objBrandVal(),"Brand");
        mobileGeneralMethod.isVisible(shopSafeObjects.objModelNoVal(),"Mode Number");
        mobileGeneralMethod.isVisible(shopSafeObjects.objCategoryVal(),"Category");
        mobileGeneralMethod.isVisible(shopSafeObjects.objItemPriceVal(),"Item Price");
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.isVisible(shopSafeObjects.objShipDetailLabel(),"Ship Detail");
        mobileGeneralMethod.isVisible(shopSafeObjects.objOriginBranchVal(),"Origin Branch");
        mobileGeneralMethod.isVisible(shopSafeObjects.objConfirmInvitationBtn(),"Confirm Invitation");
        mobileGeneralMethod.isVisible(shopSafeObjects.objBacksBtn(),"Back Button");
    }
    public void FillItemInformation() throws Exception{
        mobileGeneralMethod.type(shopSafeObjects.objItemNameTxtBx(),"Type Item Name",reader.getFillInfo("ValidItemName"));
        mobileGeneralMethod.type(shopSafeObjects.objItemDescriptTxtBx(), "Type Item Description",reader.getFillInfo("ValidItemDescript"));
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.type(shopSafeObjects.objBrandTxtBx(), "Type Brand",reader.getFillInfo("ValidBrand"));
        mobileGeneralMethod.type(shopSafeObjects.objModelNoTxtbox(), "Type Model No",reader.getFillInfo("ValidModelNo"));
        mobileGeneralMethod.type(shopSafeObjects.objItemQuantityTxtbx(), "Type Item Quantity",reader.getInputNum("ValidItemQuantity").toString());
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.tap(shopSafeObjects.objCategoryDropDownlist(),"Category DropDownlist");
        mobileGeneralMethod.waitSleep(5000);
        mobileGeneralMethod.tap(shopSafeObjects.objClothesTxtBtn(),"Select Clothes");
        mobileGeneralMethod.type(shopSafeObjects.objItemPriceTxtbx(), "Type Item Price",reader.getInputNum("ValidItemPrice").toString());
        mobileGeneralMethod.tap(shopSafeObjects.objWeightRangeDropDownList(),"Weight Range DropDownList");
        mobileGeneralMethod.waitSleep(5000);
        mobileGeneralMethod.tap(shopSafeObjects.obj0kgTxtBtn(), "Select 0 to 3 kg");
    }
    public void SSM_TC_07_Verify_seller_fill_up_the_Item_Information_Page_and_clicking_proceed_button_Invites_Page () throws Exception {
        login.loginWalletFullyTier();
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.tap(shopSafeObjects.objShopSafeIconBtn(), "Shop Safe Icon Button");
        mobileGeneralMethod.waitSleep(5000);
        mobileGeneralMethod.tap(shopSafeObjects.objInvitesTransactTxtBtn(),"View all Invites Text Button");
        mobileGeneralMethod.waitSleep(5000);
        if(mobileGeneralMethod.isVisible(shopSafeObjects.objFirstInTab(),"First in TAB")) {
            mobileGeneralMethod.tap(shopSafeObjects.objFirstInTab(), "New Invitation in Invites list");
            Camera();
            Camera();
            FillItemInformation();
            mobileGeneralMethod.verticalSwipe();
            DropOff();
            mobileGeneralMethod.waitSleep(5000);
            mobileGeneralMethod.tap(shopSafeObjects.objProceedsBtn(), "Proceeds Button");
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
        mobileGeneralMethod.isVisible(shopSafeObjects.objSRFTN(),"RFTN");
        mobileGeneralMethod.isVisible(shopSafeObjects.objSellersDetailTransactLabel(),"Sellers Detail");
        mobileGeneralMethod.isVisible(shopSafeObjects.objSellersNameTransactVal(),"Sellers Name");
        mobileGeneralMethod.isVisible(shopSafeObjects.objSellersNoTransactVal(),"Sellers Number");
        mobileGeneralMethod.isVisible(shopSafeObjects.objBuyersDetailTransactLabel(),"Buyers Detail");
        mobileGeneralMethod.isVisible(shopSafeObjects.objBuyersNameTransactVal(),"Buyers Name");
        mobileGeneralMethod.isVisible(shopSafeObjects.objBuyersNoTransactVal(),"Buyers No");
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.isVisible(shopSafeObjects.objItemDetailsTransactLabel(),"Item Details");
        mobileGeneralMethod.isVisible(shopSafeObjects.objItemNameTransactVal(),"Item Name");
        mobileGeneralMethod.isVisible(shopSafeObjects.objItemDescriptTransactVal(),"Item Description");
        mobileGeneralMethod.isVisible(shopSafeObjects.objBrandTransactVal(),"Brand");
        mobileGeneralMethod.isVisible(shopSafeObjects.objModelNoTransactVal(),"Mode Number");
        mobileGeneralMethod.isVisible(shopSafeObjects.objCategoryTransactVal(),"Category");
        mobileGeneralMethod.isVisible(shopSafeObjects.objItemPriceTransactVal(),"Item Price");
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.isVisible(shopSafeObjects.objShipDetailTransactLabel(),"Ship Detail");
        mobileGeneralMethod.isVisible(shopSafeObjects.objOriginBranchTransactVal(),"Origin Branch");
        mobileGeneralMethod.isVisible(shopSafeObjects.objPictureTransact(),"Picture ");
    }

    public void SSM_TC_08_Verify_seller_fill_up_the_Item_Information_Page_and_clicking_proceed_button_Invites_Page () throws Exception {
        login.loginWalletFullyTier();
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.tap(shopSafeObjects.objShopSafeIconBtn(), "Shop Safe Icon Button");
        mobileGeneralMethod.waitSleep(5000);
        mobileGeneralMethod.tap(shopSafeObjects.objInvitesTransactTxtBtn(),"View all Invites Text Button");
        mobileGeneralMethod.waitSleep(5000);
        mobileGeneralMethod.tap(shopSafeObjects.objFirstInTab(),"New Invitation in Invites list");
        Camera();
        Camera();
        FillItemInformation();
        mobileGeneralMethod.verticalSwipe();
        DropOff();
        if( mobileGeneralMethod.isVisible(shopSafeObjects.objProceedsBtn(),"Show Proceeds Button")){
            mobileGeneralMethod.tap(shopSafeObjects.objProceedsBtn(),"Proceeds Button");
            mobileGeneralMethod.verticalSwipe();
            mobileGeneralMethod.verticalSwipe();
            mobileGeneralMethod.tap(shopSafeObjects.objConfirmInvitationBtn(),"Confirm Invitation");
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
        mobileGeneralMethod.isVisible(shopSafeObjects.objOngoingBuyerPicture(),"Buyer Picture");
        mobileGeneralMethod.isVisible(shopSafeObjects.objOngoingRFTN(),"Reference Number");
        mobileGeneralMethod.isVisible(shopSafeObjects.objOngoingellersDetailLabel(),"Seller Detail Label");
        mobileGeneralMethod.isVisible(shopSafeObjects.objOngoingSellersNameVal(),"Sellers Name");
        mobileGeneralMethod.isVisible(shopSafeObjects.objOngoingSellersNoVal(),"Sellers No");
        mobileGeneralMethod.isVisible(shopSafeObjects.objOngoingBuyersDetailLabel(),"Buyers Detail Label");
        mobileGeneralMethod.isVisible(shopSafeObjects.objOngoingBuyersNameVal(),"Buyers Name");
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.isVisible(shopSafeObjects.objOngoingBuyersNoVal(),"Buyers No");
        mobileGeneralMethod.isVisible(shopSafeObjects.objOngoingItemDetailsLabel(),"Item Details Label");
        mobileGeneralMethod.isVisible(shopSafeObjects.objOngoingItemNameVal(),"Item Name");
        mobileGeneralMethod.isVisible(shopSafeObjects.objOngoingItemDescriptVal(),"Item Description");
        mobileGeneralMethod.isVisible(shopSafeObjects.objOngoingBrandVal(),"Brand");
        mobileGeneralMethod.isVisible(shopSafeObjects.objOngoingModelNoVal(),"Model No");
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.isVisible(shopSafeObjects.objOngoingCategoryVal(),"Category");
        mobileGeneralMethod.isVisible(shopSafeObjects.objOngoingItemPriceVal(),"Item Price");
        mobileGeneralMethod.isVisible(shopSafeObjects.objOngoingChooseNearestBranchBtn(),"Choose Nearest Branch");
        mobileGeneralMethod.isVisible(shopSafeObjects.objOngoingProceedToReviewBtn(),"Proceed To Review Btn");
        mobileGeneralMethod.isVisible(shopSafeObjects.objOngoingCancelBtn(),"Cancel Btn");
    }

    public void validateSellerOngoing() throws Exception{
        mobileGeneralMethod.waitSleep(8000);
        mobileGeneralMethod.isVisible(shopSafeObjects.objOngoingWaitPaymentStatus(),"Waiting For Payment Status");
        mobileGeneralMethod.isVisible(shopSafeObjects.objOngoingRFTN(),"Reference Number");
        mobileGeneralMethod.isVisible(shopSafeObjects.objOngoingellersDetailLabel(),"Seller Detail Label");
        mobileGeneralMethod.isVisible(shopSafeObjects.objOngoingSellersNameVal(),"Sellers Name");
        mobileGeneralMethod.isVisible(shopSafeObjects.objOngoingSellersNoVal(),"Sellers No");
        mobileGeneralMethod.isVisible(shopSafeObjects.objOngoingBuyersDetailLabel(),"Buyers Detail Label");
        mobileGeneralMethod.isVisible(shopSafeObjects.objOngoingBuyersNameVal(),"Buyers Name");
        mobileGeneralMethod.isVisible(shopSafeObjects.objOngoingBuyersNoVal(),"Buyers No");
        mobileGeneralMethod.isVisible(shopSafeObjects.objOngoingItemDetailsLabel(),"Item Details");
        mobileGeneralMethod.isVisible(shopSafeObjects.objOngoingItemNameVal(),"Item Name");
        mobileGeneralMethod.isVisible(shopSafeObjects.objOngoingItemDescriptVal(),"Item Description");
        mobileGeneralMethod.isVisible(shopSafeObjects.objOngoingBrandVal(),"Brand");
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.isVisible(shopSafeObjects.objOngoingModelNoVal(),"Model No");
        mobileGeneralMethod.isVisible(shopSafeObjects.objOngoingCategoryVal(),"Category");
        mobileGeneralMethod.isVisible(shopSafeObjects.objOngoingItemPriceVal(),"Item Price");
        mobileGeneralMethod.isVisible(shopSafeObjects.objOngoingShipDetailLabel(),"Ship Detail");
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.isVisible(shopSafeObjects.objOngoingOriginBranchVal(),"Origin Branch");
        mobileGeneralMethod.isVisible(shopSafeObjects.objOngoingSellerPicture(),"Buyer Picture");
    }

    public void SSM_TC_09_Validate_Buyer_Ongoing_Transaction_Page() throws Exception {
        login.loginWalletBranchTier();
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.tap(shopSafeObjects.objShopSafeIconBtn(), "Shop Safe Icon Button");
        mobileGeneralMethod.waitSleep(3000);
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.waitSleep(5000);
        mobileGeneralMethod.tap(shopSafeObjects.objOngoingTransactTxtBtn(),"View all Invites Text Button");
        mobileGeneralMethod.waitSleep(5000);
        if(mobileGeneralMethod.isVisible(shopSafeObjects.objFirstInTab(),"New Invitation in Invites list")) {
            mobileGeneralMethod.tap(shopSafeObjects.objFirstInTab(), "New Invitation in Invites list");
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
        mobileGeneralMethod.tap(shopSafeObjects.objShopSafeIconBtn(), "Shop Safe Icon Button");
        mobileGeneralMethod.waitSleep(5000);
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.waitSleep(5000);
        mobileGeneralMethod.tap(shopSafeObjects.objOngoingTransactTxtBtn(), "View all Invites Text Button");
        mobileGeneralMethod.waitSleep(5000);
        if(mobileGeneralMethod.isVisible(shopSafeObjects.objFirstInTab(),"New Invitation in Invites list")) {
            mobileGeneralMethod.tap(shopSafeObjects.objFirstInTab(), "New Invitation in Invites list");
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
        mobileGeneralMethod.tap(shopSafeObjects.objOngoingChooseNearestBranchBtn(),"Nearest Drop Off GMap");
//        mobileGeneralMethod.tap(shopSafeObjects.objOngoingGmapWhileUSingAppBtn(),"Allow G Map");
        mobileGeneralMethod.waitSleep(5000);
        if(mobileGeneralMethod.isVisible(shopSafeObjects.objOngoingSelectNearestBtn(),"Near Appear")){
            mobileGeneralMethod.waitSleep(3000);
            mobileGeneralMethod.tap(shopSafeObjects.objOngoingSelectNearestBtn(), "Select Near");
        }
        mobileGeneralMethod.isVisible(shopSafeObjects.objOngoingBranchNameGMapVal(),"");
        mobileGeneralMethod.isVisible(shopSafeObjects.objOngoingBranchAddressGMapVal(),"");
        mobileGeneralMethod.tap(shopSafeObjects.objOngoingConfirmBranchBtn(),"Confirm Branch Button");
    }
    public void ValidatePayment() throws Exception{
        mobileGeneralMethod.waitSleep(5000);
        mobileGeneralMethod.isVisible(shopSafeObjects.objPaymentPicture(),"Picture");
        mobileGeneralMethod.isVisible(shopSafeObjects.objPaymentRFTN(),"RFTN");
        mobileGeneralMethod.isVisible(shopSafeObjects.objPaymentSellersNameVal(),"Sellers Name");
        mobileGeneralMethod.isVisible(shopSafeObjects.objPaymentSellersNoVal(),"Sellers No");
        mobileGeneralMethod.isVisible(shopSafeObjects.objPaymentBuyersDetailLabel(),"Buyers Detail Label");
        mobileGeneralMethod.isVisible(shopSafeObjects.objPaymentBuyersNameVal(),"Buyers Name");
        mobileGeneralMethod.isVisible(shopSafeObjects.objPaymentBuyersNoVal(),"Buyers No");
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.isVisible(shopSafeObjects.objPaymentItemDetailsLabel(),"Item Details");
        mobileGeneralMethod.isVisible(shopSafeObjects.objPaymentItemNameVal(),"Item Name");
        mobileGeneralMethod.isVisible(shopSafeObjects.objPaymentItemDescriptVal(),"Item Description");
        mobileGeneralMethod.isVisible(shopSafeObjects.objPaymentBrandVal(),"Brand");
        mobileGeneralMethod.isVisible(shopSafeObjects.objPaymentModelNoVal(),"Model No");
        mobileGeneralMethod.isVisible(shopSafeObjects.objPaymentCategoryVal(),"Category");
        mobileGeneralMethod.isVisible(shopSafeObjects.objPaymentItemPriceVal(),"Item Price");
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.isVisible(shopSafeObjects.objShippingFeeVal(),"Shipping Fee");
        mobileGeneralMethod.isVisible(shopSafeObjects.objReturnShippingDepositVal(),"Return Shipping Deposit");
        mobileGeneralMethod.isVisible(shopSafeObjects.objInsuranceFeeVal(),"Insurance Fee");
        mobileGeneralMethod.isVisible(shopSafeObjects.objServiceFeeVal(),"Service Fee");
        mobileGeneralMethod.isVisible(shopSafeObjects.objTotalAmountVal(),"Total Amount");
        mobileGeneralMethod.isVisible(shopSafeObjects.objShippingDetailsLabel(),"Shipping Details Label");
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.isVisible(shopSafeObjects.objPaymentOriginBranchVal(),"Origin Branch");
        mobileGeneralMethod.isVisible(shopSafeObjects.objPaymentTotalAmountVal(),"Total Amount");
        mobileGeneralMethod.isVisible(shopSafeObjects.objPaymentBackBtn(),"Back Btn");
        mobileGeneralMethod.tap(shopSafeObjects.objPaymentAmountBtn(),"Amount Btn");
        mobileGeneralMethod.waitSleep(5000);
    }
    public void SSM_TC_11_Verify_seller_fill_up_the_Item_Information_Page_and_clicking_proceed_button_Invites_Page () throws Exception {
        //mobileGeneralMethod.startActivity();
        login.loginWalletBranchTier();
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.tap(shopSafeObjects.objShopSafeIconBtn(), "Shop Safe Icon Button");
        mobileGeneralMethod.waitSleep(3000);
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.waitSleep(5000);
        mobileGeneralMethod.tap(shopSafeObjects.objOngoingTransactTxtBtn(),"View all Invites Text Button");
        mobileGeneralMethod.waitSleep(5000);
        mobileGeneralMethod.tap(shopSafeObjects.objFirstInTab(),"New Invitation in Invites list");
        mobileGeneralMethod.waitSleep(3000);
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.verticalSwipe();
        DropOffBuyer();
        mobileGeneralMethod.tap(shopSafeObjects.objOngoingProceedToReviewBtn(),"Proceed To Review Btn");
        mobileGeneralMethod.waitSleep(3000);
        if(mobileGeneralMethod.isVisible(shopSafeObjects.objTermsAndConditionsLabel(),"Terms And Conditions Label")) {
            mobileGeneralMethod.isVisible(shopSafeObjects.objTermsAndConditionsBackBtn(), "Back Btn");
            mobileGeneralMethod.tap(shopSafeObjects.objAcceptTermsAndConditionsBtn(), "Accept Btn");
            ValidatePayment();
            mobileGeneralMethod.waitSleep(10000);
            mobileGeneralMethod.isVisible(shopSafeObjects.objSuccessfullyPaidLabel(), "Successfully Paid Label");
            mobileGeneralMethod.tap(shopSafeObjects.objPaymentOkayBtn(), "Okay Btn");
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
        mobileGeneralMethod.isVisible(shopSafeObjects.objOngoingellersDetailLabel(),"Seller Detail Label");
        mobileGeneralMethod.isVisible(shopSafeObjects.objOngoingSellersNameVal(),"Sellers Name");
        mobileGeneralMethod.isVisible(shopSafeObjects.objOngoingSellersNoVal(),"Sellers No");
        mobileGeneralMethod.isVisible(shopSafeObjects.objOngoingBuyersDetailLabel(),"Buyers Detail Label");
        mobileGeneralMethod.isVisible(shopSafeObjects.objOngoingBuyersNameVal(),"Buyers Name");
        mobileGeneralMethod.isVisible(shopSafeObjects.objOngoingBuyersNoVal(),"Buyers No");
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.isVisible(shopSafeObjects.objOngoingItemDetailsLabel(),"Item Details");
        mobileGeneralMethod.isVisible(shopSafeObjects.objOngoingItemNameVal(),"Item Name");
        mobileGeneralMethod.isVisible(shopSafeObjects.objOngoingItemDescriptVal(),"Item Description");
        mobileGeneralMethod.isVisible(shopSafeObjects.objOngoingBrandVal(),"Brand");
        mobileGeneralMethod.isVisible(shopSafeObjects.objOngoingModelNoVal(),"Model No");
        mobileGeneralMethod.isVisible(shopSafeObjects.objOngoingCategoryVal(),"Category");
        mobileGeneralMethod.isVisible(shopSafeObjects.objOngoingItemPriceVal(),"Item Price");
        mobileGeneralMethod.isVisible(shopSafeObjects.objFeesLabel(),"Fees Label");
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.isVisible(shopSafeObjects.objShippingFeeVal(),"Shipping Fee");
        mobileGeneralMethod.isVisible(shopSafeObjects.objReturnShippingDepositDropOffVal(),"Drop Off Fee");
        mobileGeneralMethod.isVisible(shopSafeObjects.objServiceFeeVal(),"Service Fee");
        mobileGeneralMethod.isVisible(shopSafeObjects.objInsuranceFeeVal(),"Insurance Fee");
        mobileGeneralMethod.isVisible(shopSafeObjects.objOngoingShipDetailLabel(),"Ship Detail Label");
        mobileGeneralMethod.isVisible(shopSafeObjects.objOngoingOriginBranchVal(),"Origin Branch");
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.isVisible(shopSafeObjects.objOngoingDestinationBranchVal(),"Destination Branch");
        mobileGeneralMethod.isVisible(shopSafeObjects.objOngoingSellerPicture(),"Buyer Picture");
        mobileGeneralMethod.isVisible(shopSafeObjects.objOngoingCancelBtn(),"Cancel Transaction");
    }
    public void SSM_TC_12_Verify_seller_Paid_Item_Transaction_Drop_off_Status_Invites_Page () throws Exception {
        //mobileGeneralMethod.startActivity();
        login.loginWalletBranchTier();
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.tap(shopSafeObjects.objShopSafeIconBtn(), "Shop Safe Icon Button");
        mobileGeneralMethod.waitSleep(3000);
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.waitSleep(5000);
        mobileGeneralMethod.tap(shopSafeObjects.objOngoingTransactTxtBtn(),"View all Invites Text Button");
        mobileGeneralMethod.waitSleep(5000);
        if(mobileGeneralMethod.isVisible(shopSafeObjects.objFirstInTab(),"New Invitation in Invites list")) {
            mobileGeneralMethod.tap(shopSafeObjects.objFirstInTab(), "New Invitation in Invites list");
            mobileGeneralMethod.waitSleep(5000);
            mobileGeneralMethod.isVisible(shopSafeObjects.objOngoingDropOffStatus(),"Drop Off Status");
            mobileGeneralMethod.isVisible(shopSafeObjects.objDropOffRFTN(),"Reference Number");
            String kptnText = (shopSafeObjects.objDropOffRFTN().getText());
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

        mobileGeneralMethod.isVisible(shopSafeObjects.objCancelledStatusLabel(),"Cancelled Status");
        mobileGeneralMethod.isVisible(shopSafeObjects.objCancelledRFTN(),"Reference Number");
        mobileGeneralMethod.isVisible(shopSafeObjects.objCancelledellersDetailLabel(),"Seller Detail Label");
        mobileGeneralMethod.isVisible(shopSafeObjects.objCancelledSellersNameVal(),"Sellers Name");
        mobileGeneralMethod.isVisible(shopSafeObjects.objCancelledSellersNoVal(),"Sellers No");
        mobileGeneralMethod.isVisible(shopSafeObjects.objCancelledBuyersDetailLabel(),"Buyers Detail Label");
        mobileGeneralMethod.isVisible(shopSafeObjects.objCancelledBuyersNameVal(),"Buyers Name");
        mobileGeneralMethod.isVisible(shopSafeObjects.objCancelledBuyersNoVal(),"Buyers No");
        mobileGeneralMethod.isVisible(shopSafeObjects.objCancelledItemDetailsLabel(),"Item Details");
        mobileGeneralMethod.isVisible(shopSafeObjects.objCancelledItemNameVal(),"Item Name");
        mobileGeneralMethod.isVisible(shopSafeObjects.objCancelledItemDescriptVal(),"Item Description");
        mobileGeneralMethod.isVisible(shopSafeObjects.objCancelledBrandVal(),"Brand");
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.isVisible(shopSafeObjects.objCancelledModelNoVal(),"Model No");
        mobileGeneralMethod.isVisible(shopSafeObjects.objCancelledCategoryVal(),"Category");
        mobileGeneralMethod.isVisible(shopSafeObjects.objCancelledItemPriceVal(),"Item Price");
        mobileGeneralMethod.isVisible(shopSafeObjects.objFeesLabel(),"Fees Label");
        mobileGeneralMethod.isVisible(shopSafeObjects.objShippingFeeVal(),"Shipping Fee");
        mobileGeneralMethod.isVisible(shopSafeObjects.objReturnShippingDepositDropOffVal(),"Drop Off Fee");
        mobileGeneralMethod.isVisible(shopSafeObjects.objServiceFeeVal(),"Service Fee");
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.isVisible(shopSafeObjects.objInsuranceFeeVal(),"Insurance Fee");
        mobileGeneralMethod.isVisible(shopSafeObjects.objCancelledShipDetailLabel(),"Ship Detail Label");
        mobileGeneralMethod.isVisible(shopSafeObjects.objCancelledOriginBranchVal(),"Origin Branch");
        mobileGeneralMethod.isVisible(shopSafeObjects.objCancelledDestinationBranchVal(),"Destination Branch");
        mobileGeneralMethod.isVisible(shopSafeObjects.objCancelledSellerPicture(),"Buyer Picture");
    }

    public void SSM_TC_13_Cancelled_Transactions () throws Exception {
        login.loginWalletBranchTier();
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.tap(shopSafeObjects.objShopSafeIconBtn(), "Shop Safe Icon Button");
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.tap(shopSafeObjects.objCancelTransactTxtBtn(),"See More Text Button");
        mobileGeneralMethod.waitSleep(3000);
        if(mobileGeneralMethod.isVisible(shopSafeObjects.objFirstInTab(),"New Invitation in Invites list")) {
            mobileGeneralMethod.tap(shopSafeObjects.objFirstInTab(),"New Invitation in Invites list");
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
        mobileGeneralMethod.isVisible(shopSafeObjects.objReadyForPickUPStatus(),"Drop Off Status");
        mobileGeneralMethod.isVisible(shopSafeObjects.objReadyFOrPickUPRFTN(),"Reference Number");
        mobileGeneralMethod.isVisible(shopSafeObjects.objOngoingellersDetailLabel(),"Seller Detail Label");
        mobileGeneralMethod.isVisible(shopSafeObjects.objOngoingSellersNameVal(),"Sellers Name");
        mobileGeneralMethod.isVisible(shopSafeObjects.objOngoingSellersNoVal(),"Sellers No");
        mobileGeneralMethod.isVisible(shopSafeObjects.objOngoingBuyersDetailLabel(),"Buyers Detail Label");
        mobileGeneralMethod.isVisible(shopSafeObjects.objOngoingBuyersNameVal(),"Buyers Name");
        mobileGeneralMethod.isVisible(shopSafeObjects.objOngoingBuyersNoVal(),"Buyers No");
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.isVisible(shopSafeObjects.objOngoingItemDetailsLabel(),"Item Details");
        mobileGeneralMethod.isVisible(shopSafeObjects.objOngoingItemNameVal(),"Item Name");
        mobileGeneralMethod.isVisible(shopSafeObjects.objOngoingItemDescriptVal(),"Item Description");
        mobileGeneralMethod.isVisible(shopSafeObjects.objOngoingBrandVal(),"Brand");
        mobileGeneralMethod.isVisible(shopSafeObjects.objOngoingModelNoVal(),"Model No");
        mobileGeneralMethod.isVisible(shopSafeObjects.objOngoingCategoryVal(),"Category");
        mobileGeneralMethod.isVisible(shopSafeObjects.objOngoingItemPriceVal(),"Item Price");
        mobileGeneralMethod.isVisible(shopSafeObjects.objFeesLabel(),"Fees Label");
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.isVisible(shopSafeObjects.objShippingFeeVal(),"Shipping Fee");
        mobileGeneralMethod.isVisible(shopSafeObjects.objReturnShippingDepositDropOffVal(),"Drop Off Fee");
        mobileGeneralMethod.isVisible(shopSafeObjects.objServiceFeeVal(),"Service Fee");
        mobileGeneralMethod.isVisible(shopSafeObjects.objInsuranceFeeVal(),"Insurance Fee");
        mobileGeneralMethod.isVisible(shopSafeObjects.objOngoingShipDetailLabel(),"Ship Detail Label");
        mobileGeneralMethod.isVisible(shopSafeObjects.objOngoingOriginBranchVal(),"Origin Branch");
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.isVisible(shopSafeObjects.objOngoingDestinationBranchVal(),"Destination Branch");
        mobileGeneralMethod.isVisible(shopSafeObjects.objOngoingSellerPicture(),"Buyer Picture");
        mobileGeneralMethod.isVisible(shopSafeObjects.objOngoingDeclineItem(),"Decline Item Btn");
        mobileGeneralMethod.isVisible(shopSafeObjects.objOngoingAcceptItem(),"Accept Item Btn");
        mobileGeneralMethod.tap(shopSafeObjects.objOngoingAcceptItem(),"Accept Item Btn");
        mobileGeneralMethod.waitSleep(8000);
        mobileGeneralMethod.isVisible(shopSafeObjects.objSuccessfulAcceptedLabel(),"Successful Accept Label");
        mobileGeneralMethod.isVisible(shopSafeObjects.objSuccessfulOkayBtn(),"Successful Okay Btn");
        mobileGeneralMethod.tap(shopSafeObjects.objSuccessfulOkayBtn(),"Click Successful Okay Btn");
    }
    public void SSM_TC_14_Verify_buyer_Receive_Item_Ready_For_Pick_Up() throws Exception {
        login.loginWalletBranchTier();
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.tap(shopSafeObjects.objShopSafeIconBtn(), "Shop Safe Icon Button");
        mobileGeneralMethod.waitSleep(3000);
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.waitSleep(5000);
        mobileGeneralMethod.tap(shopSafeObjects.objOngoingTransactTxtBtn(),"View all Invites Text Button");
        mobileGeneralMethod.waitSleep(8000);
        if(mobileGeneralMethod.isVisible(shopSafeObjects.objFirstInTab(),"New Invitation in Invites list")) {
            mobileGeneralMethod.tap(shopSafeObjects.objFirstInTab(), "New Invitation in Invites list");
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
        mobileGeneralMethod.isVisible(shopSafeObjects.objCompleteStatus(), "Complete Status");
        mobileGeneralMethod.isVisible(shopSafeObjects.objCompleteRFTN(), "Reference Number");
        mobileGeneralMethod.isVisible(shopSafeObjects.objOngoingellersDetailLabel(), "Seller Detail Label");
        mobileGeneralMethod.isVisible(shopSafeObjects.objOngoingSellersNameVal(), "Sellers Name");
        mobileGeneralMethod.isVisible(shopSafeObjects.objOngoingSellersNoVal(), "Sellers No");
        mobileGeneralMethod.isVisible(shopSafeObjects.objOngoingBuyersDetailLabel(), "Buyers Detail Label");
        mobileGeneralMethod.isVisible(shopSafeObjects.objOngoingBuyersNameVal(), "Buyers Name");
        mobileGeneralMethod.isVisible(shopSafeObjects.objOngoingBuyersNoVal(), "Buyers No");
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.isVisible(shopSafeObjects.objOngoingItemDetailsLabel(), "Item Details");
        mobileGeneralMethod.isVisible(shopSafeObjects.objOngoingItemNameVal(), "Item Name");
        mobileGeneralMethod.isVisible(shopSafeObjects.objOngoingItemDescriptVal(), "Item Description");
        mobileGeneralMethod.isVisible(shopSafeObjects.objOngoingBrandVal(), "Brand");
        mobileGeneralMethod.isVisible(shopSafeObjects.objOngoingModelNoVal(), "Model No");
        mobileGeneralMethod.isVisible(shopSafeObjects.objOngoingCategoryVal(), "Category");
        mobileGeneralMethod.isVisible(shopSafeObjects.objOngoingItemPriceVal(), "Item Price");
        mobileGeneralMethod.isVisible(shopSafeObjects.objFeesLabel(), "Fees Label");
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.isVisible(shopSafeObjects.objShippingFeeVal(), "Shipping Fee");
        mobileGeneralMethod.isVisible(shopSafeObjects.objReturnShippingDepositDropOffVal(), "Drop Off Fee");
        mobileGeneralMethod.isVisible(shopSafeObjects.objServiceFeeVal(), "Service Fee");
        mobileGeneralMethod.isVisible(shopSafeObjects.objInsuranceFeeVal(), "Insurance Fee");
        mobileGeneralMethod.isVisible(shopSafeObjects.objOngoingShipDetailLabel(), "Ship Detail Label");
        mobileGeneralMethod.isVisible(shopSafeObjects.objOngoingOriginBranchVal(), "Origin Branch");
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.isVisible(shopSafeObjects.objOngoingDestinationBranchVal(), "Destination Branch");
        mobileGeneralMethod.isVisible(shopSafeObjects.objOngoingSellerPicture(), "Buyer Picture");
    }
    public void SSM_TC_15_Verify_buyer_and_Seller_Successful_Transaction() throws Exception {
        login.loginWalletBranchTier();
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.tap(shopSafeObjects.objShopSafeIconBtn(), "Shop Safe Icon Button");
        mobileGeneralMethod.waitSleep(3000);
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.waitSleep(5000);
        mobileGeneralMethod.tap(shopSafeObjects.objCompleteTransactTxtBtn(),"View all Invites Text Button");
        mobileGeneralMethod.waitSleep(5000);
        if(mobileGeneralMethod.isVisible(shopSafeObjects.objFirstInTab(),"New Invitation in Invites list")) {
            mobileGeneralMethod.tap(shopSafeObjects.objFirstInTab(), "New Invitation in Invites list");
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
//        mobileGeneralMethod.tap(shopSafeObjects.objShopSafeIconBtn(), "Shop Safe Icon Button");
//        mobileGeneralMethod.tap(shopSafeObjects.objStartTransactBtn(), "Start Transaction Button");
//        mobileGeneralMethod.type(shopSafeObjects.objSellerNoTxtbx(), propertyReader.getproperty("VaildShopSafeNumber"), "Type Valid Number");
//        mobileGeneralMethod.tap(shopSafeObjects.objInviteSellerBtn(), "Invite Seller Button");
//        if (mobileGeneralMethod.isVisible(shopSafeObjects.objSuccessfInviteLabel(), "Successful Invite")) {
//            mobileGeneralMethod.tap(shopSafeObjects.objOkayBtn(), "Okay Button");
//            mobileGeneralMethod.tap(shopSafeObjects.objBackBtn(), "Back Button");
//        }
//        shopSafeLogout();
//        login.loginWalletFullyTier();
//         mobileGeneralMethod.waitSleep(1000);
//        mobileGeneralMethod.tap(shopSafeObjects.objShopSafeIconBtn(), "Shop Safe Icon Button");
//        mobileGeneralMethod.tap(shopSafeObjects.objInvitesTransactTxtBtn(), "View all Invites Text Button");
//         mobileGeneralMethod.waitSleep(3000);
//        mobileGeneralMethod.isVisible(shopSafeObjects.objFirstInTab(), "New Invitation in Invites list");
//        mobileGeneralMethod.tap(shopSafeObjects.objFirstInTab(), "New Invitation in Invites list");
//        Camera();
//        mobileGeneralMethod.verticalSwipe();
//        Camera();
//        FillItemInformation();
//         mobileGeneralMethod.waitSleep(1000);
//        mobileGeneralMethod.verticalSwipe();
//        DropOff();
//        mobileGeneralMethod.verticalSwipe();
//         mobileGeneralMethod.waitSleep(1000);
//        mobileGeneralMethod.tap(shopSafeObjects.objProceedsBtn(), "Proceeds Button");
//        Swipe("UP", 4);
//         mobileGeneralMethod.waitSleep(1000);
//        mobileGeneralMethod.tap(shopSafeObjects.objConfirmInvitationBtn(), "Confirm Invitation");
//        Swipe("UP", 4);
//        mobileGeneralMethod.tap(shopSafeObjects.objBackBtn(), "Okay Button");
//        mobileGeneralMethod.tap(shopSafeObjects.objBackBtn(), "Back Button");
//         mobileGeneralMethod.waitSleep(3000);
//        if(mobileGeneralMethod.isVisible(shopSafeObjects.objBackBtn)) {
//             mobileGeneralMethod.tap(shopSafeObjects.objBackBtn(), "Back Button");
//        }
//        shopSafeLogout();
//        login.loginWalletBranchTier();
//         mobileGeneralMethod.waitSleep(1000);
//        mobileGeneralMethod.tap(shopSafeObjects.objShopSafeIconBtn(), "Shop Safe Icon Button");
//         mobileGeneralMethod.waitSleep(1000);
//        mobileGeneralMethod.verticalSwipe();
//        mobileGeneralMethod.tap(shopSafeObjects.objOngoingTransactTxtBtn(),"View all Invites Text Button");
//         mobileGeneralMethod.waitSleep(3000);
//        mobileGeneralMethod.tap(shopSafeObjects.objFirstInTab(),"New Invitation in Invites list");
//        Swipe("UP", 4);
//        DropOffBuyer();
//        mobileGeneralMethod.tap(shopSafeObjects.objOngoingProceedToReviewBtn(),"Proceed To Review Btn");
//        mobileGeneralMethod.tap(shopSafeObjects.objAcceptTermsAndConditionsBtn(),"Accept Btn");
//        Swipe("UP", 4);
//        mobileGeneralMethod.tap(shopSafeObjects.objPaymentAmountBtn(),"Amount Btn");
//        mobileGeneralMethod.isVisible(shopSafeObjects.objSuccessfullyPaidLabel(),"Successfully Paid Label");
//        mobileGeneralMethod.tap(shopSafeObjects.objPaymentOkayBtn(),"Okay Btn");
//         mobileGeneralMethod.waitSleep(3000);
//        mobileGeneralMethod.tap(shopSafeObjects.objFirstInTab(),"New Invitation in Invites list");
//        mobileGeneralMethod.isVisible(shopSafeObjects.objOngoingDropOffStatus(),"Drop Off Status");
//        mobileGeneralMethod.isVisible(shopSafeObjects.objDropOffRFTN(),"Reference Number");
//
//        LoggingUtils.info("Redirect to Shop Safe Page Navigation Success");
//        ExtentReporter.logPass("SSM_TC_02", "To verify click Shop Safe button Redirect to Shop Safe Page");
//    }












    //--------------------Negative Test--------------------
    public void SSM_TC_100_Validate_back_button_to_Shop_Safe_Page_back_to_Dashboard() throws Exception {
        login.loginWalletBranchTier();
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.tap(shopSafeObjects.objShopSafeIconBtn(), "Shop Safe Icon Button");
        mobileGeneralMethod.tap(shopSafeObjects.objBackBtn(), "Back Button");
        mobileGeneralMethod.isVisible(shopSafeObjects.objEyeIcon(),"Eye Icon");
        mobileGeneralMethod.tap(shopSafeObjects.objEyeIcon(),"Eye Icon");
        mobileGeneralMethod.isVisible(shopSafeObjects.objAvailableBalance()," Available Text");
        LoggingUtils.info("Redirect back to Dashboard Page Navigation Success");
        ExtentReporter.logPass("SSM_TC_03", "Validate back button to Shop Safe Page back to Dashboard");
    }
    public void SSM_TC_101_Validate_back_button_to_Create_Transaction_Page_back_to_Shop_Safe_page() throws Exception {
        login.loginWalletBranchTier();
         mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.tap(shopSafeObjects.objShopSafeIconBtn(), "Shop Safe Icon Button");
        mobileGeneralMethod.tap(shopSafeObjects.objStartTransactBtn(), "Start Transaction Button");
        mobileGeneralMethod.tap(shopSafeObjects.objBackBtn(), "Back Button");
        mobileGeneralMethod.isVisible(shopSafeObjects.objShopSafeLabel(), "Shop Safe Label");
        mobileGeneralMethod.isVisible(shopSafeObjects.objStartTransactBtn(), "Start Transaction Button");
        LoggingUtils.info("Redirect back to Shop Safe Page Navigation Success");
        ExtentReporter.logPass("SSM_TC_03", "Validate back button to Create Transaction Page back to Shop Safe page");
    }
    public void SSM_TC_102_Validate_back_button_to_Invites_Page_back_to_Shop_Safe_page() throws Exception {
        login.loginWalletBranchTier();
         mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.tap(shopSafeObjects.objShopSafeIconBtn(), "Shop Safe Icon Button");
        mobileGeneralMethod.tap(shopSafeObjects.objInvitesTransactTxtBtn(), "View All Invites Button");
        mobileGeneralMethod.tap(shopSafeObjects.objBackBtn(), "Back Button");
        mobileGeneralMethod.isVisible(shopSafeObjects.objShopSafeLabel(), "Shop Safe Label");
        LoggingUtils.info("Redirect back to Shop Safe Page Navigation Success");
        ExtentReporter.logPass("SSM_TC_03", "Validate back button to Invites Page back to Shop Safe page");
    }

    public void SSM_TC_103_Validate_back_button_to_Invitation_Request_back_to_Shop_Invites_Page() throws Exception {
        login.loginWalletBranchTier();
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.tap(shopSafeObjects.objShopSafeIconBtn(), "Shop Safe Icon Button");
        mobileGeneralMethod.tap(shopSafeObjects.objInvitesTransactTxtBtn(), "View All Invites Button");
        mobileGeneralMethod.waitSleep(3000);
        mobileGeneralMethod.tap(shopSafeObjects.objFirstInTab(),"New Invitation");
        mobileGeneralMethod.waitSleep(3000);
        mobileGeneralMethod.tap(shopSafeObjects.objBackBtn(), "Back Button");
        mobileGeneralMethod.isVisible(shopSafeObjects.objViewAllInvitation(), "View All Invitation Label");
        LoggingUtils.info("Redirect back to Invites Page Navigation Success");
        ExtentReporter.logPass("SSM_TC_03", "Validate back button to Invitation Request back to Invites Page");
    }

    public void SSM_TC_104_Validate_back_button_to_Shop_Ongoing_Transaction_Page_back_to_Shop_Safe_Page() throws Exception {
        login.loginWalletBranchTier();
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.tap(shopSafeObjects.objShopSafeIconBtn(), "Shop Safe Icon Button");
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.tap(shopSafeObjects.objOngoingTransactTxtBtn(), "View All Invites Button");
        mobileGeneralMethod.tap(shopSafeObjects.objBackBtn(), "Back Button");
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.isVisible(shopSafeObjects.objShopSafeLabel(), "Shop Safe Label");
        mobileGeneralMethod.isVisible(shopSafeObjects.objStartTransactBtn(), "Start Transaction Button");
        LoggingUtils.info("Redirect back to Dashboard Page Navigation Success");
        ExtentReporter.logPass("SSM_TC_03", "Validate back button to Ongoing Transaction Page back to Shop Safe Page");
    }
    //----------New
    public void SSM_TC_105_Verify_seller_Cancelled_Invites_Page () throws Exception {
        login.loginWalletBranchTier();
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.tap(shopSafeObjects.objShopSafeIconBtn(), "Shop Safe Icon Button");
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.tap(shopSafeObjects.objOngoingTransactTxtBtn(),"View all Invites Text Button");
        mobileGeneralMethod.waitSleep(3000);
        mobileGeneralMethod.tap(shopSafeObjects.objFirstInTab(),"New Invitation in Invites list");
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.tap(shopSafeObjects.objOngoingCancelBtn(),"Click Cancel Transaction");
        mobileGeneralMethod.isVisible(shopSafeObjects.objCancelModalLabel(), "Cancelled Modal Label");
        mobileGeneralMethod.tap(shopSafeObjects.objPaymentOkayBtn(),"Click Okay Button");
        mobileGeneralMethod.isVisible(shopSafeObjects.objSuccessfCancelledLabel(), "Cancelled Label");
        mobileGeneralMethod.tap(shopSafeObjects.objPaymentOkayBtn(),"Click Okay Button");

        LoggingUtils.info("View new invitations in Invites Page Success");
        ExtentReporter.logPass("SSM_TC_05", "To verify seller received invites click View Invitations Button in Invites Page");
    }
    //----------New
    public void SSM_TC_106_Verify_seller_Cancelled_DropOff_Invites_Page () throws Exception {
        login.loginWalletBranchTier();
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.tap(shopSafeObjects.objShopSafeIconBtn(), "Shop Safe Icon Button");
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.tap(shopSafeObjects.objOngoingTransactTxtBtn(),"View all Invites Text Button");
        mobileGeneralMethod.waitSleep(3000);
        mobileGeneralMethod.tap(shopSafeObjects.objFirstInTab(),"New Invitation in Invites list");
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.isVisible(shopSafeObjects.objSuccessfCancelledLabel(), "Cancelled Label");
        mobileGeneralMethod.tap(shopSafeObjects.objPaymentOkayBtn(),"Click Okay Button");

        LoggingUtils.info("View new invitations in Invites Page Success");
        ExtentReporter.logPass("SSM_TC_05", "To verify seller received invites click View Invitations Button in Invites Page");
    }

    //--------------------Invalid Input textbox
    public void SSM_TC_150_Validate_enter_characters_seller_number_in_Create_Transaction_Page() throws Exception {
        login.loginWalletBranchTier();
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.tap(shopSafeObjects.objShopSafeIconBtn(), "Shop Safe Icon Button");
        mobileGeneralMethod.tap(shopSafeObjects.objStartTransactBtn(), "Start Transaction Button");
        mobileGeneralMethod.type(shopSafeObjects.objSellerNoTxtbx(), propertyReader.getproperty("CharacterNumber"), "Enter Character");
        mobileGeneralMethod.tap(shopSafeObjects.objInviteSellerBtn(), "Invite Seller Button");
        mobileGeneralMethod.assertionValidation(mobileGeneralMethod.getText(shopSafeObjects.objGetErrMsg(propertyReader.getproperty("InvalidMobileNum"))), propertyReader.getproperty("InvalidMobileNum"));
        LoggingUtils.info("Prompt Display should be Mobile number is invalid");
        ExtentReporter.logPass("SSM_TC_03", "Validate enter characters seller number in Create Transaction Page");
    }

    public void SSM_TC_151_Validate_enter_decimal_seller_number_in_Create_Transaction_Page() throws Exception {
        login.loginWalletBranchTier();
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.tap(shopSafeObjects.objShopSafeIconBtn(), "Shop Safe Icon Button");
        mobileGeneralMethod.tap(shopSafeObjects.objStartTransactBtn(), "Start Transaction Button");
        mobileGeneralMethod.type(shopSafeObjects.objSellerNoTxtbx(), propertyReader.getproperty("DecimalNumber"), "Enter Decimal");
        mobileGeneralMethod.tap(shopSafeObjects.objInviteSellerBtn(), "Invite Seller Button");
        mobileGeneralMethod.assertionValidation(mobileGeneralMethod.getText(shopSafeObjects.objGetErrMsg(propertyReader.getproperty("InvalidMobileNum"))), propertyReader.getproperty("InvalidMobileNum"));
        LoggingUtils.info("Prompt Display should be Mobile number is invalid");
        ExtentReporter.logPass("SSM_TC_03", "Validate enter decimal seller number in Create Transaction Page");
    }

    public void SSM_TC_152_Validate_enter_empty_seller_number_in_Create_Transaction_Page() throws Exception {
        login.loginWalletBranchTier();
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.tap(shopSafeObjects.objShopSafeIconBtn(), "Shop Safe Icon Button");
        mobileGeneralMethod.tap(shopSafeObjects.objStartTransactBtn(), "Start Transaction Button");
        mobileGeneralMethod.tap(shopSafeObjects.objInviteSellerBtn(), "Invite Seller Button");
        mobileGeneralMethod.assertionValidation(mobileGeneralMethod.getText(shopSafeObjects.objGetErrMsg(propertyReader.getproperty("EmptyMobileNum"))), propertyReader.getproperty("EmptyMobileNum"));
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
