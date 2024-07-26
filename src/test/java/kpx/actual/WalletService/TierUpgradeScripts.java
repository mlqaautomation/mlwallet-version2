package kpx.actual.WalletService;
import kpx.base.BaseTest;
import org.testng.annotations.Test;
import static org.testng.Assert.assertTrue;

public class TierUpgradeScripts extends BaseTest {
    //    ------Positive Testing
//    @Test(priority = 1, description = "settingsAccountDetailsValidation_01")
//    public void tierUpgradeHomePageIIconValidationAsBuyerTierUser_01() throws Exception {
//        tierUpgrade.tierUpgradeHomePageIIconValidationAsBuyerTierUser_TU_TC_01();
//    }
//    @Test(priority = 2, description = "tierUpgradeHomePageIIconValidationAsSemiVerifiedTierUser_02")
//    public void tierUpgradeHomePageIIconValidationAsSemiVerifiedTierUser_02() throws Exception {
//        tierUpgrade.tierUpgradeHomePageIIconValidationAsSemiVerifiedTierUser_TU_TC_02();
//    }
//    @Test(priority = 3, description = "tierUpgradeVerificationTierPerksPageNavigationAsBuyerTierUser_04")
//    public void tierUpgradeVerificationTierPerksPageNavigationAsBuyerTierUser_04() throws Exception {
//        tierUpgrade.tierUpgradeVerificationTierPerksPageNavigationAsBuyerTierUser_TU_TC_04();
//    }
//    @Test(priority = 4, description = "tierUpgradeVerificationTierPerksPageNavigationAsSemiVerifiedTierUser_05")
//    public void tierUpgradeVerificationTierPerksPageNavigationAsSemiVerifiedTierUser_05() throws Exception {
//        tierUpgrade.tierUpgradeVerificationTierPerksPageNavigationAsSemiVerifiedTierUser_TU_TC_05();
//    }
//    @Test(priority = 5, description = "tierUpgradeVerificationTierPerksBackBtnValidation_06")
//    public void tierUpgradeVerificationTierPerksBackBtnValidation_06() throws Exception {
//        tierUpgrade.tierUpgradeVerificationTierPerksBackBtnValidation_TU_TC_06();
//    }
//    @Test(priority = 6, description = "tierUpgradeUpgradeTierLevelBtnValidationForSemiVerifiedTabAsBuyTierUser_07")
//    public void tierUpgradeUpgradeTierLevelBtnValidationForSemiVerifiedTabAsBuyTierUser_07() throws Exception {
//        tierUpgrade.tierUpgradeUpgradeTierLevelBtnValidationForSemiVerifiedTabAsBuyTierUser_TU_TC_07();
//    }
//    @Test(priority = 7, description = "tierUpgradeUpgradeTierLevelBtnValidationForFullyVerifiedTabAsBuyTierUser_08")
//    public void tierUpgradeUpgradeTierLevelBtnValidationForFullyVerifiedTabAsBuyTierUser_08() throws Exception {
//        tierUpgrade.tierUpgradeUpgradeTierLevelBtnValidationForFullyVerifiedTabAsBuyTierUser_TU_TC_08();
//    }
//    @Test(priority = 8, description = "tierUpgradeUpgradeTierLevelBtnValidationForBranchVerifiedTabAsBuyerTierUser_09")
//    public void tierUpgradeUpgradeTierLevelBtnValidationForBranchVerifiedTabAsBuyerTierUser_09() throws Exception {
//        tierUpgrade.tierUpgradeUpgradeTierLevelBtnValidationForBranchVerifiedTabAsBuyerTierUser_TU_TC_09();
//    }
//    @Test(priority = 9, description = "tierUpgradeUpgradeTierLevelBtnValidationForFullyVerifiedTabAsSemiVerifiedTierUser_10")
//    public void tierUpgradeUpgradeTierLevelBtnValidationForFullyVerifiedTabAsSemiVerifiedTierUser_10() throws Exception {
//        tierUpgrade.tierUpgradeUpgradeTierLevelBtnValidationForFullyVerifiedTabAsSemiVerifiedTierUser_TU_TC_10();
//    }
//    @Test(priority = 10, description = "tierUpgradeUpgradeTierLevelBtnValidationForBranchVerifiedTabAsSemiVerifiedTierUser_11")
//    public void tierUpgradeUpgradeTierLevelBtnValidationForBranchVerifiedTabAsSemiVerifiedTierUser_11() throws Exception {
//        tierUpgrade.tierUpgradeUpgradeTierLevelBtnValidationForBranchVerifiedTabAsSemiVerifiedTierUser_TU_TC_11();
//    }
//    @Test(priority = 11, description = "tierUpgradeAccountDetailsPageNavigationAsBuyerTierUserToUpgradeToSemiVerifiedTier_TU_TC_12")
//    public void tierUpgradeAccountDetailsPageNavigationAsBuyerTierUserToUpgradeToSemiVerifiedTier_TU_TC_12() throws Exception {
//        tierUpgrade.tierUpgradeAccountDetailsPageNavigationAsBuyerTierUserToUpgradeToSemiVerifiedTier_TU_TC_12();
//    }
//    @Test(priority = 12, description = "tierUpgradeAccountDetailsPageNavigationAsBuyerTierUserToUpgradeToFullyVerifiedTier_TU_TC_13")
//    public void tierUpgradeAccountDetailsPageNavigationAsBuyerTierUserToUpgradeToFullyVerifiedTier_TU_TC_13() throws Exception {
//        tierUpgrade.tierUpgradeAccountDetailsPageNavigationAsBuyerTierUserToUpgradeToFullyVerifiedTier_TU_TC_13();
//    }
//    @Test(priority = 13, description = "tierUpgradeAccountDetailsPageNavigationAsSemiVerifiedTierUserToUpgradeToFullyVerifiedTier_14")
//    public void tierUpgradeAccountDetailsPageNavigationAsSemiVerifiedTierUserToUpgradeToFullyVerifiedTier_14() throws Exception {
//        tierUpgrade.tierUpgradeAccountDetailsPageNavigationAsSemiVerifiedTierUserToUpgradeToFullyVerifiedTier_TU_TC_14();
//    }
//    @Test(priority = 14, description = "tierUpgradeAccountDetailsPageBackBtnValidation_15")
//    public void tierUpgradeAccountDetailsPageBackBtnValidation_15() throws Exception {
//        tierUpgrade.tierUpgradeAccountDetailsPageBackBtnValidation_TU_TC_15();
//    }
//    @Test(priority = 15, description = "tierUpgradeAccountDetailsPageValidation_16")
//    public void tierUpgradeAccountDetailsPageValidation_16() throws Exception {
//        tierUpgrade.tierUpgradeAccountDetailsPageValidation_TU_TC_16();
//    }
//    @Test(priority = 16, description = "tierUpgradeAccountDetailsPageNationalityValidation_17")
//    public void tierUpgradeAccountDetailsPageNationalityValidation_17() throws Exception {
//        tierUpgrade.tierUpgradeAccountDetailsPageNationalityValidation_TU_TC_17();
//    }
//    @Test(priority = 17, description = "tierUpgradeAccountDetailsPageCivilStatusValidation_18")
//    public void tierUpgradeAccountDetailsPageCivilStatusValidation_18() throws Exception {
//        tierUpgrade.tierUpgradeAccountDetailsPageCivilStatusValidation_TU_TC_18();
//    }
//    @Test(priority = 18, description = "tierUpgradeAccountDetailsPageGenderAtBirthValidation_19")
//    public void tierUpgradeAccountDetailsPageGenderAtBirthValidation_19() throws Exception {
//        tierUpgrade.tierUpgradeAccountDetailsPageGenderAtBirthValidation_TU_TC_19();
//    }
//    @Test(priority = 19, description = "tierUpgradeAccountDetailsPageSourceOfIncomeValidation_20")
//    public void tierUpgradeAccountDetailsPageSourceOfIncomeValidation_20() throws Exception {
//        tierUpgrade.tierUpgradeAccountDetailsPageSourceOfIncomeValidation_TU_TC_20();
//    }
//    @Test(priority = 20, description = "tierUpgradeAccountDetailsPageSelectNationalityValidation_21")
//    public void tierUpgradeAccountDetailsPageSelectNationalityValidation_21() throws Exception {
//        tierUpgrade.tierUpgradeAccountDetailsPageSelectNationalityValidation_TU_TC_21();
//    }
//    @Test(priority = 21, description = "tierUpgradeAccountDetailsPageSelectCivilStatusValidation_22")
//    public void tierUpgradeAccountDetailsPageSelectCivilStatusValidation_22() throws Exception {
//        tierUpgrade.tierUpgradeAccountDetailsPageSelectCivilStatusValidation_TU_TC_22();
//    }
//    @Test(priority = 22, description = "tierUpgradeAccountDetailsPageSelectGenderAtBirthValidation_23")
//    public void tierUpgradeAccountDetailsPageSelectGenderAtBirthValidation_23() throws Exception {
//        tierUpgrade.tierUpgradeAccountDetailsPageSelectGenderAtBirthValidation_TU_TC_23();
//    }
//    @Test(priority = 23, description = "tierUpgradeAccountDetailsPageSelectSourceOfIncomeValidation_24")
//    public void tierUpgradeAccountDetailsPageSelectSourceOfIncomeValidation_24() throws Exception {
//        tierUpgrade.tierUpgradeAccountDetailsPageSelectSourceOfIncomeValidation_TU_TC_24();
//    }
//    @Test(priority = 24, description = "tierUpgradeConfirmDetailsBtnValidationInAccountDetailsPage_25")
//    public void tierUpgradeConfirmDetailsBtnValidationInAccountDetailsPage_25() throws Exception {
//        tierUpgrade.tierUpgradeConfirmDetailsBtnValidationInAccountDetailsPage_TU_TC_25();
//    }
//    @Test(priority = 25, description = "tierUpgradePageNavigation_26")
//    public void tierUpgradePageNavigation_26() throws Exception {
//        tierUpgrade.tierUpgradePageNavigation_TU_TC_26();
//    }
//    @Test(priority = 26, description = "tierUpgradeFullyVerifiedTierTabUIValidation_27")
//    public void tierUpgradeFullyVerifiedTierTabUIValidation_27() throws Exception {
//        tierUpgrade.tierUpgradeFullyVerifiedTierTabUIValidation_TU_TC_27();
//    }
//    @Test(priority = 27, description = "tierUpgradeAccountDetailsPageUIValidation_28")
//    public void tierUpgradeAccountDetailsPageUIValidation_28() throws Exception {
//        tierUpgrade.tierUpgradeAccountDetailsPageUIValidation_TU_TC_28();
//    }
//    @Test(priority = 28, description = "tierUpgradePageUIValidation_29")
//    public void tierUpgradePageUIValidation_29() throws Exception {
//        tierUpgrade.tierUpgradePageUIValidation_TU_TC_29();
//    }
//    @Test(priority = 29, description = "tierUpgradeBackArrowBtnValidation_30")
//    public void tierUpgradeBackArrowBtnValidation_30() throws Exception {
//        tierUpgrade.tierUpgradeBackArrowBtnValidation_TU_TC_30();
//    }
//    @Test(priority = 30, description = "tierUpgradeUploadIDPhotosUIValidationAfterSelectingPHILHEALTH_31")
//    public void tierUpgradeUploadIDPhotosUIValidationAfterSelectingPHILHEALTH_31() throws Exception {
//        tierUpgrade.tierUpgradeUploadIDPhotosUIValidationAfterSelectingPHILHEALTH_TU_TC_31();
//    }
//    @Test(priority = 31, description = "tierUpgradeUploadIDPhotosBackArrowBtnValidation_32")
//    public void tierUpgradeUploadIDPhotosBackArrowBtnValidation_32() throws Exception {
//        tierUpgrade.tierUpgradeUploadIDPhotosBackArrowBtnValidation_TU_TC_32();
//    }
//    @Test(priority = 32, description = "tierUpgradeScanFrontOfIDPageUIValidation_33")
//    public void tierUpgradeScanFrontOfIDPageUIValidation_33() throws Exception {
//        tierUpgrade.tierUpgradeScanFrontOfIDPageUIValidation_TU_TC_33();
//    }
//    @Test(priority = 33, description = "tierUpgradeScanFrontOfIDPageBackArrowBtnValidation_34")
//    public void tierUpgradeScanFrontOfIDPageBackArrowBtnValidation_34() throws Exception {
//        tierUpgrade.tierUpgradeScanFrontOfIDPageBackArrowBtnValidation_TU_TC_34();
//    }
//    @Test(priority = 34, description = "tierUpgradeScanBackOfIDPageUIValidation_35")
//    public void tierUpgradeScanBackOfIDPageUIValidation_35() throws Exception {
//        tierUpgrade.tierUpgradeScanBackOfIDPageUIValidation_TU_TC_35();
//    }
//    @Test(priority = 35, description = "tierUpgradeScanBackOfIDPageBackArrowBtnValidation_36")
//    public void tierUpgradeScanBackOfIDPageBackArrowBtnValidation_36() throws Exception {
//        tierUpgrade.tierUpgradeScanBackOfIDPageBackArrowBtnValidation_TU_TC_36();
//    }
//    @Test(priority = 36, description = "tierUpgradeTakeAFaceIdentityPhotoPageUIValidation_37")
//    public void tierUpgradeTakeAFaceIdentityPhotoPageUIValidation_37() throws Exception {
//        tierUpgrade.tierUpgradeTakeAFaceIdentityPhotoPageUIValidation_TU_TC_37();
//    }
//    @Test(priority = 37, description = "tierUpgradeTakeAFaceIdentityPhotoPageBackArrowBtnValidation_38")
//    public void tierUpgradeTakeAFaceIdentityPhotoPageBackArrowBtnValidation_38() throws Exception {
//        tierUpgrade.tierUpgradeTakeAFaceIdentityPhotoPageBackArrowBtnValidation_TU_TC_38();
//    }
//    @Test(priority = 38, description = "TierUpgradeCompanyFieldValidation_39")
//    public void TierUpgradeCompanyFieldValidation_39() throws Exception {
//        tierUpgrade.TierUpgradeCompanyFieldValidation_TU_TC_39();
//    }
//    @Test(priority = 39, description = "TierUpgradeOrganizationNameFieldValidation_40")
//    public void TierUpgradeOrganizationNameFieldValidation_40() throws Exception {
//        tierUpgrade.TierUpgradeOrganizationNameFieldValidation_TU_TC_40();
//    }
//    @Test(priority = 40, description = "TierUpgradeProductServicesFieldValidation_41")
//    public void TierUpgradeProductServicesFieldValidation_41() throws Exception {
//        tierUpgrade.TierUpgradeProductServicesFieldValidation_TU_TC_41();
//    }
//    @Test(priority = 41, description = "TierUpgradeEmptyAddressFieldValidation_42")
//    public void TierUpgradeEmptyAddressFieldValidation_42() throws Exception {
//        tierUpgrade.TierUpgradeEmptyAddressFieldValidation_TU_TC_42();
//    }
//    @Test(priority = 42, description = "TierUpgradeSpecialAddressFieldValidation_43")
//    public void TierUpgradeSpecialAddressFieldValidation_43() throws Exception {
//        tierUpgrade.TierUpgradeSpecialAddressFieldValidation_TU_TC_43();
//    }
//    @Test(priority = 43, description = "TierUpgradePositionFieldValidation_44")
//    public void TierUpgradePositionFieldValidation_44() throws Exception {
//        tierUpgrade.TierUpgradePositionFieldValidation_TU_TC_44();
//    }
//    @Test(priority = 44, description = "TierUpgradeNatureOfWorkFieldValidation_45")
//    public void TierUpgradeNatureOfWorkFieldValidation_45() throws Exception {
//        tierUpgrade.TierUpgradeNatureOfWorkFieldValidation_TU_TC_45();
//    }
//    @Test(priority = 45, description = "TierUpgradePensionFieldValidation_46")
//    public void TierUpgradePensionFieldValidation_46() throws Exception {
//        tierUpgrade.TierUpgradePensionFieldValidation_TU_TC_46();
//    }
//    @Test(priority = 46, description = "TierUpgradeYearRetiredFieldValidation_47")
//    public void TierUpgradeYearRetiredFieldValidation_47() throws Exception {
//        tierUpgrade.TierUpgradeYearRetiredFieldValidation_TU_TC_47();
//    }
//    @Test(priority = 47, description = "TierUpgradePositionRetirementFieldValidation_48")
//    public void TierUpgradePositionRetirementFieldValidation_48() throws Exception {
//        tierUpgrade.TierUpgradePositionRetirementFieldValidation_TU_TC_48();
//    }
//    @Test(priority = 48, description = "TierUpgradeRemarksFieldValidation_49")
//    public void TierUpgradeRemarksFieldValidation_49() throws Exception {
//        tierUpgrade.TierUpgradeRemarksFieldValidation_TU_TC_49();
//    }
//    @Test(priority = 49, description = "TierUpgradeErrorMessageUniversityIsRequiredEmptyFieldValidation_50")
//    public void TierUpgradeErrorMessageUniversityIsRequiredEmptyFieldValidation_50() throws Exception {
//        tierUpgrade.TierUpgradeErrorMessageUniversityIsRequiredEmptyFieldValidation_TU_TC_50();
//    }
//    @Test(priority = 50, description = "TierUpgradeErrorMessageUniversityNameSpecialCharactersValidation_51")
//    public void TierUpgradeErrorMessageUniversityNameSpecialCharactersValidation_51() throws Exception {
//        tierUpgrade.TierUpgradeErrorMessageUniversityNameSpecialCharactersValidation_TU_TC_51();
//    }
//    @Test(priority = 51, description = "TierUpgradeErrorMessageSchoolAddressIsRequiredEmptyValidation_52")
//    public void TierUpgradeErrorMessageSchoolAddressIsRequiredEmptyValidation_52() throws Exception {
//        tierUpgrade.TierUpgradeErrorMessageSchoolAddressIsRequiredEmptyValidation_TU_TC_52();
//    }
//    @Test(priority = 52, description = "TierUpgradeErrorMessageSchoolAddressSpecialCharactersValidation_53")
//    public void TierUpgradeErrorMessageSchoolAddressSpecialCharactersValidation_53() throws Exception {
//        tierUpgrade.TierUpgradeErrorMessageSchoolAddressSpecialCharactersValidation_TU_TC_53();
//    }
//    @Test(priority = 53, description = "TierUpgradeErrorMessageProgramTypeIsRequiredEmptyFieldValidation_54")
//    public void TierUpgradeErrorMessageProgramTypeIsRequiredEmptyFieldValidation_54() throws Exception {
//        tierUpgrade.TierUpgradeErrorMessageProgramTypeIsRequiredEmptyFieldValidation_TU_TC_54();
//    }
//    @Test(priority = 54, description = "TierUpgradeErrorMessageProgramTypeSpecialCharactersValidation_55")
//    public void TierUpgradeErrorMessageProgramTypeSpecialCharactersValidation_55() throws Exception {
//        tierUpgrade.TierUpgradeErrorMessageProgramTypeSpecialCharactersValidation_TU_TC_55();
//    }
//    @Test(priority = 55, description = "TierUpgradeErrorMessageOccupationNameIsRequiredEmptyFieldValidation_56")
//    public void TierUpgradeErrorMessageOccupationNameIsRequiredEmptyFieldValidation_56() throws Exception {
//        tierUpgrade.TierUpgradeErrorMessageOccupationNameIsRequiredEmptyFieldValidation_TU_TC_56();
//    }
//    @Test(priority = 56, description = "TierUpgradeErrorMessageOccupationNameSpecialCharactersValidation_57")
//    public void TierUpgradeErrorMessageOccupationNameSpecialCharactersValidation_57() throws Exception {
//        tierUpgrade.TierUpgradeErrorMessageOccupationNameSpecialCharactersValidation_TU_TC_57();
//    }
//    @Test(priority = 57, description = "TierUpgradeErrorMessageSourceOfFundsIsRequiredEmptyFieldValidation_58")
//    public void TierUpgradeErrorMessageSourceOfFundsIsRequiredEmptyFieldValidation_58() throws Exception {
//        tierUpgrade.TierUpgradeErrorMessageSourceOfFundsIsRequiredEmptyFieldValidation_TU_TC_58();
//    }
//    @Test(priority = 58, description = "TierUpgradeErrorMessageEmployerNameSpecialCharactersValidation_59")
//    public void TierUpgradeErrorMessageEmployerNameSpecialCharactersValidation_59() throws Exception {
//        tierUpgrade.TierUpgradeErrorMessageRetiredFieldSpecialCharactersValidation_TU_TC_59();
//    }
//    @Test(priority = 59, description = "TierUpgradeBranchTierVerificationTierNavigation_60")
//    public void TierUpgradeBranchTierVerificationTierNavigation_60() throws Exception {
//        tierUpgrade.TierUpgradeBranchTierVerificationTierNavigation_TU_TC_60();
//    }
//    @Test(priority = 60, description = "TierUpgradeSchoolUniveristyFieldValidation_61")
//    public void TierUpgradeSchoolUniveristyFieldValidation_61() throws Exception {
//        tierUpgrade.TierUpgradeSchoolUniveristyFieldValidation_TU_TC_61();
//    }
//    @Test(priority = 61, description = "TierUpgradeSchoolAddressFieldValidation_62")
//    public void TierUpgradeSchoolAddressFieldValidation_62() throws Exception {
//        tierUpgrade.TierUpgradeSchoolAddressFieldValidation_TU_TC_62();
//    }
//    @Test(priority = 62, description = "TierUpgradeGrantProgramFIeldValidation_63")
//    public void TierUpgradeGrantProgramFIeldValidation_63() throws Exception {
//        tierUpgrade.TierUpgradeGrantProgramFIeldValidation_TU_TC_63();
//    }
//    @Test(priority = 63, description = "TierUpgradeOccupationFieldValidation_64")
//    public void TierUpgradeOccupationFieldValidation_64() throws Exception {
//        tierUpgrade.TierUpgradeOccupationFieldValidation_TU_TC_64();
//    }
//    @Test(priority = 64, description = "TierUpgradeOccupationFieldValidation_65")
//    public void TierUpgradeOccupationFieldValidation_65() throws Exception {
//        tierUpgrade.TierUpgradeOccupationFieldValidation_TU_TC_65();
//    }
//    @Test(priority = 65, description = "TierUpgradeCompanyFieldValidation_66")
//    public void TierUpgradeCompanyFieldValidation_66() throws Exception {
//        tierUpgrade.TierUpgradeCompanyFieldValidation_TU_TC_66();
//    }
//    @Test(priority = 66, description = "TierUpgradeOrganizationNameFieldValidation_67")
//    public void TierUpgradeOrganizationNameFieldValidation_67() throws Exception {
//        tierUpgrade.TierUpgradeOrganizationNameFieldValidation_TU_TC_67();
//    }
//    @Test(priority = 67, description = "TierUpgradeOrganizationNameFieldValidation_67")
//    public void TierUpgradeProductServicesFieldValidation_TU_TC_68() throws Exception {
//        tierUpgrade.TierUpgradeProductServicesFieldValidation_TU_TC_68();
//    }
//    @Test(priority = 68, description = "TierUpgradeOrganizationNameFieldValidation_67")
//    public void TierUpgradeEmptyAddressFieldValidation_69() throws Exception {
//        tierUpgrade.TierUpgradeEmptyAddressFieldValidation_TU_TC_69();
//    }
//    @Test(priority = 69, description = "TierUpgradeSpecialAddressFieldValidation_70")
//    public void TierUpgradeSpecialAddressFieldValidation_70() throws Exception {
//        tierUpgrade.TierUpgradeSpecialAddressFieldValidation_TU_TC_70();
//    }
//    @Test(priority = 70, description = "TierUpgradePositionFieldValidation_71")
//    public void TierUpgradePositionFieldValidation_71() throws Exception {
//        tierUpgrade.TierUpgradePositionFieldValidation_TU_TC_71();
//    }
//    @Test(priority = 71, description = "TierUpgradeRemarksFieldValidation_TU_TC_72")
//    public void TierUpgradeRemarksFieldValidation_TU_TC_72() throws Exception {
//        tierUpgrade.TierUpgradeRemarksFieldValidation_TU_TC_72();
//    }
//    @Test(priority = 72, description = "tierUpgradeBackIDPageUIValidation_73")
//    public void tierUpgradeBackIDPageUIValidation_73() throws Exception {
//        tierUpgrade.tierUpgradeBackIDPageUIValidation_TU_TC_73();
//    }
//    @Test(priority = 73, description = "tierUpgradeFrontIDPageUIValidation_74")
//    public void tierUpgradeFrontIDPageUIValidation_74() throws Exception {
//        tierUpgrade.tierUpgradeFrontIDPageUIValidation_TU_TC_74();
//    }
//    @Test(priority = 74, description = "tierUpgradeFaceIDPageUIValidation_75")
//    public void tierUpgradeFaceIDPageUIValidation_75() throws Exception {
//        tierUpgrade.tierUpgradeFaceIDPageUIValidation_TU_TC_75();
//    }
//    @Test(priority = 75, description = "tierUpgradeFaceIDPageUIValidation_76")
//    public void tierUpgradeFaceIDPageUIValidation_76() throws Exception {
//        tierUpgrade.tierUpgradeFaceIDPageUIValidation_TU_TC_76();
//    }
//    @Test(priority = 76, description = "tierUpgradeFaceIDPageUIValidation_77")
//    public void tierUpgradeFaceIDPageUIValidation_77() throws Exception {
//        tierUpgrade.tierUpgradeFaceIDPageUIValidation_TU_TC_77();
//    }
//    @Test(priority = 77, description = "tierUpgradeOneTakeIDPageUIValidation_78")
//    public void tierUpgradeOneTakeIDPageUIValidation_78() throws Exception {
//        tierUpgrade.tierUpgradeOneTakeIDPageUIValidation_TU_TC_78();
//    }
    //Dont Test Request to Tier Upgrade
//    @Test(priority = 78, description = "tierUpgradeEmptyCardIDPageUIValidation_79")
//    public void tierUpgradeEmptyCardIDPageUIValidation_79() throws Exception {
//        tierUpgrade.tierUpgradeEmptyCardIDPageUIValidation_TU_TC_79();
//    }
    //Dont Test Request to Tier Upgrade
    @Test(priority = 79, description = "tierUpgradePendingRequestIDPageUIValidation_80")
    public void tierUpgradePendingRequestIDPageUIValidation_80() throws Exception {
        tierUpgrade.tierUpgradePendingRequestIDPageUIValidation_TU_TC_80();
    }
}
