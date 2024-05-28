package org.mlwallet.pageObject;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.Driver.AppiumDriverManager;

import java.time.Duration;

public class MLWallet_PageObjects extends AppiumDriverManager{
    private final WebDriverWait wait = new WebDriverWait(AppiumDriverManager.getAndroidDriver(), Duration.ofSeconds(20));
    public WebElement mobileNum_editText(){
        return wait.until(ExpectedConditions.visibilityOf(driver.findElement(AppiumBy.xpath("//android.view.ViewGroup[@resource-id='967123']/child::android.view.ViewGroup/child::android.widget.EditText"))));
    }
    public WebElement login_btn(){
        return wait.until(ExpectedConditions.visibilityOf(driver.findElement(AppiumBy.xpath("//*[@resource-id='208465']"))));
    }
    public WebElement notifPermission_msg(){
        return driver.findElement(By.id("com.android.permissioncontroller:id/permission_message"));
    }
    public WebElement objEnterMpinVal (String mPin){
        return driver.findElement(By.xpath("//*[@text='"+mPin+"']"));
    }
    public WebElement notifPermission_allowBtn(){
        return driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_button"));
    }
    public WebElement otp_editText(int num){
        return driver.findElement(AppiumBy.ByAccessibilityId.accessibilityId("94NMBE-"+num+""));
    }
    public WebElement walletPin_btn(int num){
        return driver.findElement(AppiumBy.ByAccessibilityId.accessibilityId(""+num+""));
    }
    public WebElement cashIn_icon(){
        return driver.findElement(AppiumBy.ByAccessibilityId.accessibilityId("Cash In"));
    }

    public WebElement sendMoney_icon(){
        return driver.findElement(AppiumBy.ByAccessibilityId.accessibilityId("Send"));
    }
    public WebElement withDraw_icon(){
        return driver.findElement(AppiumBy.ByAccessibilityId.accessibilityId("Withdraw"));
    }
    public WebElement cashInBranch_icon(){
        return driver.findElement(AppiumBy.ByAccessibilityId.accessibilityId("ML Branch, \uE5CC"));
    }
    public WebElement amountEditText(){
        return wait.until(ExpectedConditions.visibilityOf(driver.findElement(AppiumBy.ByClassName.className("android.widget.EditText"))));
    }
    public WebElement next_btn(){
        return driver.findElement(AppiumBy.ByAccessibilityId.accessibilityId("Next"));
    }
    public WebElement next_next(){
        return driver.findElement(By.xpath("//android.widget.TextView[@text=\"Next\"]"));
    }
    public WebElement continue_btn(){
        return driver.findElement(AppiumBy.ByAccessibilityId.accessibilityId("Continue"));
    }
    public WebElement continue2_btn(){
        return driver.findElement(AppiumBy.ByAccessibilityId.accessibilityId("CONTINUE"));
    }
    public WebElement allowLocation(){
        return driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_foreground_only_button"));
    }
    public WebElement cashIn_KPTN(){
        return driver.findElement(By.xpath("//android.widget.TextView[@resource-id='0QMRD2']"));
    }

    public WebElement cashIn_TotalAmount(){
        return driver.findElement(AppiumBy.ById.id("08HQ6G"));
    }

    public WebElement usableBalance_Text(){
        return driver.findElement(By.xpath("//android.widget.TextView[@resource-id='UTJ9TN']"));
    }
    public WebElement exit_Icon(){
        return driver.findElement(AppiumBy.ByAccessibilityId.accessibilityId("\uE5CD"));
    }
    public WebElement sendMoney_branchOption(){
        return driver.findElement(AppiumBy.ByAccessibilityId.accessibilityId("Kwarta Padala, To any ML Branch, \uE5CC"));
    }
    public WebElement savedRecipient_kp(){
        return driver.findElement(By.xpath("//android.widget.TextView[@resource-id='M7Q0IV']"));
    }
    public WebElement firstRecipient_kp(){
        return driver.findElement(By.xpath("//android.view.ViewGroup[@resource-id='HQCZ6L']"));
    }
    public WebElement selectRecipient_button(){
        return driver.findElement(AppiumBy.ByAccessibilityId.accessibilityId("Select Recipient"));
    }
    public WebElement noMiddleName_button(){
        return driver.findElement(By.xpath("//android.widget.ImageView"));
    }
    public WebElement selectPayment_Wallet(){
        return driver.findElement(By.xpath("//android.view.ViewGroup[@resource-id='391CJJ']"));
    }
    public WebElement confirm_Btn(){
        return driver.findElement(AppiumBy.ByAccessibilityId.accessibilityId("Confirm"));
    }

