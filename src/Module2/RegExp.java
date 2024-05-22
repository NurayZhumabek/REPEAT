package Module2;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Pattern p=Pattern.compile("\\p{Punct}");
        Matcher m=p.matcher(s);
        int count=0;
        while (m.find()){
            count++;
        }
        System.out.println(count);

    }
}
