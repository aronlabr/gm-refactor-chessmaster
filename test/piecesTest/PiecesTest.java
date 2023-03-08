/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package piecesTest;

import controller.ChessGamePiece;
import java.util.ArrayList;
import model.pieces.King;
import model.pieces.Rook;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import view.ChessGameBoard;

/**
 *
 * @author mildr
 */
public class PiecesTest {
    
    private static ChessGameBoard board;
    private static King king;
    private static Rook rook;
    
    @Before
    public void setUp() {
        board = new ChessGameBoard();
        rook = new Rook(board, 1, 2, ChessGamePiece.BLACK);
        king = new King(board, 6, 7, ChessGamePiece.BLACK);
    }
    
    @Test
    public void testRookPossibleMoves(){
        var moves = rook.calculatePossibleMoves(board);
        ArrayList<String> expected = new ArrayList<>();
        expected.add("2,2");
        expected.add("3,2");
        expected.add("4,2");
        expected.add("5,2");
        expected.add("6,2");
        assertEquals(expected, moves);
    }
    
    @Test
    public void testKingPossibleMoves(){
        
        ArrayList<String> moves = king.calculatePossibleMoves(board);
        ArrayList<String> expected = new ArrayList<>();
        expected.add("5,6");
        expected.add("7,6");
        expected.add("5,7");
        expected.add("7,7");
        expected.add("6,6");
        // Movimientos disponibles del Rey
        assertEquals(expected, moves);
    }
}
