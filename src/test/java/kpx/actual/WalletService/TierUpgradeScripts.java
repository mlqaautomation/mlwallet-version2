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
    @Test(priority = 22, description = "tierUpgradeAccountDetailsPageSelectGenderAtBirthValidation_23")
    public void tierUpgradeAccountDetailsPageSelectGenderAtBirthValidation_23() throws Exception {
        tierUpgrade.tierUpgradeAccountDetailsPageSelectGenderAtBirthValidation_TU_TC_23();
    }
}
