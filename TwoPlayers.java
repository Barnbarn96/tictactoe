package TicTacToeGame;

import java.util.Random;
import java.util.Scanner;

public class TwoPlayers {
    TwoPlayers(char[][] board){

        Scanner sc = new Scanner(System.in);

        System.out.println("Player 1 please enter your name");
        String s1 = sc.nextLine();
        System.out.println("Player 2 please enter your name");
        String s2 = sc.nextLine();

        Game.display(board);

        while(true) {
            System.out.println( s1 + " please enter a position to place X between 1 - 9");
            int userPos = sc.nextInt();

            //check if input is duplicate
            while(TicTacToe.allUserPos.contains(userPos) || TicTacToe.allCpuPos.contains(userPos))
            {
                System.out.println("Position already taken. Please re-enter a number.");
                userPos = sc.nextInt();

            }

            Game.insert(board, userPos, 'X');
            Game.display(board);
            Game.checkWinner(s1,s2);
//            System.out.println(allUserPos);

            System.out.println( s2 + " please enter a position to place X between 1 - 9");
            int cpuPos = sc.nextInt();
            //check if input is duplicate
            while(TicTacToe.allUserPos.contains(cpuPos) || TicTacToe.allCpuPos.contains(cpuPos))
            {
                System.out.println("Position already taken. Please re-enter a number.");
                cpuPos = sc.nextInt();
            }
//          System.out.println("The User 2 position is: " + cpuPos);
            Game.insert(board, cpuPos, 'O');
            Game.display(board);
            Game.checkWinner(s1,s2);
//            System.out.println(allCpuPos);


        }
    }

}
