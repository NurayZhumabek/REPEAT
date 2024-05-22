package Module2;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExp2 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        s=s.trim();
        s=s.replaceAll("  +"," ");
        Pattern p=Pattern.compile(" \\p{Alpha}");
        Matcher m= p.matcher(s);
        int count=1;
        while (m.find()){
            count++;
        }
        System.out.println(count);
        System.out.println(s);
    }
}
