package App.Tictactoe;

import java.util.Random;
import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        Data data = new Data();

        String[][] Tiktaktoe = {
                {"#", "#", "#"},
                {"#", "#", "#"},
                {"#", "#", "#"}
        };
        while (true){
            System.out.print("\nchoose the number: " );

            // the player set
            data.player(Tiktaktoe, input.nextInt());

            //computer set
            boolean test = true;
            while (test) {
                test = data.computer(Tiktaktoe, rand.nextInt(3), rand.nextInt(3));
            }

            for (String[] tiktak : Tiktaktoe) {
                for (int i = 0; i <= Tiktaktoe.length - 1; i++) {
                    boolean k = i % 3 == 0;
                    if (k) {
                        System.out.println();
                    }
                    System.out.print(tiktak[i]);
                    if (i % 3 == 1 || i % 3 == 0){
                        System.out.print("|");
                    }
                }
            }
            if (!data.win(Tiktaktoe)) {
                System.out.println("\n\nAnda menang");
                System.exit(0);
            }else if (!data.winC(Tiktaktoe)){
                System.out.println("\n\nComputer Win");
                System.exit(0);
            }
        }
    }
}
