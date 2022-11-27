package com.bridgelabz;

public class UC4_Gambling {
    static int startMoney = 100;
    static int gamblingAmount = 1;
    static int totalProfit = 0;
    static boolean winOrLose() {
        int winCheck = (int) Math.floor(Math.random()*10) %2;

        if( winCheck == 1) {
            return true;
        }else {
            return false;
        }
    }
    public static void main(String[] args) {
        for(int i=0;i<20;i++) {
            startMoney = 100;
            while(startMoney < 150 && startMoney > 50) {
                boolean win = winOrLose();
                if(win) {
                    startMoney++;
                } else {
                    startMoney--;
                }
            }
            totalProfit = totalProfit + startMoney - 100;
        }
        System.out.println("Total profit/loss for 20 days is " + totalProfit);
    }
}
