package Module2;

import java.util.Scanner;

public class CashMachine {
    int banknote20;
    int banknote50;
    int banknote100;
    CashMachine(){
        banknote20=20;
        banknote50=50;
        banknote100=100;
    }
    int addCash(int cash20,int cash50,int cash100){
        this.banknote20=banknote20*cash20;
        this.banknote50=banknote50*cash50;
        this.banknote100=banknote100*cash100;
        return this.banknote100+this.banknote50+this.banknote20;
    }

    void getCash(int cash,int currentCash){
        int cashIn=currentCash;
        int count100=0;
        int count50=0;
        int count20=0;
        if (cash<=currentCash){
            count100=cash/100;
            cash=cash-count100*100;
        if ( cash>=50){
                count50=cash/50;
                cash=cash-count50*50;

            }
        if (cash>=20){
                 count20=cash/20;

            }

            System.out.println("Banknote 100: "+count100);
            System.out.println("Banknote 50: "+count50);
            System.out.println("Banknote 20: "+count20);
        }else {
            System.out.println("The operation failed");
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        CashMachine cashMachine=new CashMachine();
       int cash= cashMachine.addCash(0,1,5);
        System.out.println("Current cash in your card:"+cash);
        System.out.println("How much money do you want to withdraw: ");
        int money=sc.nextInt();
        cashMachine.getCash(money,cash);



    }
}
