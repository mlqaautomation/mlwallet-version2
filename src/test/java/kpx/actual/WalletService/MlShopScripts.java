package kpx.actual.WalletService;

import kpx.base.BaseTest;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import utilities.ExtentReport.ExtentReporter;

import static org.testng.Assert.assertTrue;
import static utilities.Driver.AppiumDriverManager.APP_ID;
import static utilities.Driver.AppiumDriverManager.getAndroidDriver;

public class MlShopScripts extends BaseTest {
    @Test(description = "Test to verify app is installed")
    public void isAppInstalledTest(){
        assertTrue(getAndroidDriver().isAppInstalled(APP_ID));
        ExtentReporter.logPass("isAppInstalledTest", "MLWALLET is installed");
    }
//=========================================================================================================//


//    @Test(priority = 1)
//    public void mlWalletShopItems_Scenario() throws Exception
//    {
//        mlShop.shopItemsWithoutInputOtp_MLS_TC_04();
//    }
//
//    @Test(priority = 2)
//    public void shopItemsHamburgerMenuNavigation_MLS_TC_12() throws Exception {
//        mlShop.shopItemsHamburgerMenuNavigation_MLS_TC_12();
//    }
//
//    @Test(priority = 3)
//    public void shopItemsRespectivePageNavigationAfterSelectingAnCategory_MLS_TC_15() throws Exception {
//       mlShop.shopItemsRespectivePageNavigationAfterSelectingAnCategory_MLS_TC_15();
//    }
//
//    @Test(priority = 4)
//    public void shopItemsSelectedItemScreenUIValidation_MLS_TC_18() throws Exception {
//        mlShop.shopItemsSelectedItemScreenUIValidation_MLS_TC_18();
//    }
//
//
//    @Test(priority = 5)
//    public void shopItemsCartPageUIValidation_MLS_TC_19() throws Exception {
//        mlShop.shopItemsCartPageUIValidation_MLS_TC_19();
//    }
//
//    @Test(priority = 6)
//    public void shopItemsShippingDetailsPageUIValidation_MLS_TC_20() throws Exception {
//        mlShop.shopItemsShippingDetailsPageUIValidation_MLS_TC_20();
//    }
//
//
//    @Test(priority = 7)
//    public void shopItemsSelectBranchAddressPageUIValidation_MLS_TC_21() throws Exception {
//        mlShop.shopItemsSelectBranchAddressPageUIValidation_MLS_TC_21();
//    }
//
//    @Test(priority = 8)
//    public void shopItemsSaveBtnFunctionalityOnSelectBranchScreen_MLS_TC_22() throws Exception {
//        mlShop.shopItemsSaveBtnFunctionalityOnSelectBranchScreen_MLS_TC_22();
//    }
//
//    @Test(priority = 9)
//    public void shopItemsCancelBtnFunctionalityOnSelectBranchScreen_MLS_TC_23() throws Exception {
//        mlShop.shopItemsCancelBtnFunctionalityOnSelectBranchScreen_MLS_TC_23();
//    }
//
//   @Test(priority = 10)
//   public void shopItemsPlaceOrderBtnFunctionalityOnShippingDetailsScreen_MLS_TC_24() throws Exception {
//       mlShop.shopItemsPlaceOrderBtnFunctionalityOnShippingDetailsScreen_MLS_TC_24();
//   }
//
//   @Test(priority = 11)
//   public void shopItemsOneTimePinPageUIValidation_MLS_TC_25() throws Exception {
//       mlShop.shopItemsOneTimePinPageUIValidation_MLS_TC_25();
//   }
//
//   @Test(priority = 12)
//   public void shopItemsCancelBtnFunctionalityOnOTPScreen_MLS_TC_26() throws Exception {
//       mlShop.shopItemsCancelBtnFunctionalityOnOTPScreen_MLS_TC_26();
//   }
//
//   @Test(priority = 13)
//   public void shopItemsPlacingAnOrderWithOutSelectingPaymentMethod_MLS_TC_33() throws Exception {
//       mlShop.shopItemsPlacingAnOrderWithOutSelectingPaymentMethod_MLS_TC_33();
//   }
//
//   @Test(priority = 14)
//   public void shopItemsOkBtnFunctionalityOnErrorPopup_MLS_TC_34() throws Exception {
//       mlShop.shopItemsOkBtnFunctionalityOnErrorPopup_MLS_TC_34();
//   }
//
//   @Test(priority = 15)
//   public void shopItemsCartPageNavigation_MLS_TC_42() throws Exception {
//       mlShop.shopItemsCartPageNavigation_MLS_TC_42();
//   }
//
//   @Test(priority = 16)
//   public void shopItemsCancelBtnFunctionalityOnRemoveItemPopup_MLS_TC_43() throws Exception {
//       mlShop.shopItemsCancelBtnFunctionalityOnRemoveItemPopup_MLS_TC_43();
//   }
//
//   @Test(priority = 17)
//   public void shopItemsOkBtnFunctionalityOnRemoveItemPopup_MLS_TC_44() throws Exception {
//       mlShop.shopItemsOkBtnFunctionalityOnRemoveItemPopup_MLS_TC_44();
//   }
//
//   @Test(priority = 18)
//   public void shopItemsNavigationToProfileOption_MLS_TC_46() throws Exception {
//       mlShop.shopItemsNavigationToProfileOption_MLS_TC_46();
//   }
//
//   @Test(priority = 19)
//   public void shopItemsProfileScreenScreenNavigation_MLS_TC_47() throws Exception {
//       mlShop.shopItemsProfileScreenNavigation_MLS_TC_47();
//   }
//
//   @Test(priority = 20)
//   public void shopItemsMyAccountPopupCrossBtnFunctionality_MLS_TC_48() throws Exception {
//       mlShop.shopItemsMyAccountPopupCrossBtnFunctionality_MLS_TC_48();
//   }
//
//   @Test(priority = 21)
//   public void shopItemsMyPurchasePageNavigation_MLS_TC_49() throws Exception {
//       mlShop.shopItemsMyPurchasePageNavigation_MLS_TC_49();
//   }
//
//   @Test(priority = 22)
//   public void shopItemsSubTotalVerificationWithOutSelectingTheItemsInCart_MLS_TC_59() throws Exception {
//       mlShop.shopItemsSubTotalVerificationWithOutSelectingTheItemsInCart_MLS_TC_59();
//   }
//
//   @Test(priority = 23)
//   public void shopItemsSubTotalVerificationWithSelectingTheItemsInCart_MLS_TC_60() throws Exception {
//       mlShop.shopItemsSubTotalVerificationWithSelectingTheItemsInCart_MLS_TC_60();
//   }
//
//   @Test(priority = 24)
//   public void shopItemsAboutLinkFunctionality_MLS_TC_83() throws Exception {
//       mlShop.shopItemsAboutLinkFunctionality_MLS_TC_83();
//   }
//
//   @Test(priority = 25)
//   public void shopItemsContactLinkFunctionality_MLS_TC_84() throws Exception {
//       mlShop.shopItemsContactLinkFunctionality_MLS_TC_84();
//   }
//
//   @Test(priority = 26)
//   public void shopItemsGreatDealsForFineWatchesValidation_MLS_TC_85() throws Exception {
//       mlShop.shopItemsGreatDealsForFineWatchesValidation_MLS_TC_85();
//   }
//
//   @Test(priority = 27)
//   public void shopItemsProductDetailsValidation_MLS_TC_86() throws Exception {
//       mlShop.shopItemsProductDetailsValidation_MLS_TC_86();
//   }
//
//   @Test(priority = 28)
//   public void shopItemsCategoriesValidation_MLS_TC_88() throws Exception {
//       mlShop.shopItemsCategoriesValidation_MLS_TC_88();
//   }
//
//   @Test(priority = 29)
//   public void shopItemsAmparitoCollectionsProductTypesValidation_MLS_TC_89() throws Exception {
//       mlShop.shopItemsAmparitoCollectionsProductTypesValidation_MLS_TC_89();
//   }
//
//   @Test(priority = 30)
//   public void shopItemsAmparitoCollectionsRingProductTypeSubTypesValidation_MLS_TC_90() throws Exception {
//       mlShop.shopItemsAmparitoCollectionsRingProductTypeSubTypesValidation_MLS_TC_90();
//   }
//
//   @Test(priority = 31)
//   public void shopItemsAmparitoCollectionsNecklaceProductTypeSubTypesValidation_MLS_TC_91() throws Exception {
//       mlShop.shopItemsAmparitoCollectionsNecklaceProductTypeSubTypesValidation_MLS_TC_91();
//   }
//
//   @Test(priority = 32)
//   public void shopItemsAmparitoCollectionsBraceletAndBangleProductTypeSubTypesValidation_MLS_TC_92() throws Exception {
//       mlShop.shopItemsAmparitoCollectionsBraceletAndBangleProductTypeSubTypesValidation_MLS_TC_92();
//   }
//
//   @Test(priority = 33)
//   public void shopItemsAmparitoCollectionsEarringsProductTypeSubTypesValidation_MLS_TC_93() throws Exception {
//       mlShop.shopItemsAmparitoCollectionsEarringsProductTypeSubTypesValidation_MLS_TC_93();
//   }
//
//   @Test(priority = 34)
//   public void shopItemsAmparitoCollectionsPendantProductTypeSubTypesValidation_MLS_TC_94() throws Exception {
//       mlShop.shopItemsAmparitoCollectionsPendantProductTypeSubTypesValidation_MLS_TC_94();
//   }
//
//   @Test(priority = 35)
//   public void shopItemsAmparitoCollectionsTernoAndSetProductTypeSubTypesValidation_MLS_TC_95() throws Exception {
//       mlShop.shopItemsAmparitoCollectionsTernoAndSetProductTypeSubTypesValidation_MLS_TC_95();
//   }
//
//   @Test(priority = 36)
//   public void shopItemsAmparitoCollectionsWeddingRingProductTypeSubTypesValidation_MLS_TC_96() throws Exception {
//       mlShop.shopItemsAmparitoCollectionsWeddingRingProductTypeSubTypesValidation_MLS_TC_96();
//   }
//
//   @Test(priority = 37)
//   public void shopItemsAmparitoCollectionsPinBrouchAndScalpingProductTypeSubTypesValidation_MLS_TC_97() throws Exception {
//       mlShop.shopItemsAmparitoCollectionsPinBrouchAndScalpingProductTypeSubTypesValidation_MLS_TC_97();
//   }
//
//   @Test(priority = 38)
//   public void shopItemsAmparitoCollectionsWatchesProductTypeSubTypesValidation_MLS_TC_98() throws Exception {
//       mlShop.shopItemsAmparitoCollectionsWatchesProductTypeSubTypesValidation_MLS_TC_98();
//   }
//
//   @Test(priority = 39)
//   public void shopItemsGenderFilterValidation_MLS_TC_99() throws Exception {
//       mlShop.shopItemsGenderFilterValidation_MLS_TC_99();
//   }
//
//   @Test(priority = 40)
//   public void shopItemsColorFilterValidation_MLS_TC_100() throws Exception {
//       mlShop.shopItemsColorFilterValidation_MLS_TC_100();
//   }
//
//   @Test(priority = 41)
//   public void shopItemsKaratFilterValidation_MLS_TC_101() throws Exception {
//       mlShop.shopItemsKaratFilterValidation_MLS_TC_101();
//   }
//
//   @Test(priority = 42)
//   public void shopItemsPriceFilterValidation_MLS_TC_102() throws Exception {
//       mlShop.shopItemsPriceFilterValidation_MLS_TC_102();
//   }
//
//   @Test(priority = 43)
//   public void shopItemsProductDetailsPageValidation_MLS_TC_103() throws Exception {
//       mlShop.shopItemsProductDetailsPageValidation_MLS_TC_103();
//   }
//
//   @Test(priority = 44)
//   public void shopItemsSellerDetailsInProductDetailsPageValidation_MLS_TC_104() throws Exception {
//       mlShop.shopItemsSellerDetailsInProductDetailsPageValidation_MLS_TC_104();
//   }
//
//   @Test(priority = 45)
//   public void shopItemsYouMayAlsoBeInterestedInItemsDetailsValidation_MLS_TC_105() throws Exception {
//       mlShop.shopItemsYouMayAlsoBeInterestedInItemsDetailsValidation_MLS_TC_105();
//   }
//
//   @Test(priority = 46)
//   public void shopItemsYouMayAlsoBeInterestedInItemPageUIValidation_MLS_TC_106() throws Exception {
//       mlShop.shopItemsYouMayAlsoBeInterestedInItemPageUIValidation_MLS_TC_106();
//   }
//
//   @Test(priority = 47)
//   public void shopItemsProductDetailsPageViewShopButtonFunctionalityValidation_MLS_TC_107() throws Exception {
//       mlShop.shopItemsProductDetailsPageViewShopButtonFunctionalityValidation_MLS_TC_107();
//   }
//
//   @Test(priority = 48)
//   public void shopItemsPageUIValidation_MLS_TC_11() throws Exception {
//       mlShop.shopItemsPageUIValidation_MLS_TC_11();
//   }
//
//   @Test(priority = 49)
//   public void shopItemsSuccessfulLoginPopupValidation_MLS_TC_17() throws Exception {
//       mlShop.shopItemsSuccessfulLoginPopupValidation_MLS_TC_17();
//   }
//
//   @Test(priority = 50)
//   public void shopItemsPayUsingMLWalletOptionSelectionValidation_MLS_TC_35() throws Exception {
//       mlShop.shopItemsPayUsingMLWalletOptionSelectionValidation_MLS_TC_35();
//   }
//
//   @Test(priority = 51)
//   public void shopItemsPayUsingOnlineBankingOptionSelectionValidation_MLS_TC_36() throws Exception {
//       mlShop.shopItemsPayUsingOnlineBankingOptionSelectionValidation_MLS_TC_36();
//   }

