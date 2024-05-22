package Module2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClientValidator {
        boolean validateEmail(String email){
            String regex="^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
            Pattern p=Pattern.compile(regex);
            Matcher m=p.matcher(email);

            return m.matches();
    }
     boolean validateIP(String ip) {
        String str[] = ip.split("\\.");
        int number;
        boolean isValidate = false;
        for (String s : str) {
            number = Integer.parseInt(s);
            if (number >= 0 && number <= 255) {
                isValidate = true;
            } else {
                isValidate = false;
                break;

            } }
            
            return isValidate;}
    boolean validateIP2(String ip) {
            String regex="[0-2][0-9][0-5]*.[0-2][0-9][0-5]*.[0-2][0-9][0-5]*.[0-2][0-9][0-5]";
            Pattern pattern=Pattern.compile("");
            Matcher matcher= pattern.matcher(ip);
            return matcher.matches();
    }
}
