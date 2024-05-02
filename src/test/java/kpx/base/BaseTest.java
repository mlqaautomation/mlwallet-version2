package kpx.base;

import mlkpx.testSteps.*;
import mlkpx.testSteps.Home_Steps;
import mlkpx.testSteps.Kyc_Steps;
import mlkpx.testSteps.Login_Steps;
import mlkpx.testSteps.Payout_Steps;
import org.testng.annotations.*;

import static utilities.Driver.DriverManager.*;
import utilities.Driver.DriverType;

import utilities.Logger.LoggingUtils;

public class BaseTest {
    protected Home_Steps homeSteps;
    protected Login_Steps loginSteps;
    protected Kyc_Steps kycSteps;
    protected SendOut_Steps sendOutSteps;
    protected SendOutCancellation_Steps sendOutCancellationSteps;
    protected Payout_Steps payoutSteps;
    protected PayoutCancellation_Steps payoutCancellationSteps;
    protected PayoutReprinting_Steps payoutReprintingSteps;
    protected BillsPay_Steps billsPaySteps;
    protected BillsPayCancellation_Steps billsPayCancellationSteps;
    protected BillsPayChangeD_Steps billsPayChangeDSteps;
    protected BillsPayReprinting_Steps billsPayReprintingSteps;
    protected WalletServices_Steps walletServicesSteps;
    protected SOReprinting_Steps soReprintingSteps;
    protected RequestForChange_Steps requestForChangeSteps;
    protected ReturnToSender_Steps returnToSenderSteps;
    protected ORReprinting_Steps orReprintingSteps;
    protected WS_CashInToOwnAccount_Steps wsCashInToOwnAccountSteps;
    protected WS_CashOut_Steps wsCashOutSteps;
    protected WS_KwartaPadalaPayOut_Steps wsKwartaPadalaPayOutSteps;
    protected WS_ShopSafe_Steps wsShopSafeSteps;


    @Parameters("browser")
    @BeforeClass (alwaysRun = true)
    public void setUp(final String browser){
        if (browser == null || browser.isEmpty()) {
            throw new IllegalArgumentException("Browser parameter cannot be null or empty");
        }
        initializeDriver(DriverType.valueOf(browser.toUpperCase()));
        getDriver().manage().deleteAllCookies();
        if (getDriver().toString().contains("RemoteWebDriver")) {
            getDriver().get(System.getProperty("targetUrl"));
        } else {
            getDriver().get(System.getProperty("targetUrl"));
            LoggingUtils.info("Redirecting back to home");
        }
        this.loginSteps = new Login_Steps();
        this.homeSteps = new Home_Steps();
        this.kycSteps = new Kyc_Steps();
        this.sendOutSteps = new SendOut_Steps();
        this.sendOutCancellationSteps = new SendOutCancellation_Steps();
        this.payoutSteps = new Payout_Steps();
        this.payoutCancellationSteps = new PayoutCancellation_Steps();
        this.payoutReprintingSteps = new PayoutReprinting_Steps();
        this.billsPaySteps = new BillsPay_Steps();
        this.billsPayCancellationSteps = new BillsPayCancellation_Steps();
        this.billsPayChangeDSteps = new BillsPayChangeD_Steps();
        this.billsPayReprintingSteps = new BillsPayReprinting_Steps();
        this.soReprintingSteps = new SOReprinting_Steps();
        this.requestForChangeSteps = new RequestForChange_Steps();
        this.returnToSenderSteps = new ReturnToSender_Steps();
        this.orReprintingSteps = new ORReprinting_Steps();
        this.wsCashInToOwnAccountSteps = new WS_CashInToOwnAccount_Steps();
        this.wsCashOutSteps = new WS_CashOut_Steps();
        this.wsKwartaPadalaPayOutSteps = new WS_KwartaPadalaPayOut_Steps();

    }
    private void initializeDriver(DriverType driverType) {
        createDriver(driverType);
    }


    @BeforeMethod(alwaysRun = true)
    public void setUpTests(){
        getDriver().get(System.getProperty("homeUrl"));
    }
    @AfterMethod(alwaysRun = true)
    public void clean(){
        LoggingUtils.info("------>>>Test Ended<<<-------");

    }

    @AfterClass(alwaysRun = true)
    public void tearDown () {
        closeWebBrowser();
    }
}