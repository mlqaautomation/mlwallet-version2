package mlkpx.testSteps;

import org.testng.Assert;
import utilities.ExtentReport.ExtentReporter;

public class WS_ShopSafe_Steps extends Base_Steps{

//-------------------Positive Test
    public void To_Validate_Shop_Safe_Page_WS_SS_01()throws Exception{
        click(wsShopSafePageObjects.walletServicesLink(), "Wallet Services Page ");
        click(wsShopSafePageObjects.shopsafeTextheader(), "Shop Safe Header");
        if(isVisible(wsShopSafePageObjects.shopsafeTextheader(), "Shop Safe Header")){
            isVisible(wsShopSafePageObjects.referenceNoText(),"Reference No. Label");
            isVisible(wsShopSafePageObjects.referenceNoTxtbox(),"Reference No. Textbox Label");
            isVisible(wsShopSafePageObjects.searchBtn(), "Search Button");
            isVisible(wsShopSafePageObjects.scanQRCodeBtn(),"Scan QR Button");
            ExtentReporter.logPass("Shop Safe Page navigation", "Successfully Validated Shop Safe Page");
        }else{
            ExtentReporter.logFail("Shop Safe Page navigation", "Failed to Validate Shop Safe Page");
            Assert.fail("Failed to Validate Shop Safe Page");
        }
    }

    public void To_Validate_Valid_Reference_Number_WS_SS_02()throws Exception{
        click(wsShopSafePageObjects.walletServicesLink(), "Wallet Services Page ");
        click(wsShopSafePageObjects.shopsafeTextheader(), "Shop Safe Header");
        type(wsShopSafePageObjects.referenceNoTxtbox(), "Reference Number Field","" );
        click(wsShopSafePageObjects.searchBtn(), "");
        waitSleep(3000);
        if(isVisible(wsShopSafePageObjects.shopsafeTextNextheader(), "")){
            isVisible(wsShopSafePageObjects.TransactInfoText(),"");
            isVisible(wsShopSafePageObjects.OriginText(),"");
            isVisible(wsShopSafePageObjects.DestinationText(),"");
            isVisible(wsShopSafePageObjects.SellerText(),"");
            isVisible(wsShopSafePageObjects.BuyerText(),"");
            isVisible(wsShopSafePageObjects.ItemDetailsText(),"");
            scrollToElement(wsShopSafePageObjects.PhotosText());
            isVisible(wsShopSafePageObjects.PhotosText(),"");
            scrollToElement(wsShopSafePageObjects.SellerPhotosText());
            isVisible(wsShopSafePageObjects.SellerPhotosText(),"");
            scrollToElement(wsShopSafePageObjects.BuyerPhotosText());
            isVisible(wsShopSafePageObjects.BuyerPhotosText(),"");
            scrollToElement(wsShopSafePageObjects.TransactionDetailsText());
            isVisible(wsShopSafePageObjects.TransactionDetailsText(),"");
            isVisible(wsShopSafePageObjects.BuyerDetailsText(),"");
            isVisible(wsShopSafePageObjects.SellerDetailsText(),"");
            isVisible(wsShopSafePageObjects.AmountInformationText(),"");
            scrollToElement(wsShopSafePageObjects.TotalAmountText());
            isVisible(wsShopSafePageObjects.TotalAmountText(),"");
            scrollToElement(wsShopSafePageObjects.ParcelStatusText());
            isVisible(wsShopSafePageObjects.ParcelStatusText(),"");
            scrollToElement(wsShopSafePageObjects.TrackingNoTextbox());
            isVisible(wsShopSafePageObjects.TrackingNoTextbox(),"");
            scrollToElement(wsShopSafePageObjects.RemarksTxtbox());
            isVisible(wsShopSafePageObjects.RemarksTxtbox(),"");
            scrollToElement(wsShopSafePageObjects.BackBtn());
            isVisible(wsShopSafePageObjects.BackBtn(),"");
            scrollToElement(wsShopSafePageObjects.UpdateStatusBtn());
            isVisible(wsShopSafePageObjects.UpdateStatusBtn(),"");
            scrollToElement(wsShopSafePageObjects.PrintReceiptTxtBtn());
            isVisible(wsShopSafePageObjects.PrintReceiptTxtBtn(),"");
            ExtentReporter.logPass("Shop Safe Page navigation", "Successfully Validate Valid Reference Number");
        }else{
            ExtentReporter.logFail("Shop Safe Page navigation", "Failed to Validate Valid Reference Number");
            Assert.fail("Failed to Validate Shop Safe Page");
        }
    }

