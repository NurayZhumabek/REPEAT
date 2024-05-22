package Module2;

import java.util.Scanner;

public class StrTest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();

        for (int i = 0; i <s.length() ; i++) {
            if (i+1==s.length()/2){
                System.out.println(""+s.charAt(i)+s.charAt(i+1));
            }

        }

    }
}
