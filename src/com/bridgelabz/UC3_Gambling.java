package com.bridgelabz;

public class UC3_Gambling {
    static int startMoney = 100;
    static int gamblingAmount = 1;
    static boolean winOrLose() {
        int winCheck = (int) Math.floor(Math.random()*10) %2;

        if( winCheck == 1) {
            return true;
        }else {
            return false;
        }
    }
    public static void main(String[] args) {
        while(startMoney < 150 && startMoney > 50) {
            boolean win = winOrLose();
            if(win) {
                startMoney++;
            } else {
                startMoney--;
            }
        }

        System.out.println(startMoney);

        if(startMoney == 150) {
            System.out.println("You won the game");
        }else {
            System.out.println("You lost the game");
        }
    }
}