    public void To_Validate_Transaction_Information_WS_SS_03()throws Exception{
        click(wsShopSafePageObjects.walletServicesLink(), "Wallet Services Page ");
        click(wsShopSafePageObjects.shopsafeTextheader(), "Shop Safe Header");
        type(wsShopSafePageObjects.referenceNoTxtbox(), "Reference Number Field","" );
        click(wsShopSafePageObjects.searchBtn(), "");
        waitSleep(3000);
        if(isVisible(wsShopSafePageObjects.shopsafeTextNextheader(), "")){
            isVisible(wsShopSafePageObjects.OriginBranchVal(),"");
            isVisible(wsShopSafePageObjects.OperatorOriginVal(),"");
            isVisible(wsShopSafePageObjects.DateTimeOriginVal(),"");
            isVisible(wsShopSafePageObjects.DestinationBranchVal(),"");
            isVisible(wsShopSafePageObjects.OperatorDestinationVal(),"");
            isVisible(wsShopSafePageObjects.DateTimeDestinationVal(),"");
            isVisible(wsShopSafePageObjects.SellerNameVal(),"");
            isVisible(wsShopSafePageObjects.SellerContactNoVal(),"");
            isVisible(wsShopSafePageObjects.BuyerNameVal(),"");
            isVisible(wsShopSafePageObjects.BuyerContactNoVal(),"");
            isVisible(wsShopSafePageObjects.ItemNameVal(),"");
            isVisible(wsShopSafePageObjects.ItemDescriptionVal(),"");
            isVisible(wsShopSafePageObjects.BrandVal(),"");
            isVisible(wsShopSafePageObjects.ModelNoVal(),"");
            isVisible(wsShopSafePageObjects.CategoryVal(),"");
            isVisible(wsShopSafePageObjects.WeightVal(),"");
            scrollToElement(wsShopSafePageObjects.NoItemsVal());
            isVisible(wsShopSafePageObjects.NoItemsVal(),"");
            ExtentReporter.logPass("Shop Safe Page navigation", "Successfully Validate Transaction Information");
        }else{
            ExtentReporter.logFail("Shop Safe Page navigation", "Failed to Validate Transaction Information");
            Assert.fail("Failed to Validate Shop Safe Page");
        }
    }

    public void To_Validate_Item_Photo_WS_SS_04()throws Exception{
        click(wsShopSafePageObjects.walletServicesLink(), "Wallet Services Page ");
        click(wsShopSafePageObjects.shopsafeTextheader(), "Shop Safe Header");
        type(wsShopSafePageObjects.referenceNoTxtbox(), "Reference Number Field","" );
        click(wsShopSafePageObjects.searchBtn(), "");
        waitSleep(3000);
        if(isVisible(wsShopSafePageObjects.shopsafeTextNextheader(), "")){
            scrollToElement(wsShopSafePageObjects.ItemPhotosVal());
            isVisible(wsShopSafePageObjects.ItemPhotosVal(),"");
            ExtentReporter.logPass("Shop Safe Page navigation", "Successfully Validate Item Photo");
        }else{
            ExtentReporter.logFail("Shop Safe Page navigation", "Failed to Validate Item Photo");
            Assert.fail("Failed to Validate Shop Safe Page");
        }
    }

