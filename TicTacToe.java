/*
 * Project: Project 5
 * Description: Tic Tac Toe game
 * Name: Grishma Maheshbhai Thumar
 * ID: 922950012
 * Class: CSC 210-01
 * Semester: Fall 2022
 */

import java.util.Scanner;

public class TicTacToe {
    //Start of main method
    public static void main(String[] args) {

        // create scanner to read user input
        // create char[] array to store board values
        // set positions of board from 1 to 9
        // 2 players: 'X' and 'O', start with 'X'
        Scanner input = new Scanner(System.in);
        char board[] = {'1', '2', '3', '4', '5', '6', '7', '8', '9'};
        char player = 'X';

        // display the playing board in 3x3 layout
        display(board);

        // play game until gameOver is true
        boolean gameOver = false;
        while (!gameOver) {
            // get current player choice, and update board value
            //Call receive user choice method
            receiveUserChoice(player, input, board);
            // display the updated board
            //Call display method
            display(board);
            // switch player 'X' -> 'O' or 'O' -> 'X'
            player = (player == 'X') ? 'O' : 'X';
            // check for winner, draw or game is not over yet
            //Call the is game over method
            gameOver = isGameOver(board);
        }
    }
    //End of main method


    // display board in 3x3 layout
    // note that array indices from 0 to 8 = positions from 1 to 9
    //Start of display method
    public static void display(char[] board) {
        System.out.println("");
        System.out.println(board[0] + " | " + board[1] + " | " + board[2]);
        System.out.println(board[3] + " | " + board[4] + " | " + board[5]);
        System.out.println(board[6] + " | " + board[7] + " | " + board[8]);
        System.out.println("");
    }
    //End of display method


    // get current player choice, and update board value
    //Start of receive user choice method
    public static void receiveUserChoice(char player, Scanner input, char[] board) {
        // Step 1: get user input, a position from 1 to 9
        //Declaration of variable to store user input
        int userInput;
        //Prompt user to enter a position
        System.out.print(player + " turn, enter a position: ");
        userInput = input.nextInt();
            // Step 2: make sure it is a valid position, and the position is not taken yet
            //    2.1: if it is valid input, mark the board position with the current player
            //    2.2: if it is not valid, print message repeat Step 1. until a valid input is obtained

        //If user input is a valid number
        if ((userInput > 0 && userInput < 10)) {
            //If the position is taken then call the method again
            if (board[userInput - 1 ] == 'O' || board[userInput - 1] == 'X'){
                System.out.println("Invalid position. Enter a valid position.");
                receiveUserChoice(player,input,board);
            }
            //Else assign the board value equal to player
            else {
                board[userInput - 1] = player;
            }
        }
        //Else call the method again
        else {
            System.out.println("Invalid position. Enter a valid position.");
            receiveUserChoice(player,input,board);
        }
    }
    //End of the receiveUser choice method


    // check for winner, draw or game is not over yet
    //Start of isGameOver method
    public static boolean isGameOver(char[] board) {
        // Step 1: if there is a winner, print winner message, return true
        // Step 2: if it is a draw, print draw message, return true
        // Step 3: else the game is not over yet, return false

        //Nested if else to check which player won or had a draw according to the board position entered by user, and thereby return true
        if (board [0] == board[1] && board[1] == board[2]){
            System.out.println("***** " + board[0] + " Wins!!!*****");
            return true;
        } else if (board [3] == board[4] && board[4] == board[5]) {
            System.out.println("***** " + board[3] + " Wins!!!*****");
            return true;
        } else if (board [6] == board[7] && board[7] == board[8]) {
            System.out.println("***** " + board[7] + " Wins!!!*****");
            return true;
        } else if (board [0] == board[4] && board[4] == board[8]) {
            System.out.println("***** " + board[0] + " Wins!!!*****");
            return true;
        } else if (board [2] == board[4] && board[4] == board[6]) {
            System.out.println("***** " + board[2] + " Wins!!!*****");
            return true;
        } else if (board [1] == board[4] && board[4] == board[7]) {
            System.out.println("***** " + board[1] + " Wins!!!*****");
            return true;
        } else if (board [2] == board[5] && board[5] == board[8]) {
            System.out.println("***** " + board[2] + " Wins!!!*****");
            return true;
        } else if (board [0] == board[3] && board[3] == board[6]) {
            System.out.println("***** " + board[0] + " Wins!!!*****");
            return true;
        } else if ((board[0] == 'O' || board[0] == 'X') && (board[1] == 'O' || board[1] == 'X') && (board[2] == 'O' || board[2] == 'X') && (board[3] == 'O' || board[3] == 'X') && (board[4] == 'O' || board[4] == 'X') && (board[5] == 'O' || board[5] == 'X') && (board[6] == 'O' || board[6] == 'X') && (board[7] == 'O' || board[7] == 'X') && (board[8] == 'O' || board[8] == 'X')) {
            System.out.println("It's a draw!");
            return true;
        }
        //If none of the case from above then game not over thus return false
        return false;
    }
    //End of isGameOver method
}