package com.aurionpro.test;

import java.util.Scanner;

public class TicTacToe {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		char[][] board = new char[3][3];

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				board[i][j] = '-';
			}
		}

		boolean player1 = true;
		boolean gameEnded = false;

		while (!gameEnded) {

			drawBoard(board);

			if (player1) {
				System.out.println("Player 1's Turn (x):");
			} else {
				System.out.println("Player 2's Turn (x):");
			}

			char c = '-';
			if (player1) {
				c = 'x';
			} else {
				c = 'o';
			}

			int row = 0;
			int col = 0;

			while (true) {

				System.out.print("Enter a row number: ");
				row = scanner.nextInt();
				System.out.print("Enter a column number: ");
				col = scanner.nextInt();

				if (row < 0 || col < 0 || row >= 3 || col >= 3) {
					System.out.println("The is not valid");

				} else if (board[row][col] != '-') {
					System.out.println("Already played");

				} else {
					break;
				}
			}

			board[row][col] = c;
			if (playerHasWon(board) == 'x') {
				System.out.println("player1 has won!");
				gameEnded = true;
			} else if (playerHasWon(board) == 'o') {
				System.out.println("player 2 has won!");
				gameEnded = true;
			} else {

				
				if (boardIsFull(board)) {
					System.out.println("It's a tie!");
					gameEnded = true;
				} else {

					player1 = !player1;
				}
			}
		}

		
		drawBoard(board);
	}



	public static void drawBoard(char[][] board) {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(board[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static char playerHasWon(char[][] board) {
	    int n = board.length;

	    // Check rows and columns
	    for (int i = 0; i < n; i++) {
	        char rowValue = board[i][0];
	        char colValue = board[0][i];

	        if (rowValue != '-' && allEqual(board[i], rowValue)) {
	            return rowValue;
	        }

	        if (colValue != '-' && allEqual(getColumn(board, i), colValue)) {
	            return colValue;
	        }
	    }

	    // Check diagonals
	    char diag1Value = board[0][0];
	    char diag2Value = board[0][n - 1];

	    if (diag1Value != '-' && allEqual(getDiagonal(board, true), diag1Value)) {
	        return diag1Value;
	    }

	    if (diag2Value != '-' && allEqual(getDiagonal(board, false), diag2Value)) {
	        return diag2Value;
	    }

	    return ' ';
	}

	private static boolean allEqual(char[] array, char value) {
	    for (char c : array) {
	        if (c != value) {
	            return false;
	        }
	    }
	    return true;
	}

	private static char[] getColumn(char[][] board, int col) {
	    int n = board.length;
	    char[] column = new char[n];
	    for (int i = 0; i < n; i++) {
	        column[i] = board[i][col];
	    }
	    return column;
	}

	private static char[] getDiagonal(char[][] board, boolean primary) {
	    int n = board.length;
	    char[] diagonal = new char[n];
	    for (int i = 0; i < n; i++) {
	        diagonal[i] = primary ? board[i][i] : board[i][n - 1 - i];
	    }
	    return diagonal;
	}

	public static boolean boardIsFull(char[][] board) {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				if (board[i][j] == '-') {
					return false;
				}
			}
		}
		return true;
	}

}