    public void To_Validate_Sellers_Photo_WS_SS_05()throws Exception{
        click(wsShopSafePageObjects.walletServicesLink(), "Wallet Services Page ");
        click(wsShopSafePageObjects.shopsafeTextheader(), "Shop Safe Header");
        type(wsShopSafePageObjects.referenceNoTxtbox(), "Reference Number Field","" );
        click(wsShopSafePageObjects.searchBtn(), "");
        waitSleep(3000);
        if(isVisible(wsShopSafePageObjects.shopsafeTextNextheader(), "")){
            scrollToElement(wsShopSafePageObjects.IdFrontSellerVal());
            isVisible(wsShopSafePageObjects.IdFrontSellerVal(),"");
            isVisible(wsShopSafePageObjects.IdBackSellerVal(),"");
            isVisible(wsShopSafePageObjects.CustomerPhotoSellerVal(),"");
            ExtentReporter.logPass("Shop Safe Page navigation", "Successfully Validate Sellers Photo");
        }else{
            ExtentReporter.logFail("Shop Safe Page navigation", "Failed to Validate Sellers Photo");
            Assert.fail("Failed to Validate Shop Safe Page");
        }
    }

    public void To_Validate_Buyer_Photo_WS_SS_06()throws Exception{
        click(wsShopSafePageObjects.walletServicesLink(), "Wallet Services Page ");
        click(wsShopSafePageObjects.shopsafeTextheader(), "Shop Safe Header");
        type(wsShopSafePageObjects.referenceNoTxtbox(), "Reference Number Field","" );
        click(wsShopSafePageObjects.searchBtn(), "");
        waitSleep(3000);
        if(isVisible(wsShopSafePageObjects.shopsafeTextNextheader(), "")){
            scrollToElement(wsShopSafePageObjects.IdFrontBuyerVal());
            isVisible(wsShopSafePageObjects.IdFrontBuyerVal(),"");
            isVisible(wsShopSafePageObjects.IdBackBuyerVal(),"");
            isVisible(wsShopSafePageObjects.CustomerPhotoBuyerVal(),"");
            ExtentReporter.logPass("Shop Safe Page navigation", "Successfully Validate Buyer Photo");
        }else{
            ExtentReporter.logFail("Shop Safe Page navigation", "Failed to Validate Buyer Photo");
            Assert.fail("Failed to Validate Shop Safe Page");
        }
    }

    public void To_Validate_Transaction_Details_WS_SS_07()throws Exception{
        click(wsShopSafePageObjects.walletServicesLink(), "Wallet Services Page ");
        click(wsShopSafePageObjects.shopsafeTextheader(), "Shop Safe Header");
        type(wsShopSafePageObjects.referenceNoTxtbox(), "Reference Number Field","" );
        click(wsShopSafePageObjects.searchBtn(), "");
        waitSleep(3000);
        if(isVisible(wsShopSafePageObjects.shopsafeTextNextheader(), "")){
            scrollToElement(wsShopSafePageObjects.IdTypeBuyerVal());
            isVisible(wsShopSafePageObjects.IdTypeBuyerVal(),"");
            isVisible(wsShopSafePageObjects.IdNoBuyerVal(),"");
            isVisible(wsShopSafePageObjects.ExpiryDateBuyerVal(),"");
            isVisible(wsShopSafePageObjects.VerficationLevelBuyerVal(),"");
            isVisible(wsShopSafePageObjects.IdTypeSellerVal(),"");
            isVisible(wsShopSafePageObjects.IdNoSellerVal(),"");
            isVisible(wsShopSafePageObjects.ExpiryDateSellerVal(),"");
            isVisible(wsShopSafePageObjects.VerficationLevelSellerVal(),"");
            ExtentReporter.logPass("Shop Safe Page navigation", "Successfully Validate Transaction Details");
        }else{
            ExtentReporter.logFail("Shop Safe Page navigation", "Failed to Validate Transaction Details");
            Assert.fail("Failed to Validate Shop Safe Page");
        }
    }

