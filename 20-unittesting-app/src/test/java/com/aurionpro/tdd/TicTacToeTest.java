package com.aurionpro.tdd;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TicTacToeTest {
	


    @Test
    void testPlayerHasWonRowWin() {
        char[][] board = {
            {'x', 'x', 'x'},
            {'-', 'o', '-'},
            {'o', '-', '-'}
        };
        assertEquals('x', TicTacToe.playerHasWon(board), "Player 1 should win with a row of 'x's.");
    }

    @Test
    void testPlayerHasWonColumnWin() {
        char[][] board = {
            {'o', 'x', '-'},
            {'o', 'x', '-'},
            {'o', '-', '-'}
        };
        assertEquals('o', TicTacToe.playerHasWon(board), "Player 2 should win with a column of 'o's.");
    }

    @Test
    void testPlayerHasWonPrimaryDiagonalWin() {
        char[][] board = {
            {'x', '-', 'o'},
            {'-', 'x', 'o'},
            {'o', '-', 'x'}
        };
        assertEquals('x', TicTacToe.playerHasWon(board), "Player 1 should win with a primary diagonal of 'x's.");
    }

    @Test
    void testPlayerHasWonSecondaryDiagonalWin() {
        char[][] board = {
            {'o', '-', 'x'},
            {'-', 'x', 'o'},
            {'x', '-', 'o'}
        };
        assertEquals('x', TicTacToe.playerHasWon(board), "Player 1 should win with a secondary diagonal of 'x's.");
    }

    @Test
    void testPlayerHasWonNoWin() {
        char[][] board = {
            {'x', 'o', 'x'},
            {'x', 'o', 'o'},
            {'o', 'x', 'x'}
        };
        assertEquals(' ', TicTacToe.playerHasWon(board), "There should be no winner in a tie board.");
    }

	@Test
	void testPlayerHasWon() {
		 char[][] board = {
		            {'x', 'o', 'x'},
		            {'-', 'o', 'x'},
		            {'o', '-', 'x'}
		        };
		 assertEquals('x', TicTacToe.playerHasWon(board), "Player 1 should win with a row of 'x's.");
	}

	@Test
	void testBoardIsFullTrue() {
		char[][] board = {
	            {'x', 'o', 'x'},
	            {'x', 'o', 'o'},
	            {'o', 'x', 'x'}
	        };
	        assertTrue(TicTacToe.boardIsFull(board), "The board should be full.");
	        
	}

	 @Test
	    void testBoardIsFullFalse() {
	        char[][] board = {
	            {'x', 'o', '-'},
	            {'x', '-', 'o'},
	            {'o', 'x', 'x'}
	        };
	        assertFalse(TicTacToe.boardIsFull(board), "The board should not be full.");
	    }
	 
	 @Test
	    void testAllEquals() {
		 char[] board =   {'x', 'x', 'x'};
		 assertEquals(true, TicTacToe.allEqual(board,'x'), "All should be equal to x.");
    
	 }
	 
	 @Test
	    void testGetColoumns() {
		  char[][] board = {
		            {'x', 'o', '-'},
		            {'x', '-', 'o'},
		            {'o', 'x', 'x'}
		        };
		  
		  assertArrayEquals(new char[]{'x','x','o'}, TicTacToe.getColumn(board, 0), "Return the column of the board.");
	 }
	 
	 @Test
	    void testGetDaigonalLeft() {
		  char[][] board = {
		            {'x', 'o', '-'},
		            {'x', '-', 'o'},
		            {'o', 'x', 'x'}
		        };
		  
		  assertArrayEquals(new char[]{'x','-','x'}, TicTacToe.getDiagonal(board, true), "Return the left daigonal of the board.");
	 }
	 @Test
	    void testGetDaigonalRight() {
		  char[][] board = {
		            {'x', 'o', '-'},
		            {'x', '-', 'o'},
		            {'o', 'x', 'x'}
		        };
		  
		  assertArrayEquals(new char[]{'-','-','o'}, TicTacToe.getDiagonal(board, false), "Return the right daigonal of the board.");
	 }
	 
	 @Test
	    void testBroadIsDarwn() {
		  char[][] board = {
		            {'-', 'o', '-'},
		            {'x', '-', 'o'},
		            {'o', 'x', 'x'}
		        };
		  
		  assertArrayEquals(new char[]{'-','-','o'}, TicTacToe.getDiagonal(board, false), "Return the right daigonal of the board.");
	 }
}