    public WebElement kwartaPadala_KPTN(){
        return driver.findElement(By.xpath("//android.widget.TextView[@resource-id='56FWEC']"));
    }
    public WebElement BacktoHome(){
        return driver.findElement(By.xpath("//android.widget.TextView[@text=\"Back To Home\"]"));
    }

    public WebElement cashOut_icon(){
        return driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"Withdraw\"]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/com.horcrux.svg.SvgView/com.horcrux.svg.GroupView/com.horcrux.svg.PathView"));
    }
    public WebElement cashOut_MLBranch(){
        return driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"To any ML Branch, \uE5CC\"]/android.view.ViewGroup"));
    }
    public WebElement ContinueToCashOut(){
        return driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"Continue\"]"));
    }
    public WebElement CashOut_KPTN(){
        return driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"transaction-code\"]"));
    }































    //============================== Shop Safe
    public WebElement objGetErrMsg (String msg){
        return driver.findElement(By.xpath("//*[@text='"+msg+"']"));
    }

    public WebElement objEyeIcon(){
        return driver.findElement(By.xpath("//*[@resource-id='JKRBGQ']"));
    }
    public WebElement objAvailableBalance(){
        return driver.findElement(By.xpath("//*[@resource-id='0619JV']"));
    }
    //--------Home Dashboard
    public WebElement objShopSafeIconBtn(){
        return driver.findElement(By.xpath("//*[@text='ShopSafe']"));
    }
    //-------Shop Safe Page
    public WebElement objShopSafeLabel(){
        return driver.findElement(By.xpath("//*[@text='Shop Safe']"));
    }
    public WebElement objStartTransactBtn(){
        return driver.findElement(By.xpath("//*[@text='Start Transaction  +']"));
    }
    public WebElement objInvitesLabel(){
        return driver.findElement(By.xpath("//*[@text='Invites']"));
    }
    public WebElement objOngoingTransactLabel(){
        return driver.findElement(By.xpath("//*[@text='Ongoing Transactions']"));
    }
    public WebElement objCompletedTransactLabel(){
        return driver.findElement(By.xpath("//*[@text='Completed Transactions']"));
    }
    public WebElement objCancelledTransactLabel(){
        return driver.findElement(By.xpath("//*[@text='Cancelled Transactions']"));
    }
    public WebElement objReturnedTransactLabel(){
        return driver.findElement(By.xpath("//*[@text='Returned Transactions']"));
    }
    public WebElement objInvitesTransactTxtBtn(){
        return driver.findElement(By.xpath("(//android.view.ViewGroup[@content-desc=\"View All Invites\"])[1]/android.widget.TextView"));
    }
    public WebElement objOngoingTransactTxtBtn(){
        return driver.findElement(By.xpath("(//android.view.ViewGroup[@content-desc=\"View All Invites\"])[2]/android.widget.TextView"));
    }
    public WebElement objCompleteTransactTxtBtn(){
        return driver.findElement(By.xpath("(//android.view.ViewGroup[@content-desc=\"See More\"])[1]"));
    }
    public WebElement objCancelTransactTxtBtn(){
        return driver.findElement(By.xpath("(//android.view.ViewGroup[@content-desc=\"See More\"])[2]"));
    }

    //------- Create Transaction Page
    public WebElement objCreateTransactLabel(){
        return driver.findElement(By.xpath("//*[@text='Create Transaction']"));
    }
    public WebElement objBackBtn(){
        return driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"\uE5CB\"]/android.widget.TextView"));
    }
    public WebElement objSellerNoTxtbx(){
        return driver.findElement(By.xpath("//*[@text='Seller Mobile Number *']"));
    }
    public WebElement objInviteSellerBtn(){
        return driver.findElement(By.xpath("//*[@text='Invite Seller']"));
    }
    public WebElement objSuccessfInviteLabel(){
        return driver.findElement(By.xpath("//*[@text='Successfully Invited']"));
    }
    public WebElement objCancelModalLabel(){
        return driver.findElement(By.xpath("//*[@text='Do You Want to Cancel This Transaction?']"));
    }
    public WebElement objSuccessfCancelledLabel(){
        return driver.findElement(By.xpath("//*[@text='Successfully Cancelled']"));
    }
    public WebElement objOkayBtn(){
        return driver.findElement(By.xpath("//*[@text='Ok']"));
    }
    //-------Invites Transaction Page
    public WebElement objViewAllInvitation(){
        return driver.findElement(By.xpath("//*[@text='View All Invitation']"));
    }
    public WebElement objFirstInTab(){
        return driver.findElement(By.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]"));
    }

    //--------Buyer Invite Seller Page
    public WebElement objInvtesSellerLabel(){
        return driver.findElement(By.xpath("//*[@text='Seller Invitation']"));
    }
    public WebElement objBuyerDetailsLabel(){
        return driver.findElement(By.xpath("//*[@text='Buyer Details']"));
    }
    public WebElement objBuyerNameVal(){
        return driver.findElement(By.xpath("//*[@resource-id='X0AKRJ']/child::*[2]"));
    }
    public WebElement objBuyerNoVal(){
        return driver.findElement(By.xpath("//*[@resource-id='IMOO2V']/child::*[2]"));
    }
    public WebElement objSellerDetailsLabel(){
        return driver.findElement(By.xpath("//*[@text='Seller Details']"));
    }
    public WebElement objSellerNoVal(){
        return driver.findElement(By.xpath("//*[@resource-id='RTYWVC']/child::*[2]"));
    }
    public WebElement objCancelInviteBtn(){
        return driver.findElement(By.xpath("//*[@text='Cancel Invitation']"));
    }
    public WebElement objBackToHomesBtn(){
        return driver.findElement(By.xpath("//*[@text='Back To Home']"));
    }

    //--------Seller Received Invites Page
    public WebElement objPicOfItemBtn(){
        return driver.findElement(By.xpath("//*[@text='\uE3B0Pictures of your Item *']"));
    }
    public WebElement objItemNameTxtBx(){
        return driver.findElement(By.xpath("//*[@text='Item name *']"));
    }
    public WebElement objItemDescriptTxtBx(){
        return driver.findElement(By.xpath("//*[@text='Item description/condition *']"));
    }
    public WebElement objBrandTxtBx(){
        return driver.findElement(By.xpath("//*[@text='Brand (optional)']"));
    }
    public WebElement objModelNoTxtbox(){
        return driver.findElement(By.xpath("//*[@text='Model No (optional)']"));
    }
    public WebElement objItemQuantityTxtbx(){
        return driver.findElement(By.xpath("//*[@text='Item quantity *']"));
    }
    public WebElement objCategoryDropDownlist(){
        return driver.findElement(By.xpath("//*[@text='Category *']"));
    }
    public WebElement objItemPriceTxtbx(){
        return driver.findElement(By.xpath("//*[@text='Item price *']"));
    }
    public WebElement objWeightRangeDropDownList(){
        return driver.findElement(By.xpath("//*[@text='Choose weight range']"));
    }
    public WebElement objNearestDropOffGMap(){
        return driver.findElement(By.xpath("//*[@text='Please choose nearest drop off branch *']"));
    }
    public WebElement objProceedsBtn(){
        return driver.findElement(By.xpath("//*[@text='Proceed']"));
    }
    public WebElement objDeclineBtn(){
        return driver.findElement(By.xpath("//*[@text='Decline']"));
    }
    //-----Selection for Camera
    public WebElement objCameraBtn(){
        return driver.findElement(By.xpath("//*[@text='Camera']"));
    }
    public WebElement objGalleryBtn(){
        return driver.findElement(By.xpath("//*[@text='Gallery']"));
    }
    public WebElement objCancelsBtn(){
        return driver.findElement(By.xpath("//*[@text='Cancel']"));
    }
    public WebElement objCancels2Btn(){
        return driver.findElement(By.xpath("//*[@text='CANCEL']"));
    }
    public WebElement objAllowCameraWhileUsingAppBtn(){
        return driver.findElement(By.xpath("//*[@text='While using the app']"));
    }
    public WebElement objTakeAPicBtn(){
        return driver.findElement(By.xpath("//*[@resource-id='com.sec.android.app.camera:id/bottom_background']"));
    }
    public WebElement objTakeAPicOkBtn(){
        return driver.findElement(By.xpath("//*[@text='OK']"));
    }

    //-------------Select Category List
    public WebElement objSelectCategoryLabel(){
        return driver.findElement(By.xpath("//*[@text='Select Category']"));
    }
    public WebElement objSearchCategoryTxtbx(){
        return driver.findElement(By.xpath("//*[@text='Search Category']"));
    }
    public WebElement objClothesTxtBtn(){
        return driver.findElement(By.xpath("//*[@text='Clothes / Bag / Shoes']"));
    }
    public WebElement objElectronicsTxtBtn(){
        return driver.findElement(By.xpath("//*[@text='Electronics / Appliance']"));
    }
    public WebElement objJewelryTxtBtn(){
        return driver.findElement(By.xpath("//*[@text='Jewelry / Watches']"));
    }
    public WebElement objSportGoodTxtBtn(){
        return driver.findElement(By.xpath("//*[@text='Sporting Goods']"));
    }
    public WebElement objToolsTxtBtn(){
        return driver.findElement(By.xpath("//*[@text='Tools / Supplies / Paper']"));
    }
    public WebElement objOthersTxtBtn(){
        return driver.findElement(By.xpath("//*[@text='Others']"));
    }

    //-----------Select Weight Ranges List
    public WebElement objWeightRangeLabel(){
        return driver.findElement(By.xpath("//*[@text='Weight Range']"));
    }
    public WebElement objRateLabel(){
        return driver.findElement(By.xpath("//*[@text='Rate']"));
    }
    public WebElement obj0kgTxtBtn(){
        return driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"0.00 kg - 3.00kg, Php 195.00\"]"));
    }
    public WebElement obj3kgTxtBtn(){
        return driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"3.01 kg - 5.00kg, Php 375.00\"]"));
    }
    public WebElement obj5kgTxtBtn(){
        return driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"5.01 kg - 10.00kg, Php 875.00\"]"));
    }
    public WebElement obj10kgTxtBtn(){
        return driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"5.01 kg - 10.00kg, Php 875.00\"]"));
    }
    public WebElement obj20kgTxtBtn(){
        return driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"20.01 kg - 30.00kg, Php 3,000.00\"]"));
    }
    public WebElement obj30kgTxtBtn(){
        return driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"30.01 kg - 40.00kg, Php 6,500.00\"]"));
    }
    public WebElement obj40kgTxtBtn(){
        return driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"30.01 kg - 40.00kg, Php 6,500.00\"]"));
    }

    //-----------Select Drop Off Branch List

    public WebElement objAllowWhileUsingAppBtn(){
        return driver.findElement(By.xpath("//*[@text='While using the app']"));
    }
    public WebElement objSelectNearest(){
        return driver.findElement(By.xpath("//android.view.View[@content-desc=\"Google Map\"]/android.view.View[1]"));
    }
    public WebElement objBranchNameGMapVal(){
        return driver.findElement(By.xpath("(//*[@resource-id='DJCC83']/child::*/child::*)[1]"));
    }
    public WebElement objBranchAddressGMapVal(){
        return driver.findElement(By.xpath("(//*[@resource-id='DJCC83']/child::*/child::*)[2]"));
    }
    public WebElement objConfirmBranchBtn(){
        return driver.findElement(By.xpath("//*[@text='Confirm Branch']"));
    }
    //-----------Confirmation Page
    public WebElement objConfirmDetailsPage(){
        return driver.findElement(By.xpath("//*[@text='Confirm Details']"));
    }
    public WebElement objPicture(){
        return driver.findElement(By.xpath("(//*[@resource-id='X63NQ1']/child::*/child::*/child::*)[1]"));
    }
    public WebElement objRFTN(){
        return driver.findElement(By.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/child::android.view.ViewGroup[1]/child::android.widget.TextView\n"));
    }
    public WebElement objSRFTN(){
        return driver.findElement(By.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/child::android.view.ViewGroup[2]/child::android.widget.TextView\n"));
    }
    public WebElement objSellersDetailLabel(){
        return driver.findElement(By.xpath("//*[@text='Seller Details']"));
    }
    public WebElement objSellersNameVal(){
        return driver.findElement(By.xpath("(//*[@resource-id='Seller Name'])[2]"));
    }
    public WebElement objSellersNoVal(){
        return driver.findElement(By.xpath("(//*[@resource-id='Seller Mobile Number'])[2]"));
    }
    public WebElement objBuyersDetailLabel(){
        return driver.findElement(By.xpath("//*[@text='Buyer Details']"));
    }
    public WebElement objBuyersNameVal(){
        return driver.findElement(By.xpath("(//*[@resource-id='Buyer Name'])[2]"));
    }
    public WebElement objBuyersNoVal(){
        return driver.findElement(By.xpath("(//*[@resource-id='Buyer Mobile Number'])[2]"));
    }
    public WebElement objItemDetailsLabel(){
        return driver.findElement(By.xpath("//*[@text='Item details']"));
    }
    public WebElement objItemNameVal(){
        return driver.findElement(By.xpath("(//*[@resource-id='Item name'])[2]"));
    }
    public WebElement objItemDescriptVal(){
        return driver.findElement(By.xpath("(//*[@resource-id='Item description/condition'])[2]"));
    }
    public WebElement objBrandVal(){
        return driver.findElement(By.xpath("(//*[@resource-id='Brand'])[2]"));
    }
    public WebElement objModelNoVal(){
        return driver.findElement(By.xpath("(//*[@resource-id='Model No'])[2]"));
    }
    public WebElement objCategoryVal(){
        return driver.findElement(By.xpath("(//*[@resource-id='Category'])[2]"));
    }
    public WebElement objItemPriceVal(){
        return driver.findElement(By.xpath("(//*[@resource-id='Item price'])[2]"));
    }
    public WebElement objShipDetailLabel(){
        return driver.findElement(By.xpath("//*[@text='Shipping Details']"));
    }
    public WebElement objOriginBranchVal(){
        return driver.findElement(By.xpath("(//*[@resource-id='Origin Branch'])[2]"));
    }
    public WebElement objConfirmInvitationBtn(){
        return driver.findElement(By.xpath("//*[@text='Confirm Invitation']"));
    }
    public WebElement objBacksBtn(){
        return driver.findElement(By.xpath("//*[@text='Back']"));
    }
    
    //-----------Transaction Details Page
    public WebElement objTransactionDetailPage(){
        return driver.findElement(By.xpath(""));
    }
    public WebElement objRFTNTransact(){
        return driver.findElement(By.xpath("(//*[@resource-id='MQ33UF']/child::*/child::*)[2]"));
    }
    public WebElement objSellersDetailTransactLabel(){
        return driver.findElement(By.xpath("//*[@text='Seller Details']"));
    }
    public WebElement objSellersNameTransactVal(){
        return driver.findElement(By.xpath("(//*[@resource-id='Seller Name'])[2]"));
    }
    public WebElement objSellersNoTransactVal(){
        return driver.findElement(By.xpath("(//*[@resource-id='Seller Mobile Number'])[2]"));
    }
    public WebElement objBuyersDetailTransactLabel(){
        return driver.findElement(By.xpath("//*[@text='Buyer Details']"));
    }
    public WebElement objBuyersNameTransactVal(){
        return driver.findElement(By.xpath("(//*[@resource-id='Buyer Name'])[2]"));
    }
    public WebElement objBuyersNoTransactVal(){
        return driver.findElement(By.xpath("(//*[@resource-id='Buyer Mobile Number'])[2]"));
    }
    public WebElement objItemDetailsTransactLabel(){
        return driver.findElement(By.xpath("//*[@text='Item details']"));
    }
    public WebElement objItemNameTransactVal(){
        return driver.findElement(By.xpath("(//*[@resource-id='Item name'])[2]"));
    }
    public WebElement objItemDescriptTransactVal(){
        return driver.findElement(By.xpath("(//*[@resource-id='Item description/condition'])[2]"));
    }
    public WebElement objBrandTransactVal(){
        return driver.findElement(By.xpath("(//*[@resource-id='Brand'])[2]"));
    }
    public WebElement objModelNoTransactVal(){
        return driver.findElement(By.xpath("(//*[@resource-id='Model No'])[2]"));
    }
    public WebElement objCategoryTransactVal(){
        return driver.findElement(By.xpath("(//*[@resource-id='Category'])[2]"));
    }
    public WebElement objItemPriceTransactVal(){
        return driver.findElement(By.xpath("(//*[@resource-id='Item price'])[2]"));
    }
    public WebElement objShipDetailTransactLabel(){
        return driver.findElement(By.xpath("//*[@text='Shipping Details']"));
    }
    public WebElement objOriginBranchTransactVal(){
        return driver.findElement(By.xpath("(//*[@resource-id='Origin Branch'])[2]"));
    }
    public WebElement objPictureTransact(){
        return driver.findElement(By.xpath("(//*[@resource-id='LWPG92']/child::*/child::*/child::*)[1]"));
    }
    
    //----------- Ongoing Transaction
    public WebElement objOngoingDetailPageLabel(){
        return driver.findElement(By.xpath(""));
    }
    public WebElement objOngoingRFTN(){
        return driver.findElement(By.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/child::android.view.ViewGroup[2]/child::android.widget.TextView"));
    }
    public WebElement objDropOffRFTN(){
        return driver.findElement(By.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/child::android.view.ViewGroup[3]/child::android.widget.TextView"));
    }
    public WebElement objReadyFOrPickUPRFTN(){
        return driver.findElement(By.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/child::android.view.ViewGroup[3]/child::android.widget.TextView"));
    }
    public WebElement objCompleteRFTN(){
        return driver.findElement(By.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/child::android.view.ViewGroup[4]/child::android.widget.TextView"));
    }
    public WebElement objReadyForPickUPStatus(){
        return driver.findElement(By.xpath("//*[@text='Ready For Pickup (Buyer)']"));
    }
    public WebElement objCompleteStatus(){
        return driver.findElement(By.xpath("//*[@text='Complete']"));
    }
    public WebElement objOngoingDropOffStatus(){
        return driver.findElement(By.xpath("//*[@text='For Drop Off']"));
    }
    public WebElement objOngoingWaitPaymentStatus(){
        return driver.findElement(By.xpath("//*[@text='Waiting For Payment']"));
    }
    public WebElement objOngoingellersDetailLabel(){
        return driver.findElement(By.xpath("//*[@text='Seller Details']"));
    }
    public WebElement objOngoingSellersNameVal(){
        return driver.findElement(By.xpath("(//*[@resource-id='Seller Name'])[2]"));
    }
    public WebElement objOngoingSellersNoVal(){
        return driver.findElement(By.xpath("(//*[@resource-id='Seller Mobile Number'])[2]"));
    }
    public WebElement objOngoingBuyersDetailLabel(){
        return driver.findElement(By.xpath("//*[@text='Buyer Details']"));
    }
    public WebElement objOngoingBuyersNameVal(){
        return driver.findElement(By.xpath("(//*[@resource-id='Buyer Name'])[2]"));
    }
    public WebElement objOngoingBuyersNoVal(){
        return driver.findElement(By.xpath("(//*[@resource-id='Buyer Mobile Number'])[2]"));
    }
    public WebElement objOngoingItemDetailsLabel(){
        return driver.findElement(By.xpath("//*[@text='Item details']"));
    }
    public WebElement objOngoingItemNameVal(){
        return driver.findElement(By.xpath("(//*[@resource-id='Item name'])[2]"));
    }
    public WebElement objOngoingItemDescriptVal(){
        return driver.findElement(By.xpath("(//*[@resource-id='Item description/condition'])[2]"));
    }
    public WebElement objOngoingBrandVal(){
        return driver.findElement(By.xpath("(//*[@resource-id='Brand'])[2]"));
    }
    public WebElement objOngoingModelNoVal(){
        return driver.findElement(By.xpath("(//*[@resource-id='Model No'])[2]"));
    }
    public WebElement objOngoingCategoryVal(){
        return driver.findElement(By.xpath("(//*[@resource-id='Category'])[2]"));
    }
    public WebElement objOngoingItemPriceVal(){
        return driver.findElement(By.xpath("(//*[@resource-id='Item price'])[2]"));
    }
    public WebElement objOngoingShipDetailLabel(){
        return driver.findElement(By.xpath("//*[@text='Shipping Details']"));
    }
    public WebElement objOngoingOriginBranchVal(){
        return driver.findElement(By.xpath("(//*[@resource-id='Origin Branch'])[2]"));
    }
    public WebElement objOngoingDestinationBranchVal(){
        return driver.findElement(By.xpath("(//*[@resource-id='Destination branch'])[2]"));
    }
    public WebElement objOngoingSellerPicture(){
        return driver.findElement(By.xpath("(//*[@resource-id='LWPG92']/child::*/child::*/child::*)[1]"));
    }
    public WebElement objOngoingBuyerPicture(){
        return driver.findElement(By.xpath("(//*[@resource-id='ZN2H1C']/child::*/child::*/child::*)[1]"));
    }
    public WebElement objOngoingAcceptItem(){
        return driver.findElement(By.xpath("//*[@text='Accept Item']"));
    }
    public WebElement objOngoingDeclineItem(){
        return driver.findElement(By.xpath("//*[@text='Decline Item']"));
    }

    public WebElement objOngoingChooseNearestBranchBtn(){
        return driver.findElement(By.xpath("//*[@text='Please choose nearest pickup branch *']"));
    }
    public WebElement objOngoingGmapWhileUSingAppBtn(){
        return driver.findElement(By.xpath("//*[@text='While using the app']"));
            }
    public WebElement objOngoingSelectNearestBtn(){
        return driver.findElement(By.xpath("//android.view.View[@content-desc=\"Google Map\"]/android.view.View[1]\n"));
            }
    public WebElement objOngoingBranchNameGMapVal(){
        return driver.findElement(By.xpath("(//*[@resource-id='DJCC83']/child::*/child::*)[1]"));
    }
    public WebElement objOngoingBranchAddressGMapVal(){
        return driver.findElement(By.xpath("(//*[@resource-id='DJCC83']/child::*/child::*)[2]"));
    }
    public WebElement objOngoingPlsChooseBranchBtn(){
        return driver.findElement(By.xpath("//*[@text='Please Choose Branch']"));
    }
    public WebElement objOngoingOKBtn(){
        return driver.findElement(By.xpath("//*[@text='Ok']"));
    }
    public WebElement objOngoingConfirmBranchBtn(){
        return driver.findElement(By.xpath("//*[@text='Confirm Branch']"));
    }
    public WebElement objOngoingProceedToReviewBtn(){
        return driver.findElement(By.xpath("//*[@text='Proceed to review']"));
    }
    public WebElement objOngoingCancelBtn(){
        return driver.findElement(By.xpath("//*[@text='Cancel Transaction']"));
    }
    //----------- Terms and Condition
    public WebElement objTermsAndConditionsLabel(){
        return driver.findElement(By.xpath("//*[@text='Terms and Condition']"));
    }
    public WebElement objAcceptTermsAndConditionsBtn(){
        return driver.findElement(By.xpath("//*[@text='Accept Terms and Conditions']"));
    }
    public WebElement objTermsAndConditionsBackBtn(){
        return driver.findElement(By.xpath("//*[@text='Back']"));
    }
    //----------- Shop Safe Payment
    public WebElement objPaymentPicture(){
        return driver.findElement(By.xpath("(//*[@resource-id='XYK4G1']/child::*/child::*/child::*)"));
    }
    public WebElement objPaymentRFTN(){
        return driver.findElement(By.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/child::android.view.ViewGroup[2]/child::android.widget.TextView"));
    }
    public WebElement objPaymentSellersNameVal(){
        return driver.findElement(By.xpath("(//*[@resource-id='Seller Name'])[2]"));
    }
    public WebElement objPaymentSellersNoVal(){
        return driver.findElement(By.xpath("(//*[@resource-id='Seller Mobile Number'])[2]"));
    }
    public WebElement objPaymentBuyersDetailLabel(){
        return driver.findElement(By.xpath("//*[@text='Buyer Details']"));
    }
    public WebElement objPaymentBuyersNameVal(){
        return driver.findElement(By.xpath("(//*[@resource-id='Buyer Name'])[2]"));
    }
    public WebElement objPaymentBuyersNoVal(){
        return driver.findElement(By.xpath("(//*[@resource-id='Buyer Mobile Number'])[2]"));
    }
    public WebElement objPaymentItemDetailsLabel(){
        return driver.findElement(By.xpath("//*[@text='Item details']"));
    }
    public WebElement objPaymentItemNameVal(){
        return driver.findElement(By.xpath("(//*[@resource-id='Item name'])[2]"));
    }
    public WebElement objPaymentItemDescriptVal(){
        return driver.findElement(By.xpath("(//*[@resource-id='Item description/condition'])[2]"));
    }
    public WebElement objPaymentBrandVal(){
        return driver.findElement(By.xpath("(//*[@resource-id='Brand'])[2]"));
    }
    public WebElement objPaymentModelNoVal(){
        return driver.findElement(By.xpath("(//*[@resource-id='Model No'])[2]"));
    }
    public WebElement objPaymentCategoryVal(){
        return driver.findElement(By.xpath("(//*[@resource-id='Category'])[2]"));
    }
    public WebElement objPaymentItemPriceVal(){
        return driver.findElement(By.xpath("(//*[@resource-id='Item price'])[2]"));
    }
    public WebElement objShippingFeeVal(){
        return driver.findElement(By.xpath("//*[@text='Shipping Fee']/parent::android.view.ViewGroup/following-sibling::android.view.ViewGroup/child::android.widget.TextView"));
    }
    public WebElement objReturnShippingDepositDropOffVal(){
        return driver.findElement(By.xpath("//*[@text='Return Shipping Deposit']/parent::android.view.ViewGroup/following-sibling::android.view.ViewGroup/child::android.widget.TextView"));
    }
    public WebElement objReturnShippingDepositVal(){
        return driver.findElement(By.xpath("(//*[@resource-id='Return Shipping Deposit'])[2]"));
    }
    public WebElement objFeesLabel(){
        return driver.findElement(By.xpath("//*[@text='Fees']"));
    }
    public WebElement objInsuranceFeeVal(){
        return driver.findElement(By.xpath("(//*[@resource-id='Insurance Fee'])[2]"));
    }
    public WebElement objServiceFeeVal(){
        return driver.findElement(By.xpath("(//*[@resource-id='Service Fee'])[2]"));
    }
    public WebElement objTotalAmountVal(){
        return driver.findElement(By.xpath("(//*[@resource-id='Total Amount'])[2]"));
    }
    public WebElement objShippingDetailsLabel(){
        return driver.findElement(By.xpath("//*[@text='Shipping Details']"));
    }
    public WebElement objPaymentOriginBranchVal(){
        return driver.findElement(By.xpath("(//*[@resource-id='Origin Branch'])[2]"));
    }
    public WebElement objPaymentTotalAmountVal(){
        return driver.findElement(By.xpath("(//*[@resource-id='Destination branch'])[2]"));
    }
    public WebElement objPaymentAmountBtn(){
        return driver.findElement(By.xpath("//*[@text='Pay Amount']"));
    }
    public WebElement objPaymentBackBtn(){
        return driver.findElement(By.xpath("//*[@text='Back']"));
    }
    public WebElement objSuccessfulAcceptedLabel(){
        return driver.findElement(By.xpath("//*[@text='Successfully Accepted']"));
    }
    public WebElement objSuccessfulOkayBtn(){
        return driver.findElement(By.xpath("//*[@text='Okay']"));
    }
    public WebElement objSuccessfullyPaidLabel(){
        return driver.findElement(By.xpath("//*[@text='Successfully Paid']"));
    }
    public WebElement objPaymentOkayBtn(){
        return driver.findElement(By.xpath("//*[@text='Okay']"));
    }
    //----------- Cancelled Transaction
    public WebElement objCancelledDetailPageLabel(){
        return driver.findElement(By.xpath(""));
    }
    public WebElement objCancelledStatusLabel(){
        return driver.findElement(By.xpath("//*[@text='Buyer Details']"));
    }
    public WebElement objCancelledRFTN(){
        return driver.findElement(By.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/child::android.view.ViewGroup[2]/child::android.widget.TextView"));
    }
    public WebElement objCancelledellersDetailLabel(){
        return driver.findElement(By.xpath("//*[@text='Seller Details']"));
    }
    public WebElement objCancelledSellersNameVal(){
        return driver.findElement(By.xpath("(//*[@resource-id='Seller Name'])[2]"));
    }
    public WebElement objCancelledSellersNoVal(){
        return driver.findElement(By.xpath("(//*[@resource-id='Seller Mobile Number'])[2]"));
    }
    public WebElement objCancelledBuyersDetailLabel(){
        return driver.findElement(By.xpath("//*[@text='Buyer Details']"));
    }
    public WebElement objCancelledBuyersNameVal(){
        return driver.findElement(By.xpath("(//*[@resource-id='Buyer Name'])[2]"));
    }
    public WebElement objCancelledBuyersNoVal(){
        return driver.findElement(By.xpath("(//*[@resource-id='Buyer Mobile Number'])[2]"));
    }
    public WebElement objCancelledItemDetailsLabel(){
        return driver.findElement(By.xpath("//*[@text='Item details']"));
    }
    public WebElement objCancelledItemNameVal(){
        return driver.findElement(By.xpath("(//*[@resource-id='Item name'])[2]"));
    }
    public WebElement objCancelledItemDescriptVal(){
        return driver.findElement(By.xpath("(//*[@resource-id='Item description/condition'])[2]"));
    }
    public WebElement objCancelledBrandVal(){
        return driver.findElement(By.xpath("(//*[@resource-id='Brand'])[2]"));
    }
    public WebElement objCancelledModelNoVal(){
        return driver.findElement(By.xpath("(//*[@resource-id='Model No'])[2]"));
    }
    public WebElement objCancelledCategoryVal(){
        return driver.findElement(By.xpath("(//*[@resource-id='Category'])[2]"));
    }
    public WebElement objCancelledItemPriceVal(){
        return driver.findElement(By.xpath("(//*[@resource-id='Item price'])[2]"));
    }
    public WebElement objCancelledShipDetailLabel(){
        return driver.findElement(By.xpath("//*[@text='Shipping Details']"));
    }
    public WebElement objCancelledOriginBranchVal(){
        return driver.findElement(By.xpath("(//*[@resource-id='Origin Branch'])[2]"));
    }
    public WebElement objCancelledDestinationBranchVal(){
        return driver.findElement(By.xpath("(//*[@resource-id='Destination branch'])[2]"));
    }
    public WebElement objCancelledSellerPicture(){
        return driver.findElement(By.xpath("(//*[@resource-id='LWPG92']/child::*/child::*/child::*)[1]"));
    }
}