    public void To_Validate_Amount_Information_WS_SS_08()throws Exception{
        click(wsShopSafePageObjects.walletServicesLink(), "Wallet Services Page ");
        click(wsShopSafePageObjects.shopsafeTextheader(), "Shop Safe Header");
        type(wsShopSafePageObjects.referenceNoTxtbox(), "Reference Number Field","" );
        click(wsShopSafePageObjects.searchBtn(), "");
        waitSleep(3000);
        if(isVisible(wsShopSafePageObjects.shopsafeTextNextheader(), "")){
            scrollToElement(wsShopSafePageObjects.ItemPriceVal());
            isVisible(wsShopSafePageObjects.ItemPriceVal(),"");
            isVisible(wsShopSafePageObjects.ShippingFeeVal(),"");
            isVisible(wsShopSafePageObjects.ReturnShippingAndDepositVal(),"");
            isVisible(wsShopSafePageObjects.InsuranceFeeVal(),"");
            isVisible(wsShopSafePageObjects.ServiceFeeVal(),"");
            isVisible(wsShopSafePageObjects.TotalAmountVal(),"");
            ExtentReporter.logPass("Shop Safe Page navigation", "Successfully Validate Amount Information");
        }else{
            ExtentReporter.logFail("Shop Safe Page navigation", "Failed to Validate Amount Information");
            Assert.fail("Failed to Validate Shop Safe Page");
        }
    }

    public void To_Validate_Parcel_Status_As_Transit_WS_SS_09()throws Exception{
        click(wsShopSafePageObjects.walletServicesLink(), "Wallet Services Page ");
        click(wsShopSafePageObjects.shopsafeTextheader(), "Shop Safe Header");
        type(wsShopSafePageObjects.referenceNoTxtbox(), "Reference Number Field","" );
        click(wsShopSafePageObjects.searchBtn(), "");
        waitSleep(3000);
        if(isVisible(wsShopSafePageObjects.shopsafeTextNextheader(), "")){
            scrollToElement(wsShopSafePageObjects.StatusText());
            isVisible(wsShopSafePageObjects.StatusText(),"");
            ExtentReporter.logPass("Shop Safe Page navigation", "Successfully Validate Parcel Status As Transit");
        }else{
            ExtentReporter.logFail("Shop Safe Page navigation", "Failed to Validate Parcel Status As Transit");
            Assert.fail("Failed to Validate Shop Safe Page");
        }
    }

    public void To_Validate_Input_Tracking_Number_And_Remarks_WS_SS_10()throws Exception{
        click(wsShopSafePageObjects.walletServicesLink(), "Wallet Services Page ");
        click(wsShopSafePageObjects.shopsafeTextheader(), "Shop Safe Header");
        type(wsShopSafePageObjects.referenceNoTxtbox(), "Reference Number Field","" );
        click(wsShopSafePageObjects.searchBtn(), "");
        waitSleep(3000);
        if(isVisible(wsShopSafePageObjects.shopsafeTextNextheader(), "")){
            scrollToElement(wsShopSafePageObjects.PrintReceiptTxtBtn());
            type(wsShopSafePageObjects.TrackingNoTextbox(), "Tracking Number Field","" );
            type(wsShopSafePageObjects.RemarksTxtbox(), "Remarks Field","" );
            click(wsShopSafePageObjects.UpdateStatusBtn(), "");

            // status modal

            ExtentReporter.logPass("Shop Safe Page navigation", "Successfully Validate Input Tracking Number And Remarks");
        }else{
            ExtentReporter.logFail("Shop Safe Page navigation", "Failed to Validate Input Tracking Number And Remarks");
            Assert.fail("Failed to Validate Shop Safe Page");
        }
    }

