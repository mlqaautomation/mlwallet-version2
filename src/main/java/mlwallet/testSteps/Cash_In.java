package mlwallet.testSteps;

import java.util.Arrays;
import java.util.List;

public class Cash_In extends Base_Steps {
    public void cashIn(){
        mobileGeneralMethod.tap(mlWalletPageObjects.cashIn_icon(), "Cash In Icon");
        mobileGeneralMethod.tap(mlWalletPageObjects.cashInBranch_icon(), "Cash in Branch");
        mobileGeneralMethod.waitSleep(4000);
        mobileGeneralMethod.type(mlWalletPageObjects.amountEditText(), "Amount Edit Text", "1");
        mobileGeneralMethod.tap(mlWalletPageObjects.next_btn(), "Next btn");
        mobileGeneralMethod.waitSleep(5000);
        mobileGeneralMethod.tap(mlWalletPageObjects.continue_btn(), "Continue btn");
        mobileGeneralMethod.waitSleep(10000);
        mobileGeneralMethod.tap(mlWalletPageObjects.continue2_btn(), "OTP Continue");
        mobileGeneralMethod.waitSleep(12000);
        mobileGeneralMethod.isVisible(mlWalletPageObjects.cashIn_KPTN(), mlWalletPageObjects.cashIn_KPTN().getText());
        String[] resultArray = new String[1];  // Declare an array to store the result
        resultArray[0] = trimKPTN(mlWalletPageObjects.cashIn_KPTN().getText());
        List<String> values = Arrays.asList(resultArray);
        yamlReader.writeCashIn_Kptn(values);
        mobileGeneralMethod.tap(mlWalletPageObjects.exit_Icon(), "Exit Icon");
    }
    public String trimKPTN(String val){
        String prefix="KPTN: ";
        if(val.startsWith(prefix)){
            return val.substring(prefix.length());
        }
        return val;
    }
}
