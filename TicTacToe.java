package TicTacToeGame;


import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class TicTacToe {

    static ArrayList allUserPos = new ArrayList();
    static ArrayList allCpuPos = new ArrayList();


    public static void main(String[] args){

        //create board
        char board[][] ={{' ','|',' ','|',' '},
                {'-','+','-','+','-'},
                {' ','|',' ','|',' '},
                {'-','+','-','+','-'},
                {' ','|',' ','|',' '},
        };

        Scanner sc = new Scanner(System.in);
        System.out.println("Please choose 1P or 2P");
        int userNo = sc.nextInt();
        while(true) {
            if (userNo == 1) {
                new OnePlayer(board);
            } else if (userNo == 2) {
                new TwoPlayers(board);
            }
            else {
                System.out.println("Please enter 1 or 2.");
                userNo = sc.nextInt();
            }
        }
    }
}