    public void To_Validate_Update_Status_By_Clicking_Yes_Button_For_Transit_WS_SS_11()throws Exception{
        click(wsShopSafePageObjects.walletServicesLink(), "Wallet Services Page ");
        click(wsShopSafePageObjects.shopsafeTextheader(), "");
        type(wsShopSafePageObjects.referenceNoTxtbox(), "Reference Number Field","" );
        click(wsShopSafePageObjects.searchBtn(), "");
        waitSleep(3000);
        if(isVisible(wsShopSafePageObjects.shopsafeTextNextheader(), "")){
            scrollToElement(wsShopSafePageObjects.PrintReceiptTxtBtn());
            type(wsShopSafePageObjects.TrackingNoTextbox(), "Tracking Number Field","" );
            type(wsShopSafePageObjects.RemarksTxtbox(), "Remarks Field","" );
            click(wsShopSafePageObjects.UpdateStatusBtn(), "");
            //click(wsShopSafePageObjects.YesBtn(), "");

            // status modal

            ExtentReporter.logPass("Shop Safe Page navigation", "Successfully Validate Update Status By Clicking Yes Button");
        }else{
            ExtentReporter.logFail("Shop Safe Page navigation", "Failed to Validate Update Status By Clicking Yes Button");
            Assert.fail("Failed to Validate Shop Safe Page");
        }
    }

    public void To_Validate_Parcel_Status_As_Ready_for_Pick_Up_WS_SS_12()throws Exception{
        click(wsShopSafePageObjects.walletServicesLink(), "Wallet Services Page ");
        click(wsShopSafePageObjects.shopsafeTextheader(), "Shop Safe Header");
        type(wsShopSafePageObjects.referenceNoTxtbox(), "Reference Number Field","" );
        click(wsShopSafePageObjects.searchBtn(), "");
        waitSleep(3000);
        if(isVisible(wsShopSafePageObjects.shopsafeTextNextheader(), "")){
            scrollToElement(wsShopSafePageObjects.StatusText());
            isVisible(wsShopSafePageObjects.StatusText(),"");
            ExtentReporter.logPass("Shop Safe Page navigation", "Successfully Validate Parcel Status As Ready for Pick-Up");
        }else{
            ExtentReporter.logFail("Shop Safe Page navigation", "Failed to Validate Parcel Status As Ready for Pick-Up");
            Assert.fail("Failed to Validate Shop Safe Page");
        }
    }

    public void To_Validate_Input_Remarks_And_Clicking_Update_Status_Button_For_PickUp_WS_SS_13()throws Exception{
        click(wsShopSafePageObjects.walletServicesLink(), "Wallet Services Page ");
        click(wsShopSafePageObjects.shopsafeTextheader(), "Shop Safe Header");
        type(wsShopSafePageObjects.referenceNoTxtbox(), "Reference Number Field","" );
        click(wsShopSafePageObjects.searchBtn(), "");
        waitSleep(3000);
        if(isVisible(wsShopSafePageObjects.shopsafeTextNextheader(), "")){
            scrollToElement(wsShopSafePageObjects.PrintReceiptTxtBtn());
            type(wsShopSafePageObjects.TrackingNoTextbox(), "Tracking Number Field","" );
            type(wsShopSafePageObjects.RemarksTxtbox(), "Remarks Field","" );
            click(wsShopSafePageObjects.UpdateStatusBtn(), "");

            // status modal

            ExtentReporter.logPass("Shop Safe Page navigation", "Successfully Validate Parcel Status As Transit");
        }else{
            ExtentReporter.logFail("Shop Safe Page navigation", "Failed to Validate Parcel Status As Transit");
            Assert.fail("Failed to Validate Shop Safe Page");
        }
    }

