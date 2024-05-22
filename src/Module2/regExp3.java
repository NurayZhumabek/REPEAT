package Module2;

import java.util.Scanner;

public class regExp3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         String s=sc.nextLine();
         s=s.trim().replaceAll(" +"," ");
         String string[]=s.split(" ");
         for (String s1:string){
             System.out.println(s1);
         }
         String newStr="";
        for (int i = 0; i <string.length ; i++) {
            newStr+= String.valueOf(string[i].charAt(string[i].length()-1));

        }
        System.out.println(newStr);
    }
}
