package kpx.base;


import io.appium.java_client.pagefactory.AppiumFieldDecorator;

import mlkpx.testSteps.*;
import mlkpx.testSteps.Login_Steps;
import mlwallet.testSteps.*;
import org.apache.poi.ss.formula.functions.T;
import org.mlwallet.pageObject.CashOutViaBranchObjects;
import org.mlwallet.pageObject.TopUpGamesObjects;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.*;

import static utilities.Driver.DriverManager.*;

import utilities.Driver.AppiumDriverManager;
import utilities.Driver.DriverType;

import utilities.ExtentReport.ExtentReporter;
import utilities.Logger.LoggingUtils;

import java.time.Duration;

public class BaseTest {
    protected Login_Steps loginSteps;
    protected WS_ShopSafe_Steps wsShopSafeSteps;
    protected Login loginWalletSteps;
    protected Logout logout;
    protected Shop_Safe shopSafe;
    protected Registration registration;
    protected TroubleSignIn troubleSignIn;
    protected KwartaPadala_Wallet kwartaPadalaWallet;
    protected MlShop mlShop;
    protected KwartaPadala_Branch kwartaPadalaBranch;
    protected BuyELoad buyELoad;
    protected CashInViaBranch cashInViaBranch;
    protected CashOutViaBranch cashOutViaBranch;
    protected GCash gCash;
    protected History history;
    protected PayBills payBills;
    protected TopUpGames topUpGames;

    @Parameters("type")
    @BeforeClass (alwaysRun = true)
    public void setUp(final String type){
        if(type.equals("mobile")){
//            AppiumDriverManager.setupServer();
//            AppiumDriverManager.startActivity();
//            initWallet();
        }else if(type.equals("web")){
            final String browser ="chrome";
            initializeDriver(DriverType.valueOf(browser.toUpperCase()));
            getDriver().manage().deleteAllCookies();
            getDriver().get(System.getProperty("targetUrl"));
            init();
        }else{
            throw new AssertionError("Unsupported Type: " + type);
        }
        ExtentReporter.setPlatform(type);
    }
    private void initializeDriver(DriverType driverType) {
        createDriver(driverType);
    }

    @BeforeMethod(alwaysRun = true)
    @Parameters("type")
    public void setUpTests(final String type) throws InterruptedException {
        if(type.equals("web")) {
            getDriver().get(System.getProperty("homeUrl"));
        }else if(type.equals("mobile")){
            LoggingUtils.info("Starting app...");
            AppiumDriverManager.setupServer();
            AppiumDriverManager.startActivity();
            initWallet();
            PageFactory.initElements(new AppiumFieldDecorator(AppiumDriverManager.getAndroidDriver(), Duration.ofSeconds(20)), this);
        }
    }
    @AfterMethod(alwaysRun = true)
    @Parameters("type")
    public void clean(final String type){
        if(type.equals("mobile")) {
            LoggingUtils.info("Resetting app...");
            AppiumDriverManager.stopServer();
        }
        LoggingUtils.info("------>>>Test Ended<<<-------");
    }
    @AfterClass(alwaysRun = true)
    @Parameters("type")
    public void tearDown (final String type) {
        if(type.equals("mobile")){
        AppiumDriverManager.stopServer();
        }else if(type.equals("web")){
            closeWebBrowser();
        }else{
            throw new IllegalArgumentException("Unsupported Type: " + type);
        }
    }
    public void init(){
        this.loginSteps = new Login_Steps();
        this.wsShopSafeSteps = new WS_ShopSafe_Steps();
    }
    public void initWallet() throws InterruptedException {
        this.loginWalletSteps = new Login();
        this.shopSafe = new Shop_Safe();
        this.kwartaPadalaWallet = new KwartaPadala_Wallet();
        this.kwartaPadalaBranch = new KwartaPadala_Branch();
        this.buyELoad = new BuyELoad();
        this.gCash = new GCash();
        this.payBills = new PayBills();
        this.topUpGames = new TopUpGames();
        this.cashInViaBranch = new CashInViaBranch();
        this.cashOutViaBranch = new CashOutViaBranch();
        this.history = new History();
        this.registration = new Registration();
        this.troubleSignIn = new TroubleSignIn();
        this.logout = new Logout();
    }

}