    public void To_Validate_Parcel_Status_As_Transit_WS_SS_14()throws Exception{
        click(wsShopSafePageObjects.walletServicesLink(), "Wallet Services Page ");
        click(wsShopSafePageObjects.shopsafeTextheader(), "Shop Safe Header");
        type(wsShopSafePageObjects.referenceNoTxtbox(), "Reference Number Field","" );
        click(wsShopSafePageObjects.searchBtn(), "");
        waitSleep(3000);
        if(isVisible(wsShopSafePageObjects.shopsafeTextNextheader(), "")){
            scrollToElement(wsShopSafePageObjects.PrintReceiptTxtBtn());
            type(wsShopSafePageObjects.TrackingNoTextbox(), "Tracking Number Field","" );
            type(wsShopSafePageObjects.RemarksTxtbox(), "Remarks Field","" );
            click(wsShopSafePageObjects.UpdateStatusBtn(), "");
            //click(wsShopSafePageObjects.YesBtn(), "");

            // status modal

            ExtentReporter.logPass("Shop Safe Page navigation", "Successfully Validate Parcel Status As Transit");
        }else{
            ExtentReporter.logFail("Shop Safe Page navigation", "Failed to Validate Parcel Status As Transit");
            Assert.fail("Failed to Validate Shop Safe Page");
        }
    }

    public void To_Validate_Clicking_Complete_Button_For_PickUp_WS_SS_15()throws Exception{
        click(wsShopSafePageObjects.walletServicesLink(), "Wallet Services Page ");
        click(wsShopSafePageObjects.shopsafeTextheader(), "Shop Safe Header");
        type(wsShopSafePageObjects.referenceNoTxtbox(), "Reference Number Field","" );
        click(wsShopSafePageObjects.searchBtn(), "");
        waitSleep(3000);
        if(isVisible(wsShopSafePageObjects.shopsafeTextNextheader(), "")){
            scrollToElement(wsShopSafePageObjects.PrintReceiptTxtBtn());
            type(wsShopSafePageObjects.TrackingNoTextbox(), "Tracking Number Field","" );
            type(wsShopSafePageObjects.RemarksTxtbox(), "Remarks Field","" );
            click(wsShopSafePageObjects.UpdateStatusBtn(), "");
            click(wsShopSafePageObjects.CompleteBtn(), "");

            // status modal

            ExtentReporter.logPass("Shop Safe Page navigation", "Successfully Validate Parcel Status As Transit");
        }else{
            ExtentReporter.logFail("Shop Safe Page navigation", "Failed to Validate Parcel Status As Transit");
            Assert.fail("Failed to Validate Shop Safe Page");
        }
    }

//-----------------Negative  Test
    public void To_Validate_Empty_Reference_Number_WS_RR_01()throws Exception{
        click(wsShopSafePageObjects.walletServicesLink(), "Wallet Services Page ");
        click(wsShopSafePageObjects.shopsafeTextheader(), "Shop Safe Header");
        type(wsShopSafePageObjects.referenceNoTxtbox(), "Reference Number Field","" );
        click(wsShopSafePageObjects.searchBtn(), "");
        waitSleep(3000);
        if(isVisible(wsShopSafePageObjects.shopsafeText(), "")){
            isVisible(wsShopSafePageObjects.emptyErrorMessage(),"");
            ExtentReporter.logPass("Shop Safe Page navigation", "Successfully Validated Empty Reference Number");
        }else{
            ExtentReporter.logFail("Shop Safe Page navigation", "Failed to Validate Empty Reference Number");
            Assert.fail("Failed to Validate Shop Safe Page");
        }
    }

    public void To_Validate_Invalid_Reference_Number_WS_RR_02()throws Exception{
        click(wsShopSafePageObjects.walletServicesLink(), "Wallet Services Page ");
        click(wsShopSafePageObjects.shopsafeTextheader(), "Shop Safe Header");
        type(wsShopSafePageObjects.referenceNoTxtbox(), "Reference Number Field","" );
        click(wsShopSafePageObjects.searchBtn(), "");
        waitSleep(3000);
        if(isVisible(wsShopSafePageObjects.shopsafeText(), "")){

            isVisible(wsShopSafePageObjects.warningText(),"");
            isVisible(wsShopSafePageObjects.invaliderrorMessage(),"");
            isVisible(wsShopSafePageObjects.OkBtn(),"");
            click(wsShopSafePageObjects.OkBtn(), "");
            ExtentReporter.logPass("Shop Safe Page navigation", "Successfully Validated Empty Reference Number");
        }else{
            ExtentReporter.logFail("Shop Safe Page navigation", "Failed to Validate Empty Reference Number");
            Assert.fail("Failed to Validate Shop Safe Page");
        }
    }

