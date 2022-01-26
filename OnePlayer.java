package TicTacToeGame;

import java.util.Random;
import java.util.Scanner;

public class OnePlayer {
    OnePlayer(char[][] board){
        String s1 = "User";
        String s2 = "CPU";
        Scanner sc = new Scanner(System.in);

        Game.display(board);

        while(true) {
            System.out.println("Enter a position to place X between 1 - 9");
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

            Random r = new Random();
            int cpuPos = r.nextInt(9) + 1;

            //check if input is duplicate
            while(TicTacToe.allUserPos.contains(cpuPos) || TicTacToe.allCpuPos.contains(cpuPos))
            {
                System.out.println("Position already taken. Please re-enter a number.");
                cpuPos = r.nextInt(9) + 1;
            }
            System.out.println("The CPU position is: " + cpuPos);
            Game.insert(board, cpuPos, 'O');
            Game.display(board);
            Game.checkWinner(s1,s2);
//            System.out.println(allCpuPos);


        }
    }
}
