package com.bridgelabz;

public class UC7_Gambling {
    static int startMoney = 100;
    static int gamblingAmount = 1;
    static int totalProfit = 0;
    static int maxWins = 0;
    static int maxLoss = 0;
    static int maxWinDay = 0;
    static int maxLossDay = 0;
    static boolean winOrLose() {
        int winCheck = (int) Math.floor(Math.random()*10) %2;

        if( winCheck == 1) {
            return true;
        }else {
            return false;
        }
    }

    static void startGame() {
        Scanner scan = new Scanner(System.in);
        for(int i=0;i<20;i++) {
            startMoney = 100;
            int losses = 0;
            int wins = 0;
            while(startMoney < 150 && startMoney > 50) {
                boolean win = winOrLose();
                if(win) {
                    startMoney++;
                    wins++;
                } else {
                    startMoney--;
                    losses++;
                }
            }

            if(wins > maxWins) {
                maxWins = wins;
                maxWinDay = i+1;
            }

            if(losses > maxLoss) {
                maxLoss = losses;
                maxLossDay = i+1;
            }
            if(startMoney == 150) {
                System.out.println("Player won by 50 on day " + (i+1));
            }else {
                System.out.println("Player lost by 50 on day " + (i+1));
            }
            totalProfit = totalProfit + startMoney - 100;
        }
        System.out.println("Total profit/loss for 20 days is " + totalProfit);

        System.out.println("Max win day is "+ maxWinDay);
        System.out.println("Max loss day is "+ maxLossDay);

        if(totalProfit > 0) {
            System.out.println("Do you want to play again? YES/NO");
            String playAgain = scan.nextLine();
            if(playAgain == "YES") {
                startGame();
            }
        }
    }
    public static void main(String[] args) {
        startGame();
    }
}