    public void To_Validate_Empty_Tracking_Number_WS_RR_03()throws Exception{
        click(wsShopSafePageObjects.walletServicesLink(), "Wallet Services Page ");
        click(wsShopSafePageObjects.shopsafeTextheader(), "Shop Safe Header");
        type(wsShopSafePageObjects.referenceNoTxtbox(), "Reference Number Field","" );
        click(wsShopSafePageObjects.searchBtn(), "");
        waitSleep(3000);
        if(isVisible(wsShopSafePageObjects.shopsafeTextNextheader(), "")){
            scrollToElement(wsShopSafePageObjects.UpdateStatusBtn());
            click(wsShopSafePageObjects.UpdateStatusBtn(), "");
            ExtentReporter.logPass("Shop Safe Page navigation", "Successfully Validated Empty Tracking Number");
        }else{
            ExtentReporter.logFail("Shop Safe Page navigation", "Failed to Validate Empty Tracking Number");
            Assert.fail("Failed to Validate Shop Safe Page");
        }
    }

    public void To_Validate_Modal_Display_By_Clicking_Back_Button_WS_RR_04()throws Exception{
        click(wsShopSafePageObjects.walletServicesLink(), "Wallet Services Page ");
        click(wsShopSafePageObjects.shopsafeTextheader(), "Shop Safe Header");
        type(wsShopSafePageObjects.referenceNoTxtbox(), "Reference Number Field","" );
        click(wsShopSafePageObjects.searchBtn(), "");
        waitSleep(3000);
        if(isVisible(wsShopSafePageObjects.shopsafeTextNextheader(), "")){
            scrollToElement(wsShopSafePageObjects.BackBtn());
            click(wsShopSafePageObjects.BackBtn(),"");
            isVisible(wsShopSafePageObjects.CancelShopSafeUpdateText(),"");
            isVisible(wsShopSafePageObjects.CancelShopSafeUpdateNoteText(),"");
            isVisible(wsShopSafePageObjects.YesDoNotUpdateBtn(),"");
            isVisible(wsShopSafePageObjects.NoStayOnThisPageBtn(),"");
            ExtentReporter.logPass("Shop Safe Page navigation", "Successfully Validated Modal Display By Clicking Back Button");
        }else{
            ExtentReporter.logFail("Shop Safe Page navigation", "Failed to Validate Modal Display By Clicking Back Button");
            Assert.fail("Failed to Validate Shop Safe Page");
        }
    }

    public void To_Validate_Back_To_Wallet_Services_Page_WS_RR_05()throws Exception{
        click(wsShopSafePageObjects.walletServicesLink(), "Wallet Services Page ");
        click(wsShopSafePageObjects.shopsafeTextheader(), "Shop Safe Header");
        type(wsShopSafePageObjects.referenceNoTxtbox(), "Reference Number Field","" );
        click(wsShopSafePageObjects.searchBtn(), "");
        waitSleep(3000);
        if(isVisible(wsShopSafePageObjects.shopsafeTextNextheader(), "")){
            scrollToElement(wsShopSafePageObjects.BackBtn());
            click(wsShopSafePageObjects.BackBtn(),"");
            click(wsShopSafePageObjects.YesDoNotUpdateBtn(),"");
            isVisible(wsShopSafePageObjects.shopsafeTextheader(), "");
            isVisible(wsShopSafePageObjects.referenceNoTxtbox(), "" );
            ExtentReporter.logPass("Shop Safe Page navigation", "Successfully Validated Modal Display By Clicking Back Button");
        }else{
            ExtentReporter.logFail("Shop Safe Page navigation", "Failed to Validate Modal Display By Clicking Back Button");
            Assert.fail("Failed to Validate Shop Safe Page");
        }
    }

