package Module2;

import java.util.Scanner;

public class StringTest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the text:");
        String str=sc.nextLine();
        int index= str.indexOf('J');
        System.out.println("The last symbol: "+ str.charAt(str.length()-1));
        System.out.println(str.endsWith("!"));
        System.out.println(str.startsWith("I like"));
        System.out.println(str.contains("Java"));
        System.out.println(str.indexOf('J'));
        System.out.println(str.replace('a','o'));
        System.out.println(str.toUpperCase());

        System.out.println(str.substring(str.indexOf('J'),str.indexOf('J')+4));
    }

}
