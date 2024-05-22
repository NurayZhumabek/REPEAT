package Module2;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the text:");

        String s=sc.nextLine();


        s=s.replace(',',' ');
        s=s.replace(" ","");

        s=s.toLowerCase();
        s=s.strip();
        System.out.println(s);
        boolean palindrome=false;
        String message="";
        for (int i = 0; i <s.length()/2; i++) {
            if (s.charAt(i)==s.charAt(s.length()-i-1) || s.charAt(0)==s.charAt(s.length()-1) ){

                palindrome=true;
                if(s.charAt(i)!=s.charAt(s.length()-i-1)){
                    message="You could delete the chacarter "+"'"+s.charAt(s.length()-i-1)+"'";
                }
            }
            else {
                palindrome=false;
                break;
            }

        }
        if (palindrome){
            System.out.println(s+ " is a palindrome");
            System.out.println(message);
        } else if (s.isEmpty()) {

            System.out.println("Empty string "+ " is a palindrome");
        } else{
            System.out.println(s+ " is a not palindrome");
        }

    }
}