    public void To_Validate_Stay_In_The_Page_WS_RR_06()throws Exception{
        click(wsShopSafePageObjects.walletServicesLink(), "Wallet Services Page ");
        click(wsShopSafePageObjects.shopsafeTextheader(), "Shop Safe Header");
        type(wsShopSafePageObjects.referenceNoTxtbox(), "Reference Number Field","" );
        click(wsShopSafePageObjects.searchBtn(), "");
        waitSleep(3000);
        if(isVisible(wsShopSafePageObjects.shopsafeTextNextheader(), "")){
            scrollToElement(wsShopSafePageObjects.BackBtn());
            click(wsShopSafePageObjects.BackBtn(),"");
            click(wsShopSafePageObjects.NoStayOnThisPageBtn(),"");
            isVisible(wsShopSafePageObjects.BackBtn(), "");
            ExtentReporter.logPass("Shop Safe Page navigation", "Successfully Validated Modal Display By Clicking Back Button");
        }else{
            ExtentReporter.logFail("Shop Safe Page navigation", "Failed to Validate Modal Display By Clicking Back Button");
            Assert.fail("Failed to Validate Shop Safe Page");
        }
    }
//------------------------------------------Continue
    public void To_Validate_Stay_In_The_Page_WS_RR_07()throws Exception{
        click(wsShopSafePageObjects.walletServicesLink(), "Wallet Services Page ");
        click(wsShopSafePageObjects.shopsafeTextheader(), "Shop Safe Header");
        type(wsShopSafePageObjects.referenceNoTxtbox(), "Reference Number Field","" );
        click(wsShopSafePageObjects.searchBtn(), "");
        waitSleep(3000);
        if(isVisible(wsShopSafePageObjects.shopsafeTextNextheader(), "")){
            scrollToElement(wsShopSafePageObjects.BackBtn());
            click(wsShopSafePageObjects.BackBtn(),"");
            click(wsShopSafePageObjects.NoStayOnThisPageBtn(),"");
            isVisible(wsShopSafePageObjects.BackBtn(), "");
            ExtentReporter.logPass("Shop Safe Page navigation", "Successfully Validated Modal Display By Clicking Back Button");
        }else{
            ExtentReporter.logFail("Shop Safe Page navigation", "Failed to Validate Modal Display By Clicking Back Button");
            Assert.fail("Failed to Validate Shop Safe Page");
        }
    }

    public void To_Validate_Stay_In_The_Page_WS_RR_08()throws Exception{
        click(wsShopSafePageObjects.walletServicesLink(), "Wallet Services Page ");
        click(wsShopSafePageObjects.shopsafeTextheader(), "Shop Safe Header");
        type(wsShopSafePageObjects.referenceNoTxtbox(), "Reference Number Field","" );
        click(wsShopSafePageObjects.searchBtn(), "");
        waitSleep(3000);
        if(isVisible(wsShopSafePageObjects.shopsafeTextNextheader(), "")){
            scrollToElement(wsShopSafePageObjects.BackBtn());
            click(wsShopSafePageObjects.BackBtn(),"");
            click(wsShopSafePageObjects.NoStayOnThisPageBtn(),"");
            isVisible(wsShopSafePageObjects.BackBtn(), "");
            ExtentReporter.logPass("Shop Safe Page navigation", "Successfully Validated Modal Display By Clicking Back Button");
        }else{
            ExtentReporter.logFail("Shop Safe Page navigation", "Failed to Validate Modal Display By Clicking Back Button");
            Assert.fail("Failed to Validate Shop Safe Page");
        }
    }

}
