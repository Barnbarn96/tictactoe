package TicTacToeGame;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Game {

    static void display(char board[][]){
        for(int i = 0; i<= 4; i++){
            for(int j = 0; j <= 4; j++){
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }

    static void insert(char board[][], int pos, char ch){

        //add position into arraylist
        if(ch == 'X')
        {
            TicTacToe.allUserPos.add(pos);
        }
        //add position into arraylist
        if(ch == 'O')
        {
            TicTacToe.allCpuPos.add(pos);
        }

            switch (pos) {
                case 1:
                    board[0][0] = ch;
                    break;
                case 2:
                    board[0][2] = ch;
                    break;
                case 3:
                    board[0][4] = ch;
                    break;
                case 4:
                    board[2][0] = ch;
                    break;
                case 5:
                    board[2][2] = ch;
                    break;
                case 6:
                    board[2][4] = ch;
                    break;
                case 7:
                    board[4][0] = ch;
                    break;
                case 8:
                    board[4][2] = ch;
                    break;
                case 9:
                    board[4][4] = ch;
                    break;
                default: System.out.println("Invalid position. Please re-enter a value from 1-9");
                    break;

        }
    }

    static void checkWinner(String s1, String s2){
        List topRow = Arrays.asList(1,2,3);
        List midRow = Arrays.asList(4,5,6);
        List btmRow = Arrays.asList(7,8,9);
        List leftCol = Arrays.asList(1,4,7);
        List midCol =Arrays.asList(2,5,8);
        List rightCol =Arrays.asList(3,6,9);
        List diag1 =Arrays.asList(1,5,9);
        List diag2 =Arrays.asList(3,5,7);

        List<List> winCon = new ArrayList<List>();
        winCon.add(topRow);
        winCon.add(midRow);
        winCon.add(btmRow);
        winCon.add(leftCol);
        winCon.add(midCol);
        winCon.add(rightCol);
        winCon.add(diag1);
        winCon.add(diag2);

        for(List l : winCon)
        {
            if(TicTacToe.allUserPos.containsAll(l))
            {
                System.out.println(s1 +" is the winner");
                System.exit(0);
            }
            else if(TicTacToe.allCpuPos.containsAll(l))
            {
                System.out.println(s2 +" is the winner");
                System.exit(0);
            }

        }
        if(TicTacToe.allUserPos.size()+TicTacToe.allCpuPos.size() == 9)
        {
            System.out.println("The game ends in a draw");
            System.exit(0);
        }
    }

}
