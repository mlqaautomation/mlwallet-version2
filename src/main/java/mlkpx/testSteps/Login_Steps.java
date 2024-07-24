package mlkpx.testSteps;

import org.openqa.selenium.NoSuchElementException;
import utilities.ExtentReport.ExtentReporter;
import utilities.ReusableComponents.TOTPGenerator;

public class Login_Steps extends Base_Steps {

    public void signInGoogle(String role)throws NoSuchElementException {
        try{
            waitSleep(6000);
            click(googlePageObjects.signinKPX(),"Click Sign In Button ");
            click(googlePageObjects.googleContainer(), "Google Sign in Container");
            switchToNextTab();
            waitSleep(2000);
            typeEnter(googlePageObjects.emailField(), "Email Field", reader.getEmailByRole(role));
            typeEnter(googlePageObjects.passwordField(), "Password Field", reader.getPasswordByRole(role));
            click(googlePageObjects.anotherWayButton(), "Another way");
            waitSleep(2000);
            click(googlePageObjects.selectGoogleAuthenticator(), "Google Auth Option");
            typeEnter(googlePageObjects.codeField(), "Auth Key Field", TOTPGenerator.getTwoFactorCode());
            switchToPreviousTab();
        }catch (Exception e){
            waitSleep(6000);
            click(googlePageObjects.signinKPX(),"Click Sign In Button ");
            click(googlePageObjects.selectGoogleAuthenticator(), "Google Auth Option");
            typeEnter(googlePageObjects.codeField(), "Auth Key Field", TOTPGenerator.getTwoFactorCode());
            switchToPreviousTab();
        }
    }

    public void signInGoogleV2()throws Exception{
        // logging in google via clicking the email, this only happens when browser is not closed
        try{
            waitSleep(6000);
            click(googlePageObjects.signinKPX(),"Click Sign In Button ");
            click(googlePageObjects.googleContainer(), "Google Sign in Container");
            switchToNextTab();
            click(googlePageObjects.chooseCurrentAccount(), getText(googlePageObjects.chooseCurrentAccount()));
            switchToPreviousTab();
        }catch (Exception e){
            waitSleep(6000);
            click(googlePageObjects.signinKPX(),"Click Sign In Button ");
            click(googlePageObjects.googleContainer2(), "Google Sign in Container");
            switchToNextTab();
            click(googlePageObjects.chooseCurrentAccount(), getText(googlePageObjects.chooseCurrentAccount()));
            switchToPreviousTab();
        }
    }
    public void loginKpx(String role)throws Exception{
        waitSleep(5000);
        try{
            type(loginPageObjects.userNameField(),"kpx username field", reader.getKpxUsername(role));
            type(loginPageObjects.passwordField(), "kpx password field", reader.getKpxPassword(role));
            click(loginPageObjects.loginButton(), "Login button");
            waitSleep(4000);
        }catch (Exception e){
            ExtentReporter.logFail("loginKpx, ","error "+ e);
        }
    }
    public void isInvalidAccount(){
        if(isVisible(loginPageObjects.invalidCredText(), getText(loginPageObjects.invalidCredText()))){
            ExtentReporter.logPass("isInvalidAccount ","Successfully Validated Invalid Account");
        }else{
            ExtentReporter.logFail("isInvalidAccount ","Failed to Validate");
        }

    }
}
