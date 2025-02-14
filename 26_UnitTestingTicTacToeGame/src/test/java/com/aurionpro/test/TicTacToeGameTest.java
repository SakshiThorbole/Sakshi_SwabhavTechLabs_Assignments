package com.aurionpro.test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
//import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import com.aurionpro.model.TicTacToeGame;

public class TicTacToeGameTest {
	
	private TicTacToeGame game;
	
	@BeforeEach
	public void setUp() {
		game = new TicTacToeGame();
	}

	@Test
	public void testInitialBoard() {
		String[] expectedBoard = {"1", "2", "3", "4", "5", "6", "7", "8", "9"};
		assertArrayEquals(expectedBoard, game.board);
	}

	
	@Test
	public void testMakeMove() {
		assertTrue(game.makeMove(1));
		assertEquals("0", game.getCurrentTurn());
		assertFalse(game.makeMove(1));   // Slot already taken
		assertTrue(game.makeMove(2));
        assertEquals("X", game.getCurrentTurn());
	}
	
//	public void testInvalidMove() {
//        assertThrows(IllegalArgumentException.class, () -> {
//            game.makeMove(10);
//        });
//    }

	

	@Test
	public void testCheckWinner() {
		game.makeMove(1);
		game.makeMove(2);
		game.makeMove(4);
		game.makeMove(5);
		game.makeMove(7);
		game.makeMove(9);
		assertEquals("X", game.checkWinner());   // X should win with a diagonal
	}

	@Test
	public void testDrawCondition() {
		game.makeMove(1);
		game.makeMove(2);
        game.makeMove(3);
        game.makeMove(4);
        game.makeMove(5);
        game.makeMove(6);
        game.makeMove(7);
        game.makeMove(8);
        game.makeMove(9);
        assertEquals("draw", game.checkWinner());		
	}

}