        @Test(priority = 52)
        public void shopItemsSubTotalAmountValidationBeforeSelectingItems_MLS_TC_59() throws Exception {
            mlShop.shopItemsSubTotalAmountValidationBeforeSelectingItems_MLS_TC_59();
        }
//
//   @Test(priority = 53)
//   public void mlWallet_ShopItems_with_Insufficient_Balance() throws Exception {
//       mlShop.mlWallet_ShopItems_with_Insufficient_Balance();
//   }


        @Test(priority = 1)
        public void shopItemsAddedItemInCartDeletedPopupValidationCancelButton_MLS_TC_129() throws Exception
        {
            mlShop.shopItemsAddedItemInCartDeletedPopupValidationCancelButton_MLS_TC_129();
        }
        @Test(priority = 0)
        public void shopItemsAddedItemInCartDeletedPopupValidationExitButton_MLS_TC_131() throws Exception
        {
            mlShop.shopItemsAddedItemInCartDeletedPopupValidationExitButton_MLS_TC_131();
        }

        @Test(priority = 54)
        public void shopItemsClickYesButtonToRemoveItemsFromTheCart_MLS_TC_108() throws Exception {
            mlShop.shopItemsClickYesButtonToRemoveItemsFromTheCart_MLS_TC_108();
        }

}
