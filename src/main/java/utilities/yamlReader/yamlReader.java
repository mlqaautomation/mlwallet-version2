package utilities.yamlReader;
import org.yaml.snakeyaml.DumperOptions;
import org.yaml.snakeyaml.Yaml;
import utilities.Logger.LoggingUtils;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class yamlReader {
    /** The YAML file name. */
    private String yamlFileName;

    /** The YAML object. */
    private Map<String, Object> yamlData;
    private String filePath;

    public yamlReader(){
        this.filePath = ".\\src\\test\\java\\resources\\testData.yaml";
        this.yamlFileName = this.filePath;
        yamlLoader();
    }

    private void yamlLoader(){
        try{
            Yaml yaml = new Yaml();
            FileInputStream fileInputStream = new FileInputStream(yamlFileName);
            yamlData = yaml.load(fileInputStream);
            if (yamlData == null) {
                yamlData = new LinkedHashMap<>();
            }
        }catch (FileNotFoundException e){
            LoggingUtils.error(e.getMessage());
        }
    }

    public Map<String, Object> getRoleData(String role) {
        List<Map<String, Object>> roles = (List<Map<String, Object>>) yamlData.get("Roles");
        for (Map<String, Object> r : roles) {
            String rRole = (String) r.get("role");
            if (role.equals(rRole)) {
                return r;
            }
        }
        return null;
    }

    public String getEmailByRole(String role){
        Map<String, Object> roleData = getRoleData(role);
        if (roleData != null) {
            return (String) roleData.get("gmail_email");
        }
        return null;
    }
    public String getPasswordByRole(String role){
        Map<String, Object> roleData = getRoleData(role);
        if (roleData != null) {
            return (String) roleData.get("gmail_password");
        }
        return null;
    }

    public String getKpxUsername(String role){
        Map<String, Object> roleData = getRoleData(role);
        if (roleData != null) {
            return roleData.get("kpx_username").toString();
        }
        return null;
    }

    public String getKpxPassword(String role){
        Map<String, Object> roleData = getRoleData(role);
        if (roleData != null) {
            return roleData.get("kpx_password").toString();
        }
        return null;
    }
    public List<Map<String, Object>> getSendersData() {
        return (List<Map<String, Object>>) yamlData.get("Senders");
    }

    public Map<String, Object> getRandomSenderData() {
        List<Map<String, Object>> senders = getSendersData();
        Random random = new Random();
        int randomIndex = random.nextInt(senders.size());
        return senders.get(randomIndex);
    }
    public String[] getRandomName() {
        Map<String, Object> randomSender = getRandomSenderData();
        Map<String, Object> kycData = (Map<String, Object>) randomSender.get("kyc");
        String firstName = (String) kycData.get("firstName");
        String lastName = (String) kycData.get("lastName");
        return new String[]{firstName, lastName};
    }

//public String getRandomKPTN() {
//    try {
//        List<String> kptnList = (List<String>) yamlData.get("KPTN");
//
//        if (kptnList == null || kptnList.isEmpty()) {
//            System.out.println("No KPTN values available.");
//            return null;
//        }
//        int randomIndex = new Random().nextInt(kptnList.size());
//        String randomKPTN = kptnList.get(randomIndex);
//        kptnList.remove(randomIndex);
//        saveYamlData();
//        return randomKPTN;
//    } catch (Exception e) {
//        e.printStackTrace();
//        return null;
//    }
//}
    public String getSendOutKPTN() {
        try {
            List<String> sendOutKptnList = (List<String>) yamlData.get("sendOutKPTN");

            if (sendOutKptnList == null || sendOutKptnList.isEmpty()) {
                System.out.println("No send out KPTN values available.");
                return null;
            }


            int randomIndex = new Random().nextInt(sendOutKptnList.size());
            String randomSendOutKptn = sendOutKptnList.get(randomIndex); //Randomly selected send out KPTN directly from the list
            sendOutKptnList.remove(randomIndex);
            saveYamlData();
            return randomSendOutKptn;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    public String getBillsPayKPTN() {
        try {
            List<String> BillsPayKptnList = (List<String>) yamlData.get("billsPayKTPN");

            if (BillsPayKptnList == null || BillsPayKptnList.isEmpty()) {
                System.out.println("No BillsPay KPTN values available.");
                return null;
            }

            int randomIndex = new Random().nextInt(BillsPayKptnList.size());
            String randomBillsPayKptn = BillsPayKptnList.get(randomIndex); //Randomly selected send out KPTN directly from the list
            saveYamlData();
            return randomBillsPayKptn;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    public String getRemoteBillsPayKPTN() {
        try {
            List<String> RemoteBillsPayKptnList = (List<String>) yamlData.get("remoteBillsPayKTPN");

            if (RemoteBillsPayKptnList == null || RemoteBillsPayKptnList.isEmpty()) {
                System.out.println("No Remote BillsPay KPTN values available.");
                return null;
            }

            int randomIndex = new Random().nextInt(RemoteBillsPayKptnList.size());
            String randomBillsPayKptn = RemoteBillsPayKptnList.get(randomIndex); //Randomly selected send out KPTN directly from the list
            saveYamlData();
            return randomBillsPayKptn;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public String getPayoutKPTN() {
        try {
            List<String> kptnList = (List<String>) yamlData.get("payoutKPTN");

            if (kptnList == null || kptnList.isEmpty()) {
                System.out.println("No payoutKPTN values available.");
                return null;
            }

//            int randomIndex = new Random().nextInt(kptnList.size());
//            String randomKPTN = kptnList.remove(randomIndex); // Remove the randomly selected KPTN directly from the list
//            saveYamlData();
//            return randomKPTN;

            int randomIndex = new Random().nextInt(kptnList.size());
            String randomKPTN = kptnList.get(randomIndex); //Randomly selected send out KPTN directly from the list
            kptnList.remove(randomIndex);
            saveYamlData();
            return randomKPTN;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    public String getSuccessPayoutKPTN() {
        try {
            List<String> kptnList = (List<String>) yamlData.get("payoutKPTN");

            if (kptnList == null || kptnList.isEmpty()) {
                System.out.println("No payoutKPTN values available.");
                return null;
            }

            int randomIndex = new Random().nextInt(kptnList.size());
            String randomKPTN = kptnList.get(randomIndex); //Randomly selected send out KPTN directly from the list
            saveYamlData();
            return randomKPTN;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    public String getSuccessRemotePayoutKPTN() {
        try {
            List<String> kptnList = (List<String>) yamlData.get("remotePayoutKPTN");

            if (kptnList == null || kptnList.isEmpty()) {
                System.out.println("No payoutKPTN values available.");
                return null;
            }

            int randomIndex = new Random().nextInt(kptnList.size());
            String randomKPTN = kptnList.get(randomIndex); //Randomly selected send out KPTN directly from the list
            saveYamlData();
            return randomKPTN;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    public String getRemotePayoutKPTN() {
        try {
            List<String> kptnList = (List<String>) yamlData.get("remotePayoutKPTN");

            if (kptnList == null || kptnList.isEmpty()) {
                System.out.println("No payoutKPTN values available.");
                return null;
            }
//            int randomIndex = new Random().nextInt(kptnList.size());
//            String randomKPTN = kptnList.remove(randomIndex); // Remove the randomly selected KPTN directly from the list
//            saveYamlData();
//            return randomKPTN;

            int randomIndex = new Random().nextInt(kptnList.size());
            String randomKPTN = kptnList.get(randomIndex); //Randomly selected send out KPTN directly from the list
            kptnList.remove(randomIndex);
            saveYamlData();
            return randomKPTN;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public String getRemoteKPTN() {
        try {
            List<String> remoteKptnList = (List<String>) yamlData.get("remoteSendoutKPTN");

            if (remoteKptnList == null || remoteKptnList.isEmpty()) {
                System.out.println("No remote KPTN values available.");
                return null;
            }

//            int randomIndex = new Random().nextInt(remoteKptnList.size());
//            String randomRemoteKptn = remoteKptnList.remove(randomIndex);
//            saveYamlData();
//            return randomRemoteKptn;

            int randomIndex = new Random().nextInt(remoteKptnList.size());
            String randomRemoteKptn = remoteKptnList.get(randomIndex); //Randomly selected send out KPTN directly from the list
            remoteKptnList.remove(randomIndex);
            saveYamlData();
            return randomRemoteKptn;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }


    public String getRandomCashOutReferenceNum() {
        try {
            List<String> cashOutReferenceNumList = (List<String>) yamlData.get("cashOutReferenceNum");
            if (cashOutReferenceNumList == null || cashOutReferenceNumList.isEmpty()) {
                System.out.println("No Random Cash Out Reference Number available.");
                return null;
            }
            int randomIndex = new Random().nextInt(cashOutReferenceNumList.size());
            String randomCashOutReferenceNum = cashOutReferenceNumList.get(randomIndex);
            cashOutReferenceNumList.remove(randomIndex);
            saveYamlData();
            return randomCashOutReferenceNum;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    public String getRandomReferenceNum() {
        try {
            List<String> referenceNumList = (List<String>) yamlData.get("referenceNum");
            if (referenceNumList == null || referenceNumList.isEmpty()) {
                System.out.println("No Reference Number available.");
                return null;
            }
            int randomIndex = new Random().nextInt(referenceNumList.size());
            String randomReferenceNum = referenceNumList.get(randomIndex);
            referenceNumList.remove(randomIndex);
            saveYamlData();
            return randomReferenceNum;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    public String getRandomKPPReferenceNum() {
        try {
            List<String> kppReferenceNumList = (List<String>) yamlData.get("KPPReferenceNum");
            if (kppReferenceNumList == null || kppReferenceNumList.isEmpty()) {
                System.out.println("No KPPP Reference Number available.");
                return null;
            }
            int randomIndex = new Random().nextInt(kppReferenceNumList.size());
            String randomKPPReferenceNum = kppReferenceNumList.get(randomIndex);
            kppReferenceNumList.remove(randomIndex);
            saveYamlData();
            return randomKPPReferenceNum;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    private void saveYamlData() {
        try {
            Yaml yaml = new Yaml();
            Writer writer = new FileWriter(yamlFileName);
            yaml.dump(yamlData, writer);
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public void writeKptnData(List<String> values) {
        try {
            Yaml yaml = new Yaml();
            FileInputStream fileInputStream = new FileInputStream(yamlFileName);
            Map<String, Object> yamlData = yaml.load(fileInputStream);

            if (yamlData.containsKey("sendOutKPTN")) {
                List<String> existingValues = (List<String>) yamlData.get("sendOutKPTN");
                existingValues.addAll(values);
            } else {
                yamlData.put("sendOutKPTN", values);
            }

            FileWriter writer = new FileWriter(yamlFileName);
            yaml.dump(yamlData, writer);
            LoggingUtils.info(values + " saved to file");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void writeRemoteKptnData(List<String> values) {
        try {
            Yaml yaml = new Yaml();
            FileInputStream fileInputStream = new FileInputStream(yamlFileName);
            Map<String, Object> yamlData = yaml.load(fileInputStream);

            if (yamlData.containsKey("remoteSendoutKPTN")) {
                List<String> existingValues = (List<String>) yamlData.get("remoteSendoutKPTN");
                existingValues.addAll(values);
            } else {
                yamlData.put("remoteSendoutKPTN", values);
            }

            FileWriter writer = new FileWriter(yamlFileName);
            yaml.dump(yamlData, writer);
            LoggingUtils.info(values + " saved to file");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void writePayoutKptnData(List<String> values) {
        try {
            Yaml yaml = new Yaml();
            FileInputStream fileInputStream = new FileInputStream(yamlFileName);
            Map<String, Object> yamlData = yaml.load(fileInputStream);

            if (yamlData.containsKey("payoutKPTN")) {
                List<String> existingValues = (List<String>) yamlData.get("payoutKPTN");
                existingValues.addAll(values);
            } else {
                yamlData.put("payoutKPTN", values);
            }

            FileWriter writer = new FileWriter(yamlFileName);
            yaml.dump(yamlData, writer);
            LoggingUtils.info(values + " saved to file");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void writeRemotePayoutKptnData(List<String> values) {
        try {
            Yaml yaml = new Yaml();
            FileInputStream fileInputStream = new FileInputStream(yamlFileName);
            Map<String, Object> yamlData = yaml.load(fileInputStream);

            if (yamlData.containsKey("remotePayoutKPTN")) {
                List<String> existingValues = (List<String>) yamlData.get("remotePayoutKPTN");
                existingValues.addAll(values);
            } else {
                yamlData.put("remotePayoutKPTN", values);
            }

            FileWriter writer = new FileWriter(yamlFileName);
            yaml.dump(yamlData, writer);
            LoggingUtils.info(values + " saved to file");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

public void writeBillsPayKptnData(List<String> values) {
    try {
        Yaml yaml = new Yaml();
        FileInputStream fileInputStream = new FileInputStream(yamlFileName);
        Map<String, Object> yamlData = yaml.load(fileInputStream);

        if (yamlData.containsKey("billsPayKTPN")) {
            List<String> existingValues = (List<String>) yamlData.get("billsPayKTPN");
            for (String value : values) {
                existingValues.add(value.replace(" ", ""));
            }
        } else {
            List<String> trimmedValues = new ArrayList<>();
            for (String value : values) {
                trimmedValues.add(value.replace(" ", ""));
            }
            yamlData.put("billsPayKTPN", trimmedValues);
        }
        FileWriter writer = new FileWriter(yamlFileName);
        yaml.dump(yamlData, writer);
        LoggingUtils.info(values + " saved to file");
        writer.close();

    } catch (IOException e) {
        e.printStackTrace();
    }
}



    public void writeRemoteBillsPayKptnData(List<String> values) {
        try {
            Yaml yaml = new Yaml();
            FileInputStream fileInputStream = new FileInputStream(yamlFileName);
            Map<String, Object> yamlData = yaml.load(fileInputStream);

//            if (yamlData.containsKey("remoteBillsPayKTPN")) {
//                List<String> existingValues = (List<String>) yamlData.get("remoteBillsPayKTPN");
//                existingValues.addAll(values);
//            } else {
//                yamlData.put("remoteBillsPayKTPN", values);
//            }
            if (yamlData.containsKey("remoteBillsPayKTPN")) {
                List<String> existingValues = (List<String>) yamlData.get("remoteBillsPayKTPN");
                for (String value : values) {
                    existingValues.add(value.replace(" ", ""));
                }
            } else {
                List<String> trimmedValues = new ArrayList<>();
                for (String value : values) {
                    trimmedValues.add(value.replace(" ", ""));
                }
                yamlData.put("remoteBillsPayKTPN", trimmedValues);
            }

            FileWriter writer = new FileWriter(yamlFileName);
            yaml.dump(yamlData, writer);
            LoggingUtils.info(values + " saved to file");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public void writeTotalAmountData(List<String> values) {
        try {
            Yaml yaml = new Yaml();
            FileInputStream fileInputStream = new FileInputStream(yamlFileName);
            Map<String, Object> yamlData = yaml.load(fileInputStream);

            if (yamlData.containsKey("totalAmount")) {
                List<String> existingValues = (List<String>) yamlData.get("totalAmount");
                existingValues.addAll(values);
            } else {
                yamlData.put("totalAmount", values);
            }

            FileWriter writer = new FileWriter(yamlFileName);
            yaml.dump(yamlData, writer);
            LoggingUtils.info(values + " saved to file");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void writeTenderAmountData(List<String> values) {
        try {
            Yaml yaml = new Yaml();
            FileInputStream fileInputStream = new FileInputStream(yamlFileName);
            Map<String, Object> yamlData = yaml.load(fileInputStream);

            if (yamlData.containsKey("tenderAmount")) {
                List<String> existingValues = (List<String>) yamlData.get("tenderAmount");
                existingValues.addAll(values);
            } else {
                yamlData.put("tenderAmount", values);
            }

            FileWriter writer = new FileWriter(yamlFileName);
            yaml.dump(yamlData, writer);
            LoggingUtils.info(values + " saved to file");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void writeCashIn_Kptn(List<String> values) {
        try {
            Yaml yaml = new Yaml();
            FileInputStream fileInputStream = new FileInputStream(yamlFileName);
            Map<String, Object> yamlData = yaml.load(fileInputStream);

            // Check if yamlData is null or empty
            if (yamlData == null) {
                yamlData = new HashMap<>();
            }

            if (yamlData.containsKey("CI")) {
                List<String> existingValues = (List<String>) yamlData.get("CI");
                existingValues.addAll(values);
            } else {
                yamlData.put("CI", values);
            }

            FileWriter writer = new FileWriter(yamlFileName);
            yaml.dump(yamlData, writer);
            LoggingUtils.info(values + " saved to file");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public String getAccessKey() {
        return (String) yamlData.get("AccessKey");
    }
}
